package bw5;

/* loaded from: classes2.dex */
public class ak0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final bw5.ak0 f106780n = new bw5.ak0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f106781d;

    /* renamed from: e, reason: collision with root package name */
    public long f106782e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.to0 f106783f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.fk0 f106784g;

    /* renamed from: h, reason: collision with root package name */
    public long f106785h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f106786i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f106787m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ak0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ak0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ak0)) {
            return false;
        }
        bw5.ak0 ak0Var = (bw5.ak0) fVar;
        return n51.f.a(this.f106781d, ak0Var.f106781d) && n51.f.a(java.lang.Long.valueOf(this.f106782e), java.lang.Long.valueOf(ak0Var.f106782e)) && n51.f.a(this.f106783f, ak0Var.f106783f) && n51.f.a(this.f106784g, ak0Var.f106784g) && n51.f.a(java.lang.Long.valueOf(this.f106785h), java.lang.Long.valueOf(ak0Var.f106785h)) && n51.f.a(java.lang.Boolean.valueOf(this.f106786i), java.lang.Boolean.valueOf(ak0Var.f106786i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ak0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f106787m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f106781d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f106782e);
            }
            bw5.to0 to0Var = this.f106783f;
            if (to0Var != null && zArr[3]) {
                fVar.i(3, to0Var.mo75928xcd1e8d8());
                this.f106783f.mo75956x3d5d1f78(fVar);
            }
            bw5.fk0 fk0Var = this.f106784g;
            if (fk0Var != null && zArr[4]) {
                fVar.i(4, fk0Var.mo75928xcd1e8d8());
                this.f106784g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.h(5, this.f106785h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f106786i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f106781d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f106782e);
            }
            bw5.to0 to0Var2 = this.f106783f;
            if (to0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, to0Var2.mo75928xcd1e8d8());
            }
            bw5.fk0 fk0Var2 = this.f106784g;
            if (fk0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, fk0Var2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f106785h);
            }
            return zArr[6] ? i18 + b36.f.a(6, this.f106786i) : i18;
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
                this.f106781d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f106782e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.to0 to0Var3 = new bw5.to0();
                    if (bArr != null && bArr.length > 0) {
                        to0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f106783f = to0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.fk0 fk0Var3 = new bw5.fk0();
                    if (bArr2 != null && bArr2.length > 0) {
                        fk0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f106784g = fk0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f106785h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f106786i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
