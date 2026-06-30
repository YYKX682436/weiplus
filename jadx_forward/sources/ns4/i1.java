package ns4;

/* loaded from: classes8.dex */
public final class i1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f421078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f421079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.na7 f421080c;

    public i1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420, r45.na7 na7Var) {
        this.f421078a = z2Var;
        this.f421079b = activityC19066x54c41420;
        this.f421080c = na7Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "click agree");
        this.f421078a.B();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f421079b;
        java.lang.String str = activityC19066x54c41420.f260695t;
        if (str != null) {
            ms4.n nVar = activityC19066x54c41420.f260687i;
            if (nVar != null) {
                nVar.N6(str, this.f421080c.f462748g, 1, activityC19066x54c41420);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
        }
    }
}
