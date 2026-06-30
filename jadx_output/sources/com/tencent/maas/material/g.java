package com.tencent.maas.material;

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
    public final int f48248d;

    g(int i17) {
        this.f48248d = i17;
    }

    public static com.tencent.maas.material.g a(int i17) {
        for (com.tencent.maas.material.g gVar : values()) {
            if (gVar.f48248d == i17) {
                return gVar;
            }
        }
        return None;
    }
}
