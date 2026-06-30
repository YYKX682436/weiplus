package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class yf extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f105016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f105017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f105018f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(boolean z17, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.convert.zf zfVar) {
        super(1);
        this.f105016d = z17;
        this.f105017e = viewGroup;
        this.f105018f = zfVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) obj;
        if (!this.f105016d && animatorSet != null) {
            android.view.ViewGroup viewGroup = this.f105017e;
            animatorSet.addListener(new com.tencent.mm.plugin.finder.convert.xf(viewGroup, viewGroup, this.f105018f));
        }
        if (animatorSet != null) {
            animatorSet.start();
        }
        return jz5.f0.f302826a;
    }
}
