package re1;

/* loaded from: classes13.dex */
public final class f implements se1.g {

    /* renamed from: b, reason: collision with root package name */
    public int f475846b;

    /* renamed from: c, reason: collision with root package name */
    public long f475847c;

    /* renamed from: d, reason: collision with root package name */
    public long f475848d;

    /* renamed from: e, reason: collision with root package name */
    public final re1.b f475849e;

    /* renamed from: f, reason: collision with root package name */
    public final se1.g f475850f;

    /* renamed from: g, reason: collision with root package name */
    public final se1.g f475851g;

    /* renamed from: h, reason: collision with root package name */
    public final se1.g f475852h;

    /* renamed from: i, reason: collision with root package name */
    public final re1.e f475853i;

    /* renamed from: j, reason: collision with root package name */
    public se1.g f475854j;

    /* renamed from: k, reason: collision with root package name */
    public android.net.Uri f475855k;

    /* renamed from: l, reason: collision with root package name */
    public int f475856l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f475857m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f475858n;

    /* renamed from: o, reason: collision with root package name */
    public long f475859o;

    /* renamed from: p, reason: collision with root package name */
    public long f475860p;

    /* renamed from: q, reason: collision with root package name */
    public int f475861q;

    /* renamed from: r, reason: collision with root package name */
    public re1.i f475862r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f475863s;

    /* renamed from: t, reason: collision with root package name */
    public long f475864t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f475865u;

    /* renamed from: a, reason: collision with root package name */
    public long f475845a = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f475866v = "";

    public f(re1.b bVar, se1.g gVar, se1.g gVar2, se1.f fVar, boolean z17, boolean z18, re1.e eVar) {
        this.f475849e = bVar;
        this.f475850f = gVar2;
        this.f475852h = gVar;
        if (fVar != null) {
            this.f475851g = new se1.i0(gVar, fVar);
        } else {
            this.f475851g = null;
        }
        this.f475853i = eVar;
    }

    @Override // se1.g
    public int a(byte[] bArr, int i17, int i18) {
        android.net.Uri uri;
        try {
            if (!this.f475865u && (this.f475854j instanceof se1.p) && qe1.a.a().f443550b) {
                java.lang.String f17 = f();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("read from cache ");
                se1.p pVar = (se1.p) this.f475854j;
                if (android.text.TextUtils.isEmpty(pVar.f488355c) && (uri = pVar.f488359g) != null) {
                    pVar.f488355c = uri.toString();
                }
                sb6.append(pVar.f488355c);
                sb6.append(", fileSize=");
                sb6.append(this.f475854j.mo162209xd4418ac9());
                ve1.g.p(4, f17, sb6.toString(), null);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int a17 = this.f475854j.a(bArr, i17, i18);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            boolean z17 = this.f475865u;
            se1.g gVar = this.f475850f;
            if (!z17) {
                if (this.f475854j != gVar && qe1.a.a().f443562n != null && this.f475861q == 90 && android.webkit.URLUtil.isNetworkUrl(this.f475855k.toString()) && this.f475853i != null) {
                    java.lang.String str = this.f475857m;
                    long j17 = this.f475845a;
                    ve1.g.p(3, "DataSourceBuilder", java.lang.String.format("onHttpUpstreamServerCost, videoUuid:%s, httpDnsCost:%s, httpConnectCost:%s, httpFirstRecvCost:%s", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis2)), null);
                    if (qe1.a.a().f443562n != null) {
                        qe1.a.a().f443562n.getClass();
                    }
                }
                this.f475865u = true;
            }
            if (a17 >= 0) {
                if (this.f475854j == gVar) {
                    this.f475864t += a17;
                } else {
                    this.f475846b += a17;
                    this.f475847c += currentTimeMillis2;
                }
                long j18 = a17;
                this.f475859o += j18;
                long j19 = this.f475860p;
                if (j19 != -1) {
                    this.f475860p = j19 - j18;
                }
            } else {
                i();
                e();
                if (this.f475860p > 0) {
                    j();
                    return a(bArr, i17, i18);
                }
            }
            return a17;
        } catch (java.io.IOException e17) {
            if (this.f475854j instanceof se1.p) {
                ve1.g.p(6, f(), "read cache error " + e17.toString(), null);
            } else {
                ve1.g.p(6, f(), "read error " + e17.toString(), null);
            }
            h(e17);
            throw e17;
        }
    }

    @Override // se1.g
    /* renamed from: available */
    public long mo162209xd4418ac9() {
        se1.g gVar = this.f475854j;
        if (gVar == null) {
            return 0L;
        }
        return gVar.mo162209xd4418ac9();
    }

    @Override // se1.g
    public te1.b b() {
        re1.b bVar;
        te1.b bVar2;
        re1.i iVar;
        se1.g gVar = this.f475854j;
        if (gVar == null) {
            return te1.b.f499301c;
        }
        if (gVar != this.f475850f || (bVar = this.f475849e) == null) {
            return gVar.b();
        }
        java.lang.String str = this.f475858n;
        re1.m mVar = (re1.m) bVar;
        synchronized (mVar) {
            java.util.NavigableSet c17 = mVar.c(str);
            bVar2 = (c17 == null || (iVar = (re1.i) c17.first()) == null || iVar.f475871g < 0) ? te1.b.f499301c : iVar.f475872h;
        }
        return bVar2;
    }

    @Override // se1.g
    public long c(se1.i iVar) {
        try {
            this.f475855k = iVar.f488305a;
            this.f475856l = iVar.f488310f;
            this.f475857m = iVar.f488311g;
            this.f475858n = iVar.f488309e;
            this.f475859o = iVar.f488307c;
            this.f475860p = iVar.f488308d;
            this.f475861q = iVar.f488312h;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = j();
            this.f475848d = d();
            this.f475845a = java.lang.System.currentTimeMillis() - currentTimeMillis;
            return j17;
        } catch (java.io.IOException e17) {
            if (this.f475854j instanceof se1.p) {
                ve1.g.p(6, f(), "open cache error " + e17.toString(), null);
            } else {
                ve1.g.p(6, f(), "open error " + e17.toString(), null);
            }
            h(e17);
            if (!this.f475863s) {
                throw e17;
            }
            try {
                e();
            } catch (java.lang.Exception e18) {
                ve1.g.p(5, f(), "open, failed on closeCurrentSource, shouldn't be a problem", e18);
            }
            ve1.g.p(6, f(), "open cache error, try reopen without cache", null);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long j18 = j();
            this.f475848d = d();
            this.f475845a = java.lang.System.currentTimeMillis() - currentTimeMillis2;
            return j18;
        }
    }

    @Override // se1.g
    /* renamed from: close */
    public void mo162210x5a5ddf8() {
        try {
            e();
        } catch (java.io.IOException e17) {
            if (this.f475854j instanceof se1.p) {
                ve1.g.p(6, f(), "close cache error " + e17.toString(), null);
            } else {
                ve1.g.p(6, f(), "close error " + e17.toString(), null);
            }
            h(e17);
            throw e17;
        }
    }

    @Override // se1.g
    public long d() {
        re1.b bVar;
        re1.i iVar;
        se1.g gVar = this.f475854j;
        if (gVar == null) {
            return -1L;
        }
        if (gVar != this.f475850f || (bVar = this.f475849e) == null) {
            return gVar.d();
        }
        java.lang.String str = this.f475858n;
        re1.m mVar = (re1.m) bVar;
        synchronized (mVar) {
            java.util.NavigableSet c17 = mVar.c(str);
            if (c17 != null && (iVar = (re1.i) c17.first()) != null) {
                long j17 = iVar.f475871g;
                if (j17 >= 0) {
                    return j17;
                }
            }
            return -1L;
        }
    }

    public final void e() {
        re1.b bVar = this.f475849e;
        se1.g gVar = this.f475854j;
        if (gVar == null) {
            return;
        }
        boolean z17 = true;
        try {
            gVar.mo162210x5a5ddf8();
            this.f475854j = null;
            re1.i iVar = this.f475862r;
            if (iVar != null) {
                re1.m mVar = (re1.m) bVar;
                synchronized (mVar) {
                    if (iVar != mVar.f475884d.remove(iVar.f475868d)) {
                        z17 = false;
                    }
                    ve1.a.a(z17);
                    mVar.notifyAll();
                }
                this.f475862r = null;
            }
        } catch (java.lang.Throwable th6) {
            re1.i iVar2 = this.f475862r;
            if (iVar2 != null) {
                re1.m mVar2 = (re1.m) bVar;
                synchronized (mVar2) {
                    if (iVar2 != mVar2.f475884d.remove(iVar2.f475868d)) {
                        z17 = false;
                    }
                    ve1.a.a(z17);
                    mVar2.notifyAll();
                    this.f475862r = null;
                }
            }
            throw th6;
        }
    }

    public java.lang.String f() {
        return this.f475866v + "CacheDataSource";
    }

    public se1.g g() {
        return this.f475852h;
    }

    public final void h(java.io.IOException iOException) {
        ve1.g.p(3, f(), "handleBeforeThrow " + iOException + ", ignoreCacheOnError=true, currentDataSource=" + this.f475854j, null);
        if (this.f475854j == this.f475850f) {
            ve1.g.p(4, f(), "handleBeforeThrow currentDataSource=" + this.f475854j + ", exception=" + iOException, null);
            this.f475863s = true;
        }
    }

    public final void i() {
        long j17;
        re1.e eVar = this.f475853i;
        if (eVar != null) {
            if (this.f475861q == 90) {
                java.lang.String str = this.f475857m;
                int i17 = this.f475846b;
                long j18 = this.f475847c;
                long j19 = this.f475848d;
                long j27 = this.f475864t;
                ((se1.k) eVar).getClass();
                ve1.g.p(3, "DataSourceBuilder", java.lang.String.format("downloadSizeAndDuration, uuid:%s, totalUpstreamBytesRead:%s, totalUpstreamReadCost:%s, totalLength:%s, totalCachedBytesRead:%s", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27)), null);
                if (qe1.a.a().f443562n != null) {
                    qe1.a.a().f443562n.getClass();
                }
            }
            this.f475846b = 0;
            this.f475847c = 0L;
            if (this.f475854j != this.f475850f || this.f475864t <= 0) {
                return;
            }
            re1.e eVar2 = this.f475853i;
            re1.m mVar = (re1.m) this.f475849e;
            synchronized (mVar) {
                j17 = mVar.f475881a;
            }
            long j28 = this.f475864t;
            ((se1.k) eVar2).getClass();
            ve1.g.p(3, "DataSourceBuilder", java.lang.String.format("onCachedBytesRead, cacheSizeBytes:%s, cachedBytesRead:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j28)), null);
            this.f475864t = 0L;
        }
    }

    public final long j() {
        re1.i d17;
        se1.i iVar;
        try {
            if (this.f475863s) {
                d17 = null;
            } else {
                re1.b bVar = this.f475849e;
                java.lang.String str = this.f475858n;
                long j17 = this.f475859o;
                re1.m mVar = (re1.m) bVar;
                synchronized (mVar) {
                    try {
                        re1.i iVar2 = new re1.i(str, j17, -1L, -1L, te1.b.f499301c, false, -1L, null);
                        synchronized (mVar) {
                            d17 = mVar.d(iVar2);
                            if (!d17.f475873i) {
                                if (mVar.f475884d.containsKey(str)) {
                                    d17 = null;
                                } else {
                                    mVar.f475884d.put(str, d17);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            if (d17 == null) {
                this.f475854j = this.f475852h;
                android.net.Uri uri = this.f475855k;
                long j18 = this.f475859o;
                iVar = new se1.i(uri, j18, j18, this.f475860p, this.f475858n, this.f475856l, this.f475857m, this.f475861q);
            } else if (d17.f475873i) {
                android.net.Uri b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, d17.f475874m);
                long j19 = this.f475859o;
                long j27 = j19 - d17.f475869e;
                long j28 = this.f475860p;
                if (j28 == -1) {
                    this.f475860p = d17.f475871g - j19;
                } else if (j28 > d17.f475871g - j19) {
                    ve1.g.p(5, f(), "fix bytesRemaining, max=" + (d17.f475871g - this.f475859o) + " current=" + this.f475860p, null);
                    this.f475860p = d17.f475871g - this.f475859o;
                }
                iVar = new se1.i(b17, this.f475859o, j27, java.lang.Math.min(d17.f475870f - j27, this.f475860p), this.f475858n, this.f475856l, this.f475857m, this.f475861q);
                this.f475854j = this.f475850f;
            } else {
                this.f475862r = d17;
                long j29 = d17.f475870f;
                if (j29 == -1) {
                    j29 = this.f475860p;
                } else {
                    long j37 = this.f475860p;
                    if (j37 != -1) {
                        j29 = java.lang.Math.min(j29, j37);
                    }
                }
                long j38 = j29;
                android.net.Uri uri2 = this.f475855k;
                long j39 = this.f475859o;
                iVar = new se1.i(uri2, j39, j39, j38, this.f475858n, this.f475856l, this.f475857m, this.f475861q);
                se1.g gVar = this.f475851g;
                if (gVar == null) {
                    gVar = this.f475852h;
                }
                this.f475854j = gVar;
            }
            long c17 = this.f475854j.c(iVar);
            se1.g gVar2 = this.f475854j;
            if ((gVar2 instanceof se1.y) && gVar2.d() != -1 && iVar.f488307c >= this.f475854j.d() - 1) {
                ve1.g.p(6, f(), "read position out of bound", null);
            }
            if (this.f475860p == -1 && this.f475854j.d() != -1) {
                this.f475860p = this.f475854j.d() - this.f475859o;
                ve1.g.p(4, f(), "init bytesRemaining " + this.f475860p + ", readPosition=" + this.f475859o + ", totalLength=" + this.f475854j.d(), null);
            }
            this.f475860p = java.lang.Math.max(0L, java.lang.Math.min(this.f475860p, d()));
            this.f475865u = false;
            return c17;
        } catch (java.lang.InterruptedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
