package fo5;

/* loaded from: classes14.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346587d;

    public p(fo5.r0 r0Var) {
        this.f346587d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "current ensure ring state: " + this.f346587d.f346635u);
        fo5.r0 r0Var = this.f346587d;
        if (r0Var.f346620f == er4.l.MAIN_UI_INVITED) {
            if (r0Var.c().b() == er4.d.EARPIECE && !this.f346587d.f346635u) {
                fo5.r0 r0Var2 = this.f346587d;
                if (!r0Var2.f346622h.f355997e) {
                    er4.x xVar = r0Var2.f346618d;
                    if (xVar != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "trigger Invited Delay Ringtone Ensure");
                        r0Var2.f346635u = true;
                        gp5.e eVar = r0Var2.f346622h;
                        java.lang.String m128056xfb82e301 = xVar.m128056xfb82e301();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m128056xfb82e301, "getName(...)");
                        er4.r rVar = r0Var2.f346616b;
                        er4.r rVar2 = er4.r.MP_ROOM_TYPE_VIDEO;
                        boolean z17 = rVar == rVar2;
                        er4.q qVar = r0Var2.f346617c;
                        er4.q qVar2 = er4.q.MP_ROOM_ROLE_CALLER;
                        boolean z18 = qVar == qVar2;
                        qo5.b bVar = qo5.b.f447196a;
                        eVar.a(m128056xfb82e301, z17, z18, qo5.b.f447199d, r0Var2.f346621g.a(rVar == rVar2, qVar == qVar2));
                        return;
                    }
                    return;
                }
            }
            if (this.f346587d.c().b() == er4.d.BLUETOOTH && this.f346587d.a()) {
                nq4.f fVar = nq4.f.f420547a;
                if (nq4.f.f420552f) {
                    return;
                }
                this.f346587d.s();
            }
        }
    }
}
