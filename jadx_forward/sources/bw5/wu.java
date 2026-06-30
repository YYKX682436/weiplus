package bw5;

/* loaded from: classes2.dex */
public class wu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116388d;

    /* renamed from: e, reason: collision with root package name */
    public int f116389e;

    /* renamed from: f, reason: collision with root package name */
    public int f116390f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116391g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.pj f116392h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116393i = new boolean[6];

    static {
        new bw5.wu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wu mo11468x92b714fd(byte[] bArr) {
        return (bw5.wu) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wu)) {
            return false;
        }
        bw5.wu wuVar = (bw5.wu) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116388d), java.lang.Integer.valueOf(wuVar.f116388d)) && n51.f.a(java.lang.Integer.valueOf(this.f116389e), java.lang.Integer.valueOf(wuVar.f116389e)) && n51.f.a(java.lang.Integer.valueOf(this.f116390f), java.lang.Integer.valueOf(wuVar.f116390f)) && n51.f.a(this.f116391g, wuVar.f116391g) && n51.f.a(this.f116392h, wuVar.f116392h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116393i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116388d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116389e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116390f);
            }
            java.lang.String str = this.f116391g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            bw5.pj pjVar = this.f116392h;
            if (pjVar != null && zArr[5]) {
                fVar.i(5, pjVar.mo75928xcd1e8d8());
                this.f116392h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116388d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f116389e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f116390f);
            }
            java.lang.String str2 = this.f116391g;
            if (str2 != null && zArr[4]) {
                e17 += b36.f.j(4, str2);
            }
            bw5.pj pjVar2 = this.f116392h;
            return (pjVar2 == null || !zArr[5]) ? e17 : e17 + b36.f.i(5, pjVar2.mo75928xcd1e8d8());
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
            this.f116388d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116389e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116390f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f116391g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr != null && bArr.length > 0) {
                pjVar3.mo11468x92b714fd(bArr);
            }
            this.f116392h = pjVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
