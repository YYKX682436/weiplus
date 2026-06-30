package m53;

/* loaded from: classes8.dex */
public class y1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f405733d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f405734e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405735f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405736g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.y1)) {
            return false;
        }
        m53.y1 y1Var = (m53.y1) fVar;
        return n51.f.a(this.f76492x92037252, y1Var.f76492x92037252) && n51.f.a(this.f405733d, y1Var.f405733d) && n51.f.a(this.f405734e, y1Var.f405734e) && n51.f.a(java.lang.Boolean.valueOf(this.f405735f), java.lang.Boolean.valueOf(y1Var.f405735f)) && n51.f.a(this.f405736g, y1Var.f405736g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405733d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f405734e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.a(4, this.f405735f);
            java.lang.String str = this.f405736g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f405734e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            int a17 = i18 + b36.f.a(4, this.f405735f);
            java.lang.String str2 = this.f405736g;
            return str2 != null ? a17 + b36.f.j(5, str2) : a17;
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
        m53.y1 y1Var = (m53.y1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                y1Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                y1Var.f405734e = aVar2.d(intValue);
                return 0;
            }
            if (intValue == 4) {
                y1Var.f405735f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            y1Var.f405736g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            m53.y0 y0Var = new m53.y0();
            if (bArr3 != null && bArr3.length > 0) {
                y0Var.mo11468x92b714fd(bArr3);
            }
            y1Var.f405733d.add(y0Var);
        }
        return 0;
    }
}
