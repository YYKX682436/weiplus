package r45;

/* loaded from: classes8.dex */
public class fg3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455841d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455842e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455843f;

    /* renamed from: g, reason: collision with root package name */
    public r45.tp f455844g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fg3)) {
            return false;
        }
        r45.fg3 fg3Var = (r45.fg3) fVar;
        return n51.f.a(this.f76494x2de60e5e, fg3Var.f76494x2de60e5e) && n51.f.a(this.f455841d, fg3Var.f455841d) && n51.f.a(this.f455842e, fg3Var.f455842e) && n51.f.a(this.f455843f, fg3Var.f455843f) && n51.f.a(this.f455844g, fg3Var.f455844g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f455841d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f455842e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f455843f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.tp tpVar = this.f455844g;
            if (tpVar != null) {
                fVar.i(5, tpVar.mo75928xcd1e8d8());
                this.f455844g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f455841d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f455842e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f455843f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            r45.tp tpVar2 = this.f455844g;
            return tpVar2 != null ? i18 + b36.f.i(5, tpVar2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.fg3 fg3Var = (r45.fg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                fg3Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            fg3Var.f455841d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fg3Var.f455842e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            fg3Var.f455843f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.tp tpVar3 = new r45.tp();
            if (bArr2 != null && bArr2.length > 0) {
                tpVar3.mo11468x92b714fd(bArr2);
            }
            fg3Var.f455844g = tpVar3;
        }
        return 0;
    }
}
