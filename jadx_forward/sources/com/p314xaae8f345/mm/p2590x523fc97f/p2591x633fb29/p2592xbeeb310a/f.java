package com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a;

/* loaded from: classes11.dex */
public class f extends com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a {

    /* renamed from: f, reason: collision with root package name */
    public xg3.q0 f273794f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f273795g = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f273796h = new com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.C20961xa8f40fca(this, com.p314xaae8f345.mm.app.a0.f134821d);

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.e f273797i;

    public f(boolean z17) {
        this.f273778a = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomCallbackFactory", "RoomOpLogCallbackFactory created, isWxRoom: %s", java.lang.Boolean.valueOf(z17));
    }

    @Override // com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomCallbackFactory", "cancel called, operate: %s", this.f273794f);
    }

    @Override // com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a
    public void b() {
        o65.b bVar = this.f273781d;
        if (bVar == null) {
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(this.f273794f);
        } else {
            this.f273797i = new com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.e(bVar, this.f273782e);
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).d(this.f273794f, this.f273797i, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomCallbackFactory", "request oplog with result %s", e21.a1.a(this.f273794f));
        }
    }

    @Override // com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a
    public void c(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomCallbackFactory", "requestWithProgress called, title: %s, message: %s, indeterminate: %s, cancelable: %s, operate: %s", str, str2, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), e21.a1.a(this.f273794f));
        this.f273782e = db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
        b();
    }

    public void d(xg3.q0 q0Var) {
        this.f273794f = q0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomCallbackFactory", "__setOperate: %s", q0Var);
    }
}
