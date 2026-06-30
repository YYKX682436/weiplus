package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class yf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f186549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f186550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f186551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(boolean z17, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar) {
        super(1);
        this.f186549d = z17;
        this.f186550e = viewGroup;
        this.f186551f = zfVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) obj;
        if (!this.f186549d && animatorSet != null) {
            android.view.ViewGroup viewGroup = this.f186550e;
            animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xf(viewGroup, viewGroup, this.f186551f));
        }
        if (animatorSet != null) {
            animatorSet.start();
        }
        return jz5.f0.f384359a;
    }
}
