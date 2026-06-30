package bw5;

/* loaded from: classes2.dex */
public class y3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f116869d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.pj f116870e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pj f116871f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pj f116872g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.pj f116873h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116874i = new boolean[6];

    static {
        new bw5.y3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y3 mo11468x92b714fd(byte[] bArr) {
        return (bw5.y3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y3)) {
            return false;
        }
        bw5.y3 y3Var = (bw5.y3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116869d), java.lang.Long.valueOf(y3Var.f116869d)) && n51.f.a(this.f116870e, y3Var.f116870e) && n51.f.a(this.f116871f, y3Var.f116871f) && n51.f.a(this.f116872g, y3Var.f116872g) && n51.f.a(this.f116873h, y3Var.f116873h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.y3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116874i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f116869d);
            }
            bw5.pj pjVar = this.f116870e;
            if (pjVar != null && zArr[2]) {
                fVar.i(2, pjVar.mo75928xcd1e8d8());
                this.f116870e.mo75956x3d5d1f78(fVar);
            }
            bw5.pj pjVar2 = this.f116871f;
            if (pjVar2 != null && zArr[3]) {
                fVar.i(3, pjVar2.mo75928xcd1e8d8());
                this.f116871f.mo75956x3d5d1f78(fVar);
            }
            bw5.pj pjVar3 = this.f116872g;
            if (pjVar3 != null && zArr[4]) {
                fVar.i(4, pjVar3.mo75928xcd1e8d8());
                this.f116872g.mo75956x3d5d1f78(fVar);
            }
            bw5.pj pjVar4 = this.f116873h;
            if (pjVar4 != null && zArr[5]) {
                fVar.i(5, pjVar4.mo75928xcd1e8d8());
                this.f116873h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f116869d) : 0;
            bw5.pj pjVar5 = this.f116870e;
            if (pjVar5 != null && zArr[2]) {
                h17 += b36.f.i(2, pjVar5.mo75928xcd1e8d8());
            }
            bw5.pj pjVar6 = this.f116871f;
            if (pjVar6 != null && zArr[3]) {
                h17 += b36.f.i(3, pjVar6.mo75928xcd1e8d8());
            }
            bw5.pj pjVar7 = this.f116872g;
            if (pjVar7 != null && zArr[4]) {
                h17 += b36.f.i(4, pjVar7.mo75928xcd1e8d8());
            }
            bw5.pj pjVar8 = this.f116873h;
            return (pjVar8 == null || !zArr[5]) ? h17 : h17 + b36.f.i(5, pjVar8.mo75928xcd1e8d8());
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f116869d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.pj pjVar9 = new bw5.pj();
                if (bArr != null && bArr.length > 0) {
                    pjVar9.mo11468x92b714fd(bArr);
                }
                this.f116870e = pjVar9;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.pj pjVar10 = new bw5.pj();
                if (bArr2 != null && bArr2.length > 0) {
                    pjVar10.mo11468x92b714fd(bArr2);
                }
                this.f116871f = pjVar10;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.pj pjVar11 = new bw5.pj();
                if (bArr3 != null && bArr3.length > 0) {
                    pjVar11.mo11468x92b714fd(bArr3);
                }
                this.f116872g = pjVar11;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr4 = (byte[]) j27.get(i28);
            bw5.pj pjVar12 = new bw5.pj();
            if (bArr4 != null && bArr4.length > 0) {
                pjVar12.mo11468x92b714fd(bArr4);
            }
            this.f116873h = pjVar12;
        }
        zArr[5] = true;
        return 0;
    }
}
