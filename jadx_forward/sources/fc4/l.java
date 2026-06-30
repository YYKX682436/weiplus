package fc4;

/* loaded from: classes4.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc4.p f342714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f342715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ib6 f342716f;

    public l(fc4.p pVar, byte[] bArr, r45.ib6 ib6Var) {
        this.f342714d = pVar;
        this.f342715e = bArr;
        this.f342716f = ib6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int Ni;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealCutSameJumpClick$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/flexible/FlexibleSameStyleUIC$dealCutSameJumpClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        fc4.p pVar = this.f342714d;
        int i17 = pVar.f342726e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        if (i17 == 0) {
            dx1.g.f326022a.i("SnsPublishProcess", "fromPage", 1);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
            int i18 = pVar.f342726e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
            if (i18 == 1) {
                dx1.g.f326022a.i("SnsPublishProcess", "fromPage", 4);
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("album_template_info", this.f342715e);
        intent.putExtra("key_sns_publish_template", true);
        intent.putExtra("key_filter_hdr_video", true);
        uy0.h hVar = (uy0.h) i95.n0.c(uy0.h.class);
        r45.ib6 ib6Var = this.f342716f;
        java.lang.String templateId = ib6Var.f458443e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(templateId, "templateId");
        ((ez0.i) hVar).getClass();
        nz0.o.f423063a.e(templateId, 4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPublish$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        java.lang.String str = pVar.f342727f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPublish$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        s0Var.c(str, 2, ib6Var.f458443e, ib6Var.f458444f);
        if (android.text.TextUtils.isEmpty(ib6Var.f458448m)) {
            Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + Ni);
        } else {
            Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_publish_ai_template_image_litmit, 9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishAITemplateImageLimit: " + Ni);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(pVar.m158354x19263085(), 4098, Ni, 4, 3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ws.a(), intent);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleSameStyleUIC$dealCutSameJumpClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealCutSameJumpClick$1");
    }
}
