package mt3;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final st3.f f412822a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f412823b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f412824c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f412825d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f412826e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f412827f;

    /* renamed from: g, reason: collision with root package name */
    public final int f412828g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f412829h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f412830i;

    /* renamed from: j, reason: collision with root package name */
    public final int f412831j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f412832k;

    public a(st3.f captureInfo, java.util.List editorItems, float[] drawingRect, float[] fArr, java.lang.String mixVideoPath, java.lang.String mixThumbPath, int i17, boolean z17, boolean z18, int i18, java.lang.String blurBgPath, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        fArr = (i19 & 8) != 0 ? null : fArr;
        i17 = (i19 & 64) != 0 ? 1 : i17;
        z17 = (i19 & 128) != 0 ? false : z17;
        z18 = (i19 & 256) != 0 ? false : z18;
        i18 = (i19 & 512) != 0 ? 0 : i18;
        blurBgPath = (i19 & 1024) != 0 ? "" : blurBgPath;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captureInfo, "captureInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editorItems, "editorItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawingRect, "drawingRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixVideoPath, "mixVideoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixThumbPath, "mixThumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blurBgPath, "blurBgPath");
        this.f412822a = captureInfo;
        this.f412823b = editorItems;
        this.f412824c = drawingRect;
        this.f412825d = fArr;
        this.f412826e = mixVideoPath;
        this.f412827f = mixThumbPath;
        this.f412828g = i17;
        this.f412829h = z17;
        this.f412830i = z18;
        this.f412831j = i18;
        this.f412832k = blurBgPath;
    }

    public final java.lang.String a() {
        return this.f412832k;
    }

    public final float[] b() {
        return this.f412824c;
    }

    public final java.util.List c() {
        return this.f412823b;
    }

    public final float[] d() {
        return this.f412825d;
    }

    /* renamed from: equals */
    public boolean m148373xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt3.a)) {
            return false;
        }
        mt3.a aVar = (mt3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412822a, aVar.f412822a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412823b, aVar.f412823b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412824c, aVar.f412824c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412825d, aVar.f412825d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412826e, aVar.f412826e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412827f, aVar.f412827f) && this.f412828g == aVar.f412828g && this.f412829h == aVar.f412829h && this.f412830i == aVar.f412830i && this.f412831j == aVar.f412831j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412832k, aVar.f412832k);
    }

    /* renamed from: hashCode */
    public int m148374x8cdac1b() {
        int hashCode = ((((this.f412822a.hashCode() * 31) + this.f412823b.hashCode()) * 31) + java.util.Arrays.hashCode(this.f412824c)) * 31;
        float[] fArr = this.f412825d;
        return ((((((((((((((hashCode + (fArr == null ? 0 : java.util.Arrays.hashCode(fArr))) * 31) + this.f412826e.hashCode()) * 31) + this.f412827f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f412828g)) * 31) + java.lang.Boolean.hashCode(this.f412829h)) * 31) + java.lang.Boolean.hashCode(this.f412830i)) * 31) + java.lang.Integer.hashCode(this.f412831j)) * 31) + this.f412832k.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148375x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VideoMixData(captureInfo=");
        sb6.append(this.f412822a);
        sb6.append(", editorItems=");
        sb6.append(this.f412823b);
        sb6.append(", drawingRect=");
        java.lang.String arrays = java.util.Arrays.toString(this.f412824c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", mixVideoPath='");
        sb6.append(this.f412826e);
        sb6.append("', mixThumbPath='");
        sb6.append(this.f412827f);
        sb6.append("', retryTime=");
        sb6.append(this.f412828g);
        sb6.append(", useSoftEncode=");
        sb6.append(this.f412829h);
        sb6.append(", enableHevc=");
        sb6.append(this.f412830i);
        sb6.append(", thumbShortSide=");
        sb6.append(this.f412831j);
        sb6.append(", blurBgPath='");
        sb6.append(this.f412832k);
        sb6.append("')");
        return sb6.toString();
    }
}
