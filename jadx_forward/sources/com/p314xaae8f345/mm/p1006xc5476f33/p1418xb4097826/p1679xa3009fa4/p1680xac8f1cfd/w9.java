package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class w9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 f217848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 f217849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f217850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217851g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217852h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f217853i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217854m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 f217855n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 f217856o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 mb0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 mb0Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.view.View view, android.view.View view2, android.view.ViewGroup viewGroup, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 db0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c2) {
        super(0);
        this.f217848d = mb0Var;
        this.f217849e = mb0Var2;
        this.f217850f = abstractC14490x69736cb5;
        this.f217851g = view;
        this.f217852h = view2;
        this.f217853i = viewGroup;
        this.f217854m = s0Var;
        this.f217855n = db0Var;
        this.f217856o = c15447x4ebc90c2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 mb0Var = this.f217849e;
        boolean a76 = this.f217848d.a7(mb0Var.S6());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f217850f;
        if (a76) {
            abstractC14490x69736cb5.H1(null);
            int u17 = hc2.f1.u(this.f217851g);
            int n17 = hc2.f1.n(this.f217852h);
            android.view.ViewGroup viewGroup = this.f217853i;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = n17;
            viewGroup.setLayoutParams(layoutParams);
            in5.s0 holder = this.f217854m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType = this.f217855n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
            mb0Var.V6(holder, animationType, u17);
            mb0Var.O6(holder, animationType);
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(n17, u17);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t9(viewGroup));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u9 u9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u9(viewGroup, this.f217856o, holder);
            ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v9(u9Var, u9Var));
            ofInt.start();
        } else {
            abstractC14490x69736cb5.H1(mb0Var.S6());
        }
        return jz5.f0.f384359a;
    }
}
