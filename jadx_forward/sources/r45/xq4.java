package r45;

/* loaded from: classes8.dex */
public class xq4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471866d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471867e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471868f;

    /* renamed from: g, reason: collision with root package name */
    public int f471869g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f471870h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f471871i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xq4)) {
            return false;
        }
        r45.xq4 xq4Var = (r45.xq4) fVar;
        return n51.f.a(this.f471866d, xq4Var.f471866d) && n51.f.a(this.f471867e, xq4Var.f471867e) && n51.f.a(this.f471868f, xq4Var.f471868f) && n51.f.a(java.lang.Integer.valueOf(this.f471869g), java.lang.Integer.valueOf(xq4Var.f471869g)) && n51.f.a(java.lang.Boolean.valueOf(this.f471870h), java.lang.Boolean.valueOf(xq4Var.f471870h)) && n51.f.a(java.lang.Boolean.valueOf(this.f471871i), java.lang.Boolean.valueOf(xq4Var.f471871i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471866d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f471867e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f471868f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f471869g);
            fVar.a(5, this.f471870h);
            fVar.a(6, this.f471871i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f471866d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f471867e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f471868f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f471869g) + b36.f.a(5, this.f471870h) + b36.f.a(6, this.f471871i);
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
        r45.xq4 xq4Var = (r45.xq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xq4Var.f471866d = aVar2.k(intValue);
                return 0;
            case 2:
                xq4Var.f471867e = aVar2.k(intValue);
                return 0;
            case 3:
                xq4Var.f471868f = aVar2.k(intValue);
                return 0;
            case 4:
                xq4Var.f471869g = aVar2.g(intValue);
                return 0;
            case 5:
                xq4Var.f471870h = aVar2.c(intValue);
                return 0;
            case 6:
                xq4Var.f471871i = aVar2.c(intValue);
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
            java.lang.String str = this.f471866d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "from_username", str, false);
            eVar.d(jSONObject, "to_username", this.f471867e, false);
            eVar.d(jSONObject, "msg_session_id", this.f471868f, false);
            eVar.d(jSONObject, "session_status", java.lang.Integer.valueOf(this.f471869g), false);
            eVar.d(jSONObject, "can_change_identity", java.lang.Boolean.valueOf(this.f471870h), false);
            eVar.d(jSONObject, "can_recv_msg", java.lang.Boolean.valueOf(this.f471871i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
