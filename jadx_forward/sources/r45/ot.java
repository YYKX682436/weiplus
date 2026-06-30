package r45;

/* loaded from: classes8.dex */
public class ot extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f464035d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.zz6 f464036e;

    /* renamed from: f, reason: collision with root package name */
    public int f464037f;

    /* renamed from: g, reason: collision with root package name */
    public int f464038g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464039h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ot)) {
            return false;
        }
        r45.ot otVar = (r45.ot) fVar;
        return n51.f.a(this.f464035d, otVar.f464035d) && n51.f.a(this.f464036e, otVar.f464036e) && n51.f.a(java.lang.Integer.valueOf(this.f464037f), java.lang.Integer.valueOf(otVar.f464037f)) && n51.f.a(java.lang.Integer.valueOf(this.f464038g), java.lang.Integer.valueOf(otVar.f464038g)) && n51.f.a(this.f464039h, otVar.f464039h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464035d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            r45.zz6 zz6Var = this.f464036e;
            if (zz6Var != null) {
                fVar.i(2, zz6Var.mo75928xcd1e8d8());
                this.f464036e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f464037f);
            fVar.e(4, this.f464038g);
            java.lang.String str = this.f464039h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            r45.zz6 zz6Var2 = this.f464036e;
            if (zz6Var2 != null) {
                g17 += b36.f.i(2, zz6Var2.mo75928xcd1e8d8());
            }
            int e17 = g17 + b36.f.e(3, this.f464037f) + b36.f.e(4, this.f464038g);
            java.lang.String str2 = this.f464039h;
            return str2 != null ? e17 + b36.f.j(5, str2) : e17;
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
        r45.ot otVar = (r45.ot) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.is isVar = new r45.is();
                if (bArr2 != null && bArr2.length > 0) {
                    isVar.mo11468x92b714fd(bArr2);
                }
                otVar.f464035d.add(isVar);
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                otVar.f464037f = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                otVar.f464038g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            otVar.f464039h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.zz6 zz6Var3 = new r45.zz6();
            if (bArr3 != null && bArr3.length > 0) {
                zz6Var3.mo11468x92b714fd(bArr3);
            }
            otVar.f464036e = zz6Var3;
        }
        return 0;
    }
}
