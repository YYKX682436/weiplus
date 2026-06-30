package em4;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f336745a = gm4.a.f355090a.a("key_show_audio_red_dot", false);

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRedDotManager", "initDataFromLocal showAudioRedDot: " + f336745a);
    }

    public static final void a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRedDotManager", "disposeRedDotAtPath path: ".concat(path));
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N(path);
    }
}
