package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes5.dex */
public class p extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232306a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t tVar, int i17) {
        this.f232306a = i17;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        return new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, i18, new int[]{0, this.f232306a}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.REPEAT);
    }
}
