package com.tencent.mm.kara.feature.feature.comm;

/* loaded from: classes8.dex */
public class DiscoverViewFeatureGroup extends pl0.e {

    @fl0.a
    public int numberOfUnreadAtTab = 0;

    @fl0.a
    public int badgeAtTab = 0;

    @fl0.a
    public int badgeAtMonentCell = 0;

    @fl0.a
    public int badgeAtFinderCell = 0;

    @fl0.a
    public int numberOfUnreadAtMomentCell = 0;

    @fl0.a
    public int numberOfUnreadAtFinderCell = 0;

    @fl0.a
    public int[] preSubEntrance = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public float enterProbabilityBaseOnTime = 0.0f;
    public float enterProbabilityBaseOnSeries = 0.0f;

    @fl0.a
    public int badgeAtLiveCell = 0;

    @Override // pl0.e, fl0.b
    public void build() {
        super.build();
        zs.a aVar = zs.b.f475222a;
        switch (zs.b.f475222a.ordinal()) {
            case 0:
                this.preSubEntrance[0] = 1;
                break;
            case 1:
                this.preSubEntrance[1] = 1;
                break;
            case 2:
                this.preSubEntrance[2] = 1;
                break;
            case 3:
                this.preSubEntrance[3] = 1;
                break;
            case 4:
                this.preSubEntrance[4] = 1;
                break;
            case 5:
                this.preSubEntrance[5] = 1;
                break;
            case 6:
                this.preSubEntrance[6] = 1;
                break;
            case 7:
                this.preSubEntrance[7] = 1;
                break;
            case 8:
                this.preSubEntrance[8] = 1;
                break;
            case 9:
                this.preSubEntrance[9] = 1;
                break;
            case 10:
                this.preSubEntrance[10] = 1;
                break;
        }
        this.numberOfUnreadAtFinderCell = zs.c.f475228f;
        this.numberOfUnreadAtMomentCell = zs.c.f475229g;
        this.badgeAtMonentCell = zs.c.f475224b ? 1 : 0;
        this.badgeAtFinderCell = zs.c.f475225c ? 1 : 0;
        this.badgeAtLiveCell = zs.c.f475226d ? 1 : 0;
        this.badgeAtTab = zs.c.f475223a ? 1 : 0;
        this.numberOfUnreadAtTab = zs.c.f475227e;
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "discover_view";
    }
}
