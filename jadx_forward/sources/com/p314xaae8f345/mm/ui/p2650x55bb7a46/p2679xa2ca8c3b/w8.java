package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public final class w8 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f287445b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.FrameLayout f287446c;

    /* renamed from: d, reason: collision with root package name */
    public q31.n f287447d;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0
    /* renamed from: create */
    public void mo80050xaf65a0fc(android.view.View view) {
        super.mo80050xaf65a0fc(view);
        this.f39492x5b9aa3a3 = view != null ? (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf) : null;
        this.f39496x10665fb1 = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.bpa) : null;
        this.f287445b = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.f565178bk4) : null;
        this.f287446c = view != null ? (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.r_5) : null;
        android.view.View view2 = this.f287445b;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFunctionGuideList$AppMsgFunctionGuideListHolder", "create", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFunctionGuideList$AppMsgFunctionGuideListHolder", "create", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f39502xce2b2f8d;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = this.f39500xcbecde0f;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }
}
