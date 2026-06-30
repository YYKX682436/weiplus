package r45;

/* loaded from: classes2.dex */
public class fp2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456036d;

    /* renamed from: e, reason: collision with root package name */
    public int f456037e;

    /* renamed from: f, reason: collision with root package name */
    public int f456038f;

    /* renamed from: g, reason: collision with root package name */
    public int f456039g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fp2)) {
            return false;
        }
        r45.fp2 fp2Var = (r45.fp2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456036d), java.lang.Integer.valueOf(fp2Var.f456036d)) && n51.f.a(java.lang.Integer.valueOf(this.f456037e), java.lang.Integer.valueOf(fp2Var.f456037e)) && n51.f.a(java.lang.Integer.valueOf(this.f456038f), java.lang.Integer.valueOf(fp2Var.f456038f)) && n51.f.a(java.lang.Integer.valueOf(this.f456039g), java.lang.Integer.valueOf(fp2Var.f456039g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    switch (next.hashCode()) {
                        case -683514325:
                            if (next.equals("quick_swipe_down_interval")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 203503683:
                            if (next.equals("quick_swipe_down_cnt")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 585453120:
                            if (next.equals("before_finwatch_interval")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1558718385:
                            if (next.equals("swipe_down_cnt")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f456036d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        this.f456037e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        this.f456038f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f456039g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456036d);
            fVar.e(2, this.f456037e);
            fVar.e(3, this.f456038f);
            fVar.e(4, this.f456039g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f456036d) + 0 + b36.f.e(2, this.f456037e) + b36.f.e(3, this.f456038f) + b36.f.e(4, this.f456039g);
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
        r45.fp2 fp2Var = (r45.fp2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fp2Var.f456036d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fp2Var.f456037e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            fp2Var.f456038f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        fp2Var.f456039g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f456036d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "swipe_down_cnt", valueOf, true);
            eVar.d(jSONObject, "quick_swipe_down_cnt", java.lang.Integer.valueOf(this.f456037e), true);
            eVar.d(jSONObject, "quick_swipe_down_interval", java.lang.Integer.valueOf(this.f456038f), true);
            eVar.d(jSONObject, "before_finwatch_interval", java.lang.Integer.valueOf(this.f456039g), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
