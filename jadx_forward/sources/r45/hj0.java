package r45;

/* loaded from: classes12.dex */
public class hj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.zj0 f457743d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ij0 f457744e;

    static {
        new r45.hj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.hj0 mo11468x92b714fd(byte[] bArr) {
        return (r45.hj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hj0)) {
            return false;
        }
        r45.hj0 hj0Var = (r45.hj0) fVar;
        return n51.f.a(this.f457743d, hj0Var.f457743d) && n51.f.a(this.f457744e, hj0Var.f457744e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.hj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.zj0 zj0Var = this.f457743d;
            if (zj0Var != null) {
                fVar.i(1, zj0Var.mo75928xcd1e8d8());
                this.f457743d.mo75956x3d5d1f78(fVar);
            }
            r45.ij0 ij0Var = this.f457744e;
            if (ij0Var != null) {
                fVar.i(2, ij0Var.mo75928xcd1e8d8());
                this.f457744e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.zj0 zj0Var2 = this.f457743d;
            int i18 = zj0Var2 != null ? 0 + b36.f.i(1, zj0Var2.mo75928xcd1e8d8()) : 0;
            r45.ij0 ij0Var2 = this.f457744e;
            return ij0Var2 != null ? i18 + b36.f.i(2, ij0Var2.mo75928xcd1e8d8()) : i18;
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
                r45.zj0 zj0Var3 = new r45.zj0();
                if (bArr != null && bArr.length > 0) {
                    zj0Var3.mo11468x92b714fd(bArr);
                }
                this.f457743d = zj0Var3;
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
            r45.ij0 ij0Var3 = new r45.ij0();
            if (bArr2 != null && bArr2.length > 0) {
                ij0Var3.mo11468x92b714fd(bArr2);
            }
            this.f457744e = ij0Var3;
        }
        return 0;
    }
}
