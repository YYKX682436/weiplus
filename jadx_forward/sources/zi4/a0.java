package zi4;

/* loaded from: classes11.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.c f554716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24922x59782579 f554717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi4.g0 f554718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f554719g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(zi4.c cVar, com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24922x59782579 c24922x59782579, zi4.g0 g0Var, yz5.l lVar) {
        super(0);
        this.f554716d = cVar;
        this.f554717e = c24922x59782579;
        this.f554718f = g0Var;
        this.f554719g = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar = this.f554719g;
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24922x59782579 c24922x59782579 = this.f554717e;
        zi4.g0 g0Var = this.f554718f;
        try {
            yz5.q qVar = this.f554716d.f554727a;
            java.lang.String m92277x7443ca3f = c24922x59782579.m92277x7443ca3f();
            java.lang.Object obj = g0Var.f554748a;
            if (obj == null) {
                obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            zi4.a aVar = (zi4.a) qVar.mo147xb9724478(m92277x7443ca3f, new java.lang.ref.WeakReference(obj), g0Var);
            com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24928xe4a82335 m92278x74fd7032 = c24922x59782579.m92278x74fd7032();
            aVar.a(m92278x74fd7032 != null ? m92278x74fd7032.m92310x8383f77b() : null, lVar);
        } catch (java.lang.Throwable th6) {
            zi4.g0.a(g0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FLTStatusActionHost", "fltStatusAction factory failed, cmdId=" + c24922x59782579.m92277x7443ca3f() + ", err=" + th6.getMessage());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6))));
        }
        return jz5.f0.f384359a;
    }
}
