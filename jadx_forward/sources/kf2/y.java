package kf2;

/* loaded from: classes.dex */
public final class y implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kf2.a0 f388846a;

    public y(kf2.a0 a0Var) {
        this.f388846a = a0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        java.lang.Object obj2;
        kf2.a0 a0Var = this.f388846a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f388724h, "dispatch actionName:" + str + ", data:" + obj);
        try {
            java.util.Iterator it = ((java.util.ArrayList) ((jz5.n) a0Var.f388725i).mo141623x754a37bb()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (r26.i0.p(((kf2.x) obj2).e(), str, true)) {
                    break;
                }
            }
            kf2.x xVar = (kf2.x) obj2;
            if (xVar != null) {
                return xVar.d(j17, str, obj, i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f388724h, "no match");
            return false;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(a0Var.f388724h, e17, "JSONException", new java.lang.Object[0]);
            return false;
        }
    }
}
