package qt2;

/* loaded from: classes2.dex */
public final class r extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qt2.u f448141g;

    public r(qt2.u uVar) {
        this.f448141g = uVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return (event instanceof ec2.f) && ((ec2.f) event).f332492d == 3;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        java.lang.Object obj;
        in5.s0 O6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            if (fVar.f332492d == 3) {
                float f17 = fVar.f332496h / fVar.f332497i;
                qt2.u uVar = this.f448141g;
                java.util.Iterator it = uVar.f448150m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    float f18 = ((qt2.j) obj).f448127n;
                    if (f18 > 0.0f && f18 < 1.0f) {
                        break;
                    }
                }
                qt2.j jVar = (qt2.j) obj;
                float f19 = jVar != null ? jVar.f448127n : 1.0f;
                if ((f19 == 1.0f) || f17 < f19 || (O6 = uVar.O6()) == null) {
                    return;
                }
                java.lang.Object obj2 = O6.f374658i;
                so2.u1 u1Var = obj2 instanceof so2.u1 ? (so2.u1) obj2 : null;
                if (u1Var != null && u1Var.getFeedObject().m59331xcb21161d() && fVar.f332498j == u1Var.mo2128x1ed62e84()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShareGuideManageUIC", "show popup tips with progress, curProgress=" + f17 + ", targetProgress=" + f19);
                    uVar.f448153p = true;
                    uVar.R6("progress");
                }
            }
        }
    }
}
