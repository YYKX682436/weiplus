package bw5;

/* loaded from: classes2.dex */
public class o90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.v70 f112554d;

    /* renamed from: e, reason: collision with root package name */
    public long f112555e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112556f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112557g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f112558h = new boolean[5];

    static {
        new bw5.o90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o90 mo11468x92b714fd(byte[] bArr) {
        return (bw5.o90) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o90)) {
            return false;
        }
        bw5.o90 o90Var = (bw5.o90) fVar;
        return n51.f.a(this.f112554d, o90Var.f112554d) && n51.f.a(java.lang.Long.valueOf(this.f112555e), java.lang.Long.valueOf(o90Var.f112555e)) && n51.f.a(java.lang.Boolean.valueOf(this.f112556f), java.lang.Boolean.valueOf(o90Var.f112556f)) && n51.f.a(this.f112557g, o90Var.f112557g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112558h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.v70 v70Var = this.f112554d;
            if (v70Var != null && zArr[1]) {
                fVar.i(1, v70Var.mo75928xcd1e8d8());
                this.f112554d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f112555e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f112556f);
            }
            java.lang.String str = this.f112557g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.v70 v70Var2 = this.f112554d;
            if (v70Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, v70Var2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f112555e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f112556f);
            }
            java.lang.String str2 = this.f112557g;
            return (str2 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str2);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f112555e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f112556f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f112557g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.v70 v70Var3 = new bw5.v70();
            if (bArr != null && bArr.length > 0) {
                v70Var3.mo11468x92b714fd(bArr);
            }
            this.f112554d = v70Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
