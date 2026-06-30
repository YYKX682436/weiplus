package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class p5 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f286763b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f286764c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f286765d;

    /* renamed from: e, reason: collision with root package name */
    public int f286766e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f286767f;

    @Override // ot0.h
    public ot0.h a() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p5();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (qVar.f430199i == 671088689) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgDownloader", "values: %s", map.toString());
            this.f286763b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(f(map, "state"), 0);
            this.f286764c = f(map, "appid");
            this.f286765d = f(map, "appname");
            this.f286766e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(f(map, "appsize"), 0);
            this.f286767f = f(map, "iconurl");
        }
    }

    public final java.lang.String f(java.util.Map map, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.downloaderapp." + str);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str2 == null ? "" : str2;
    }
}
