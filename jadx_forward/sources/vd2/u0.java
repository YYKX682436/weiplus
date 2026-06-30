package vd2;

@j95.b
/* loaded from: classes8.dex */
public final class u0 extends i95.w implements ss5.c0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f517460e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f517459d = "Finder.FinderChatroomLiveFeatureService";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f517461f = "notifyChatroomWhenStorageReady";

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f517462g = jz5.h.b(vd2.t0.f517452d);

    public boolean Ai() {
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean z17 = !zl2.r4.f555489g && com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = this.f517459d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hideChatroomLive is pad:" + z17);
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        boolean z18 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[supportChatroomLive] show:" + el6 + " isTeenModeAndNothing:" + z18);
        return !(el6 && !z18) || z17;
    }

    public final rl2.v wi() {
        return (rl2.v) ((jz5.n) this.f517462g).mo141623x754a37bb();
    }
}
