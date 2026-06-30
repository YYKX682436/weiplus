package bw5;

/* loaded from: classes2.dex */
public class q00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113414d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113415e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113416f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113417g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113418h;

    /* renamed from: i, reason: collision with root package name */
    public int f113419i;

    /* renamed from: m, reason: collision with root package name */
    public int f113420m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f113421n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.pj f113422o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.x7 f113423p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f113424q = new boolean[23];

    static {
        new bw5.q00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q00 mo11468x92b714fd(byte[] bArr) {
        return (bw5.q00) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q00)) {
            return false;
        }
        bw5.q00 q00Var = (bw5.q00) fVar;
        return n51.f.a(this.f113414d, q00Var.f113414d) && n51.f.a(this.f113415e, q00Var.f113415e) && n51.f.a(this.f113416f, q00Var.f113416f) && n51.f.a(this.f113417g, q00Var.f113417g) && n51.f.a(this.f113418h, q00Var.f113418h) && n51.f.a(java.lang.Integer.valueOf(this.f113419i), java.lang.Integer.valueOf(q00Var.f113419i)) && n51.f.a(java.lang.Integer.valueOf(this.f113420m), java.lang.Integer.valueOf(q00Var.f113420m)) && n51.f.a(java.lang.Boolean.valueOf(this.f113421n), java.lang.Boolean.valueOf(q00Var.f113421n)) && n51.f.a(this.f113422o, q00Var.f113422o) && n51.f.a(this.f113423p, q00Var.f113423p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113424q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113414d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f113415e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f113416f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f113417g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f113418h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113419i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f113420m);
            }
            if (zArr[10]) {
                fVar.a(10, this.f113421n);
            }
            bw5.pj pjVar = this.f113422o;
            if (pjVar != null && zArr[21]) {
                fVar.i(21, pjVar.mo75928xcd1e8d8());
                this.f113422o.mo75956x3d5d1f78(fVar);
            }
            bw5.x7 x7Var = this.f113423p;
            if (x7Var != null && zArr[22]) {
                fVar.i(22, x7Var.mo75928xcd1e8d8());
                this.f113423p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f113414d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f113415e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f113416f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f113417g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f113418h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f113419i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f113420m);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f113421n);
            }
            bw5.pj pjVar2 = this.f113422o;
            if (pjVar2 != null && zArr[21]) {
                i18 += b36.f.i(21, pjVar2.mo75928xcd1e8d8());
            }
            bw5.x7 x7Var2 = this.f113423p;
            return (x7Var2 == null || !zArr[22]) ? i18 : i18 + b36.f.i(22, x7Var2.mo75928xcd1e8d8());
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
        if (intValue == 10) {
            this.f113421n = aVar2.c(intValue);
            zArr[10] = true;
            return 0;
        }
        if (intValue == 21) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.pj pjVar3 = new bw5.pj();
                if (bArr != null && bArr.length > 0) {
                    pjVar3.mo11468x92b714fd(bArr);
                }
                this.f113422o = pjVar3;
            }
            zArr[21] = true;
            return 0;
        }
        if (intValue == 22) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.x7 x7Var3 = new bw5.x7();
                if (bArr2 != null && bArr2.length > 0) {
                    x7Var3.mo11468x92b714fd(bArr2);
                }
                this.f113423p = x7Var3;
            }
            zArr[22] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f113414d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113415e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113416f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113417g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113418h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113419i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113420m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
