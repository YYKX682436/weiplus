package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.DataSource */
/* loaded from: classes5.dex */
public enum EnumC4243xc2aa3885 {
    NONE(-1),
    SATELLITE(0),
    DEM(1),
    MAP(2),
    STREET_VIEW_ROAD(3),
    TRAFFIC_NETWORK(4),
    INDOOR_BUILDINGS(5),
    LANDMARK(6),
    TILE_OVERLAY(7),
    INDOOR_CONFIG(8),
    NUM(9);


    /* renamed from: mValue */
    private final int f16434xbee9dd04;

    EnumC4243xc2aa3885(int i17) {
        this.f16434xbee9dd04 = i17;
    }

    public static com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4243xc2aa3885 get(int i17) {
        for (com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4243xc2aa3885 enumC4243xc2aa3885 : m35283xcee59d22()) {
            if (enumC4243xc2aa3885.f16434xbee9dd04 == i17) {
                return enumC4243xc2aa3885;
            }
        }
        return NONE;
    }

    /* renamed from: getValue */
    public final int m35284x754a37bb() {
        return this.f16434xbee9dd04;
    }
}
