package bw5;

/* loaded from: classes2.dex */
public class h80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109650d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109651e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o50 f109652f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.e80 f109653g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f109654h = new boolean[5];

    static {
        new bw5.h80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h80 mo11468x92b714fd(byte[] bArr) {
        return (bw5.h80) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h80)) {
            return false;
        }
        bw5.h80 h80Var = (bw5.h80) fVar;
        return n51.f.a(this.f109650d, h80Var.f109650d) && n51.f.a(this.f109651e, h80Var.f109651e) && n51.f.a(this.f109652f, h80Var.f109652f) && n51.f.a(this.f109653g, h80Var.f109653g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.h80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109654h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109650d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f109651e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.o50 o50Var = this.f109652f;
            if (o50Var != null && zArr[3]) {
                fVar.i(3, o50Var.mo75928xcd1e8d8());
                this.f109652f.mo75956x3d5d1f78(fVar);
            }
            bw5.e80 e80Var = this.f109653g;
            if (e80Var != null && zArr[4]) {
                fVar.i(4, e80Var.mo75928xcd1e8d8());
                this.f109653g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f109650d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f109651e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            bw5.o50 o50Var2 = this.f109652f;
            if (o50Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, o50Var2.mo75928xcd1e8d8());
            }
            bw5.e80 e80Var2 = this.f109653g;
            return (e80Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, e80Var2.mo75928xcd1e8d8());
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
            this.f109650d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f109651e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.o50 o50Var3 = new bw5.o50();
                if (bArr != null && bArr.length > 0) {
                    o50Var3.mo11468x92b714fd(bArr);
                }
                this.f109652f = o50Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.e80 e80Var3 = new bw5.e80();
            if (bArr2 != null && bArr2.length > 0) {
                e80Var3.mo11468x92b714fd(bArr2);
            }
            this.f109653g = e80Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
