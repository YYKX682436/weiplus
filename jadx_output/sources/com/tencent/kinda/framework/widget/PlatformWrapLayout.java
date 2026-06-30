package com.tencent.kinda.framework.widget;

/* loaded from: classes15.dex */
public class PlatformWrapLayout extends com.tencent.kinda.framework.widget.base.MMKViewLayout {
    public PlatformWrapLayout(com.facebook.yoga.android.YogaLayout yogaLayout) {
        setView(yogaLayout);
    }

    private java.lang.Object unwrapProxyObj(java.lang.Object obj) {
        if (!(obj instanceof java.lang.reflect.Proxy)) {
            return obj;
        }
        try {
            java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
            return invocationHandler instanceof com.tencent.kinda.framework.animate.KindaAnimatorViewProxy ? ((com.tencent.kinda.framework.animate.KindaAnimatorViewProxy) invocationHandler).getTarget() : obj;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKViewLayout, com.tencent.kinda.gen.KViewLayout
    public void addView(com.tencent.kinda.gen.KView kView) {
        java.lang.Object unwrapProxyObj = unwrapProxyObj(kView);
        com.tencent.mars.xlog.Log.i("MMKViewLayout", "PlatformWrapLayout addView: %s %s", kView, unwrapProxyObj);
        if (unwrapProxyObj != null) {
            kView = (com.tencent.kinda.gen.KView) unwrapProxyObj;
        }
        super.addView(kView);
    }
}
