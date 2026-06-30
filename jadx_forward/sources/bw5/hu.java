package bw5;

/* loaded from: classes2.dex */
public class hu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.gu f109884d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.gu f109885e;

    /* renamed from: f, reason: collision with root package name */
    public long f109886f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.fu f109887g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f109888h = new boolean[5];

    static {
        new bw5.hu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hu mo11468x92b714fd(byte[] bArr) {
        return (bw5.hu) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hu)) {
            return false;
        }
        bw5.hu huVar = (bw5.hu) fVar;
        return n51.f.a(this.f109884d, huVar.f109884d) && n51.f.a(this.f109885e, huVar.f109885e) && n51.f.a(java.lang.Long.valueOf(this.f109886f), java.lang.Long.valueOf(huVar.f109886f)) && n51.f.a(this.f109887g, huVar.f109887g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109888h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.gu guVar = this.f109884d;
            if (guVar != null && zArr[1]) {
                fVar.i(1, guVar.mo75928xcd1e8d8());
                this.f109884d.mo75956x3d5d1f78(fVar);
            }
            bw5.gu guVar2 = this.f109885e;
            if (guVar2 != null && zArr[2]) {
                fVar.i(2, guVar2.mo75928xcd1e8d8());
                this.f109885e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.h(3, this.f109886f);
            }
            bw5.fu fuVar = this.f109887g;
            if (fuVar != null && zArr[4]) {
                fVar.i(4, fuVar.mo75928xcd1e8d8());
                this.f109887g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.gu guVar3 = this.f109884d;
            if (guVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, guVar3.mo75928xcd1e8d8());
            }
            bw5.gu guVar4 = this.f109885e;
            if (guVar4 != null && zArr[2]) {
                i18 += b36.f.i(2, guVar4.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f109886f);
            }
            bw5.fu fuVar2 = this.f109887g;
            return (fuVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, fuVar2.mo75928xcd1e8d8());
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
                bw5.gu guVar5 = new bw5.gu();
                if (bArr != null && bArr.length > 0) {
                    guVar5.mo11468x92b714fd(bArr);
                }
                this.f109884d = guVar5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.gu guVar6 = new bw5.gu();
                if (bArr2 != null && bArr2.length > 0) {
                    guVar6.mo11468x92b714fd(bArr2);
                }
                this.f109885e = guVar6;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109886f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.fu fuVar3 = new bw5.fu();
            if (bArr3 != null && bArr3.length > 0) {
                fuVar3.mo11468x92b714fd(bArr3);
            }
            this.f109887g = fuVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
