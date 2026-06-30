package r45;

/* loaded from: classes4.dex */
public class p16 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f464198d;

    /* renamed from: e, reason: collision with root package name */
    public int f464199e;

    /* renamed from: f, reason: collision with root package name */
    public r45.hk f464200f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p16)) {
            return false;
        }
        r45.p16 p16Var = (r45.p16) fVar;
        return n51.f.a(this.f76494x2de60e5e, p16Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f464198d), java.lang.Integer.valueOf(p16Var.f464198d)) && n51.f.a(java.lang.Integer.valueOf(this.f464199e), java.lang.Integer.valueOf(p16Var.f464199e)) && n51.f.a(this.f464200f, p16Var.f464200f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f464198d);
            fVar.e(3, this.f464199e);
            r45.hk hkVar = this.f464200f;
            if (hkVar != null) {
                fVar.i(4, hkVar.mo75928xcd1e8d8());
                this.f464200f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f464198d) + b36.f.e(3, this.f464199e);
            r45.hk hkVar2 = this.f464200f;
            return hkVar2 != null ? i18 + b36.f.i(4, hkVar2.mo75928xcd1e8d8()) : i18;
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
        r45.p16 p16Var = (r45.p16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                p16Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            p16Var.f464198d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            p16Var.f464199e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.hk hkVar3 = new r45.hk();
            if (bArr2 != null && bArr2.length > 0) {
                hkVar3.mo11468x92b714fd(bArr2);
            }
            p16Var.f464200f = hkVar3;
        }
        return 0;
    }
}
