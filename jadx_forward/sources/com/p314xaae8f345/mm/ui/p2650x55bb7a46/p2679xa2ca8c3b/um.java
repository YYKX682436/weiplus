package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public abstract class um {
    public abstract void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, yb5.d dVar, rd5.d dVar2, java.lang.String str);

    public void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vm vmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vm) g0Var;
        android.view.View view = vmVar.f287413d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys$ChattingItemSysInterface", "fillingExtraParts", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys$ChattingItemSysInterface", "fillingExtraParts", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = vmVar.f39501x4004bbf3;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public void c(android.text.SpannableString spannableString) {
        for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var : (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) spannableString.getSpans(0, spannableString.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class)) {
            z0Var.m75740x3ab833d4(true);
        }
    }
}
