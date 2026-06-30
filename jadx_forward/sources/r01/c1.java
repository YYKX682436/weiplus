package r01;

/* loaded from: classes3.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f449571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.e1 f449572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f449573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(l81.b1 b1Var, l81.e1 e1Var, android.content.Context context) {
        super(1);
        this.f449571d = b1Var;
        this.f449572e = e1Var;
        this.f449573f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        l81.b1 b1Var = this.f449571d;
        b1Var.f398551d = 447;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "EDITOR_WE_APP_VERSION: 447");
        b1Var.f398549c = intValue;
        b1Var.L = this.f449572e;
        java.lang.String enterPath = b1Var.f398555f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enterPath, "enterPath");
        if (!r26.i0.y(enterPath, "pages/creator-center/creator-center.html", false)) {
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f449573f, b1Var);
        return jz5.f0.f384359a;
    }
}
