package bg0;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f19865a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f19866b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19867c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19868d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f19869e;

    /* renamed from: f, reason: collision with root package name */
    public double f19870f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19871g;

    public y(java.lang.String id6, java.lang.String originPath, long j17, long j18, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, double d17, int i17) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(originPath, "originPath");
        this.f19865a = id6;
        this.f19866b = originPath;
        this.f19867c = j17;
        this.f19868d = j18;
        this.f19869e = galleryItem$MediaItem;
        this.f19870f = d17;
        this.f19871g = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg0.y)) {
            return false;
        }
        bg0.y yVar = (bg0.y) obj;
        return kotlin.jvm.internal.o.b(this.f19865a, yVar.f19865a) && kotlin.jvm.internal.o.b(this.f19866b, yVar.f19866b) && this.f19867c == yVar.f19867c && this.f19868d == yVar.f19868d && kotlin.jvm.internal.o.b(this.f19869e, yVar.f19869e) && java.lang.Double.compare(this.f19870f, yVar.f19870f) == 0 && this.f19871g == yVar.f19871g;
    }

    public int hashCode() {
        int hashCode = ((((((this.f19865a.hashCode() * 31) + this.f19866b.hashCode()) * 31) + java.lang.Long.hashCode(this.f19867c)) * 31) + java.lang.Long.hashCode(this.f19868d)) * 31;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f19869e;
        return ((((hashCode + (galleryItem$MediaItem == null ? 0 : galleryItem$MediaItem.hashCode())) * 31) + java.lang.Double.hashCode(this.f19870f)) * 31) + java.lang.Integer.hashCode(this.f19871g);
    }

    public java.lang.String toString() {
        return "SegmentClipData(id=" + this.f19865a + ", originPath=" + this.f19866b + ", clipDurationMS=" + this.f19867c + ", totalDurationMS=" + this.f19868d + ", mediaItem=" + this.f19869e + ", clipRangeStartTimeMS=" + this.f19870f + ", minThumbViewCount=" + this.f19871g + ')';
    }
}
