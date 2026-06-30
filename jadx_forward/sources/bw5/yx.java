package bw5;

/* loaded from: classes8.dex */
public class yx extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lx f117257d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.xx f117258e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f117259f = new boolean[3];

    static {
        new bw5.yx();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yx mo11468x92b714fd(byte[] bArr) {
        return (bw5.yx) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yx)) {
            return false;
        }
        bw5.yx yxVar = (bw5.yx) fVar;
        return n51.f.a(this.f117257d, yxVar.f117257d) && n51.f.a(this.f117258e, yxVar.f117258e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yx();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117259f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.lx lxVar = this.f117257d;
            if (lxVar != null && zArr[1]) {
                fVar.e(1, lxVar.f111535d);
            }
            bw5.xx xxVar = this.f117258e;
            if (xxVar != null && zArr[2]) {
                fVar.i(2, xxVar.mo75928xcd1e8d8());
                this.f117258e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.lx lxVar2 = this.f117257d;
            if (lxVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, lxVar2.f111535d);
            }
            bw5.xx xxVar2 = this.f117258e;
            return (xxVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, xxVar2.mo75928xcd1e8d8());
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
            int g17 = aVar2.g(intValue);
            this.f117257d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.lx.FinderTabTipsDSLRenderReddotPendantStaticIcon_Hollow : bw5.lx.FinderTabTipsDSLRenderReddotPendantStaticIcon_Solid : bw5.lx.FinderTabTipsDSLRenderReddotPendantStaticIcon_Unknown;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.xx xxVar3 = new bw5.xx();
            if (bArr != null && bArr.length > 0) {
                xxVar3.mo11468x92b714fd(bArr);
            }
            this.f117258e = xxVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
