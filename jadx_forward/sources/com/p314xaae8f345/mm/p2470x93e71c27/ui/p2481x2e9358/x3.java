package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5 f272270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272271e;

    public x3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5 f5Var) {
        this.f272271e = c19666xfd6e2f33;
        this.f272270d = f5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272271e;
        c19666xfd6e2f33.f271572p.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ahj);
        c19666xfd6e2f33.f271572p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.azr);
        if (c19666xfd6e2f33.S3) {
            int ordinal = this.f272270d.ordinal();
            if ((ordinal == 0 || ordinal == 5 || ordinal == 2 || ordinal == 3) && c19666xfd6e2f33.X3 != null) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.p(c19666xfd6e2f33);
                return;
            }
            return;
        }
        db5.d5 d5Var = c19666xfd6e2f33.L1;
        if (d5Var != null) {
            d5Var.dismiss();
            db5.d5 d5Var2 = c19666xfd6e2f33.M3;
            if (d5Var2 != null) {
                d5Var2.getContentView().animate().alpha(0.0f).setDuration(300L).withEndAction(c19666xfd6e2f33.U5).start();
            }
            c19666xfd6e2f33.M1.setVisibility(0);
            android.view.View view = c19666xfd6e2f33.R1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = c19666xfd6e2f33.S1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = c19666xfd6e2f33.Q1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = c19666xfd6e2f33.A3;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = c19666xfd6e2f33.N1;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c19666xfd6e2f33.getClass();
        c19666xfd6e2f33.getClass();
    }
}
