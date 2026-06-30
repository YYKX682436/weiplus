package bw5;

/* loaded from: classes2.dex */
public class c5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107457d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.od f107458e;

    /* renamed from: f, reason: collision with root package name */
    public int f107459f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f107460g = new boolean[4];

    static {
        new bw5.c5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.c5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c5)) {
            return false;
        }
        bw5.c5 c5Var = (bw5.c5) fVar;
        return n51.f.a(this.f107457d, c5Var.f107457d) && n51.f.a(this.f107458e, c5Var.f107458e) && n51.f.a(java.lang.Integer.valueOf(this.f107459f), java.lang.Integer.valueOf(c5Var.f107459f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107460g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107457d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.od odVar = this.f107458e;
            if (odVar != null && zArr[2]) {
                fVar.i(2, odVar.mo75928xcd1e8d8());
                this.f107458e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107459f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f107457d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.od odVar2 = this.f107458e;
            if (odVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, odVar2.mo75928xcd1e8d8());
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f107459f) : i18;
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
            this.f107457d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f107459f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.od odVar3 = new bw5.od();
            if (bArr != null && bArr.length > 0) {
                odVar3.mo11468x92b714fd(bArr);
            }
            this.f107458e = odVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
