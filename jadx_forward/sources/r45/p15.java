package r45;

/* loaded from: classes4.dex */
public class p15 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f464194d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464195e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ce4 f464196f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464197g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p15)) {
            return false;
        }
        r45.p15 p15Var = (r45.p15) fVar;
        return n51.f.a(this.f76492x92037252, p15Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f464194d), java.lang.Integer.valueOf(p15Var.f464194d)) && n51.f.a(this.f464195e, p15Var.f464195e) && n51.f.a(this.f464196f, p15Var.f464196f) && n51.f.a(this.f464197g, p15Var.f464197g);
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
            fVar.e(2, this.f464194d);
            java.lang.String str = this.f464195e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.ce4 ce4Var = this.f464196f;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.mo75928xcd1e8d8());
                this.f464196f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f464197g;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f464194d);
            java.lang.String str3 = this.f464195e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.ce4 ce4Var2 = this.f464196f;
            if (ce4Var2 != null) {
                i18 += b36.f.i(99, ce4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f464197g;
            return str4 != null ? i18 + b36.f.j(100, str4) : i18;
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
        r45.p15 p15Var = (r45.p15) objArr[1];
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
                p15Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            p15Var.f464194d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            p15Var.f464195e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 99) {
            if (intValue != 100) {
                return -1;
            }
            p15Var.f464197g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ce4 ce4Var3 = new r45.ce4();
            if (bArr2 != null && bArr2.length > 0) {
                ce4Var3.mo11468x92b714fd(bArr2);
            }
            p15Var.f464196f = ce4Var3;
        }
        return 0;
    }
}
