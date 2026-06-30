package r45;

/* loaded from: classes4.dex */
public class d2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f453531d;

    /* renamed from: e, reason: collision with root package name */
    public long f453532e;

    /* renamed from: f, reason: collision with root package name */
    public float f453533f;

    /* renamed from: g, reason: collision with root package name */
    public long f453534g;

    /* renamed from: h, reason: collision with root package name */
    public long f453535h;

    /* renamed from: i, reason: collision with root package name */
    public r45.j2 f453536i;

    /* renamed from: m, reason: collision with root package name */
    public long f453537m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d2)) {
            return false;
        }
        r45.d2 d2Var = (r45.d2) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f453531d), java.lang.Long.valueOf(d2Var.f453531d)) && n51.f.a(java.lang.Long.valueOf(this.f453532e), java.lang.Long.valueOf(d2Var.f453532e)) && n51.f.a(java.lang.Float.valueOf(this.f453533f), java.lang.Float.valueOf(d2Var.f453533f)) && n51.f.a(java.lang.Long.valueOf(this.f453534g), java.lang.Long.valueOf(d2Var.f453534g)) && n51.f.a(java.lang.Long.valueOf(this.f453535h), java.lang.Long.valueOf(d2Var.f453535h)) && n51.f.a(this.f453536i, d2Var.f453536i) && n51.f.a(java.lang.Long.valueOf(this.f453537m), java.lang.Long.valueOf(d2Var.f453537m));
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
                        case -1607243192:
                            if (next.equals("endTime")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1072839914:
                            if (next.equals("beginTime")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 3560248:
                            if (next.equals("tips")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 91555442:
                            if (next.equals("maxDisplayDuration")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 420524750:
                            if (next.equals("maasEventType")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1112015495:
                            if (next.equals("maxDisplayTimesPerDay")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1405936373:
                            if (next.equals("minDisplayInterval")) {
                                c17 = 4;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f453531d = jSONObject.optLong(next);
                            break;
                        case 1:
                            this.f453532e = jSONObject.optLong(next);
                            break;
                        case 2:
                            this.f453533f = (float) jSONObject.optDouble(next);
                            break;
                        case 3:
                            this.f453534g = jSONObject.optLong(next);
                            break;
                        case 4:
                            this.f453535h = jSONObject.optLong(next);
                            break;
                        case 5:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.j2 j2Var = new r45.j2();
                                j2Var.mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                this.f453536i = j2Var;
                                break;
                            }
                        case 6:
                            this.f453537m = jSONObject.optLong(next);
                            break;
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
            fVar.h(1, this.f453531d);
            fVar.h(2, this.f453532e);
            fVar.d(3, this.f453533f);
            fVar.h(4, this.f453534g);
            fVar.h(5, this.f453535h);
            r45.j2 j2Var = this.f453536i;
            if (j2Var != null) {
                fVar.i(6, j2Var.mo75928xcd1e8d8());
                this.f453536i.mo75956x3d5d1f78(fVar);
            }
            fVar.h(7, this.f453537m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f453531d) + 0 + b36.f.h(2, this.f453532e) + b36.f.d(3, this.f453533f) + b36.f.h(4, this.f453534g) + b36.f.h(5, this.f453535h);
            r45.j2 j2Var2 = this.f453536i;
            if (j2Var2 != null) {
                h17 += b36.f.i(6, j2Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.h(7, this.f453537m);
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
        r45.d2 d2Var = (r45.d2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d2Var.f453531d = aVar2.i(intValue);
                return 0;
            case 2:
                d2Var.f453532e = aVar2.i(intValue);
                return 0;
            case 3:
                d2Var.f453533f = aVar2.f(intValue);
                return 0;
            case 4:
                d2Var.f453534g = aVar2.i(intValue);
                return 0;
            case 5:
                d2Var.f453535h = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.j2 j2Var3 = new r45.j2();
                    if (bArr != null && bArr.length > 0) {
                        j2Var3.mo11468x92b714fd(bArr);
                    }
                    d2Var.f453536i = j2Var3;
                }
                return 0;
            case 7:
                d2Var.f453537m = aVar2.i(intValue);
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
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f453531d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "beginTime", valueOf, false);
            eVar.d(jSONObject, "endTime", java.lang.Long.valueOf(this.f453532e), false);
            eVar.d(jSONObject, "maxDisplayDuration", java.lang.Float.valueOf(this.f453533f), false);
            eVar.d(jSONObject, "maxDisplayTimesPerDay", java.lang.Long.valueOf(this.f453534g), false);
            eVar.d(jSONObject, "minDisplayInterval", java.lang.Long.valueOf(this.f453535h), false);
            eVar.d(jSONObject, "tips", this.f453536i, false);
            eVar.d(jSONObject, "maasEventType", java.lang.Long.valueOf(this.f453537m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
