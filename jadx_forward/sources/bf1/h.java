package bf1;

/* loaded from: classes7.dex */
public class h implements oe1.q1, lm0.b {

    /* renamed from: h, reason: collision with root package name */
    public static bf1.h f101121h;

    /* renamed from: d, reason: collision with root package name */
    public s9.c f101122d;

    /* renamed from: e, reason: collision with root package name */
    public s9.i f101123e;

    /* renamed from: f, reason: collision with root package name */
    public bf1.f f101124f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f101125g = false;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.ExoVideoCacheHandler", "mkdirs fail, not dir");
        com.p314xaae8f345.mm.vfs.w6.h(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.u(r3) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.ExoVideoCacheHandler", "mkdirs fail 2, no space?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bf1.h.<init>():void");
    }

    public static bf1.h i() {
        if (f101121h == null) {
            synchronized (bf1.h.class) {
                if (f101121h == null) {
                    f101121h = new bf1.h();
                }
            }
        }
        return f101121h;
    }

    @Override // oe1.q1
    public r9.j G4() {
        return this.f101123e;
    }

    @Override // lm0.b
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoVideoCacheHandler", "unregister VideoCacheService#ExoVideoCacheHandler");
    }

    @Override // lm0.b
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoVideoCacheHandler", "register VideoCacheService#ExoVideoCacheHandler");
    }

    public s9.c f(java.io.File file, s9.j jVar) {
        return new s9.r(file, jVar, new s9.o(file, null, false));
    }

    public void h(java.lang.String url, long j17, long j18) {
        s9.i iVar;
        synchronized (this) {
            if (!this.f101125g) {
                s9.c cVar = this.f101122d;
                if (cVar != null && (iVar = this.f101123e) != null) {
                    this.f101124f = new bf1.f(cVar, iVar);
                }
                this.f101125g = true;
            }
        }
        bf1.f fVar = this.f101124f;
        if (fVar == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fVar.f101119c;
        ku5.u0 u0Var = ku5.t0.f394148d;
        bf1.c cVar2 = new bf1.c(url, j17, j18, fVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c k17 = t0Var.k(cVar2, 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "execute(...)");
        concurrentHashMap.put(url, k17);
    }

    public java.lang.String k() {
        int indexOf;
        int i17;
        java.lang.String a17 = bm5.f1.a();
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) || (indexOf = a17.indexOf(":")) < 0 || a17.length() < (i17 = indexOf + 1)) ? com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29 : a17.substring(i17);
    }

    @Override // oe1.q1
    public long q0(java.lang.String str, long j17, long j18) {
        if (this.f101122d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.ExoVideoCacheHandler", "getCachedBytes, cache is null");
            return 0L;
        }
        long q07 = this.f101122d.q0(oe1.v1.h().f(str), j17, j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoVideoCacheHandler", "getCachedBytes, cachedSize:%s, position:%s, length:%s, url:%s", java.lang.Long.valueOf(q07), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str);
        return q07;
    }

    @Override // oe1.q1
    public void t5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoVideoCacheHandler", "removeCache, url: %s", str);
        if (str == null) {
            return;
        }
        if (this.f101122d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.ExoVideoCacheHandler", "removeCache, cache is null");
            return;
        }
        java.lang.String f17 = oe1.v1.h().f(str);
        s9.c cVar = this.f101122d;
        java.util.NavigableSet k17 = cVar.k(f17);
        if (k17 == null) {
            return;
        }
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            try {
                cVar.g((s9.k) it.next());
            } catch (s9.a unused) {
            }
        }
    }

    @Override // oe1.q1
    public java.lang.String z7(java.lang.String str) {
        return str;
    }
}
