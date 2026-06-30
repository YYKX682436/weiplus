package bw5;

/* loaded from: classes2.dex */
public class te extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f114941d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114942e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114943f;

    /* renamed from: g, reason: collision with root package name */
    public long f114944g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f114945h = new boolean[5];

    static {
        new bw5.te();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.te mo11468x92b714fd(byte[] bArr) {
        return (bw5.te) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.te)) {
            return false;
        }
        bw5.te teVar = (bw5.te) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f114941d), java.lang.Long.valueOf(teVar.f114941d)) && n51.f.a(this.f114942e, teVar.f114942e) && n51.f.a(this.f114943f, teVar.f114943f) && n51.f.a(java.lang.Long.valueOf(this.f114944g), java.lang.Long.valueOf(teVar.f114944g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.te();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114945h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f114941d);
            }
            java.lang.String str = this.f114942e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f114943f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f114944g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f114941d) : 0;
            java.lang.String str3 = this.f114942e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f114943f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            return zArr[4] ? h17 + b36.f.h(4, this.f114944g) : h17;
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
            this.f114941d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114942e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f114943f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f114944g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
