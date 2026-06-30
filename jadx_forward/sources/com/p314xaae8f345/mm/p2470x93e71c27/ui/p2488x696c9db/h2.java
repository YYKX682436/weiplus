package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes11.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f273210a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f273211b;

    /* renamed from: c, reason: collision with root package name */
    public final long f273212c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f273213d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f273214e;

    public h2(android.net.Uri uri, java.lang.String path, long j17, java.lang.String fileTitle, java.lang.String ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileTitle, "fileTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        this.f273210a = uri;
        this.f273211b = path;
        this.f273212c = j17;
        this.f273213d = fileTitle;
        this.f273214e = ext;
    }

    /* renamed from: equals */
    public boolean m75853xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h2)) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h2 h2Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f273210a, h2Var.f273210a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f273211b, h2Var.f273211b) && this.f273212c == h2Var.f273212c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f273213d, h2Var.f273213d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f273214e, h2Var.f273214e);
    }

    /* renamed from: hashCode */
    public int m75854x8cdac1b() {
        return (((((((this.f273210a.hashCode() * 31) + this.f273211b.hashCode()) * 31) + java.lang.Long.hashCode(this.f273212c)) * 31) + this.f273213d.hashCode()) * 31) + this.f273214e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m75855x9616526c() {
        return "ResolvedSelectedFile(uri=" + this.f273210a + ", path=" + this.f273211b + ", size=" + this.f273212c + ", fileTitle=" + this.f273213d + ", ext=" + this.f273214e + ')';
    }
}
