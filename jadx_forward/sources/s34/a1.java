package s34;

/* loaded from: classes4.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public int f484097a;

    /* renamed from: b, reason: collision with root package name */
    public int f484098b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f484099c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f484100d;

    /* renamed from: e, reason: collision with root package name */
    public long f484101e;

    /* renamed from: f, reason: collision with root package name */
    public s34.z0 f484102f;

    /* renamed from: overSlideJumpInfo */
    @za4.k1(m178630x415c6bfa = 5)
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f76694x80bfd259;

    /* renamed from: resInfoList */
    @za4.l1
    public java.util.List<s34.x0> f76695x5800ff2c;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        if (r4 <= 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r2.f484098b >= 6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dd, code lost:
    
        if (r9 >= r2.f484097a) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        r4 = r2.f76695x5800ff2c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e9, code lost:
    
        r2.f76695x5800ff2c.add(r4);
        r2.f484098b++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        r9 = r9 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s34.a1 b(java.util.Map r7, java.lang.String r8, int r9) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s34.a1.b(java.util.Map, java.lang.String, int):s34.a1");
    }

    public static java.util.List c(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseAdSlideFullCardItemInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        java.lang.String str2 = str + ".sliderCardItem";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str2);
            java.lang.String str3 = "";
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
            s34.x0 x0Var = null;
            if (a84.b0.c(map)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
            } else {
                java.lang.String str4 = (java.lang.String) map.get(sb7 + ".media.id");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str4 == null) {
                    str4 = "";
                }
                if (android.text.TextUtils.isEmpty(str4)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
                } else {
                    try {
                        s34.x0 x0Var2 = new s34.x0();
                        java.lang.String str5 = (java.lang.String) map.get(sb7 + ".title");
                        if (str5 == null) {
                            str5 = "";
                        }
                        x0Var2.f484357a = str5;
                        java.lang.String str6 = (java.lang.String) map.get(sb7 + ".desc");
                        if (str6 == null) {
                            str6 = "";
                        }
                        x0Var2.f484358b = str6;
                        x0Var2.f484359c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(sb7 + ".markMaxAlpha"));
                        r45.jj4 c17 = s34.x0.c(map, sb7 + ".media", i17);
                        x0Var2.f484361e = c17;
                        x0Var2.f484360d = c17.f459389e == 6 ? 1 : 0;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, sb7 + ".clickActionInfo");
                        x0Var2.f76730xf7a0a3ac = f17;
                        f17.f244102a = 3;
                        x0Var2.f76729x155a1700 = s34.x0.b(map, sb7 + ".buttonInfo");
                        java.lang.String str7 = (java.lang.String) map.get(sb7 + ".frontBorderImage");
                        if (str7 == null) {
                            str7 = "";
                        }
                        x0Var2.f76731x5a9c86a6 = str7;
                        java.lang.String str8 = (java.lang.String) map.get(sb7 + ".backBorderImage");
                        if (str8 != null) {
                            str3 = str8;
                        }
                        x0Var2.f76728xfdc65d28 = str3;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
                        x0Var = x0Var2;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdSlideFullCardItemInfo", "parse AdSlideFullCardItemInfo error " + th6.getMessage());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
                    }
                }
            }
            if (x0Var == null) {
                break;
            }
            arrayList.add(x0Var);
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseAdSlideFullCardItemInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        return arrayList;
    }

    public int a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdjustPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        int i18 = this.f484097a;
        if (i18 <= 4) {
            i17 %= i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdjustPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        return i17;
    }
}
