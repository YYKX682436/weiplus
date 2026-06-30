package b21;

/* loaded from: classes11.dex */
public abstract class m {
    public static b21.o a() {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
        musicActionEvent.f54509g.f6770a = 8;
        musicActionEvent.e();
        return musicActionEvent.f54510h.f6840d;
    }

    public static b21.r b() {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
        musicActionEvent.f54509g.f6770a = -2;
        musicActionEvent.e();
        return musicActionEvent.f54510h.f6837a;
    }

    public static boolean c() {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
        musicActionEvent.f54509g.f6770a = -3;
        musicActionEvent.e();
        return musicActionEvent.f54510h.f6838b;
    }

    public static boolean d() {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
        musicActionEvent.f54509g.f6770a = 9;
        musicActionEvent.e();
        return musicActionEvent.f54510h.f6838b;
    }

    public static final java.lang.String e(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicHelper", "markMusicVipIdPrefix:%s", str);
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (str.startsWith("getlinkclisdkmid_") || str.startsWith("getlinkmid_"))) {
            return str;
        }
        return "getlinkclisdkmid_" + str;
    }

    public static final void f() {
        com.tencent.mm.sdk.platformtools.u3.h(new b21.d());
    }

    public static final void g() {
        com.tencent.mm.sdk.platformtools.u3.h(new b21.e());
    }

    public static boolean h(int i17) {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
        am.gk gkVar = musicActionEvent.f54509g;
        gkVar.f6770a = 7;
        gkVar.f6775f = i17;
        musicActionEvent.e();
        return musicActionEvent.f54510h.f6838b;
    }

    public static void i(b21.r rVar) {
        com.tencent.mm.sdk.platformtools.u3.h(new b21.k(rVar));
    }

    public static final void j() {
        com.tencent.mm.sdk.platformtools.u3.h(new b21.f());
    }

    public static void k(b21.r rVar) {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
        am.gk gkVar = musicActionEvent.f54509g;
        gkVar.f6770a = 16;
        gkVar.f6771b = rVar;
        musicActionEvent.e();
    }
}
