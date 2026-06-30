package com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1022xc56d9687;

/* loaded from: classes8.dex */
public class a implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1022xc56d9687.a f156187d = new com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1022xc56d9687.a();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f156188e = "";

    public a() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5851x7d4ee7fd> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5851x7d4ee7fd>(a0Var) { // from class: com.tencent.mm.plugin.ai.data.business.tools_mp.PreloadManager$1
            {
                this.f39173x3fe91575 = -1050795507;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5851x7d4ee7fd c5851x7d4ee7fd) {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1022xc56d9687.a.this.a()) {
                    return false;
                }
                ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
                return false;
            }
        };
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((android.app.Application) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext()).registerActivityLifecycleCallbacks(this);
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
    }

    public boolean a() {
        if (o45.wf.f424566k) {
            return true;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_tools_mp_pss_opt_rule_v2, 0) == 1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        java.lang.String[] split;
        if (!f156187d.a() || (split = activity.getClass().getName().split("\\.")) == null || split.length == 0) {
            return;
        }
        java.lang.String str = ";" + split[split.length - 1] + ";";
        if (android.text.TextUtils.isEmpty(f156188e)) {
            f156188e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("ai_is_tools_or_mp_entry", ";BizTimeLineUI;BaseScanUI;ChattingUI;ReaderAppUI;FTSMainUI;MainUI;MallWalletUI;ImageGalleryUI;UIPageFragmentActivity;FavoriteIndexUI;AppAttachNewDownloadUI;MallIndexUIv2;SnsCommentDetailUI;FloatBall;WalletBalanceManagerUI;TopStoryHomeUI;ContactInfoUI;RecordMsgDetailUI;FindMoreFriendsUI;AppBrandUI;WalletLqtDetailUI;ExtDeviceWXLoginUI;SnsBrowseUI;WXBizEntryActivity;WalletBankcardManageUI;FavoriteTextDetailUI;FTSAddFriendUI;AddMoreFriendsUI;GameCenterUI;SoSoProxyUI;WebSearchImageLoadingUI;CardDetailUI;EnterpriseBizContactListUI;EnterpriseConversationUI;LoginPasswordUI;BrandServiceIndexUI;SingleChatInfoUI;AppBrandUI2;FTSBizDetailUI;WXCustomSchemeEntryActivity;RemittanceDetailUI;WalletPasswordSettingUI;AppBrandUI1;SnsGalleryUI;FavoriteImgDetailUI;PhoneRechargeUI;LoginUI;AppBrandLauncherUI;FavSearchUI;MobileInputUI;VideoActivity;AppBrandLaunchProxyUI;MediaHistoryListUI;AppBrandPluginUI;TextPreviewUI;MallIndexOSUI;AppBrandUI3;SnsUploadUI;FavImgGalleryUI;Settings$AppControlSettingsActivity;ProfileSettingUI;RegByMobileRegAIOUI;ChatroomInfoUI;FavoriteFileDetailUI;NetworkDiagnoseAllInOneUI;EmojiStoreV2UI;LuckyMoneyNotHookReceiveUI;RoomCardUI;RecordMsgFileUI;AppBrandServiceChattingUI;GameMsgCenterUI;RecordMsgImageUI;FavRecordDetailUI;SnsAdNativeLandingPagesPreviewUI;CreateOrJoinChatroomUI;LuckyMoneyPickEnvelopeUI;WebSearchSnsImageLoadingUI;UIEntryStub;AppBrandTaskProxyUI;SnsWsFoldDetailUI;LoginSmsUI;FavFilterUI;SnsSingleTextViewUI;AppAttachDownloadUI;FinderFollowTabFragment;SettingsAboutMicroMsgUI;AppBrandUI4;AppBrandPluginUI2;NewBizConversationUI;MusicMvMainUI;WalletSecuritySettingUI;i;BizTimeLineNewMsgUI;BizChatroomInfoUI;MultiTalkSelectContactUI;SDKOAuthUI;SelectConversationUI;RemittanceBusiResultUI;WebViewStubProxyUI;WXEntryActivity;WalletOfflineCoinPurseUI;GameChatTabUI;ShakeReportUI;AppBrandProfileUI;FinderProfileTimeLineUI;GestureGalleryUI;FavSelectUI;WalletLqtSaveFetchUI;FinderFinderSysMsgUI;LoginVoiceUI;WeCoinRechargeView;FinderShareFeedRelUI;WeChatSplashActivity;AddressUIFragment;SimpleLoginUI;AppBrandProcessProxyUI;FaceDetectConfirmUI;WalletBrandUI;FinderFriendTabFragment;MusicMainUI;PermissionActivity;DownloadMainUI;RemittanceUI;MoreTabUI;SettingsModifyAliasCheckUI;EmojiStoreDetailUI;AppBrandTaskProxyUI2;WalletOrderInfoNewUI;WalletBalanceFetchUI;FinderProfileUI;HoneyPayCardManagerUI;LuckyMoneyDetailUI;AppBrandPluginUI3;SettingsAccountInfoUI;WxaLiteAppLiteUI;ExdeviceRankInfoUI;SettingsMoreSafeUI;ShareImgUI;LuckyMoneyPrepareUI;TopStoryTabHomeUI;RequestFloatWindowPermissionDialog;FinderAccountManagent;FileSelectorUI;FinderLiveVisitorWithoutAffinityUI;TaskRedirectUI;HoneyPayMainUI;MainActivity;OrderHandlerUI;OccupyFinderUI8;FinderMachineTabFragment;WebviewScanImageActivity;BankRemitBankcardInputUI;FaceFlashUI;FMessageConversationUI;WalletPayUI;SettingsSwitchAccountUI;FaceAgreementUI;NoteEditorUI;MultiTalkMainUI;FTSEmojiDetailPageUI;LoginByMobileSendSmsUI;AppBrandPluginUI1;BizChatConversationUI;RemittanceOSUI;EmptyActivity;WalletMixOrderInfoUI;SelectContactUI;ContactMoreInfoUI;WebViewDownloadUI;MsgRetransmitUI;AccountExpiredUI;FavMediaGalleryUI;SettingsModifyAliasUI;AppBrandPreLoadingUI;ImagePreviewUI;AppBrandServiceConversationUI;FinderLikedFeedUI;SettingsChattingBackgroundUI;AppBrandTaskProxyUI3;AppBrandTaskProxyUI4;AppBrandTaskProxyUI1;SendAppMessageWrapperUI;MobileLoginOrForceReg;MediaHistoryGalleryUI;BackupChooseBackupModeUI;FingerprintWalletLockUI;MultiTalkAddMembersUI;WXPayEntryActivity;WelabMainUI;QQCallbackUI;FingerPrintAuthUI;FTSDetailUI;AlbumPreviewUI;WalletOpenViewProxyUI;RemittanceBusiUI;CardShopUI;SosSimilarUI;LuckyMoneyBusiDetailUI;WcPayRealnameVerifyIdInputUI;VoiceInputUI;FixToolsUI;BackupPcUI;OpenFileChooserUI;SDKOAuthOtherUI;WebViewStubTempUI;WebWXLogoutUI;FaceFlashActionUI;");
        }
        if (f156188e.contains(str)) {
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
