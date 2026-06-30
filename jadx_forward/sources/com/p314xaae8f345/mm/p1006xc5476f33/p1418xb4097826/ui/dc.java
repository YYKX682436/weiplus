package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class dc extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d f210598a;

    public dc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d) {
        this.f210598a = activityC15052xa671b52d;
    }

    @Override // ym5.q3
    public void b(int i17) {
        android.view.View findViewById;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d.D;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostAtUI", "onLoadMoreBegin");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d = this.f210598a;
        if (activityC15052xa671b52d.C == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        if (!activityC15052xa671b52d.f210181x) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = activityC15052xa671b52d.B;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x = c22801x87cbdc00.getF294968x();
            if (f294968x != null && (textView = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = activityC15052xa671b52d.B;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x2 = c22801x87cbdc002.getF294968x();
            android.widget.TextView textView3 = f294968x2 != null ? (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = activityC15052xa671b52d.B;
            if (c22801x87cbdc003 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x3 = c22801x87cbdc003.getF294968x();
            findViewById = f294968x3 != null ? f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view = findViewById;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$3", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$3", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        gm0.j1.d().g(new db2.o5(activityC15052xa671b52d.f210180w));
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = activityC15052xa671b52d.B;
        if (c22801x87cbdc004 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View f294968x4 = c22801x87cbdc004.getF294968x();
        if (f294968x4 != null && (textView2 = (android.widget.TextView) f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573427el1);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = activityC15052xa671b52d.B;
        if (c22801x87cbdc005 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View f294968x5 = c22801x87cbdc005.getF294968x();
        android.widget.TextView textView4 = f294968x5 != null ? (android.widget.TextView) f294968x5.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc006 = activityC15052xa671b52d.B;
        if (c22801x87cbdc006 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View f294968x6 = c22801x87cbdc006.getF294968x();
        findViewById = f294968x6 != null ? f294968x6.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        android.view.View view2 = findViewById;
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$3", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$3", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
