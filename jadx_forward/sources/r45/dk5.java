package r45;

/* loaded from: classes2.dex */
public class dk5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454071d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454072e;

    /* renamed from: f, reason: collision with root package name */
    public int f454073f;

    /* renamed from: g, reason: collision with root package name */
    public int f454074g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454075h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dk5)) {
            return false;
        }
        r45.dk5 dk5Var = (r45.dk5) fVar;
        return n51.f.a(this.f454071d, dk5Var.f454071d) && n51.f.a(this.f454072e, dk5Var.f454072e) && n51.f.a(java.lang.Integer.valueOf(this.f454073f), java.lang.Integer.valueOf(dk5Var.f454073f)) && n51.f.a(java.lang.Integer.valueOf(this.f454074g), java.lang.Integer.valueOf(dk5Var.f454074g)) && n51.f.a(this.f454075h, dk5Var.f454075h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454071d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454072e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f454073f);
            fVar.e(4, this.f454074g);
            java.lang.String str3 = this.f454075h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f454071d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f454072e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f454073f) + b36.f.e(4, this.f454074g);
            java.lang.String str6 = this.f454075h;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        r45.dk5 dk5Var = (r45.dk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dk5Var.f454071d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            dk5Var.f454072e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            dk5Var.f454073f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            dk5Var.f454074g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        dk5Var.f454075h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f454071d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Summary", str, false);
            eVar.d(jSONObject, "RedPointMsgId", this.f454072e, false);
            eVar.d(jSONObject, "RedPointInvalidTime", java.lang.Integer.valueOf(this.f454073f), false);
            eVar.d(jSONObject, "NoCache", java.lang.Integer.valueOf(this.f454074g), false);
            eVar.d(jSONObject, "CallBackStr", this.f454075h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
