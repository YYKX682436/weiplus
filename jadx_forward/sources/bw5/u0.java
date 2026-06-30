package bw5;

/* loaded from: classes12.dex */
public class u0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115204d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115205e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115206f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115207g;

    /* renamed from: h, reason: collision with root package name */
    public long f115208h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f115209i;

    /* renamed from: m, reason: collision with root package name */
    public long f115210m;

    /* renamed from: n, reason: collision with root package name */
    public long f115211n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f115212o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f115213p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f115214q;

    /* renamed from: r, reason: collision with root package name */
    public int f115215r;

    /* renamed from: s, reason: collision with root package name */
    public int f115216s;

    static {
        new bw5.u0();
    }

    public long b() {
        return this.f115210m;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.u0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.u0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u0)) {
            return false;
        }
        bw5.u0 u0Var = (bw5.u0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115204d), java.lang.Integer.valueOf(u0Var.f115204d)) && n51.f.a(this.f115205e, u0Var.f115205e) && n51.f.a(this.f115206f, u0Var.f115206f) && n51.f.a(this.f115207g, u0Var.f115207g) && n51.f.a(java.lang.Long.valueOf(this.f115208h), java.lang.Long.valueOf(u0Var.f115208h)) && n51.f.a(this.f115209i, u0Var.f115209i) && n51.f.a(java.lang.Long.valueOf(this.f115210m), java.lang.Long.valueOf(u0Var.f115210m)) && n51.f.a(java.lang.Long.valueOf(this.f115211n), java.lang.Long.valueOf(u0Var.f115211n)) && n51.f.a(this.f115212o, u0Var.f115212o) && n51.f.a(this.f115213p, u0Var.f115213p) && n51.f.a(this.f115214q, u0Var.f115214q) && n51.f.a(java.lang.Integer.valueOf(this.f115215r), java.lang.Integer.valueOf(u0Var.f115215r)) && n51.f.a(java.lang.Integer.valueOf(this.f115216s), java.lang.Integer.valueOf(u0Var.f115216s));
    }

    /* renamed from: getCreateTime */
    public long m13072x3fdd41df() {
        return this.f115208h;
    }

    /* renamed from: getFromUsername */
    public java.lang.String m13073xc0914d16() {
        return this.f115205e;
    }

    /* renamed from: getToUsername */
    public java.lang.String m13074xdd380867() {
        return this.f115206f;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.u0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115213p;
        java.util.LinkedList linkedList2 = this.f115212o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f115204d);
            java.lang.String str = this.f115205e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f115206f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f115207g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.h(5, this.f115208h);
            java.lang.String str4 = this.f115209i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.h(7, this.f115210m);
            fVar.h(8, this.f115211n);
            fVar.g(9, 1, linkedList2);
            fVar.g(10, 2, linkedList);
            java.lang.String str5 = this.f115214q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            fVar.e(12, this.f115215r);
            fVar.e(13, this.f115216s);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f115204d) + 0;
            java.lang.String str6 = this.f115205e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f115206f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f115207g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            int h17 = e17 + b36.f.h(5, this.f115208h);
            java.lang.String str9 = this.f115209i;
            if (str9 != null) {
                h17 += b36.f.j(6, str9);
            }
            int h18 = h17 + b36.f.h(7, this.f115210m) + b36.f.h(8, this.f115211n) + b36.f.g(9, 1, linkedList2) + b36.f.g(10, 2, linkedList);
            java.lang.String str10 = this.f115214q;
            if (str10 != null) {
                h18 += b36.f.j(11, str10);
            }
            return h18 + b36.f.e(12, this.f115215r) + b36.f.e(13, this.f115216s);
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
                this.f115204d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f115205e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f115206f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f115207g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f115208h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f115209i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f115210m = aVar2.i(intValue);
                return 0;
            case 8:
                this.f115211n = aVar2.i(intValue);
                return 0;
            case 9:
                linkedList2.add(aVar2.k(intValue));
                return 0;
            case 10:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 11:
                this.f115214q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f115215r = aVar2.g(intValue);
                return 0;
            case 13:
                this.f115216s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
