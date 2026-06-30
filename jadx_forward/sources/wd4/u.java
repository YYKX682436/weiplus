package wd4;

/* loaded from: classes.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f526568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd4.w f526569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f526570f;

    public u(android.view.View view, long j17, wd4.w wVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f526568d = view;
        this.f526569e = wVar;
        this.f526570f = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/sheet/ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f526568d;
        view2.setClickable(false);
        view2.postDelayed(new wd4.t(view2), 1000L);
        java.lang.String d17 = this.f526570f.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        wd4.w wVar = this.f526569e;
        wVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToUserProfileUI", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        android.content.Context context = wVar.f526581d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", d17);
        intent.putExtra("Contact_Scene", 0);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 15);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToUserProfileUI", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/sheet/ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1");
    }
}
