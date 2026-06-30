package r45;

/* loaded from: classes9.dex */
public class fm0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455969d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455970e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f455971f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f455972g;

    /* renamed from: h, reason: collision with root package name */
    public a36.a f455973h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fm0)) {
            return false;
        }
        r45.fm0 fm0Var = (r45.fm0) fVar;
        return n51.f.a(this.f76492x92037252, fm0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f455969d), java.lang.Integer.valueOf(fm0Var.f455969d)) && n51.f.a(this.f455970e, fm0Var.f455970e) && n51.f.a(this.f455971f, fm0Var.f455971f) && n51.f.a(java.lang.Integer.valueOf(this.f455972g), java.lang.Integer.valueOf(fm0Var.f455972g)) && n51.f.a(this.f455973h, fm0Var.f455973h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455971f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f455969d);
            java.lang.String str = this.f455970e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f455972g);
            a36.a aVar = this.f455973h;
            if (aVar != null) {
                fVar.i(6, aVar.mo75928xcd1e8d8());
                this.f455973h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455969d);
            java.lang.String str2 = this.f455970e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f455972g);
            a36.a aVar2 = this.f455973h;
            return aVar2 != null ? g17 + b36.f.i(6, aVar2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar3 = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        r45.fm0 fm0Var = (r45.fm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    fm0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                fm0Var.f455969d = aVar4.g(intValue);
                return 0;
            case 3:
                fm0Var.f455970e = aVar4.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    a36.i iVar = new a36.i();
                    if (bArr3 != null && bArr3.length > 0) {
                        iVar.mo11468x92b714fd(bArr3);
                    }
                    fm0Var.f455971f.add(iVar);
                }
                return 0;
            case 5:
                fm0Var.f455972g = aVar4.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    a36.a aVar5 = new a36.a();
                    if (bArr4 != null && bArr4.length > 0) {
                        aVar5.mo11468x92b714fd(bArr4);
                    }
                    fm0Var.f455973h = aVar5;
                }
                return 0;
            default:
                return -1;
        }
    }
}
