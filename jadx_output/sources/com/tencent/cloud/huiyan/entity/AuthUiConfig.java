package com.tencent.cloud.huiyan.entity;

/* loaded from: classes14.dex */
public class AuthUiConfig {
    private java.lang.ref.WeakReference<android.content.Context> contextWeakReference;
    private com.tencent.cloud.huiyan.enums.VideoSize videoSize = com.tencent.cloud.huiyan.enums.VideoSize.SIZE_480P;
    private boolean isShowCountdown = true;
    private boolean isShowErrorDialog = true;
    private int authLayoutResId = -1;
    private int landAuthLayoutResId = -1;
    private int authWithLongCheck720LayoutResId = -1;
    private int feedBackErrorColor = 0;
    private int feedBackExtraTipColor = 0;
    private int feedBackTxtColor = 0;
    private int authCircleErrorColor = 0;
    private int authCircleCorrectColor = 0;
    private int authLayoutBgColor = 0;
    private int mainActivityThemeId = -1;
    private int statusBarColor = 0;
    private boolean isTransparentStatusBar = false;
    private int transparentStatusBarMoveHeight = 15;
    private boolean useDeepColorStatusBarIcon = false;
    private boolean isHideAvatarGuideFrame = false;
    private boolean isHideFrontCircleViewOnStart = false;
    private boolean isHideFrontCircleViewOnCheck = false;
    private boolean isHideFrontCircleViewOnReflect = false;
    private boolean keepAuthView = false;

    public int getAuthCircleCorrectColor() {
        return this.authCircleCorrectColor;
    }

    public int getAuthCircleErrorColor() {
        return this.authCircleErrorColor;
    }

    public int getAuthLayoutBgColor() {
        return this.authLayoutBgColor;
    }

    public int getAuthLayoutResId() {
        return this.authLayoutResId;
    }

    public int getAuthWithLongCheck720LayoutResId() {
        return this.authWithLongCheck720LayoutResId;
    }

    public int getFeedBackErrorColor() {
        return this.feedBackErrorColor;
    }

    public int getFeedBackExtraTipColor() {
        return this.feedBackExtraTipColor;
    }

    public int getFeedBackTxtColor() {
        return this.feedBackTxtColor;
    }

    public int getLandAuthLayoutResId() {
        return this.landAuthLayoutResId;
    }

    public int getMainActivityThemeId() {
        return this.mainActivityThemeId;
    }

    public android.content.Context getStartActivityContext() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.contextWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int getStatusBarColor() {
        return this.statusBarColor;
    }

    public int getTransparentStatusBarMoveHeight() {
        return this.transparentStatusBarMoveHeight;
    }

    public com.tencent.cloud.huiyan.enums.VideoSize getVideoSize() {
        return this.videoSize;
    }

    public boolean isHideAvatarGuideFrame() {
        return this.isHideAvatarGuideFrame;
    }

    public boolean isHideFrontCircleViewOnCheck() {
        return this.isHideFrontCircleViewOnCheck;
    }

    public boolean isHideFrontCircleViewOnReflect() {
        return this.isHideFrontCircleViewOnReflect;
    }

    public boolean isHideFrontCircleViewOnStart() {
        return this.isHideFrontCircleViewOnStart;
    }

    public boolean isKeepAuthView() {
        return this.keepAuthView;
    }

    public boolean isShowCountdown() {
        return this.isShowCountdown;
    }

    public boolean isShowErrorDialog() {
        return this.isShowErrorDialog;
    }

    public boolean isTransparentStatusBar() {
        return this.isTransparentStatusBar;
    }

    public boolean isUseDeepColorStatusBarIcon() {
        return this.useDeepColorStatusBarIcon;
    }

    public void setAuthCircleCorrectColor(int i17) {
        this.authCircleCorrectColor = i17;
    }

    public void setAuthCircleErrorColor(int i17) {
        this.authCircleErrorColor = i17;
    }

    public void setAuthLayoutBgColor(int i17) {
        this.authLayoutBgColor = i17;
    }

    public void setAuthLayoutResId(int i17) {
        this.authLayoutResId = i17;
    }

    public void setAuthWithLongCheck720LayoutResId(int i17) {
        this.authWithLongCheck720LayoutResId = i17;
    }

    public void setFeedBackErrorColor(int i17) {
        this.feedBackErrorColor = i17;
    }

    public void setFeedBackExtraTipColor(int i17) {
        this.feedBackExtraTipColor = i17;
    }

    public void setFeedBackTxtColor(int i17) {
        this.feedBackTxtColor = i17;
    }

    public void setHideAvatarGuideFrame(boolean z17) {
        this.isHideAvatarGuideFrame = z17;
    }

    public void setHideFrontCircleViewOnCheck(boolean z17) {
        this.isHideFrontCircleViewOnCheck = z17;
    }

    public void setHideFrontCircleViewOnReflect(boolean z17) {
        this.isHideFrontCircleViewOnReflect = z17;
    }

    public void setHideFrontCircleViewOnStart(boolean z17) {
        this.isHideFrontCircleViewOnStart = z17;
    }

    public void setKeepAuthView(boolean z17) {
        this.keepAuthView = z17;
    }

    public void setLandAuthLayoutResId(int i17) {
        this.landAuthLayoutResId = i17;
    }

    public void setMainActivityThemeId(int i17) {
        this.mainActivityThemeId = i17;
    }

    public void setShowCountdown(boolean z17) {
        this.isShowCountdown = z17;
    }

    public void setShowErrorDialog(boolean z17) {
        this.isShowErrorDialog = z17;
    }

    public void setStartActivityContext(android.content.Context context) {
        this.contextWeakReference = new java.lang.ref.WeakReference<>(context);
    }

    public void setStatusBarColor(int i17) {
        this.statusBarColor = i17;
    }

    public void setTransparentStatusBar(boolean z17) {
        this.isTransparentStatusBar = z17;
    }

    public void setTransparentStatusBarMoveHeight(int i17) {
        this.transparentStatusBarMoveHeight = i17;
    }

    public void setUseDeepColorStatusBarIcon(boolean z17) {
        this.useDeepColorStatusBarIcon = z17;
    }

    public void setVideoSize(com.tencent.cloud.huiyan.enums.VideoSize videoSize) {
        this.videoSize = videoSize;
    }
}
