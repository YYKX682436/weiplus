package bw5;

/* loaded from: classes10.dex */
public class ib extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.kb f110048d;

    /* renamed from: e, reason: collision with root package name */
    public int f110049e;

    /* renamed from: f, reason: collision with root package name */
    public long f110050f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f110051g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f110052h = new boolean[5];

    static {
        new bw5.ib();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ib)) {
            return false;
        }
        bw5.ib ibVar = (bw5.ib) fVar;
        return n51.f.a(this.f110048d, ibVar.f110048d) && n51.f.a(java.lang.Integer.valueOf(this.f110049e), java.lang.Integer.valueOf(ibVar.f110049e)) && n51.f.a(java.lang.Long.valueOf(this.f110050f), java.lang.Long.valueOf(ibVar.f110050f)) && n51.f.a(java.lang.Boolean.valueOf(this.f110051g), java.lang.Boolean.valueOf(ibVar.f110051g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ib();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110052h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.kb kbVar = this.f110048d;
            if (kbVar != null && zArr[1]) {
                fVar.e(1, kbVar.f110861d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110049e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f110050f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f110051g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.kb kbVar2 = this.f110048d;
            if (kbVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, kbVar2.f110861d);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f110049e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f110050f);
            }
            return zArr[4] ? i18 + b36.f.a(4, this.f110051g) : i18;
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
            int g17 = aVar2.g(intValue);
            this.f110048d = g17 != 1 ? g17 != 2 ? g17 != 3 ? null : bw5.kb.Media_All : bw5.kb.Media_Video_Only : bw5.kb.Media_Image_Only;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110049e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110050f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f110051g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ib) super.mo11468x92b714fd(bArr);
    }
}
