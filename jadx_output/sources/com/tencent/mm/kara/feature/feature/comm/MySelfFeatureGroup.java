package com.tencent.mm.kara.feature.feature.comm;

/* loaded from: classes11.dex */
public class MySelfFeatureGroup extends pl0.e {

    @fl0.a
    public int addMeByContactCard;

    @fl0.a
    public int addMeByGroupChat;

    @fl0.a
    public int addMeByMyQRCode;

    @fl0.a
    public int appLaunchedDueToNotification;

    @fl0.a
    public int autoDownloadMediasViewedOnOtherDevice;

    @fl0.a
    public int autoplayMomentVideosOnMobileData;

    @fl0.a
    private com.tencent.mm.kara.feature.feature.comm.AvatarFeatureGroup avatar = new com.tencent.mm.kara.feature.feature.comm.AvatarFeatureGroup();

    @fl0.a
    public int findMeByMobileNumber;

    @fl0.a
    public int findMeByQQID;

    @fl0.a
    public int findMeByWeChatID;

    @fl0.a
    public int findMobileContacts;

    @fl0.a
    public int finderUpdateAlerts;

    @fl0.a
    public int fontLevel;

    @fl0.a
    public int makeLast10MomentPostsPublic;

    @fl0.a
    public int messagePushNotifications;

    @fl0.a
    public int momentsUpdateAlerts;

    @fl0.a
    public int requireFriendRequest;

    @fl0.a
    public int sex;

    @fl0.a
    public int showPushNotificationPreviewText;

    @fl0.a
    public int soundForInAppNotifications;

    @fl0.a
    public int turnOffSpeaker;

    @fl0.a
    public int vibrateForInAppNotifications;

    @fl0.a
    public int[] visibleMomentToFriends;

    @fl0.a
    public int voiceAndVideoCallPushNotifications;

    @Override // pl0.e, fl0.b
    public void build() {
        super.build();
        sl0.b1 b1Var = sl0.b1.f409060e;
        this.addMeByContactCard = ((java.lang.Boolean) b1Var.a("addMeByContactCard", new sl0.s0(b1Var))).booleanValue() ? 1 : 0;
        this.addMeByGroupChat = ((java.lang.Boolean) b1Var.a("addMeByGroupChart", new sl0.t0(b1Var))).booleanValue() ? 1 : 0;
        this.addMeByMyQRCode = ((java.lang.Boolean) b1Var.a("addMeByMyQRCode", new sl0.u0(b1Var))).booleanValue() ? 1 : 0;
        this.findMeByMobileNumber = ((java.lang.Boolean) b1Var.a("findMeByMobileNumber", new sl0.v0(b1Var))).booleanValue() ? 1 : 0;
        this.findMeByQQID = ((java.lang.Boolean) b1Var.a("findMeByQQID", new sl0.w0(b1Var))).booleanValue() ? 1 : 0;
        this.findMeByWeChatID = ((java.lang.Boolean) b1Var.a("findMeByWeChatID", new sl0.x0(b1Var))).booleanValue() ? 1 : 0;
        this.findMobileContacts = ((java.lang.Boolean) b1Var.a("findMobileContacts", new sl0.m0(b1Var))).booleanValue() ? 1 : 0;
        this.fontLevel = ((java.lang.Integer) b1Var.a("fontLevel", new sl0.y0(b1Var))).intValue();
        this.finderUpdateAlerts = ((java.lang.Boolean) b1Var.a("finderUpdateAlerts", new sl0.l0(b1Var))).booleanValue() ? 1 : 0;
        this.autoplayMomentVideosOnMobileData = ((java.lang.Boolean) b1Var.a("autoplayMomentVideosOnMobileData", new sl0.a1(b1Var))).booleanValue() ? 1 : 0;
        this.autoDownloadMediasViewedOnOtherDevice = ((java.lang.Boolean) b1Var.a("autoDownloadMediasViewedOnOtherDevice", new sl0.z0(b1Var))).booleanValue() ? 1 : 0;
        this.makeLast10MomentPostsPublic = ((java.lang.Boolean) b1Var.a("makeLast10MomentPostsPublic", new sl0.n0(b1Var))).booleanValue() ? 1 : 0;
        this.momentsUpdateAlerts = ((java.lang.Boolean) b1Var.a("momentsUpdateAlerts", new sl0.o0(b1Var))).booleanValue() ? 1 : 0;
        this.showPushNotificationPreviewText = ((java.lang.Boolean) b1Var.a("showPushNotificationPreviewText", new sl0.p0(b1Var))).booleanValue() ? 1 : 0;
        this.turnOffSpeaker = ((java.lang.Boolean) b1Var.a("turnOffSpeaker", new sl0.q0(b1Var))).booleanValue() ? 1 : 0;
        this.visibleMomentToFriends = (int[]) b1Var.a("visibleMomentToFriends", new sl0.r0(b1Var));
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "myself";
    }
}
