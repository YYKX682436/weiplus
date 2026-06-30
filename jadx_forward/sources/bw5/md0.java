package bw5;

/* loaded from: classes2.dex */
public class md0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111723d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111724e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111725f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111726g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111727h;

    /* renamed from: i, reason: collision with root package name */
    public int f111728i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f111730n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f111731o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f111732p;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f111729m = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f111733q = new boolean[11];

    static {
        new bw5.md0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.md0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.md0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.md0)) {
            return false;
        }
        bw5.md0 md0Var = (bw5.md0) fVar;
        return n51.f.a(this.f111723d, md0Var.f111723d) && n51.f.a(this.f111724e, md0Var.f111724e) && n51.f.a(this.f111725f, md0Var.f111725f) && n51.f.a(this.f111726g, md0Var.f111726g) && n51.f.a(this.f111727h, md0Var.f111727h) && n51.f.a(java.lang.Integer.valueOf(this.f111728i), java.lang.Integer.valueOf(md0Var.f111728i)) && n51.f.a(this.f111729m, md0Var.f111729m) && n51.f.a(this.f111730n, md0Var.f111730n) && n51.f.a(this.f111731o, md0Var.f111731o) && n51.f.a(this.f111732p, md0Var.f111732p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.md0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111729m;
        int i18 = 0;
        boolean[] zArr = this.f111733q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111723d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111724e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f111725f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f111726g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f111727h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f111728i);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str6 = this.f111730n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f111731o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f111732p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f111723d;
            if (str9 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str9);
            }
            java.lang.String str10 = this.f111724e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f111725f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f111726g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f111727h;
            if (str13 != null && zArr[5]) {
                i18 += b36.f.j(5, str13);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f111728i);
            }
            int g17 = i18 + b36.f.g(7, 8, linkedList);
            java.lang.String str14 = this.f111730n;
            if (str14 != null && zArr[8]) {
                g17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f111731o;
            if (str15 != null && zArr[9]) {
                g17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f111732p;
            return (str16 == null || !zArr[10]) ? g17 : g17 + b36.f.j(10, str16);
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.f111723d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111724e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111725f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111726g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111727h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111728i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ld0 ld0Var = new bw5.ld0();
                    if (bArr != null && bArr.length > 0) {
                        ld0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(ld0Var);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f111730n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111731o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f111732p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
