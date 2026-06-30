package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c f191598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13934x1991c070 f191599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13934x1991c070 activityC13934x1991c070) {
        super(0);
        this.f191598d = c13877xf5f46f3c;
        this.f191599e = activityC13934x1991c070;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        if (!this.f191598d.f189061g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13934x1991c070 activityC13934x1991c070 = this.f191599e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h hVar = activityC13934x1991c070.f190742y;
            if (hVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x = hVar.o().getF294968x();
            if (f294968x != null && (textView2 = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h hVar2 = activityC13934x1991c070.f190742y;
            if (hVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x2 = hVar2.o().getF294968x();
            if (f294968x2 != null && (textView = (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setTextColor(activityC13934x1991c070.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h hVar3 = activityC13934x1991c070.f190742y;
            if (hVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x3 = hVar3.o().getF294968x();
            android.widget.TextView textView3 = f294968x3 != null ? (android.widget.TextView) f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h hVar4 = activityC13934x1991c070.f190742y;
            if (hVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x4 = hVar4.o().getF294968x();
            android.view.View findViewById = f294968x4 != null ? f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderAllTimelineUI$createFeedLoader$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderAllTimelineUI$createFeedLoader$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
