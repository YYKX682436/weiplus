package qs;

/* loaded from: classes15.dex */
public class s implements com.p314xaae8f345.mm.app.v6 {
    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityCreated */
    public void mo9958x78cb4fa(android.app.Activity activity, android.os.Bundle bundle) {
        boolean z17;
        java.lang.String[] split;
        z71.l.a().getClass();
        java.util.LinkedList linkedList = y52.a.a().f458887d;
        if (linkedList == null || linkedList.size() == 0) {
            return;
        }
        if (activity.getClass().getName().endsWith(((r45.jw3) linkedList.get(linkedList.size() - 1)).f459692d)) {
            linkedList.remove(linkedList.size() - 1);
        }
        if (linkedList.size() == 0) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            r45.jw3 jw3Var = (r45.jw3) it.next();
            if (jw3Var != null) {
                if ("CropImageNewUI;MiniQbCallBackUI;MiniQBReaderUI;NfcWebViewUI;WNNoteFavWebViewUI;WNNoteMsgWebViewUI;SnsAdNativeLandingPagesUI;VideoFullScreenActivity;EmojiCaptureUI;StickerPreviewUI;AppBrandNearbyWebViewUI;AppBrandSOSUI;ShortCutPermissionDetailUI;GameWebViewUI;GameTabWebUI;GameTabWebUI1;GameTabWebUI2;LuggageGameWebViewUI;TmplWebViewToolUI;DownloadDetailUI;WebViewUI;CustomSchemeEntryWebViewUI;WebViewTestUI;TransparentWebViewUI;ContactQZoneWebView;QRCodeIntroductionWebViewUI;GameChattingRoomWebViewUI;H5GameWebViewUI;EmojiStoreSearchWebViewUI;ToolsRecordUI;SightCaptureUITest;FaceDetectUI;ReadMailUI;MailWebViewUI;SightCaptureUI;SightSettingsUI;MMSightEditUI;MMNewPhotoEditUI;VideoSegmentUI;VideoCompressUI;AppBrandSearchUI;LuggageGameUI;LuggageGameHalfWebViewUI;GameWebTabUI;FTSWebViewUI;FTSSearchTabWebViewUI;FTSSOSHomeWebViewUI;FTSSOSMoreWebViewUI;SosWebViewUI;".contains(jw3Var.f459692d + ";")) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17 || (split = activity.getClass().getName().split("\\.")) == null || split.length == 0) {
            return;
        }
        java.lang.String str = split[split.length - 1] + ";";
        if (com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1022xc56d9687.a.f156188e.contains(str) || str.contains("LauncherUI") || str.contains("SnsTimeLineUI")) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1022xc56d9687.a.f156188e += str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("ai_is_tools_or_mp_entry", com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1022xc56d9687.a.f156188e);
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityDestroyed */
    public void mo9959xa9f48fab(android.app.Activity activity) {
        z71.l.a().getClass();
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPaused */
    public void mo27324x99a658dc(android.app.Activity activity) {
        z71.l.a().getClass();
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityResumed */
    public void mo27339xba973e9(android.app.Activity activity) {
        z71.l.a().getClass();
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivitySaveInstanceState */
    public void mo27340x634d9e11(android.app.Activity activity, android.os.Bundle bundle) {
        z71.l.a().getClass();
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityStarted */
    public void mo27341x59297693(android.app.Activity activity) {
        z71.l.a().getClass();
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityStopped */
    public void mo27342x59edc7df(android.app.Activity activity) {
        z71.l.a().getClass();
    }
}
