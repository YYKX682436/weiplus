package r45;

/* loaded from: classes4.dex */
public class rq4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466651d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466652e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466653f;

    /* renamed from: g, reason: collision with root package name */
    public int f466654g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466655h;

    /* renamed from: i, reason: collision with root package name */
    public int f466656i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rq4)) {
            return false;
        }
        r45.rq4 rq4Var = (r45.rq4) fVar;
        return n51.f.a(this.f466651d, rq4Var.f466651d) && n51.f.a(this.f466652e, rq4Var.f466652e) && n51.f.a(this.f466653f, rq4Var.f466653f) && n51.f.a(java.lang.Integer.valueOf(this.f466654g), java.lang.Integer.valueOf(rq4Var.f466654g)) && n51.f.a(this.f466655h, rq4Var.f466655h) && n51.f.a(java.lang.Integer.valueOf(this.f466656i), java.lang.Integer.valueOf(rq4Var.f466656i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466651d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466652e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466653f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f466654g);
            java.lang.String str4 = this.f466655h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f466656i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f466651d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f466652e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f466653f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f466654g);
            java.lang.String str8 = this.f466655h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f466656i);
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
        r45.rq4 rq4Var = (r45.rq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rq4Var.f466651d = aVar2.k(intValue);
                return 0;
            case 2:
                rq4Var.f466652e = aVar2.k(intValue);
                return 0;
            case 3:
                rq4Var.f466653f = aVar2.k(intValue);
                return 0;
            case 4:
                rq4Var.f466654g = aVar2.g(intValue);
                return 0;
            case 5:
                rq4Var.f466655h = aVar2.k(intValue);
                return 0;
            case 6:
                rq4Var.f466656i = aVar2.g(intValue);
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
            java.lang.String str = this.f466651d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "nickname", str, false);
            eVar.d(jSONObject, "avatar", this.f466652e, false);
            eVar.d(jSONObject, dm.i4.f66875xa013b0d5, this.f466653f, false);
            eVar.d(jSONObject, "avatar_style", java.lang.Integer.valueOf(this.f466654g), false);
            eVar.d(jSONObject, "user_jump_info_str", this.f466655h, false);
            eVar.d(jSONObject, "err_code", java.lang.Integer.valueOf(this.f466656i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
