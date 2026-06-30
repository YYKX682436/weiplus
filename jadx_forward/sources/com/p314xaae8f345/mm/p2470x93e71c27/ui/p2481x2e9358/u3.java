package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class u3 extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f272208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f272209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272210c;

    public u3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, float f17, float f18) {
        this.f272210c = c19666xfd6e2f33;
        this.f272208a = f17;
        this.f272209b = f18;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        float f17 = i18;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272210c;
        return new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, f17, new int[]{c19666xfd6e2f33.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561073an3), c19666xfd6e2f33.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561073an3), c19666xfd6e2f33.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561072an2), c19666xfd6e2f33.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561072an2)}, new float[]{0.0f, this.f272208a, this.f272209b, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
    }
}
