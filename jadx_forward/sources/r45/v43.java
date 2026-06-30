package r45;

/* loaded from: classes4.dex */
public class v43 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469402d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f469403e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f469404f;

    /* renamed from: g, reason: collision with root package name */
    public int f469405g;

    /* renamed from: h, reason: collision with root package name */
    public int f469406h;

    /* renamed from: i, reason: collision with root package name */
    public int f469407i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469408m;

    /* renamed from: n, reason: collision with root package name */
    public long f469409n;

    /* renamed from: o, reason: collision with root package name */
    public int f469410o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v43)) {
            return false;
        }
        r45.v43 v43Var = (r45.v43) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469402d), java.lang.Integer.valueOf(v43Var.f469402d)) && n51.f.a(this.f469403e, v43Var.f469403e) && n51.f.a(this.f469404f, v43Var.f469404f) && n51.f.a(java.lang.Integer.valueOf(this.f469405g), java.lang.Integer.valueOf(v43Var.f469405g)) && n51.f.a(java.lang.Integer.valueOf(this.f469406h), java.lang.Integer.valueOf(v43Var.f469406h)) && n51.f.a(java.lang.Integer.valueOf(this.f469407i), java.lang.Integer.valueOf(v43Var.f469407i)) && n51.f.a(this.f469408m, v43Var.f469408m) && n51.f.a(java.lang.Long.valueOf(this.f469409n), java.lang.Long.valueOf(v43Var.f469409n)) && n51.f.a(java.lang.Integer.valueOf(this.f469410o), java.lang.Integer.valueOf(v43Var.f469410o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469402d);
            r45.du5 du5Var = this.f469403e;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f469403e.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var2 = this.f469404f;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.mo75928xcd1e8d8());
                this.f469404f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f469405g);
            fVar.e(5, this.f469406h);
            fVar.e(6, this.f469407i);
            java.lang.String str = this.f469408m;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.h(8, this.f469409n);
            fVar.e(9, this.f469410o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469402d) + 0;
            r45.du5 du5Var3 = this.f469403e;
            if (du5Var3 != null) {
                e17 += b36.f.i(2, du5Var3.mo75928xcd1e8d8());
            }
            r45.du5 du5Var4 = this.f469404f;
            if (du5Var4 != null) {
                e17 += b36.f.i(3, du5Var4.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(4, this.f469405g) + b36.f.e(5, this.f469406h) + b36.f.e(6, this.f469407i);
            java.lang.String str2 = this.f469408m;
            if (str2 != null) {
                e18 += b36.f.j(7, str2);
            }
            return e18 + b36.f.h(8, this.f469409n) + b36.f.e(9, this.f469410o);
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
        r45.v43 v43Var = (r45.v43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v43Var.f469402d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var5.b(bArr);
                    }
                    v43Var.f469403e = du5Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var6.b(bArr2);
                    }
                    v43Var.f469404f = du5Var6;
                }
                return 0;
            case 4:
                v43Var.f469405g = aVar2.g(intValue);
                return 0;
            case 5:
                v43Var.f469406h = aVar2.g(intValue);
                return 0;
            case 6:
                v43Var.f469407i = aVar2.g(intValue);
                return 0;
            case 7:
                v43Var.f469408m = aVar2.k(intValue);
                return 0;
            case 8:
                v43Var.f469409n = aVar2.i(intValue);
                return 0;
            case 9:
                v43Var.f469410o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f469402d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "MsgId", valueOf, false);
            eVar.d(jSONObject, "FromUserName", this.f469403e, false);
            eVar.d(jSONObject, "ToUserName", this.f469404f, false);
            eVar.d(jSONObject, "MsgType", java.lang.Integer.valueOf(this.f469405g), false);
            eVar.d(jSONObject, "AppMsgInnerType", java.lang.Integer.valueOf(this.f469406h), false);
            eVar.d(jSONObject, "CreateTime", java.lang.Integer.valueOf(this.f469407i), false);
            eVar.d(jSONObject, "MsgSource", this.f469408m, false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f469409n), false);
            eVar.d(jSONObject, "MsgSeq", java.lang.Integer.valueOf(this.f469410o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
