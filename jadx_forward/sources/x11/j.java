package x11;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final x11.j f532909d = new x11.j();

    public j() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = false;
        boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2552x5026199c.C20556x86db286e()) == 1;
        jz5.g gVar = p01.b.f431893a;
        boolean z19 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) p01.b.f431893a).mo141623x754a37bb()).getBoolean("need_revert_v2", false);
        if (z18 && !z19) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "init speedUp:" + z18 + " isNeedRevert:" + z19 + " result:" + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
