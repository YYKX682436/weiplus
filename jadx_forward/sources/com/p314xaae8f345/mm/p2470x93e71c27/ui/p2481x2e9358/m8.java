package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class m8 extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 f272023a;

    public m8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var) {
        this.f272023a = h9Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272023a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = h9Var.f271892e;
        float f17 = c19666xfd6e2f33.f271543k2 || c19666xfd6e2f33.D0() ? 0.48f : 0.6f;
        float f18 = i18;
        android.content.Context context = h9Var.f271893f;
        return new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, f18, new int[]{context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561074an4), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a)}, new float[]{0.0f, f17, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
    }
}
