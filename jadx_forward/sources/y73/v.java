package y73;

/* loaded from: classes11.dex */
public class v implements w11.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y73.q f541297a;

    public v(y73.q qVar) {
        this.f541297a = qVar;
    }

    @Override // w11.e1
    public void a(boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        c6231x4f3054ba.f136478g.f89948b = 2;
        c6231x4f3054ba.e();
        boolean z19 = c6231x4f3054ba.f136479h.f90034b;
        boolean H = iq.b.H();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f541297a.getClass();
        try {
            for (android.view.Display display : ((android.hardware.display.DisplayManager) context.getApplicationContext().getSystemService("display")).getDisplays()) {
                if (display.getState() == 2) {
                    z18 = true;
                    break;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.HotPatchApplyService", th6, "Fail to fetch status of displays.", new java.lang.Object[0]);
        }
        z18 = false;
        if (z17 || z18 || z19 || H) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchApplyService", "app is background now, i can kill quietly");
        ak0.n.c();
        try {
            ak0.n.a();
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.HotPatchApplyService", th7, "Fail to call tinker.cleanPatch.", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/hp/model/HotpatchIPXXApplyService$3", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/hp/model/HotpatchIPXXApplyService$3", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
