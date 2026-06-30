package aq;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f12965a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f12966b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f12967c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12968d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f12969e;

    public t0(java.lang.String videoPath, java.lang.String coverPath, java.lang.String exportPath, long j17, android.os.Bundle extras) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(coverPath, "coverPath");
        kotlin.jvm.internal.o.g(exportPath, "exportPath");
        kotlin.jvm.internal.o.g(extras, "extras");
        this.f12965a = videoPath;
        this.f12966b = coverPath;
        this.f12967c = exportPath;
        this.f12968d = j17;
        this.f12969e = extras;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.t0)) {
            return false;
        }
        aq.t0 t0Var = (aq.t0) obj;
        return kotlin.jvm.internal.o.b(this.f12965a, t0Var.f12965a) && kotlin.jvm.internal.o.b(this.f12966b, t0Var.f12966b) && kotlin.jvm.internal.o.b(this.f12967c, t0Var.f12967c) && this.f12968d == t0Var.f12968d && kotlin.jvm.internal.o.b(this.f12969e, t0Var.f12969e);
    }

    public int hashCode() {
        return (((((((this.f12965a.hashCode() * 31) + this.f12966b.hashCode()) * 31) + this.f12967c.hashCode()) * 31) + java.lang.Long.hashCode(this.f12968d)) * 31) + this.f12969e.hashCode();
    }

    public java.lang.String toString() {
        return "MMLivePhotoExportData(videoPath=" + this.f12965a + ", coverPath=" + this.f12966b + ", exportPath=" + this.f12967c + ", coverTimeStampMs=" + this.f12968d + ", extras=" + this.f12969e + ')';
    }

    public /* synthetic */ t0(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, android.os.Bundle bundle, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, str3, (i17 & 8) != 0 ? 0L : j17, (i17 & 16) != 0 ? new android.os.Bundle() : bundle);
    }
}
