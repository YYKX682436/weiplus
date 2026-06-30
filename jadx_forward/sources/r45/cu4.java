package r45;

/* loaded from: classes4.dex */
public class cu4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453367d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453368e;

    /* renamed from: f, reason: collision with root package name */
    public int f453369f;

    /* renamed from: g, reason: collision with root package name */
    public int f453370g;

    /* renamed from: h, reason: collision with root package name */
    public long f453371h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cu4)) {
            return false;
        }
        r45.cu4 cu4Var = (r45.cu4) fVar;
        return n51.f.a(this.f453367d, cu4Var.f453367d) && n51.f.a(this.f453368e, cu4Var.f453368e) && n51.f.a(java.lang.Integer.valueOf(this.f453369f), java.lang.Integer.valueOf(cu4Var.f453369f)) && n51.f.a(java.lang.Integer.valueOf(this.f453370g), java.lang.Integer.valueOf(cu4Var.f453370g)) && n51.f.a(java.lang.Long.valueOf(this.f453371h), java.lang.Long.valueOf(cu4Var.f453371h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453367d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453368e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f453369f);
            fVar.e(4, this.f453370g);
            fVar.h(5, this.f453371h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f453367d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f453368e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f453369f) + b36.f.e(4, this.f453370g) + b36.f.h(5, this.f453371h);
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
        r45.cu4 cu4Var = (r45.cu4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cu4Var.f453367d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            cu4Var.f453368e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            cu4Var.f453369f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            cu4Var.f453370g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        cu4Var.f453371h = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f453367d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "FromUserName", str, false);
            eVar.d(jSONObject, "ToUserName", this.f453368e, false);
            eVar.d(jSONObject, "MsgId", java.lang.Integer.valueOf(this.f453369f), false);
            eVar.d(jSONObject, "MsgType", java.lang.Integer.valueOf(this.f453370g), false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f453371h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
