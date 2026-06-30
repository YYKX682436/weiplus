package bw5;

/* loaded from: classes2.dex */
public class on0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f112693d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112694e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112695f;

    /* renamed from: g, reason: collision with root package name */
    public int f112696g;

    /* renamed from: h, reason: collision with root package name */
    public int f112697h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112698i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112699m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f112700n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f112701o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f112702p = new boolean[10];

    static {
        new bw5.on0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.on0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.on0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.on0)) {
            return false;
        }
        bw5.on0 on0Var = (bw5.on0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f112693d), java.lang.Integer.valueOf(on0Var.f112693d)) && n51.f.a(this.f112694e, on0Var.f112694e) && n51.f.a(this.f112695f, on0Var.f112695f) && n51.f.a(java.lang.Integer.valueOf(this.f112696g), java.lang.Integer.valueOf(on0Var.f112696g)) && n51.f.a(java.lang.Integer.valueOf(this.f112697h), java.lang.Integer.valueOf(on0Var.f112697h)) && n51.f.a(this.f112698i, on0Var.f112698i) && n51.f.a(this.f112699m, on0Var.f112699m) && n51.f.a(this.f112700n, on0Var.f112700n) && n51.f.a(this.f112701o, on0Var.f112701o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.on0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112702p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f112693d);
            }
            java.lang.String str = this.f112694e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f112695f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f112696g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f112697h);
            }
            java.lang.String str3 = this.f112698i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f112699m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f112700n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f112701o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f112693d) : 0;
            java.lang.String str7 = this.f112694e;
            if (str7 != null && zArr[2]) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f112695f;
            if (str8 != null && zArr[3]) {
                e17 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f112696g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f112697h);
            }
            java.lang.String str9 = this.f112698i;
            if (str9 != null && zArr[6]) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f112699m;
            if (str10 != null && zArr[7]) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f112700n;
            if (str11 != null && zArr[8]) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f112701o;
            return (str12 == null || !zArr[9]) ? e17 : e17 + b36.f.j(9, str12);
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
                this.f112693d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112694e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112695f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112696g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112697h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112698i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112699m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112700n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112701o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
