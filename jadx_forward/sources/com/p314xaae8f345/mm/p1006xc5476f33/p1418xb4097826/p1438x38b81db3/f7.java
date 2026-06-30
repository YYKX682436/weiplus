package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes5.dex */
public final class f7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 f184874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f184877g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184878h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f184879i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184880m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184881n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f184882o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184883p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f184884q;

    public f7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var, in5.s0 s0Var, android.view.View view, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.ImageView imageView2, android.widget.TextView textView2, android.view.View view2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.View view3, int i17) {
        this.f184874d = s7Var;
        this.f184875e = s0Var;
        this.f184876f = view;
        this.f184877g = imageView;
        this.f184878h = textView;
        this.f184879i = imageView2;
        this.f184880m = textView2;
        this.f184881n = view2;
        this.f184882o = h0Var;
        this.f184883p = view3;
        this.f184884q = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var = this.f184874d;
        in5.s0 s0Var = this.f184875e;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.View mainArea = this.f184876f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mainArea, "$mainArea");
        android.widget.ImageView avatarIv = this.f184877g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(avatarIv, "$avatarIv");
        android.widget.TextView nickNameTv = this.f184878h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nickNameTv, "$nickNameTv");
        android.widget.ImageView imageView = this.f184879i;
        android.widget.TextView textView = this.f184880m;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f565385c85);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        s7Var.E(context, mainArea, avatarIv, nickNameTv, imageView, textView, (android.widget.TextView) p17, s0Var.p(com.p314xaae8f345.mm.R.id.a_z), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f564845aa0), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.uxf), s0Var.p(com.p314xaae8f345.mm.R.id.f568093lo4), s0Var.p(com.p314xaae8f345.mm.R.id.f564202kr), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.ed9), this.f184881n, (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f567916l23), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.ufm), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.jfu), s0Var.p(com.p314xaae8f345.mm.R.id.ulp), (android.view.View) this.f184882o.f391656d);
        com.p314xaae8f345.mm.ui.xj xjVar = new com.p314xaae8f345.mm.ui.xj(mainArea);
        mainArea.setTouchDelegate(xjVar);
        android.view.View view = this.f184883p;
        if (view != null) {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e7(view, this.f184884q, xjVar));
        }
    }
}
