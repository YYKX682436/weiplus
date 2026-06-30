package hg4;

/* loaded from: classes11.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd f362927d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd activityC18543xcf2786cd) {
        this.f362927d = activityC18543xcf2786cd;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd activityC18543xcf2786cd = this.f362927d;
        java.util.Iterator it = ((java.util.ArrayList) activityC18543xcf2786cd.f253974e).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                stringBuffer.append("\n\n");
            } else {
                stringBuffer.append(str + "\n\n");
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC18543xcf2786cd.f253976g;
        if (j0Var != null) {
            j0Var.t(stringBuffer);
        }
    }
}
