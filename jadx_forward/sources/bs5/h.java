package bs5;

/* loaded from: classes13.dex */
public abstract class h implements tr5.r {

    /* renamed from: a, reason: collision with root package name */
    public final bs5.o f105573a = new bs5.o(this);

    @Override // tr5.r
    public tr5.g0 b(tr5.f0 f0Var) {
        bs5.g gVar = new bs5.g();
        gVar.f105568r = f0Var.f503020m;
        gVar.f105570t = f0Var.f503019l;
        gVar.f105571u = f0Var.f503021n;
        gVar.f347883g = java.lang.System.currentTimeMillis();
        d(f0Var, gVar);
        gVar.h();
        return new tr5.g0(gVar.f347880d, gVar);
    }

    public boolean d(tr5.f0 f0Var, bs5.g gVar) {
        java.lang.String[] strArr;
        if (f0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupParams".concat(" can not be empty"));
        }
        if (gVar == null) {
            throw new java.lang.IllegalArgumentException("stat".concat(" can not be null"));
        }
        if (f0Var.f503019l) {
            return false;
        }
        java.lang.String str = f0Var.f503009b;
        java.lang.String[] split = str.split(",");
        java.lang.String[] strArr2 = tr5.c.f502988a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = split.length;
        int i17 = 1;
        int i18 = 0;
        boolean z17 = true;
        while (i18 < length) {
            java.lang.String str2 = split[i18];
            tr5.g0 b17 = this.f105573a.b(str2);
            if (b17 != null) {
                java.lang.String[] strArr3 = b17.f503025d.f503044f;
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
                    bs5.g gVar2 = (bs5.g) b17.f503026e;
                    if (kr5.p.f393104b.f393093o && gVar2.f105567q < java.lang.System.currentTimeMillis() && gVar2.f105566p < java.lang.System.currentTimeMillis()) {
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
        gVar.f347880d = strArr6;
        if (kr5.p.f393104b.f393093o) {
            f0Var.f503022o = sb8.toString();
        } else if (sb8.length() > 0) {
            f0Var.f503022o = sb8.toString();
        }
        if (!booleanValue) {
            if (strArr6.length > 0) {
                gVar.f105561h = true;
            }
            return false;
        }
        gVar.f105569s = true;
        gVar.f105562i = 0;
        or5.b.a("Lookup for %s, cache hit", str);
        return true;
    }
}
