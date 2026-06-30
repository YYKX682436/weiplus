package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

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
    private final int f131906l;

    ls(int i17) {
        this.f131906l = i17;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ls a(int i17) {
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ls lsVar : m36828xcee59d22()) {
            if (lsVar.f131906l == i17) {
                return lsVar;
            }
        }
        return NONE;
    }

    private int a() {
        return this.f131906l;
    }
}
