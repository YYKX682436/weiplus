package r45;

/* loaded from: classes4.dex */
public class ai3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f451552d;

    /* renamed from: e, reason: collision with root package name */
    public int f451553e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451554f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451555g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f451556h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ai3)) {
            return false;
        }
        r45.ai3 ai3Var = (r45.ai3) fVar;
        return n51.f.a(this.f76494x2de60e5e, ai3Var.f76494x2de60e5e) && n51.f.a(this.f451552d, ai3Var.f451552d) && n51.f.a(java.lang.Integer.valueOf(this.f451553e), java.lang.Integer.valueOf(ai3Var.f451553e)) && n51.f.a(this.f451554f, ai3Var.f451554f) && n51.f.a(this.f451555g, ai3Var.f451555g) && n51.f.a(this.f451556h, ai3Var.f451556h);
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
            r45.cu5 cu5Var = this.f451552d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f451552d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f451553e);
            java.lang.String str = this.f451554f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f451555g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.cu5 cu5Var2 = this.f451556h;
            if (cu5Var2 != null) {
                fVar.i(11, cu5Var2.mo75928xcd1e8d8());
                this.f451556h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var3 = this.f451552d;
            if (cu5Var3 != null) {
                i18 += b36.f.i(2, cu5Var3.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f451553e);
            java.lang.String str3 = this.f451554f;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f451555g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            r45.cu5 cu5Var4 = this.f451556h;
            return cu5Var4 != null ? e17 + b36.f.i(11, cu5Var4.mo75928xcd1e8d8()) : e17;
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
        r45.ai3 ai3Var = (r45.ai3) objArr[1];
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
                ai3Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var5 = new r45.cu5();
                if (bArr2 != null && bArr2.length > 0) {
                    cu5Var5.b(bArr2);
                }
                ai3Var.f451552d = cu5Var5;
            }
            return 0;
        }
        if (intValue == 3) {
            ai3Var.f451553e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ai3Var.f451554f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            ai3Var.f451555g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 11) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var6 = new r45.cu5();
            if (bArr3 != null && bArr3.length > 0) {
                cu5Var6.b(bArr3);
            }
            ai3Var.f451556h = cu5Var6;
        }
        return 0;
    }
}
