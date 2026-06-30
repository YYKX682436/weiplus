package bw5;

/* loaded from: classes2.dex */
public class wd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f116189d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116190e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pj f116191f;

    /* renamed from: g, reason: collision with root package name */
    public int f116192g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116193h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116194i = new boolean[6];

    static {
        new bw5.wd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wd mo11468x92b714fd(byte[] bArr) {
        return (bw5.wd) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wd)) {
            return false;
        }
        bw5.wd wdVar = (bw5.wd) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116189d), java.lang.Long.valueOf(wdVar.f116189d)) && n51.f.a(this.f116190e, wdVar.f116190e) && n51.f.a(this.f116191f, wdVar.f116191f) && n51.f.a(java.lang.Integer.valueOf(this.f116192g), java.lang.Integer.valueOf(wdVar.f116192g)) && n51.f.a(this.f116193h, wdVar.f116193h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116194i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f116189d);
            }
            java.lang.String str = this.f116190e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.pj pjVar = this.f116191f;
            if (pjVar != null && zArr[3]) {
                fVar.i(3, pjVar.mo75928xcd1e8d8());
                this.f116191f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116192g);
            }
            java.lang.String str2 = this.f116193h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f116189d) : 0;
            java.lang.String str3 = this.f116190e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            bw5.pj pjVar2 = this.f116191f;
            if (pjVar2 != null && zArr[3]) {
                h17 += b36.f.i(3, pjVar2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f116192g);
            }
            java.lang.String str4 = this.f116193h;
            return (str4 == null || !zArr[5]) ? h17 : h17 + b36.f.j(5, str4);
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
            this.f116189d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116190e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f116192g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f116193h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr != null && bArr.length > 0) {
                pjVar3.mo11468x92b714fd(bArr);
            }
            this.f116191f = pjVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
