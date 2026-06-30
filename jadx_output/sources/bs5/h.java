package bs5;

/* loaded from: classes13.dex */
public abstract class h implements tr5.r {

    /* renamed from: a, reason: collision with root package name */
    public final bs5.o f24040a = new bs5.o(this);

    @Override // tr5.r
    public tr5.g0 b(tr5.f0 f0Var) {
        bs5.g gVar = new bs5.g();
        gVar.f24035r = f0Var.f421487m;
        gVar.f24037t = f0Var.f421486l;
        gVar.f24038u = f0Var.f421488n;
        gVar.f266350g = java.lang.System.currentTimeMillis();
        d(f0Var, gVar);
        gVar.h();
        return new tr5.g0(gVar.f266347d, gVar);
    }

    public boolean d(tr5.f0 f0Var, bs5.g gVar) {
        java.lang.String[] strArr;
        if (f0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupParams".concat(" can not be empty"));
        }
        if (gVar == null) {
            throw new java.lang.IllegalArgumentException("stat".concat(" can not be null"));
        }
        if (f0Var.f421486l) {
            return false;
        }
        java.lang.String str = f0Var.f421476b;
        java.lang.String[] split = str.split(",");
        java.lang.String[] strArr2 = tr5.c.f421455a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = split.length;
        int i17 = 1;
        int i18 = 0;
        boolean z17 = true;
        while (i18 < length) {
            java.lang.String str2 = split[i18];
            tr5.g0 b17 = this.f24040a.b(str2);
            if (b17 != null) {
                java.lang.String[] strArr3 = b17.f421492d.f421511f;
                if (!sr5.a.c(strArr3)) {
                    if (split.length > i17) {
                        int length2 = strArr3.length;
                        int i19 = 0;
                        while (true) {
                            strArr = split;
                            if (i19 >= length2) {
                                break;
                            }
                            arrayList.add(str2 + ":" + strArr3[i19]);
                            i19++;
                            split = strArr;
                            strArr3 = strArr3;
                            strArr2 = strArr2;
                        }
                    } else {
                        strArr = split;
                        strArr2 = strArr3;
                    }
                    bs5.g gVar2 = (bs5.g) b17.f421493e;
                    if (kr5.p.f311571b.f311560o && gVar2.f24034q < java.lang.System.currentTimeMillis() && gVar2.f24033p < java.lang.System.currentTimeMillis()) {
                        sb6.append(str2);
                        sb6.append(',');
                    }
                    i18++;
                    split = strArr;
                    i17 = 1;
                }
            }
            strArr = split;
            sb6.append(str2);
            sb6.append(',');
            strArr2 = strArr2;
            z17 = false;
            i18++;
            split = strArr;
            i17 = 1;
        }
        java.lang.String[] strArr4 = strArr2;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(sb6.length() > 0 ? sb6.substring(0, sb6.length() - 1) : "");
        java.lang.String[] strArr5 = arrayList.size() > 0 ? (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]) : strArr4;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("requestHostname", sb7);
        hashMap.put("ips", strArr5);
        hashMap.put("cached", java.lang.Boolean.valueOf(z17));
        java.lang.String[] strArr6 = (java.lang.String[]) hashMap.get("ips");
        java.lang.StringBuilder sb8 = (java.lang.StringBuilder) hashMap.get("requestHostname");
        boolean booleanValue = ((java.lang.Boolean) hashMap.get("cached")).booleanValue();
        gVar.f266347d = strArr6;
        if (kr5.p.f311571b.f311560o) {
            f0Var.f421489o = sb8.toString();
        } else if (sb8.length() > 0) {
            f0Var.f421489o = sb8.toString();
        }
        if (!booleanValue) {
            if (strArr6.length > 0) {
                gVar.f24028h = true;
            }
            return false;
        }
        gVar.f24036s = true;
        gVar.f24029i = 0;
        or5.b.a("Lookup for %s, cache hit", str);
        return true;
    }
}
