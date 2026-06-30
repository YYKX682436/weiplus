package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes.dex */
public class p0 extends ut3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f225991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b f225992e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b activityC16239xc81f635b, int i17) {
        this.f225992e = activityC16239xc81f635b;
        this.f225991d = i17;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        boolean z17;
        int i17;
        java.lang.String str = c16991x15ced046.f237195f;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.f225852d;
        this.f225992e.getClass();
        if (c16991x15ced046.a() != null) {
            i17 = ((java.lang.Integer) c16991x15ced046.a().b("KEY_MEDIA_SOURCE_INT", -1)).intValue();
            z17 = (i17 == 1 || i17 == 2) ? false : true;
        } else {
            z17 = true;
            i17 = 0;
        }
        int i19 = z17 ? 21 : 20;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "isSearchState = %b, source = %d, isFromAlbum = %b, model.getReportInfo() = %s, type = %d, path = %s.", java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17), c16991x15ced046.a(), java.lang.Integer.valueOf(i17), str);
        java.util.HashMap hashMap = m93.j.f406599z;
        int i27 = this.f225991d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) hashMap.get(java.lang.Integer.valueOf(i27));
        if (pVar != null) {
            pVar.i(str, i19);
            hashMap.remove(java.lang.Integer.valueOf(i27));
        }
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
