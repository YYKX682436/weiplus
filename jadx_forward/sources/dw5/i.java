package dw5;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f325899d;

    /* renamed from: e, reason: collision with root package name */
    public int f325900e;

    /* renamed from: f, reason: collision with root package name */
    public int f325901f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f325902g = new boolean[4];

    static {
        new dw5.i();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.i)) {
            return false;
        }
        dw5.i iVar = (dw5.i) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f325899d), java.lang.Boolean.valueOf(iVar.f325899d)) && n51.f.a(java.lang.Integer.valueOf(this.f325900e), java.lang.Integer.valueOf(iVar.f325900e)) && n51.f.a(java.lang.Integer.valueOf(this.f325901f), java.lang.Integer.valueOf(iVar.f325901f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new dw5.i();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f325902g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f325899d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f325900e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f325901f);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f325899d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f325900e);
            }
            return zArr[3] ? a17 + b36.f.e(3, this.f325901f) : a17;
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
            this.f325899d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f325900e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f325901f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (dw5.i) super.mo11468x92b714fd(bArr);
    }
}
