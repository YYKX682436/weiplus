package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes5.dex */
public final class z0 extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203588a;

    public z0(int i17) {
        this.f203588a = i17;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        float f17 = i17 / 2.0f;
        float f18 = i18;
        int i19 = this.f203588a;
        return new android.graphics.LinearGradient(f17, 0.0f, f17, f18, new int[]{0, i19, i19}, new float[]{0.0f, 0.58f, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
    }
}
