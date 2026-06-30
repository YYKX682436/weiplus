package ug0;

/* loaded from: classes8.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug0.q f509001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ug0.q qVar) {
        super(0);
        this.f509001d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        ug0.q qVar = this.f509001d;
        qVar.getClass();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N0().add(new ug0.m(qVar));
        ug0.n nVar = new ug0.n(qVar);
        c61.t8 t8Var = (c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class));
        p012xc85e97e9.p093xedfae76a.j0 Di = t8Var.Di("Search.Entrance");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        jz5.f0 f0Var3 = null;
        if (Di != null) {
            Di.mo7807xc74540ab(nVar);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotPathDB, failed: path(WebSearch_Entrance) not found");
        }
        p012xc85e97e9.p093xedfae76a.j0 Di2 = t8Var.Di("Search.MentionEntrance");
        if (Di2 != null) {
            Di2.mo7807xc74540ab(nVar);
            f0Var3 = f0Var2;
        }
        if (f0Var3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotPathDB, failed: path(WebSearch_Mention_Entrance) not found");
        }
        return f0Var2;
    }
}
