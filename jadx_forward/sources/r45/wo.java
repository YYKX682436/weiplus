package r45;

/* loaded from: classes9.dex */
public class wo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f470859d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f470860e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470861f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470862g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470863h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wo)) {
            return false;
        }
        r45.wo woVar = (r45.wo) fVar;
        return n51.f.a(this.f470859d, woVar.f470859d) && n51.f.a(this.f470860e, woVar.f470860e) && n51.f.a(this.f470861f, woVar.f470861f) && n51.f.a(this.f470862g, woVar.f470862g) && n51.f.a(this.f470863h, woVar.f470863h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f470859d);
            fVar.g(2, 8, this.f470860e);
            java.lang.String str = this.f470861f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f470862g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f470863h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f470859d) + 0 + b36.f.g(2, 8, this.f470860e);
            java.lang.String str4 = this.f470861f;
            if (str4 != null) {
                g17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f470862g;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f470863h;
            return str6 != null ? g17 + b36.f.j(5, str6) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f470859d.clear();
            this.f470860e.clear();
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
        r45.wo woVar = (r45.wo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.vq0 vq0Var = new r45.vq0();
                if (bArr2 != null && bArr2.length > 0) {
                    vq0Var.mo11468x92b714fd(bArr2);
                }
                woVar.f470859d.add(vq0Var);
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                woVar.f470861f = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                woVar.f470862g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            woVar.f470863h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.uq0 uq0Var = new r45.uq0();
            if (bArr3 != null && bArr3.length > 0) {
                uq0Var.mo11468x92b714fd(bArr3);
            }
            woVar.f470860e.add(uq0Var);
        }
        return 0;
    }
}
