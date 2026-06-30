package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class u9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f217645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 f217646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217647f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c2, in5.s0 s0Var) {
        super(0);
        this.f217645d = viewGroup;
        this.f217646e = c15447x4ebc90c2;
        this.f217647f = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup = this.f217645d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = -2;
        viewGroup.setLayoutParams(layoutParams);
        this.f217646e.P6(this.f217647f);
        return jz5.f0.f384359a;
    }
}
