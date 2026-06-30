package cw5;

/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f305886d;

    /* renamed from: e, reason: collision with root package name */
    public int f305887e;

    /* renamed from: f, reason: collision with root package name */
    public int f305888f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f305889g = new boolean[4];

    static {
        new cw5.f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof cw5.f)) {
            return false;
        }
        cw5.f fVar2 = (cw5.f) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f305886d), java.lang.Boolean.valueOf(fVar2.f305886d)) && n51.f.a(java.lang.Integer.valueOf(this.f305887e), java.lang.Integer.valueOf(fVar2.f305887e)) && n51.f.a(java.lang.Integer.valueOf(this.f305888f), java.lang.Integer.valueOf(fVar2.f305888f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new cw5.f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f305889g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f305886d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f305887e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f305888f);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f305886d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f305887e);
            }
            return zArr[3] ? a17 + b36.f.e(3, this.f305888f) : a17;
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
            this.f305886d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f305887e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f305888f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (cw5.f) super.mo11468x92b714fd(bArr);
    }
}
