package b80;

/* loaded from: classes12.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f18287a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f18288b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f18289c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f18290d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f18291e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f18292f;

    /* renamed from: g, reason: collision with root package name */
    public final r15.b f18293g;

    /* renamed from: h, reason: collision with root package name */
    public final android.net.Uri f18294h;

    /* renamed from: i, reason: collision with root package name */
    public final long f18295i;

    /* renamed from: j, reason: collision with root package name */
    public final j15.c f18296j;

    public w(java.lang.String preBuildFastMd5, java.lang.String imgPath, com.tencent.mm.storage.f9 msgInfo, java.lang.String thumbName, java.lang.String thumbPath, java.lang.String hdThumgPath, r15.b bVar, android.net.Uri uri, long j17, j15.c cVar) {
        kotlin.jvm.internal.o.g(preBuildFastMd5, "preBuildFastMd5");
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(thumbName, "thumbName");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(hdThumgPath, "hdThumgPath");
        this.f18287a = preBuildFastMd5;
        this.f18288b = imgPath;
        this.f18289c = msgInfo;
        this.f18290d = thumbName;
        this.f18291e = thumbPath;
        this.f18292f = hdThumgPath;
        this.f18293g = bVar;
        this.f18294h = uri;
        this.f18295i = j17;
        this.f18296j = cVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b80.w)) {
            return false;
        }
        b80.w wVar = (b80.w) obj;
        return kotlin.jvm.internal.o.b(this.f18287a, wVar.f18287a) && kotlin.jvm.internal.o.b(this.f18288b, wVar.f18288b) && kotlin.jvm.internal.o.b(this.f18289c, wVar.f18289c) && kotlin.jvm.internal.o.b(this.f18290d, wVar.f18290d) && kotlin.jvm.internal.o.b(this.f18291e, wVar.f18291e) && kotlin.jvm.internal.o.b(this.f18292f, wVar.f18292f) && kotlin.jvm.internal.o.b(this.f18293g, wVar.f18293g) && kotlin.jvm.internal.o.b(this.f18294h, wVar.f18294h) && this.f18295i == wVar.f18295i && kotlin.jvm.internal.o.b(this.f18296j, wVar.f18296j);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f18287a.hashCode() * 31) + this.f18288b.hashCode()) * 31) + this.f18289c.hashCode()) * 31) + this.f18290d.hashCode()) * 31) + this.f18291e.hashCode()) * 31) + this.f18292f.hashCode()) * 31;
        r15.b bVar = this.f18293g;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        android.net.Uri uri = this.f18294h;
        int hashCode3 = (((hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31) + java.lang.Long.hashCode(this.f18295i)) * 31;
        j15.c cVar = this.f18296j;
        return hashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SendPreBuildMsgInfo(preBuildFastMd5=" + this.f18287a + ", imgPath=" + this.f18288b + ", msgInfo=" + this.f18289c + ", thumbName=" + this.f18290d + ", thumbPath=" + this.f18291e + ", hdThumgPath=" + this.f18292f + ", extCommonInfo=" + this.f18293g + ", imgUri=" + this.f18294h + ", mediaId=" + this.f18295i + ", livePhotoInfo=" + this.f18296j + ')';
    }
}
