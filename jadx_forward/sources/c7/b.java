package c7;

/* loaded from: classes13.dex */
public class b implements android.graphics.ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f121044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t6.b f121045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d7.v f121046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t6.m f121047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c7.c f121048g;

    public b(c7.c cVar, int i17, int i18, boolean z17, t6.b bVar, d7.v vVar, t6.m mVar) {
        this.f121048g = cVar;
        this.f121042a = i17;
        this.f121043b = i18;
        this.f121044c = z17;
        this.f121045d = bVar;
        this.f121046e = vVar;
        this.f121047f = mVar;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
        boolean z17 = false;
        if (this.f121048g.f121049a.a(this.f121042a, this.f121043b, this.f121044c, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f121045d == t6.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new c7.a(this));
        android.util.Size size = imageInfo.getSize();
        int i17 = this.f121042a;
        if (i17 == Integer.MIN_VALUE) {
            i17 = size.getWidth();
        }
        int i18 = this.f121043b;
        if (i18 == Integer.MIN_VALUE) {
            i18 = size.getHeight();
        }
        float b17 = this.f121046e.b(size.getWidth(), size.getHeight(), i17, i18);
        int round = java.lang.Math.round(size.getWidth() * b17);
        int round2 = java.lang.Math.round(b17 * size.getHeight());
        if (android.util.Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 < 28) {
            if (i19 >= 26) {
                imageDecoder.setTargetColorSpace(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB));
            }
        } else {
            if (this.f121047f == t6.m.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z17 = true;
            }
            imageDecoder.setTargetColorSpace(android.graphics.ColorSpace.get(z17 ? android.graphics.ColorSpace.Named.DISPLAY_P3 : android.graphics.ColorSpace.Named.SRGB));
        }
    }
}
