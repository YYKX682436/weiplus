package r45;

/* loaded from: classes9.dex */
public class tu5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f468348d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f468349e;

    /* renamed from: f, reason: collision with root package name */
    public long f468350f;

    /* renamed from: g, reason: collision with root package name */
    public long f468351g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f468352h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tu5)) {
            return false;
        }
        r45.tu5 tu5Var = (r45.tu5) fVar;
        return n51.f.a(this.f468348d, tu5Var.f468348d) && n51.f.a(java.lang.Boolean.valueOf(this.f468349e), java.lang.Boolean.valueOf(tu5Var.f468349e)) && n51.f.a(java.lang.Long.valueOf(this.f468350f), java.lang.Long.valueOf(tu5Var.f468350f)) && n51.f.a(java.lang.Long.valueOf(this.f468351g), java.lang.Long.valueOf(tu5Var.f468351g)) && n51.f.a(java.lang.Boolean.valueOf(this.f468352h), java.lang.Boolean.valueOf(tu5Var.f468352h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468348d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.a(2, this.f468349e);
            fVar.h(3, this.f468350f);
            fVar.h(4, this.f468351g);
            fVar.a(5, this.f468352h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.a(2, this.f468349e) + b36.f.h(3, this.f468350f) + b36.f.h(4, this.f468351g) + b36.f.a(5, this.f468352h);
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
        r45.tu5 tu5Var = (r45.tu5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.uu5 uu5Var = new r45.uu5();
                if (bArr2 != null && bArr2.length > 0) {
                    uu5Var.mo11468x92b714fd(bArr2);
                }
                tu5Var.f468348d.add(uu5Var);
            }
            return 0;
        }
        if (intValue == 2) {
            tu5Var.f468349e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            tu5Var.f468350f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            tu5Var.f468351g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        tu5Var.f468352h = aVar2.c(intValue);
        return 0;
    }
}
