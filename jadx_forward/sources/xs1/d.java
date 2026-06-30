package xs1;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f537829a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f537830b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f537831c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f537832d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f537833e;

    public d(java.lang.String url, com.p314xaae8f345.mm.vfs.r6 savedFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(savedFile, "savedFile");
        this.f537829a = url;
        this.f537830b = savedFile;
        this.f537832d = "";
        this.f537833e = "";
    }

    /* renamed from: toString */
    public java.lang.String m175863x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebPrefetcherHttpDownloadRequest{eTag: ");
        sb6.append(this.f537832d);
        sb6.append(", wxETag: ");
        sb6.append(this.f537833e);
        sb6.append(", savedFile: ");
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f537830b;
        sb6.append(r6Var.o());
        sb6.append(", ");
        sb6.append(r6Var.m());
        sb6.append('}');
        java.lang.String format = java.lang.String.format(sb6.toString(), java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
