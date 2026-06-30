package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes13.dex */
public class zc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn.c f281900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f281901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd f281902f;

    public zc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd bdVar, rn.c cVar, int i17) {
        this.f281902f = bdVar;
        this.f281900d = cVar;
        this.f281901e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        rn.c cVar = this.f281900d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd bdVar = this.f281902f;
        if (itemId == 1) {
            android.app.Activity g17 = bdVar.f280265a.f280113d.g();
            java.lang.String x17 = bdVar.f280265a.f280113d.x();
            java.lang.String str = cVar.f66264x1210aac6;
            java.lang.String str2 = cVar.f66266xdec927b;
            boolean v07 = cVar.v0();
            kn.j0.h(g17, x17, str, str2, false, 1, v07 ? 1 : 0, 0, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yc(this));
            return;
        }
        if (itemId != 2) {
            return;
        }
        boolean i18 = kn.j0.i(cVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "handleTodoLongClickImp delete(%s) result:%s", cVar.f66264x1210aac6, java.lang.Boolean.valueOf(i18));
        if (i18) {
            bdVar.f280265a.n0(cVar);
            bdVar.f280265a.f281301m.m8155x27702c4(this.f281901e);
            bdVar.f280265a.p0();
        }
        java.lang.String x18 = bdVar.f280265a.f280113d.x();
        boolean v08 = cVar.v0();
        kn.k0.b(x18, v08 ? 1 : 0, 2, 2, cVar.f66264x1210aac6, cVar.f66266xdec927b);
    }
}
