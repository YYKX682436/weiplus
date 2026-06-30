package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes2.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272060d;

    public o0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272060d = c19666xfd6e2f33;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272060d;
        android.view.View view = c19666xfd6e2f33.T4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$109", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$109", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c19666xfd6e2f33.U4.setTextColor(c19666xfd6e2f33.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
        c19666xfd6e2f33.U4.setText(c19666xfd6e2f33.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h8z));
        c19666xfd6e2f33.U4.setTextSize(0, i65.a.f(c19666xfd6e2f33.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r));
    }
}
