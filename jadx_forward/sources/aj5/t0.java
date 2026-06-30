package aj5;

/* loaded from: classes.dex */
public final class t0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f87049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f87050e;

    public t0(aj5.g1 g1Var, wi5.z request, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 searchFlow, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchFlow, "searchFlow");
        this.f87050e = g1Var;
        this.f87049d = searchFlow;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        boolean z17;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6;
        if (vVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "onFTSSearchEnd " + vVar.f432690b.hashCode());
            aj5.g1 g1Var = this.f87050e;
            java.util.Iterator it = g1Var.f86966f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((p13.c) it.next(), vVar.f432690b)) {
                    z17 = true;
                    break;
                }
            }
            if ((z17 ? vVar : null) == null || vVar.f432691c != 0 || (O6 = g1Var.O6()) == null) {
                return;
            }
            v65.i.b(O6, null, new aj5.s0(this, vVar, null), 1, null);
        }
    }
}
