package s34;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f484103a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484104b;

    public static s34.b a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
            return null;
        }
        try {
            java.lang.String str2 = (java.lang.String) map.get(str + ".finderEncryptedTopicId");
            java.lang.String str3 = (java.lang.String) map.get(str + ".finderTopicName");
            if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
                s34.b bVar = new s34.b();
                bVar.f484103a = str2;
                bVar.f484104b = str3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
                return bVar;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
            return null;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
            return null;
        }
    }
}
