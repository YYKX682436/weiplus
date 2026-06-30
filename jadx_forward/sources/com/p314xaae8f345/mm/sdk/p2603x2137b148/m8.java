package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public final class m8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.m8 f274397a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.m8();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f274398b = jz5.h.a(jz5.i.f384362d, com.p314xaae8f345.mm.sdk.p2603x2137b148.l8.f274375d);

    /* renamed from: c, reason: collision with root package name */
    public static yz5.l f274399c;

    public final void a(android.net.Uri uri, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (path.length() > 0) {
            jz5.g gVar = f274398b;
            synchronized (((java.util.Map) gVar.mo141623x754a37bb())) {
                java.util.Map map = (java.util.Map) gVar.mo141623x754a37bb();
                java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(path)).o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                java.lang.String uri2 = uri.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri2, "toString(...)");
                map.put(o17, uri2);
            }
        }
    }

    public final void b(yz5.l lVar) {
        f274399c = lVar;
    }
}
