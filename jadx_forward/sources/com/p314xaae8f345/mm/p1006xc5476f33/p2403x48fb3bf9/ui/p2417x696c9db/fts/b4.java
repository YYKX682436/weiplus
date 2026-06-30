package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class b4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.a4 f265888b = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.a4(this, null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e f265889c;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.p3 p3Var) {
        this.f265889c = activityC19391xc941d0e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 b() {
        return this.f265888b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.p3210x3857dc.y0 f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var) {
        java.io.InputStream inputStream;
        if (x0Var == null || x0Var.mo120512xb5887639() == null || !x0Var.mo120512xb5887639().toString().startsWith("weixin://fts")) {
            return null;
        }
        java.lang.String uri = x0Var.mo120512xb5887639().toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "url=%s | thread=%d", uri, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        try {
            inputStream = com.p314xaae8f345.mm.vfs.w6.E(android.net.Uri.parse(uri).getQueryParameter(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714));
        } catch (java.lang.Exception unused) {
            inputStream = null;
        }
        if (inputStream != null) {
            return new com.p314xaae8f345.p3210x3857dc.y0("image/*", "utf8", inputStream);
        }
        return null;
    }
}
