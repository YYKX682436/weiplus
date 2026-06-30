package bw5;

/* loaded from: classes2.dex */
public class hm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109800d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.gm f109801e;

    /* renamed from: f, reason: collision with root package name */
    public int f109802f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109803g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.pj f109804h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f109805i = new boolean[6];

    static {
        new bw5.hm();
    }

    public bw5.gm b() {
        return this.f109805i[2] ? this.f109801e : new bw5.gm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.hm mo11468x92b714fd(byte[] bArr) {
        return (bw5.hm) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hm)) {
            return false;
        }
        bw5.hm hmVar = (bw5.hm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109800d), java.lang.Integer.valueOf(hmVar.f109800d)) && n51.f.a(this.f109801e, hmVar.f109801e) && n51.f.a(java.lang.Integer.valueOf(this.f109802f), java.lang.Integer.valueOf(hmVar.f109802f)) && n51.f.a(this.f109803g, hmVar.f109803g) && n51.f.a(this.f109804h, hmVar.f109804h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109805i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109800d);
            }
            bw5.gm gmVar = this.f109801e;
            if (gmVar != null && zArr[2]) {
                fVar.i(2, gmVar.mo75928xcd1e8d8());
                this.f109801e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109802f);
            }
            java.lang.String str = this.f109803g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            bw5.pj pjVar = this.f109804h;
            if (pjVar != null && zArr[5]) {
                fVar.i(5, pjVar.mo75928xcd1e8d8());
                this.f109804h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109800d) : 0;
            bw5.gm gmVar2 = this.f109801e;
            if (gmVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, gmVar2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f109802f);
            }
            java.lang.String str2 = this.f109803g;
            if (str2 != null && zArr[4]) {
                e17 += b36.f.j(4, str2);
            }
            bw5.pj pjVar2 = this.f109804h;
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
            this.f109800d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.gm gmVar3 = new bw5.gm();
                if (bArr != null && bArr.length > 0) {
                    gmVar3.mo11468x92b714fd(bArr);
                }
                this.f109801e = gmVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109802f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f109803g = aVar2.k(intValue);
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
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr2 != null && bArr2.length > 0) {
                pjVar3.mo11468x92b714fd(bArr2);
            }
            this.f109804h = pjVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
