package r45;

/* loaded from: classes4.dex */
public class f7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455603d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gq f455604e;

    /* renamed from: f, reason: collision with root package name */
    public r45.gq f455605f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f7)) {
            return false;
        }
        r45.f7 f7Var = (r45.f7) fVar;
        return n51.f.a(this.f455603d, f7Var.f455603d) && n51.f.a(this.f455604e, f7Var.f455604e) && n51.f.a(this.f455605f, f7Var.f455605f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455603d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.gq gqVar = this.f455604e;
            if (gqVar != null) {
                fVar.i(2, gqVar.mo75928xcd1e8d8());
                this.f455604e.mo75956x3d5d1f78(fVar);
            }
            r45.gq gqVar2 = this.f455605f;
            if (gqVar2 != null) {
                fVar.i(3, gqVar2.mo75928xcd1e8d8());
                this.f455605f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f455603d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.gq gqVar3 = this.f455604e;
            if (gqVar3 != null) {
                j17 += b36.f.i(2, gqVar3.mo75928xcd1e8d8());
            }
            r45.gq gqVar4 = this.f455605f;
            return gqVar4 != null ? j17 + b36.f.i(3, gqVar4.mo75928xcd1e8d8()) : j17;
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
        r45.f7 f7Var = (r45.f7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f7Var.f455603d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.gq gqVar5 = new r45.gq();
                if (bArr != null && bArr.length > 0) {
                    gqVar5.mo11468x92b714fd(bArr);
                }
                f7Var.f455604e = gqVar5;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.gq gqVar6 = new r45.gq();
            if (bArr2 != null && bArr2.length > 0) {
                gqVar6.mo11468x92b714fd(bArr2);
            }
            f7Var.f455605f = gqVar6;
        }
        return 0;
    }
}
