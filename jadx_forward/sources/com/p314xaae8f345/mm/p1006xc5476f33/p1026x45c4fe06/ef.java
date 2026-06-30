package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

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

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, android.view.View view) {
        java.lang.Integer num = (java.lang.Integer) view.getTag(com.p314xaae8f345.mm.R.id.a09);
        if (num != null && ordinal() != num.intValue()) {
            throw new java.lang.IllegalStateException("Child has already been added with index " + num);
        }
        view.setTag(com.p314xaae8f345.mm.R.id.a09, java.lang.Integer.valueOf(ordinal()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = c11510xdd90c2f2.f156343s;
        int i17 = 0;
        if (qVar.getChildCount() != 0) {
            int childCount = qVar.getChildCount() - 1;
            while (true) {
                if (i17 <= childCount) {
                    int i18 = (i17 + childCount) >>> 1;
                    int intValue = ((java.lang.Integer) qVar.getChildAt(i18).getTag(com.p314xaae8f345.mm.R.id.a09)).intValue();
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

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, android.view.View view) {
        java.lang.Integer num = (java.lang.Integer) view.getTag(com.p314xaae8f345.mm.R.id.a09);
        if (num == null || ordinal() == num.intValue()) {
            view.setTag(com.p314xaae8f345.mm.R.id.a09, java.lang.Integer.valueOf(ordinal()));
            c11510xdd90c2f2.f156343s.removeView(view);
        } else {
            throw new java.lang.IllegalStateException("Child has already been added with index " + num);
        }
    }
}
