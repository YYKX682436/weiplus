package com.tencent.map.lib.models;

/* loaded from: classes5.dex */
public enum DataSource {
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

    private final int mValue;

    DataSource(int i17) {
        this.mValue = i17;
    }

    public static com.tencent.map.lib.models.DataSource get(int i17) {
        for (com.tencent.map.lib.models.DataSource dataSource : values()) {
            if (dataSource.mValue == i17) {
                return dataSource;
            }
        }
        return NONE;
    }

    public final int getValue() {
        return this.mValue;
    }
}
