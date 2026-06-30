package r45;

/* loaded from: classes8.dex */
public class kl0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.b50 f460332d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460333e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460334f;

    /* renamed from: g, reason: collision with root package name */
    public long f460335g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460336h;

    /* renamed from: i, reason: collision with root package name */
    public int f460337i;

    /* renamed from: m, reason: collision with root package name */
    public int f460338m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kl0)) {
            return false;
        }
        r45.kl0 kl0Var = (r45.kl0) fVar;
        return n51.f.a(this.f460332d, kl0Var.f460332d) && n51.f.a(this.f460333e, kl0Var.f460333e) && n51.f.a(this.f460334f, kl0Var.f460334f) && n51.f.a(java.lang.Long.valueOf(this.f460335g), java.lang.Long.valueOf(kl0Var.f460335g)) && n51.f.a(this.f460336h, kl0Var.f460336h) && n51.f.a(java.lang.Integer.valueOf(this.f460337i), java.lang.Integer.valueOf(kl0Var.f460337i)) && n51.f.a(java.lang.Integer.valueOf(this.f460338m), java.lang.Integer.valueOf(kl0Var.f460338m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.b50 b50Var = this.f460332d;
            if (b50Var != null) {
                fVar.i(1, b50Var.mo75928xcd1e8d8());
                this.f460332d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460333e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460334f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f460335g);
            java.lang.String str3 = this.f460336h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f460337i);
            fVar.e(7, this.f460338m);
            return 0;
        }
        if (i17 == 1) {
            r45.b50 b50Var2 = this.f460332d;
            int i18 = b50Var2 != null ? 0 + b36.f.i(1, b50Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f460333e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f460334f;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int h17 = i18 + b36.f.h(4, this.f460335g);
            java.lang.String str6 = this.f460336h;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            return h17 + b36.f.e(6, this.f460337i) + b36.f.e(7, this.f460338m);
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
        r45.kl0 kl0Var = (r45.kl0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.b50 b50Var3 = new r45.b50();
                    if (bArr != null && bArr.length > 0) {
                        b50Var3.mo11468x92b714fd(bArr);
                    }
                    kl0Var.f460332d = b50Var3;
                }
                return 0;
            case 2:
                kl0Var.f460333e = aVar2.k(intValue);
                return 0;
            case 3:
                kl0Var.f460334f = aVar2.k(intValue);
                return 0;
            case 4:
                kl0Var.f460335g = aVar2.i(intValue);
                return 0;
            case 5:
                kl0Var.f460336h = aVar2.k(intValue);
                return 0;
            case 6:
                kl0Var.f460337i = aVar2.g(intValue);
                return 0;
            case 7:
                kl0Var.f460338m = aVar2.g(intValue);
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
            r45.b50 b50Var = this.f460332d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "cmdItem", b50Var, false);
            eVar.d(jSONObject, "clientVersion", this.f460333e, false);
            eVar.d(jSONObject, "reversion", this.f460334f, false);
            eVar.d(jSONObject, "time", java.lang.Long.valueOf(this.f460335g), false);
            eVar.d(jSONObject, "errStack", this.f460336h, false);
            eVar.d(jSONObject, "callSource", java.lang.Integer.valueOf(this.f460337i), false);
            eVar.d(jSONObject, "msgType", java.lang.Integer.valueOf(this.f460338m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
