package r45;

/* loaded from: classes7.dex */
public class dg extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f453941d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f453942e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453943f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453944g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453945h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dg)) {
            return false;
        }
        r45.dg dgVar = (r45.dg) fVar;
        return n51.f.a(this.f76492x92037252, dgVar.f76492x92037252) && n51.f.a(this.f453941d, dgVar.f453941d) && n51.f.a(this.f453942e, dgVar.f453942e) && n51.f.a(this.f453943f, dgVar.f453943f) && n51.f.a(this.f453944g, dgVar.f453944g) && n51.f.a(this.f453945h, dgVar.f453945h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453942e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.j14 j14Var = this.f453941d;
            if (j14Var != null) {
                fVar.i(2, j14Var.mo75928xcd1e8d8());
                this.f453941d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f453943f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f453944g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f453945h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.j14 j14Var2 = this.f453941d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            java.lang.String str4 = this.f453943f;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f453944g;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f453945h;
            return str6 != null ? g17 + b36.f.j(6, str6) : g17;
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
        r45.dg dgVar = (r45.dg) objArr[1];
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
                    dgVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.j14 j14Var3 = new r45.j14();
                    if (bArr3 != null && bArr3.length > 0) {
                        j14Var3.mo11468x92b714fd(bArr3);
                    }
                    dgVar.f453941d = j14Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.dz dzVar = new r45.dz();
                    if (bArr4 != null && bArr4.length > 0) {
                        dzVar.mo11468x92b714fd(bArr4);
                    }
                    dgVar.f453942e.add(dzVar);
                }
                return 0;
            case 4:
                dgVar.f453943f = aVar2.k(intValue);
                return 0;
            case 5:
                dgVar.f453944g = aVar2.k(intValue);
                return 0;
            case 6:
                dgVar.f453945h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
