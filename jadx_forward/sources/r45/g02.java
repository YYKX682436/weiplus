package r45;

/* loaded from: classes10.dex */
public class g02 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456302e;

    /* renamed from: f, reason: collision with root package name */
    public long f456303f;

    /* renamed from: g, reason: collision with root package name */
    public long f456304g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456305h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456306i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456307m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f456301d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f456308n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g02)) {
            return false;
        }
        r45.g02 g02Var = (r45.g02) fVar;
        return n51.f.a(this.f456301d, g02Var.f456301d) && n51.f.a(this.f456302e, g02Var.f456302e) && n51.f.a(java.lang.Long.valueOf(this.f456303f), java.lang.Long.valueOf(g02Var.f456303f)) && n51.f.a(java.lang.Long.valueOf(this.f456304g), java.lang.Long.valueOf(g02Var.f456304g)) && n51.f.a(this.f456305h, g02Var.f456305h) && n51.f.a(this.f456306i, g02Var.f456306i) && n51.f.a(this.f456307m, g02Var.f456307m) && n51.f.a(this.f456308n, g02Var.f456308n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456308n;
        java.util.LinkedList linkedList2 = this.f456301d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            java.lang.String str = this.f456302e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f456303f);
            fVar.h(4, this.f456304g);
            java.lang.String str2 = this.f456305h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f456306i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f456307m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            java.lang.String str5 = this.f456302e;
            if (str5 != null) {
                g17 += b36.f.j(2, str5);
            }
            int h17 = g17 + b36.f.h(3, this.f456303f) + b36.f.h(4, this.f456304g);
            java.lang.String str6 = this.f456305h;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f456306i;
            if (str7 != null) {
                h17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f456307m;
            if (str8 != null) {
                h17 += b36.f.j(7, str8);
            }
            return h17 + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.g02 g02Var = (r45.g02) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.dm4 dm4Var = new r45.dm4();
                    if (bArr2 != null && bArr2.length > 0) {
                        dm4Var.mo11468x92b714fd(bArr2);
                    }
                    g02Var.f456301d.add(dm4Var);
                }
                return 0;
            case 2:
                g02Var.f456302e = aVar2.k(intValue);
                return 0;
            case 3:
                g02Var.f456303f = aVar2.i(intValue);
                return 0;
            case 4:
                g02Var.f456304g = aVar2.i(intValue);
                return 0;
            case 5:
                g02Var.f456305h = aVar2.k(intValue);
                return 0;
            case 6:
                g02Var.f456306i = aVar2.k(intValue);
                return 0;
            case 7:
                g02Var.f456307m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ql4 ql4Var = new r45.ql4();
                    if (bArr3 != null && bArr3.length > 0) {
                        ql4Var.mo11468x92b714fd(bArr3);
                    }
                    g02Var.f456308n.add(ql4Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
