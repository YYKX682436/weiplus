package os3;

/* loaded from: classes8.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.v0 f429724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadResult f429725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ os3.v1 f429726f;

    public s1(os3.v1 v1Var, ks3.v0 v0Var, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadResult c2CUploadResult) {
        this.f429726f = v1Var;
        this.f429724d = v0Var;
        this.f429725e = c2CUploadResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        os3.u1 u1Var;
        ks3.v0 v0Var = this.f429724d;
        if (v0Var != null) {
            int i17 = this.f429725e.f17981x139cb015;
            os3.v1 v1Var = this.f429726f;
            if (i17 != 0) {
                v0Var.f393291g = 3;
            } else {
                v0Var.f393291g = 2;
                boolean f17 = v1Var.f();
                java.util.Map map = v1Var.f429759h;
                if (f17) {
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    java.util.Iterator it = hashMap.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z17 = true;
                            break;
                        } else if (((ks3.v0) hashMap.get((java.lang.String) it.next())).f393291g != 2) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17 && (u1Var = v1Var.f429762n) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = ((os3.a0) u1Var).f429558a.f429569d;
                        activityC16931x24037f86.D = com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86.U6(activityC16931x24037f86);
                    }
                } else {
                    os3.u1 u1Var2 = v1Var.f429762n;
                    if (u1Var2 != null) {
                        java.util.HashMap hashMap2 = (java.util.HashMap) map;
                        hashMap2.size();
                        java.util.Iterator it6 = hashMap2.keySet().iterator();
                        while (it6.hasNext() && ((ks3.v0) hashMap2.get((java.lang.String) it6.next())).f393291g == 2) {
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f862 = ((os3.a0) u1Var2).f429558a.f429569d;
                        activityC16931x24037f862.A.setMessage(activityC16931x24037f862.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjm));
                    }
                }
            }
            v1Var.g(v0Var);
        }
    }
}
