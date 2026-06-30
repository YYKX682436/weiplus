package bw5;

/* loaded from: classes2.dex */
public class xd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.vq f116599d;

    /* renamed from: e, reason: collision with root package name */
    public int f116600e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f116601f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f116602g = new boolean[4];

    static {
        new bw5.xd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xd mo11468x92b714fd(byte[] bArr) {
        return (bw5.xd) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xd)) {
            return false;
        }
        bw5.xd xdVar = (bw5.xd) fVar;
        return n51.f.a(this.f116599d, xdVar.f116599d) && n51.f.a(java.lang.Integer.valueOf(this.f116600e), java.lang.Integer.valueOf(xdVar.f116600e)) && n51.f.a(this.f116601f, xdVar.f116601f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116602g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.vq vqVar = this.f116599d;
            if (vqVar != null && zArr[1]) {
                fVar.i(1, vqVar.mo75928xcd1e8d8());
                this.f116599d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116600e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f116601f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.vq vqVar2 = this.f116599d;
            if (vqVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, vqVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f116600e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f116601f;
            return (gVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.b(3, gVar2);
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
            if (intValue == 2) {
                this.f116600e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f116601f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.vq vqVar3 = new bw5.vq();
            if (bArr != null && bArr.length > 0) {
                vqVar3.mo11468x92b714fd(bArr);
            }
            this.f116599d = vqVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
