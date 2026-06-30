package r45;

/* loaded from: classes4.dex */
public class bm3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f452402d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f452403e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f452404f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bm3)) {
            return false;
        }
        r45.bm3 bm3Var = (r45.bm3) fVar;
        return n51.f.a(this.f76492x92037252, bm3Var.f76492x92037252) && n51.f.a(this.f452402d, bm3Var.f452402d) && n51.f.a(this.f452403e, bm3Var.f452403e) && n51.f.a(this.f452404f, bm3Var.f452404f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f452402d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f452402d.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f452403e;
            if (cu5Var2 != null) {
                fVar.i(3, cu5Var2.mo75928xcd1e8d8());
                this.f452403e.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var3 = this.f452404f;
            if (cu5Var3 != null) {
                fVar.i(4, cu5Var3.mo75928xcd1e8d8());
                this.f452404f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var4 = this.f452402d;
            if (cu5Var4 != null) {
                i18 += b36.f.i(2, cu5Var4.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var5 = this.f452403e;
            if (cu5Var5 != null) {
                i18 += b36.f.i(3, cu5Var5.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var6 = this.f452404f;
            return cu5Var6 != null ? i18 + b36.f.i(4, cu5Var6.mo75928xcd1e8d8()) : i18;
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
        r45.bm3 bm3Var = (r45.bm3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                bm3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var7 = new r45.cu5();
                if (bArr2 != null && bArr2.length > 0) {
                    cu5Var7.b(bArr2);
                }
                bm3Var.f452402d = cu5Var7;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.cu5 cu5Var8 = new r45.cu5();
                if (bArr3 != null && bArr3.length > 0) {
                    cu5Var8.b(bArr3);
                }
                bm3Var.f452403e = cu5Var8;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.cu5 cu5Var9 = new r45.cu5();
            if (bArr4 != null && bArr4.length > 0) {
                cu5Var9.b(bArr4);
            }
            bm3Var.f452404f = cu5Var9;
        }
        return 0;
    }
}
