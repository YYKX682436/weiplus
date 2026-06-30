package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class va implements za4.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f252159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18004x5463467d f252160c;

    public va(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18004x5463467d activityC18004x5463467d, android.view.View view, android.content.Intent intent) {
        this.f252160c = activityC18004x5463467d;
        this.f252158a = view;
        this.f252159b = intent;
    }

    public int a(boolean z17, java.lang.String str) {
        android.content.Intent intent = this.f252159b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18004x5463467d activityC18004x5463467d = this.f252160c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getUxCanvasInfo, isSucc=");
        sb6.append(z17);
        sb6.append(", canvasId=, canvasId, xml.len=");
        sb6.append(str == null ? 0 : str.length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdNativeLandingPagesPreviewUI", sb6.toString());
        try {
            android.view.View view = this.f252158a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI$2", "callback", "(ZLjava/lang/String;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI$2", "callback", "(ZLjava/lang/String;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (android.text.TextUtils.isEmpty(str)) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18004x5463467d.f248211h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                boolean z18 = activityC18004x5463467d.f248213e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    boolean z19 = activityC18004x5463467d.f248214f;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    if (!z19) {
                        n54.i.d(false);
                    }
                }
            } else {
                intent.putExtra("sns_landing_pages_xml", str);
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18004x5463467d.f248211h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                boolean Z6 = activityC18004x5463467d.Z6(intent, str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                if (!Z6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdNativeLandingPagesPreviewUI", "protectOverSizeXml failed_3");
                    activityC18004x5463467d.finish();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$2");
                    return 0;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                activityC18004x5463467d.W6(intent, str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdNativeLandingPagesPreviewUI", "getUxCanvasInfo, exp=" + th6.toString());
        }
        activityC18004x5463467d.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$2");
        return 0;
    }
}
