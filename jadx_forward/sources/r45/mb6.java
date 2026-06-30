package r45;

/* loaded from: classes4.dex */
public class mb6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461868d;

    /* renamed from: e, reason: collision with root package name */
    public long f461869e;

    /* renamed from: f, reason: collision with root package name */
    public int f461870f;

    /* renamed from: g, reason: collision with root package name */
    public int f461871g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mb6)) {
            return false;
        }
        r45.mb6 mb6Var = (r45.mb6) fVar;
        return n51.f.a(this.f76494x2de60e5e, mb6Var.f76494x2de60e5e) && n51.f.a(this.f461868d, mb6Var.f461868d) && n51.f.a(java.lang.Long.valueOf(this.f461869e), java.lang.Long.valueOf(mb6Var.f461869e)) && n51.f.a(java.lang.Integer.valueOf(this.f461870f), java.lang.Integer.valueOf(mb6Var.f461870f)) && n51.f.a(java.lang.Integer.valueOf(this.f461871g), java.lang.Integer.valueOf(mb6Var.f461871g));
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
            java.lang.String str = this.f461868d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f461869e);
            fVar.e(4, this.f461870f);
            fVar.e(5, this.f461871g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f461868d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.h(3, this.f461869e) + b36.f.e(4, this.f461870f) + b36.f.e(5, this.f461871g);
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
        r45.mb6 mb6Var = (r45.mb6) objArr[1];
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
                mb6Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mb6Var.f461868d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            mb6Var.f461869e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            mb6Var.f461870f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        mb6Var.f461871g = aVar2.g(intValue);
        return 0;
    }
}
