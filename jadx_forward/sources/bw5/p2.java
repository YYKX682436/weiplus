package bw5;

/* loaded from: classes4.dex */
public class p2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f112970d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f112971e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112972f;

    /* renamed from: g, reason: collision with root package name */
    public int f112973g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112974h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f112975i = new boolean[6];

    static {
        new bw5.p2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p2)) {
            return false;
        }
        bw5.p2 p2Var = (bw5.p2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f112970d), java.lang.Integer.valueOf(p2Var.f112970d)) && n51.f.a(this.f112971e, p2Var.f112971e) && n51.f.a(this.f112972f, p2Var.f112972f) && n51.f.a(java.lang.Integer.valueOf(this.f112973g), java.lang.Integer.valueOf(p2Var.f112973g)) && n51.f.a(this.f112974h, p2Var.f112974h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.p2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112975i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f112970d);
            }
            r45.cu5 cu5Var = this.f112971e;
            if (cu5Var != null && zArr[2]) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f112971e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f112972f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f112973g);
            }
            java.lang.String str2 = this.f112974h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f112970d) : 0;
            r45.cu5 cu5Var2 = this.f112971e;
            if (cu5Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f112972f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f112973g);
            }
            java.lang.String str4 = this.f112974h;
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
            this.f112970d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f112972f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f112973g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f112974h = aVar2.k(intValue);
            zArr[5] = true;
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
            this.f112971e = cu5Var3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.p2) super.mo11468x92b714fd(bArr);
    }
}
