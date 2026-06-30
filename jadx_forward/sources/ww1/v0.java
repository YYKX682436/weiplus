package ww1;

/* loaded from: classes15.dex */
public class v0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public static ww1.v0 f531845e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f531846d = new java.util.HashMap();

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ww1.r1) {
            ww1.r1 r1Var = (ww1.r1) m1Var;
            java.util.Map map = this.f531846d;
            ww1.u0 u0Var = (ww1.u0) ((java.util.HashMap) map).get(m1Var);
            if (u0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.F2fGetPayUrlManager", "no match callback");
                return;
            }
            if (i17 == 0 && i18 == 0) {
                ((zw1.g1) u0Var).a(true, r1Var.f531808e);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.F2fGetPayUrlManager", "net error: %s", r1Var);
                ((zw1.g1) u0Var).a(false, r1Var.f531808e);
            }
            ((java.util.HashMap) map).remove(m1Var);
        }
    }
}
