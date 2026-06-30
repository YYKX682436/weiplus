package sj3;

/* loaded from: classes5.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f490006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(sj3.g3 g3Var) {
        super(0);
        this.f490006d = g3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sj3.g3 g3Var = this.f490006d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) g3Var.f490053a.findViewById(com.p314xaae8f345.mm.R.id.jwt);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = g3Var.f490053a;
        serviceConnectionC16581x3d1d6bd2.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c3f, (android.view.ViewGroup) frameLayout, true);
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin += com.p314xaae8f345.mm.ui.bk.p(serviceConnectionC16581x3d1d6bd2) + i65.a.b(serviceConnectionC16581x3d1d6bd2, 12);
        frameLayout.setLayoutParams(layoutParams2);
        return frameLayout;
    }
}
