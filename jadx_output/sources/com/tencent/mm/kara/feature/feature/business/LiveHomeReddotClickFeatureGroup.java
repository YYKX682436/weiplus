package com.tencent.mm.kara.feature.feature.business;

/* loaded from: classes13.dex */
public class LiveHomeReddotClickFeatureGroup extends pl0.e {

    @fl0.a
    public int containsTitle;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.comm.DiscoverViewFeatureGroup discoverView;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.livehome.HistoriesOfLiveHomeFeatureGroup histories;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.livehome.HistoriesWithAnchorFeatureGroup historiesWithAnchor;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.livehome.HistoriesWithDisturbanceFeatureGroup historiesWithDisturbance;

    @fl0.a
    public int isReddotScoreValid;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.comm.MySelfFeatureGroup myself = new com.tencent.mm.kara.feature.feature.comm.MySelfFeatureGroup();

    @fl0.a
    public com.tencent.mm.kara.feature.feature.livehome.HistoriesOfNoReddotLiveHomeFeatureGroup noRedotHistories;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.livehome.HistoriesWithNoReddotDisturbanceFeatureGroup noRedotHistoriesWithDisturbance;

    @fl0.a
    public float reddotScore;

    public LiveHomeReddotClickFeatureGroup(java.lang.String str, float f17, boolean z17, java.lang.String str2, java.lang.String str3) {
        this.reddotScore = 0.0f;
        this.isReddotScoreValid = 0;
        this.containsTitle = 0;
        g(str);
        this.reddotScore = f17;
        this.isReddotScoreValid = z17 ? 1 : 0;
        this.containsTitle = !android.text.TextUtils.isEmpty(str2) ? 1 : 0;
        this.discoverView = new com.tencent.mm.kara.feature.feature.comm.DiscoverViewFeatureGroup();
        this.histories = new com.tencent.mm.kara.feature.feature.livehome.HistoriesOfLiveHomeFeatureGroup();
        this.historiesWithDisturbance = new com.tencent.mm.kara.feature.feature.livehome.HistoriesWithDisturbanceFeatureGroup();
        this.historiesWithAnchor = new com.tencent.mm.kara.feature.feature.livehome.HistoriesWithAnchorFeatureGroup(str3);
        this.noRedotHistories = new com.tencent.mm.kara.feature.feature.livehome.HistoriesOfNoReddotLiveHomeFeatureGroup();
        this.noRedotHistoriesWithDisturbance = new com.tencent.mm.kara.feature.feature.livehome.HistoriesWithNoReddotDisturbanceFeatureGroup();
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "LiveHomeReddotClickFeatureGroup";
    }
}
