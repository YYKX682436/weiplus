package r45;

/* loaded from: classes4.dex */
public class uq6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f469112d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f469113e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vq6 f469114f;

    /* renamed from: g, reason: collision with root package name */
    public r45.wq6 f469115g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uq6)) {
            return false;
        }
        r45.uq6 uq6Var = (r45.uq6) fVar;
        return n51.f.a(this.f469112d, uq6Var.f469112d) && n51.f.a(java.lang.Integer.valueOf(this.f469113e), java.lang.Integer.valueOf(uq6Var.f469113e)) && n51.f.a(this.f469114f, uq6Var.f469114f) && n51.f.a(this.f469115g, uq6Var.f469115g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469112d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f469113e);
            r45.vq6 vq6Var = this.f469114f;
            if (vq6Var != null) {
                fVar.i(3, vq6Var.mo75928xcd1e8d8());
                this.f469114f.mo75956x3d5d1f78(fVar);
            }
            r45.wq6 wq6Var = this.f469115g;
            if (wq6Var != null) {
                fVar.i(4, wq6Var.mo75928xcd1e8d8());
                this.f469115g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f469113e);
            r45.vq6 vq6Var2 = this.f469114f;
            if (vq6Var2 != null) {
                g17 += b36.f.i(3, vq6Var2.mo75928xcd1e8d8());
            }
            r45.wq6 wq6Var2 = this.f469115g;
            return wq6Var2 != null ? g17 + b36.f.i(4, wq6Var2.mo75928xcd1e8d8()) : g17;
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
        r45.uq6 uq6Var = (r45.uq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.qq6 qq6Var = new r45.qq6();
                if (bArr2 != null && bArr2.length > 0) {
                    qq6Var.mo11468x92b714fd(bArr2);
                }
                uq6Var.f469112d.add(qq6Var);
            }
            return 0;
        }
        if (intValue == 2) {
            uq6Var.f469113e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.vq6 vq6Var3 = new r45.vq6();
                if (bArr3 != null && bArr3.length > 0) {
                    vq6Var3.mo11468x92b714fd(bArr3);
                }
                uq6Var.f469114f = vq6Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.wq6 wq6Var3 = new r45.wq6();
            if (bArr4 != null && bArr4.length > 0) {
                wq6Var3.mo11468x92b714fd(bArr4);
            }
            uq6Var.f469115g = wq6Var3;
        }
        return 0;
    }
}
