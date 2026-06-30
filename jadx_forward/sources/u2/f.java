package u2;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: o, reason: collision with root package name */
    public static int f505357o = 1000;

    /* renamed from: b, reason: collision with root package name */
    public final u2.e f505359b;

    /* renamed from: e, reason: collision with root package name */
    public u2.b[] f505362e;

    /* renamed from: k, reason: collision with root package name */
    public final u2.c f505368k;

    /* renamed from: n, reason: collision with root package name */
    public final u2.e f505371n;

    /* renamed from: a, reason: collision with root package name */
    public int f505358a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f505360c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f505361d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f505363f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f505364g = new boolean[32];

    /* renamed from: h, reason: collision with root package name */
    public int f505365h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f505366i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f505367j = 32;

    /* renamed from: l, reason: collision with root package name */
    public u2.j[] f505369l = new u2.j[f505357o];

    /* renamed from: m, reason: collision with root package name */
    public int f505370m = 0;

    public f() {
        int i17 = 0;
        this.f505362e = null;
        this.f505362e = new u2.b[32];
        while (true) {
            u2.b[] bVarArr = this.f505362e;
            if (i17 >= bVarArr.length) {
                u2.c cVar = new u2.c();
                this.f505368k = cVar;
                this.f505359b = new u2.d(cVar);
                this.f505371n = new u2.b(cVar);
                return;
            }
            u2.b bVar = bVarArr[i17];
            if (bVar != null) {
                u2.h hVar = (u2.h) this.f505368k.f505354a;
                int i18 = hVar.f505373b;
                java.lang.Object[] objArr = hVar.f505372a;
                if (i18 < objArr.length) {
                    objArr[i18] = bVar;
                    hVar.f505373b = i18 + 1;
                }
            }
            bVarArr[i17] = null;
            i17++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final u2.j a(u2.i iVar, java.lang.String str) {
        u2.h hVar = (u2.h) this.f505368k.f505355b;
        int i17 = hVar.f505373b;
        u2.j jVar = null;
        if (i17 > 0) {
            int i18 = i17 - 1;
            ?? r37 = hVar.f505372a;
            ?? r47 = r37[i18];
            r37[i18] = 0;
            hVar.f505373b = i18;
            jVar = r47;
        }
        u2.j jVar2 = jVar;
        if (jVar2 == null) {
            jVar2 = new u2.j(iVar, str);
            jVar2.f505384f = iVar;
        } else {
            jVar2.c();
            jVar2.f505384f = iVar;
        }
        int i19 = this.f505370m;
        int i27 = f505357o;
        if (i19 >= i27) {
            int i28 = i27 * 2;
            f505357o = i28;
            this.f505369l = (u2.j[]) java.util.Arrays.copyOf(this.f505369l, i28);
        }
        u2.j[] jVarArr = this.f505369l;
        int i29 = this.f505370m;
        this.f505370m = i29 + 1;
        jVarArr[i29] = jVar2;
        return jVar2;
    }

    public void b(u2.j jVar, u2.j jVar2, int i17, float f17, u2.j jVar3, u2.j jVar4, int i18, int i19) {
        u2.b k17 = k();
        u2.a aVar = k17.f505352c;
        if (jVar2 == jVar3) {
            aVar.f(jVar, 1.0f);
            aVar.f(jVar4, 1.0f);
            aVar.f(jVar2, -2.0f);
        } else if (f17 == 0.5f) {
            aVar.f(jVar, 1.0f);
            aVar.f(jVar2, -1.0f);
            aVar.f(jVar3, -1.0f);
            aVar.f(jVar4, 1.0f);
            if (i17 > 0 || i18 > 0) {
                k17.f505351b = (-i17) + i18;
            }
        } else if (f17 <= 0.0f) {
            aVar.f(jVar, -1.0f);
            aVar.f(jVar2, 1.0f);
            k17.f505351b = i17;
        } else if (f17 >= 1.0f) {
            aVar.f(jVar3, -1.0f);
            aVar.f(jVar4, 1.0f);
            k17.f505351b = i18;
        } else {
            float f18 = 1.0f - f17;
            aVar.f(jVar, f18 * 1.0f);
            aVar.f(jVar2, f18 * (-1.0f));
            aVar.f(jVar3, (-1.0f) * f17);
            aVar.f(jVar4, 1.0f * f17);
            if (i17 > 0 || i18 > 0) {
                k17.f505351b = ((-i17) * f18) + (i18 * f17);
            }
        }
        if (i19 != 6) {
            k17.a(this, i19);
        }
        c(k17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r3.f505387i <= 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        if (r3.f505387i <= 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
    
        if (r3.f505387i <= 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e6, code lost:
    
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e4, code lost:
    
        if (r3.f505387i <= 1) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(u2.b r19) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.f.c(u2.b):void");
    }

    public u2.b d(u2.j jVar, u2.j jVar2, int i17, int i18) {
        u2.b k17 = k();
        boolean z17 = false;
        if (i17 != 0) {
            if (i17 < 0) {
                i17 *= -1;
                z17 = true;
            }
            k17.f505351b = i17;
        }
        u2.a aVar = k17.f505352c;
        if (z17) {
            aVar.f(jVar, 1.0f);
            aVar.f(jVar2, -1.0f);
        } else {
            aVar.f(jVar, -1.0f);
            aVar.f(jVar2, 1.0f);
        }
        if (i18 != 6) {
            k17.a(this, i18);
        }
        c(k17);
        return k17;
    }

    public void e(u2.j jVar, int i17) {
        int i18 = jVar.f505380b;
        if (i18 == -1) {
            u2.b k17 = k();
            k17.f505350a = jVar;
            float f17 = i17;
            jVar.f505382d = f17;
            k17.f505351b = f17;
            k17.f505353d = true;
            c(k17);
            return;
        }
        u2.b bVar = this.f505362e[i18];
        if (bVar.f505353d) {
            bVar.f505351b = i17;
            return;
        }
        if (bVar.f505352c.f505340a == 0) {
            bVar.f505353d = true;
            bVar.f505351b = i17;
            return;
        }
        u2.b k18 = k();
        u2.a aVar = k18.f505352c;
        if (i17 < 0) {
            k18.f505351b = i17 * (-1);
            aVar.f(jVar, 1.0f);
        } else {
            k18.f505351b = i17;
            aVar.f(jVar, -1.0f);
        }
        c(k18);
    }

    public void f(u2.j jVar, u2.j jVar2, int i17, int i18) {
        u2.b k17 = k();
        u2.j l17 = l();
        l17.f505381c = 0;
        k17.b(jVar, jVar2, l17, i17);
        if (i18 != 6) {
            k17.f505352c.f(i(i18, null), (int) (r4.c(l17) * (-1.0f)));
        }
        c(k17);
    }

    public void g(u2.j jVar, u2.j jVar2, int i17, int i18) {
        u2.b k17 = k();
        u2.j l17 = l();
        l17.f505381c = 0;
        k17.c(jVar, jVar2, l17, i17);
        if (i18 != 6) {
            k17.f505352c.f(i(i18, null), (int) (r4.c(l17) * (-1.0f)));
        }
        c(k17);
    }

    public final void h(u2.b bVar) {
        u2.b[] bVarArr = this.f505362e;
        int i17 = this.f505366i;
        u2.b bVar2 = bVarArr[i17];
        if (bVar2 != null) {
            u2.h hVar = (u2.h) this.f505368k.f505354a;
            int i18 = hVar.f505373b;
            java.lang.Object[] objArr = hVar.f505372a;
            if (i18 < objArr.length) {
                objArr[i18] = bVar2;
                hVar.f505373b = i18 + 1;
            }
        }
        bVarArr[i17] = bVar;
        u2.j jVar = bVar.f505350a;
        jVar.f505380b = i17;
        this.f505366i = i17 + 1;
        jVar.d(bVar);
    }

    public u2.j i(int i17, java.lang.String str) {
        if (this.f505365h + 1 >= this.f505361d) {
            n();
        }
        u2.j a17 = a(u2.i.ERROR, str);
        int i18 = this.f505358a + 1;
        this.f505358a = i18;
        this.f505365h++;
        a17.f505379a = i18;
        a17.f505381c = i17;
        this.f505368k.f505356c[i18] = a17;
        ((u2.d) this.f505359b).e(a17);
        return a17;
    }

    public u2.j j(java.lang.Object obj) {
        u2.j jVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f505365h + 1 >= this.f505361d) {
            n();
        }
        if (obj instanceof v2.g) {
            v2.g gVar = (v2.g) obj;
            jVar = gVar.f514175i;
            u2.c cVar = this.f505368k;
            if (jVar == null) {
                gVar.e(cVar);
                jVar = gVar.f514175i;
            }
            int i17 = jVar.f505379a;
            if (i17 == -1 || i17 > this.f505358a || cVar.f505356c[i17] == null) {
                if (i17 != -1) {
                    jVar.c();
                }
                int i18 = this.f505358a + 1;
                this.f505358a = i18;
                this.f505365h++;
                jVar.f505379a = i18;
                jVar.f505384f = u2.i.UNRESTRICTED;
                cVar.f505356c[i18] = jVar;
            }
        }
        return jVar;
    }

    public u2.b k() {
        java.lang.Object obj;
        u2.c cVar = this.f505368k;
        u2.h hVar = (u2.h) cVar.f505354a;
        int i17 = hVar.f505373b;
        if (i17 > 0) {
            int i18 = i17 - 1;
            java.lang.Object[] objArr = hVar.f505372a;
            obj = objArr[i18];
            objArr[i18] = null;
            hVar.f505373b = i18;
        } else {
            obj = null;
        }
        u2.b bVar = (u2.b) obj;
        if (bVar == null) {
            return new u2.b(cVar);
        }
        bVar.f505350a = null;
        bVar.f505352c.b();
        bVar.f505351b = 0.0f;
        bVar.f505353d = false;
        return bVar;
    }

    public u2.j l() {
        if (this.f505365h + 1 >= this.f505361d) {
            n();
        }
        u2.j a17 = a(u2.i.SLACK, null);
        int i17 = this.f505358a + 1;
        this.f505358a = i17;
        this.f505365h++;
        a17.f505379a = i17;
        this.f505368k.f505356c[i17] = a17;
        return a17;
    }

    public int m(java.lang.Object obj) {
        u2.j jVar = ((v2.g) obj).f514175i;
        if (jVar != null) {
            return (int) (jVar.f505382d + 0.5f);
        }
        return 0;
    }

    public final void n() {
        int i17 = this.f505360c * 2;
        this.f505360c = i17;
        this.f505362e = (u2.b[]) java.util.Arrays.copyOf(this.f505362e, i17);
        u2.c cVar = this.f505368k;
        cVar.f505356c = (u2.j[]) java.util.Arrays.copyOf(cVar.f505356c, this.f505360c);
        int i18 = this.f505360c;
        this.f505364g = new boolean[i18];
        this.f505361d = i18;
        this.f505367j = i18;
    }

    public void o(u2.e eVar) {
        u2.i iVar;
        float f17;
        int i17;
        boolean z17;
        u2.c cVar;
        r((u2.b) eVar);
        int i18 = 0;
        while (true) {
            int i19 = this.f505366i;
            iVar = u2.i.UNRESTRICTED;
            f17 = 0.0f;
            i17 = 1;
            if (i18 >= i19) {
                z17 = false;
                break;
            }
            u2.b bVar = this.f505362e[i18];
            if (bVar.f505350a.f505384f != iVar && bVar.f505351b < 0.0f) {
                z17 = true;
                break;
            }
            i18++;
        }
        if (z17) {
            boolean z18 = false;
            int i27 = 0;
            while (!z18) {
                i27 += i17;
                float f18 = Float.MAX_VALUE;
                int i28 = 0;
                int i29 = -1;
                int i37 = -1;
                int i38 = 0;
                while (true) {
                    int i39 = this.f505366i;
                    cVar = this.f505368k;
                    if (i28 >= i39) {
                        break;
                    }
                    u2.b bVar2 = this.f505362e[i28];
                    if (bVar2.f505350a.f505384f != iVar && !bVar2.f505353d && bVar2.f505351b < f17) {
                        int i47 = 1;
                        while (i47 < this.f505365h) {
                            u2.j jVar = cVar.f505356c[i47];
                            float c17 = bVar2.f505352c.c(jVar);
                            boolean z19 = z18;
                            if (c17 > f17) {
                                for (int i48 = 0; i48 < 7; i48++) {
                                    float f19 = jVar.f505383e[i48] / c17;
                                    if ((f19 < f18 && i48 == i38) || i48 > i38) {
                                        f18 = f19;
                                        i38 = i48;
                                        i37 = i47;
                                        i29 = i28;
                                    }
                                }
                            }
                            i47++;
                            z18 = z19;
                            f17 = 0.0f;
                        }
                    }
                    i28++;
                    z18 = z18;
                    f17 = 0.0f;
                }
                boolean z27 = z18;
                if (i29 != -1) {
                    u2.b bVar3 = this.f505362e[i29];
                    bVar3.f505350a.f505380b = -1;
                    bVar3.d(cVar.f505356c[i37]);
                    u2.j jVar2 = bVar3.f505350a;
                    jVar2.f505380b = i29;
                    jVar2.d(bVar3);
                    z18 = z27;
                } else {
                    z18 = true;
                }
                if (i27 > this.f505365h / 2) {
                    z18 = true;
                }
                f17 = 0.0f;
                i17 = 1;
            }
        }
        p(eVar, false);
        for (int i49 = 0; i49 < this.f505366i; i49++) {
            u2.b bVar4 = this.f505362e[i49];
            bVar4.f505350a.f505382d = bVar4.f505351b;
        }
    }

    public final int p(u2.e eVar, boolean z17) {
        boolean z18;
        for (int i17 = 0; i17 < this.f505365h; i17++) {
            this.f505364g[i17] = false;
        }
        boolean z19 = false;
        int i18 = 0;
        while (!z19) {
            i18++;
            if (i18 >= this.f505365h * 2) {
                return i18;
            }
            if (((u2.b) eVar).f505350a != null) {
                this.f505364g[((u2.b) eVar).f505350a.f505379a] = true;
            }
            u2.j d17 = ((u2.b) eVar).f505352c.d(this.f505364g, null);
            if (d17 != null) {
                boolean[] zArr = this.f505364g;
                int i19 = d17.f505379a;
                if (zArr[i19]) {
                    return i18;
                }
                zArr[i19] = true;
            }
            if (d17 != null) {
                float f17 = Float.MAX_VALUE;
                int i27 = -1;
                for (int i28 = 0; i28 < this.f505366i; i28++) {
                    u2.b bVar = this.f505362e[i28];
                    if (bVar.f505350a.f505384f != u2.i.UNRESTRICTED && !bVar.f505353d) {
                        u2.a aVar = bVar.f505352c;
                        int i29 = aVar.f505347h;
                        if (i29 != -1) {
                            for (int i37 = 0; i29 != -1 && i37 < aVar.f505340a; i37++) {
                                if (aVar.f505344e[i29] == d17.f505379a) {
                                    z18 = true;
                                    break;
                                }
                                i29 = aVar.f505345f[i29];
                            }
                        }
                        z18 = false;
                        if (z18) {
                            float c17 = aVar.c(d17);
                            if (c17 < 0.0f) {
                                float f18 = (-bVar.f505351b) / c17;
                                if (f18 < f17) {
                                    i27 = i28;
                                    f17 = f18;
                                }
                            }
                        }
                    }
                }
                if (i27 > -1) {
                    u2.b bVar2 = this.f505362e[i27];
                    bVar2.f505350a.f505380b = -1;
                    bVar2.d(d17);
                    u2.j jVar = bVar2.f505350a;
                    jVar.f505380b = i27;
                    jVar.d(bVar2);
                }
            }
            z19 = true;
        }
        return i18;
    }

    public void q() {
        u2.c cVar;
        int i17 = 0;
        while (true) {
            cVar = this.f505368k;
            u2.j[] jVarArr = cVar.f505356c;
            if (i17 >= jVarArr.length) {
                break;
            }
            u2.j jVar = jVarArr[i17];
            if (jVar != null) {
                jVar.c();
            }
            i17++;
        }
        u2.g gVar = cVar.f505355b;
        u2.j[] jVarArr2 = this.f505369l;
        int i18 = this.f505370m;
        u2.h hVar = (u2.h) gVar;
        hVar.getClass();
        if (i18 > jVarArr2.length) {
            i18 = jVarArr2.length;
        }
        for (int i19 = 0; i19 < i18; i19++) {
            u2.j jVar2 = jVarArr2[i19];
            int i27 = hVar.f505373b;
            java.lang.Object[] objArr = hVar.f505372a;
            if (i27 < objArr.length) {
                objArr[i27] = jVar2;
                hVar.f505373b = i27 + 1;
            }
        }
        this.f505370m = 0;
        java.util.Arrays.fill(cVar.f505356c, (java.lang.Object) null);
        this.f505358a = 0;
        u2.b bVar = (u2.b) this.f505359b;
        bVar.f505352c.b();
        bVar.f505350a = null;
        bVar.f505351b = 0.0f;
        this.f505365h = 1;
        for (int i28 = 0; i28 < this.f505366i; i28++) {
            this.f505362e[i28].getClass();
        }
        int i29 = 0;
        while (true) {
            u2.b[] bVarArr = this.f505362e;
            if (i29 >= bVarArr.length) {
                this.f505366i = 0;
                return;
            }
            u2.b bVar2 = bVarArr[i29];
            if (bVar2 != null) {
                u2.h hVar2 = (u2.h) cVar.f505354a;
                int i37 = hVar2.f505373b;
                java.lang.Object[] objArr2 = hVar2.f505372a;
                if (i37 < objArr2.length) {
                    objArr2[i37] = bVar2;
                    hVar2.f505373b = i37 + 1;
                }
            }
            bVarArr[i29] = null;
            i29++;
        }
    }

    public final void r(u2.b bVar) {
        if (this.f505366i > 0) {
            u2.a aVar = bVar.f505352c;
            u2.b[] bVarArr = this.f505362e;
            int i17 = aVar.f505347h;
            loop0: while (true) {
                for (int i18 = 0; i17 != -1 && i18 < aVar.f505340a; i18++) {
                    u2.c cVar = aVar.f505342c;
                    u2.j jVar = cVar.f505356c[aVar.f505344e[i17]];
                    if (jVar.f505380b != -1) {
                        float f17 = aVar.f505346g[i17];
                        aVar.g(jVar, true);
                        u2.b bVar2 = bVarArr[jVar.f505380b];
                        if (!bVar2.f505353d) {
                            u2.a aVar2 = bVar2.f505352c;
                            int i19 = aVar2.f505347h;
                            for (int i27 = 0; i19 != -1 && i27 < aVar2.f505340a; i27++) {
                                aVar.a(cVar.f505356c[aVar2.f505344e[i19]], aVar2.f505346g[i19] * f17, true);
                                i19 = aVar2.f505345f[i19];
                            }
                        }
                        bVar.f505351b += bVar2.f505351b * f17;
                        bVar2.f505350a.b(bVar);
                        i17 = aVar.f505347h;
                    } else {
                        i17 = aVar.f505345f[i17];
                    }
                }
            }
            if (bVar.f505352c.f505340a == 0) {
                bVar.f505353d = true;
            }
        }
    }
}
