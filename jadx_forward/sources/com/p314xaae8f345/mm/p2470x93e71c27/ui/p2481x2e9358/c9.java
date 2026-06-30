package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes3.dex */
public final class c9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 f271778d;

    public c9(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var) {
        this.f271778d = h9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f271778d;
        android.view.View view = h9Var.f271907t;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = h9Var.f271902o;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(h9Var.f271893f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
        android.widget.TextView textView = h9Var.f271909v;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = h9Var.f271909v;
        if (textView2 != null) {
            textView2.setText(h9Var.f271893f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nku));
        }
        android.widget.TextView textView3 = h9Var.f271909v;
        if (textView3 != null) {
            textView3.setTextColor(h9Var.f271893f.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        }
        android.widget.TextView textView4 = h9Var.f271908u;
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(8);
    }
}
