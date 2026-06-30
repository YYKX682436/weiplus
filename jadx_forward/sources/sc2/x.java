package sc2;

/* loaded from: classes2.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vt0 f487879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487880f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487881g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(in5.s0 s0Var, r45.vt0 vt0Var, android.view.View view, sc2.h1 h1Var) {
        super(0);
        this.f487878d = s0Var;
        this.f487879e = vt0Var;
        this.f487880f = view;
        this.f487881g = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in5.s0 s0Var = this.f487878d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.vt0 vt0Var = this.f487879e;
        java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/promotion/res/htmledition/mobile/html/feedback.html?aid=%s&source=1022", java.util.Arrays.copyOf(new java.lang.Object[]{pm0.v.u(vt0Var != null ? vt0Var.m75942xfb822ef2(0) : 0L)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, this.f487880f, "ad_complaint", "view_clk", false, sc2.h1.H(this.f487881g, s0Var), null, 40, null);
        return jz5.f0.f384359a;
    }
}
