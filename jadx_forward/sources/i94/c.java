package i94;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final h94.a f371296a;

    public c(h94.a foldAdInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(foldAdInfo, "foldAdInfo");
        this.f371296a = foldAdInfo;
    }

    public final android.content.Intent a() {
        r45.gr0 gr0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
        h94.a aVar = this.f371296a;
        r45.d43 b17 = aVar.b();
        java.lang.String str = (b17 == null || (gr0Var = b17.f453615r) == null) ? null : gr0Var.f457025d;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WsFoldAdFeedbackData", "there is feedback item, but no url!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("KPublisherId", "sns_" + aVar.c());
        intent.putExtra("prePublishId", "sns_" + aVar.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
        return intent;
    }
}
