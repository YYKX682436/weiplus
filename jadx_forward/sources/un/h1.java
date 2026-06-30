package un;

/* loaded from: classes5.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.j1 f510815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(un.j1 j1Var) {
        super(0);
        this.f510815d = j1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        un.j1 j1Var = this.f510815d;
        boolean p47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(j1Var.c7());
        boolean z17 = (p47 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(j1Var.c7())) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleRoomOperationUIC", "isSingleChatConvBoxOpen switch:true isKefu:" + p47 + " isEntryOpen:" + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
