package bw5;

/* loaded from: classes2.dex */
public class ns extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ls f112337d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.os f112338e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ms f112339f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f112340g = new boolean[4];

    static {
        new bw5.ns();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ns mo11468x92b714fd(byte[] bArr) {
        return (bw5.ns) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ns)) {
            return false;
        }
        bw5.ns nsVar = (bw5.ns) fVar;
        return n51.f.a(this.f112337d, nsVar.f112337d) && n51.f.a(this.f112338e, nsVar.f112338e) && n51.f.a(this.f112339f, nsVar.f112339f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ns();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112340g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ls lsVar = this.f112337d;
            if (lsVar != null && zArr[1]) {
                fVar.i(1, lsVar.mo75928xcd1e8d8());
                this.f112337d.mo75956x3d5d1f78(fVar);
            }
            bw5.os osVar = this.f112338e;
            if (osVar != null && zArr[2]) {
                fVar.i(2, osVar.mo75928xcd1e8d8());
                this.f112338e.mo75956x3d5d1f78(fVar);
            }
            bw5.ms msVar = this.f112339f;
            if (msVar != null && zArr[3]) {
                fVar.i(3, msVar.mo75928xcd1e8d8());
                this.f112339f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ls lsVar2 = this.f112337d;
            if (lsVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, lsVar2.mo75928xcd1e8d8());
            }
            bw5.os osVar2 = this.f112338e;
            if (osVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, osVar2.mo75928xcd1e8d8());
            }
            bw5.ms msVar2 = this.f112339f;
            return (msVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, msVar2.mo75928xcd1e8d8());
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
                bw5.ls lsVar3 = new bw5.ls();
                if (bArr != null && bArr.length > 0) {
                    lsVar3.mo11468x92b714fd(bArr);
                }
                this.f112337d = lsVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.os osVar3 = new bw5.os();
                if (bArr2 != null && bArr2.length > 0) {
                    osVar3.mo11468x92b714fd(bArr2);
                }
                this.f112338e = osVar3;
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
            bw5.ms msVar3 = new bw5.ms();
            if (bArr3 != null && bArr3.length > 0) {
                msVar3.mo11468x92b714fd(bArr3);
            }
            this.f112339f = msVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
