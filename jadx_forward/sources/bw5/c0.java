package bw5;

/* loaded from: classes2.dex */
public class c0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f107404d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107405e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107406f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f107407g = new boolean[4];

    static {
        new bw5.c0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c0)) {
            return false;
        }
        bw5.c0 c0Var = (bw5.c0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f107404d), java.lang.Long.valueOf(c0Var.f107404d)) && n51.f.a(this.f107405e, c0Var.f107405e) && n51.f.a(this.f107406f, c0Var.f107406f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107407g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f107404d);
            }
            java.lang.String str = this.f107405e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107406f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f107404d) : 0;
            java.lang.String str2 = this.f107405e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107406f;
            return (gVar2 == null || !zArr[3]) ? h17 : h17 + b36.f.b(3, gVar2);
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
            this.f107404d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107405e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f107406f = aVar2.d(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.c0) super.mo11468x92b714fd(bArr);
    }
}
