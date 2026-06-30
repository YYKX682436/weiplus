package ec2;

/* loaded from: classes2.dex */
public final class e extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f332491g = "FinderPlayProgressObserver";

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return (event instanceof ec2.f) && ((ec2.f) event).f332492d == 3;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("offset = ");
            ec2.f fVar = (ec2.f) ev6;
            sb6.append(fVar.f332496h);
            sb6.append(",total = ");
            sb6.append(fVar.f332497i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f332491g, sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209583z2).mo141623x754a37bb()).r()).intValue() != 1 || fVar.f332496h < fVar.f332497i - 1) {
                return;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
    }
}
