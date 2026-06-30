package com.p314xaae8f345.p457x3304c6.p476x11d36527;

/* loaded from: classes5.dex */
public enum g {
    None(-1),
    MovieTitle(0),
    ContentDesc(1),
    /* JADX INFO: Fake field, exist only in values array */
    FancyText(2),
    /* JADX INFO: Fake field, exist only in values array */
    WhenWhere(3),
    /* JADX INFO: Fake field, exist only in values array */
    Lyric(4),
    /* JADX INFO: Fake field, exist only in values array */
    Filter(5),
    CamFilter(6),
    CamBeauty(7),
    /* JADX INFO: Fake field, exist only in values array */
    Font(8),
    TimbreTTS(9),
    /* JADX INFO: Fake field, exist only in values array */
    TimbreSTS(10),
    Transition(11),
    TimbreVoiceChange(12),
    /* JADX INFO: Fake field, exist only in values array */
    TextAnimPreset(13),
    Makeup(14),
    FaceEffect(15);


    /* renamed from: d, reason: collision with root package name */
    public final int f129781d;

    g(int i17) {
        this.f129781d = i17;
    }

    public static com.p314xaae8f345.p457x3304c6.p476x11d36527.g a(int i17) {
        for (com.p314xaae8f345.p457x3304c6.p476x11d36527.g gVar : m33817xcee59d22()) {
            if (gVar.f129781d == i17) {
                return gVar;
            }
        }
        return None;
    }
}
