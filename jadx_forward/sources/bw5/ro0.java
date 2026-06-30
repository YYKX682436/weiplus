package bw5;

/* loaded from: classes2.dex */
public class ro0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f114173d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ro f114174e;

    /* renamed from: f, reason: collision with root package name */
    public int f114175f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f114176g = new boolean[4];

    static {
        new bw5.ro0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ro0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ro0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ro0)) {
            return false;
        }
        bw5.ro0 ro0Var = (bw5.ro0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f114173d), java.lang.Boolean.valueOf(ro0Var.f114173d)) && n51.f.a(this.f114174e, ro0Var.f114174e) && n51.f.a(java.lang.Integer.valueOf(this.f114175f), java.lang.Integer.valueOf(ro0Var.f114175f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ro0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114176g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f114173d);
            }
            bw5.ro roVar = this.f114174e;
            if (roVar != null && zArr[2]) {
                fVar.i(2, roVar.mo75928xcd1e8d8());
                this.f114174e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f114175f);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f114173d) : 0;
            bw5.ro roVar2 = this.f114174e;
            if (roVar2 != null && zArr[2]) {
                a17 += b36.f.i(2, roVar2.mo75928xcd1e8d8());
            }
            return zArr[3] ? a17 + b36.f.e(3, this.f114175f) : a17;
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
            this.f114173d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f114175f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ro roVar3 = new bw5.ro();
            if (bArr != null && bArr.length > 0) {
                roVar3.mo11468x92b714fd(bArr);
            }
            this.f114174e = roVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
