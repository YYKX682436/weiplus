package bw5;

/* loaded from: classes2.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107399d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107400e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107401f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f107402g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107403h = new boolean[5];

    static {
        new bw5.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c mo11468x92b714fd(byte[] bArr) {
        return (bw5.c) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c)) {
            return false;
        }
        bw5.c cVar = (bw5.c) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107399d), java.lang.Integer.valueOf(cVar.f107399d)) && n51.f.a(this.f107400e, cVar.f107400e) && n51.f.a(this.f107401f, cVar.f107401f) && n51.f.a(java.lang.Boolean.valueOf(this.f107402g), java.lang.Boolean.valueOf(cVar.f107402g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107403h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107399d);
            }
            java.lang.String str = this.f107400e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f107401f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f107402g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107399d) : 0;
            java.lang.String str3 = this.f107400e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f107401f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            return zArr[4] ? e17 + b36.f.a(4, this.f107402g) : e17;
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
            this.f107399d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107400e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107401f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f107402g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
