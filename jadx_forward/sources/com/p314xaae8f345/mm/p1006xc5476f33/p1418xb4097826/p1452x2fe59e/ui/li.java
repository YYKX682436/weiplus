package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class li implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14072x6386c4f6 f191810d;

    public li(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14072x6386c4f6 activityC14072x6386c4f6) {
        this.f191810d = activityC14072x6386c4f6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14072x6386c4f6 activityC14072x6386c4f6 = this.f191810d;
        android.content.Intent intent = activityC14072x6386c4f6.N;
        if (intent != null) {
            activityC14072x6386c4f6.finish();
            intent.putExtra("KEY_IS_FULLSCREEN", !activityC14072x6386c4f6.P);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14071x7133e7d3 c14071x7133e7d3 = activityC14072x6386c4f6.A;
            if (c14071x7133e7d3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            hc2.e0.b(intent, 0, c14071x7133e7d3.m56387xe6796cde(), null, null);
            android.content.Intent intent2 = activityC14072x6386c4f6.N;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC14072x6386c4f6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC14072x6386c4f6.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC14072x6386c4f6, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
