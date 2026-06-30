package n74;

/* loaded from: classes4.dex */
public abstract class v {
    public static final boolean a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, int i17, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
            return false;
        }
        if (c17702x544f64e9 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = c17702x544f64e9.M;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        boolean z18 = c17702x544f64e9.f244133p0 == 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doJumpContact, userName is ");
        sb6.append(str);
        sb6.append(", openVideoTab is ");
        sb6.append(z18);
        sb6.append(", source is ");
        sb6.append(i17);
        sb6.append(", snsAdClick clickPos is ");
        sb6.append(c11137xb05b06ad != null ? java.lang.Integer.valueOf(c11137xb05b06ad.f153002g) : null);
        sb6.append(", snsAdClick clickAction is ");
        sb6.append(c11137xb05b06ad != null ? java.lang.Integer.valueOf(c11137xb05b06ad.f153003h) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpContactHelper", sb6.toString());
        intent.putExtra("Contact_User", str);
        intent.putExtra("KSnsAdTag", c11137xb05b06ad);
        intent.putExtra("Contact_Scene", 78);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", i17 == 0 ? 6 : 1);
        if (z18) {
            intent.putExtra("biz_profile_tab_type", 1);
        }
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
        return true;
    }
}
