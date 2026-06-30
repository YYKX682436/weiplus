package bw5;

/* loaded from: classes15.dex */
public class vf0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.uf0 f115882d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f115883e = new boolean[2];

    static {
        new bw5.vf0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vf0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.vf0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof bw5.vf0) && n51.f.a(this.f115882d, ((bw5.vf0) fVar).f115882d);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vf0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115883e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.uf0 uf0Var = this.f115882d;
            if (uf0Var != null && zArr[1]) {
                fVar.e(1, uf0Var.f115417d);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.uf0 uf0Var2 = this.f115882d;
            if (uf0Var2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.e(1, uf0Var2.f115417d);
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
        if (intValue != 1) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f115882d = g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.uf0.Business_Finder_Live : bw5.uf0.Business_Maas_Image_Editor : bw5.uf0.Business_Status_Publish : bw5.uf0.Business_Default;
        zArr[1] = true;
        return 0;
    }
}
