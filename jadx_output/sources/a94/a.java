package a94;

/* loaded from: classes4.dex */
public class a implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f2430d;

    /* renamed from: e, reason: collision with root package name */
    public int f2431e;

    /* renamed from: f, reason: collision with root package name */
    public int f2432f;

    /* renamed from: g, reason: collision with root package name */
    public int f2433g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f2434h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f2435i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f2436m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f2437n;

    /* renamed from: o, reason: collision with root package name */
    public int f2438o;

    /* renamed from: p, reason: collision with root package name */
    public int f2439p;

    @za4.k1(resType = 3)
    public java.lang.String simpleTransitionAnimationUrl;

    @za4.k1(resType = 3)
    public java.lang.String themePAGUrl;

    public static a94.a a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        if (map.containsKey(str)) {
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".shakeStartTime"), 0);
            int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".shakeEndTime"), 0);
            int D13 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".coverStartTime"), 0);
            int D14 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".coverEndTime"), 0);
            if (D13 == 0) {
                D13 = D1;
            }
            if (D14 == 0) {
                D14 = D12;
            }
            if (D1 >= 0 && D12 > D1 && D14 >= D13 && D13 >= D1 && D14 <= D12) {
                java.lang.String str2 = (java.lang.String) map.get(str + ".title");
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = (java.lang.String) map.get(str + ".desc");
                if (str3 == null) {
                    str3 = "";
                }
                a94.a aVar = new a94.a();
                aVar.f2430d = D1;
                aVar.f2431e = D12;
                aVar.f2432f = D13;
                aVar.f2433g = D14;
                aVar.f2434h = str2;
                aVar.f2435i = str3;
                java.lang.String str4 = (java.lang.String) map.get(str + ".simpleTransitionAnimationUrl");
                if (str4 == null) {
                    str4 = "";
                }
                aVar.simpleTransitionAnimationUrl = str4;
                java.lang.String str5 = (java.lang.String) map.get(str + ".simpleTransitionAnimationMD5");
                if (str5 == null) {
                    str5 = "";
                }
                aVar.f2436m = str5;
                java.lang.String str6 = (java.lang.String) map.get(str + ".themePAGUrl");
                if (str6 == null) {
                    str6 = "";
                }
                aVar.themePAGUrl = str6;
                java.lang.String str7 = (java.lang.String) map.get(str + ".themePAGMD5");
                aVar.f2437n = str7 != null ? str7 : "";
                aVar.f2438o = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".triggerGForceMin"), 0);
                aVar.f2439p = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".triggerGForceMax"), 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
                return aVar;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        return null;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        java.lang.String str = "{shakeStartTime=" + this.f2430d + ", shakeEndTime=" + this.f2431e + ", coverStartTime=" + this.f2432f + ", coverEndTime=" + this.f2433g + ", title=" + this.f2434h + ", desc=" + this.f2435i + ", simpleTransitionAnimationUrl=" + this.simpleTransitionAnimationUrl + ", simpleTransitionAnimationMD5=" + this.f2436m + ", themePAGUrl=" + this.themePAGUrl + ", themePAGMD5=" + this.f2437n + '}';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        return str;
    }
}
