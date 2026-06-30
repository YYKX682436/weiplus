package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class le implements l45.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211006a;

    public le(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949) {
        this.f211006a = activityC15059x3e98c949;
    }

    @Override // l45.m
    public boolean a(xk0.p pVar) {
        return false;
    }

    @Override // l45.m
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211006a;
        android.view.View view = activityC15059x3e98c949.B;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = activityC15059x3e98c949.f210220z;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cropOperationLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // l45.m
    public void c(java.lang.Boolean bool) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211006a;
            android.view.View view = activityC15059x3e98c949.B;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footerView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = activityC15059x3e98c949.f210220z;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cropOperationLayout");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
