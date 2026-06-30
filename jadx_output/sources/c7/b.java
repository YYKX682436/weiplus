package c7;

/* loaded from: classes13.dex */
public class b implements android.graphics.ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f39511c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t6.b f39512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d7.v f39513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t6.m f39514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c7.c f39515g;

    public b(c7.c cVar, int i17, int i18, boolean z17, t6.b bVar, d7.v vVar, t6.m mVar) {
        this.f39515g = cVar;
        this.f39509a = i17;
        this.f39510b = i18;
        this.f39511c = z17;
        this.f39512d = bVar;
        this.f39513e = vVar;
        this.f39514f = mVar;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
        boolean z17 = false;
        if (this.f39515g.f39516a.a(this.f39509a, this.f39510b, this.f39511c, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f39512d == t6.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new c7.a(this));
        android.util.Size size = imageInfo.getSize();
        int i17 = this.f39509a;
        if (i17 == Integer.MIN_VALUE) {
            i17 = size.getWidth();
        }
        int i18 = this.f39510b;
        if (i18 == Integer.MIN_VALUE) {
            i18 = size.getHeight();
        }
        float b17 = this.f39513e.b(size.getWidth(), size.getHeight(), i17, i18);
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
            if (this.f39514f == t6.m.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z17 = true;
            }
            imageDecoder.setTargetColorSpace(android.graphics.ColorSpace.get(z17 ? android.graphics.ColorSpace.Named.DISPLAY_P3 : android.graphics.ColorSpace.Named.SRGB));
        }
    }
}
