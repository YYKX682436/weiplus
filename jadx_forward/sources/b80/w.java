package b80;

/* loaded from: classes12.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f99820a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f99821b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f99822c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f99823d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f99824e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f99825f;

    /* renamed from: g, reason: collision with root package name */
    public final r15.b f99826g;

    /* renamed from: h, reason: collision with root package name */
    public final android.net.Uri f99827h;

    /* renamed from: i, reason: collision with root package name */
    public final long f99828i;

    /* renamed from: j, reason: collision with root package name */
    public final j15.c f99829j;

    public w(java.lang.String preBuildFastMd5, java.lang.String imgPath, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String thumbName, java.lang.String thumbPath, java.lang.String hdThumgPath, r15.b bVar, android.net.Uri uri, long j17, j15.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preBuildFastMd5, "preBuildFastMd5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbName, "thumbName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hdThumgPath, "hdThumgPath");
        this.f99820a = preBuildFastMd5;
        this.f99821b = imgPath;
        this.f99822c = msgInfo;
        this.f99823d = thumbName;
        this.f99824e = thumbPath;
        this.f99825f = hdThumgPath;
        this.f99826g = bVar;
        this.f99827h = uri;
        this.f99828i = j17;
        this.f99829j = cVar;
    }

    /* renamed from: equals */
    public boolean m9941xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b80.w)) {
            return false;
        }
        b80.w wVar = (b80.w) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99820a, wVar.f99820a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99821b, wVar.f99821b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99822c, wVar.f99822c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99823d, wVar.f99823d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99824e, wVar.f99824e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99825f, wVar.f99825f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99826g, wVar.f99826g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99827h, wVar.f99827h) && this.f99828i == wVar.f99828i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99829j, wVar.f99829j);
    }

    /* renamed from: hashCode */
    public int m9942x8cdac1b() {
        int hashCode = ((((((((((this.f99820a.hashCode() * 31) + this.f99821b.hashCode()) * 31) + this.f99822c.hashCode()) * 31) + this.f99823d.hashCode()) * 31) + this.f99824e.hashCode()) * 31) + this.f99825f.hashCode()) * 31;
        r15.b bVar = this.f99826g;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        android.net.Uri uri = this.f99827h;
        int hashCode3 = (((hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31) + java.lang.Long.hashCode(this.f99828i)) * 31;
        j15.c cVar = this.f99829j;
        return hashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m9943x9616526c() {
        return "SendPreBuildMsgInfo(preBuildFastMd5=" + this.f99820a + ", imgPath=" + this.f99821b + ", msgInfo=" + this.f99822c + ", thumbName=" + this.f99823d + ", thumbPath=" + this.f99824e + ", hdThumgPath=" + this.f99825f + ", extCommonInfo=" + this.f99826g + ", imgUri=" + this.f99827h + ", mediaId=" + this.f99828i + ", livePhotoInfo=" + this.f99829j + ')';
    }
}
