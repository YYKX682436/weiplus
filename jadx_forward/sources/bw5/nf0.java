package bw5;

/* loaded from: classes4.dex */
public class nf0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f112197d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.x7 f112198e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112199f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112200g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112201h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f112202i = new boolean[6];

    static {
        new bw5.nf0();
    }

    public bw5.x7 b() {
        return this.f112202i[2] ? this.f112198e : new bw5.x7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.nf0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.nf0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nf0)) {
            return false;
        }
        bw5.nf0 nf0Var = (bw5.nf0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f112197d), java.lang.Long.valueOf(nf0Var.f112197d)) && n51.f.a(this.f112198e, nf0Var.f112198e) && n51.f.a(this.f112199f, nf0Var.f112199f) && n51.f.a(this.f112200g, nf0Var.f112200g) && n51.f.a(this.f112201h, nf0Var.f112201h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nf0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112202i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f112197d);
            }
            bw5.x7 x7Var = this.f112198e;
            if (x7Var != null && zArr[2]) {
                fVar.i(2, x7Var.mo75928xcd1e8d8());
                this.f112198e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f112199f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f112200g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f112201h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f112197d) : 0;
            bw5.x7 x7Var2 = this.f112198e;
            if (x7Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, x7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f112199f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f112200g;
            if (str5 != null && zArr[4]) {
                h17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f112201h;
            return (str6 == null || !zArr[5]) ? h17 : h17 + b36.f.j(5, str6);
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
            this.f112197d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f112199f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f112200g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f112201h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.mo11468x92b714fd(bArr);
            }
            this.f112198e = x7Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
