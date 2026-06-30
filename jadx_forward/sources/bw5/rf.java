package bw5;

/* loaded from: classes2.dex */
public class rf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f114035d;

    /* renamed from: e, reason: collision with root package name */
    public int f114036e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f114037f;

    /* renamed from: g, reason: collision with root package name */
    public int f114038g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f114039h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f114040i = new boolean[22];

    static {
        new bw5.rf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rf mo11468x92b714fd(byte[] bArr) {
        return (bw5.rf) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rf)) {
            return false;
        }
        bw5.rf rfVar = (bw5.rf) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f114035d), java.lang.Boolean.valueOf(rfVar.f114035d)) && n51.f.a(java.lang.Integer.valueOf(this.f114036e), java.lang.Integer.valueOf(rfVar.f114036e)) && n51.f.a(java.lang.Boolean.valueOf(this.f114037f), java.lang.Boolean.valueOf(rfVar.f114037f)) && n51.f.a(java.lang.Integer.valueOf(this.f114038g), java.lang.Integer.valueOf(rfVar.f114038g)) && n51.f.a(this.f114039h, rfVar.f114039h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114040i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f114035d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f114036e);
            }
            if (zArr[11]) {
                fVar.a(11, this.f114037f);
            }
            if (zArr[12]) {
                fVar.e(12, this.f114038g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f114039h;
            if (gVar != null && zArr[21]) {
                fVar.b(21, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f114035d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f114036e);
            }
            if (zArr[11]) {
                a17 += b36.f.a(11, this.f114037f);
            }
            if (zArr[12]) {
                a17 += b36.f.e(12, this.f114038g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f114039h;
            return (gVar2 == null || !zArr[21]) ? a17 : a17 + b36.f.b(21, gVar2);
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
            this.f114035d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114036e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 11) {
            this.f114037f = aVar2.c(intValue);
            zArr[11] = true;
            return 0;
        }
        if (intValue == 12) {
            this.f114038g = aVar2.g(intValue);
            zArr[12] = true;
            return 0;
        }
        if (intValue != 21) {
            return -1;
        }
        this.f114039h = aVar2.d(intValue);
        zArr[21] = true;
        return 0;
    }
}
