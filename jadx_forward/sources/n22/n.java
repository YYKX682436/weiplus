package n22;

/* loaded from: classes12.dex */
public class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f415832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f415833b;

    public n(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42) {
        this.f415832a = c21053xdbf1e5f4;
        this.f415833b = c21053xdbf1e5f42;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUtils", "gameToCustom: %s, %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f415832a;
        c21053xdbf1e5f4.f68653x95b20dd4 = 81;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = this.f415833b;
        c21053xdbf1e5f42.f68653x95b20dd4 = 81;
        int z17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().z1();
        c21053xdbf1e5f4.f68677x13320506 = z17 + 1;
        c21053xdbf1e5f42.f68677x13320506 = z17 + 2;
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().V2(c21053xdbf1e5f4);
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(c21053xdbf1e5f42);
        gr.v vVar = gr.v.f356229a;
        vVar.a(false);
        vVar.b().putBoolean("game_to_custom", true);
        return null;
    }
}
