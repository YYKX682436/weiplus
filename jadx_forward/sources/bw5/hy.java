package bw5;

/* loaded from: classes8.dex */
public class hy extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.jx f109919d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.gy f109920e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ey f109921f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f109922g = new boolean[4];

    static {
        new bw5.hy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hy mo11468x92b714fd(byte[] bArr) {
        return (bw5.hy) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hy)) {
            return false;
        }
        bw5.hy hyVar = (bw5.hy) fVar;
        return n51.f.a(this.f109919d, hyVar.f109919d) && n51.f.a(this.f109920e, hyVar.f109920e) && n51.f.a(this.f109921f, hyVar.f109921f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109922g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.jx jxVar = this.f109919d;
            if (jxVar != null && zArr[1]) {
                fVar.e(1, jxVar.f110689d);
            }
            bw5.gy gyVar = this.f109920e;
            if (gyVar != null && zArr[2]) {
                fVar.i(2, gyVar.mo75928xcd1e8d8());
                this.f109920e.mo75956x3d5d1f78(fVar);
            }
            bw5.ey eyVar = this.f109921f;
            if (eyVar != null && zArr[3]) {
                fVar.i(3, eyVar.mo75928xcd1e8d8());
                this.f109921f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.jx jxVar2 = this.f109919d;
            if (jxVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, jxVar2.f110689d);
            }
            bw5.gy gyVar2 = this.f109920e;
            if (gyVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, gyVar2.mo75928xcd1e8d8());
            }
            bw5.ey eyVar2 = this.f109921f;
            return (eyVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, eyVar2.mo75928xcd1e8d8());
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
            this.f109919d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : bw5.jx.FinderTabTipsDSLRenderNodeStyle_Avatar : bw5.jx.FinderTabTipsDSLRenderNodeStyle_Icon : bw5.jx.FinderTabTipsDSLRenderNodeStyle_Text : bw5.jx.FinderTabTipsDSLRenderNodeStyle_Unknown;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.gy gyVar3 = new bw5.gy();
                if (bArr != null && bArr.length > 0) {
                    gyVar3.mo11468x92b714fd(bArr);
                }
                this.f109920e = gyVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.ey eyVar3 = new bw5.ey();
            if (bArr2 != null && bArr2.length > 0) {
                eyVar3.mo11468x92b714fd(bArr2);
            }
            this.f109921f = eyVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
