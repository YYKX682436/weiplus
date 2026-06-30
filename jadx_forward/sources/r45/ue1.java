package r45;

/* loaded from: classes2.dex */
public class ue1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.te1 f468824d;

    /* renamed from: e, reason: collision with root package name */
    public r45.me1 f468825e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f468826f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f468827g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468828h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ue1)) {
            return false;
        }
        r45.ue1 ue1Var = (r45.ue1) fVar;
        return n51.f.a(this.f468824d, ue1Var.f468824d) && n51.f.a(this.f468825e, ue1Var.f468825e) && n51.f.a(this.f468826f, ue1Var.f468826f) && n51.f.a(this.f468827g, ue1Var.f468827g) && n51.f.a(this.f468828h, ue1Var.f468828h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468826f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.te1 te1Var = this.f468824d;
            if (te1Var != null) {
                fVar.i(1, te1Var.mo75928xcd1e8d8());
                this.f468824d.mo75956x3d5d1f78(fVar);
            }
            r45.me1 me1Var = this.f468825e;
            if (me1Var != null) {
                fVar.i(2, me1Var.mo75928xcd1e8d8());
                this.f468825e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f468827g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str = this.f468828h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.te1 te1Var2 = this.f468824d;
            int i18 = te1Var2 != null ? 0 + b36.f.i(1, te1Var2.mo75928xcd1e8d8()) : 0;
            r45.me1 me1Var2 = this.f468825e;
            if (me1Var2 != null) {
                i18 += b36.f.i(2, me1Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f468827g;
            if (gVar2 != null) {
                g17 += b36.f.b(4, gVar2);
            }
            java.lang.String str2 = this.f468828h;
            return str2 != null ? g17 + b36.f.j(5, str2) : g17;
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
        r45.ue1 ue1Var = (r45.ue1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.te1 te1Var3 = new r45.te1();
                if (bArr2 != null && bArr2.length > 0) {
                    te1Var3.mo11468x92b714fd(bArr2);
                }
                ue1Var.f468824d = te1Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.me1 me1Var3 = new r45.me1();
                if (bArr3 != null && bArr3.length > 0) {
                    me1Var3.mo11468x92b714fd(bArr3);
                }
                ue1Var.f468825e = me1Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                ue1Var.f468827g = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            ue1Var.f468828h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.te1 te1Var4 = new r45.te1();
            if (bArr4 != null && bArr4.length > 0) {
                te1Var4.mo11468x92b714fd(bArr4);
            }
            ue1Var.f468826f.add(te1Var4);
        }
        return 0;
    }
}
