package com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a;

/* loaded from: classes11.dex */
public class h extends com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a implements gd0.f {

    /* renamed from: f, reason: collision with root package name */
    public e21.k f273799f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f273800g = new com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.g(this);

    public h(boolean z17) {
        this.f273778a = z17;
    }

    @Override // com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a
    public void a() {
        if (this.f273799f == null) {
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.d(this.f273799f);
        gm0.j1.i();
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        this.f273799f.getClass();
        r1Var.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x.f34658x366c91de, this.f273800g);
    }

    @Override // com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a
    public void b() {
        e21.k kVar = this.f273799f;
        if (kVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomCallbackFactory", "request scene %s", kVar);
        if (this.f273782e != null || this.f273779b != null || this.f273780c != null || this.f273781d != null) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
            this.f273799f.getClass();
            r1Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x.f34658x366c91de, this.f273800g);
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.g(this.f273799f);
    }

    @Override // com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a
    public void c(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (this.f273799f == null) {
            return;
        }
        this.f273782e = db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
        b();
    }
}
