package iv5;

/* loaded from: classes16.dex */
public class h extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f376688d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f376689e;

    public h(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376688d = null;
        this.f376689e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f95995a.f95971o;
            this.f376688d = n0Var;
            this.f376689e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        short[] sArr;
        av5.j[] jVarArr;
        av5.l lVar = (av5.l) comparable;
        fVar.getClass();
        int i17 = lVar.f95942h;
        kv5.i iVar = (kv5.i) fVar;
        fv5.b bVar = iVar.f394307o;
        int d17 = bVar.d(i17);
        if (d17 >= 0) {
            i17 = bVar.f348555e[d17];
        } else if (i17 >= 0 && iVar.E.a(i17)) {
            i17 = -1;
        }
        int i18 = i17;
        short[] sArr2 = lVar.f95943i;
        if (sArr2 == null || sArr2.length == 0) {
            sArr = sArr2;
        } else {
            kv5.h hVar = new kv5.h(fVar);
            dv5.h hVar2 = new dv5.h(sArr2.length);
            dv5.c cVar = new dv5.c();
            dv5.f fVar2 = new dv5.f(hVar2, cVar);
            dv5.d dVar = new dv5.d(new dv5.g(sArr2));
            try {
                dVar.a(new kv5.g(hVar, cVar));
                dVar.a(new kv5.g(hVar, fVar2));
                int i19 = hVar2.f325569b;
                short[] sArr3 = hVar2.f325597c;
                if (i19 != sArr3.length) {
                    short[] sArr4 = new short[i19];
                    java.lang.System.arraycopy(sArr3, 0, sArr4, 0, i19);
                    sArr3 = sArr4;
                }
                sArr = sArr3;
            } catch (java.io.EOFException e17) {
                throw new av5.z(e17);
            }
        }
        av5.j[] jVarArr2 = lVar.f95945n;
        if (jVarArr2 == null || jVarArr2.length == 0) {
            jVarArr = jVarArr2;
        } else {
            av5.j[] jVarArr3 = new av5.j[jVarArr2.length];
            for (int i27 = 0; i27 < jVarArr2.length; i27++) {
                av5.j jVar = jVarArr2[i27];
                int length = jVar.f95929d.length;
                int[] iArr = new int[length];
                for (int i28 = 0; i28 < length; i28++) {
                    iArr[i28] = fVar.g(jVar.f95929d[i28]);
                }
                jVarArr3[i27] = new av5.j(iArr, jVar.f95930e, jVar.f95931f, jVar.f95932g);
            }
            jVarArr = jVarArr3;
        }
        return new av5.l(lVar.f95950d, lVar.f95939e, lVar.f95940f, lVar.f95941g, i18, sArr, lVar.f95944m, jVarArr);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95971o;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i18 < 0) {
            iVar.getClass();
        } else {
            iVar.F.b(i18, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.i();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            iVar.f394308p.f(i18, i27);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.l lVar = (av5.l) comparable;
        this.f376688d.f95953f++;
        av5.u uVar = this.f376689e;
        uVar.A(uVar.f95990f.f95995a.f95971o, true);
        int position = uVar.f106295a.position();
        uVar.z(lVar.f95939e);
        uVar.z(lVar.f95940f);
        uVar.z(lVar.f95941g);
        av5.k[] kVarArr = lVar.f95944m;
        uVar.z(kVarArr.length);
        uVar.w(lVar.f95942h);
        short[] sArr = lVar.f95943i;
        uVar.w(sArr.length);
        uVar.a(sArr.length * 2);
        for (short s17 : sArr) {
            uVar.y(s17);
        }
        if (uVar.f106295a.position() > uVar.f106296b) {
            uVar.f106296b = uVar.f106295a.position();
        }
        if (kVarArr.length > 0) {
            if ((sArr.length & 1) == 1) {
                uVar.y((short) 0);
            }
            int position2 = uVar.f106295a.position();
            int length = kVarArr.length * 8;
            uVar.a(length * 1);
            uVar.u(length);
            int position3 = uVar.f106295a.position();
            av5.j[] jVarArr = lVar.f95945n;
            av5.f0.d(uVar, jVarArr.length);
            int[] iArr = new int[jVarArr.length];
            for (int i17 = 0; i17 < jVarArr.length; i17++) {
                iArr[i17] = uVar.f106295a.position() - position3;
                av5.j jVar = jVarArr[i17];
                int i18 = jVar.f95931f;
                int[] iArr2 = jVar.f95929d;
                if (i18 != -1) {
                    av5.f0.c(uVar, -iArr2.length);
                } else {
                    av5.f0.c(uVar, iArr2.length);
                }
                for (int i19 = 0; i19 < iArr2.length; i19++) {
                    av5.f0.d(uVar, iArr2[i19]);
                    av5.f0.d(uVar, jVar.f95930e[i19]);
                }
                if (i18 != -1) {
                    av5.f0.d(uVar, i18);
                }
            }
            int position4 = uVar.f106295a.position();
            uVar.f106295a.position(position2);
            for (av5.k kVar : kVarArr) {
                uVar.w(kVar.f95933d);
                uVar.z(kVar.f95934e);
                uVar.z(iArr[kVar.f95935f]);
            }
            uVar.f106295a.position(position4);
        }
        return position;
    }
}
