package yu3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f547384a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f547385b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f547386c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f547387d;

    /* renamed from: e, reason: collision with root package name */
    public final long f547388e;

    /* renamed from: f, reason: collision with root package name */
    public final long f547389f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f547390g;

    /* renamed from: h, reason: collision with root package name */
    public final int f547391h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f547392i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f547393j;

    public a(int i17, boolean z17, java.lang.String videoPath, java.util.ArrayList imageList, long j17, long j18, boolean z18, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageList, "imageList");
        this.f547384a = i17;
        this.f547385b = z17;
        this.f547386c = videoPath;
        this.f547387d = imageList;
        this.f547388e = j17;
        this.f547389f = j18;
        this.f547390g = z18;
        this.f547391h = i18;
        this.f547392i = gVar;
        this.f547393j = gVar2;
    }

    /* renamed from: equals */
    public boolean m177685xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu3.a)) {
            return false;
        }
        yu3.a aVar = (yu3.a) obj;
        return this.f547384a == aVar.f547384a && this.f547385b == aVar.f547385b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547386c, aVar.f547386c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547387d, aVar.f547387d) && this.f547388e == aVar.f547388e && this.f547389f == aVar.f547389f && this.f547390g == aVar.f547390g && this.f547391h == aVar.f547391h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547392i, aVar.f547392i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547393j, aVar.f547393j);
    }

    /* renamed from: hashCode */
    public int m177686x8cdac1b() {
        int hashCode = ((((((((((((((java.lang.Integer.hashCode(this.f547384a) * 31) + java.lang.Boolean.hashCode(this.f547385b)) * 31) + this.f547386c.hashCode()) * 31) + this.f547387d.hashCode()) * 31) + java.lang.Long.hashCode(this.f547388e)) * 31) + java.lang.Long.hashCode(this.f547389f)) * 31) + java.lang.Boolean.hashCode(this.f547390g)) * 31) + java.lang.Integer.hashCode(this.f547391h)) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f547392i;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f547393j;
        return hashCode2 + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m177687x9616526c() {
        return "CreateInfoOfGetRecommendTask(sceneValue=" + this.f547384a + ", isSimpleRequest=" + this.f547385b + ", videoPath=" + this.f547386c + ", imageList=" + this.f547387d + ", startTime=" + this.f547388e + ", endTime=" + this.f547389f + ", autoPlayAudio=" + this.f547390g + ", bgmListScene=" + this.f547391h + ", classifyResultData=" + this.f547392i + ", promptRawText=" + this.f547393j + ')';
    }

    public /* synthetic */ a(int i17, boolean z17, java.lang.String str, java.util.ArrayList arrayList, long j17, long j18, boolean z18, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i19 & 2) != 0 ? false : z17, (i19 & 4) != 0 ? "" : str, (i19 & 8) != 0 ? new java.util.ArrayList() : arrayList, (i19 & 16) != 0 ? 0L : j17, (i19 & 32) == 0 ? j18 : 0L, (i19 & 64) != 0 ? false : z18, (i19 & 128) == 0 ? i18 : 0, (i19 & 256) != 0 ? null : gVar, (i19 & 512) == 0 ? gVar2 : null);
    }
}
