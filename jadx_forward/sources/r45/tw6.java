package r45;

/* loaded from: classes2.dex */
public class tw6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468370d;

    /* renamed from: e, reason: collision with root package name */
    public long f468371e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468372f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tw6)) {
            return false;
        }
        r45.tw6 tw6Var = (r45.tw6) fVar;
        return n51.f.a(this.f468370d, tw6Var.f468370d) && n51.f.a(java.lang.Long.valueOf(this.f468371e), java.lang.Long.valueOf(tw6Var.f468371e)) && n51.f.a(this.f468372f, tw6Var.f468372f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468370d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f468371e);
            java.lang.String str2 = this.f468372f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f468370d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f468371e);
            java.lang.String str4 = this.f468372f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        r45.tw6 tw6Var = (r45.tw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tw6Var.f468370d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            tw6Var.f468371e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        tw6Var.f468372f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f468370d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "key", str, false);
            eVar.d(jSONObject, "uint_value", java.lang.Long.valueOf(this.f468371e), false);
            eVar.d(jSONObject, "text_value", this.f468372f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
