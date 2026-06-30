package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class sa implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12691x888e5f7e f171742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171743b;

    public sa(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12691x888e5f7e activityC12691x888e5f7e, java.lang.String str) {
        this.f171742a = activityC12691x888e5f7e;
        this.f171743b = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    public void b(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12691x888e5f7e activityC12691x888e5f7e = this.f171742a;
        if (activityC12691x888e5f7e.f170982e == null) {
            activityC12691x888e5f7e.f170982e = new java.util.ArrayList(items);
        }
        ((java.util.ArrayList) activityC12691x888e5f7e.f170981d).clear();
        ((java.util.ArrayList) activityC12691x888e5f7e.f170981d).addAll(items);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC12691x888e5f7e.f170989o;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userInfoList");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    public void c(boolean z17, boolean z18, java.lang.String limitWording, java.lang.String avatarWording, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.o goAddUserPage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(limitWording, "limitWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarWording, "avatarWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(goAddUserPage, "goAddUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12691x888e5f7e activityC12691x888e5f7e = this.f171742a;
        android.widget.TextView textView = (android.widget.TextView) activityC12691x888e5f7e.findViewById(com.p314xaae8f345.mm.R.id.ouy);
        android.view.View findViewById = activityC12691x888e5f7e.findViewById(com.p314xaae8f345.mm.R.id.cm_);
        if (!z17 && !z18) {
            textView.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (z17) {
            textView.setVisibility(8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView.setVisibility(0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ra(goAddUserPage, activityC12691x888e5f7e, this.f171743b));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    /* renamed from: getAppId */
    public java.lang.String mo50593x74292566() {
        return this.f171743b;
    }
}
