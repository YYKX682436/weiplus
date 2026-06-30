package i16;

/* loaded from: classes16.dex */
public final class z extends p16.v implements p16.i0 {

    /* renamed from: o, reason: collision with root package name */
    public static final i16.z f369364o;

    /* renamed from: p, reason: collision with root package name */
    public static final p16.j0 f369365p = new i16.v();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f369366d;

    /* renamed from: e, reason: collision with root package name */
    public int f369367e;

    /* renamed from: f, reason: collision with root package name */
    public i16.x f369368f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f369369g;

    /* renamed from: h, reason: collision with root package name */
    public i16.g0 f369370h;

    /* renamed from: i, reason: collision with root package name */
    public i16.y f369371i;

    /* renamed from: m, reason: collision with root package name */
    public byte f369372m;

    /* renamed from: n, reason: collision with root package name */
    public int f369373n;

    static {
        i16.z zVar = new i16.z(true);
        f369364o = zVar;
        zVar.f369368f = i16.x.RETURNS_CONSTANT;
        zVar.f369369g = java.util.Collections.emptyList();
        zVar.f369370h = i16.g0.f368984r;
        zVar.f369371i = i16.y.AT_MOST_ONCE;
    }

    public z(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f369372m = (byte) -1;
        this.f369373n = -1;
        this.f369366d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        if ((this.f369367e & 1) == 1) {
            jVar.l(1, this.f369368f.f369335d);
        }
        for (int i17 = 0; i17 < this.f369369g.size(); i17++) {
            jVar.o(2, (p16.h0) this.f369369g.get(i17));
        }
        if ((this.f369367e & 2) == 2) {
            jVar.o(3, this.f369370h);
        }
        if ((this.f369367e & 4) == 4) {
            jVar.l(4, this.f369371i.f369347d);
        }
        jVar.r(this.f369366d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369373n;
        if (i17 != -1) {
            return i17;
        }
        int a17 = (this.f369367e & 1) == 1 ? p16.j.a(1, this.f369368f.f369335d) + 0 : 0;
        for (int i18 = 0; i18 < this.f369369g.size(); i18++) {
            a17 += p16.j.d(2, (p16.h0) this.f369369g.get(i18));
        }
        if ((this.f369367e & 2) == 2) {
            a17 += p16.j.d(3, this.f369370h);
        }
        if ((this.f369367e & 4) == 4) {
            a17 += p16.j.a(4, this.f369371i.f369347d);
        }
        int mo157707x35e001 = a17 + this.f369366d.mo157707x35e001();
        this.f369373n = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369372m;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f369369g.size(); i17++) {
            if (!((i16.g0) this.f369369g.get(i17)).mo134563xf582434a()) {
                this.f369372m = (byte) 0;
                return false;
            }
        }
        if (!((this.f369367e & 2) == 2) || this.f369370h.mo134563xf582434a()) {
            this.f369372m = (byte) 1;
            return true;
        }
        this.f369372m = (byte) 0;
        return false;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.w();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.w wVar = new i16.w();
        wVar.d(this);
        return wVar;
    }

    public z(boolean z17) {
        this.f369372m = (byte) -1;
        this.f369373n = -1;
        this.f369366d = p16.g.f432816d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    public z(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369372m = (byte) -1;
        this.f369373n = -1;
        i16.x xVar = i16.x.RETURNS_CONSTANT;
        this.f369368f = xVar;
        this.f369369g = java.util.Collections.emptyList();
        this.f369370h = i16.g0.f368984r;
        i16.y yVar = i16.y.AT_MOST_ONCE;
        this.f369371i = yVar;
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        boolean z17 = false;
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        i16.y yVar2 = null;
                        i16.x xVar2 = null;
                        i16.e0 e0Var = null;
                        if (n17 == 8) {
                            int k17 = hVar.k();
                            if (k17 == 0) {
                                xVar2 = xVar;
                            } else if (k17 == 1) {
                                xVar2 = i16.x.CALLS;
                            } else if (k17 == 2) {
                                xVar2 = i16.x.RETURNS_NOT_NULL;
                            }
                            if (xVar2 == null) {
                                j17.v(n17);
                                j17.v(k17);
                            } else {
                                this.f369367e |= 1;
                                this.f369368f = xVar2;
                            }
                        } else if (n17 == 18) {
                            int i17 = (c17 == true ? 1 : 0) & 2;
                            c17 = c17;
                            if (i17 != 2) {
                                this.f369369g = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 2;
                            }
                            this.f369369g.add(hVar.g(i16.g0.f368985s, lVar));
                        } else if (n17 == 26) {
                            if ((this.f369367e & 2) == 2) {
                                i16.g0 g0Var = this.f369370h;
                                g0Var.getClass();
                                e0Var = new i16.e0();
                                e0Var.d(g0Var);
                            }
                            i16.g0 g0Var2 = (i16.g0) hVar.g(i16.g0.f368985s, lVar);
                            this.f369370h = g0Var2;
                            if (e0Var != null) {
                                e0Var.d(g0Var2);
                                this.f369370h = e0Var.c();
                            }
                            this.f369367e |= 2;
                        } else if (n17 != 32) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            int k18 = hVar.k();
                            if (k18 == 0) {
                                yVar2 = yVar;
                            } else if (k18 == 1) {
                                yVar2 = i16.y.EXACTLY_ONCE;
                            } else if (k18 == 2) {
                                yVar2 = i16.y.AT_LEAST_ONCE;
                            }
                            if (yVar2 == null) {
                                j17.v(n17);
                                j17.v(k18);
                            } else {
                                this.f369367e |= 4;
                                this.f369371i = yVar2;
                            }
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    if (((c17 == true ? 1 : 0) & 2) == 2) {
                        this.f369369g = java.util.Collections.unmodifiableList(this.f369369g);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        throw th6;
                    } finally {
                    }
                }
            } catch (p16.z e17) {
                e17.f432904d = this;
                throw e17;
            } catch (java.io.IOException e18) {
                p16.z zVar = new p16.z(e18.getMessage());
                zVar.f432904d = this;
                throw zVar;
            }
        }
        if (((c17 == true ? 1 : 0) & 2) == 2) {
            this.f369369g = java.util.Collections.unmodifiableList(this.f369369g);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
