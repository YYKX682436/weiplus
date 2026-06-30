package b50;

/* loaded from: classes10.dex */
public final class a0 implements gy1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f99453b;

    public a0(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, yz5.l lVar) {
        this.f99452a = c10601x91d05935;
        this.f99453b = lVar;
    }

    @Override // gy1.d
    public final void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f99452a.f148594d, "bobkw getSessionJumpPaths paths=" + obj);
        yz5.l lVar = this.f99453b;
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
