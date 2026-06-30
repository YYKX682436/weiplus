package bw5;

/* loaded from: classes2.dex */
public class vr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f116000d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116001e;

    /* renamed from: f, reason: collision with root package name */
    public int f116002f;

    /* renamed from: g, reason: collision with root package name */
    public int f116003g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f116004h;

    /* renamed from: i, reason: collision with root package name */
    public int f116005i;

    /* renamed from: m, reason: collision with root package name */
    public long f116006m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f116007n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f116008o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f116009p = new boolean[10];

    static {
        new bw5.vr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vr mo11468x92b714fd(byte[] bArr) {
        return (bw5.vr) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vr)) {
            return false;
        }
        bw5.vr vrVar = (bw5.vr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116000d), java.lang.Long.valueOf(vrVar.f116000d)) && n51.f.a(this.f116001e, vrVar.f116001e) && n51.f.a(java.lang.Integer.valueOf(this.f116002f), java.lang.Integer.valueOf(vrVar.f116002f)) && n51.f.a(java.lang.Integer.valueOf(this.f116003g), java.lang.Integer.valueOf(vrVar.f116003g)) && n51.f.a(java.lang.Boolean.valueOf(this.f116004h), java.lang.Boolean.valueOf(vrVar.f116004h)) && n51.f.a(java.lang.Integer.valueOf(this.f116005i), java.lang.Integer.valueOf(vrVar.f116005i)) && n51.f.a(java.lang.Long.valueOf(this.f116006m), java.lang.Long.valueOf(vrVar.f116006m)) && n51.f.a(java.lang.Boolean.valueOf(this.f116007n), java.lang.Boolean.valueOf(vrVar.f116007n)) && n51.f.a(this.f116008o, vrVar.f116008o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116009p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f116000d);
            }
            java.lang.String str = this.f116001e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116002f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116003g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f116004h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f116005i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f116006m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f116007n);
            }
            java.lang.String str2 = this.f116008o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f116000d) : 0;
            java.lang.String str3 = this.f116001e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f116002f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f116003g);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f116004h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f116005i);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f116006m);
            }
            if (zArr[8]) {
                h17 += b36.f.a(8, this.f116007n);
            }
            java.lang.String str4 = this.f116008o;
            return (str4 == null || !zArr[9]) ? h17 : h17 + b36.f.j(9, str4);
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
                this.f116000d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116001e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116002f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116003g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116004h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116005i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116006m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116007n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f116008o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
