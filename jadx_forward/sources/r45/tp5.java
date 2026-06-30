package r45;

/* loaded from: classes9.dex */
public class tp5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f468188d;

    /* renamed from: e, reason: collision with root package name */
    public long f468189e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f468190f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.je0 f468191g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tp5)) {
            return false;
        }
        r45.tp5 tp5Var = (r45.tp5) fVar;
        return n51.f.a(this.f76494x2de60e5e, tp5Var.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f468188d), java.lang.Long.valueOf(tp5Var.f468188d)) && n51.f.a(java.lang.Long.valueOf(this.f468189e), java.lang.Long.valueOf(tp5Var.f468189e)) && n51.f.a(this.f468190f, tp5Var.f468190f) && n51.f.a(this.f468191g, tp5Var.f468191g);
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
            fVar.h(2, this.f468188d);
            fVar.h(3, this.f468189e);
            fVar.g(4, 8, this.f468190f);
            r45.je0 je0Var = this.f468191g;
            if (je0Var != null) {
                fVar.i(5, je0Var.mo75928xcd1e8d8());
                this.f468191g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f468188d) + b36.f.h(3, this.f468189e) + b36.f.g(4, 8, this.f468190f);
            r45.je0 je0Var2 = this.f468191g;
            return je0Var2 != null ? i18 + b36.f.i(5, je0Var2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f468190f.clear();
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
        r45.tp5 tp5Var = (r45.tp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                tp5Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            tp5Var.f468188d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            tp5Var.f468189e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.im0 im0Var = new r45.im0();
                if (bArr3 != null && bArr3.length > 0) {
                    im0Var.mo11468x92b714fd(bArr3);
                }
                tp5Var.f468190f.add(im0Var);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.je0 je0Var3 = new r45.je0();
            if (bArr4 != null && bArr4.length > 0) {
                je0Var3.mo11468x92b714fd(bArr4);
            }
            tp5Var.f468191g = je0Var3;
        }
        return 0;
    }
}
