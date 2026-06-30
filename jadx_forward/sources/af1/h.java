package af1;

/* loaded from: classes15.dex */
public final class h implements m8.z, n8.n, u9.t, d9.h, d9.u, z8.f {

    /* renamed from: h, reason: collision with root package name */
    public static final java.text.NumberFormat f86004h;

    /* renamed from: d, reason: collision with root package name */
    public final q9.k f86005d;

    /* renamed from: e, reason: collision with root package name */
    public final m8.l0 f86006e = new m8.l0();

    /* renamed from: f, reason: collision with root package name */
    public final m8.k0 f86007f = new m8.k0();

    /* renamed from: g, reason: collision with root package name */
    public final long f86008g = android.os.SystemClock.elapsedRealtime();

    static {
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance(java.util.Locale.US);
        f86004h = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public h(q9.k kVar) {
        this.f86005d = kVar;
    }

    public static java.lang.String D(long j17) {
        if (j17 == -9223372036854775807L) {
            return "?";
        }
        return f86004h.format(((float) j17) / 1000.0f);
    }

    @Override // m8.z
    public void A() {
    }

    @Override // n8.n
    public void B(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.Exo.EventLogger", "audioFormatChanged [" + C() + ", " + com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.s(c1601x7dc4e417) + "]");
    }

    public final java.lang.String C() {
        return D(android.os.SystemClock.elapsedRealtime() - this.f86008g);
    }

    public final void E(java.lang.String str, java.lang.Exception exc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Video.Exo.EventLogger", exc, "internalError [" + C() + ", " + str + "]", new java.lang.Object[0]);
    }

    public final void F(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f c1603xe907df4f, java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry[] entryArr = c1603xe907df4f.f125637d;
            if (i17 >= entryArr.length) {
                return;
            }
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry entry = entryArr[i17];
            if (entry instanceof com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e) {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e c1613xb01630e = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e) entry;
                java.lang.String.format("%s: value=%s", c1613xb01630e.f125667d, c1613xb01630e.f125671f);
            } else if (entry instanceof com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104) {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104 c1614xf5104 = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104) entry;
                java.lang.String.format("%s: url=%s", c1614xf5104.f125667d, c1614xf5104.f125673f);
            } else if (entry instanceof com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1612x17828bde) {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1612x17828bde c1612x17828bde = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1612x17828bde) entry;
                java.lang.String.format("%s: owner=%s", c1612x17828bde.f125667d, c1612x17828bde.f125668e);
            } else if (entry instanceof com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1610xb5efd49c) {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1610xb5efd49c c1610xb5efd49c = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1610xb5efd49c) entry;
                java.lang.String.format("%s: mimeType=%s, filename=%s, description=%s", c1610xb5efd49c.f125667d, c1610xb5efd49c.f125663e, c1610xb5efd49c.f125664f, c1610xb5efd49c.f125665g);
            } else if (entry instanceof com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1605x77519d44) {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1605x77519d44 c1605x77519d44 = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1605x77519d44) entry;
                java.lang.String.format("%s: mimeType=%s, description=%s", c1605x77519d44.f125667d, c1605x77519d44.f125644e, c1605x77519d44.f125645f);
            } else if (entry instanceof com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1609x37d6426e) {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1609x37d6426e c1609x37d6426e = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1609x37d6426e) entry;
                java.lang.String.format("%s: language=%s, description=%s", c1609x37d6426e.f125667d, c1609x37d6426e.f125660e, c1609x37d6426e.f125661f);
            } else if (entry instanceof com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5) {
                java.lang.String.format("%s", ((com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5) entry).f125667d);
            } else if (entry instanceof com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p180x2f90fc.C1604x78d9382d) {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p180x2f90fc.C1604x78d9382d c1604x78d9382d = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p180x2f90fc.C1604x78d9382d) entry;
                java.lang.String.format("EMSG: scheme=%s, id=%d, value=%s", c1604x78d9382d.f125638d, java.lang.Long.valueOf(c1604x78d9382d.f125641g), c1604x78d9382d.f125639e);
            }
            i17++;
        }
    }

    @Override // d9.h
    public void a(int i17, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i18, java.lang.Object obj, long j17) {
    }

    @Override // m8.z
    public void b(boolean z17) {
    }

    @Override // n8.n
    public void c(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.Exo.EventLogger", "audioDecoderInitialized [" + C() + ", " + str + ", " + j18 + "]");
    }

    @Override // m8.z
    public void d(m8.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Video.Exo.EventLogger", eVar, "playerFailed [" + C() + "]", new java.lang.Object[0]);
    }

    @Override // m8.z
    public void e(d9.l0 l0Var, q9.n nVar) {
        int[][][] iArr;
        q9.j jVar = this.f86005d.f442399c;
        if (jVar == null) {
            return;
        }
        for (int i17 = 0; i17 < jVar.f442392a; i17++) {
            d9.l0[] l0VarArr = jVar.f442393b;
            d9.l0 l0Var2 = l0VarArr[i17];
            q9.m mVar = nVar.f442401b[i17];
            if (l0Var2.f308908a > 0) {
                int i18 = 0;
                while (i18 < l0Var2.f308908a) {
                    d9.k0 k0Var = l0Var2.f308909b[i18];
                    int i19 = k0Var.f308903a;
                    int i27 = l0VarArr[i17].f308909b[i18].f308903a;
                    int[] iArr2 = new int[i27];
                    int i28 = 0;
                    int i29 = 0;
                    while (true) {
                        iArr = jVar.f442395d;
                        if (i28 >= i27) {
                            break;
                        }
                        if ((iArr[i17][i18][i28] & 7) == 4) {
                            iArr2[i29] = i28;
                            i29++;
                        }
                        i28++;
                    }
                    int[] copyOf = java.util.Arrays.copyOf(iArr2, i29);
                    int i37 = 16;
                    java.lang.String str = null;
                    d9.l0 l0Var3 = l0Var2;
                    int i38 = 0;
                    boolean z17 = false;
                    int i39 = 0;
                    while (i38 < copyOf.length) {
                        int[] iArr3 = copyOf;
                        java.lang.String str2 = l0VarArr[i17].f308909b[i18].f308904b[copyOf[i38]].f125613i;
                        int i47 = i39 + 1;
                        if (i39 == 0) {
                            str = str2;
                        } else {
                            z17 |= !t9.d0.a(str, str2);
                        }
                        i37 = java.lang.Math.min(i37, iArr[i17][i18][i38] & 24);
                        i38++;
                        i39 = i47;
                        copyOf = iArr3;
                    }
                    if (z17) {
                        java.lang.Math.min(i37, jVar.f442394c[i17]);
                    }
                    for (int i48 = 0; i48 < k0Var.f308903a; i48++) {
                        if (mVar != null) {
                            q9.e eVar = (q9.e) mVar;
                            if (eVar.f442380a == k0Var) {
                                eVar.e(i48);
                            }
                        }
                        int i49 = iArr[i17][i18][i48];
                        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.s(k0Var.f308904b[i48]);
                    }
                    i18++;
                    l0Var2 = l0Var3;
                }
                if (mVar != null) {
                    int i57 = 0;
                    while (true) {
                        q9.e eVar2 = (q9.e) mVar;
                        if (i57 >= eVar2.f442382c.length) {
                            break;
                        }
                        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f c1603xe907df4f = eVar2.f442383d[i57].f125611g;
                        if (c1603xe907df4f != null) {
                            F(c1603xe907df4f, "      ");
                            break;
                        }
                        i57++;
                    }
                }
            }
        }
        d9.l0 l0Var4 = jVar.f442396e;
        if (l0Var4.f308908a > 0) {
            for (int i58 = 0; i58 < l0Var4.f308908a; i58++) {
                d9.k0 k0Var2 = l0Var4.f308909b[i58];
                for (int i59 = 0; i59 < k0Var2.f308903a; i59++) {
                    com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.s(k0Var2.f308904b[i59]);
                }
            }
        }
    }

    @Override // d9.h
    public void f(r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
    }

    @Override // u9.t
    public void g(int i17, long j17) {
        C();
    }

    @Override // u9.t
    public void h(int i17, int i18, int i19, float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.Exo.EventLogger", "videoSizeChanged [" + i17 + ", " + i18 + ", " + i19 + ", " + f17 + "]");
    }

    @Override // n8.n
    public void i(o8.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.Exo.EventLogger", "audioDisabled [" + C() + ", " + af1.z.c(fVar) + "]");
    }

    @Override // u9.t
    public void j(o8.f fVar) {
        C();
    }

    @Override // d9.h
    public void k() {
    }

    @Override // u9.t
    public void l(java.lang.String str, long j17, long j18) {
        C();
    }

    @Override // n8.n
    public void m(int i17) {
    }

    @Override // u9.t
    public void n(android.view.Surface surface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.Exo.EventLogger", "renderedFirstFrame [" + surface + "]");
    }

    @Override // n8.n
    public void o(o8.f fVar) {
        C();
    }

    @Override // d9.u
    /* renamed from: onLoadError */
    public void mo1838x4f8e79a3(java.io.IOException iOException) {
        E("loadError", iOException);
    }

    @Override // z8.f
    public void p(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f c1603xe907df4f) {
        F(c1603xe907df4f, "  ");
    }

    @Override // u9.t
    public void q(o8.f fVar) {
        C();
        af1.z.c(fVar);
    }

    @Override // d9.h
    public void r(r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28, java.io.IOException iOException, boolean z17) {
        E("loadError", iOException);
    }

    @Override // u9.t
    public void s(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.Exo.EventLogger", "videoFormatChanged [" + C() + ", " + com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.s(c1601x7dc4e417) + "]");
    }

    @Override // m8.z
    public void t(m8.m0 m0Var, java.lang.Object obj) {
        int e17 = m0Var.e();
        int i17 = m0Var.i();
        for (int i18 = 0; i18 < java.lang.Math.min(e17, 3); i18++) {
            m8.k0 k0Var = this.f86007f;
            m0Var.c(i18, k0Var);
            D(m8.b.b(k0Var.f406131d));
        }
        for (int i19 = 0; i19 < java.lang.Math.min(i17, 3); i19++) {
            m8.l0 l0Var = this.f86006e;
            m0Var.g(i19, l0Var);
            D(m8.b.b(l0Var.f406161f));
        }
    }

    @Override // m8.z
    public void u(m8.y yVar) {
        java.lang.String.format("[speed=%.2f, pitch=%.2f]", java.lang.Float.valueOf(yVar.f406212a), java.lang.Float.valueOf(yVar.f406213b));
    }

    @Override // d9.h
    public void v(r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
    }

    @Override // d9.h
    public void w(r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19) {
    }

    @Override // n8.n
    public void x(int i17, long j17, long j18) {
        E("audioTrackUnderrun [" + i17 + ", " + j17 + ", " + j18 + "]", null);
    }

    @Override // m8.z
    public void y(boolean z17, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state [");
        sb6.append(C());
        sb6.append(", ");
        sb6.append(z17);
        sb6.append(", ");
        sb6.append(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "?" : p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad : "R" : "B" : "I");
        sb6.append("]");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.Exo.EventLogger", sb6.toString());
    }

    @Override // m8.z
    public void z(int i17) {
    }
}
