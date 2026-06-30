package bw5;

/* loaded from: classes2.dex */
public class w1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116088d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116089e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.am f116090f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116091g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.am f116092h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116093i = new boolean[6];

    static {
        new bw5.w1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w1 mo11468x92b714fd(byte[] bArr) {
        return (bw5.w1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w1)) {
            return false;
        }
        bw5.w1 w1Var = (bw5.w1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116088d), java.lang.Integer.valueOf(w1Var.f116088d)) && n51.f.a(this.f116089e, w1Var.f116089e) && n51.f.a(this.f116090f, w1Var.f116090f) && n51.f.a(this.f116091g, w1Var.f116091g) && n51.f.a(this.f116092h, w1Var.f116092h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.w1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116093i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116088d);
            }
            java.lang.String str = this.f116089e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.am amVar = this.f116090f;
            if (amVar != null && zArr[3]) {
                fVar.i(3, amVar.mo75928xcd1e8d8());
                this.f116090f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f116091g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.am amVar2 = this.f116092h;
            if (amVar2 != null && zArr[5]) {
                fVar.i(5, amVar2.mo75928xcd1e8d8());
                this.f116092h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116088d) : 0;
            java.lang.String str3 = this.f116089e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            bw5.am amVar3 = this.f116090f;
            if (amVar3 != null && zArr[3]) {
                e17 += b36.f.i(3, amVar3.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f116091g;
            if (str4 != null && zArr[4]) {
                e17 += b36.f.j(4, str4);
            }
            bw5.am amVar4 = this.f116092h;
            return (amVar4 == null || !zArr[5]) ? e17 : e17 + b36.f.i(5, amVar4.mo75928xcd1e8d8());
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
            this.f116088d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116089e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.am amVar5 = new bw5.am();
                if (bArr != null && bArr.length > 0) {
                    amVar5.mo11468x92b714fd(bArr);
                }
                this.f116090f = amVar5;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f116091g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.am amVar6 = new bw5.am();
            if (bArr2 != null && bArr2.length > 0) {
                amVar6.mo11468x92b714fd(bArr2);
            }
            this.f116092h = amVar6;
        }
        zArr[5] = true;
        return 0;
    }
}
