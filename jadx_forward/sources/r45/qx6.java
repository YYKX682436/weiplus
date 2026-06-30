package r45;

/* loaded from: classes4.dex */
public class qx6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465879d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465880e;

    /* renamed from: f, reason: collision with root package name */
    public r45.m74 f465881f;

    /* renamed from: g, reason: collision with root package name */
    public r45.f7 f465882g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465883h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qx6)) {
            return false;
        }
        r45.qx6 qx6Var = (r45.qx6) fVar;
        return n51.f.a(this.f76492x92037252, qx6Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f465879d), java.lang.Integer.valueOf(qx6Var.f465879d)) && n51.f.a(this.f465880e, qx6Var.f465880e) && n51.f.a(this.f465881f, qx6Var.f465881f) && n51.f.a(this.f465882g, qx6Var.f465882g) && n51.f.a(this.f465883h, qx6Var.f465883h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f465879d);
            java.lang.String str = this.f465880e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.m74 m74Var = this.f465881f;
            if (m74Var != null) {
                fVar.i(4, m74Var.mo75928xcd1e8d8());
                this.f465881f.mo75956x3d5d1f78(fVar);
            }
            r45.f7 f7Var = this.f465882g;
            if (f7Var != null) {
                fVar.i(5, f7Var.mo75928xcd1e8d8());
                this.f465882g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f465883h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465879d);
            java.lang.String str3 = this.f465880e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.m74 m74Var2 = this.f465881f;
            if (m74Var2 != null) {
                i18 += b36.f.i(4, m74Var2.mo75928xcd1e8d8());
            }
            r45.f7 f7Var2 = this.f465882g;
            if (f7Var2 != null) {
                i18 += b36.f.i(5, f7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f465883h;
            return str4 != null ? i18 + b36.f.j(6, str4) : i18;
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
        r45.qx6 qx6Var = (r45.qx6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    qx6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                qx6Var.f465879d = aVar2.g(intValue);
                return 0;
            case 3:
                qx6Var.f465880e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.m74 m74Var3 = new r45.m74();
                    if (bArr2 != null && bArr2.length > 0) {
                        m74Var3.mo11468x92b714fd(bArr2);
                    }
                    qx6Var.f465881f = m74Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.f7 f7Var3 = new r45.f7();
                    if (bArr3 != null && bArr3.length > 0) {
                        f7Var3.mo11468x92b714fd(bArr3);
                    }
                    qx6Var.f465882g = f7Var3;
                }
                return 0;
            case 6:
                qx6Var.f465883h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
