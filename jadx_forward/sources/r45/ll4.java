package r45;

/* loaded from: classes12.dex */
public class ll4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f461105d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461106e;

    /* renamed from: f, reason: collision with root package name */
    public int f461107f;

    /* renamed from: g, reason: collision with root package name */
    public int f461108g;

    /* renamed from: h, reason: collision with root package name */
    public int f461109h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461110i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461111m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ll4)) {
            return false;
        }
        r45.ll4 ll4Var = (r45.ll4) fVar;
        return n51.f.a(this.f461105d, ll4Var.f461105d) && n51.f.a(this.f461106e, ll4Var.f461106e) && n51.f.a(java.lang.Integer.valueOf(this.f461107f), java.lang.Integer.valueOf(ll4Var.f461107f)) && n51.f.a(java.lang.Integer.valueOf(this.f461108g), java.lang.Integer.valueOf(ll4Var.f461108g)) && n51.f.a(java.lang.Integer.valueOf(this.f461109h), java.lang.Integer.valueOf(ll4Var.f461109h)) && n51.f.a(this.f461110i, ll4Var.f461110i) && n51.f.a(this.f461111m, ll4Var.f461111m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f461105d;
            if (du5Var != null) {
                fVar.i(1, du5Var.mo75928xcd1e8d8());
                this.f461105d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f461106e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f461107f);
            fVar.e(4, this.f461108g);
            fVar.e(5, this.f461109h);
            java.lang.String str2 = this.f461110i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f461111m;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var2 = this.f461105d;
            int i18 = du5Var2 != null ? 0 + b36.f.i(1, du5Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f461106e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f461107f) + b36.f.e(4, this.f461108g) + b36.f.e(5, this.f461109h);
            java.lang.String str5 = this.f461110i;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f461111m;
            return str6 != null ? e17 + b36.f.j(9, str6) : e17;
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
        r45.ll4 ll4Var = (r45.ll4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 9) {
            ll4Var.f461111m = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var3.b(bArr);
                    }
                    ll4Var.f461105d = du5Var3;
                }
                return 0;
            case 2:
                ll4Var.f461106e = aVar2.k(intValue);
                return 0;
            case 3:
                ll4Var.f461107f = aVar2.g(intValue);
                return 0;
            case 4:
                ll4Var.f461108g = aVar2.g(intValue);
                return 0;
            case 5:
                ll4Var.f461109h = aVar2.g(intValue);
                return 0;
            case 6:
                ll4Var.f461110i = aVar2.k(intValue);
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
            r45.du5 du5Var = this.f461105d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "ToUserName", du5Var, false);
            eVar.d(jSONObject, "Content", this.f461106e, false);
            eVar.d(jSONObject, "Type", java.lang.Integer.valueOf(this.f461107f), false);
            eVar.d(jSONObject, "CreateTime", java.lang.Integer.valueOf(this.f461108g), false);
            eVar.d(jSONObject, "ClientMsgId", java.lang.Integer.valueOf(this.f461109h), false);
            eVar.d(jSONObject, "MsgSource", this.f461110i, false);
            eVar.d(jSONObject, "SendMsgTicket", this.f461111m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
