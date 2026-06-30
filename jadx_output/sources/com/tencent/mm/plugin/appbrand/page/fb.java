package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public interface fb extends com.tencent.mm.plugin.appbrand.jsruntime.t, pq5.a {
    default boolean A() {
        return false;
    }

    void E(int i17, long j17);

    void N(int i17, int i18);

    void b();

    boolean b0();

    void c();

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    void destroy();

    void e0(java.lang.Runnable runnable);

    android.graphics.Bitmap f();

    void g0(java.lang.String str, java.lang.String str2);

    int getContentHeight();

    android.view.View getContentView();

    xi1.m getFullscreenImpl();

    int getHeight();

    default com.tencent.mm.plugin.appbrand.page.v5 getPageView() {
        return null;
    }

    java.lang.String getUserAgentString();

    int getWebScrollX();

    int getWebScrollY();

    int getWidth();

    android.view.View getWrapperView();

    void i(android.content.Context context);

    void n(java.lang.String str, com.tencent.mm.plugin.appbrand.page.db dbVar);

    void o0();

    boolean p0();

    void setAppBrandInfo(java.util.Map map);

    default void setAppBrandWebViewClient(com.tencent.mm.plugin.appbrand.page.x9 x9Var) {
    }

    default void setAppBrandWebViewContentsSizeLogEnabled(boolean z17) {
    }

    void setBackgroundColor(int i17);

    default void setDisableContextMenuItems(int i17) {
    }

    void setFullscreenImpl(xi1.m mVar);

    void setOnScrollChangedListener(com.tencent.mm.plugin.appbrand.page.ma maVar);

    void setOnTrimListener(com.tencent.mm.plugin.appbrand.page.ka kaVar);

    void setVerticalScrollBarEnabled(boolean z17);

    void setWebViewLayoutListener(com.tencent.mm.plugin.appbrand.page.ja jaVar);

    void setXWebKeyboardImpl(com.tencent.mm.plugin.appbrand.page.oa oaVar);

    boolean w();
}
