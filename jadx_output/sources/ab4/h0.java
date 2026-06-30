package ab4;

/* loaded from: classes4.dex */
public final class h0 extends ab4.d0 {
    public int F;
    public int G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f2840J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public float P;

    public static final ab4.h0 c(java.util.Map map, java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo$Companion");
        ab4.h0 h0Var = new ab4.h0();
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo$Companion");
        } else {
            try {
                int e17 = ca4.n0.e((java.lang.String) map.get(str.concat(".fontColorNormal")), 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFontColorNormal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                h0Var.F = e17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFontColorNormal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                int e18 = ca4.n0.e((java.lang.String) map.get(str.concat(".fontColorSpecial")), 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFontColorSpecial", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                h0Var.G = e18;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFontColorSpecial", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                java.lang.String str2 = (java.lang.String) map.get(str.concat(".unlockPrefix"));
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUnlockPrefix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                h0Var.H = str2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUnlockPrefix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                java.lang.String str4 = (java.lang.String) map.get(str.concat(".redundantPrefix"));
                if (str4 == null) {
                    str4 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRedundantPrefix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                h0Var.I = str4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRedundantPrefix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                java.lang.String str5 = (java.lang.String) map.get(str.concat(".collectedPrefix"));
                if (str5 == null) {
                    str5 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollectedPrefix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                h0Var.f2840J = str5;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollectedPrefix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                java.lang.String str6 = (java.lang.String) map.get(str.concat(".commonSuffix"));
                if (str6 == null) {
                    str6 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommonSuffix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                h0Var.K = str6;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommonSuffix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                java.lang.String str7 = (java.lang.String) map.get(str.concat(".specialPrefix"));
                if (str7 == null) {
                    str7 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSpecialPrefix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                h0Var.L = str7;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSpecialPrefix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                java.lang.String str8 = (java.lang.String) map.get(str.concat(".specialSuffix"));
                if (str8 == null) {
                    str8 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSpecialSuffix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                h0Var.M = str8;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSpecialSuffix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                java.lang.String str9 = (java.lang.String) map.get(str.concat(".allCollectedTitle"));
                if (str9 != null) {
                    str3 = str9;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAllCollectedTitle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                h0Var.N = str3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAllCollectedTitle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                float n17 = za4.z0.n(19.0d, 375);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                h0Var.P = n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("AdLandingPageComponentRandomPickCardTitleInfo", "parseFromXml exp is " + e19);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
        return h0Var;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFontColorNormal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
        int i17 = this.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFontColorNormal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
        return i17;
    }
}
