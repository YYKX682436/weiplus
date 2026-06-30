package p01;

/* loaded from: classes5.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final p01.e f431896d = new p01.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.g gVar = p01.b.f431893a;
        boolean z17 = false;
        boolean z18 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) p01.b.f431893a).mo141623x754a37bb()).getBoolean("need_revert_v2", false);
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2552x5026199c.C20555xbc1d8070());
        int abs = java.lang.Math.abs(gm0.j1.b().h() % 1000);
        if ((c17 == 1 || abs < 100) && !z18) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewInitThread", "isNetSceneOptOpen expt:" + c17 + " uinMod:" + abs + " needRevert:" + z18 + " res:" + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
