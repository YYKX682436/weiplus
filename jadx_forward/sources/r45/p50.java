package r45;

/* loaded from: classes8.dex */
public class p50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f464289d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464290e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464291f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464292g;

    /* renamed from: h, reason: collision with root package name */
    public r45.l50 f464293h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p50)) {
            return false;
        }
        r45.p50 p50Var = (r45.p50) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f464289d), java.lang.Long.valueOf(p50Var.f464289d)) && n51.f.a(this.f464290e, p50Var.f464290e) && n51.f.a(this.f464291f, p50Var.f464291f) && n51.f.a(this.f464292g, p50Var.f464292g) && n51.f.a(this.f464293h, p50Var.f464293h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f464289d);
            java.lang.String str = this.f464290e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f464291f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f464292g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.l50 l50Var = this.f464293h;
            if (l50Var != null) {
                fVar.i(5, l50Var.mo75928xcd1e8d8());
                this.f464293h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f464289d) + 0;
            java.lang.String str4 = this.f464290e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f464291f;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f464292g;
            if (str6 != null) {
                h17 += b36.f.j(4, str6);
            }
            r45.l50 l50Var2 = this.f464293h;
            return l50Var2 != null ? h17 + b36.f.i(5, l50Var2.mo75928xcd1e8d8()) : h17;
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
        r45.p50 p50Var = (r45.p50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p50Var.f464289d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            p50Var.f464290e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            p50Var.f464291f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            p50Var.f464292g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.l50 l50Var3 = new r45.l50();
            if (bArr != null && bArr.length > 0) {
                l50Var3.mo11468x92b714fd(bArr);
            }
            p50Var.f464293h = l50Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f464289d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, valueOf, false);
            eVar.d(jSONObject, "objectBuffer", this.f464290e, false);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37641x4a9d0f2f, this.f464291f, false);
            eVar.d(jSONObject, "requestId", this.f464292g, false);
            eVar.d(jSONObject, "appInfo", this.f464293h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
