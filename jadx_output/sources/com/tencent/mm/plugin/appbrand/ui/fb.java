package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class fb implements com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI f89713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89714b;

    public fb(com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI, java.lang.String str) {
        this.f89713a = appBrandUserProfileAuthorizeUI;
        this.f89714b = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public void a(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m action) {
        kotlin.jvm.internal.o.g(action, "action");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public void b(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI = this.f89713a;
        if (appBrandUserProfileAuthorizeUI.f89460e == null) {
            appBrandUserProfileAuthorizeUI.f89460e = new java.util.ArrayList(items);
        }
        ((java.util.ArrayList) appBrandUserProfileAuthorizeUI.f89459d).clear();
        ((java.util.ArrayList) appBrandUserProfileAuthorizeUI.f89459d).addAll(items);
        androidx.recyclerview.widget.RecyclerView recyclerView = appBrandUserProfileAuthorizeUI.f89467o;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("userInfoList");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public void c(boolean z17, boolean z18, java.lang.String limitWording, java.lang.String avatarWording, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o goAddUserPage) {
        kotlin.jvm.internal.o.g(limitWording, "limitWording");
        kotlin.jvm.internal.o.g(avatarWording, "avatarWording");
        kotlin.jvm.internal.o.g(goAddUserPage, "goAddUserPage");
        com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI = this.f89713a;
        android.widget.TextView textView = (android.widget.TextView) appBrandUserProfileAuthorizeUI.findViewById(com.tencent.mm.R.id.ouy);
        android.view.View findViewById = appBrandUserProfileAuthorizeUI.findViewById(com.tencent.mm.R.id.cm_);
        if (!z17 && !z18) {
            textView.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserProfileAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserProfileAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (z17) {
            textView.setVisibility(8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserProfileAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserProfileAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView.setVisibility(0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserProfileAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserProfileAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/IUserInfoListOperationController$WxaUserInfoGoAddUserPageDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        findViewById.setOnClickListener(new com.tencent.mm.plugin.appbrand.ui.eb(goAddUserPage, appBrandUserProfileAuthorizeUI, this.f89714b));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public java.lang.String getAppId() {
        return this.f89714b;
    }
}
