package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class gh implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f285575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e31.j f285576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285578g;

    public gh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.util.Map map, e31.j jVar, java.lang.String str) {
        this.f285578g = c21908xb66fd105;
        this.f285575d = map;
        this.f285576e = jVar;
        this.f285577f = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.String str = this.f285577f;
        java.util.Map map = this.f285575d;
        e31.j jVar = this.f285576e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285578g;
        if (itemId == 3) {
            c21908xb66fd105.getClass();
            c21908xb66fd105.k1(map, jVar, str, true, jVar.f328613f, false);
        } else {
            if (itemId != 4) {
                return;
            }
            c21908xb66fd105.getClass();
            c21908xb66fd105.k1(map, jVar, str, false, jVar.f328613f, false);
        }
    }
}
