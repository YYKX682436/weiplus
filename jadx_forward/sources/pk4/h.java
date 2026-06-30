package pk4;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c f438019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c) {
        super(0);
        this.f438019d = c18689xd498e45c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c = this.f438019d;
        java.lang.String str = c18689xd498e45c.f256045d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initEffector finished, currentPlayer:");
        kk4.v currentPlayer = c18689xd498e45c.getCurrentPlayer();
        sb6.append(currentPlayer != null ? currentPlayer.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        return jz5.f0.f384359a;
    }
}
