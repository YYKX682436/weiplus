package r45;

/* loaded from: classes14.dex */
public class uc4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f468750d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pq5 f468751e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468752f;

    /* renamed from: g, reason: collision with root package name */
    public long f468753g;

    /* renamed from: h, reason: collision with root package name */
    public long f468754h;

    /* renamed from: i, reason: collision with root package name */
    public long f468755i;

    /* renamed from: m, reason: collision with root package name */
    public long f468756m;

    /* renamed from: n, reason: collision with root package name */
    public int f468757n;

    /* renamed from: o, reason: collision with root package name */
    public long f468758o = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uc4)) {
            return false;
        }
        r45.uc4 uc4Var = (r45.uc4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f468750d), java.lang.Boolean.valueOf(uc4Var.f468750d)) && n51.f.a(this.f468751e, uc4Var.f468751e) && n51.f.a(this.f468752f, uc4Var.f468752f) && n51.f.a(java.lang.Long.valueOf(this.f468753g), java.lang.Long.valueOf(uc4Var.f468753g)) && n51.f.a(java.lang.Long.valueOf(this.f468754h), java.lang.Long.valueOf(uc4Var.f468754h)) && n51.f.a(java.lang.Long.valueOf(this.f468755i), java.lang.Long.valueOf(uc4Var.f468755i)) && n51.f.a(java.lang.Long.valueOf(this.f468756m), java.lang.Long.valueOf(uc4Var.f468756m)) && n51.f.a(java.lang.Integer.valueOf(this.f468757n), java.lang.Integer.valueOf(uc4Var.f468757n)) && n51.f.a(java.lang.Long.valueOf(this.f468758o), java.lang.Long.valueOf(uc4Var.f468758o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f468750d);
            r45.pq5 pq5Var = this.f468751e;
            if (pq5Var != null) {
                fVar.i(2, pq5Var.mo75928xcd1e8d8());
                this.f468751e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f468752f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f468753g);
            fVar.h(5, this.f468754h);
            fVar.h(6, this.f468755i);
            fVar.h(7, this.f468756m);
            fVar.e(8, this.f468757n);
            fVar.h(9, this.f468758o);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f468750d) + 0;
            r45.pq5 pq5Var2 = this.f468751e;
            if (pq5Var2 != null) {
                a17 += b36.f.i(2, pq5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f468752f;
            if (str2 != null) {
                a17 += b36.f.j(3, str2);
            }
            return a17 + b36.f.h(4, this.f468753g) + b36.f.h(5, this.f468754h) + b36.f.h(6, this.f468755i) + b36.f.h(7, this.f468756m) + b36.f.e(8, this.f468757n) + b36.f.h(9, this.f468758o);
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
        r45.uc4 uc4Var = (r45.uc4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uc4Var.f468750d = aVar2.c(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.pq5 pq5Var3 = new r45.pq5();
                    if (bArr != null && bArr.length > 0) {
                        pq5Var3.mo11468x92b714fd(bArr);
                    }
                    uc4Var.f468751e = pq5Var3;
                }
                return 0;
            case 3:
                uc4Var.f468752f = aVar2.k(intValue);
                return 0;
            case 4:
                uc4Var.f468753g = aVar2.i(intValue);
                return 0;
            case 5:
                uc4Var.f468754h = aVar2.i(intValue);
                return 0;
            case 6:
                uc4Var.f468755i = aVar2.i(intValue);
                return 0;
            case 7:
                uc4Var.f468756m = aVar2.i(intValue);
                return 0;
            case 8:
                uc4Var.f468757n = aVar2.g(intValue);
                return 0;
            case 9:
                uc4Var.f468758o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f468750d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "isBatchReport", valueOf, false);
            eVar.d(jSONObject, "itemData", this.f468751e, false);
            eVar.d(jSONObject, "dataSource", this.f468752f, false);
            eVar.d(jSONObject, "curReportTime", java.lang.Long.valueOf(this.f468753g), false);
            eVar.d(jSONObject, "localItemReportId", java.lang.Long.valueOf(this.f468754h), false);
            eVar.d(jSONObject, "retryDelayTime", java.lang.Long.valueOf(this.f468755i), false);
            eVar.d(jSONObject, "lastRetryTime", java.lang.Long.valueOf(this.f468756m), false);
            eVar.d(jSONObject, "sendErrCode", java.lang.Integer.valueOf(this.f468757n), false);
            eVar.d(jSONObject, "batchDelayTime", java.lang.Long.valueOf(this.f468758o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
