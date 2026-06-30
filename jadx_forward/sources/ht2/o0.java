package ht2;

/* loaded from: classes2.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.o f366405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f366407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f366409h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f366410i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f366411m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f366412n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(jz5.o oVar, ht2.y0 y0Var, android.widget.LinearLayout linearLayout, java.lang.String str, android.view.ViewGroup viewGroup, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, zy2.r6 r6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f366405d = oVar;
        this.f366406e = y0Var;
        this.f366407f = linearLayout;
        this.f366408g = str;
        this.f366409h = viewGroup;
        this.f366410i = c0Var;
        this.f366411m = c0Var2;
        this.f366412n = r6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ht2.o0(this.f366405d, this.f366406e, this.f366407f, this.f366408g, this.f366409h, this.f366410i, this.f366411m, this.f366412n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ht2.o0 o0Var = (ht2.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.o oVar = this.f366405d;
        if (((java.lang.Boolean) oVar.f384374d).booleanValue()) {
            java.lang.String str = (java.lang.String) oVar.f384375e;
            java.util.regex.Pattern pattern = ht2.y0.f366469g;
            ht2.y0 y0Var = this.f366406e;
            y0Var.getClass();
            android.widget.LinearLayout linearLayout = this.f366407f;
            android.content.Context context = linearLayout.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.widget.TextView textView = null;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context, null);
            int dimension = (int) linearLayout.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.by);
            c22789xd23e9a9b.m82583xcde73672(1);
            c22789xd23e9a9b.m82582x3ae760af(0.0d);
            c22789xd23e9a9b.o(((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Z0().r()).booleanValue());
            c22789xd23e9a9b.m82581x764e93a7(str);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
            layoutParams.gravity = 17;
            c22789xd23e9a9b.setLayoutParams(layoutParams);
            linearLayout.addView(c22789xd23e9a9b);
            y0Var.getClass();
            java.lang.String str2 = this.f366408g;
            if (!(str2 == null || str2.length() == 0)) {
                textView = new android.widget.TextView(linearLayout.getContext());
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.topMargin = linearLayout.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                textView.setGravity(17);
                textView.setLayoutParams(marginLayoutParams);
                textView.setShadowLayer(20.0f, 0.0f, 12.0f, linearLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
                textView.setText(str2);
                textView.setTextSize(1, i65.a.q(linearLayout.getContext()) * 17.0f);
                textView.setTextColor(linearLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                textView.setLineSpacing(textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), 1.0f);
                int f17 = i65.a.f(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                textView.setPadding(f17, textView.getPaddingTop(), f17, textView.getPaddingBottom());
                linearLayout.addView(textView);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f366410i;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = this.f366411m;
            android.view.ViewGroup viewGroup = this.f366409h;
            ht2.m0 m0Var = new ht2.m0(c0Var, linearLayout, c0Var2, viewGroup);
            y0Var.getClass();
            c22789xd23e9a9b.a(new ht2.r0(m0Var));
            c22789xd23e9a9b.g();
            if (textView != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f366412n.f559091i;
                boolean z17 = c19792x256d2725 != null && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.e(c19792x256d2725);
                ht2.n0 n0Var = new ht2.n0(c0Var2, linearLayout, c0Var, viewGroup);
                y0Var.getClass();
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
                ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
                ofFloat.setDuration(300L);
                ofFloat.addListener(new ht2.t0(y0Var, z17, n0Var));
                ofFloat.start();
            }
            viewGroup.addView(linearLayout);
        }
        return jz5.f0.f384359a;
    }
}
