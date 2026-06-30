package bw5;

/* loaded from: classes2.dex */
public class lk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f111363d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ok f111364e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.nk f111365f;

    /* renamed from: g, reason: collision with root package name */
    public int f111366g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111367h = new boolean[5];

    static {
        new bw5.lk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lk mo11468x92b714fd(byte[] bArr) {
        return (bw5.lk) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lk)) {
            return false;
        }
        bw5.lk lkVar = (bw5.lk) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111363d), java.lang.Integer.valueOf(lkVar.f111363d)) && n51.f.a(this.f111364e, lkVar.f111364e) && n51.f.a(this.f111365f, lkVar.f111365f) && n51.f.a(java.lang.Integer.valueOf(this.f111366g), java.lang.Integer.valueOf(lkVar.f111366g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111367h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f111363d);
            }
            bw5.ok okVar = this.f111364e;
            if (okVar != null && zArr[2]) {
                fVar.i(2, okVar.mo75928xcd1e8d8());
                this.f111364e.mo75956x3d5d1f78(fVar);
            }
            bw5.nk nkVar = this.f111365f;
            if (nkVar != null && zArr[3]) {
                fVar.i(3, nkVar.mo75928xcd1e8d8());
                this.f111365f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111366g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f111363d) : 0;
            bw5.ok okVar2 = this.f111364e;
            if (okVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, okVar2.mo75928xcd1e8d8());
            }
            bw5.nk nkVar2 = this.f111365f;
            if (nkVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, nkVar2.mo75928xcd1e8d8());
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f111366g) : e17;
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
            this.f111363d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.ok okVar3 = new bw5.ok();
                if (bArr != null && bArr.length > 0) {
                    okVar3.mo11468x92b714fd(bArr);
                }
                this.f111364e = okVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f111366g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.nk nkVar3 = new bw5.nk();
            if (bArr2 != null && bArr2.length > 0) {
                nkVar3.mo11468x92b714fd(bArr2);
            }
            this.f111365f = nkVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
