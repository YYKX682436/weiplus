package bw5;

/* loaded from: classes2.dex */
public class qf0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f113620d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113621e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113623g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113624h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113625i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.lb0 f113626m;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f113622f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f113627n = new boolean[8];

    static {
        new bw5.qf0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qf0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.qf0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qf0)) {
            return false;
        }
        bw5.qf0 qf0Var = (bw5.qf0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f113620d), java.lang.Long.valueOf(qf0Var.f113620d)) && n51.f.a(this.f113621e, qf0Var.f113621e) && n51.f.a(this.f113622f, qf0Var.f113622f) && n51.f.a(this.f113623g, qf0Var.f113623g) && n51.f.a(this.f113624h, qf0Var.f113624h) && n51.f.a(this.f113625i, qf0Var.f113625i) && n51.f.a(this.f113626m, qf0Var.f113626m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qf0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113622f;
        boolean[] zArr = this.f113627n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f113620d);
            }
            java.lang.String str = this.f113621e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList);
            java.lang.String str2 = this.f113623g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f113624h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f113625i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.lb0 lb0Var = this.f113626m;
            if (lb0Var != null && zArr[7]) {
                fVar.i(7, lb0Var.mo75928xcd1e8d8());
                this.f113626m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f113620d) : 0;
            java.lang.String str5 = this.f113621e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            int g17 = h17 + b36.f.g(3, 1, linkedList);
            java.lang.String str6 = this.f113623g;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f113624h;
            if (str7 != null && zArr[5]) {
                g17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f113625i;
            if (str8 != null && zArr[6]) {
                g17 += b36.f.j(6, str8);
            }
            bw5.lb0 lb0Var2 = this.f113626m;
            return (lb0Var2 == null || !zArr[7]) ? g17 : g17 + b36.f.i(7, lb0Var2.mo75928xcd1e8d8());
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
                this.f113620d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113621e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                linkedList.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f113623g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113624h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113625i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.lb0 lb0Var3 = new bw5.lb0();
                    if (bArr != null && bArr.length > 0) {
                        lb0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113626m = lb0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
