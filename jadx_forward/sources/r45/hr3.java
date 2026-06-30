package r45;

/* loaded from: classes4.dex */
public class hr3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.x17 f457932d;

    /* renamed from: e, reason: collision with root package name */
    public r45.oh5 f457933e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hr3)) {
            return false;
        }
        r45.hr3 hr3Var = (r45.hr3) fVar;
        return n51.f.a(this.f76492x92037252, hr3Var.f76492x92037252) && n51.f.a(this.f457932d, hr3Var.f457932d) && n51.f.a(this.f457933e, hr3Var.f457933e);
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
            r45.x17 x17Var = this.f457932d;
            if (x17Var != null) {
                fVar.i(2, x17Var.mo75928xcd1e8d8());
                this.f457932d.mo75956x3d5d1f78(fVar);
            }
            r45.oh5 oh5Var = this.f457933e;
            if (oh5Var != null) {
                fVar.i(3, oh5Var.mo75928xcd1e8d8());
                this.f457933e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.x17 x17Var2 = this.f457932d;
            if (x17Var2 != null) {
                i18 += b36.f.i(2, x17Var2.mo75928xcd1e8d8());
            }
            r45.oh5 oh5Var2 = this.f457933e;
            return oh5Var2 != null ? i18 + b36.f.i(3, oh5Var2.mo75928xcd1e8d8()) : i18;
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
        r45.hr3 hr3Var = (r45.hr3) objArr[1];
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
                hr3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.x17 x17Var3 = new r45.x17();
                if (bArr2 != null && bArr2.length > 0) {
                    x17Var3.mo11468x92b714fd(bArr2);
                }
                hr3Var.f457932d = x17Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.oh5 oh5Var3 = new r45.oh5();
            if (bArr3 != null && bArr3.length > 0) {
                oh5Var3.mo11468x92b714fd(bArr3);
            }
            hr3Var.f457933e = oh5Var3;
        }
        return 0;
    }
}
