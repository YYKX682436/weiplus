package bw5;

/* loaded from: classes2.dex */
public class zc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.yr f117468d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.nd0 f117469e;

    /* renamed from: f, reason: collision with root package name */
    public int f117470f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f117471g = new boolean[4];

    static {
        new bw5.zc0();
    }

    public bw5.yr b() {
        return this.f117471g[1] ? this.f117468d : new bw5.yr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.zc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.zc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zc0)) {
            return false;
        }
        bw5.zc0 zc0Var = (bw5.zc0) fVar;
        return n51.f.a(this.f117468d, zc0Var.f117468d) && n51.f.a(this.f117469e, zc0Var.f117469e) && n51.f.a(java.lang.Integer.valueOf(this.f117470f), java.lang.Integer.valueOf(zc0Var.f117470f));
    }

    public bw5.zc0 d(bw5.yr yrVar) {
        this.f117468d = yrVar;
        this.f117471g[1] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117471g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.yr yrVar = this.f117468d;
            if (yrVar != null && zArr[1]) {
                fVar.i(1, yrVar.mo75928xcd1e8d8());
                this.f117468d.mo75956x3d5d1f78(fVar);
            }
            bw5.nd0 nd0Var = this.f117469e;
            if (nd0Var != null && zArr[2]) {
                fVar.i(2, nd0Var.mo75928xcd1e8d8());
                this.f117469e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117470f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.yr yrVar2 = this.f117468d;
            if (yrVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, yrVar2.mo75928xcd1e8d8());
            }
            bw5.nd0 nd0Var2 = this.f117469e;
            if (nd0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, nd0Var2.mo75928xcd1e8d8());
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f117470f) : i18;
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
                bw5.yr yrVar3 = new bw5.yr();
                if (bArr != null && bArr.length > 0) {
                    yrVar3.mo11468x92b714fd(bArr);
                }
                this.f117468d = yrVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f117470f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.nd0 nd0Var3 = new bw5.nd0();
            if (bArr2 != null && bArr2.length > 0) {
                nd0Var3.mo11468x92b714fd(bArr2);
            }
            this.f117469e = nd0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
