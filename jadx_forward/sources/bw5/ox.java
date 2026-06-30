package bw5;

/* loaded from: classes4.dex */
public class ox extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.px f112931d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.nx f112932e;

    /* renamed from: f, reason: collision with root package name */
    public float f112933f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f112934g = new boolean[4];

    static {
        new bw5.ox();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ox mo11468x92b714fd(byte[] bArr) {
        return (bw5.ox) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ox)) {
            return false;
        }
        bw5.ox oxVar = (bw5.ox) fVar;
        return n51.f.a(this.f112931d, oxVar.f112931d) && n51.f.a(this.f112932e, oxVar.f112932e) && n51.f.a(java.lang.Float.valueOf(this.f112933f), java.lang.Float.valueOf(oxVar.f112933f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ox();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112934g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.px pxVar = this.f112931d;
            if (pxVar != null && zArr[1]) {
                fVar.i(1, pxVar.mo75928xcd1e8d8());
                this.f112931d.mo75956x3d5d1f78(fVar);
            }
            bw5.nx nxVar = this.f112932e;
            if (nxVar != null && zArr[2]) {
                fVar.i(2, nxVar.mo75928xcd1e8d8());
                this.f112932e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.d(3, this.f112933f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.px pxVar2 = this.f112931d;
            if (pxVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, pxVar2.mo75928xcd1e8d8());
            }
            bw5.nx nxVar2 = this.f112932e;
            if (nxVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, nxVar2.mo75928xcd1e8d8());
            }
            return zArr[3] ? i18 + b36.f.d(3, this.f112933f) : i18;
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
                bw5.px pxVar3 = new bw5.px();
                if (bArr != null && bArr.length > 0) {
                    pxVar3.mo11468x92b714fd(bArr);
                }
                this.f112931d = pxVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f112933f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.nx nxVar3 = new bw5.nx();
            if (bArr2 != null && bArr2.length > 0) {
                nxVar3.mo11468x92b714fd(bArr2);
            }
            this.f112932e = nxVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
