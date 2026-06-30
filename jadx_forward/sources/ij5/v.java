package ij5;

/* loaded from: classes.dex */
public final class v implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f373344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij5.d0 f373345e;

    public v(ij5.d0 d0Var, wi5.z request, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 searchFlow, int i17, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchFlow, "searchFlow");
        this.f373345e = d0Var;
        this.f373344d = searchFlow;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        boolean z17;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6;
        if (vVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectChatroomConversationSearchUIC", "onFTSSearchEnd " + vVar.f432690b.hashCode());
            ij5.d0 d0Var = this.f373345e;
            java.util.Iterator it = d0Var.f373295e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((p13.c) it.next(), vVar.f432690b)) {
                    z17 = true;
                    break;
                }
            }
            if ((z17 ? vVar : null) == null || vVar.f432691c != 0 || (O6 = d0Var.O6()) == null) {
                return;
            }
            v65.i.b(O6, null, new ij5.u(this, vVar, null), 1, null);
        }
    }
}
