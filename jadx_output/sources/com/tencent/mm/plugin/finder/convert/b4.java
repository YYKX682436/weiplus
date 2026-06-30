package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes5.dex */
public final class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f102924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f102927g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f102928h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f102929i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f102930m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102931n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f102932o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102933p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f102934q;

    public b4(com.tencent.mm.plugin.finder.convert.u4 u4Var, in5.s0 s0Var, android.view.View view, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.ImageView imageView2, android.widget.TextView textView2, android.view.View view2, kotlin.jvm.internal.h0 h0Var, android.view.View view3, int i17) {
        this.f102924d = u4Var;
        this.f102925e = s0Var;
        this.f102926f = view;
        this.f102927g = imageView;
        this.f102928h = textView;
        this.f102929i = imageView2;
        this.f102930m = textView2;
        this.f102931n = view2;
        this.f102932o = h0Var;
        this.f102933p = view3;
        this.f102934q = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.convert.u4 u4Var = this.f102924d;
        in5.s0 s0Var = this.f102925e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View feedCommentLayout = this.f102926f;
        kotlin.jvm.internal.o.f(feedCommentLayout, "$feedCommentLayout");
        android.widget.ImageView avatarIv = this.f102927g;
        kotlin.jvm.internal.o.f(avatarIv, "$avatarIv");
        android.widget.TextView nickNameTv = this.f102928h;
        kotlin.jvm.internal.o.f(nickNameTv, "$nickNameTv");
        android.widget.ImageView imageView = this.f102929i;
        android.widget.TextView textView = this.f102930m;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f483852c85);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        u4Var.E(context, feedCommentLayout, avatarIv, nickNameTv, imageView, textView, (android.widget.TextView) p17, s0Var.p(com.tencent.mm.R.id.a_z), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f483312aa0), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.uxf), s0Var.p(com.tencent.mm.R.id.f486560lo4), s0Var.p(com.tencent.mm.R.id.f482669kr), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.ed9), this.f102931n, (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f486383l23), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.ufm), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.jfu), s0Var.p(com.tencent.mm.R.id.ulp), (android.view.View) this.f102932o.f310123d);
        com.tencent.mm.ui.xj xjVar = new com.tencent.mm.ui.xj(feedCommentLayout);
        feedCommentLayout.setTouchDelegate(xjVar);
        android.view.View view = this.f102933p;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.finder.convert.a4(view, this.f102934q, xjVar));
        }
    }
}
