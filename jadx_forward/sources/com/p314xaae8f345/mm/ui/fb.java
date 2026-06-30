package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public enum fb {
    NORMAL(0),
    GREEN(1),
    RED(2),
    BLACK(3),
    TRANSPARENT(4),
    TRANSPARENT_RED_TEXT(5),
    TRANSPARENT_GREEN_TEXT(6),
    GOLDEN(7),
    TRANSPARENT_GOLD_TEXT(8),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSPARENT_GB_GREEN_TEXT(9),
    TRANSPARENT_BG_BLACK_TEXT(10),
    YELLOW(11),
    ORANGE(12),
    DARK_GREEN_MODE(13),
    SMART_GALLERY_SEARCH_ENTRY(14),
    FEED_FOLLOW(15),
    FEED_UNFOLLOW(16),
    FINDER_LIVE(17),
    ALTER_BTN_BACKGROUND(18),
    TIGER2022(19),
    SELECT(20),
    BLUE_TEXT_MEDIUM(21);


    /* renamed from: d, reason: collision with root package name */
    public final int f289981d;

    fb(int i17) {
        this.f289981d = i17;
    }

    public static com.p314xaae8f345.mm.ui.fb a(int i17) {
        for (com.p314xaae8f345.mm.ui.fb fbVar : m80644xcee59d22()) {
            if (fbVar.f289981d == i17) {
                return fbVar;
            }
        }
        return NORMAL;
    }
}
