package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class bq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13912xc57e89ad f191266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14123x83bd0c f191267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13912xc57e89ad c13912xc57e89ad, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14123x83bd0c activityC14123x83bd0c) {
        super(1);
        this.f191266d = c13912xc57e89ad;
        this.f191267e = activityC14123x83bd0c;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h7 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (!this.f191266d.f189164p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14123x83bd0c activityC14123x83bd0c = this.f191267e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ds dsVar = activityC14123x83bd0c.f191159y;
            if (dsVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x = dsVar.o().getF294968x();
            if (f294968x != null && (textView2 = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ds dsVar2 = activityC14123x83bd0c.f191159y;
            if (dsVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x2 = dsVar2.o().getF294968x();
            if (f294968x2 != null && (textView = (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setTextColor(activityC14123x83bd0c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ds dsVar3 = activityC14123x83bd0c.f191159y;
            if (dsVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x3 = dsVar3.o().getF294968x();
            android.widget.TextView textView3 = f294968x3 != null ? (android.widget.TextView) f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ds dsVar4 = activityC14123x83bd0c.f191159y;
            if (dsVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x4 = dsVar4.o().getF294968x();
            android.view.View findViewById = f294968x4 != null ? f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$createFeedLoader$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderRecommendReasonLoader$FinderRecommendReasonResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$createFeedLoader$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderRecommendReasonLoader$FinderRecommendReasonResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
