package bw5;

/* loaded from: classes2.dex */
public class ru extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f114218d;

    /* renamed from: e, reason: collision with root package name */
    public int f114219e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f114220f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f114221g = new boolean[4];

    static {
        new bw5.ru();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ru mo11468x92b714fd(byte[] bArr) {
        return (bw5.ru) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ru)) {
            return false;
        }
        bw5.ru ruVar = (bw5.ru) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f114218d), java.lang.Boolean.valueOf(ruVar.f114218d)) && n51.f.a(java.lang.Integer.valueOf(this.f114219e), java.lang.Integer.valueOf(ruVar.f114219e)) && n51.f.a(this.f114220f, ruVar.f114220f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ru();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114221g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f114218d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f114219e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f114220f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f114218d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f114219e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f114220f;
            return (gVar2 == null || !zArr[3]) ? a17 : a17 + b36.f.b(3, gVar2);
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
            this.f114218d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114219e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f114220f = aVar2.d(intValue);
        zArr[3] = true;
        return 0;
    }
}
