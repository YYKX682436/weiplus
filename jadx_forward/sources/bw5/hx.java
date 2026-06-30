package bw5;

/* loaded from: classes2.dex */
public class hx extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109913d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.vy f109914e;

    /* renamed from: f, reason: collision with root package name */
    public int f109915f;

    /* renamed from: g, reason: collision with root package name */
    public long f109916g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109917h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f109918i = new boolean[6];

    static {
        new bw5.hx();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hx mo11468x92b714fd(byte[] bArr) {
        return (bw5.hx) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hx)) {
            return false;
        }
        bw5.hx hxVar = (bw5.hx) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109913d), java.lang.Integer.valueOf(hxVar.f109913d)) && n51.f.a(this.f109914e, hxVar.f109914e) && n51.f.a(java.lang.Integer.valueOf(this.f109915f), java.lang.Integer.valueOf(hxVar.f109915f)) && n51.f.a(java.lang.Long.valueOf(this.f109916g), java.lang.Long.valueOf(hxVar.f109916g)) && n51.f.a(this.f109917h, hxVar.f109917h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hx();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109918i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109913d);
            }
            bw5.vy vyVar = this.f109914e;
            if (vyVar != null && zArr[2]) {
                fVar.i(2, vyVar.mo75928xcd1e8d8());
                this.f109914e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109915f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f109916g);
            }
            java.lang.String str = this.f109917h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109913d) : 0;
            bw5.vy vyVar2 = this.f109914e;
            if (vyVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, vyVar2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f109915f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f109916g);
            }
            java.lang.String str2 = this.f109917h;
            return (str2 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str2);
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
            this.f109913d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f109915f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f109916g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f109917h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.vy vyVar3 = new bw5.vy();
            if (bArr != null && bArr.length > 0) {
                vyVar3.mo11468x92b714fd(bArr);
            }
            this.f109914e = vyVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
