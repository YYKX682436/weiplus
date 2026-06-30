package r45;

/* loaded from: classes2.dex */
public class cp4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453295d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453296e;

    /* renamed from: f, reason: collision with root package name */
    public int f453297f;

    /* renamed from: g, reason: collision with root package name */
    public int f453298g;

    /* renamed from: h, reason: collision with root package name */
    public int f453299h;

    /* renamed from: i, reason: collision with root package name */
    public int f453300i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cp4)) {
            return false;
        }
        r45.cp4 cp4Var = (r45.cp4) fVar;
        return n51.f.a(this.f76494x2de60e5e, cp4Var.f76494x2de60e5e) && n51.f.a(this.f453295d, cp4Var.f453295d) && n51.f.a(this.f453296e, cp4Var.f453296e) && n51.f.a(java.lang.Integer.valueOf(this.f453297f), java.lang.Integer.valueOf(cp4Var.f453297f)) && n51.f.a(java.lang.Integer.valueOf(this.f453298g), java.lang.Integer.valueOf(cp4Var.f453298g)) && n51.f.a(java.lang.Integer.valueOf(this.f453299h), java.lang.Integer.valueOf(cp4Var.f453299h)) && n51.f.a(java.lang.Integer.valueOf(this.f453300i), java.lang.Integer.valueOf(cp4Var.f453300i));
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
            java.lang.String str = this.f453295d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f453296e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f453297f);
            fVar.e(5, this.f453298g);
            fVar.e(6, this.f453299h);
            fVar.e(7, this.f453300i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f453295d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f453296e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f453297f) + b36.f.e(5, this.f453298g) + b36.f.e(6, this.f453299h) + b36.f.e(7, this.f453300i);
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
        r45.cp4 cp4Var = (r45.cp4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    cp4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                cp4Var.f453295d = aVar2.k(intValue);
                return 0;
            case 3:
                cp4Var.f453296e = aVar2.k(intValue);
                return 0;
            case 4:
                cp4Var.f453297f = aVar2.g(intValue);
                return 0;
            case 5:
                cp4Var.f453298g = aVar2.g(intValue);
                return 0;
            case 6:
                cp4Var.f453299h = aVar2.g(intValue);
                return 0;
            case 7:
                cp4Var.f453300i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
