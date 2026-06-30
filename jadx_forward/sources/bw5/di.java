package bw5;

/* loaded from: classes2.dex */
public class di extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ij f108028d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ij f108029e;

    /* renamed from: f, reason: collision with root package name */
    public int f108030f;

    /* renamed from: g, reason: collision with root package name */
    public int f108031g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f108032h = new boolean[5];

    static {
        new bw5.di();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.di mo11468x92b714fd(byte[] bArr) {
        return (bw5.di) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.di)) {
            return false;
        }
        bw5.di diVar = (bw5.di) fVar;
        return n51.f.a(this.f108028d, diVar.f108028d) && n51.f.a(this.f108029e, diVar.f108029e) && n51.f.a(java.lang.Integer.valueOf(this.f108030f), java.lang.Integer.valueOf(diVar.f108030f)) && n51.f.a(java.lang.Integer.valueOf(this.f108031g), java.lang.Integer.valueOf(diVar.f108031g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.di();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108032h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ij ijVar = this.f108028d;
            if (ijVar != null && zArr[1]) {
                fVar.i(1, ijVar.mo75928xcd1e8d8());
                this.f108028d.mo75956x3d5d1f78(fVar);
            }
            bw5.ij ijVar2 = this.f108029e;
            if (ijVar2 != null && zArr[2]) {
                fVar.i(2, ijVar2.mo75928xcd1e8d8());
                this.f108029e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f108030f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f108031g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ij ijVar3 = this.f108028d;
            if (ijVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ijVar3.mo75928xcd1e8d8());
            }
            bw5.ij ijVar4 = this.f108029e;
            if (ijVar4 != null && zArr[2]) {
                i18 += b36.f.i(2, ijVar4.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f108030f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f108031g) : i18;
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
                bw5.ij ijVar5 = new bw5.ij();
                if (bArr != null && bArr.length > 0) {
                    ijVar5.mo11468x92b714fd(bArr);
                }
                this.f108028d = ijVar5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f108030f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f108031g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.ij ijVar6 = new bw5.ij();
            if (bArr2 != null && bArr2.length > 0) {
                ijVar6.mo11468x92b714fd(bArr2);
            }
            this.f108029e = ijVar6;
        }
        zArr[2] = true;
        return 0;
    }
}
