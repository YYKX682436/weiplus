package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class xh implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yh f281767f;

    public xh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yh yhVar, java.util.LinkedList linkedList, java.lang.String str) {
        this.f281767f = yhVar;
        this.f281765d = linkedList;
        this.f281766e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yh yhVar = this.f281767f;
        if (itemId == 0) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) yhVar.f280113d.f542241c.a(sb5.n.class))).n0(-1L, this.f281765d, 1, 0);
        } else {
            if (itemId != 1) {
                return;
            }
            com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a c17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(yhVar.f280113d.u().d1()).c(this.f281766e, yhVar.f280113d.u().d1());
            c17.c(yhVar.f280113d.g(), yhVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), yhVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4j), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wh(this, c17));
        }
    }
}
