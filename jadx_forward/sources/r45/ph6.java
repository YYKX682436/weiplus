package r45;

/* loaded from: classes7.dex */
public class ph6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464593d;

    /* renamed from: e, reason: collision with root package name */
    public r45.od7 f464594e;

    /* renamed from: f, reason: collision with root package name */
    public r45.pd7 f464595f;

    /* renamed from: g, reason: collision with root package name */
    public r45.qd7 f464596g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cg7 f464597h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ph6)) {
            return false;
        }
        r45.ph6 ph6Var = (r45.ph6) fVar;
        return n51.f.a(this.f76494x2de60e5e, ph6Var.f76494x2de60e5e) && n51.f.a(this.f464593d, ph6Var.f464593d) && n51.f.a(this.f464594e, ph6Var.f464594e) && n51.f.a(this.f464595f, ph6Var.f464595f) && n51.f.a(this.f464596g, ph6Var.f464596g) && n51.f.a(this.f464597h, ph6Var.f464597h);
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
            java.lang.String str = this.f464593d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.od7 od7Var = this.f464594e;
            if (od7Var != null) {
                fVar.i(3, od7Var.mo75928xcd1e8d8());
                this.f464594e.mo75956x3d5d1f78(fVar);
            }
            r45.pd7 pd7Var = this.f464595f;
            if (pd7Var != null) {
                fVar.i(6, pd7Var.mo75928xcd1e8d8());
                this.f464595f.mo75956x3d5d1f78(fVar);
            }
            r45.qd7 qd7Var = this.f464596g;
            if (qd7Var != null) {
                fVar.i(7, qd7Var.mo75928xcd1e8d8());
                this.f464596g.mo75956x3d5d1f78(fVar);
            }
            r45.cg7 cg7Var = this.f464597h;
            if (cg7Var != null) {
                fVar.i(8, cg7Var.mo75928xcd1e8d8());
                this.f464597h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f464593d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.od7 od7Var2 = this.f464594e;
            if (od7Var2 != null) {
                i18 += b36.f.i(3, od7Var2.mo75928xcd1e8d8());
            }
            r45.pd7 pd7Var2 = this.f464595f;
            if (pd7Var2 != null) {
                i18 += b36.f.i(6, pd7Var2.mo75928xcd1e8d8());
            }
            r45.qd7 qd7Var2 = this.f464596g;
            if (qd7Var2 != null) {
                i18 += b36.f.i(7, qd7Var2.mo75928xcd1e8d8());
            }
            r45.cg7 cg7Var2 = this.f464597h;
            return cg7Var2 != null ? i18 + b36.f.i(8, cg7Var2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ph6 ph6Var = (r45.ph6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                ph6Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ph6Var.f464593d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.od7 od7Var3 = new r45.od7();
                if (bArr2 != null && bArr2.length > 0) {
                    od7Var3.mo11468x92b714fd(bArr2);
                }
                ph6Var.f464594e = od7Var3;
            }
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.pd7 pd7Var3 = new r45.pd7();
                if (bArr3 != null && bArr3.length > 0) {
                    pd7Var3.mo11468x92b714fd(bArr3);
                }
                ph6Var.f464595f = pd7Var3;
            }
            return 0;
        }
        if (intValue == 7) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.qd7 qd7Var3 = new r45.qd7();
                if (bArr4 != null && bArr4.length > 0) {
                    qd7Var3.mo11468x92b714fd(bArr4);
                }
                ph6Var.f464596g = qd7Var3;
            }
            return 0;
        }
        if (intValue != 8) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.cg7 cg7Var3 = new r45.cg7();
            if (bArr5 != null && bArr5.length > 0) {
                cg7Var3.mo11468x92b714fd(bArr5);
            }
            ph6Var.f464597h = cg7Var3;
        }
        return 0;
    }
}
