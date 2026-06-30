package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f271748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.d3 f271749e;

    public c3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.d3 d3Var, int i17) {
        this.f271749e = d3Var;
        this.f271748d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.d3 d3Var = this.f271749e;
        int length = d3Var.f271792a.length();
        int i17 = this.f271748d;
        if (i17 <= length) {
            android.view.View view = d3Var.f271794c.f271828d.f271563n4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d3Var.f271794c.f271828d.f271557m4.setVisibility(0);
            if (i17 == d3Var.f271792a.length()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = d3Var.f271794c.f271828d;
                c19666xfd6e2f33.Z4 = true;
                c19666xfd6e2f33.C1();
            } else {
                d3Var.f271794c.f271828d.f271557m4.setText(d3Var.f271793b);
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(pg5.d.a(d3Var.f271794c.f271828d.getContext(), d3Var.f271792a));
                spannableStringBuilder.setSpan(d3Var.f271794c.f271828d.f271495b5, java.lang.Math.min(i17, spannableStringBuilder.length()), spannableStringBuilder.length(), 33);
                d3Var.f271794c.f271828d.f271494b4.setText(spannableStringBuilder);
            }
        }
    }
}
