package l94;

/* loaded from: classes4.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d43 f398893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h94.a f398894e;

    public h(r45.d43 d43Var, h94.a aVar) {
        this.f398893d = d43Var;
        this.f398894e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBottomComponent$onBindData$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldAdCardBottomComponent$onBindData$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.d43 d43Var = this.f398893d;
        java.util.LinkedList click_action_info = d43Var.f453605e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(click_action_info, "click_action_info");
        if (!click_action_info.isEmpty()) {
            l94.b bVar = l94.e.f398873e;
            l94.m mVar = l94.m.f398913f;
            java.lang.String d17 = this.f398894e.d();
            r45.x30 x30Var = d43Var.f453613p;
            if (x30Var == null) {
                x30Var = (r45.x30) d43Var.f453605e.get(0);
            }
            bVar.a(mVar, 184, d17, x30Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldAdCardBottomComponent$onBindData$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBottomComponent$onBindData$5");
    }
}
