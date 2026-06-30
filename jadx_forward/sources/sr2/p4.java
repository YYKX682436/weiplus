package sr2;

/* loaded from: classes10.dex */
public final class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493206d;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        this.f493206d = c14609xb4d6eef6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493206d;
        java.lang.Object tag = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.S6(c14609xb4d6eef6).getTag(com.p314xaae8f345.mm.R.id.f566447tt4);
        if (tag != null) {
            android.view.View S6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.S6(c14609xb4d6eef6);
            int intValue = ((java.lang.Integer) tag).intValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.Object tag2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.Q6(c14609xb4d6eef6).getTag(com.p314xaae8f345.mm.R.id.qyi);
        if (tag2 != null) {
            android.view.View Q6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.Q6(c14609xb4d6eef6);
            int intValue2 = ((java.lang.Integer) tag2).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(Q6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Q6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(Q6, "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.Object tag3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.R6(c14609xb4d6eef6).getTag(com.p314xaae8f345.mm.R.id.f567901l12);
        if (tag3 != null) {
            android.view.View R6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.R6(c14609xb4d6eef6);
            int intValue3 = ((java.lang.Integer) tag3).intValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(intValue3));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = c14609xb4d6eef6.f204049h;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomSpace");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue4 = ((java.lang.Integer) arrayList4.get(0)).intValue();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Integer.valueOf(intValue4));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
