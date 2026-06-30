package n01;

/* loaded from: classes7.dex */
public abstract class c {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerHelper", "createAudioPlayer, appId:%s, audioId:%s", str, str2);
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f88154a;
        d0Var.f87946a = 10;
        d0Var.f87948c = str;
        d0Var.f87947b = str2;
        dl3.c.a(f0Var);
        return d0Var.f87947b;
    }

    public static boolean b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerHelper", "destroyAudio, audioId:%s", str);
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f88154a;
        d0Var.f87946a = 5;
        d0Var.f87947b = str;
        dl3.c.a(f0Var);
        return f0Var.f88155b.f88045a;
    }

    public static n01.b c(java.lang.String str) {
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f88154a;
        d0Var.f87946a = 16;
        d0Var.f87947b = str;
        dl3.c.a(f0Var);
        return d0Var.f87950e;
    }

    public static n01.d d(java.lang.String str) {
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f88154a;
        d0Var.f87946a = 6;
        d0Var.f87947b = str;
        dl3.c.a(f0Var);
        return f0Var.f88155b.f88046b;
    }

    public static boolean e(java.lang.String str) {
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f88154a;
        d0Var.f87946a = 2;
        d0Var.f87947b = str;
        dl3.c.a(f0Var);
        return f0Var.f88155b.f88045a;
    }

    public static boolean f(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerHelper", "seekToAudio, audioId:%s, currentTime:%d", str, java.lang.Integer.valueOf(i17));
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f88154a;
        d0Var.f87946a = 4;
        d0Var.f87947b = str;
        d0Var.f87949d = i17;
        dl3.c.a(f0Var);
        return f0Var.f88155b.f88045a;
    }

    public static boolean g(n01.b bVar) {
        java.lang.String str = bVar.f415369a;
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f88154a;
        d0Var.f87946a = 0;
        d0Var.f87947b = bVar.f415369a;
        d0Var.f87950e = bVar;
        dl3.c.a(f0Var);
        return f0Var.f88155b.f88045a;
    }

    public static boolean h(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerHelper", "stopAudio, audioId:%s", str);
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f88154a;
        d0Var.f87946a = 3;
        d0Var.f87947b = str;
        dl3.c.a(f0Var);
        return f0Var.f88155b.f88045a;
    }
}
