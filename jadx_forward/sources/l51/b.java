package l51;

/* loaded from: classes12.dex */
public class b implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11053x70861a25 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f398078d;

    /* renamed from: e, reason: collision with root package name */
    public final int f398079e;

    /* renamed from: f, reason: collision with root package name */
    public final int f398080f;

    /* renamed from: g, reason: collision with root package name */
    public int f398081g;

    /* renamed from: h, reason: collision with root package name */
    public int f398082h;

    /* renamed from: i, reason: collision with root package name */
    public int f398083i;

    /* renamed from: m, reason: collision with root package name */
    public int f398084m;

    /* renamed from: n, reason: collision with root package name */
    public int f398085n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f398086o;

    /* renamed from: p, reason: collision with root package name */
    public final h51.h f398087p;

    /* renamed from: q, reason: collision with root package name */
    public final int f398088q;

    /* renamed from: r, reason: collision with root package name */
    public final int f398089r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f398090s;

    /* renamed from: t, reason: collision with root package name */
    public final l51.a f398091t;

    public b(java.lang.String str, int i17, int i18, h51.h hVar, l51.a aVar, int i19) {
        int i27 = 1024 > i18 ? i18 : 1024;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f398078d = arrayList;
        this.f398090s = new java.util.HashMap();
        this.f398079e = i27;
        if (i18 < 0) {
            throw new java.lang.IllegalStateException("Maximal size of the byte array stream should be >0");
        }
        if (i27 < 0) {
            throw new java.lang.IllegalStateException("Initial size of the byte array stream should be >0");
        }
        this.f398080f = i18;
        b();
        b();
        arrayList.add(new byte[0]);
        this.f398083i = 0;
        this.f398081g = 0;
        this.f398082h = 0;
        this.f398084m = i18;
        int i28 = h51.g.f360560a;
        this.f398088q = i17;
        try {
            this.f398087p = hVar;
        } catch (java.lang.Exception unused) {
        }
        this.f398091t = aVar;
        this.f398089r = i19;
    }

    public final void a(int i17) {
        int i18 = this.f398083i;
        java.util.List list = this.f398078d;
        if (i18 == -1 || (i18 == ((java.util.ArrayList) list).size() - 1 && this.f398084m == this.f398082h)) {
            this.f398082h = 0;
            this.f398083i++;
        }
        int i19 = this.f398084m;
        int i27 = this.f398080f;
        if (i19 >= i27) {
            throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + i27 + ")");
        }
        int i28 = ((java.util.ArrayList) list).size() + (-1) == -1 ? this.f398079e : this.f398084m << 1;
        if (i28 < 0 || i28 > 10485760) {
            i28 = 10485760;
        }
        int i29 = this.f398084m;
        if (i29 + i28 > i27) {
            i28 = i27 - i29;
        }
        if (i17 == -1 || i28 >= i17) {
            i17 = i28;
        } else if (i29 + i17 >= i27) {
            throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + i27 + ")");
        }
        ((java.util.ArrayList) list).add(new byte[i17]);
    }

    public final void b() {
        this.f398078d.clear();
        this.f398081g = 0;
        this.f398082h = 0;
        this.f398083i = -1;
        this.f398084m = 0;
        this.f398085n = -1;
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ByteArrayStreamTest", "init , fileName = " + this.f398086o);
    }

    public final void c() {
        int i17 = this.f398085n;
        if (i17 == -1) {
            return;
        }
        if (this.f398081g == i17) {
            this.f398085n = -1;
            return;
        }
        if (i17 > this.f398084m) {
            i(i17, true);
            this.f398085n = -1;
            return;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f398078d;
            if (i18 >= ((java.util.ArrayList) list).size()) {
                this.f398083i = ((java.util.ArrayList) list).size() - 1;
                int i27 = this.f398084m;
                this.f398082h = i27;
                this.f398081g = i27;
                this.f398085n = -1;
                return;
            }
            int i28 = this.f398084m;
            i19 += i28;
            int i29 = this.f398085n;
            if (i19 > i29) {
                this.f398083i = i18;
                this.f398082h = i28 - (i19 - i29);
                this.f398081g = i29;
                this.f398085n = -1;
                return;
            }
            i18++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public synchronized void f(byte[] bArr, boolean z17) {
        b();
        int length = bArr.length;
        if (z17) {
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
            bArr = bArr2;
        }
        ((java.util.ArrayList) this.f398078d).add(bArr);
        this.f398083i = 0;
        this.f398081g = 0;
        this.f398082h = 0;
        this.f398084m = length;
    }

    public final synchronized void i(long j17, boolean z17) {
        if (j17 == 0) {
            synchronized (this) {
                b();
            }
            return;
        }
        if (j17 > this.f398080f) {
            throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached by setSize(" + j17 + "). Maximal size is " + this.f398080f + " bytes");
        }
        int i17 = this.f398084m;
        if (j17 > i17) {
            if (i17 == 0) {
                int i18 = (int) j17;
                ((java.util.ArrayList) this.f398078d).add(new byte[i18]);
                this.f398083i = 0;
                this.f398084m = i18;
            }
            int i19 = this.f398084m;
            int i27 = (int) (j17 - i19);
            if (i19 < i27) {
                this.f398084m = i19 + i19;
                int i28 = i27 - i19;
                a(i28);
                if (z17) {
                    this.f398082h = i28;
                }
            } else if (z17) {
                this.f398082h = (i19 - i19) + i27;
            }
            if (z17) {
                this.f398083i = ((java.util.ArrayList) this.f398078d).size() - 1;
                this.f398081g = (int) j17;
            }
            this.f398084m = (int) j17;
        }
        if (j17 < this.f398084m) {
            int i29 = 0;
            for (int i37 = 0; i37 < ((java.util.ArrayList) this.f398078d).size(); i37++) {
                i29 += this.f398084m;
                if (i29 >= j17) {
                    for (int size = ((java.util.ArrayList) this.f398078d).size() - 1; size > i37; size--) {
                        ((java.util.ArrayList) this.f398078d).remove(size);
                    }
                    int i38 = this.f398085n;
                    if (i38 != -1 && i38 > j17) {
                        this.f398085n = (int) j17;
                    } else if (this.f398081g > j17) {
                        int i39 = (int) j17;
                        this.f398081g = i39;
                        this.f398082h = (i39 - i29) + this.f398084m;
                        this.f398083i = i37;
                    }
                    this.f398084m = (int) j17;
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11059x8bb0b4d
    /* renamed from: read */
    public int mo47634x355996(byte[] bArr) {
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (bArr.length >= 0 + length) {
                    if (this.f398085n > this.f398084m) {
                        return 0;
                    }
                    c();
                    int i17 = this.f398081g;
                    int i18 = i17 + length;
                    int i19 = this.f398084m;
                    if (i18 > i19) {
                        length = i19 - i17;
                    }
                    try {
                        this.f398087p.a(this.f398088q + i17, length);
                        if (length > 0) {
                            int i27 = this.f398084m;
                            int i28 = i27 - this.f398082h;
                            if (length <= i28) {
                                i28 = length;
                            }
                            try {
                                h51.h hVar = this.f398087p;
                                hVar.getClass();
                                hVar.read(bArr, 0, bArr.length);
                            } catch (java.io.IOException e17) {
                                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("ByteArrayStreamTestDiff", "IOException， read1 = " + e17);
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("ByteArrayStreamTestDiff", "Exception， read1 = " + e18);
                            }
                            int i29 = this.f398082h + i28;
                            this.f398082h = i29;
                            if (i29 >= i27 && this.f398083i < ((java.util.ArrayList) this.f398078d).size() - 1) {
                                this.f398083i++;
                                this.f398082h = 0;
                            }
                        }
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("ByteArrayStreamTestDiff", "read = " + e19);
                    }
                    this.f398081g += length;
                    if (this.f398090s.get(this.f398086o) != null) {
                        java.util.HashMap hashMap = this.f398090s;
                        java.lang.String str = this.f398086o;
                        hashMap.put(str, java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(str)).intValue() + 1));
                    } else {
                        this.f398090s.put(this.f398086o, 1);
                    }
                    if (length == 0) {
                        f(new byte[0], false);
                        this.f398090s.remove(this.f398086o);
                        l51.a aVar = this.f398091t;
                        if (aVar != null) {
                            ((l51.h) aVar).b(this.f398089r, this.f398086o);
                        }
                    }
                    return length;
                }
            }
            throw new java.lang.IllegalStateException("Invalid start position (0) and length (" + length + ")");
        }
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11058xd0ed169b
    /* renamed from: seek */
    public synchronized long mo47633x35ce78(long j17, int i17) {
        int i18;
        try {
            if (i17 != 0) {
                if (i17 == 1) {
                    i18 = this.f398085n;
                    if (i18 == -1) {
                        i18 = this.f398081g;
                    }
                } else {
                    if (i17 != 2) {
                        throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Seek: unknown origin: " + i17);
                    }
                    i18 = this.f398084m;
                }
                j17 += i18;
            }
            if (j17 > this.f398080f) {
                throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached by seek to " + j17 + ", maximal size is " + this.f398080f + " bytes");
            }
            this.f398085n = (int) j17;
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
        return j17;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11053x70861a25
    /* renamed from: setSize */
    public synchronized void mo47628x76500f83(long j17) {
        i(j17, false);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26
    /* renamed from: write */
    public int mo47635x6c257df(byte[] bArr) {
        return bArr.length;
    }
}
