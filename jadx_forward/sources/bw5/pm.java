package bw5;

/* loaded from: classes2.dex */
public class pm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f113277d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f113278e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113279f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f113280g = new boolean[4];

    static {
        new bw5.pm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pm mo11468x92b714fd(byte[] bArr) {
        return (bw5.pm) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pm)) {
            return false;
        }
        bw5.pm pmVar = (bw5.pm) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f113277d), java.lang.Long.valueOf(pmVar.f113277d)) && n51.f.a(java.lang.Boolean.valueOf(this.f113278e), java.lang.Boolean.valueOf(pmVar.f113278e)) && n51.f.a(this.f113279f, pmVar.f113279f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113280g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f113277d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f113278e);
            }
            java.lang.String str = this.f113279f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f113277d) : 0;
            if (zArr[2]) {
                h17 += b36.f.a(2, this.f113278e);
            }
            java.lang.String str2 = this.f113279f;
            return (str2 == null || !zArr[3]) ? h17 : h17 + b36.f.j(3, str2);
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
            this.f113277d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113278e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f113279f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
