package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class o00 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.va {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f216939d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f216940e;

    /* renamed from: f, reason: collision with root package name */
    public in5.s0 f216941f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216939d = "Finder.FinderSelfReadClickGuideUIC";
        this.f216940e = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6(in5.s0 r27, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00.O6(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean):void");
    }

    public final void P6() {
        android.view.View p17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f216939d, "unFocus");
        in5.s0 s0Var = this.f216941f;
        if (s0Var != null && (p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f566496rp5)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "dismissReadClickGuideTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "dismissReadClickGuideTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f216941f = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f216939d = "Finder.FinderSelfReadClickGuideUIC";
        this.f216940e = -1L;
    }
}
