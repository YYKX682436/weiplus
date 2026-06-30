package qk4;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk4.a f445974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qk4.f f445975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qk4.a aVar, qk4.f fVar) {
        super(0);
        this.f445974d = aVar;
        this.f445975e = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qk4.a aVar = this.f445974d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806 c18698xd8450806 = (com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806) aVar;
        kk4.v player = c18698xd8450806.getPlayer();
        if (player != null) {
            player.f390117i = new qk4.d(this.f445975e, aVar);
        }
        kk4.v player2 = c18698xd8450806.getPlayer();
        if (player2 != null) {
            player2.mo143591x360802();
        }
        return jz5.f0.f384359a;
    }
}
