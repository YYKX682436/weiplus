package com.tencent.liteapp.gen;

/* loaded from: classes8.dex */
public enum LiteAppOpenScene {
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
    FINDER_PROFILE(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT),
    FINDER_LIVE(5002),
    FINDER_LIVE_TOOLBAR(5003),
    FINDER_LIVE_BUBBLE(5004),
    SEARCH(6000),
    SEARCH_RESULT(com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE),
    SEARCH_RESULT_GAME(6002),
    SEARCH_RESULT_HISTORY(6003),
    ECS(7000);

    private final int value;

    LiteAppOpenScene(int i17) {
        this.value = i17;
    }

    public static com.tencent.liteapp.gen.LiteAppOpenScene fromValue(int i17) {
        for (com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene : values()) {
            if (liteAppOpenScene.value == i17) {
                return liteAppOpenScene;
            }
        }
        return values()[0];
    }

    public int getValue() {
        return this.value;
    }
}
