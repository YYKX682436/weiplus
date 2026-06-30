package r45;

/* loaded from: classes9.dex */
public class m65 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f461696d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461697e;

    /* renamed from: f, reason: collision with root package name */
    public r45.p65 f461698f;

    /* renamed from: g, reason: collision with root package name */
    public r45.b65 f461699g;

    /* renamed from: i, reason: collision with root package name */
    public int f461701i;

    /* renamed from: n, reason: collision with root package name */
    public int f461703n;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f461700h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f461702m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m65)) {
            return false;
        }
        r45.m65 m65Var = (r45.m65) fVar;
        return n51.f.a(this.f76492x92037252, m65Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f461696d), java.lang.Integer.valueOf(m65Var.f461696d)) && n51.f.a(this.f461697e, m65Var.f461697e) && n51.f.a(this.f461698f, m65Var.f461698f) && n51.f.a(this.f461699g, m65Var.f461699g) && n51.f.a(this.f461700h, m65Var.f461700h) && n51.f.a(java.lang.Integer.valueOf(this.f461701i), java.lang.Integer.valueOf(m65Var.f461701i)) && n51.f.a(this.f461702m, m65Var.f461702m) && n51.f.a(java.lang.Integer.valueOf(this.f461703n), java.lang.Integer.valueOf(m65Var.f461703n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461702m;
        java.util.LinkedList linkedList2 = this.f461700h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f461696d);
            java.lang.String str = this.f461697e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.p65 p65Var = this.f461698f;
            if (p65Var != null) {
                fVar.i(4, p65Var.mo75928xcd1e8d8());
                this.f461698f.mo75956x3d5d1f78(fVar);
            }
            r45.b65 b65Var = this.f461699g;
            if (b65Var != null) {
                fVar.i(5, b65Var.mo75928xcd1e8d8());
                this.f461699g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList2);
            fVar.e(7, this.f461701i);
            fVar.g(8, 8, linkedList);
            fVar.e(9, this.f461703n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f461696d);
            java.lang.String str2 = this.f461697e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.p65 p65Var2 = this.f461698f;
            if (p65Var2 != null) {
                i18 += b36.f.i(4, p65Var2.mo75928xcd1e8d8());
            }
            r45.b65 b65Var2 = this.f461699g;
            if (b65Var2 != null) {
                i18 += b36.f.i(5, b65Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(6, 8, linkedList2) + b36.f.e(7, this.f461701i) + b36.f.g(8, 8, linkedList) + b36.f.e(9, this.f461703n);
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
        r45.m65 m65Var = (r45.m65) objArr[1];
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
                    m65Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                m65Var.f461696d = aVar2.g(intValue);
                return 0;
            case 3:
                m65Var.f461697e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.p65 p65Var3 = new r45.p65();
                    if (bArr3 != null && bArr3.length > 0) {
                        p65Var3.mo11468x92b714fd(bArr3);
                    }
                    m65Var.f461698f = p65Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.b65 b65Var3 = new r45.b65();
                    if (bArr4 != null && bArr4.length > 0) {
                        b65Var3.mo11468x92b714fd(bArr4);
                    }
                    m65Var.f461699g = b65Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.a65 a65Var = new r45.a65();
                    if (bArr5 != null && bArr5.length > 0) {
                        a65Var.mo11468x92b714fd(bArr5);
                    }
                    m65Var.f461700h.add(a65Var);
                }
                return 0;
            case 7:
                m65Var.f461701i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.t56 t56Var = new r45.t56();
                    if (bArr6 != null && bArr6.length > 0) {
                        t56Var.mo11468x92b714fd(bArr6);
                    }
                    m65Var.f461702m.add(t56Var);
                }
                return 0;
            case 9:
                m65Var.f461703n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
