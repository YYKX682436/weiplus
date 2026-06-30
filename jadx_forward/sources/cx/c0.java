package cx;

/* loaded from: classes7.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bx.x f305918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.f0 f305919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yw.s2 f305920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f305921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(bx.x xVar, cx.f0 f0Var, yw.s2 s2Var, int i17) {
        super(0);
        this.f305918d = xVar;
        this.f305919e = f0Var;
        this.f305920f = s2Var;
        this.f305921g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bx.x xVar = bx.x.f117764f;
        cx.f0 f0Var = this.f305919e;
        bx.x xVar2 = this.f305918d;
        if (xVar2 == xVar || xVar2 == bx.x.f117763e) {
            f0Var.Di(11);
        }
        yw.s2 s2Var = this.f305920f;
        s2Var.getClass();
        cl0.g gVar = new cl0.g();
        gVar.p(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, s2Var.f547988a);
        gVar.h("unreadMsgCount", s2Var.f547989b);
        gVar.h("unExposeMsgCount", s2Var.f547990c);
        gVar.h("unValidExposeMsgCount", s2Var.f547991d);
        gVar.h("unreadMsgTimeStampList", s2Var.f547992e);
        gVar.h("covBoxIndex", s2Var.f547993f);
        gVar.h("digestMsgBizUin", s2Var.f547994g);
        gVar.h("digestMsgId", s2Var.f547995h);
        gVar.h("digestMsgIdx", s2Var.f547996i);
        gVar.h("digestWording", s2Var.f547997j);
        gVar.h("eventName", xVar2.f117767d);
        gVar.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f305921g);
        gVar.p("mbReceiveTimeStamp", java.lang.System.currentTimeMillis());
        cx.w0 w0Var = f0Var.f305955e;
        if (w0Var != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd c10484x8f75c5cd = new com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd();
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            w0Var.G1(c10484x8f75c5cd.f229414d, gVar2);
        }
        ((ku5.t0) ku5.t0.f394148d).q(new cx.e0(xVar2, f0Var));
        return jz5.f0.f384359a;
    }
}
