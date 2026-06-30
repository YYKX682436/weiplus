package r45;

/* loaded from: classes8.dex */
public class ni extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ms f462938d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ms f462939e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ms f462940f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f462941g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f462942h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ms f462943i;

    /* renamed from: m, reason: collision with root package name */
    public int f462944m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ls f462945n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ls f462946o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ni)) {
            return false;
        }
        r45.ni niVar = (r45.ni) fVar;
        return n51.f.a(this.f462938d, niVar.f462938d) && n51.f.a(this.f462939e, niVar.f462939e) && n51.f.a(this.f462940f, niVar.f462940f) && n51.f.a(this.f462941g, niVar.f462941g) && n51.f.a(this.f462942h, niVar.f462942h) && n51.f.a(this.f462943i, niVar.f462943i) && n51.f.a(java.lang.Integer.valueOf(this.f462944m), java.lang.Integer.valueOf(niVar.f462944m)) && n51.f.a(this.f462945n, niVar.f462945n) && n51.f.a(this.f462946o, niVar.f462946o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ms msVar = this.f462938d;
            if (msVar != null) {
                fVar.i(1, msVar.mo75928xcd1e8d8());
                this.f462938d.mo75956x3d5d1f78(fVar);
            }
            r45.ms msVar2 = this.f462939e;
            if (msVar2 != null) {
                fVar.i(2, msVar2.mo75928xcd1e8d8());
                this.f462939e.mo75956x3d5d1f78(fVar);
            }
            r45.ms msVar3 = this.f462940f;
            if (msVar3 != null) {
                fVar.i(4, msVar3.mo75928xcd1e8d8());
                this.f462940f.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f462941g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f462941g.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f462942h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.mo75928xcd1e8d8());
                this.f462942h.mo75956x3d5d1f78(fVar);
            }
            r45.ms msVar4 = this.f462943i;
            if (msVar4 != null) {
                fVar.i(7, msVar4.mo75928xcd1e8d8());
                this.f462943i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f462944m);
            r45.ls lsVar = this.f462945n;
            if (lsVar != null) {
                fVar.i(9, lsVar.mo75928xcd1e8d8());
                this.f462945n.mo75956x3d5d1f78(fVar);
            }
            r45.ls lsVar2 = this.f462946o;
            if (lsVar2 != null) {
                fVar.i(10, lsVar2.mo75928xcd1e8d8());
                this.f462946o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ms msVar5 = this.f462938d;
            int i18 = msVar5 != null ? 0 + b36.f.i(1, msVar5.mo75928xcd1e8d8()) : 0;
            r45.ms msVar6 = this.f462939e;
            if (msVar6 != null) {
                i18 += b36.f.i(2, msVar6.mo75928xcd1e8d8());
            }
            r45.ms msVar7 = this.f462940f;
            if (msVar7 != null) {
                i18 += b36.f.i(4, msVar7.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var3 = this.f462941g;
            if (cu5Var3 != null) {
                i18 += b36.f.i(5, cu5Var3.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var4 = this.f462942h;
            if (cu5Var4 != null) {
                i18 += b36.f.i(6, cu5Var4.mo75928xcd1e8d8());
            }
            r45.ms msVar8 = this.f462943i;
            if (msVar8 != null) {
                i18 += b36.f.i(7, msVar8.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(8, this.f462944m);
            r45.ls lsVar3 = this.f462945n;
            if (lsVar3 != null) {
                e17 += b36.f.i(9, lsVar3.mo75928xcd1e8d8());
            }
            r45.ls lsVar4 = this.f462946o;
            return lsVar4 != null ? e17 + b36.f.i(10, lsVar4.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.ni niVar = (r45.ni) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ms msVar9 = new r45.ms();
                    if (bArr != null && bArr.length > 0) {
                        msVar9.mo11468x92b714fd(bArr);
                    }
                    niVar.f462938d = msVar9;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ms msVar10 = new r45.ms();
                    if (bArr2 != null && bArr2.length > 0) {
                        msVar10.mo11468x92b714fd(bArr2);
                    }
                    niVar.f462939e = msVar10;
                }
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ms msVar11 = new r45.ms();
                    if (bArr3 != null && bArr3.length > 0) {
                        msVar11.mo11468x92b714fd(bArr3);
                    }
                    niVar.f462940f = msVar11;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var5.b(bArr4);
                    }
                    niVar.f462941g = cu5Var5;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var6.b(bArr5);
                    }
                    niVar.f462942h = cu5Var6;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.ms msVar12 = new r45.ms();
                    if (bArr6 != null && bArr6.length > 0) {
                        msVar12.mo11468x92b714fd(bArr6);
                    }
                    niVar.f462943i = msVar12;
                }
                return 0;
            case 8:
                niVar.f462944m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.ls lsVar5 = new r45.ls();
                    if (bArr7 != null && bArr7.length > 0) {
                        lsVar5.mo11468x92b714fd(bArr7);
                    }
                    niVar.f462945n = lsVar5;
                }
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.ls lsVar6 = new r45.ls();
                    if (bArr8 != null && bArr8.length > 0) {
                        lsVar6.mo11468x92b714fd(bArr8);
                    }
                    niVar.f462946o = lsVar6;
                }
                return 0;
        }
    }
}
