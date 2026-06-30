package l16;

/* loaded from: classes16.dex */
public final class p extends p16.v implements p16.i0 {

    /* renamed from: s, reason: collision with root package name */
    public static final l16.p f396603s;

    /* renamed from: t, reason: collision with root package name */
    public static final p16.j0 f396604t = new l16.m();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f396605d;

    /* renamed from: e, reason: collision with root package name */
    public int f396606e;

    /* renamed from: f, reason: collision with root package name */
    public int f396607f;

    /* renamed from: g, reason: collision with root package name */
    public int f396608g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f396609h;

    /* renamed from: i, reason: collision with root package name */
    public l16.o f396610i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f396611m;

    /* renamed from: n, reason: collision with root package name */
    public int f396612n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f396613o;

    /* renamed from: p, reason: collision with root package name */
    public int f396614p;

    /* renamed from: q, reason: collision with root package name */
    public byte f396615q;

    /* renamed from: r, reason: collision with root package name */
    public int f396616r;

    static {
        l16.p pVar = new l16.p(true);
        f396603s = pVar;
        pVar.f396607f = 1;
        pVar.f396608g = 0;
        pVar.f396609h = "";
        pVar.f396610i = l16.o.NONE;
        pVar.f396611m = java.util.Collections.emptyList();
        pVar.f396613o = java.util.Collections.emptyList();
    }

    public p(p16.p pVar, l16.a aVar) {
        super(pVar);
        this.f396612n = -1;
        this.f396614p = -1;
        this.f396615q = (byte) -1;
        this.f396616r = -1;
        this.f396605d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        p16.g gVar;
        mo134562x9d9c349b();
        if ((this.f396606e & 1) == 1) {
            jVar.m(1, this.f396607f);
        }
        if ((this.f396606e & 2) == 2) {
            jVar.m(2, this.f396608g);
        }
        if ((this.f396606e & 8) == 8) {
            jVar.l(3, this.f396610i.f396602d);
        }
        if (this.f396611m.size() > 0) {
            jVar.v(34);
            jVar.v(this.f396612n);
        }
        for (int i17 = 0; i17 < this.f396611m.size(); i17++) {
            jVar.n(((java.lang.Integer) this.f396611m.get(i17)).intValue());
        }
        if (this.f396613o.size() > 0) {
            jVar.v(42);
            jVar.v(this.f396614p);
        }
        for (int i18 = 0; i18 < this.f396613o.size(); i18++) {
            jVar.n(((java.lang.Integer) this.f396613o.get(i18)).intValue());
        }
        if ((this.f396606e & 4) == 4) {
            java.lang.Object obj = this.f396609h;
            if (obj instanceof java.lang.String) {
                try {
                    gVar = new p16.f0(((java.lang.String) obj).getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                    this.f396609h = gVar;
                } catch (java.io.UnsupportedEncodingException e17) {
                    throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
                }
            } else {
                gVar = (p16.g) obj;
            }
            jVar.x(6, 2);
            jVar.v(gVar.mo157707x35e001());
            jVar.r(gVar);
        }
        jVar.r(this.f396605d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        p16.g gVar;
        int i17 = this.f396616r;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f396606e & 1) == 1 ? p16.j.b(1, this.f396607f) + 0 : 0;
        if ((this.f396606e & 2) == 2) {
            b17 += p16.j.b(2, this.f396608g);
        }
        if ((this.f396606e & 8) == 8) {
            b17 += p16.j.a(3, this.f396610i.f396602d);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f396611m.size(); i19++) {
            i18 += p16.j.c(((java.lang.Integer) this.f396611m.get(i19)).intValue());
        }
        int i27 = b17 + i18;
        if (!this.f396611m.isEmpty()) {
            i27 = i27 + 1 + p16.j.c(i18);
        }
        this.f396612n = i18;
        int i28 = 0;
        for (int i29 = 0; i29 < this.f396613o.size(); i29++) {
            i28 += p16.j.c(((java.lang.Integer) this.f396613o.get(i29)).intValue());
        }
        int i37 = i27 + i28;
        if (!this.f396613o.isEmpty()) {
            i37 = i37 + 1 + p16.j.c(i28);
        }
        this.f396614p = i28;
        if ((this.f396606e & 4) == 4) {
            java.lang.Object obj = this.f396609h;
            if (obj instanceof java.lang.String) {
                try {
                    gVar = new p16.f0(((java.lang.String) obj).getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                    this.f396609h = gVar;
                } catch (java.io.UnsupportedEncodingException e17) {
                    throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
                }
            } else {
                gVar = (p16.g) obj;
            }
            i37 += p16.j.h(6) + p16.j.f(gVar.mo157707x35e001()) + gVar.mo157707x35e001();
        }
        int mo157707x35e001 = i37 + this.f396605d.mo157707x35e001();
        this.f396616r = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f396615q;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f396615q = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new l16.n();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        l16.n nVar = new l16.n();
        nVar.d(this);
        return nVar;
    }

    public p(boolean z17) {
        this.f396612n = -1;
        this.f396614p = -1;
        this.f396615q = (byte) -1;
        this.f396616r = -1;
        this.f396605d = p16.g.f432816d;
    }

    public p(p16.h hVar, p16.l lVar, l16.a aVar) {
        l16.o oVar;
        this.f396612n = -1;
        this.f396614p = -1;
        this.f396615q = (byte) -1;
        this.f396616r = -1;
        this.f396607f = 1;
        boolean z17 = false;
        this.f396608g = 0;
        this.f396609h = "";
        l16.o oVar2 = l16.o.NONE;
        this.f396610i = oVar2;
        this.f396611m = java.util.Collections.emptyList();
        this.f396613o = java.util.Collections.emptyList();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f396606e |= 1;
                            this.f396607f = hVar.k();
                        } else if (n17 == 16) {
                            this.f396606e |= 2;
                            this.f396608g = hVar.k();
                        } else if (n17 == 24) {
                            int k17 = hVar.k();
                            if (k17 == 0) {
                                oVar = oVar2;
                            } else if (k17 != 1) {
                                oVar = k17 != 2 ? null : l16.o.DESC_TO_CLASS_ID;
                            } else {
                                oVar = l16.o.INTERNAL_TO_CLASS_ID;
                            }
                            if (oVar == null) {
                                j17.v(n17);
                                j17.v(k17);
                            } else {
                                this.f396606e |= 8;
                                this.f396610i = oVar;
                            }
                        } else if (n17 == 32) {
                            if ((i17 & 16) != 16) {
                                this.f396611m = new java.util.ArrayList();
                                i17 |= 16;
                            }
                            this.f396611m.add(java.lang.Integer.valueOf(hVar.k()));
                        } else if (n17 == 34) {
                            int d17 = hVar.d(hVar.k());
                            if ((i17 & 16) != 16 && hVar.b() > 0) {
                                this.f396611m = new java.util.ArrayList();
                                i17 |= 16;
                            }
                            while (hVar.b() > 0) {
                                this.f396611m.add(java.lang.Integer.valueOf(hVar.k()));
                            }
                            hVar.c(d17);
                        } else if (n17 == 40) {
                            if ((i17 & 32) != 32) {
                                this.f396613o = new java.util.ArrayList();
                                i17 |= 32;
                            }
                            this.f396613o.add(java.lang.Integer.valueOf(hVar.k()));
                        } else if (n17 == 42) {
                            int d18 = hVar.d(hVar.k());
                            if ((i17 & 32) != 32 && hVar.b() > 0) {
                                this.f396613o = new java.util.ArrayList();
                                i17 |= 32;
                            }
                            while (hVar.b() > 0) {
                                this.f396613o.add(java.lang.Integer.valueOf(hVar.k()));
                            }
                            hVar.c(d18);
                        } else if (n17 != 50) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            p16.g e17 = hVar.e();
                            this.f396606e |= 4;
                            this.f396609h = e17;
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    if ((i17 & 16) == 16) {
                        this.f396611m = java.util.Collections.unmodifiableList(this.f396611m);
                    }
                    if ((i17 & 32) == 32) {
                        this.f396613o = java.util.Collections.unmodifiableList(this.f396613o);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        throw th6;
                    } finally {
                    }
                }
            } catch (p16.z e18) {
                e18.f432904d = this;
                throw e18;
            } catch (java.io.IOException e19) {
                p16.z zVar = new p16.z(e19.getMessage());
                zVar.f432904d = this;
                throw zVar;
            }
        }
        if ((i17 & 16) == 16) {
            this.f396611m = java.util.Collections.unmodifiableList(this.f396611m);
        }
        if ((i17 & 32) == 32) {
            this.f396613o = java.util.Collections.unmodifiableList(this.f396613o);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
