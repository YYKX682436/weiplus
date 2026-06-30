package bw5;

/* loaded from: classes8.dex */
public class gy extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.fy f109550d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.fy f109551e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.fy f109552f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f109553g = new boolean[4];

    static {
        new bw5.gy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gy mo11468x92b714fd(byte[] bArr) {
        return (bw5.gy) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gy)) {
            return false;
        }
        bw5.gy gyVar = (bw5.gy) fVar;
        return n51.f.a(this.f109550d, gyVar.f109550d) && n51.f.a(this.f109551e, gyVar.f109551e) && n51.f.a(this.f109552f, gyVar.f109552f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109553g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.fy fyVar = this.f109550d;
            if (fyVar != null && zArr[1]) {
                fVar.i(1, fyVar.mo75928xcd1e8d8());
                this.f109550d.mo75956x3d5d1f78(fVar);
            }
            bw5.fy fyVar2 = this.f109551e;
            if (fyVar2 != null && zArr[2]) {
                fVar.i(2, fyVar2.mo75928xcd1e8d8());
                this.f109551e.mo75956x3d5d1f78(fVar);
            }
            bw5.fy fyVar3 = this.f109552f;
            if (fyVar3 != null && zArr[3]) {
                fVar.i(3, fyVar3.mo75928xcd1e8d8());
                this.f109552f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.fy fyVar4 = this.f109550d;
            if (fyVar4 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, fyVar4.mo75928xcd1e8d8());
            }
            bw5.fy fyVar5 = this.f109551e;
            if (fyVar5 != null && zArr[2]) {
                i18 += b36.f.i(2, fyVar5.mo75928xcd1e8d8());
            }
            bw5.fy fyVar6 = this.f109552f;
            return (fyVar6 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, fyVar6.mo75928xcd1e8d8());
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
                bw5.fy fyVar7 = new bw5.fy();
                if (bArr != null && bArr.length > 0) {
                    fyVar7.mo11468x92b714fd(bArr);
                }
                this.f109550d = fyVar7;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.fy fyVar8 = new bw5.fy();
                if (bArr2 != null && bArr2.length > 0) {
                    fyVar8.mo11468x92b714fd(bArr2);
                }
                this.f109551e = fyVar8;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.fy fyVar9 = new bw5.fy();
            if (bArr3 != null && bArr3.length > 0) {
                fyVar9.mo11468x92b714fd(bArr3);
            }
            this.f109552f = fyVar9;
        }
        zArr[3] = true;
        return 0;
    }
}
