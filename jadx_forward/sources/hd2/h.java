package hd2;

/* loaded from: classes8.dex */
public final class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e f362010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f362011e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e, android.view.View view) {
        this.f362010d = c14133xabc4217e;
        this.f362011e = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.graphics.Bitmap b07;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e = this.f362010d;
        if (itemId == 20011) {
            android.view.View container = this.f362011e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(container, "$container");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e.f191567n;
            android.content.Context mo7438x76847179 = c14133xabc4217e.mo7438x76847179();
            if (mo7438x76847179 != null && (b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(container)) != null) {
                java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(mo7438x76847179, fj6, new hd2.q(mo7438x76847179, c14133xabc4217e));
            }
        }
        c14133xabc4217e.mo7391x63a3b28a();
    }
}
