package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class h0 extends ut3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f265958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 f265959e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74, java.util.HashMap hashMap) {
        this.f265959e = abstractActivityC19367xd1ae8c74;
        this.f265958d = hashMap;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        boolean z17;
        int i17;
        java.lang.String str = c16991x15ced046.f237195f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74 = this.f265959e;
        boolean X9 = abstractActivityC19367xd1ae8c74.X9();
        if (c16991x15ced046.a() != null) {
            i17 = ((java.lang.Integer) c16991x15ced046.a().b("KEY_MEDIA_SOURCE_INT", -1)).intValue();
            z17 = (i17 == 1 || i17 == 2) ? false : true;
        } else {
            z17 = true;
            i17 = 0;
        }
        int i18 = X9 ? z17 ? 21 : 20 : z17 ? 19 : 18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "isSearchState = %b, source = %d, isFromAlbum = %b, model.getReportInfo() = %s, type = %d, path = %s.", java.lang.Boolean.valueOf(X9), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), c16991x15ced046.a(), java.lang.Integer.valueOf(i17), str);
        abstractActivityC19367xd1ae8c74.ca(str, i18, this.f265958d);
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            if (z17) {
                activity.overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559389de);
            } else {
                activity.overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559312b8);
            }
        }
    }
}
