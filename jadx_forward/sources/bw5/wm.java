package bw5;

/* loaded from: classes2.dex */
public class wm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public int f116308e;

    /* renamed from: f, reason: collision with root package name */
    public int f116309f;

    /* renamed from: g, reason: collision with root package name */
    public int f116310g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f116311h;

    /* renamed from: i, reason: collision with root package name */
    public int f116312i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f116313m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.rd0 f116314n;

    /* renamed from: o, reason: collision with root package name */
    public int f116315o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f116307d = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f116316p = new boolean[10];

    static {
        new bw5.wm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wm mo11468x92b714fd(byte[] bArr) {
        return (bw5.wm) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wm)) {
            return false;
        }
        bw5.wm wmVar = (bw5.wm) fVar;
        return n51.f.a(this.f116307d, wmVar.f116307d) && n51.f.a(java.lang.Integer.valueOf(this.f116308e), java.lang.Integer.valueOf(wmVar.f116308e)) && n51.f.a(java.lang.Integer.valueOf(this.f116309f), java.lang.Integer.valueOf(wmVar.f116309f)) && n51.f.a(java.lang.Integer.valueOf(this.f116310g), java.lang.Integer.valueOf(wmVar.f116310g)) && n51.f.a(java.lang.Boolean.valueOf(this.f116311h), java.lang.Boolean.valueOf(wmVar.f116311h)) && n51.f.a(java.lang.Integer.valueOf(this.f116312i), java.lang.Integer.valueOf(wmVar.f116312i)) && n51.f.a(this.f116313m, wmVar.f116313m) && n51.f.a(this.f116314n, wmVar.f116314n) && n51.f.a(java.lang.Integer.valueOf(this.f116315o), java.lang.Integer.valueOf(wmVar.f116315o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116307d;
        boolean[] zArr = this.f116316p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f116308e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116309f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116310g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f116311h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f116312i);
            }
            java.lang.String str = this.f116313m;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            bw5.rd0 rd0Var = this.f116314n;
            if (rd0Var != null && zArr[8]) {
                fVar.i(8, rd0Var.mo75928xcd1e8d8());
                this.f116314n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[9]) {
                fVar.e(9, this.f116315o);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f116308e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f116309f);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f116310g);
            }
            if (zArr[5]) {
                g17 += b36.f.a(5, this.f116311h);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f116312i);
            }
            java.lang.String str2 = this.f116313m;
            if (str2 != null && zArr[7]) {
                g17 += b36.f.j(7, str2);
            }
            bw5.rd0 rd0Var2 = this.f116314n;
            if (rd0Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, rd0Var2.mo75928xcd1e8d8());
            }
            return zArr[9] ? g17 + b36.f.e(9, this.f116315o) : g17;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.vm vmVar = new bw5.vm();
                    if (bArr != null && bArr.length > 0) {
                        vmVar.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(vmVar);
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f116308e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116309f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116310g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116311h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116312i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116313m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.rd0 rd0Var3 = new bw5.rd0();
                    if (bArr2 != null && bArr2.length > 0) {
                        rd0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f116314n = rd0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f116315o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
