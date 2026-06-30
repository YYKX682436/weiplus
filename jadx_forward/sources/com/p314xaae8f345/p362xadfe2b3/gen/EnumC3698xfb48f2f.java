package com.p314xaae8f345.p362xadfe2b3.gen;

/* renamed from: com.tencent.liteapp.gen.LiteAppOpenScene */
/* loaded from: classes8.dex */
public enum EnumC3698xfb48f2f {
    INVALID(0),
    APP(1000),
    WEB_VIEW(1001),
    LITE_APP(1002),
    WA_APP(1003),
    OPEN_SDK(1010),
    APP_VIEW(1100),
    GAME(2001),
    FIND_JUMP_GAME(2002),
    GAME_MP(2003),
    SINGLE_CHAT(3001),
    GROUP_CHAT(3002),
    TIMELINE(3003),
    CARD_PREVIEW(3004),
    FAV_LIST(3005),
    SEARCH_CHAT_CARD(3006),
    QR_CODE(3101),
    QR_CODE_FROM_LONG_PRESS(3102),
    QR_CODE_FROM_ALBUM(3103),
    SHORT_LINK(3201),
    URL_SCHEMA(3202),
    STAR(3301),
    FLOAT(3302),
    SCREEN_SHOT_SHARE(3401),
    MP_PROFILE(4001),
    FINDER(5000),
    FINDER_PROFILE(com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.f50820x1cfb1f28),
    FINDER_LIVE(5002),
    FINDER_LIVE_TOOLBAR(5003),
    FINDER_LIVE_BUBBLE(5004),
    SEARCH(6000),
    SEARCH_RESULT(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4),
    SEARCH_RESULT_GAME(6002),
    SEARCH_RESULT_HISTORY(6003),
    ECS(7000);


    /* renamed from: value */
    private final int f14151x6ac9171;

    EnumC3698xfb48f2f(int i17) {
        this.f14151x6ac9171 = i17;
    }

    /* renamed from: fromValue */
    public static com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f m28830x447c3e7(int i17) {
        for (com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f enumC3698xfb48f2f : m28832xcee59d22()) {
            if (enumC3698xfb48f2f.f14151x6ac9171 == i17) {
                return enumC3698xfb48f2f;
            }
        }
        return m28832xcee59d22()[0];
    }

    /* renamed from: getValue */
    public int m28833x754a37bb() {
        return this.f14151x6ac9171;
    }
}
