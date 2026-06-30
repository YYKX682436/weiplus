package m53;

/* loaded from: classes8.dex */
public class o0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.h f405465d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f405466e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405467f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405468g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.o0)) {
            return false;
        }
        m53.o0 o0Var = (m53.o0) fVar;
        return n51.f.a(this.f405465d, o0Var.f405465d) && n51.f.a(this.f405466e, o0Var.f405466e) && n51.f.a(this.f405467f, o0Var.f405467f) && n51.f.a(this.f405468g, o0Var.f405468g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405466e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.h hVar = this.f405465d;
            if (hVar != null) {
                fVar.i(1, hVar.mo75928xcd1e8d8());
                this.f405465d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 1, linkedList);
            java.lang.String str = this.f405467f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f405468g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.h hVar2 = this.f405465d;
            int i18 = (hVar2 != null ? 0 + b36.f.i(1, hVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 1, linkedList);
            java.lang.String str3 = this.f405467f;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f405468g;
            return str4 != null ? i18 + b36.f.j(4, str4) : i18;
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
        m53.o0 o0Var = (m53.o0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                o0Var.f405466e.add(aVar2.k(intValue));
                return 0;
            }
            if (intValue == 3) {
                o0Var.f405467f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            o0Var.f405468g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr2 = (byte[]) j17.get(i19);
            m53.h hVar3 = new m53.h();
            if (bArr2 != null && bArr2.length > 0) {
                hVar3.mo11468x92b714fd(bArr2);
            }
            o0Var.f405465d = hVar3;
        }
        return 0;
    }
}
