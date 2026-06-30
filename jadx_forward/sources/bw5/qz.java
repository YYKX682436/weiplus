package bw5;

/* loaded from: classes8.dex */
public class qz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113865d;

    /* renamed from: e, reason: collision with root package name */
    public long f113866e;

    /* renamed from: f, reason: collision with root package name */
    public long f113867f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f113868g = new boolean[4];

    static {
        new bw5.qz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qz mo11468x92b714fd(byte[] bArr) {
        return (bw5.qz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qz)) {
            return false;
        }
        bw5.qz qzVar = (bw5.qz) fVar;
        return n51.f.a(this.f113865d, qzVar.f113865d) && n51.f.a(java.lang.Long.valueOf(this.f113866e), java.lang.Long.valueOf(qzVar.f113866e)) && n51.f.a(java.lang.Long.valueOf(this.f113867f), java.lang.Long.valueOf(qzVar.f113867f));
    }

    /* renamed from: getText */
    public java.lang.String m12858xfb85ada3() {
        return this.f113868g[1] ? this.f113865d : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113868g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113865d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f113866e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f113867f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f113865d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f113866e);
            }
            return zArr[3] ? i18 + b36.f.h(3, this.f113867f) : i18;
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
            this.f113865d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113866e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f113867f = aVar2.i(intValue);
        zArr[3] = true;
        return 0;
    }
}
