package qd4;

/* loaded from: classes15.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd4.r f443407d;

    public n(qd4.r rVar) {
        this.f443407d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Object child;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qd4.q qVar = (view.getTag() == null || !(view.getTag() instanceof qd4.q)) ? null : (qd4.q) view.getTag();
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        qd4.r rVar = this.f443407d;
        qd4.p pVar = rVar.f443434v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (pVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            qd4.p pVar2 = rVar.f443434v;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            qd4.d dVar = (qd4.d) pVar2;
            dVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$1");
            int i17 = qVar.f443414a;
            int i18 = qVar.f443415b;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.D;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1 = dVar.f443395a;
            activityC18357x320c26e1.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoEditTag", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            qd4.r rVar2 = activityC18357x320c26e1.f251082p;
            if (rVar2 != null && (child = rVar2.getChild(i17, i18)) != null && (child instanceof java.lang.String)) {
                java.lang.String str = (java.lang.String) child;
                java.lang.String e17 = ((b93.b) c93.a.a()).e(str);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("label_id", e17);
                intent.putExtra("label_name", str);
                intent.putExtra("is_show_delete", false);
                j45.l.n(activityC18357x320c26e1.mo55332x76847179(), "label", ".ui.ContactLabelEditUI", intent, 4002);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoEditTag", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$1");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter$1");
    }
}
