package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class z1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207524a;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160) {
        this.f207524a = activityC14945x8c20f160;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q4
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207524a;
        if (i17 != 0) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = activityC14945x8c20f160.f207080t;
            if (c22482x50bddb92 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c22482x50bddb92.m80997xdc5215a6().m80966xdb574fcd().getText().toString())) {
                return;
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = activityC14945x8c20f160.N;
            if (c22801x87cbdc00 != null) {
                c22801x87cbdc00.setVisibility(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
        }
        android.view.View view = activityC14945x8c20f160.R;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = activityC14945x8c20f160.Q;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = activityC14945x8c20f160.N;
        if (c22801x87cbdc002 != null) {
            c22801x87cbdc002.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
    }
}
