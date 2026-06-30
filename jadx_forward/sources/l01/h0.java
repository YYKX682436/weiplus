package l01;

/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f396305a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f396306b;

    public h0(java.lang.String str, l01.c cVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f396305a = str;
        this.f396306b = l01.b.j(str);
    }

    public static java.io.InputStream a(l01.h0 h0Var, java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openRead, imageURL: ");
        java.lang.String str = h0Var.f396305a;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandSimpleImageLoader", sb6.toString());
        if (h0Var.b()) {
            try {
                return com.p314xaae8f345.mm.vfs.w6.E(str);
            } catch (java.io.FileNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.AppBrandSimpleImageLoader", e17, "load from local file %s", str);
                throw e17;
            }
        }
        boolean mo48894x44a66de6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48894x44a66de6();
        if (!mo48894x44a66de6) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48893xf78c0707(new l01.f0(h0Var));
        }
        java.net.HttpURLConnection httpURLConnection = mo48894x44a66de6 ? (java.net.HttpURLConnection) rc.b.f475439a.f475440a.mo153159x946eacc8(new java.net.URL(str)) : (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setInstanceFollowRedirects(true);
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandSimpleImageLoader", "setHeaders, header: %s: %s", entry.getKey(), entry.getValue());
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        l01.g0 g0Var = new l01.g0(httpURLConnection.getInputStream(), new ik1.b0(httpURLConnection));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandSimpleImageLoader", "openRead, imageURL: %s, connected", str);
        return g0Var;
    }

    public boolean b() {
        java.lang.String str = this.f396305a;
        return str.startsWith("file://") || str.startsWith("wcf://");
    }

    /* renamed from: toString */
    public java.lang.String m144788x9616526c() {
        return this.f396305a;
    }
}
