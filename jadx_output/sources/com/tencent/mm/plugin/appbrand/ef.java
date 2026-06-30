package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public enum ef {
    SnapshotWebView,
    AppBrandPageContainer,
    PipContainer,
    LegacyDialogContainer,
    UpperDialogContainer,
    GlobalNativeWidgetContainerView,
    RemoteDebugFloatView,
    AuthorizeDialogContainer,
    LoadingSplash,
    DirectGameCoverViewContainer;

    public void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, android.view.View view) {
        java.lang.Integer num = (java.lang.Integer) view.getTag(com.tencent.mm.R.id.a09);
        if (num != null && ordinal() != num.intValue()) {
            throw new java.lang.IllegalStateException("Child has already been added with index " + num);
        }
        view.setTag(com.tencent.mm.R.id.a09, java.lang.Integer.valueOf(ordinal()));
        com.tencent.mm.plugin.appbrand.widget.q qVar = appBrandRuntime.f74810s;
        int i17 = 0;
        if (qVar.getChildCount() != 0) {
            int childCount = qVar.getChildCount() - 1;
            while (true) {
                if (i17 <= childCount) {
                    int i18 = (i17 + childCount) >>> 1;
                    int intValue = ((java.lang.Integer) qVar.getChildAt(i18).getTag(com.tencent.mm.R.id.a09)).intValue();
                    if (intValue >= ordinal()) {
                        if (intValue <= ordinal()) {
                            i17 = i18;
                            break;
                        }
                        childCount = i18 - 1;
                    } else {
                        i17 = i18 + 1;
                    }
                } else {
                    i17 = ~i17;
                    if (i17 < 0) {
                        i17 = ~i17;
                    }
                }
            }
        }
        if (view.getParent() == qVar && i17 >= qVar.getChildCount() - 1) {
            qVar.bringChildToFront(view);
            return;
        }
        if (view.getParent() != null) {
            ((android.view.ViewGroup) view.getParent()).removeView(view);
        }
        qVar.addView(view, i17);
    }

    public void b(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, android.view.View view) {
        java.lang.Integer num = (java.lang.Integer) view.getTag(com.tencent.mm.R.id.a09);
        if (num == null || ordinal() == num.intValue()) {
            view.setTag(com.tencent.mm.R.id.a09, java.lang.Integer.valueOf(ordinal()));
            appBrandRuntime.f74810s.removeView(view);
        } else {
            throw new java.lang.IllegalStateException("Child has already been added with index " + num);
        }
    }
}
