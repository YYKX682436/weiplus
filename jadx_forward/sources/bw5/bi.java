package bw5;

/* loaded from: classes2.dex */
public class bi extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.wh f107207d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.wh f107208e;

    /* renamed from: f, reason: collision with root package name */
    public int f107209f;

    /* renamed from: g, reason: collision with root package name */
    public int f107210g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107211h = new boolean[5];

    static {
        new bw5.bi();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bi mo11468x92b714fd(byte[] bArr) {
        return (bw5.bi) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bi)) {
            return false;
        }
        bw5.bi biVar = (bw5.bi) fVar;
        return n51.f.a(this.f107207d, biVar.f107207d) && n51.f.a(this.f107208e, biVar.f107208e) && n51.f.a(java.lang.Integer.valueOf(this.f107209f), java.lang.Integer.valueOf(biVar.f107209f)) && n51.f.a(java.lang.Integer.valueOf(this.f107210g), java.lang.Integer.valueOf(biVar.f107210g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bi();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107211h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.wh whVar = this.f107207d;
            if (whVar != null && zArr[1]) {
                fVar.i(1, whVar.mo75928xcd1e8d8());
                this.f107207d.mo75956x3d5d1f78(fVar);
            }
            bw5.wh whVar2 = this.f107208e;
            if (whVar2 != null && zArr[2]) {
                fVar.i(2, whVar2.mo75928xcd1e8d8());
                this.f107208e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107209f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107210g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.wh whVar3 = this.f107207d;
            if (whVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, whVar3.mo75928xcd1e8d8());
            }
            bw5.wh whVar4 = this.f107208e;
            if (whVar4 != null && zArr[2]) {
                i18 += b36.f.i(2, whVar4.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f107209f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f107210g) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.wh whVar5 = new bw5.wh();
                if (bArr != null && bArr.length > 0) {
                    whVar5.mo11468x92b714fd(bArr);
                }
                this.f107207d = whVar5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f107209f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f107210g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.wh whVar6 = new bw5.wh();
            if (bArr2 != null && bArr2.length > 0) {
                whVar6.mo11468x92b714fd(bArr2);
            }
            this.f107208e = whVar6;
        }
        zArr[2] = true;
        return 0;
    }
}
