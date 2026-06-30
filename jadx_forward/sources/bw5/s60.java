package bw5;

/* loaded from: classes2.dex */
public class s60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114351d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114352e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.e80 f114353f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114354g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114355h;

    /* renamed from: i, reason: collision with root package name */
    public int f114356i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f114357m = new boolean[7];

    static {
        new bw5.s60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.s60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s60)) {
            return false;
        }
        bw5.s60 s60Var = (bw5.s60) fVar;
        return n51.f.a(this.f114351d, s60Var.f114351d) && n51.f.a(this.f114352e, s60Var.f114352e) && n51.f.a(this.f114353f, s60Var.f114353f) && n51.f.a(this.f114354g, s60Var.f114354g) && n51.f.a(this.f114355h, s60Var.f114355h) && n51.f.a(java.lang.Integer.valueOf(this.f114356i), java.lang.Integer.valueOf(s60Var.f114356i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.s60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114357m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114351d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114352e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.e80 e80Var = this.f114353f;
            if (e80Var != null && zArr[3]) {
                fVar.i(3, e80Var.mo75928xcd1e8d8());
                this.f114353f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f114354g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f114355h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f114356i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f114351d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f114352e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            bw5.e80 e80Var2 = this.f114353f;
            if (e80Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, e80Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f114354g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f114355h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f114356i) : i18;
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
                this.f114351d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114352e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.e80 e80Var3 = new bw5.e80();
                    if (bArr != null && bArr.length > 0) {
                        e80Var3.mo11468x92b714fd(bArr);
                    }
                    this.f114353f = e80Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f114354g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114355h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114356i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
