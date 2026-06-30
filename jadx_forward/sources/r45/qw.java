package r45;

/* loaded from: classes9.dex */
public class qw extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.pw f465839d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pw f465840e;

    /* renamed from: f, reason: collision with root package name */
    public r45.pw f465841f;

    /* renamed from: g, reason: collision with root package name */
    public r45.pw f465842g;

    /* renamed from: h, reason: collision with root package name */
    public r45.pw f465843h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qw)) {
            return false;
        }
        r45.qw qwVar = (r45.qw) fVar;
        return n51.f.a(this.f465839d, qwVar.f465839d) && n51.f.a(this.f465840e, qwVar.f465840e) && n51.f.a(this.f465841f, qwVar.f465841f) && n51.f.a(this.f465842g, qwVar.f465842g) && n51.f.a(this.f465843h, qwVar.f465843h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.pw pwVar = this.f465839d;
            if (pwVar != null) {
                fVar.i(1, pwVar.mo75928xcd1e8d8());
                this.f465839d.mo75956x3d5d1f78(fVar);
            }
            r45.pw pwVar2 = this.f465840e;
            if (pwVar2 != null) {
                fVar.i(2, pwVar2.mo75928xcd1e8d8());
                this.f465840e.mo75956x3d5d1f78(fVar);
            }
            r45.pw pwVar3 = this.f465841f;
            if (pwVar3 != null) {
                fVar.i(3, pwVar3.mo75928xcd1e8d8());
                this.f465841f.mo75956x3d5d1f78(fVar);
            }
            r45.pw pwVar4 = this.f465842g;
            if (pwVar4 != null) {
                fVar.i(4, pwVar4.mo75928xcd1e8d8());
                this.f465842g.mo75956x3d5d1f78(fVar);
            }
            r45.pw pwVar5 = this.f465843h;
            if (pwVar5 != null) {
                fVar.i(5, pwVar5.mo75928xcd1e8d8());
                this.f465843h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.pw pwVar6 = this.f465839d;
            int i18 = pwVar6 != null ? 0 + b36.f.i(1, pwVar6.mo75928xcd1e8d8()) : 0;
            r45.pw pwVar7 = this.f465840e;
            if (pwVar7 != null) {
                i18 += b36.f.i(2, pwVar7.mo75928xcd1e8d8());
            }
            r45.pw pwVar8 = this.f465841f;
            if (pwVar8 != null) {
                i18 += b36.f.i(3, pwVar8.mo75928xcd1e8d8());
            }
            r45.pw pwVar9 = this.f465842g;
            if (pwVar9 != null) {
                i18 += b36.f.i(4, pwVar9.mo75928xcd1e8d8());
            }
            r45.pw pwVar10 = this.f465843h;
            return pwVar10 != null ? i18 + b36.f.i(5, pwVar10.mo75928xcd1e8d8()) : i18;
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
        r45.qw qwVar = (r45.qw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.pw pwVar11 = new r45.pw();
                if (bArr != null && bArr.length > 0) {
                    pwVar11.mo11468x92b714fd(bArr);
                }
                qwVar.f465839d = pwVar11;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.pw pwVar12 = new r45.pw();
                if (bArr2 != null && bArr2.length > 0) {
                    pwVar12.mo11468x92b714fd(bArr2);
                }
                qwVar.f465840e = pwVar12;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.pw pwVar13 = new r45.pw();
                if (bArr3 != null && bArr3.length > 0) {
                    pwVar13.mo11468x92b714fd(bArr3);
                }
                qwVar.f465841f = pwVar13;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.pw pwVar14 = new r45.pw();
                if (bArr4 != null && bArr4.length > 0) {
                    pwVar14.mo11468x92b714fd(bArr4);
                }
                qwVar.f465842g = pwVar14;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.pw pwVar15 = new r45.pw();
            if (bArr5 != null && bArr5.length > 0) {
                pwVar15.mo11468x92b714fd(bArr5);
            }
            qwVar.f465843h = pwVar15;
        }
        return 0;
    }
}
