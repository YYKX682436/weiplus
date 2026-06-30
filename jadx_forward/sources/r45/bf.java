package r45;

/* loaded from: classes7.dex */
public class bf extends r45.mr5 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452249f;

    /* renamed from: g, reason: collision with root package name */
    public long f452250g;

    /* renamed from: h, reason: collision with root package name */
    public int f452251h;

    /* renamed from: i, reason: collision with root package name */
    public int f452252i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f452247d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f452248e = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f452253m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bf)) {
            return false;
        }
        r45.bf bfVar = (r45.bf) fVar;
        return n51.f.a(this.f76494x2de60e5e, bfVar.f76494x2de60e5e) && n51.f.a(this.f452247d, bfVar.f452247d) && n51.f.a(this.f452248e, bfVar.f452248e) && n51.f.a(this.f452249f, bfVar.f452249f) && n51.f.a(java.lang.Long.valueOf(this.f452250g), java.lang.Long.valueOf(bfVar.f452250g)) && n51.f.a(java.lang.Integer.valueOf(this.f452251h), java.lang.Integer.valueOf(bfVar.f452251h)) && n51.f.a(java.lang.Integer.valueOf(this.f452252i), java.lang.Integer.valueOf(bfVar.f452252i)) && n51.f.a(this.f452253m, bfVar.f452253m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452247d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 1, linkedList);
            fVar.g(3, 8, this.f452248e);
            java.lang.String str = this.f452249f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f452250g);
            fVar.e(6, this.f452251h);
            fVar.e(7, this.f452252i);
            fVar.g(8, 8, this.f452253m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 1, linkedList) + b36.f.g(3, 8, this.f452248e);
            java.lang.String str2 = this.f452249f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.h(5, this.f452250g) + b36.f.e(6, this.f452251h) + b36.f.e(7, this.f452252i) + b36.f.g(8, 8, this.f452253m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f452248e.clear();
            this.f452253m.clear();
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
        r45.bf bfVar = (r45.bf) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    bfVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                bfVar.f452247d.add(aVar2.k(intValue));
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.gr5 gr5Var = new r45.gr5();
                    if (bArr3 != null && bArr3.length > 0) {
                        gr5Var.mo11468x92b714fd(bArr3);
                    }
                    bfVar.f452248e.add(gr5Var);
                }
                return 0;
            case 4:
                bfVar.f452249f = aVar2.k(intValue);
                return 0;
            case 5:
                bfVar.f452250g = aVar2.i(intValue);
                return 0;
            case 6:
                bfVar.f452251h = aVar2.g(intValue);
                return 0;
            case 7:
                bfVar.f452252i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.p20 p20Var = new r45.p20();
                    if (bArr4 != null && bArr4.length > 0) {
                        p20Var.mo11468x92b714fd(bArr4);
                    }
                    bfVar.f452253m.add(p20Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
