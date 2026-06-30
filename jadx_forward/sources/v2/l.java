package v2;

/* loaded from: classes15.dex */
public class l extends v2.i {

    /* renamed from: i0, reason: collision with root package name */
    public float f514242i0 = -1.0f;

    /* renamed from: j0, reason: collision with root package name */
    public int f514243j0 = -1;

    /* renamed from: k0, reason: collision with root package name */
    public int f514244k0 = -1;

    /* renamed from: l0, reason: collision with root package name */
    public v2.g f514245l0 = this.f514209t;

    /* renamed from: m0, reason: collision with root package name */
    public int f514246m0 = 0;

    public l() {
        this.B.clear();
        this.B.add(this.f514245l0);
        int length = this.A.length;
        for (int i17 = 0; i17 < length; i17++) {
            this.A[i17] = this.f514245l0;
        }
    }

    public void A(int i17) {
        if (this.f514246m0 == i17) {
            return;
        }
        this.f514246m0 = i17;
        java.util.ArrayList arrayList = this.B;
        arrayList.clear();
        if (this.f514246m0 == 1) {
            this.f514245l0 = this.f514208s;
        } else {
            this.f514245l0 = this.f514209t;
        }
        arrayList.add(this.f514245l0);
        v2.g[] gVarArr = this.A;
        int length = gVarArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            gVarArr[i18] = this.f514245l0;
        }
    }

    @Override // v2.i
    public void a(u2.f fVar) {
        v2.j jVar = (v2.j) this.D;
        if (jVar == null) {
            return;
        }
        v2.g f17 = jVar.f(v2.f.LEFT);
        v2.g f18 = jVar.f(v2.f.RIGHT);
        v2.i iVar = this.D;
        v2.h hVar = v2.h.WRAP_CONTENT;
        boolean z17 = iVar != null && iVar.C[0] == hVar;
        if (this.f514246m0 == 0) {
            f17 = jVar.f(v2.f.TOP);
            f18 = jVar.f(v2.f.BOTTOM);
            v2.i iVar2 = this.D;
            z17 = iVar2 != null && iVar2.C[1] == hVar;
        }
        if (this.f514243j0 != -1) {
            u2.j j17 = fVar.j(this.f514245l0);
            fVar.d(j17, fVar.j(f17), this.f514243j0, 6);
            if (z17) {
                fVar.f(fVar.j(f18), j17, 0, 5);
                return;
            }
            return;
        }
        if (this.f514244k0 != -1) {
            u2.j j18 = fVar.j(this.f514245l0);
            u2.j j19 = fVar.j(f18);
            fVar.d(j18, j19, -this.f514244k0, 6);
            if (z17) {
                fVar.f(j18, fVar.j(f17), 0, 5);
                fVar.f(j19, j18, 0, 5);
                return;
            }
            return;
        }
        if (this.f514242i0 != -1.0f) {
            u2.j j27 = fVar.j(this.f514245l0);
            u2.j j28 = fVar.j(f17);
            u2.j j29 = fVar.j(f18);
            float f19 = this.f514242i0;
            u2.b k17 = fVar.k();
            u2.a aVar = k17.f505352c;
            aVar.f(j27, -1.0f);
            aVar.f(j28, 1.0f - f19);
            aVar.f(j29, f19);
            fVar.c(k17);
        }
    }

    @Override // v2.i
    public boolean b() {
        return true;
    }

    @Override // v2.i
    public void c(int i17) {
        v2.i iVar = this.D;
        if (iVar == null) {
            return;
        }
        int i18 = this.f514246m0;
        v2.h hVar = v2.h.FIXED;
        v2.g gVar = this.f514211v;
        v2.g gVar2 = this.f514209t;
        v2.g gVar3 = this.f514210u;
        v2.g gVar4 = this.f514208s;
        v2.h[] hVarArr = iVar.C;
        v2.g gVar5 = iVar.f514209t;
        v2.g gVar6 = iVar.f514208s;
        if (i18 == 1) {
            gVar2.f514167a.g(1, gVar5.f514167a, 0);
            gVar.f514167a.g(1, gVar5.f514167a, 0);
            int i19 = this.f514243j0;
            if (i19 != -1) {
                gVar4.f514167a.g(1, gVar6.f514167a, i19);
                gVar3.f514167a.g(1, gVar6.f514167a, this.f514243j0);
                return;
            }
            int i27 = this.f514244k0;
            if (i27 != -1) {
                v2.o oVar = gVar4.f514167a;
                v2.g gVar7 = iVar.f514210u;
                oVar.g(1, gVar7.f514167a, -i27);
                gVar3.f514167a.g(1, gVar7.f514167a, -this.f514244k0);
                return;
            }
            float f17 = this.f514242i0;
            if (f17 == -1.0f || hVarArr[0] != hVar) {
                return;
            }
            int i28 = (int) (iVar.E * f17);
            gVar4.f514167a.g(1, gVar6.f514167a, i28);
            gVar3.f514167a.g(1, gVar6.f514167a, i28);
            return;
        }
        gVar4.f514167a.g(1, gVar6.f514167a, 0);
        gVar3.f514167a.g(1, gVar6.f514167a, 0);
        int i29 = this.f514243j0;
        if (i29 != -1) {
            gVar2.f514167a.g(1, gVar5.f514167a, i29);
            gVar.f514167a.g(1, gVar5.f514167a, this.f514243j0);
            return;
        }
        int i37 = this.f514244k0;
        if (i37 != -1) {
            v2.o oVar2 = gVar2.f514167a;
            v2.g gVar8 = iVar.f514211v;
            oVar2.g(1, gVar8.f514167a, -i37);
            gVar.f514167a.g(1, gVar8.f514167a, -this.f514244k0);
            return;
        }
        float f18 = this.f514242i0;
        if (f18 == -1.0f || hVarArr[1] != hVar) {
            return;
        }
        int i38 = (int) (iVar.F * f18);
        gVar2.f514167a.g(1, gVar5.f514167a, i38);
        gVar.f514167a.g(1, gVar5.f514167a, i38);
    }

    @Override // v2.i
    public v2.g f(v2.f fVar) {
        switch (fVar) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
            case RIGHT:
                if (this.f514246m0 == 1) {
                    return this.f514245l0;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.f514246m0 == 0) {
                    return this.f514245l0;
                }
                break;
        }
        throw new java.lang.AssertionError(fVar.name());
    }

    @Override // v2.i
    public java.util.ArrayList g() {
        return this.B;
    }

    @Override // v2.i
    public void z(u2.f fVar) {
        if (this.D == null) {
            return;
        }
        int m17 = fVar.m(this.f514245l0);
        if (this.f514246m0 == 1) {
            this.I = m17;
            this.f514181J = 0;
            t(this.D.h());
            x(0);
            return;
        }
        this.I = 0;
        this.f514181J = m17;
        x(this.D.l());
        t(0);
    }
}
