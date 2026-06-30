package bw5;

/* loaded from: classes9.dex */
public class q9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: v, reason: collision with root package name */
    public static final bw5.q9 f113531v = new bw5.q9();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113532d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113533e;

    /* renamed from: f, reason: collision with root package name */
    public long f113534f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113535g;

    /* renamed from: h, reason: collision with root package name */
    public int f113536h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113537i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f113538m;

    /* renamed from: n, reason: collision with root package name */
    public long f113539n;

    /* renamed from: o, reason: collision with root package name */
    public long f113540o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f113541p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f113542q;

    /* renamed from: r, reason: collision with root package name */
    public int f113543r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f113544s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f113545t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f113546u = new boolean[19];

    public bw5.q9 b(int i17) {
        this.f113536h = i17;
        this.f113546u[5] = true;
        return this;
    }

    public bw5.q9 c(long j17) {
        this.f113539n = j17;
        this.f113546u[9] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q9)) {
            return false;
        }
        bw5.q9 q9Var = (bw5.q9) fVar;
        return n51.f.a(this.f113532d, q9Var.f113532d) && n51.f.a(this.f113533e, q9Var.f113533e) && n51.f.a(java.lang.Long.valueOf(this.f113534f), java.lang.Long.valueOf(q9Var.f113534f)) && n51.f.a(this.f113535g, q9Var.f113535g) && n51.f.a(java.lang.Integer.valueOf(this.f113536h), java.lang.Integer.valueOf(q9Var.f113536h)) && n51.f.a(this.f113537i, q9Var.f113537i) && n51.f.a(java.lang.Boolean.valueOf(this.f113538m), java.lang.Boolean.valueOf(q9Var.f113538m)) && n51.f.a(java.lang.Long.valueOf(this.f113539n), java.lang.Long.valueOf(q9Var.f113539n)) && n51.f.a(java.lang.Long.valueOf(this.f113540o), java.lang.Long.valueOf(q9Var.f113540o)) && n51.f.a(this.f113541p, q9Var.f113541p) && n51.f.a(this.f113542q, q9Var.f113542q) && n51.f.a(java.lang.Integer.valueOf(this.f113543r), java.lang.Integer.valueOf(q9Var.f113543r)) && n51.f.a(this.f113544s, q9Var.f113544s) && n51.f.a(this.f113545t, q9Var.f113545t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113545t;
        java.util.LinkedList linkedList2 = this.f113544s;
        int i18 = 0;
        boolean[] zArr = this.f113546u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113532d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f113533e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.h(3, this.f113534f);
            }
            java.lang.String str3 = this.f113535g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113536h);
            }
            java.lang.String str4 = this.f113537i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.a(7, this.f113538m);
            }
            if (zArr[9]) {
                fVar.h(9, this.f113539n);
            }
            if (zArr[10]) {
                fVar.h(10, this.f113540o);
            }
            java.lang.String str5 = this.f113541p;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f113542q;
            if (str6 != null && zArr[12]) {
                fVar.j(12, str6);
            }
            if (zArr[16]) {
                fVar.e(16, this.f113543r);
            }
            fVar.g(17, 1, linkedList2);
            fVar.g(18, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f113532d;
            if (str7 != null && zArr[1]) {
                i18 = b36.f.j(1, str7) + 0;
            }
            java.lang.String str8 = this.f113533e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f113534f);
            }
            java.lang.String str9 = this.f113535g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f113536h);
            }
            java.lang.String str10 = this.f113537i;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f113538m);
            }
            if (zArr[9]) {
                i18 += b36.f.h(9, this.f113539n);
            }
            if (zArr[10]) {
                i18 += b36.f.h(10, this.f113540o);
            }
            java.lang.String str11 = this.f113541p;
            if (str11 != null && zArr[11]) {
                i18 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f113542q;
            if (str12 != null && zArr[12]) {
                i18 += b36.f.j(12, str12);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f113543r);
            }
            return i18 + b36.f.g(17, 1, linkedList2) + b36.f.g(18, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                this.f113532d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113533e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113534f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113535g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113536h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113537i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113538m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
            case 13:
            case 14:
            case 15:
            default:
                return -1;
            case 9:
                this.f113539n = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f113540o = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f113541p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f113542q = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 16:
                this.f113543r = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                linkedList2.add(aVar2.k(intValue));
                zArr[17] = true;
                return 0;
            case 18:
                linkedList.add(aVar2.k(intValue));
                zArr[18] = true;
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.q9) super.mo11468x92b714fd(bArr);
    }
}
