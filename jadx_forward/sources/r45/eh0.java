package r45;

/* loaded from: classes4.dex */
public class eh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f455003d;

    /* renamed from: e, reason: collision with root package name */
    public int f455004e;

    /* renamed from: f, reason: collision with root package name */
    public int f455005f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f455006g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f455007h;

    /* renamed from: i, reason: collision with root package name */
    public int f455008i;

    /* renamed from: m, reason: collision with root package name */
    public int f455009m;

    /* renamed from: n, reason: collision with root package name */
    public int f455010n;

    /* renamed from: o, reason: collision with root package name */
    public int f455011o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eh0)) {
            return false;
        }
        r45.eh0 eh0Var = (r45.eh0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f455003d), java.lang.Boolean.valueOf(eh0Var.f455003d)) && n51.f.a(java.lang.Integer.valueOf(this.f455004e), java.lang.Integer.valueOf(eh0Var.f455004e)) && n51.f.a(java.lang.Integer.valueOf(this.f455005f), java.lang.Integer.valueOf(eh0Var.f455005f)) && n51.f.a(java.lang.Boolean.valueOf(this.f455006g), java.lang.Boolean.valueOf(eh0Var.f455006g)) && n51.f.a(java.lang.Boolean.valueOf(this.f455007h), java.lang.Boolean.valueOf(eh0Var.f455007h)) && n51.f.a(java.lang.Integer.valueOf(this.f455008i), java.lang.Integer.valueOf(eh0Var.f455008i)) && n51.f.a(java.lang.Integer.valueOf(this.f455009m), java.lang.Integer.valueOf(eh0Var.f455009m)) && n51.f.a(java.lang.Integer.valueOf(this.f455010n), java.lang.Integer.valueOf(eh0Var.f455010n)) && n51.f.a(java.lang.Integer.valueOf(this.f455011o), java.lang.Integer.valueOf(eh0Var.f455011o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f455003d);
            fVar.e(2, this.f455004e);
            fVar.e(3, this.f455005f);
            fVar.a(4, this.f455006g);
            fVar.a(5, this.f455007h);
            fVar.e(6, this.f455008i);
            fVar.e(7, this.f455009m);
            fVar.e(9, this.f455010n);
            fVar.e(10, this.f455011o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f455003d) + 0 + b36.f.e(2, this.f455004e) + b36.f.e(3, this.f455005f) + b36.f.a(4, this.f455006g) + b36.f.a(5, this.f455007h) + b36.f.e(6, this.f455008i) + b36.f.e(7, this.f455009m) + b36.f.e(9, this.f455010n) + b36.f.e(10, this.f455011o);
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
        r45.eh0 eh0Var = (r45.eh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eh0Var.f455003d = aVar2.c(intValue);
                return 0;
            case 2:
                eh0Var.f455004e = aVar2.g(intValue);
                return 0;
            case 3:
                eh0Var.f455005f = aVar2.g(intValue);
                return 0;
            case 4:
                eh0Var.f455006g = aVar2.c(intValue);
                return 0;
            case 5:
                eh0Var.f455007h = aVar2.c(intValue);
                return 0;
            case 6:
                eh0Var.f455008i = aVar2.g(intValue);
                return 0;
            case 7:
                eh0Var.f455009m = aVar2.g(intValue);
                return 0;
            case 8:
            default:
                return -1;
            case 9:
                eh0Var.f455010n = aVar2.g(intValue);
                return 0;
            case 10:
                eh0Var.f455011o = aVar2.g(intValue);
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f455003d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "RetrieveInvalidExposureCard", valueOf, false);
            eVar.d(jSONObject, "ValidExposureAreaRatio", java.lang.Integer.valueOf(this.f455004e), false);
            eVar.d(jSONObject, "ValidExposurePeriod", java.lang.Integer.valueOf(this.f455005f), false);
            eVar.d(jSONObject, "RedDotSample", java.lang.Boolean.valueOf(this.f455006g), false);
            eVar.d(jSONObject, "RecMsgReportSample", java.lang.Boolean.valueOf(this.f455007h), false);
            eVar.d(jSONObject, "RecMsgReportMaxCount", java.lang.Integer.valueOf(this.f455008i), false);
            eVar.d(jSONObject, "RecommendReasonMode", java.lang.Integer.valueOf(this.f455009m), false);
            eVar.d(jSONObject, "KeepPosEndResortSwitch", java.lang.Integer.valueOf(this.f455010n), false);
            eVar.d(jSONObject, "SerialResortReqSwitch", java.lang.Integer.valueOf(this.f455011o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
