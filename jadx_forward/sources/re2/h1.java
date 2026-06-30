package re2;

/* loaded from: classes3.dex */
public final class h1 extends re2.e0 {

    /* renamed from: r, reason: collision with root package name */
    public final int f475959r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f475960s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i17, java.lang.String initiatorFinderUsername) {
        super(initiatorFinderUsername);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initiatorFinderUsername, "initiatorFinderUsername");
        this.f475959r = i17;
        this.f475960s = "Finder.CoLiveTask";
    }

    @Override // re2.e0
    public java.lang.String c() {
        return this.f475960s;
    }

    public final void k(yz5.a aVar, yz5.p pVar) {
        re2.a0 a0Var = this.f475922b;
        re2.a0 a0Var2 = re2.a0.f475888d;
        java.lang.String str = this.f475960s;
        if (a0Var != a0Var2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "create: invalid phase=" + this.f475922b);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create: settlementMode=");
        int i17 = this.f475959r;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        re2.f1 f1Var = new re2.f1(this, aVar);
        re2.g1 g1Var = new re2.g1(this, pVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveRequestHelper", "createInvitation: settlementMode=" + i17);
        new ek2.o(i17, new re2.a1(f1Var, g1Var)).l();
    }
}
