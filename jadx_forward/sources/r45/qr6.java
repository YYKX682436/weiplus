package r45;

/* loaded from: classes9.dex */
public class qr6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465764d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465765e;

    /* renamed from: f, reason: collision with root package name */
    public r45.b74 f465766f;

    /* renamed from: g, reason: collision with root package name */
    public r45.b74 f465767g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qr6)) {
            return false;
        }
        r45.qr6 qr6Var = (r45.qr6) fVar;
        return n51.f.a(this.f465764d, qr6Var.f465764d) && n51.f.a(this.f465765e, qr6Var.f465765e) && n51.f.a(this.f465766f, qr6Var.f465766f) && n51.f.a(this.f465767g, qr6Var.f465767g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465764d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465765e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.b74 b74Var = this.f465766f;
            if (b74Var != null) {
                fVar.i(3, b74Var.mo75928xcd1e8d8());
                this.f465766f.mo75956x3d5d1f78(fVar);
            }
            r45.b74 b74Var2 = this.f465767g;
            if (b74Var2 != null) {
                fVar.i(4, b74Var2.mo75928xcd1e8d8());
                this.f465767g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f465764d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f465765e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.b74 b74Var3 = this.f465766f;
            if (b74Var3 != null) {
                j17 += b36.f.i(3, b74Var3.mo75928xcd1e8d8());
            }
            r45.b74 b74Var4 = this.f465767g;
            return b74Var4 != null ? j17 + b36.f.i(4, b74Var4.mo75928xcd1e8d8()) : j17;
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
        r45.qr6 qr6Var = (r45.qr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qr6Var.f465764d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qr6Var.f465765e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.b74 b74Var5 = new r45.b74();
                if (bArr != null && bArr.length > 0) {
                    b74Var5.mo11468x92b714fd(bArr);
                }
                qr6Var.f465766f = b74Var5;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.b74 b74Var6 = new r45.b74();
            if (bArr2 != null && bArr2.length > 0) {
                b74Var6.mo11468x92b714fd(bArr2);
            }
            qr6Var.f465767g = b74Var6;
        }
        return 0;
    }
}
