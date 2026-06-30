package r45;

/* loaded from: classes8.dex */
public class qh extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465516d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465517e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ka5 f465518f;

    /* renamed from: g, reason: collision with root package name */
    public r45.x15 f465519g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qh)) {
            return false;
        }
        r45.qh qhVar = (r45.qh) fVar;
        return n51.f.a(this.f76492x92037252, qhVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f465516d), java.lang.Integer.valueOf(qhVar.f465516d)) && n51.f.a(this.f465517e, qhVar.f465517e) && n51.f.a(this.f465518f, qhVar.f465518f) && n51.f.a(this.f465519g, qhVar.f465519g);
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
            fVar.e(2, this.f465516d);
            java.lang.String str = this.f465517e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.ka5 ka5Var = this.f465518f;
            if (ka5Var != null) {
                fVar.i(6, ka5Var.mo75928xcd1e8d8());
                this.f465518f.mo75956x3d5d1f78(fVar);
            }
            r45.x15 x15Var = this.f465519g;
            if (x15Var != null) {
                fVar.i(7, x15Var.mo75928xcd1e8d8());
                this.f465519g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465516d);
            java.lang.String str2 = this.f465517e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.ka5 ka5Var2 = this.f465518f;
            if (ka5Var2 != null) {
                i18 += b36.f.i(6, ka5Var2.mo75928xcd1e8d8());
            }
            r45.x15 x15Var2 = this.f465519g;
            return x15Var2 != null ? i18 + b36.f.i(7, x15Var2.mo75928xcd1e8d8()) : i18;
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
        r45.qh qhVar = (r45.qh) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                qhVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qhVar.f465516d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            qhVar.f465517e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.ka5 ka5Var3 = new r45.ka5();
                if (bArr2 != null && bArr2.length > 0) {
                    ka5Var3.mo11468x92b714fd(bArr2);
                }
                qhVar.f465518f = ka5Var3;
            }
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.x15 x15Var3 = new r45.x15();
            if (bArr3 != null && bArr3.length > 0) {
                x15Var3.mo11468x92b714fd(bArr3);
            }
            qhVar.f465519g = x15Var3;
        }
        return 0;
    }
}
