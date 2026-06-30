package iv5;

/* loaded from: classes16.dex */
public class f extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f376682d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f376683e;

    public f(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376682d = null;
        this.f376683e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f95995a.f95970n;
            this.f376682d = n0Var;
            this.f376683e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.h hVar = (av5.h) comparable;
        fVar.getClass();
        av5.f[] fVarArr = hVar.f95910e;
        av5.f[] fVarArr2 = new av5.f[fVarArr.length];
        for (int i17 = 0; i17 < fVarArr.length; i17++) {
            av5.f fVar2 = fVarArr[i17];
            fVarArr2[i17] = new av5.f(fVar.b(fVar2.f95903d), fVar2.f95904e);
        }
        av5.f[] fVarArr3 = hVar.f95911f;
        av5.f[] fVarArr4 = new av5.f[fVarArr3.length];
        for (int i18 = 0; i18 < fVarArr3.length; i18++) {
            av5.f fVar3 = fVarArr3[i18];
            fVarArr4[i18] = new av5.f(fVar.b(fVar3.f95903d), fVar3.f95904e);
        }
        return new av5.h(hVar.f95950d, fVarArr2, fVarArr4, fVar.d(hVar.f95912g), fVar.d(hVar.f95913h));
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95970n;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i18 < 0) {
            iVar.getClass();
        } else {
            iVar.D.b(i18, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.g();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            iVar.f394306n.f(i18, i27);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.h hVar = (av5.h) comparable;
        this.f376682d.f95953f++;
        av5.u uVar = this.f376683e;
        uVar.A(uVar.f95990f.f95995a.f95970n, true);
        int position = uVar.f106295a.position();
        av5.f0.d(uVar, hVar.f95910e.length);
        av5.f[] fVarArr = hVar.f95911f;
        av5.f0.d(uVar, fVarArr.length);
        av5.g[] gVarArr = hVar.f95912g;
        av5.f0.d(uVar, gVarArr.length);
        av5.g[] gVarArr2 = hVar.f95913h;
        av5.f0.d(uVar, gVarArr2.length);
        av5.f[] fVarArr2 = hVar.f95910e;
        int length = fVarArr2.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            av5.f fVar = fVarArr2[i18];
            av5.f0.d(uVar, fVar.f95903d - i19);
            av5.f0.d(uVar, fVar.f95904e);
            i18++;
            i19 = fVar.f95903d;
        }
        int length2 = fVarArr.length;
        int i27 = 0;
        while (i17 < length2) {
            av5.f fVar2 = fVarArr[i17];
            av5.f0.d(uVar, fVar2.f95903d - i27);
            av5.f0.d(uVar, fVar2.f95904e);
            i17++;
            i27 = fVar2.f95903d;
        }
        uVar.x(gVarArr);
        uVar.x(gVarArr2);
        return position;
    }
}
