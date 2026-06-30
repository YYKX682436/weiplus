package o45;

/* loaded from: classes8.dex */
public abstract class uf {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f424543a;

    public static final boolean a(java.lang.String str) {
        if (f424543a == null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            f424543a = hashSet;
            hashSet.add("menu:share:QZone");
            f424543a.add("onImageDownloadProgress");
            f424543a.add("onVoiceUploadProgress");
            f424543a.add("onVoiceDownloadProgress");
            f424543a.add("onVoiceRecordEnd");
            f424543a.add("onVoicePlayBegin");
            f424543a.add("onVoicePlayEnd");
            f424543a.add("onLocalImageUploadProgress");
            f424543a.add("wxdownload:state_change");
            f424543a.add("wxdownload:progress_change");
            f424543a.add("hdOnDeviceStateChanged");
            f424543a.add("activity:state_change");
            f424543a.add("onWXDeviceBluetoothStateChange");
            f424543a.add("onWXDeviceLanStateChange");
            f424543a.add("onWXDeviceBindStateChange");
            f424543a.add("onReceiveDataFromWXDevice");
            f424543a.add("onScanWXDeviceResult");
            f424543a.add("onWXDeviceStateChange");
            f424543a.add("onGetKeyboardHeight");
            f424543a.add(hc1.d.f69825x24728b);
            f424543a.add("onAddShortcutStatus");
            f424543a.add("onMediaFileUploadProgess");
            f424543a.add("onGetA8KeyUrl");
            f424543a.add(pf1.r.f76415x24728b);
            f424543a.add("onGetMsgProofItems");
            f424543a.add("onNavigationBarRightButtonClick");
            f424543a.add("onBackgroundAudioStateChange");
            f424543a.add("onNetWorkChange");
            f424543a.add("onCustomGameMenuClicked");
            f424543a.add("onArticleReadingBtnClicked");
            f424543a.add("onRecordHistory");
            f424543a.add("onBeaconsInRange");
            f424543a.add("onPublishHaowanEnd");
            f424543a.add("onPublishHaowanProgress");
            f424543a.add("onMiniProgramData");
            f424543a.add("onUserGoBack");
            f424543a.add("onShareEmbedExcerptEvent");
        }
        return f424543a.contains(str);
    }
}
