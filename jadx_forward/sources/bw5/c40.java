package bw5;

/* loaded from: classes2.dex */
public class c40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f107448d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ev f107449e;

    /* renamed from: f, reason: collision with root package name */
    public int f107450f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107451g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.ju f107452h;

    /* renamed from: i, reason: collision with root package name */
    public int f107453i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f107454m;

    /* renamed from: n, reason: collision with root package name */
    public int f107455n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f107456o = new boolean[9];

    static {
        new bw5.c40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c40)) {
            return false;
        }
        bw5.c40 c40Var = (bw5.c40) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f107448d), java.lang.Long.valueOf(c40Var.f107448d)) && n51.f.a(this.f107449e, c40Var.f107449e) && n51.f.a(java.lang.Integer.valueOf(this.f107450f), java.lang.Integer.valueOf(c40Var.f107450f)) && n51.f.a(this.f107451g, c40Var.f107451g) && n51.f.a(this.f107452h, c40Var.f107452h) && n51.f.a(java.lang.Integer.valueOf(this.f107453i), java.lang.Integer.valueOf(c40Var.f107453i)) && n51.f.a(this.f107454m, c40Var.f107454m) && n51.f.a(java.lang.Integer.valueOf(this.f107455n), java.lang.Integer.valueOf(c40Var.f107455n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107456o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f107448d);
            }
            bw5.ev evVar = this.f107449e;
            if (evVar != null && zArr[2]) {
                fVar.i(2, evVar.mo75928xcd1e8d8());
                this.f107449e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107450f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107451g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            bw5.ju juVar = this.f107452h;
            if (juVar != null && zArr[5]) {
                fVar.i(5, juVar.mo75928xcd1e8d8());
                this.f107452h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107453i);
            }
            java.lang.String str = this.f107454m;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            if (zArr[8]) {
                fVar.e(8, this.f107455n);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f107448d) : 0;
            bw5.ev evVar2 = this.f107449e;
            if (evVar2 != null && zArr[2]) {
                h17 += b36.f.i(2, evVar2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f107450f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107451g;
            if (gVar2 != null && zArr[4]) {
                h17 += b36.f.b(4, gVar2);
            }
            bw5.ju juVar2 = this.f107452h;
            if (juVar2 != null && zArr[5]) {
                h17 += b36.f.i(5, juVar2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f107453i);
            }
            java.lang.String str2 = this.f107454m;
            if (str2 != null && zArr[7]) {
                h17 += b36.f.j(7, str2);
            }
            return zArr[8] ? h17 + b36.f.e(8, this.f107455n) : h17;
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
                this.f107448d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ev evVar3 = new bw5.ev();
                    if (bArr != null && bArr.length > 0) {
                        evVar3.mo11468x92b714fd(bArr);
                    }
                    this.f107449e = evVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f107450f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107451g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ju juVar3 = new bw5.ju();
                    if (bArr2 != null && bArr2.length > 0) {
                        juVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f107452h = juVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f107453i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107454m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107455n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.c40) super.mo11468x92b714fd(bArr);
    }
}
