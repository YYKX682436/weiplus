package r45;

/* loaded from: classes2.dex */
public class vr4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469997d;

    /* renamed from: e, reason: collision with root package name */
    public int f469998e;

    /* renamed from: f, reason: collision with root package name */
    public int f469999f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f470000g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vr4)) {
            return false;
        }
        r45.vr4 vr4Var = (r45.vr4) fVar;
        return n51.f.a(this.f76492x92037252, vr4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f469997d), java.lang.Integer.valueOf(vr4Var.f469997d)) && n51.f.a(java.lang.Integer.valueOf(this.f469998e), java.lang.Integer.valueOf(vr4Var.f469998e)) && n51.f.a(java.lang.Integer.valueOf(this.f469999f), java.lang.Integer.valueOf(vr4Var.f469999f)) && n51.f.a(java.lang.Boolean.valueOf(this.f470000g), java.lang.Boolean.valueOf(vr4Var.f470000g));
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
            fVar.e(2, this.f469997d);
            fVar.e(3, this.f469998e);
            fVar.e(4, this.f469999f);
            fVar.a(5, this.f470000g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469997d) + b36.f.e(3, this.f469998e) + b36.f.e(4, this.f469999f) + b36.f.a(5, this.f470000g);
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
        r45.vr4 vr4Var = (r45.vr4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                vr4Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            vr4Var.f469997d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            vr4Var.f469998e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            vr4Var.f469999f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        vr4Var.f470000g = aVar2.c(intValue);
        return 0;
    }
}
