package bw5;

/* loaded from: classes2.dex */
public class mh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f111772d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111773e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111774f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.x7 f111775g;

    /* renamed from: h, reason: collision with root package name */
    public int f111776h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f111777i = new boolean[6];

    static {
        new bw5.mh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mh0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.mh0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mh0)) {
            return false;
        }
        bw5.mh0 mh0Var = (bw5.mh0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f111772d), java.lang.Long.valueOf(mh0Var.f111772d)) && n51.f.a(this.f111773e, mh0Var.f111773e) && n51.f.a(this.f111774f, mh0Var.f111774f) && n51.f.a(this.f111775g, mh0Var.f111775g) && n51.f.a(java.lang.Integer.valueOf(this.f111776h), java.lang.Integer.valueOf(mh0Var.f111776h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111777i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f111772d);
            }
            java.lang.String str = this.f111773e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f111774f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.x7 x7Var = this.f111775g;
            if (x7Var != null && zArr[4]) {
                fVar.i(4, x7Var.mo75928xcd1e8d8());
                this.f111775g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f111776h);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f111772d) : 0;
            java.lang.String str3 = this.f111773e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f111774f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            bw5.x7 x7Var2 = this.f111775g;
            if (x7Var2 != null && zArr[4]) {
                h17 += b36.f.i(4, x7Var2.mo75928xcd1e8d8());
            }
            return zArr[5] ? h17 + b36.f.e(5, this.f111776h) : h17;
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
            this.f111772d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111773e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f111774f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f111776h = aVar2.g(intValue);
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
            this.f111775g = x7Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
