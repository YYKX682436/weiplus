package bw5;

/* loaded from: classes2.dex */
public class r60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113951d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113952e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.c80 f113953f;

    /* renamed from: g, reason: collision with root package name */
    public int f113954g;

    /* renamed from: h, reason: collision with root package name */
    public long f113955h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113956i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f113957m = new boolean[7];

    static {
        new bw5.r60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.r60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r60)) {
            return false;
        }
        bw5.r60 r60Var = (bw5.r60) fVar;
        return n51.f.a(this.f113951d, r60Var.f113951d) && n51.f.a(this.f113952e, r60Var.f113952e) && n51.f.a(this.f113953f, r60Var.f113953f) && n51.f.a(java.lang.Integer.valueOf(this.f113954g), java.lang.Integer.valueOf(r60Var.f113954g)) && n51.f.a(java.lang.Long.valueOf(this.f113955h), java.lang.Long.valueOf(r60Var.f113955h)) && n51.f.a(this.f113956i, r60Var.f113956i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.r60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113957m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113951d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f113952e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.c80 c80Var = this.f113953f;
            if (c80Var != null && zArr[3]) {
                fVar.i(3, c80Var.mo75928xcd1e8d8());
                this.f113953f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113954g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f113955h);
            }
            java.lang.String str3 = this.f113956i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f113951d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f113952e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            bw5.c80 c80Var2 = this.f113953f;
            if (c80Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, c80Var2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f113954g);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f113955h);
            }
            java.lang.String str6 = this.f113956i;
            return (str6 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str6);
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
                this.f113951d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113952e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.c80 c80Var3 = new bw5.c80();
                    if (bArr != null && bArr.length > 0) {
                        c80Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113953f = c80Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f113954g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113955h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113956i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
