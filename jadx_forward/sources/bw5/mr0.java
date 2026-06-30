package bw5;

/* loaded from: classes15.dex */
public class mr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111899d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.nr0 f111900e;

    /* renamed from: f, reason: collision with root package name */
    public long f111901f;

    /* renamed from: g, reason: collision with root package name */
    public long f111902g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.f30 f111903h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111905m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111906n;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f111904i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f111907o = new boolean[9];

    static {
        new bw5.mr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mr0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.mr0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mr0)) {
            return false;
        }
        bw5.mr0 mr0Var = (bw5.mr0) fVar;
        return n51.f.a(this.f111899d, mr0Var.f111899d) && n51.f.a(this.f111900e, mr0Var.f111900e) && n51.f.a(java.lang.Long.valueOf(this.f111901f), java.lang.Long.valueOf(mr0Var.f111901f)) && n51.f.a(java.lang.Long.valueOf(this.f111902g), java.lang.Long.valueOf(mr0Var.f111902g)) && n51.f.a(this.f111903h, mr0Var.f111903h) && n51.f.a(this.f111904i, mr0Var.f111904i) && n51.f.a(this.f111905m, mr0Var.f111905m) && n51.f.a(this.f111906n, mr0Var.f111906n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111904i;
        int i18 = 0;
        boolean[] zArr = this.f111907o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111899d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.nr0 nr0Var = this.f111900e;
            if (nr0Var != null && zArr[2]) {
                fVar.e(2, nr0Var.f112336d);
            }
            if (zArr[3]) {
                fVar.h(3, this.f111901f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f111902g);
            }
            bw5.f30 f30Var = this.f111903h;
            if (f30Var != null && zArr[5]) {
                fVar.e(5, f30Var.f108674d);
            }
            fVar.g(6, 8, linkedList);
            java.lang.String str2 = this.f111905m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111906n;
            if (gVar != null && zArr[8]) {
                fVar.b(8, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f111899d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.nr0 nr0Var2 = this.f111900e;
            if (nr0Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, nr0Var2.f112336d);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f111901f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f111902g);
            }
            bw5.f30 f30Var2 = this.f111903h;
            if (f30Var2 != null && zArr[5]) {
                i18 += b36.f.e(5, f30Var2.f108674d);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList);
            java.lang.String str4 = this.f111905m;
            if (str4 != null && zArr[7]) {
                g17 += b36.f.j(7, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111906n;
            return (gVar2 == null || !zArr[8]) ? g17 : g17 + b36.f.b(8, gVar2);
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
                this.f111899d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                this.f111900e = g18 != 0 ? g18 != 1 ? null : bw5.nr0.DIRECTORY : bw5.nr0.FILE;
                zArr[2] = true;
                return 0;
            case 3:
                this.f111901f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111902g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111903h = bw5.f30.a(aVar2.g(intValue));
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
                this.f111905m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111906n = aVar2.d(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
