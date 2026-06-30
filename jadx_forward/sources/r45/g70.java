package r45;

/* loaded from: classes9.dex */
public class g70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.vl5 f456471d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f456472e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f456473f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vl5 f456474g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g70)) {
            return false;
        }
        r45.g70 g70Var = (r45.g70) fVar;
        return n51.f.a(this.f456471d, g70Var.f456471d) && n51.f.a(this.f456472e, g70Var.f456472e) && n51.f.a(java.lang.Boolean.valueOf(this.f456473f), java.lang.Boolean.valueOf(g70Var.f456473f)) && n51.f.a(this.f456474g, g70Var.f456474g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456472e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.vl5 vl5Var = this.f456471d;
            if (vl5Var != null) {
                fVar.i(1, vl5Var.mo75928xcd1e8d8());
                this.f456471d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f456473f);
            r45.vl5 vl5Var2 = this.f456474g;
            if (vl5Var2 != null) {
                fVar.i(4, vl5Var2.mo75928xcd1e8d8());
                this.f456474g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.vl5 vl5Var3 = this.f456471d;
            int i18 = (vl5Var3 != null ? 0 + b36.f.i(1, vl5Var3.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f456473f);
            r45.vl5 vl5Var4 = this.f456474g;
            return vl5Var4 != null ? i18 + b36.f.i(4, vl5Var4.mo75928xcd1e8d8()) : i18;
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
        r45.g70 g70Var = (r45.g70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.vl5 vl5Var5 = new r45.vl5();
                if (bArr2 != null && bArr2.length > 0) {
                    vl5Var5.mo11468x92b714fd(bArr2);
                }
                g70Var.f456471d = vl5Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.de deVar = new r45.de();
                if (bArr3 != null && bArr3.length > 0) {
                    deVar.mo11468x92b714fd(bArr3);
                }
                g70Var.f456472e.add(deVar);
            }
            return 0;
        }
        if (intValue == 3) {
            g70Var.f456473f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.vl5 vl5Var6 = new r45.vl5();
            if (bArr4 != null && bArr4.length > 0) {
                vl5Var6.mo11468x92b714fd(bArr4);
            }
            g70Var.f456474g = vl5Var6;
        }
        return 0;
    }
}
