package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes12.dex */
public class d3 extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f180411a;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.f3 f3Var, int[] iArr) {
        this.f180411a = iArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        return new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, i18, new int[]{0, this.f180411a[0]}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.REPEAT);
    }
}
