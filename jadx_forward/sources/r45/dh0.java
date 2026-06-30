package r45;

/* loaded from: classes4.dex */
public class dh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453996d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f453997e;

    /* renamed from: f, reason: collision with root package name */
    public int f453998f;

    /* renamed from: g, reason: collision with root package name */
    public int f453999g;

    /* renamed from: h, reason: collision with root package name */
    public int f454000h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454001i;

    /* renamed from: m, reason: collision with root package name */
    public int f454002m = 180;

    /* renamed from: n, reason: collision with root package name */
    public long f454003n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dh0)) {
            return false;
        }
        r45.dh0 dh0Var = (r45.dh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453996d), java.lang.Integer.valueOf(dh0Var.f453996d)) && n51.f.a(java.lang.Boolean.valueOf(this.f453997e), java.lang.Boolean.valueOf(dh0Var.f453997e)) && n51.f.a(java.lang.Integer.valueOf(this.f453998f), java.lang.Integer.valueOf(dh0Var.f453998f)) && n51.f.a(java.lang.Integer.valueOf(this.f453999g), java.lang.Integer.valueOf(dh0Var.f453999g)) && n51.f.a(java.lang.Integer.valueOf(this.f454000h), java.lang.Integer.valueOf(dh0Var.f454000h)) && n51.f.a(this.f454001i, dh0Var.f454001i) && n51.f.a(java.lang.Integer.valueOf(this.f454002m), java.lang.Integer.valueOf(dh0Var.f454002m)) && n51.f.a(java.lang.Long.valueOf(this.f454003n), java.lang.Long.valueOf(dh0Var.f454003n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453996d);
            fVar.a(2, this.f453997e);
            fVar.e(3, this.f453998f);
            fVar.e(4, this.f453999g);
            fVar.e(5, this.f454000h);
            java.lang.String str = this.f454001i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f454002m);
            fVar.h(8, this.f454003n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453996d) + 0 + b36.f.a(2, this.f453997e) + b36.f.e(3, this.f453998f) + b36.f.e(4, this.f453999g) + b36.f.e(5, this.f454000h);
            java.lang.String str2 = this.f454001i;
            if (str2 != null) {
                e17 += b36.f.j(6, str2);
            }
            return e17 + b36.f.e(7, this.f454002m) + b36.f.h(8, this.f454003n);
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
        r45.dh0 dh0Var = (r45.dh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dh0Var.f453996d = aVar2.g(intValue);
                return 0;
            case 2:
                dh0Var.f453997e = aVar2.c(intValue);
                return 0;
            case 3:
                dh0Var.f453998f = aVar2.g(intValue);
                return 0;
            case 4:
                dh0Var.f453999g = aVar2.g(intValue);
                return 0;
            case 5:
                dh0Var.f454000h = aVar2.g(intValue);
                return 0;
            case 6:
                dh0Var.f454001i = aVar2.k(intValue);
                return 0;
            case 7:
                dh0Var.f454002m = aVar2.g(intValue);
                return 0;
            case 8:
                dh0Var.f454003n = aVar2.i(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f453996d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "control_flag", valueOf, false);
            eVar.d(jSONObject, "is_control_group", java.lang.Boolean.valueOf(this.f453997e), false);
            eVar.d(jSONObject, "control_group_flag", java.lang.Integer.valueOf(this.f453998f), false);
            eVar.d(jSONObject, "show_card_flag", java.lang.Integer.valueOf(this.f453999g), false);
            eVar.d(jSONObject, "lift_read_area_size", java.lang.Integer.valueOf(this.f454000h), false);
            eVar.d(jSONObject, "history_box_wording", this.f454001i, false);
            eVar.d(jSONObject, "outbox_keep_pos_time", java.lang.Integer.valueOf(this.f454002m), false);
            eVar.d(jSONObject, "resort_scene_bit_switch", java.lang.Long.valueOf(this.f454003n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
