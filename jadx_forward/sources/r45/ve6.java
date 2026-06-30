package r45;

/* loaded from: classes4.dex */
public class ve6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469706d;

    /* renamed from: e, reason: collision with root package name */
    public int f469707e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f469708f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f469709g;

    /* renamed from: h, reason: collision with root package name */
    public long f469710h;

    /* renamed from: i, reason: collision with root package name */
    public int f469711i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ve6)) {
            return false;
        }
        r45.ve6 ve6Var = (r45.ve6) fVar;
        return n51.f.a(this.f76492x92037252, ve6Var.f76492x92037252) && n51.f.a(this.f469706d, ve6Var.f469706d) && n51.f.a(java.lang.Integer.valueOf(this.f469707e), java.lang.Integer.valueOf(ve6Var.f469707e)) && n51.f.a(this.f469708f, ve6Var.f469708f) && n51.f.a(java.lang.Integer.valueOf(this.f469709g), java.lang.Integer.valueOf(ve6Var.f469709g)) && n51.f.a(java.lang.Long.valueOf(this.f469710h), java.lang.Long.valueOf(ve6Var.f469710h)) && n51.f.a(java.lang.Integer.valueOf(this.f469711i), java.lang.Integer.valueOf(ve6Var.f469711i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469708f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f469706d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f469707e);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f469709g);
            fVar.h(6, this.f469710h);
            fVar.e(7, this.f469711i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f469706d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f469707e) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f469709g) + b36.f.h(6, this.f469710h) + b36.f.e(7, this.f469711i);
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
        r45.ve6 ve6Var = (r45.ve6) objArr[1];
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
                    ve6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ve6Var.f469706d = aVar2.k(intValue);
                return 0;
            case 3:
                ve6Var.f469707e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.te6 te6Var = new r45.te6();
                    if (bArr3 != null && bArr3.length > 0) {
                        te6Var.mo11468x92b714fd(bArr3);
                    }
                    ve6Var.f469708f.add(te6Var);
                }
                return 0;
            case 5:
                ve6Var.f469709g = aVar2.g(intValue);
                return 0;
            case 6:
                ve6Var.f469710h = aVar2.i(intValue);
                return 0;
            case 7:
                ve6Var.f469711i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
