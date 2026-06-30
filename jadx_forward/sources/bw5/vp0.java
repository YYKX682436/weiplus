package bw5;

/* loaded from: classes2.dex */
public class vp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.v60 f115988d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.xq0 f115989e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115990f;

    /* renamed from: g, reason: collision with root package name */
    public int f115991g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115992h = new boolean[5];

    static {
        new bw5.vp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vp0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.vp0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vp0)) {
            return false;
        }
        bw5.vp0 vp0Var = (bw5.vp0) fVar;
        return n51.f.a(this.f115988d, vp0Var.f115988d) && n51.f.a(this.f115989e, vp0Var.f115989e) && n51.f.a(this.f115990f, vp0Var.f115990f) && n51.f.a(java.lang.Integer.valueOf(this.f115991g), java.lang.Integer.valueOf(vp0Var.f115991g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115992h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.v60 v60Var = this.f115988d;
            if (v60Var != null && zArr[1]) {
                fVar.i(1, v60Var.mo75928xcd1e8d8());
                this.f115988d.mo75956x3d5d1f78(fVar);
            }
            bw5.xq0 xq0Var = this.f115989e;
            if (xq0Var != null && zArr[2]) {
                fVar.i(2, xq0Var.mo75928xcd1e8d8());
                this.f115989e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f115990f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115991g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.v60 v60Var2 = this.f115988d;
            if (v60Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, v60Var2.mo75928xcd1e8d8());
            }
            bw5.xq0 xq0Var2 = this.f115989e;
            if (xq0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, xq0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f115990f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f115991g) : i18;
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
                bw5.v60 v60Var3 = new bw5.v60();
                if (bArr != null && bArr.length > 0) {
                    v60Var3.mo11468x92b714fd(bArr);
                }
                this.f115988d = v60Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f115990f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f115991g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.xq0 xq0Var3 = new bw5.xq0();
            if (bArr2 != null && bArr2.length > 0) {
                xq0Var3.mo11468x92b714fd(bArr2);
            }
            this.f115989e = xq0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
