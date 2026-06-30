package md4;

/* loaded from: classes3.dex */
public final class a extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f407402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f407403b;

    public a(int[] iArr, float[] fArr) {
        this.f407402a = iArr;
        this.f407403b = fArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$addGradientBackground$pd$1$1");
        android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, i18, this.f407402a, this.f407403b, android.graphics.Shader.TileMode.CLAMP);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$addGradientBackground$pd$1$1");
        return linearGradient;
    }
}
