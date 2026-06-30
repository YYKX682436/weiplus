package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* renamed from: com.tencent.mm.plugin.finder.view.do, reason: invalid class name */
/* loaded from: classes10.dex */
public final class Cdo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f213448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f213449g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f213450h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213451i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f213452m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f213453n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f213454o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213455p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213456q;

    public Cdo(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, int i27, int i28, yz5.l lVar, android.view.View view, android.view.View view2) {
        this.f213446d = str;
        this.f213447e = str2;
        this.f213448f = i17;
        this.f213449g = i18;
        this.f213450h = i19;
        this.f213451i = str3;
        this.f213452m = i27;
        this.f213453n = i28;
        this.f213454o = lVar;
        this.f213455p = view;
        this.f213456q = view2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String username = this.f213446d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "$username");
        h73.e.d(bundle, "Username", username);
        java.lang.String wxUsername = this.f213447e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wxUsername, "$wxUsername");
        h73.e.d(bundle, "WxUserName", wxUsername);
        h73.e.c(bundle, "isShieldHisLike", this.f213448f);
        h73.e.c(bundle, "isShieldMyLike", this.f213449g);
        h73.e.c(bundle, "FromScene_WXPROFILE", this.f213450h);
        java.lang.String sessionId = this.f213451i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sessionId, "$sessionId");
        h73.e.d(bundle, "SessionId", sessionId);
        h73.e.c(bundle, "isNotRec", this.f213452m);
        h73.e.c(bundle, "isBlackList", this.f213453n);
        android.view.View view2 = this.f213455p;
        yz5.l lVar = this.f213454o;
        if (lVar != null) {
            if (view2 != null) {
                view2.callOnClick();
            }
            android.content.Intent intent = new android.content.Intent();
            intent.replaceExtras(bundle);
            lVar.mo146xb9724478(intent);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view2 != null) {
            view2.callOnClick();
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.replaceExtras(bundle);
        android.view.View view3 = this.f213456q;
        intent2.setClass(view3.getContext(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14119xff3e467.class);
        android.content.Context context = view3.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
