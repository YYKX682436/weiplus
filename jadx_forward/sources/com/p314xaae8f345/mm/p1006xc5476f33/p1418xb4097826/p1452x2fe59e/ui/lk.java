package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class lk extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13915xfa910e35 f191811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14090x2375bbd7 f191812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13915xfa910e35 c13915xfa910e35, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14090x2375bbd7 activityC14090x2375bbd7) {
        super(1);
        this.f191811d = c13915xfa910e35;
        this.f191812e = activityC14090x2375bbd7;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w7 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (!this.f191811d.f189178f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14090x2375bbd7 activityC14090x2375bbd7 = this.f191812e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ts tsVar = activityC14090x2375bbd7.f191076y;
            if (tsVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x = tsVar.o().getF294968x();
            if (f294968x != null && (textView2 = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ts tsVar2 = activityC14090x2375bbd7.f191076y;
            if (tsVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x2 = tsVar2.o().getF294968x();
            if (f294968x2 != null && (textView = (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setTextColor(activityC14090x2375bbd7.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ts tsVar3 = activityC14090x2375bbd7.f191076y;
            if (tsVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x3 = tsVar3.o().getF294968x();
            android.widget.TextView textView3 = f294968x3 != null ? (android.widget.TextView) f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ts tsVar4 = activityC14090x2375bbd7.f191076y;
            if (tsVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x4 = tsVar4.o().getF294968x();
            android.view.View findViewById = f294968x4 != null ? f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryTimeLineUI$createFeedLoader$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderSelfHistoryLoader$SelfHistoryResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryTimeLineUI$createFeedLoader$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderSelfHistoryLoader$SelfHistoryResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
