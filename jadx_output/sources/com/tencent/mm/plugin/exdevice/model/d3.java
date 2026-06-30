package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes12.dex */
public class d3 extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f98878a;

    public d3(com.tencent.mm.plugin.exdevice.model.f3 f3Var, int[] iArr) {
        this.f98878a = iArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        return new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, i18, new int[]{0, this.f98878a[0]}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.REPEAT);
    }
}
