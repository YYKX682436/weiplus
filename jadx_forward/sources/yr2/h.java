package yr2;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ek4.b f546205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f546206b;

    /* renamed from: c, reason: collision with root package name */
    public final long f546207c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f546208d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f546209e;

    /* renamed from: f, reason: collision with root package name */
    public final mn2.g4 f546210f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f546211g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f546212h;

    /* renamed from: i, reason: collision with root package name */
    public final cs2.n f546213i;

    static {
        new yr2.h(new ek4.b(), 0, 0L, "", "", new mn2.g4(new r45.mb4(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.R, "xV99", 0, 0, null, false, null, 248, null), false, false, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
    }

    public h(ek4.b taskContext, int i17, long j17, java.lang.String fileFormat, java.lang.String codingFormat, mn2.g4 media, boolean z17, boolean z18, cs2.n preloadStage, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 64) != 0 ? false : z17;
        z18 = (i18 & 128) != 0 ? false : z18;
        preloadStage = (i18 & 256) != 0 ? cs2.n.f303612d : preloadStage;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskContext, "taskContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codingFormat, "codingFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadStage, "preloadStage");
        this.f546205a = taskContext;
        this.f546206b = i17;
        this.f546207c = j17;
        this.f546208d = fileFormat;
        this.f546209e = codingFormat;
        this.f546210f = media;
        this.f546211g = z17;
        this.f546212h = z18;
        this.f546213i = preloadStage;
    }

    /* renamed from: equals */
    public boolean m177557xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr2.h)) {
            return false;
        }
        yr2.h hVar = (yr2.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546205a, hVar.f546205a) && this.f546206b == hVar.f546206b && this.f546207c == hVar.f546207c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546208d, hVar.f546208d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546209e, hVar.f546209e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546210f, hVar.f546210f) && this.f546211g == hVar.f546211g && this.f546212h == hVar.f546212h && this.f546213i == hVar.f546213i;
    }

    /* renamed from: hashCode */
    public int m177558x8cdac1b() {
        return (((((((((((((((this.f546205a.m127800x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f546206b)) * 31) + java.lang.Long.hashCode(this.f546207c)) * 31) + this.f546208d.hashCode()) * 31) + this.f546209e.hashCode()) * 31) + this.f546210f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f546211g)) * 31) + java.lang.Boolean.hashCode(this.f546212h)) * 31) + this.f546213i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177559x9616526c() {
        return this.f546206b + "%:" + this.f546207c + ':' + this.f546208d + ':' + this.f546212h;
    }
}
