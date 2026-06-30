package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes5.dex */
public final class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 f184457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f184460g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184461h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f184462i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184463m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184464n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f184465o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184466p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f184467q;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var, in5.s0 s0Var, android.view.View view, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.ImageView imageView2, android.widget.TextView textView2, android.view.View view2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.View view3, int i17) {
        this.f184457d = u4Var;
        this.f184458e = s0Var;
        this.f184459f = view;
        this.f184460g = imageView;
        this.f184461h = textView;
        this.f184462i = imageView2;
        this.f184463m = textView2;
        this.f184464n = view2;
        this.f184465o = h0Var;
        this.f184466p = view3;
        this.f184467q = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var = this.f184457d;
        in5.s0 s0Var = this.f184458e;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.View feedCommentLayout = this.f184459f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(feedCommentLayout, "$feedCommentLayout");
        android.widget.ImageView avatarIv = this.f184460g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(avatarIv, "$avatarIv");
        android.widget.TextView nickNameTv = this.f184461h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nickNameTv, "$nickNameTv");
        android.widget.ImageView imageView = this.f184462i;
        android.widget.TextView textView = this.f184463m;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f565385c85);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        u4Var.E(context, feedCommentLayout, avatarIv, nickNameTv, imageView, textView, (android.widget.TextView) p17, s0Var.p(com.p314xaae8f345.mm.R.id.a_z), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f564845aa0), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.uxf), s0Var.p(com.p314xaae8f345.mm.R.id.f568093lo4), s0Var.p(com.p314xaae8f345.mm.R.id.f564202kr), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.ed9), this.f184464n, (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f567916l23), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.ufm), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.jfu), s0Var.p(com.p314xaae8f345.mm.R.id.ulp), (android.view.View) this.f184465o.f391656d);
        com.p314xaae8f345.mm.ui.xj xjVar = new com.p314xaae8f345.mm.ui.xj(feedCommentLayout);
        feedCommentLayout.setTouchDelegate(xjVar);
        android.view.View view = this.f184466p;
        if (view != null) {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.a4(view, this.f184467q, xjVar));
        }
    }
}
