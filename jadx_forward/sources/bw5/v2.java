package bw5;

/* loaded from: classes8.dex */
public class v2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.u2 f115653d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.k f115654e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115655f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f115656g = new boolean[4];

    static {
        new bw5.v2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v2)) {
            return false;
        }
        bw5.v2 v2Var = (bw5.v2) fVar;
        return n51.f.a(this.f115653d, v2Var.f115653d) && n51.f.a(this.f115654e, v2Var.f115654e) && n51.f.a(this.f115655f, v2Var.f115655f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.v2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.u2 u2Var;
        boolean[] zArr = this.f115656g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.u2 u2Var2 = this.f115653d;
            if (u2Var2 != null && zArr[1]) {
                fVar.e(1, u2Var2.f115241d);
            }
            bw5.k kVar = this.f115654e;
            if (kVar != null && zArr[2]) {
                fVar.e(2, kVar.f110720d);
            }
            java.lang.String str = this.f115655f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.u2 u2Var3 = this.f115653d;
            if (u2Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, u2Var3.f115241d);
            }
            bw5.k kVar2 = this.f115654e;
            if (kVar2 != null && zArr[2]) {
                i18 += b36.f.e(2, kVar2.f110720d);
            }
            java.lang.String str2 = this.f115655f;
            return (str2 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str2);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f115654e = bw5.k.a(aVar2.g(intValue));
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f115655f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        switch (aVar2.g(intValue)) {
            case 0:
                u2Var = bw5.u2.BillServiceStatusIDLE;
                break;
            case 1:
                u2Var = bw5.u2.BillServiceStatusBillCreating;
                break;
            case 2:
                u2Var = bw5.u2.BillServiceStatusPendingPay;
                break;
            case 3:
                u2Var = bw5.u2.BillServiceStatusPaying;
                break;
            case 4:
                u2Var = bw5.u2.BillServiceStatusVerifying;
                break;
            case 5:
                u2Var = bw5.u2.BillServiceStatusFinish;
                break;
            case 6:
                u2Var = bw5.u2.BillServiceStatusCancelled;
                break;
            case 7:
                u2Var = bw5.u2.BillServiceStatusError;
                break;
            default:
                u2Var = null;
                break;
        }
        this.f115653d = u2Var;
        zArr[1] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.v2) super.mo11468x92b714fd(bArr);
    }
}
