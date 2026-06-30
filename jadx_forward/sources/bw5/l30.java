package bw5;

/* loaded from: classes2.dex */
public class l30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111155d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111156e;

    /* renamed from: f, reason: collision with root package name */
    public int f111157f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ui f111158g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111159h = new boolean[5];

    static {
        new bw5.l30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l30 mo11468x92b714fd(byte[] bArr) {
        return (bw5.l30) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l30)) {
            return false;
        }
        bw5.l30 l30Var = (bw5.l30) fVar;
        return n51.f.a(this.f111155d, l30Var.f111155d) && n51.f.a(this.f111156e, l30Var.f111156e) && n51.f.a(java.lang.Integer.valueOf(this.f111157f), java.lang.Integer.valueOf(l30Var.f111157f)) && n51.f.a(this.f111158g, l30Var.f111158g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.l30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111159h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111155d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111156e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111157f);
            }
            bw5.ui uiVar = this.f111158g;
            if (uiVar != null && zArr[4]) {
                fVar.i(4, uiVar.mo75928xcd1e8d8());
                this.f111158g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f111155d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f111156e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f111157f);
            }
            bw5.ui uiVar2 = this.f111158g;
            return (uiVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, uiVar2.mo75928xcd1e8d8());
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
            this.f111155d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111156e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f111157f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ui uiVar3 = new bw5.ui();
            if (bArr != null && bArr.length > 0) {
                uiVar3.mo11468x92b714fd(bArr);
            }
            this.f111158g = uiVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
