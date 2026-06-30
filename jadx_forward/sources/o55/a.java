package o55;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f424695a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f424696b;

    /* renamed from: c, reason: collision with root package name */
    public final long f424697c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f424698d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f424699e;

    /* renamed from: f, reason: collision with root package name */
    public final int f424700f;

    /* renamed from: g, reason: collision with root package name */
    public final long f424701g;

    /* renamed from: h, reason: collision with root package name */
    public final int f424702h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f424703i;

    public a(int i17, java.lang.String workTagId, long j17, java.lang.String videoMixPath, java.lang.String thumbPath, int i18, long j18, int i19, byte[] bArr, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i27 & 32) != 0 ? -1 : i18;
        j18 = (i27 & 64) != 0 ? 0L : j18;
        i19 = (i27 & 128) != 0 ? 0 : i19;
        bArr = (i27 & 256) != 0 ? null : bArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoMixPath, "videoMixPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        this.f424695a = i17;
        this.f424696b = workTagId;
        this.f424697c = j17;
        this.f424698d = videoMixPath;
        this.f424699e = thumbPath;
        this.f424700f = i18;
        this.f424701g = j18;
        this.f424702h = i19;
        this.f424703i = bArr;
    }

    /* renamed from: equals */
    public boolean m150657xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o55.a)) {
            return false;
        }
        o55.a aVar = (o55.a) obj;
        return this.f424695a == aVar.f424695a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424696b, aVar.f424696b) && this.f424697c == aVar.f424697c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424698d, aVar.f424698d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424699e, aVar.f424699e) && this.f424700f == aVar.f424700f && this.f424701g == aVar.f424701g && this.f424702h == aVar.f424702h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424703i, aVar.f424703i);
    }

    /* renamed from: hashCode */
    public int m150658x8cdac1b() {
        int hashCode = ((((((((((((((java.lang.Integer.hashCode(this.f424695a) * 31) + this.f424696b.hashCode()) * 31) + java.lang.Long.hashCode(this.f424697c)) * 31) + this.f424698d.hashCode()) * 31) + this.f424699e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f424700f)) * 31) + java.lang.Long.hashCode(this.f424701g)) * 31) + java.lang.Integer.hashCode(this.f424702h)) * 31;
        byte[] bArr = this.f424703i;
        return hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr));
    }

    /* renamed from: toString */
    public java.lang.String m150659x9616526c() {
        return "BackgroundVideoBean(workType=" + this.f424695a + ", workTagId=" + this.f424696b + ", confirmRemuxTime=" + this.f424697c + ", videoMixPath=" + this.f424698d + ", thumbPath=" + this.f424699e + ", muxResult=" + this.f424700f + ", muxFinishTime=" + this.f424701g + ", exportVideoDurationMs=" + this.f424702h + ", extInfo=" + java.util.Arrays.toString(this.f424703i) + ')';
    }
}
