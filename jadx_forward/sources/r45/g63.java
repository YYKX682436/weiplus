package r45;

/* loaded from: classes4.dex */
public class g63 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f456445d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f456446e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456447f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456448g;

    /* renamed from: h, reason: collision with root package name */
    public int f456449h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g63)) {
            return false;
        }
        r45.g63 g63Var = (r45.g63) fVar;
        return n51.f.a(this.f76494x2de60e5e, g63Var.f76494x2de60e5e) && n51.f.a(this.f456445d, g63Var.f456445d) && n51.f.a(this.f456446e, g63Var.f456446e) && n51.f.a(this.f456447f, g63Var.f456447f) && n51.f.a(this.f456448g, g63Var.f456448g) && n51.f.a(java.lang.Integer.valueOf(this.f456449h), java.lang.Integer.valueOf(g63Var.f456449h));
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
            fVar.g(2, 1, this.f456445d);
            fVar.g(3, 1, this.f456446e);
            java.lang.String str = this.f456447f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f456448g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f456449h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 1, this.f456445d) + b36.f.g(3, 1, this.f456446e);
            java.lang.String str3 = this.f456447f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f456448g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            return i18 + b36.f.e(6, this.f456449h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456445d.clear();
            this.f456446e.clear();
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
        r45.g63 g63Var = (r45.g63) objArr[1];
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
                    g63Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                g63Var.f456445d.add(aVar2.k(intValue));
                return 0;
            case 3:
                g63Var.f456446e.add(aVar2.k(intValue));
                return 0;
            case 4:
                g63Var.f456447f = aVar2.k(intValue);
                return 0;
            case 5:
                g63Var.f456448g = aVar2.k(intValue);
                return 0;
            case 6:
                g63Var.f456449h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
