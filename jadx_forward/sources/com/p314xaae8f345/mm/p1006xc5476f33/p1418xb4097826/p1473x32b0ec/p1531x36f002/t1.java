package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes2.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f197239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float[] f197240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(int[] iArr, float[] fArr) {
        super(2);
        this.f197239d = iArr;
        this.f197240e = fArr;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new android.graphics.LinearGradient(0.0f, 0.0f, ((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue(), this.f197239d, this.f197240e, android.graphics.Shader.TileMode.CLAMP);
    }
}
