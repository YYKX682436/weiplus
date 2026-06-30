package com.tencent.mm.accessibility.feature;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"CheckIntervalTime", "", "DefaultWhiteServiceList", "", "", "ExptKey_WhiteServiceList", "TAG", "feature-autoaccessibility_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccExptServiceKt {
    private static final long CheckIntervalTime = 5000;
    private static final java.util.List<java.lang.String> DefaultWhiteServiceList = kz5.c0.k("com.google.android.accessibility.selecttospeak.SelectToSpeakService", "com.dianming.phoneapp.MyAccessibilityService");
    private static final java.lang.String ExptKey_WhiteServiceList = "clicfg_acc_white_service_list";
    private static final java.lang.String TAG = "MicroMsg.AccExptService";

    public static final /* synthetic */ java.util.List access$getDefaultWhiteServiceList$p() {
        return DefaultWhiteServiceList;
    }
}
