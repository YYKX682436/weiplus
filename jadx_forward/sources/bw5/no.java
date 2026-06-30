package bw5;

/* loaded from: classes2.dex */
public class no extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f112290d;

    /* renamed from: e, reason: collision with root package name */
    public long f112291e;

    /* renamed from: f, reason: collision with root package name */
    public long f112292f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112293g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112294h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112296m;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f112295i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f112297n = new boolean[8];

    static {
        new bw5.no();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.no mo11468x92b714fd(byte[] bArr) {
        return (bw5.no) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.no)) {
            return false;
        }
        bw5.no noVar = (bw5.no) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f112290d), java.lang.Boolean.valueOf(noVar.f112290d)) && n51.f.a(java.lang.Long.valueOf(this.f112291e), java.lang.Long.valueOf(noVar.f112291e)) && n51.f.a(java.lang.Long.valueOf(this.f112292f), java.lang.Long.valueOf(noVar.f112292f)) && n51.f.a(this.f112293g, noVar.f112293g) && n51.f.a(this.f112294h, noVar.f112294h) && n51.f.a(this.f112295i, noVar.f112295i) && n51.f.a(this.f112296m, noVar.f112296m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.no();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112295i;
        boolean[] zArr = this.f112297n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f112290d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f112291e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f112292f);
            }
            java.lang.String str = this.f112293g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f112294h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, linkedList);
            java.lang.String str3 = this.f112296m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f112290d) : 0;
            if (zArr[2]) {
                a17 += b36.f.h(2, this.f112291e);
            }
            if (zArr[3]) {
                a17 += b36.f.h(3, this.f112292f);
            }
            java.lang.String str4 = this.f112293g;
            if (str4 != null && zArr[4]) {
                a17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f112294h;
            if (str5 != null && zArr[5]) {
                a17 += b36.f.j(5, str5);
            }
            int g17 = a17 + b36.f.g(6, 8, linkedList);
            java.lang.String str6 = this.f112296m;
            return (str6 == null || !zArr[7]) ? g17 : g17 + b36.f.j(7, str6);
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
                this.f112290d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112291e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112292f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112293g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112294h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.u30 u30Var = new bw5.u30();
                    if (bArr != null && bArr.length > 0) {
                        u30Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(u30Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f112296m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
