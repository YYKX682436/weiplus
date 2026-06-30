package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class h extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198652d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f198653e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f198654f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198652d = "Finder.FinderGameLiveAuthPostLiveUIC";
        this.f198653e = "";
        this.f198654f = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("KEY_POST_LIVE_APPID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f198653e = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("KEY_POST_LIVE_JSON");
        this.f198654f = stringExtra2 != null ? stringExtra2 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198652d, "appid:" + this.f198653e + ", json:" + this.f198654f);
    }
}
