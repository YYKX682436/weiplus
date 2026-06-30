package r45;

/* loaded from: classes8.dex */
public class ml4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f462159d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f462160e;

    /* renamed from: f, reason: collision with root package name */
    public int f462161f;

    /* renamed from: g, reason: collision with root package name */
    public int f462162g;

    /* renamed from: h, reason: collision with root package name */
    public int f462163h;

    /* renamed from: i, reason: collision with root package name */
    public int f462164i;

    /* renamed from: m, reason: collision with root package name */
    public int f462165m;

    /* renamed from: n, reason: collision with root package name */
    public long f462166n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f462167o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ml4)) {
            return false;
        }
        r45.ml4 ml4Var = (r45.ml4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462159d), java.lang.Integer.valueOf(ml4Var.f462159d)) && n51.f.a(this.f462160e, ml4Var.f462160e) && n51.f.a(java.lang.Integer.valueOf(this.f462161f), java.lang.Integer.valueOf(ml4Var.f462161f)) && n51.f.a(java.lang.Integer.valueOf(this.f462162g), java.lang.Integer.valueOf(ml4Var.f462162g)) && n51.f.a(java.lang.Integer.valueOf(this.f462163h), java.lang.Integer.valueOf(ml4Var.f462163h)) && n51.f.a(java.lang.Integer.valueOf(this.f462164i), java.lang.Integer.valueOf(ml4Var.f462164i)) && n51.f.a(java.lang.Integer.valueOf(this.f462165m), java.lang.Integer.valueOf(ml4Var.f462165m)) && n51.f.a(java.lang.Long.valueOf(this.f462166n), java.lang.Long.valueOf(ml4Var.f462166n)) && n51.f.a(this.f462167o, ml4Var.f462167o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462159d);
            r45.du5 du5Var = this.f462160e;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f462160e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f462161f);
            fVar.e(4, this.f462162g);
            fVar.e(5, this.f462163h);
            fVar.e(6, this.f462164i);
            fVar.e(7, this.f462165m);
            fVar.h(8, this.f462166n);
            java.lang.String str = this.f462167o;
            if (str != null) {
                fVar.j(9, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462159d) + 0;
            r45.du5 du5Var2 = this.f462160e;
            if (du5Var2 != null) {
                e17 += b36.f.i(2, du5Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(3, this.f462161f) + b36.f.e(4, this.f462162g) + b36.f.e(5, this.f462163h) + b36.f.e(6, this.f462164i) + b36.f.e(7, this.f462165m) + b36.f.h(8, this.f462166n);
            java.lang.String str2 = this.f462167o;
            return str2 != null ? e18 + b36.f.j(9, str2) : e18;
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
        r45.ml4 ml4Var = (r45.ml4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ml4Var.f462159d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var3.b(bArr);
                    }
                    ml4Var.f462160e = du5Var3;
                }
                return 0;
            case 3:
                ml4Var.f462161f = aVar2.g(intValue);
                return 0;
            case 4:
                ml4Var.f462162g = aVar2.g(intValue);
                return 0;
            case 5:
                ml4Var.f462163h = aVar2.g(intValue);
                return 0;
            case 6:
                ml4Var.f462164i = aVar2.g(intValue);
                return 0;
            case 7:
                ml4Var.f462165m = aVar2.g(intValue);
                return 0;
            case 8:
                ml4Var.f462166n = aVar2.i(intValue);
                return 0;
            case 9:
                ml4Var.f462167o = aVar2.k(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f462159d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Ret", valueOf, false);
            eVar.d(jSONObject, "ToUserName", this.f462160e, false);
            eVar.d(jSONObject, "MsgId", java.lang.Integer.valueOf(this.f462161f), false);
            eVar.d(jSONObject, "ClientMsgId", java.lang.Integer.valueOf(this.f462162g), false);
            eVar.d(jSONObject, "CreateTime", java.lang.Integer.valueOf(this.f462163h), false);
            eVar.d(jSONObject, "ServerTime", java.lang.Integer.valueOf(this.f462164i), false);
            eVar.d(jSONObject, "Type", java.lang.Integer.valueOf(this.f462165m), false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f462166n), false);
            eVar.d(jSONObject, "MsgSource", this.f462167o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
