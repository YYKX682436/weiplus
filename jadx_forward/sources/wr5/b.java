package wr5;

/* loaded from: classes13.dex */
public final class b implements tr5.r {

    /* renamed from: a, reason: collision with root package name */
    public final tr5.g f530478a = new tr5.g("Local", 3);

    @Override // tr5.r
    public tr5.p a(tr5.a0 a0Var) {
        return null;
    }

    @Override // tr5.r
    public tr5.g0 b(tr5.f0 f0Var) {
        wr5.a aVar = new wr5.a();
        aVar.f347883g = java.lang.System.currentTimeMillis();
        aVar.h();
        return new tr5.g0(aVar.f347880d, aVar);
    }

    @Override // tr5.r
    public tr5.g0 c(tr5.f0 f0Var) {
        java.lang.String[] strArr;
        if (f0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupParams".concat(" can not be null"));
        }
        wr5.a aVar = new wr5.a();
        aVar.f347883g = java.lang.System.currentTimeMillis();
        java.lang.String str = f0Var.f503022o;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        java.lang.String[] strArr2 = tr5.c.f502988a;
        java.lang.String[] split = str.split(",");
        if (split.length > 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : split) {
                try {
                    java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(str2);
                    java.lang.String[] strArr3 = new java.lang.String[allByName.length];
                    for (java.net.InetAddress inetAddress : allByName) {
                        arrayList.add(str2 + ":" + inetAddress.getHostAddress());
                    }
                } catch (java.net.UnknownHostException e17) {
                    or5.b.c(3, e17, "LocalDns lookup %s failed", str2);
                }
            }
            strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
            if (3 >= or5.b.f429236a) {
                or5.b.a("LocalDns lookup for %s result: %s", str, java.util.Arrays.toString(strArr));
            }
        } else {
            try {
                java.net.InetAddress[] allByName2 = java.net.InetAddress.getAllByName(str);
                strArr2 = new java.lang.String[allByName2.length];
                for (int i17 = 0; i17 < allByName2.length; i17++) {
                    strArr2[i17] = allByName2[i17].getHostAddress();
                }
                if (3 >= or5.b.f429236a) {
                    or5.b.a("LocalDns lookup for %s result: %s", str, java.util.Arrays.toString(strArr2));
                }
            } catch (java.net.UnknownHostException e18) {
                or5.b.c(3, e18, "LocalDns lookup %s failed", str);
            }
            strArr = strArr2;
        }
        aVar.h();
        aVar.f347880d = strArr;
        return new tr5.g0(sr5.a.d(strArr, f0Var), aVar);
    }

    @Override // tr5.r
    /* renamed from: getDescription */
    public tr5.g mo11135x730bcac6() {
        return this.f530478a;
    }
}
