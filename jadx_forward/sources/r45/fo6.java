package r45;

/* loaded from: classes4.dex */
public class fo6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456027d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456028e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456029f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456030g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fo6)) {
            return false;
        }
        r45.fo6 fo6Var = (r45.fo6) fVar;
        return n51.f.a(this.f76494x2de60e5e, fo6Var.f76494x2de60e5e) && n51.f.a(this.f456027d, fo6Var.f456027d) && n51.f.a(this.f456028e, fo6Var.f456028e) && n51.f.a(this.f456029f, fo6Var.f456029f) && n51.f.a(this.f456030g, fo6Var.f456030g);
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
            java.lang.String str = this.f456027d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f456028e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f456029f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f456030g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f456027d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f456028e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f456029f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f456030g;
            return str8 != null ? i18 + b36.f.j(5, str8) : i18;
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
        r45.fo6 fo6Var = (r45.fo6) objArr[1];
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
                fo6Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            fo6Var.f456027d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fo6Var.f456028e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            fo6Var.f456029f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        fo6Var.f456030g = aVar2.k(intValue);
        return 0;
    }
}
