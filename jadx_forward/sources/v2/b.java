package v2;

/* loaded from: classes15.dex */
public class b extends v2.m {

    /* renamed from: k0, reason: collision with root package name */
    public int f514135k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public final java.util.ArrayList f514136l0 = new java.util.ArrayList(4);

    /* renamed from: m0, reason: collision with root package name */
    public boolean f514137m0 = true;

    @Override // v2.i
    public void a(u2.f fVar) {
        boolean z17;
        v2.g[] gVarArr = this.A;
        v2.g gVar = this.f514208s;
        gVarArr[0] = gVar;
        int i17 = 2;
        v2.g gVar2 = this.f514209t;
        gVarArr[2] = gVar2;
        v2.g gVar3 = this.f514210u;
        gVarArr[1] = gVar3;
        v2.g gVar4 = this.f514211v;
        gVarArr[3] = gVar4;
        for (v2.g gVar5 : gVarArr) {
            gVar5.f514175i = fVar.j(gVar5);
        }
        int i18 = this.f514135k0;
        if (i18 < 0 || i18 >= 4) {
            return;
        }
        v2.g gVar6 = gVarArr[i18];
        for (int i19 = 0; i19 < this.f514248j0; i19++) {
            v2.i iVar = this.f514247i0[i19];
            if (this.f514137m0 || iVar.b()) {
                int i27 = this.f514135k0;
                v2.h hVar = v2.h.MATCH_CONSTRAINT;
                if (((i27 == 0 || i27 == 1) && iVar.C[0] == hVar) || ((i27 == 2 || i27 == 3) && iVar.C[1] == hVar)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        int i28 = this.f514135k0;
        v2.h hVar2 = v2.h.WRAP_CONTENT;
        if (i28 == 0 || i28 == 1 ? this.D.C[0] == hVar2 : this.D.C[1] == hVar2) {
            z17 = false;
        }
        int i29 = 0;
        while (i29 < this.f514248j0) {
            v2.i iVar2 = this.f514247i0[i29];
            if (this.f514137m0 || iVar2.b()) {
                u2.j j17 = fVar.j(iVar2.A[this.f514135k0]);
                int i37 = this.f514135k0;
                iVar2.A[i37].f514175i = j17;
                if (i37 == 0 || i37 == i17) {
                    u2.j jVar = gVar6.f514175i;
                    u2.b k17 = fVar.k();
                    u2.j l17 = fVar.l();
                    l17.f505381c = 0;
                    k17.c(jVar, j17, l17, 0);
                    if (z17) {
                        k17.f505352c.f(fVar.i(1, null), (int) (r5.c(l17) * (-1.0f)));
                    }
                    fVar.c(k17);
                } else {
                    u2.j jVar2 = gVar6.f514175i;
                    u2.b k18 = fVar.k();
                    u2.j l18 = fVar.l();
                    l18.f505381c = 0;
                    k18.b(jVar2, j17, l18, 0);
                    if (z17) {
                        k18.f505352c.f(fVar.i(1, null), (int) (r14.c(l18) * (-1.0f)));
                    }
                    fVar.c(k18);
                }
            }
            i29++;
            i17 = 2;
        }
        int i38 = this.f514135k0;
        if (i38 == 0) {
            fVar.d(gVar3.f514175i, gVar.f514175i, 0, 6);
            if (z17) {
                return;
            }
            fVar.d(gVar.f514175i, this.D.f514210u.f514175i, 0, 5);
            return;
        }
        if (i38 == 1) {
            fVar.d(gVar.f514175i, gVar3.f514175i, 0, 6);
            if (z17) {
                return;
            }
            fVar.d(gVar.f514175i, this.D.f514208s.f514175i, 0, 5);
            return;
        }
        if (i38 == 2) {
            fVar.d(gVar4.f514175i, gVar2.f514175i, 0, 6);
            if (z17) {
                return;
            }
            fVar.d(gVar2.f514175i, this.D.f514211v.f514175i, 0, 5);
            return;
        }
        if (i38 == 3) {
            fVar.d(gVar2.f514175i, gVar4.f514175i, 0, 6);
            if (z17) {
                return;
            }
            fVar.d(gVar2.f514175i, this.D.f514209t.f514175i, 0, 5);
        }
    }

    @Override // v2.i
    public boolean b() {
        return true;
    }

    @Override // v2.i
    public void c(int i17) {
        v2.o oVar;
        v2.i iVar = this.D;
        if (iVar != null && ((v2.j) iVar).D(2)) {
            int i18 = this.f514135k0;
            v2.g gVar = this.f514211v;
            v2.g gVar2 = this.f514209t;
            v2.g gVar3 = this.f514210u;
            v2.g gVar4 = this.f514208s;
            if (i18 == 0) {
                oVar = gVar4.f514167a;
            } else if (i18 == 1) {
                oVar = gVar3.f514167a;
            } else if (i18 == 2) {
                oVar = gVar2.f514167a;
            } else if (i18 != 3) {
                return;
            } else {
                oVar = gVar.f514167a;
            }
            oVar.f514255h = 5;
            if (i18 == 0 || i18 == 1) {
                gVar2.f514167a.k(null, 0.0f);
                gVar.f514167a.k(null, 0.0f);
            } else {
                gVar4.f514167a.k(null, 0.0f);
                gVar3.f514167a.k(null, 0.0f);
            }
            java.util.ArrayList arrayList = this.f514136l0;
            arrayList.clear();
            for (int i19 = 0; i19 < this.f514248j0; i19++) {
                v2.i iVar2 = this.f514247i0[i19];
                if (this.f514137m0 || iVar2.b()) {
                    int i27 = this.f514135k0;
                    v2.o oVar2 = i27 != 0 ? i27 != 1 ? i27 != 2 ? i27 != 3 ? null : iVar2.f514211v.f514167a : iVar2.f514209t.f514167a : iVar2.f514210u.f514167a : iVar2.f514208s.f514167a;
                    if (oVar2 != null) {
                        arrayList.add(oVar2);
                        oVar2.a(oVar);
                    }
                }
            }
        }
    }

    @Override // v2.i
    public void q() {
        super.q();
        this.f514136l0.clear();
    }

    @Override // v2.i
    public void s() {
        v2.o oVar;
        float f17;
        v2.o oVar2;
        int i17 = this.f514135k0;
        v2.g gVar = this.f514211v;
        v2.g gVar2 = this.f514209t;
        v2.g gVar3 = this.f514210u;
        float f18 = Float.MAX_VALUE;
        v2.g gVar4 = this.f514208s;
        if (i17 != 0) {
            if (i17 == 1) {
                oVar = gVar3.f514167a;
            } else if (i17 == 2) {
                oVar = gVar2.f514167a;
            } else if (i17 != 3) {
                return;
            } else {
                oVar = gVar.f514167a;
            }
            f18 = 0.0f;
        } else {
            oVar = gVar4.f514167a;
        }
        java.util.ArrayList arrayList = this.f514136l0;
        int size = arrayList.size();
        v2.o oVar3 = null;
        for (int i18 = 0; i18 < size; i18++) {
            v2.o oVar4 = (v2.o) arrayList.get(i18);
            if (oVar4.f514262b != 1) {
                return;
            }
            int i19 = this.f514135k0;
            if (i19 == 0 || i19 == 2) {
                f17 = oVar4.f514254g;
                if (f17 < f18) {
                    oVar2 = oVar4.f514253f;
                    oVar3 = oVar2;
                    f18 = f17;
                }
            } else {
                f17 = oVar4.f514254g;
                if (f17 > f18) {
                    oVar2 = oVar4.f514253f;
                    oVar3 = oVar2;
                    f18 = f17;
                }
            }
        }
        oVar.f514253f = oVar3;
        oVar.f514254g = f18;
        oVar.b();
        int i27 = this.f514135k0;
        if (i27 == 0) {
            gVar3.f514167a.k(oVar3, f18);
            return;
        }
        if (i27 == 1) {
            gVar4.f514167a.k(oVar3, f18);
        } else if (i27 == 2) {
            gVar.f514167a.k(oVar3, f18);
        } else {
            if (i27 != 3) {
                return;
            }
            gVar2.f514167a.k(oVar3, f18);
        }
    }
}
