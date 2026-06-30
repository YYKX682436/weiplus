package com.tencent.mapsdk.internal;

/* loaded from: classes5.dex */
public enum ls {
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


    /* renamed from: l, reason: collision with root package name */
    private final int f50373l;

    ls(int i17) {
        this.f50373l = i17;
    }

    private static com.tencent.mapsdk.internal.ls a(int i17) {
        for (com.tencent.mapsdk.internal.ls lsVar : values()) {
            if (lsVar.f50373l == i17) {
                return lsVar;
            }
        }
        return NONE;
    }

    private int a() {
        return this.f50373l;
    }
}
