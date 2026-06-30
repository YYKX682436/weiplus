package r45;

/* loaded from: classes11.dex */
public class bw3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452626d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452627e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452628f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452629g;

    /* renamed from: h, reason: collision with root package name */
    public long f452630h;

    /* renamed from: i, reason: collision with root package name */
    public long f452631i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bw3)) {
            return false;
        }
        r45.bw3 bw3Var = (r45.bw3) fVar;
        return n51.f.a(this.f452626d, bw3Var.f452626d) && n51.f.a(this.f452627e, bw3Var.f452627e) && n51.f.a(this.f452628f, bw3Var.f452628f) && n51.f.a(this.f452629g, bw3Var.f452629g) && n51.f.a(java.lang.Long.valueOf(this.f452630h), java.lang.Long.valueOf(bw3Var.f452630h)) && n51.f.a(java.lang.Long.valueOf(this.f452631i), java.lang.Long.valueOf(bw3Var.f452631i));
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
                        case -2129294769:
                            if (next.equals("startTime")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1483401020:
                            if (next.equals("patchFilePatch")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -1364966910:
                            if (next.equals("cdnUrl")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -892481550:
                            if (next.equals("status")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -684021848:
                            if (next.equals("finishDownloadTime")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1123007459:
                            if (next.equals("downLoadId")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f452626d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f452627e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f452628f = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f452629g = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 4) {
                        this.f452630h = jSONObject.optLong(next);
                    } else if (c17 == 5) {
                        this.f452631i = jSONObject.optLong(next);
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
            java.lang.String str = this.f452626d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452627e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452628f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f452629g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.h(5, this.f452630h);
            fVar.h(6, this.f452631i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f452626d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f452627e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f452628f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f452629g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.h(5, this.f452630h) + b36.f.h(6, this.f452631i);
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
        r45.bw3 bw3Var = (r45.bw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bw3Var.f452626d = aVar2.k(intValue);
                return 0;
            case 2:
                bw3Var.f452627e = aVar2.k(intValue);
                return 0;
            case 3:
                bw3Var.f452628f = aVar2.k(intValue);
                return 0;
            case 4:
                bw3Var.f452629g = aVar2.k(intValue);
                return 0;
            case 5:
                bw3Var.f452630h = aVar2.i(intValue);
                return 0;
            case 6:
                bw3Var.f452631i = aVar2.i(intValue);
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
            java.lang.String str = this.f452626d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "downLoadId", str, false);
            eVar.d(jSONObject, "cdnUrl", this.f452627e, false);
            eVar.d(jSONObject, "patchFilePatch", this.f452628f, false);
            eVar.d(jSONObject, "status", this.f452629g, false);
            eVar.d(jSONObject, "startTime", java.lang.Long.valueOf(this.f452630h), false);
            eVar.d(jSONObject, "finishDownloadTime", java.lang.Long.valueOf(this.f452631i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
