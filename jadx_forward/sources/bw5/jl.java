package bw5;

/* loaded from: classes2.dex */
public class jl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110540d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110543g;

    /* renamed from: h, reason: collision with root package name */
    public int f110544h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f110545i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f110546m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f110547n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f110541e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f110542f = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f110548o = new boolean[9];

    static {
        new bw5.jl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jl mo11468x92b714fd(byte[] bArr) {
        return (bw5.jl) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jl)) {
            return false;
        }
        bw5.jl jlVar = (bw5.jl) fVar;
        return n51.f.a(this.f110540d, jlVar.f110540d) && n51.f.a(this.f110541e, jlVar.f110541e) && n51.f.a(this.f110542f, jlVar.f110542f) && n51.f.a(this.f110543g, jlVar.f110543g) && n51.f.a(java.lang.Integer.valueOf(this.f110544h), java.lang.Integer.valueOf(jlVar.f110544h)) && n51.f.a(java.lang.Boolean.valueOf(this.f110545i), java.lang.Boolean.valueOf(jlVar.f110545i)) && n51.f.a(this.f110546m, jlVar.f110546m) && n51.f.a(this.f110547n, jlVar.f110547n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.jl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110542f;
        java.util.LinkedList linkedList2 = this.f110541e;
        int i18 = 0;
        boolean[] zArr = this.f110548o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110540d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 1, linkedList);
            java.lang.String str2 = this.f110543g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f110544h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f110545i);
            }
            java.lang.String str3 = this.f110546m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f110547n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f110540d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            int g17 = i18 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 1, linkedList);
            java.lang.String str6 = this.f110543g;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f110544h);
            }
            if (zArr[6]) {
                g17 += b36.f.a(6, this.f110545i);
            }
            java.lang.String str7 = this.f110546m;
            if (str7 != null && zArr[7]) {
                g17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f110547n;
            return (str8 == null || !zArr[8]) ? g17 : g17 + b36.f.j(8, str8);
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
                this.f110540d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                linkedList2.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                linkedList.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f110543g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110544h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110545i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110546m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f110547n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
