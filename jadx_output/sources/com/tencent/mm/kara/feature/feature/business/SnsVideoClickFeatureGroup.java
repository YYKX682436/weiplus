package com.tencent.mm.kara.feature.feature.business;

/* loaded from: classes13.dex */
public class SnsVideoClickFeatureGroup extends pl0.e {

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.GroupWithSenderFeatureGroup commendGroup;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.ContactsThatCommentedFeatureGroup contactsThatCommented;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.ContactsThatLikedFeatureGroup contactsThatLiked;

    @fl0.a
    public long feedId;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup historiesOfSameCity;

    @fl0.a
    public int isAtMe;

    @fl0.a
    public int isWeishang;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderRelationshipFeatureGroup sender;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories senderMessageHistories;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderMomentsFeatureGroup senderMoment;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories senderSnsHistories;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderTagsFeatureGroup senderTags;
    private com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;

    @fl0.a
    public int timeIntervalSincePostedInHours;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup historiesOfPreviewClassification = new com.tencent.mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup();

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup historiesOfWeishang = new com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup();

    @fl0.a
    public com.tencent.mm.kara.feature.feature.comm.MySelfFeatureGroup mySelf = new com.tencent.mm.kara.feature.feature.comm.MySelfFeatureGroup();

    @fl0.a
    public com.tencent.mm.kara.feature.feature.comm.DeviceFeatureGroup device = new com.tencent.mm.kara.feature.feature.comm.DeviceFeatureGroup();

    @fl0.a
    public com.tencent.mm.kara.feature.feature.comm.DiscoverSettingsFeatureGroup discover = new com.tencent.mm.kara.feature.feature.comm.DiscoverSettingsFeatureGroup();

    public SnsVideoClickFeatureGroup(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.snsInfo = snsInfo;
        this.contactsThatCommented = new com.tencent.mm.kara.feature.feature.sns.ContactsThatCommentedFeatureGroup(snsInfo);
        this.contactsThatLiked = new com.tencent.mm.kara.feature.feature.sns.ContactsThatLikedFeatureGroup(snsInfo);
        this.historiesOfSameCity = new com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup(this.snsInfo);
        this.sender = new com.tencent.mm.kara.feature.feature.sns.SenderRelationshipFeatureGroup(snsInfo.getUserName());
        this.senderMoment = new com.tencent.mm.kara.feature.feature.sns.SenderMomentsFeatureGroup(snsInfo.getUserName());
        this.commendGroup = new com.tencent.mm.kara.feature.feature.sns.GroupWithSenderFeatureGroup(snsInfo.getUserName());
        this.senderTags = new com.tencent.mm.kara.feature.feature.sns.SenderTagsFeatureGroup(snsInfo.getUserName());
        this.senderSnsHistories = new com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories(snsInfo.getUserName());
        this.senderMessageHistories = new com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories(snsInfo.getUserName());
        f(this.snsInfo);
        g(snsInfo.getSnsId());
    }

    @Override // pl0.e, fl0.b
    public void build() {
        em0.b.b("MomentVideo", 301);
        try {
            super.build();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i17 = 1;
            this.isAtMe = this.snsInfo.isWithMe() ? 1 : 0;
            this.timeIntervalSincePostedInHours = (int) ((((currentTimeMillis - (this.snsInfo.getCreateTime() * 1000)) / 1000) / 60) / 60);
            if (!this.snsInfo.isWsFold()) {
                i17 = 0;
            }
            this.isWeishang = i17;
            this.feedId = com.tencent.mm.plugin.sns.storage.w2.n(this.snsInfo.getSnsId());
        } catch (java.lang.Exception unused) {
            em0.b.b("MomentVideo", 302);
        }
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "snsvedio";
    }
}
