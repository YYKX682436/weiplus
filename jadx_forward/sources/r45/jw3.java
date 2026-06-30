package r45;

/* loaded from: classes15.dex */
public class jw3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459692d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f459693e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f459694f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459695g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f459696h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f459697i = 1;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f459698m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f459699n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f459700o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jw3)) {
            return false;
        }
        r45.jw3 jw3Var = (r45.jw3) fVar;
        return n51.f.a(this.f459692d, jw3Var.f459692d) && n51.f.a(java.lang.Long.valueOf(this.f459693e), java.lang.Long.valueOf(jw3Var.f459693e)) && n51.f.a(java.lang.Long.valueOf(this.f459694f), java.lang.Long.valueOf(jw3Var.f459694f)) && n51.f.a(this.f459695g, jw3Var.f459695g) && n51.f.a(this.f459696h, jw3Var.f459696h) && n51.f.a(java.lang.Integer.valueOf(this.f459697i), java.lang.Integer.valueOf(jw3Var.f459697i)) && n51.f.a(this.f459698m, jw3Var.f459698m) && n51.f.a(this.f459699n, jw3Var.f459699n) && n51.f.a(java.lang.Integer.valueOf(this.f459700o), java.lang.Integer.valueOf(jw3Var.f459700o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459699n;
        java.util.LinkedList linkedList2 = this.f459698m;
        java.util.LinkedList linkedList3 = this.f459696h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459692d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f459693e);
            fVar.h(3, this.f459694f);
            java.lang.String str2 = this.f459695g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList3);
            fVar.e(6, this.f459697i);
            fVar.g(7, 8, linkedList2);
            fVar.g(8, 8, linkedList);
            fVar.e(9, this.f459700o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f459692d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f459693e) + b36.f.h(3, this.f459694f);
            java.lang.String str4 = this.f459695g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.g(5, 8, linkedList3) + b36.f.e(6, this.f459697i) + b36.f.g(7, 8, linkedList2) + b36.f.g(8, 8, linkedList) + b36.f.e(9, this.f459700o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.jw3 jw3Var = (r45.jw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jw3Var.f459692d = aVar2.k(intValue);
                return 0;
            case 2:
                jw3Var.f459693e = aVar2.i(intValue);
                return 0;
            case 3:
                jw3Var.f459694f = aVar2.i(intValue);
                return 0;
            case 4:
                jw3Var.f459695g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.kw3 kw3Var = new r45.kw3();
                    if (bArr2 != null && bArr2.length > 0) {
                        kw3Var.mo11468x92b714fd(bArr2);
                    }
                    jw3Var.f459696h.add(kw3Var);
                }
                return 0;
            case 6:
                jw3Var.f459697i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.kw3 kw3Var2 = new r45.kw3();
                    if (bArr3 != null && bArr3.length > 0) {
                        kw3Var2.mo11468x92b714fd(bArr3);
                    }
                    jw3Var.f459698m.add(kw3Var2);
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.a07 a07Var = new r45.a07();
                    if (bArr4 != null && bArr4.length > 0) {
                        a07Var.mo11468x92b714fd(bArr4);
                    }
                    jw3Var.f459699n.add(a07Var);
                }
                return 0;
            case 9:
                jw3Var.f459700o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
