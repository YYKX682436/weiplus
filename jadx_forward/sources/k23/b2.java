package k23;

/* loaded from: classes5.dex */
public final class b2 extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f385058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f385059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f385060c;

    public b2(int i17, int i18, float f17) {
        this.f385058a = i17;
        this.f385059b = i18;
        this.f385060c = f17;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        float f17 = i17;
        int i19 = this.f385058a;
        int i27 = this.f385059b;
        return new android.graphics.LinearGradient(0.0f, 0.0f, f17, 0.0f, new int[]{i19, i27, i27}, new float[]{0.0f, this.f385060c, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
    }
}
