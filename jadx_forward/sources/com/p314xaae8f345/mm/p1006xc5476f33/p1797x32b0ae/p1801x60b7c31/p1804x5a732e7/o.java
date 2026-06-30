package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f225227a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f225228b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f225229c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f225230d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f225231e;

    public o(java.lang.String fileId, java.lang.String aesKey, java.lang.String fileName, java.lang.String md52) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        this.f225227a = fileId;
        this.f225228b = aesKey;
        this.f225229c = fileName;
        this.f225230d = md52;
        com.p314xaae8f345.mm.vfs.r6 r6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q.f225253g;
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(fileId, false, true);
        com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : r6Var.f294699d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str = z7Var.f294812f;
            z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str + '/' + l17, z7Var.f294813g, z7Var.f294814h);
        }
        java.lang.String m82499x9616526c = z7Var.m82499x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82499x9616526c, "getPath(...)");
        this.f225231e = m82499x9616526c;
    }
}
