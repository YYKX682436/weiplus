package er4;

/* loaded from: classes8.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final er4.g f337615i = new er4.g();

    /* renamed from: d, reason: collision with root package name */
    public long f337616d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f337617e;

    /* renamed from: f, reason: collision with root package name */
    public er4.r f337618f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f337619g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f337620h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof er4.g)) {
            return false;
        }
        er4.g gVar = (er4.g) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f337616d), java.lang.Long.valueOf(gVar.f337616d)) && n51.f.a(this.f337617e, gVar.f337617e) && n51.f.a(this.f337618f, gVar.f337618f) && n51.f.a(java.lang.Boolean.valueOf(this.f337619g), java.lang.Boolean.valueOf(gVar.f337619g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new er4.g();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f337620h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f337616d);
            }
            java.lang.String str = this.f337617e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            er4.r rVar = this.f337618f;
            if (rVar != null && zArr[3]) {
                fVar.e(3, rVar.f337699d);
            }
            if (zArr[4]) {
                fVar.a(4, this.f337619g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f337616d) : 0;
            java.lang.String str2 = this.f337617e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            er4.r rVar2 = this.f337618f;
            if (rVar2 != null && zArr[3]) {
                h17 += b36.f.e(3, rVar2.f337699d);
            }
            return zArr[4] ? h17 + b36.f.a(4, this.f337619g) : h17;
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
            this.f337616d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f337617e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f337618f = er4.r.a(aVar2.g(intValue));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f337619g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (er4.g) super.mo11468x92b714fd(bArr);
    }
}
