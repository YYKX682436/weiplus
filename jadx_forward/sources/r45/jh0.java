package r45;

/* loaded from: classes8.dex */
public class jh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459338d;

    /* renamed from: e, reason: collision with root package name */
    public int f459339e;

    /* renamed from: f, reason: collision with root package name */
    public int f459340f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f459341g;

    /* renamed from: h, reason: collision with root package name */
    public int f459342h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jh0)) {
            return false;
        }
        r45.jh0 jh0Var = (r45.jh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459338d), java.lang.Integer.valueOf(jh0Var.f459338d)) && n51.f.a(java.lang.Integer.valueOf(this.f459339e), java.lang.Integer.valueOf(jh0Var.f459339e)) && n51.f.a(java.lang.Integer.valueOf(this.f459340f), java.lang.Integer.valueOf(jh0Var.f459340f)) && n51.f.a(java.lang.Boolean.valueOf(this.f459341g), java.lang.Boolean.valueOf(jh0Var.f459341g)) && n51.f.a(java.lang.Integer.valueOf(this.f459342h), java.lang.Integer.valueOf(jh0Var.f459342h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459338d);
            fVar.e(2, this.f459339e);
            fVar.e(3, this.f459340f);
            fVar.a(4, this.f459341g);
            fVar.e(5, this.f459342h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f459338d) + 0 + b36.f.e(2, this.f459339e) + b36.f.e(3, this.f459340f) + b36.f.a(4, this.f459341g) + b36.f.e(5, this.f459342h);
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
        r45.jh0 jh0Var = (r45.jh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jh0Var.f459338d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            jh0Var.f459339e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            jh0Var.f459340f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            jh0Var.f459341g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        jh0Var.f459342h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f459338d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "switch_option", valueOf, false);
            eVar.d(jSONObject, "refresh_freq", java.lang.Integer.valueOf(this.f459339e), false);
            eVar.d(jSONObject, "timing_of_preload", java.lang.Integer.valueOf(this.f459340f), false);
            eVar.d(jSONObject, "show_replace_button", java.lang.Boolean.valueOf(this.f459341g), false);
            eVar.d(jSONObject, "time_gap_of_loading_first", java.lang.Integer.valueOf(this.f459342h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
