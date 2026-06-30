package wd4;

/* loaded from: classes.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f526441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f f526442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f526443f;

    public g2(android.view.View view, long j17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f, int i17) {
        this.f526441d = view;
        this.f526442e = dialogC18384xa272e02f;
        this.f526443f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f526441d;
        view2.setClickable(false);
        view2.postDelayed(new wd4.f2(view2), 1000L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f = this.f526442e;
        wd4.t0 a17 = ((wd4.s0) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.K(dialogC18384xa272e02f).get(this.f526443f)).a();
        if (a17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getId", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getId", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            str = java.lang.Integer.valueOf(a17.f526560a).toString();
        } else {
            str = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", "showLabelDetailDialog:".concat(str));
            m80.j jVar = (m80.j) i95.n0.c(m80.j.class);
            android.content.Context context = dialogC18384xa272e02f.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((l80.k) jVar).getClass();
            new f93.p5(context, str).show();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1");
    }
}
