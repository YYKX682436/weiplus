package bw5;

/* loaded from: classes2.dex */
public class yb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116958d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116959e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o50 f116960f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.l60 f116961g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116962h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116963i = new boolean[6];

    static {
        new bw5.yb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.yb0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yb0)) {
            return false;
        }
        bw5.yb0 yb0Var = (bw5.yb0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116958d), java.lang.Integer.valueOf(yb0Var.f116958d)) && n51.f.a(this.f116959e, yb0Var.f116959e) && n51.f.a(this.f116960f, yb0Var.f116960f) && n51.f.a(this.f116961g, yb0Var.f116961g) && n51.f.a(this.f116962h, yb0Var.f116962h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116963i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116958d);
            }
            java.lang.String str = this.f116959e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.o50 o50Var = this.f116960f;
            if (o50Var != null && zArr[3]) {
                fVar.i(3, o50Var.mo75928xcd1e8d8());
                this.f116960f.mo75956x3d5d1f78(fVar);
            }
            bw5.l60 l60Var = this.f116961g;
            if (l60Var != null && zArr[4]) {
                fVar.i(4, l60Var.mo75928xcd1e8d8());
                this.f116961g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f116962h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116958d) : 0;
            java.lang.String str3 = this.f116959e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            bw5.o50 o50Var2 = this.f116960f;
            if (o50Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, o50Var2.mo75928xcd1e8d8());
            }
            bw5.l60 l60Var2 = this.f116961g;
            if (l60Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, l60Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f116962h;
            return (str4 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str4);
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
            this.f116958d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116959e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.o50 o50Var3 = new bw5.o50();
                if (bArr != null && bArr.length > 0) {
                    o50Var3.mo11468x92b714fd(bArr);
                }
                this.f116960f = o50Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f116962h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.l60 l60Var3 = new bw5.l60();
            if (bArr2 != null && bArr2.length > 0) {
                l60Var3.mo11468x92b714fd(bArr2);
            }
            this.f116961g = l60Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
