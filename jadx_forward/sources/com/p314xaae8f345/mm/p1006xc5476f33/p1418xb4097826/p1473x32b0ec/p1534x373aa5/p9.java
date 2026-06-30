package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class p9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14341x36fc1ea2 f198120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14341x36fc1ea2 c14341x36fc1ea2, int i17, int i18) {
        super(0);
        this.f198120d = c14341x36fc1ea2;
        this.f198121e = i17;
        this.f198122f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14341x36fc1ea2 c14341x36fc1ea2 = this.f198120d;
        c14341x36fc1ea2.getLayoutParams().height = this.f198121e + c14341x36fc1ea2.getPaddingTop();
        c14341x36fc1ea2.getLayoutParams().width = this.f198122f;
        c14341x36fc1ea2.requestLayout();
        return jz5.f0.f384359a;
    }
}
