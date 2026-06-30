package lx;

/* loaded from: classes10.dex */
public final class x3 implements gy1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403539b;

    public x3(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, yz5.l lVar) {
        this.f403538a = c10491x8102098a;
        this.f403539b = lVar;
    }

    @Override // gy1.d
    public final void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f403538a.f146786d, "bobkw getSessionJumpPaths paths=" + obj);
        yz5.l lVar = this.f403539b;
        if (lVar != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str == null) {
                str = "";
            }
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str)));
        }
    }
}
