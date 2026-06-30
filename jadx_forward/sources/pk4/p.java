package pk4;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 f438049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9) {
        super(0);
        this.f438049d = c18691x35cf85c9;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9 = this.f438049d;
        java.lang.String str = c18691x35cf85c9.f256076d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init effector finished, player:");
        kk4.b player = c18691x35cf85c9.getPlayer();
        sb6.append(player != null ? player.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        return jz5.f0.f384359a;
    }
}
