package m53;

/* loaded from: classes2.dex */
public class w2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405684d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405685e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f405686f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405687g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405688h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.w2)) {
            return false;
        }
        m53.w2 w2Var = (m53.w2) fVar;
        return n51.f.a(this.f405684d, w2Var.f405684d) && n51.f.a(this.f405685e, w2Var.f405685e) && n51.f.a(this.f405686f, w2Var.f405686f) && n51.f.a(this.f405687g, w2Var.f405687g) && n51.f.a(this.f405688h, w2Var.f405688h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405686f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405684d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405685e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str3 = this.f405687g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f405688h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f405684d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f405685e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            java.lang.String str7 = this.f405687g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f405688h;
            return str8 != null ? g17 + b36.f.j(5, str8) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        m53.w2 w2Var = (m53.w2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w2Var.f405684d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            w2Var.f405685e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                w2Var.f405687g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            w2Var.f405688h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            m53.l3 l3Var = new m53.l3();
            if (bArr2 != null && bArr2.length > 0) {
                l3Var.mo11468x92b714fd(bArr2);
            }
            w2Var.f405686f.add(l3Var);
        }
        return 0;
    }
}
