package bw5;

/* loaded from: classes2.dex */
public class tk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f115024d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115025e;

    /* renamed from: f, reason: collision with root package name */
    public long f115026f;

    /* renamed from: g, reason: collision with root package name */
    public int f115027g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f115028h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f115029i = new boolean[6];

    static {
        new bw5.tk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tk mo11468x92b714fd(byte[] bArr) {
        return (bw5.tk) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tk)) {
            return false;
        }
        bw5.tk tkVar = (bw5.tk) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f115024d), java.lang.Long.valueOf(tkVar.f115024d)) && n51.f.a(this.f115025e, tkVar.f115025e) && n51.f.a(java.lang.Long.valueOf(this.f115026f), java.lang.Long.valueOf(tkVar.f115026f)) && n51.f.a(java.lang.Integer.valueOf(this.f115027g), java.lang.Integer.valueOf(tkVar.f115027g)) && n51.f.a(java.lang.Boolean.valueOf(this.f115028h), java.lang.Boolean.valueOf(tkVar.f115028h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115029i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f115024d);
            }
            java.lang.String str = this.f115025e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f115026f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115027g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f115028h);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f115024d) : 0;
            java.lang.String str2 = this.f115025e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f115026f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f115027g);
            }
            return zArr[5] ? h17 + b36.f.a(5, this.f115028h) : h17;
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
            this.f115024d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115025e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f115026f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f115027g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f115028h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
