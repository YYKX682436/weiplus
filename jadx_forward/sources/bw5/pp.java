package bw5;

/* loaded from: classes2.dex */
public class pp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113307d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f113308e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113309f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113310g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f113311h;

    /* renamed from: i, reason: collision with root package name */
    public int f113312i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f113313m = new boolean[7];

    static {
        new bw5.pp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pp mo11468x92b714fd(byte[] bArr) {
        return (bw5.pp) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pp)) {
            return false;
        }
        bw5.pp ppVar = (bw5.pp) fVar;
        return n51.f.a(this.f113307d, ppVar.f113307d) && n51.f.a(java.lang.Boolean.valueOf(this.f113308e), java.lang.Boolean.valueOf(ppVar.f113308e)) && n51.f.a(this.f113309f, ppVar.f113309f) && n51.f.a(java.lang.Boolean.valueOf(this.f113310g), java.lang.Boolean.valueOf(ppVar.f113310g)) && n51.f.a(java.lang.Boolean.valueOf(this.f113311h), java.lang.Boolean.valueOf(ppVar.f113311h)) && n51.f.a(java.lang.Integer.valueOf(this.f113312i), java.lang.Integer.valueOf(ppVar.f113312i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113313m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113307d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f113308e);
            }
            java.lang.String str2 = this.f113309f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f113310g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f113311h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113312i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f113307d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f113308e);
            }
            java.lang.String str4 = this.f113309f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f113310g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f113311h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f113312i) : i18;
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
        switch (intValue) {
            case 1:
                this.f113307d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113308e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113309f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113310g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113311h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113312i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
