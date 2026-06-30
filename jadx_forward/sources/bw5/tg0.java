package bw5;

/* loaded from: classes4.dex */
public class tg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f114958d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.sg0 f114959e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pg0 f114960f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.rg0 f114961g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.qg0 f114962h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f114963i;

    /* renamed from: m, reason: collision with root package name */
    public long f114964m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f114965n = new boolean[22];

    static {
        new bw5.tg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tg0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.tg0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tg0)) {
            return false;
        }
        bw5.tg0 tg0Var = (bw5.tg0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114958d), java.lang.Integer.valueOf(tg0Var.f114958d)) && n51.f.a(this.f114959e, tg0Var.f114959e) && n51.f.a(this.f114960f, tg0Var.f114960f) && n51.f.a(this.f114961g, tg0Var.f114961g) && n51.f.a(this.f114962h, tg0Var.f114962h) && n51.f.a(this.f114963i, tg0Var.f114963i) && n51.f.a(java.lang.Long.valueOf(this.f114964m), java.lang.Long.valueOf(tg0Var.f114964m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114965n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114958d);
            }
            bw5.sg0 sg0Var = this.f114959e;
            if (sg0Var != null && zArr[2]) {
                fVar.i(2, sg0Var.mo75928xcd1e8d8());
                this.f114959e.mo75956x3d5d1f78(fVar);
            }
            bw5.pg0 pg0Var = this.f114960f;
            if (pg0Var != null && zArr[3]) {
                fVar.i(3, pg0Var.mo75928xcd1e8d8());
                this.f114960f.mo75956x3d5d1f78(fVar);
            }
            bw5.rg0 rg0Var = this.f114961g;
            if (rg0Var != null && zArr[4]) {
                fVar.i(4, rg0Var.mo75928xcd1e8d8());
                this.f114961g.mo75956x3d5d1f78(fVar);
            }
            bw5.qg0 qg0Var = this.f114962h;
            if (qg0Var != null && zArr[5]) {
                fVar.i(5, qg0Var.mo75928xcd1e8d8());
                this.f114962h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f114963i;
            if (str != null && zArr[20]) {
                fVar.j(20, str);
            }
            if (zArr[21]) {
                fVar.h(21, this.f114964m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f114958d) : 0;
            bw5.sg0 sg0Var2 = this.f114959e;
            if (sg0Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, sg0Var2.mo75928xcd1e8d8());
            }
            bw5.pg0 pg0Var2 = this.f114960f;
            if (pg0Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, pg0Var2.mo75928xcd1e8d8());
            }
            bw5.rg0 rg0Var2 = this.f114961g;
            if (rg0Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, rg0Var2.mo75928xcd1e8d8());
            }
            bw5.qg0 qg0Var2 = this.f114962h;
            if (qg0Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, qg0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f114963i;
            if (str2 != null && zArr[20]) {
                e17 += b36.f.j(20, str2);
            }
            return zArr[21] ? e17 + b36.f.h(21, this.f114964m) : e17;
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
            this.f114958d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.sg0 sg0Var3 = new bw5.sg0();
                if (bArr != null && bArr.length > 0) {
                    sg0Var3.mo11468x92b714fd(bArr);
                }
                this.f114959e = sg0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.pg0 pg0Var3 = new bw5.pg0();
                if (bArr2 != null && bArr2.length > 0) {
                    pg0Var3.mo11468x92b714fd(bArr2);
                }
                this.f114960f = pg0Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.rg0 rg0Var3 = new bw5.rg0();
                if (bArr3 != null && bArr3.length > 0) {
                    rg0Var3.mo11468x92b714fd(bArr3);
                }
                this.f114961g = rg0Var3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            if (intValue == 20) {
                this.f114963i = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            }
            if (intValue != 21) {
                return -1;
            }
            this.f114964m = aVar2.i(intValue);
            zArr[21] = true;
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr4 = (byte[]) j27.get(i28);
            bw5.qg0 qg0Var3 = new bw5.qg0();
            if (bArr4 != null && bArr4.length > 0) {
                qg0Var3.mo11468x92b714fd(bArr4);
            }
            this.f114962h = qg0Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
