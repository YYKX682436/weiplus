package bw5;

/* loaded from: classes2.dex */
public class ah extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f106728d;

    /* renamed from: e, reason: collision with root package name */
    public int f106729e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f106730f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f106731g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f106732h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f106733i = new boolean[6];

    static {
        new bw5.ah();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ah mo11468x92b714fd(byte[] bArr) {
        return (bw5.ah) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ah)) {
            return false;
        }
        bw5.ah ahVar = (bw5.ah) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f106728d), java.lang.Integer.valueOf(ahVar.f106728d)) && n51.f.a(java.lang.Integer.valueOf(this.f106729e), java.lang.Integer.valueOf(ahVar.f106729e)) && n51.f.a(this.f106730f, ahVar.f106730f) && n51.f.a(this.f106731g, ahVar.f106731g) && n51.f.a(this.f106732h, ahVar.f106732h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ah();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f106733i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f106728d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f106729e);
            }
            java.lang.String str = this.f106730f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f106731g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f106732h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f106728d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f106729e);
            }
            java.lang.String str4 = this.f106730f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f106731g;
            if (str5 != null && zArr[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f106732h;
            return (str6 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str6);
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
            this.f106728d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f106729e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f106730f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f106731g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f106732h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
