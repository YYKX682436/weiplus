package r45;

/* loaded from: classes2.dex */
public class ra3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f466223d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f466224e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466225f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466226g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ra3)) {
            return false;
        }
        r45.ra3 ra3Var = (r45.ra3) fVar;
        return n51.f.a(this.f76492x92037252, ra3Var.f76492x92037252) && n51.f.a(this.f466223d, ra3Var.f466223d) && n51.f.a(java.lang.Integer.valueOf(this.f466224e), java.lang.Integer.valueOf(ra3Var.f466224e)) && n51.f.a(this.f466225f, ra3Var.f466225f) && n51.f.a(this.f466226g, ra3Var.f466226g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466223d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 1, linkedList);
            fVar.e(3, this.f466224e);
            java.lang.String str = this.f466225f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f466226g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 1, linkedList) + b36.f.e(3, this.f466224e);
            java.lang.String str3 = this.f466225f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f466226g;
            return str4 != null ? i18 + b36.f.j(5, str4) : i18;
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
        r45.ra3 ra3Var = (r45.ra3) objArr[1];
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
                ra3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ra3Var.f466223d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            ra3Var.f466224e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ra3Var.f466225f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ra3Var.f466226g = aVar2.k(intValue);
        return 0;
    }
}
