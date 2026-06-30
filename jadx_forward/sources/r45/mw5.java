package r45;

/* loaded from: classes4.dex */
public class mw5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462401d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462402e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f462403f;

    /* renamed from: g, reason: collision with root package name */
    public long f462404g;

    static {
        new r45.mw5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mw5)) {
            return false;
        }
        r45.mw5 mw5Var = (r45.mw5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462401d), java.lang.Integer.valueOf(mw5Var.f462401d)) && n51.f.a(this.f462402e, mw5Var.f462402e) && n51.f.a(this.f462403f, mw5Var.f462403f) && n51.f.a(java.lang.Long.valueOf(this.f462404g), java.lang.Long.valueOf(mw5Var.f462404g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.mw5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462401d);
            java.lang.String str = this.f462402e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f462403f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f462403f.mo75956x3d5d1f78(fVar);
            }
            fVar.h(4, this.f462404g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462401d) + 0;
            java.lang.String str2 = this.f462402e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.cu5 cu5Var2 = this.f462403f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(3, cu5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.h(4, this.f462404g);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f462401d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f462402e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f462404g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            this.f462403f = cu5Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.mw5) super.mo11468x92b714fd(bArr);
    }
}
