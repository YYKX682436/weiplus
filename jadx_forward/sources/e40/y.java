package e40;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f329161a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f329162b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f329163c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f329164d;

    /* renamed from: e, reason: collision with root package name */
    public final long f329165e;

    public y(java.lang.String fileId, java.lang.String aesKey, java.lang.String downloadPath, java.lang.String str, java.lang.String str2, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str2 = (i17 & 16) != 0 ? null : str2;
        j17 = (i17 & 32) != 0 ? 0L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadPath, "downloadPath");
        this.f329161a = fileId;
        this.f329162b = aesKey;
        this.f329163c = downloadPath;
        this.f329164d = str2;
        this.f329165e = j17;
    }
}
