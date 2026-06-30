package bw5;

/* loaded from: classes11.dex */
public class nl0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112266d;

    /* renamed from: f, reason: collision with root package name */
    public int f112268f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112269g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112270h;

    /* renamed from: i, reason: collision with root package name */
    public int f112271i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f112267e = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f112272m = new boolean[7];

    static {
        new bw5.nl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nl0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.nl0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nl0)) {
            return false;
        }
        bw5.nl0 nl0Var = (bw5.nl0) fVar;
        return n51.f.a(this.f112266d, nl0Var.f112266d) && n51.f.a(this.f112267e, nl0Var.f112267e) && n51.f.a(java.lang.Integer.valueOf(this.f112268f), java.lang.Integer.valueOf(nl0Var.f112268f)) && n51.f.a(this.f112269g, nl0Var.f112269g) && n51.f.a(this.f112270h, nl0Var.f112270h) && n51.f.a(java.lang.Integer.valueOf(this.f112271i), java.lang.Integer.valueOf(nl0Var.f112271i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112267e;
        int i18 = 0;
        boolean[] zArr = this.f112272m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112266d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f112268f);
            }
            java.lang.String str2 = this.f112269g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f112270h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f112271i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f112266d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f112268f);
            }
            java.lang.String str5 = this.f112269g;
            if (str5 != null && zArr[4]) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f112270h;
            if (str6 != null && zArr[5]) {
                g17 += b36.f.j(5, str6);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f112271i) : g17;
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
                this.f112266d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.km0 km0Var = new bw5.km0();
                    if (bArr != null && bArr.length > 0) {
                        km0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(km0Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f112268f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112269g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112270h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112271i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
