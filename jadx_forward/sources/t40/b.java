package t40;

/* loaded from: classes10.dex */
public final class b implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f497003d;

    /* renamed from: e, reason: collision with root package name */
    public final int f497004e;

    /* renamed from: f, reason: collision with root package name */
    public final int f497005f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f497006g;

    /* renamed from: h, reason: collision with root package name */
    public final t40.d f497007h;

    /* renamed from: i, reason: collision with root package name */
    public final int f497008i;

    public b(java.lang.String cdnTaskName, int i17, int i18, java.lang.String savePathRoot, t40.d galleryScene, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnTaskName, "cdnTaskName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(savePathRoot, "savePathRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryScene, "galleryScene");
        this.f497003d = cdnTaskName;
        this.f497004e = i17;
        this.f497005f = i18;
        this.f497006g = savePathRoot;
        this.f497007h = galleryScene;
        this.f497008i = i19;
    }

    /* renamed from: equals */
    public boolean m165857xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t40.b)) {
            return false;
        }
        t40.b bVar = (t40.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f497003d, bVar.f497003d) && this.f497004e == bVar.f497004e && this.f497005f == bVar.f497005f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f497006g, bVar.f497006g) && this.f497007h == bVar.f497007h && this.f497008i == bVar.f497008i;
    }

    /* renamed from: hashCode */
    public int m165858x8cdac1b() {
        return (((((((((this.f497003d.hashCode() * 31) + java.lang.Integer.hashCode(this.f497004e)) * 31) + java.lang.Integer.hashCode(this.f497005f)) * 31) + this.f497006g.hashCode()) * 31) + this.f497007h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f497008i);
    }

    /* renamed from: toString */
    public java.lang.String m165859x9616526c() {
        return "FinderLiveGalleryConfig(cdnTaskName=" + this.f497003d + ", cdnPriority=" + this.f497004e + ", enterIndex=" + this.f497005f + ", savePathRoot=" + this.f497006g + ", galleryScene=" + this.f497007h + ", finderPostEnterScene=" + this.f497008i + ')';
    }
}
