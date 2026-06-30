package bw5;

/* loaded from: classes2.dex */
public class to extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115072d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115073e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.j10 f115074f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115075g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.so f115076h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f115077i = new boolean[6];

    static {
        new bw5.to();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.to mo11468x92b714fd(byte[] bArr) {
        return (bw5.to) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.to)) {
            return false;
        }
        bw5.to toVar = (bw5.to) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115072d), java.lang.Integer.valueOf(toVar.f115072d)) && n51.f.a(this.f115073e, toVar.f115073e) && n51.f.a(this.f115074f, toVar.f115074f) && n51.f.a(this.f115075g, toVar.f115075g) && n51.f.a(this.f115076h, toVar.f115076h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.to();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115077i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115072d);
            }
            java.lang.String str = this.f115073e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.j10 j10Var = this.f115074f;
            if (j10Var != null && zArr[3]) {
                fVar.i(3, j10Var.mo75928xcd1e8d8());
                this.f115074f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f115075g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.so soVar = this.f115076h;
            if (soVar != null && zArr[5]) {
                fVar.i(5, soVar.mo75928xcd1e8d8());
                this.f115076h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f115072d) : 0;
            java.lang.String str3 = this.f115073e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            bw5.j10 j10Var2 = this.f115074f;
            if (j10Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, j10Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f115075g;
            if (str4 != null && zArr[4]) {
                e17 += b36.f.j(4, str4);
            }
            bw5.so soVar2 = this.f115076h;
            return (soVar2 == null || !zArr[5]) ? e17 : e17 + b36.f.i(5, soVar2.mo75928xcd1e8d8());
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
            this.f115072d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115073e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.j10 j10Var3 = new bw5.j10();
                if (bArr != null && bArr.length > 0) {
                    j10Var3.mo11468x92b714fd(bArr);
                }
                this.f115074f = j10Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f115075g = aVar2.k(intValue);
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
            bw5.so soVar3 = new bw5.so();
            if (bArr2 != null && bArr2.length > 0) {
                soVar3.mo11468x92b714fd(bArr2);
            }
            this.f115076h = soVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
