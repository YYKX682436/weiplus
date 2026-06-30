package com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a;

/* loaded from: classes11.dex */
public class c extends com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f273784f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f273785g = new com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.b(this);

    public c(boolean z17) {
        this.f273778a = z17;
    }

    @Override // com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a
    public void a() {
        if (this.f273784f == null) {
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.d(this.f273784f);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(this.f273784f.mo808xfb85f7b0(), this.f273785g);
    }

    @Override // com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a
    public void b() {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f273784f;
        if (m1Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomCallbackFactory", "request scene %s", m1Var);
        if (this.f273782e != null || this.f273779b != null || this.f273780c != null || this.f273781d != null) {
            gm0.j1.i();
            gm0.j1.n().f354821b.a(this.f273784f.mo808xfb85f7b0(), this.f273785g);
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.g(this.f273784f);
    }

    @Override // com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a
    public void c(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (this.f273784f == null) {
            return;
        }
        this.f273782e = db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
        b();
    }
}
