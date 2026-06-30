package bw5;

/* loaded from: classes15.dex */
public class ai0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f106738d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.io0 f106739e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f106740f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.f30 f106741g;

    /* renamed from: h, reason: collision with root package name */
    public int f106742h;

    /* renamed from: m, reason: collision with root package name */
    public int f106744m;

    /* renamed from: n, reason: collision with root package name */
    public int f106745n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f106746o;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f106743i = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f106747p = new boolean[10];

    static {
        new bw5.ai0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ai0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ai0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ai0)) {
            return false;
        }
        bw5.ai0 ai0Var = (bw5.ai0) fVar;
        return n51.f.a(this.f106738d, ai0Var.f106738d) && n51.f.a(this.f106739e, ai0Var.f106739e) && n51.f.a(this.f106740f, ai0Var.f106740f) && n51.f.a(this.f106741g, ai0Var.f106741g) && n51.f.a(java.lang.Integer.valueOf(this.f106742h), java.lang.Integer.valueOf(ai0Var.f106742h)) && n51.f.a(this.f106743i, ai0Var.f106743i) && n51.f.a(java.lang.Integer.valueOf(this.f106744m), java.lang.Integer.valueOf(ai0Var.f106744m)) && n51.f.a(java.lang.Integer.valueOf(this.f106745n), java.lang.Integer.valueOf(ai0Var.f106745n)) && n51.f.a(this.f106746o, ai0Var.f106746o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ai0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f106743i;
        int i18 = 0;
        boolean[] zArr = this.f106747p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f106738d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.io0 io0Var = this.f106739e;
            if (io0Var != null && zArr[2]) {
                fVar.e(2, io0Var.f110190d);
            }
            java.lang.String str2 = this.f106740f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.f30 f30Var = this.f106741g;
            if (f30Var != null && zArr[4]) {
                fVar.e(4, f30Var.f108674d);
            }
            if (zArr[5]) {
                fVar.e(5, this.f106742h);
            }
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.e(7, this.f106744m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f106745n);
            }
            java.lang.String str3 = this.f106746o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f106738d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            bw5.io0 io0Var2 = this.f106739e;
            if (io0Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, io0Var2.f110190d);
            }
            java.lang.String str5 = this.f106740f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            bw5.f30 f30Var2 = this.f106741g;
            if (f30Var2 != null && zArr[4]) {
                i18 += b36.f.e(4, f30Var2.f108674d);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f106742h);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList);
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f106744m);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f106745n);
            }
            java.lang.String str6 = this.f106746o;
            return (str6 == null || !zArr[9]) ? g17 : g17 + b36.f.j(9, str6);
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
                this.f106738d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                this.f106739e = g18 != 0 ? g18 != 1 ? g18 != 2 ? g18 != 3 ? null : bw5.io0.PREVIEW_ERROR : bw5.io0.PREVIEW_NEED_PASSWORD : bw5.io0.PREVIEW_SUCCESS : bw5.io0.PREVIEW_RUNNING;
                zArr[2] = true;
                return 0;
            case 3:
                this.f106740f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f106741g = bw5.f30.a(aVar2.g(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                this.f106742h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mr0 mr0Var = new bw5.mr0();
                    if (bArr != null && bArr.length > 0) {
                        mr0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(mr0Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f106744m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f106745n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f106746o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
