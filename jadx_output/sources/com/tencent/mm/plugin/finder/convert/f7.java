package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes5.dex */
public final class f7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.s7 f103341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f103344g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103345h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f103346i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103347m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103348n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f103349o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103350p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f103351q;

    public f7(com.tencent.mm.plugin.finder.convert.s7 s7Var, in5.s0 s0Var, android.view.View view, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.ImageView imageView2, android.widget.TextView textView2, android.view.View view2, kotlin.jvm.internal.h0 h0Var, android.view.View view3, int i17) {
        this.f103341d = s7Var;
        this.f103342e = s0Var;
        this.f103343f = view;
        this.f103344g = imageView;
        this.f103345h = textView;
        this.f103346i = imageView2;
        this.f103347m = textView2;
        this.f103348n = view2;
        this.f103349o = h0Var;
        this.f103350p = view3;
        this.f103351q = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.convert.s7 s7Var = this.f103341d;
        in5.s0 s0Var = this.f103342e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View mainArea = this.f103343f;
        kotlin.jvm.internal.o.f(mainArea, "$mainArea");
        android.widget.ImageView avatarIv = this.f103344g;
        kotlin.jvm.internal.o.f(avatarIv, "$avatarIv");
        android.widget.TextView nickNameTv = this.f103345h;
        kotlin.jvm.internal.o.f(nickNameTv, "$nickNameTv");
        android.widget.ImageView imageView = this.f103346i;
        android.widget.TextView textView = this.f103347m;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f483852c85);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        s7Var.E(context, mainArea, avatarIv, nickNameTv, imageView, textView, (android.widget.TextView) p17, s0Var.p(com.tencent.mm.R.id.a_z), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f483312aa0), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.uxf), s0Var.p(com.tencent.mm.R.id.f486560lo4), s0Var.p(com.tencent.mm.R.id.f482669kr), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.ed9), this.f103348n, (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f486383l23), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.ufm), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.jfu), s0Var.p(com.tencent.mm.R.id.ulp), (android.view.View) this.f103349o.f310123d);
        com.tencent.mm.ui.xj xjVar = new com.tencent.mm.ui.xj(mainArea);
        mainArea.setTouchDelegate(xjVar);
        android.view.View view = this.f103350p;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.finder.convert.e7(view, this.f103351q, xjVar));
        }
    }
}
