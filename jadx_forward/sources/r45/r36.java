package r45;

/* loaded from: classes8.dex */
public class r36 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f466040d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f466041e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466042f;

    /* renamed from: g, reason: collision with root package name */
    public int f466043g;

    /* renamed from: h, reason: collision with root package name */
    public int f466044h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r36)) {
            return false;
        }
        r45.r36 r36Var = (r45.r36) fVar;
        return n51.f.a(this.f76492x92037252, r36Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f466040d), java.lang.Integer.valueOf(r36Var.f466040d)) && n51.f.a(this.f466041e, r36Var.f466041e) && n51.f.a(this.f466042f, r36Var.f466042f) && n51.f.a(java.lang.Integer.valueOf(this.f466043g), java.lang.Integer.valueOf(r36Var.f466043g)) && n51.f.a(java.lang.Integer.valueOf(this.f466044h), java.lang.Integer.valueOf(r36Var.f466044h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466041e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f466040d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f466042f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f466043g);
            fVar.e(6, this.f466044h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f466040d) + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f466042f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f466043g) + b36.f.e(6, this.f466044h);
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
        r45.r36 r36Var = (r45.r36) objArr[1];
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
                    r36Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                r36Var.f466040d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.p36 p36Var = new r45.p36();
                    if (bArr3 != null && bArr3.length > 0) {
                        p36Var.mo11468x92b714fd(bArr3);
                    }
                    r36Var.f466041e.add(p36Var);
                }
                return 0;
            case 4:
                r36Var.f466042f = aVar2.k(intValue);
                return 0;
            case 5:
                r36Var.f466043g = aVar2.g(intValue);
                return 0;
            case 6:
                r36Var.f466044h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
