package bw5;

/* loaded from: classes2.dex */
public class mj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111786d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111787e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111788f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111789g;

    /* renamed from: i, reason: collision with root package name */
    public int f111791i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111792m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f111793n;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f111790h = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f111794o = new boolean[9];

    static {
        new bw5.mj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mj mo11468x92b714fd(byte[] bArr) {
        return (bw5.mj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mj)) {
            return false;
        }
        bw5.mj mjVar = (bw5.mj) fVar;
        return n51.f.a(this.f111786d, mjVar.f111786d) && n51.f.a(this.f111787e, mjVar.f111787e) && n51.f.a(this.f111788f, mjVar.f111788f) && n51.f.a(this.f111789g, mjVar.f111789g) && n51.f.a(this.f111790h, mjVar.f111790h) && n51.f.a(java.lang.Integer.valueOf(this.f111791i), java.lang.Integer.valueOf(mjVar.f111791i)) && n51.f.a(this.f111792m, mjVar.f111792m) && n51.f.a(this.f111793n, mjVar.f111793n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111790h;
        int i18 = 0;
        boolean[] zArr = this.f111794o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111786d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111787e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f111788f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f111789g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            fVar.g(5, 1, linkedList);
            if (zArr[6]) {
                fVar.e(6, this.f111791i);
            }
            java.lang.String str5 = this.f111792m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f111793n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f111786d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f111787e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f111788f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f111789g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            int g17 = i18 + b36.f.g(5, 1, linkedList);
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f111791i);
            }
            java.lang.String str11 = this.f111792m;
            if (str11 != null && zArr[7]) {
                g17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f111793n;
            return (str12 == null || !zArr[8]) ? g17 : g17 + b36.f.j(8, str12);
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
                this.f111786d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111787e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111788f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111789g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                linkedList.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f111791i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111792m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111793n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
