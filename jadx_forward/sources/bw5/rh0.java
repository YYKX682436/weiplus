package bw5;

/* loaded from: classes4.dex */
public class rh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114066d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114067e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114068f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114069g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114070h;

    /* renamed from: i, reason: collision with root package name */
    public long f114071i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f114072m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.x7 f114073n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.vh0 f114074o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f114075p = new boolean[10];

    static {
        new bw5.rh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rh0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.rh0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rh0)) {
            return false;
        }
        bw5.rh0 rh0Var = (bw5.rh0) fVar;
        return n51.f.a(this.f114066d, rh0Var.f114066d) && n51.f.a(this.f114067e, rh0Var.f114067e) && n51.f.a(this.f114068f, rh0Var.f114068f) && n51.f.a(this.f114069g, rh0Var.f114069g) && n51.f.a(this.f114070h, rh0Var.f114070h) && n51.f.a(java.lang.Long.valueOf(this.f114071i), java.lang.Long.valueOf(rh0Var.f114071i)) && n51.f.a(this.f114072m, rh0Var.f114072m) && n51.f.a(this.f114073n, rh0Var.f114073n) && n51.f.a(this.f114074o, rh0Var.f114074o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114075p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114066d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114067e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f114068f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f114069g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f114070h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.h(6, this.f114071i);
            }
            java.lang.String str6 = this.f114072m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            bw5.x7 x7Var = this.f114073n;
            if (x7Var != null && zArr[8]) {
                fVar.i(8, x7Var.mo75928xcd1e8d8());
                this.f114073n.mo75956x3d5d1f78(fVar);
            }
            bw5.vh0 vh0Var = this.f114074o;
            if (vh0Var != null && zArr[9]) {
                fVar.i(9, vh0Var.mo75928xcd1e8d8());
                this.f114074o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f114066d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f114067e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f114068f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f114069g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f114070h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f114071i);
            }
            java.lang.String str12 = this.f114072m;
            if (str12 != null && zArr[7]) {
                i18 += b36.f.j(7, str12);
            }
            bw5.x7 x7Var2 = this.f114073n;
            if (x7Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, x7Var2.mo75928xcd1e8d8());
            }
            bw5.vh0 vh0Var2 = this.f114074o;
            return (vh0Var2 == null || !zArr[9]) ? i18 : i18 + b36.f.i(9, vh0Var2.mo75928xcd1e8d8());
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
                this.f114066d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114067e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114068f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114069g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114070h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114071i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114072m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr != null && bArr.length > 0) {
                        x7Var3.mo11468x92b714fd(bArr);
                    }
                    this.f114073n = x7Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.vh0 vh0Var3 = new bw5.vh0();
                    if (bArr2 != null && bArr2.length > 0) {
                        vh0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f114074o = vh0Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
