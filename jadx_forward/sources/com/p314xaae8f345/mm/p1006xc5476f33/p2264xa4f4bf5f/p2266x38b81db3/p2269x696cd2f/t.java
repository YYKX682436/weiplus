package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f254900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d f254901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f254902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.u f254903g;

    public t(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d dVar, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.u uVar) {
        this.f254900d = s0Var;
        this.f254901e = dVar;
        this.f254902f = view;
        this.f254903g = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        int i18;
        android.app.Activity activity;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareSameTopicFriendItemConvert$onBindViewHolder$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
        android.content.Context context = this.f254900d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d dVar = this.f254901e;
        java.lang.String str = dVar.f254798e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.u uVar = this.f254903g;
        android.content.Context context2 = uVar.f254913n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd kdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getLikeList] likeList = ");
        java.util.ArrayList arrayList2 = kdVar.f255570d;
        sb6.append(arrayList2);
        java.lang.String sb7 = sb6.toString();
        int i19 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusLikeUIC", sb7, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((java.lang.String) it.next());
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255012p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o.a(context, str);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.class);
        intent.putExtra("KEY_USER_NAME", str);
        intent.putExtra("KEY_FROM_SCENE", "SCENE_DEFAULT");
        if (!bi4.v1.k() || (view2 = this.f254902f) == null) {
            i17 = -1;
            i18 = -1;
        } else {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            i17 = iArr[0];
            i18 = iArr[1];
        }
        intent.putExtra("KEY_START_CARD_ANIM_X_OFFSET", i17);
        intent.putExtra("KEY_START_CARD_ANIM_Y_OFFSET", i18);
        intent.putExtra("KEY_LIKE_LIST_STATUS_ID", arrayList3);
        intent.putExtra("KEY_EXIT_CARD_ANIM_STYLE", "VALUE_EXIT_CARD_ANIM_CARD_STYLE");
        boolean z17 = context instanceof android.app.Activity;
        android.app.Activity activity2 = z17 ? (android.app.Activity) context : null;
        if (activity2 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList4.add(1002);
            arrayList4.add(intent);
            java.util.Collections.reverse(arrayList4);
            yj0.a.k(activity2, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$Companion", "startForResult", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Landroid/view/View;Ljava/lang/String;Ljava/util/ArrayList;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        if (i17 == -1 || i18 == -1) {
            activity = z17 ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            }
        } else {
            activity = z17 ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
            }
        }
        qj4.s.m(qj4.s.f445491a, uVar.f254913n, 30L, null, dVar.f254800g, 0L, 0L, 0L, 0L, null, null, 12L, 1012, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareSameTopicFriendItemConvert$onBindViewHolder$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
