package pj4;

/* loaded from: classes4.dex */
public class s0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f436812d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436813e;

    /* renamed from: f, reason: collision with root package name */
    public long f436814f;

    /* renamed from: g, reason: collision with root package name */
    public int f436815g;

    /* renamed from: h, reason: collision with root package name */
    public int f436816h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f436817i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f436818m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.s0)) {
            return false;
        }
        pj4.s0 s0Var = (pj4.s0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f436812d), java.lang.Long.valueOf(s0Var.f436812d)) && n51.f.a(this.f436813e, s0Var.f436813e) && n51.f.a(java.lang.Long.valueOf(this.f436814f), java.lang.Long.valueOf(s0Var.f436814f)) && n51.f.a(java.lang.Integer.valueOf(this.f436815g), java.lang.Integer.valueOf(s0Var.f436815g)) && n51.f.a(java.lang.Integer.valueOf(this.f436816h), java.lang.Integer.valueOf(s0Var.f436816h)) && n51.f.a(this.f436817i, s0Var.f436817i) && n51.f.a(this.f436818m, s0Var.f436818m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436818m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f436812d);
            java.lang.String str = this.f436813e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f436814f);
            fVar.e(4, this.f436815g);
            fVar.e(5, this.f436816h);
            java.lang.String str2 = this.f436817i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f436812d) + 0;
            java.lang.String str3 = this.f436813e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            int h18 = h17 + b36.f.h(3, this.f436814f) + b36.f.e(4, this.f436815g) + b36.f.e(5, this.f436816h);
            java.lang.String str4 = this.f436817i;
            if (str4 != null) {
                h18 += b36.f.j(6, str4);
            }
            return h18 + b36.f.g(7, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        pj4.s0 s0Var = (pj4.s0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s0Var.f436812d = aVar2.i(intValue);
                return 0;
            case 2:
                s0Var.f436813e = aVar2.k(intValue);
                return 0;
            case 3:
                s0Var.f436814f = aVar2.i(intValue);
                return 0;
            case 4:
                s0Var.f436815g = aVar2.g(intValue);
                return 0;
            case 5:
                s0Var.f436816h = aVar2.g(intValue);
                return 0;
            case 6:
                s0Var.f436817i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    pj4.t0 t0Var = new pj4.t0();
                    if (bArr2 != null && bArr2.length > 0) {
                        t0Var.mo11468x92b714fd(bArr2);
                    }
                    s0Var.f436818m.add(t0Var);
                }
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
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f436812d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "uid", valueOf, false);
            eVar.d(jSONObject, "sub_id", this.f436813e, false);
            eVar.d(jSONObject, "version", java.lang.Long.valueOf(this.f436814f), false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f436815g), false);
            eVar.d(jSONObject, "update_time", java.lang.Integer.valueOf(this.f436816h), false);
            eVar.d(jSONObject, "description", this.f436817i, false);
            eVar.d(jSONObject, "templates", this.f436818m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
