package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.gif.d f223660c;

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f223661a = new jt0.j(10);

    /* renamed from: b, reason: collision with root package name */
    public final kk.j f223662b = new jt0.j(10, new com.p314xaae8f345.mm.p1006xc5476f33.gif.c(this));

    public static synchronized com.p314xaae8f345.mm.p1006xc5476f33.gif.d c() {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.d dVar;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.gif.d.class) {
            if (f223660c == null) {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.gif.d.class) {
                    if (f223660c == null) {
                        f223660c = new com.p314xaae8f345.mm.p1006xc5476f33.gif.d();
                    }
                }
            }
            dVar = f223660c;
        }
        return dVar;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.gif.b a(java.lang.String str, java.lang.String str2) {
        kk.j jVar = this.f223662b;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.b bVar = ((lt0.f) jVar).get(str) != null ? (com.p314xaae8f345.mm.p1006xc5476f33.gif.b) ((java.lang.ref.WeakReference) ((lt0.f) jVar).get(str)).get() : null;
        if (bVar == null) {
            java.lang.System.currentTimeMillis();
            bVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str2) ? new com.p314xaae8f345.mm.p1006xc5476f33.gif.u(com.p314xaae8f345.mm.vfs.w6.N(str2, 0, (int) com.p314xaae8f345.mm.vfs.w6.k(str2))) : new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(str2);
            java.lang.System.currentTimeMillis();
            ((lt0.f) jVar).put(str, new java.lang.ref.WeakReference(bVar));
        }
        return bVar;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.gif.b b(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        kk.j jVar = this.f223662b;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.b bVar = ((lt0.f) jVar).get(str) != null ? (com.p314xaae8f345.mm.p1006xc5476f33.gif.b) ((java.lang.ref.WeakReference) ((lt0.f) jVar).get(str)).get() : null;
        if (bVar == null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(bArr)) {
                ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
                if (gr.z.b()) {
                    bVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.u(bArr);
                    ((lt0.f) jVar).put(str, new java.lang.ref.WeakReference(bVar));
                }
            }
            bVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(bArr, false);
            ((lt0.f) jVar).put(str, new java.lang.ref.WeakReference(bVar));
        }
        if (!bVar.isRunning()) {
            bVar.c();
        }
        return bVar;
    }
}
