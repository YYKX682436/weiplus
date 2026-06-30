package r45;

/* loaded from: classes8.dex */
public class nn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f463054d;

    /* renamed from: e, reason: collision with root package name */
    public r45.uk4 f463055e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463056f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nn)) {
            return false;
        }
        r45.nn nnVar = (r45.nn) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f463054d), java.lang.Boolean.valueOf(nnVar.f463054d)) && n51.f.a(this.f463055e, nnVar.f463055e) && n51.f.a(this.f463056f, nnVar.f463056f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f463054d);
            r45.uk4 uk4Var = this.f463055e;
            if (uk4Var != null) {
                fVar.i(2, uk4Var.mo75928xcd1e8d8());
                this.f463055e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f463056f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f463054d) + 0;
            r45.uk4 uk4Var2 = this.f463055e;
            if (uk4Var2 != null) {
                a17 += b36.f.i(2, uk4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f463056f;
            return str2 != null ? a17 + b36.f.j(3, str2) : a17;
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
        r45.nn nnVar = (r45.nn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nnVar.f463054d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            nnVar.f463056f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.uk4 uk4Var3 = new r45.uk4();
            if (bArr != null && bArr.length > 0) {
                uk4Var3.mo11468x92b714fd(bArr);
            }
            nnVar.f463055e = uk4Var3;
        }
        return 0;
    }
}
