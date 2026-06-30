package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class v0 implements java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public final zq5.k f296649d;

    /* renamed from: e, reason: collision with root package name */
    public final yq5.h f296650e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f296651f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f296652g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f296653h;

    /* renamed from: i, reason: collision with root package name */
    public int f296654i;

    /* renamed from: m, reason: collision with root package name */
    public final yq5.c f296655m;

    public v0(zq5.k logger, yq5.h regionDecoder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logger, "logger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(regionDecoder, "regionDecoder");
        this.f296649d = logger;
        this.f296650e = regionDecoder;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f296652g = arrayList;
        this.f296653h = new java.lang.Object();
        this.f296655m = (yq5.c) ((jz5.n) ((com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d) regionDecoder).f296466i).mo141623x754a37bb();
        arrayList.add(regionDecoder);
        this.f296654i++;
        logger.a(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.r0(this));
    }

    public final android.graphics.Bitmap a(zq5.e srcRect, int i17) {
        boolean z17;
        yq5.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcRect, "srcRect");
        synchronized (this.f296653h) {
            z17 = this.f296651f;
        }
        if (!(!z17)) {
            throw new java.lang.IllegalStateException(("TileDecoder is closed. " + this.f296650e).toString());
        }
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.t0 t0Var = new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.t0(srcRect, i17);
        synchronized (this.f296653h) {
            hVar = ((java.util.ArrayList) this.f296652g).isEmpty() ^ true ? (yq5.h) ((java.util.ArrayList) this.f296652g).remove(0) : null;
        }
        if (hVar == null) {
            this.f296654i++;
            this.f296649d.a(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.u0(this));
            com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d dVar = (com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d) this.f296650e;
            hVar = new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d(dVar.f296461d, dVar.f296462e, (yq5.c) ((jz5.n) dVar.f296466i).mo141623x754a37bb());
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) t0Var.mo146xb9724478(hVar);
        synchronized (this.f296653h) {
            if (this.f296651f) {
                try {
                    ((com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d) hVar).close();
                } catch (java.lang.RuntimeException e17) {
                    throw e17;
                } catch (java.lang.Exception unused) {
                }
            } else {
                ((java.util.ArrayList) this.f296652g).add(hVar);
            }
        }
        return bitmap;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        boolean z17;
        synchronized (this.f296653h) {
            z17 = this.f296651f;
        }
        if (z17) {
            return;
        }
        this.f296651f = true;
        this.f296649d.a(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.s0(this));
        synchronized (this.f296653h) {
            java.util.Iterator it = ((java.util.ArrayList) this.f296652g).iterator();
            while (it.hasNext()) {
                yq5.h hVar = (yq5.h) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<this>");
                try {
                    ((com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d) hVar).close();
                } catch (java.lang.RuntimeException e17) {
                    throw e17;
                } catch (java.lang.Exception unused) {
                }
            }
            ((java.util.ArrayList) this.f296652g).clear();
        }
    }

    /* renamed from: toString */
    public java.lang.String m83907x9616526c() {
        return "TileDecoder(" + this.f296650e + ')';
    }
}
