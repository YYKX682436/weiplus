package yt2;

/* loaded from: classes3.dex */
public final class j extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f546843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f546844b;

    public j(int[] iArr, float[] fArr) {
        this.f546843a = iArr;
        this.f546844b = fArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        return new android.graphics.LinearGradient(0.0f, 0.0f, i17, i18, this.f546843a, this.f546844b, android.graphics.Shader.TileMode.CLAMP);
    }
}
