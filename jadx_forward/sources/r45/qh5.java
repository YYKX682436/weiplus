package r45;

/* loaded from: classes9.dex */
public class qh5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465534d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465535e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f465536f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f465537g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465538h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qh5)) {
            return false;
        }
        r45.qh5 qh5Var = (r45.qh5) fVar;
        return n51.f.a(this.f76492x92037252, qh5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f465534d), java.lang.Integer.valueOf(qh5Var.f465534d)) && n51.f.a(this.f465535e, qh5Var.f465535e) && n51.f.a(this.f465536f, qh5Var.f465536f) && n51.f.a(this.f465537g, qh5Var.f465537g) && n51.f.a(this.f465538h, qh5Var.f465538h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465537g;
        java.util.LinkedList linkedList2 = this.f465536f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f465534d);
            java.lang.String str = this.f465535e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            java.lang.String str2 = this.f465538h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465534d);
            java.lang.String str3 = this.f465535e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
            java.lang.String str4 = this.f465538h;
            return str4 != null ? g17 + b36.f.j(6, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.qh5 qh5Var = (r45.qh5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    qh5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                qh5Var.f465534d = aVar2.g(intValue);
                return 0;
            case 3:
                qh5Var.f465535e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.up6 up6Var = new r45.up6();
                    if (bArr3 != null && bArr3.length > 0) {
                        up6Var.mo11468x92b714fd(bArr3);
                    }
                    qh5Var.f465536f.add(up6Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.up6 up6Var2 = new r45.up6();
                    if (bArr4 != null && bArr4.length > 0) {
                        up6Var2.mo11468x92b714fd(bArr4);
                    }
                    qh5Var.f465537g.add(up6Var2);
                }
                return 0;
            case 6:
                qh5Var.f465538h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
