package r45;

/* loaded from: classes8.dex */
public class e6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: f, reason: collision with root package name */
    public static final r45.e6 f454570f = new r45.e6();

    /* renamed from: d, reason: collision with root package name */
    public r45.s5 f454571d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f6 f454572e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e6)) {
            return false;
        }
        r45.e6 e6Var = (r45.e6) fVar;
        return n51.f.a(this.f454571d, e6Var.f454571d) && n51.f.a(this.f454572e, e6Var.f454572e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.e6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.s5 s5Var = this.f454571d;
            if (s5Var != null) {
                fVar.i(1, s5Var.mo75928xcd1e8d8());
                this.f454571d.mo75956x3d5d1f78(fVar);
            }
            r45.f6 f6Var = this.f454572e;
            if (f6Var != null) {
                fVar.i(2, f6Var.mo75928xcd1e8d8());
                this.f454572e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.s5 s5Var2 = this.f454571d;
            int i18 = s5Var2 != null ? 0 + b36.f.i(1, s5Var2.mo75928xcd1e8d8()) : 0;
            r45.f6 f6Var2 = this.f454572e;
            return f6Var2 != null ? i18 + b36.f.i(2, f6Var2.mo75928xcd1e8d8()) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.s5 s5Var3 = new r45.s5();
                if (bArr != null && bArr.length > 0) {
                    s5Var3.mo11468x92b714fd(bArr);
                }
                this.f454571d = s5Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.f6 f6Var3 = new r45.f6();
            if (bArr2 != null && bArr2.length > 0) {
                f6Var3.mo11468x92b714fd(bArr2);
            }
            this.f454572e = f6Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.e6) super.mo11468x92b714fd(bArr);
    }
}
