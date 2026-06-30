package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f263530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263532g;

    public v2(java.lang.String str, int i17, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var) {
        this.f263529d = str;
        this.f263530e = i17;
        this.f263531f = str2;
        this.f263532g = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.f263529d;
        objArr[1] = java.lang.Integer.valueOf(this.f263530e);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        objArr[2] = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context) ? "wifi" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(context) ? "5g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context) ? "4g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context) ? "3g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context) ? "2g" : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
        java.lang.String str2 = this.f263531f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(str2);
            if (allByName != null && allByName.length > 0) {
                for (java.net.InetAddress inetAddress : allByName) {
                    sb6.append(inetAddress.getHostAddress());
                    sb6.append(";");
                }
            }
            str = sb6.toString();
        } catch (java.net.UnknownHostException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f263532g.o1(), e17, "dnsIps", new java.lang.Object[0]);
            str = null;
        }
        objArr[3] = str;
        g0Var.d(17082, objArr);
    }
}
