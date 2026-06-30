package bw5;

/* loaded from: classes2.dex */
public class n90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112100d;

    /* renamed from: e, reason: collision with root package name */
    public long f112101e;

    /* renamed from: f, reason: collision with root package name */
    public long f112102f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.mc0 f112103g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112104h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112105i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112106m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f112107n = new boolean[8];

    static {
        new bw5.n90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n90 mo11468x92b714fd(byte[] bArr) {
        return (bw5.n90) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n90)) {
            return false;
        }
        bw5.n90 n90Var = (bw5.n90) fVar;
        return n51.f.a(this.f112100d, n90Var.f112100d) && n51.f.a(java.lang.Long.valueOf(this.f112101e), java.lang.Long.valueOf(n90Var.f112101e)) && n51.f.a(java.lang.Long.valueOf(this.f112102f), java.lang.Long.valueOf(n90Var.f112102f)) && n51.f.a(this.f112103g, n90Var.f112103g) && n51.f.a(this.f112104h, n90Var.f112104h) && n51.f.a(this.f112105i, n90Var.f112105i) && n51.f.a(this.f112106m, n90Var.f112106m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112107n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112100d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f112101e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f112102f);
            }
            bw5.mc0 mc0Var = this.f112103g;
            if (mc0Var != null && zArr[4]) {
                fVar.i(4, mc0Var.mo75928xcd1e8d8());
                this.f112103g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f112104h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f112105i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f112106m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f112100d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f112101e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f112102f);
            }
            bw5.mc0 mc0Var2 = this.f112103g;
            if (mc0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, mc0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f112104h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f112105i;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f112106m;
            return (str8 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str8);
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
        switch (intValue) {
            case 1:
                this.f112100d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112101e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112102f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f112103g = mc0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f112104h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112105i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112106m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
