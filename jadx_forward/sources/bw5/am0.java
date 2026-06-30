package bw5;

/* loaded from: classes2.dex */
public class am0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f106799d;

    /* renamed from: e, reason: collision with root package name */
    public long f106800e;

    /* renamed from: f, reason: collision with root package name */
    public int f106801f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.cm0 f106802g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.fn0 f106803h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f106804i = new boolean[6];

    static {
        new bw5.am0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.am0)) {
            return false;
        }
        bw5.am0 am0Var = (bw5.am0) fVar;
        return n51.f.a(this.f106799d, am0Var.f106799d) && n51.f.a(java.lang.Long.valueOf(this.f106800e), java.lang.Long.valueOf(am0Var.f106800e)) && n51.f.a(java.lang.Integer.valueOf(this.f106801f), java.lang.Integer.valueOf(am0Var.f106801f)) && n51.f.a(this.f106802g, am0Var.f106802g) && n51.f.a(this.f106803h, am0Var.f106803h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.am0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f106804i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f106799d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f106800e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f106801f);
            }
            bw5.cm0 cm0Var = this.f106802g;
            if (cm0Var != null && zArr[4]) {
                fVar.e(4, cm0Var.f107700d);
            }
            bw5.fn0 fn0Var = this.f106803h;
            if (fn0Var != null && zArr[5]) {
                fVar.i(5, fn0Var.mo75928xcd1e8d8());
                this.f106803h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f106799d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f106800e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f106801f);
            }
            bw5.cm0 cm0Var2 = this.f106802g;
            if (cm0Var2 != null && zArr[4]) {
                i18 += b36.f.e(4, cm0Var2.f107700d);
            }
            bw5.fn0 fn0Var2 = this.f106803h;
            return (fn0Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, fn0Var2.mo75928xcd1e8d8());
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
            this.f106799d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f106800e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f106801f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            int g17 = aVar2.g(intValue);
            this.f106802g = g17 != 0 ? g17 != 1 ? null : bw5.cm0.STATUS_THUMB : bw5.cm0.STATUS_MEDIA;
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.fn0 fn0Var3 = new bw5.fn0();
            if (bArr != null && bArr.length > 0) {
                fn0Var3.mo11468x92b714fd(bArr);
            }
            this.f106803h = fn0Var3;
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.am0) super.mo11468x92b714fd(bArr);
    }
}
