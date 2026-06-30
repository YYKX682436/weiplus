package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class z2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa f192321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13955x33f31d8c f192322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13955x33f31d8c activityC13955x33f31d8c) {
        super(0);
        this.f192321d = c13924x37151faa;
        this.f192322e = activityC13955x33f31d8c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        if (!this.f192321d.getHasMore()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13955x33f31d8c activityC13955x33f31d8c = this.f192322e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cb cbVar = activityC13955x33f31d8c.f190785y;
            if (cbVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x = cbVar.o().getF294968x();
            if (f294968x != null && (textView2 = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cb cbVar2 = activityC13955x33f31d8c.f190785y;
            if (cbVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x2 = cbVar2.o().getF294968x();
            if (f294968x2 != null && (textView = (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setTextColor(activityC13955x33f31d8c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cb cbVar3 = activityC13955x33f31d8c.f190785y;
            if (cbVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x3 = cbVar3.o().getF294968x();
            android.widget.TextView textView3 = f294968x3 != null ? (android.widget.TextView) f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cb cbVar4 = activityC13955x33f31d8c.f190785y;
            if (cbVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x4 = cbVar4.o().getF294968x();
            android.view.View findViewById = f294968x4 != null ? f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
