package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jo extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f194676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f194677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(boolean z17, android.view.ViewGroup viewGroup) {
        super(0);
        this.f194676d = z17;
        this.f194677e = viewGroup;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f194676d;
        android.view.ViewGroup viewGroup = this.f194677e;
        if (!z17) {
            viewGroup.setAlpha(1.0f);
        }
        viewGroup.setVisibility(0);
        return jz5.f0.f384359a;
    }
}
