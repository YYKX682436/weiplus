package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes5.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f284413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d f284414e;

    public c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d dVar, int[] iArr) {
        this.f284414e = dVar;
        this.f284413d = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d dVar = this.f284414e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd8601 = dVar.f284432d;
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601.f284352p;
        android.view.View contentView = c21894x47dd8601.f234428i.getContentView();
        contentView.getLocationOnScreen(iArr);
        android.view.View findViewById = contentView.findViewById(com.p314xaae8f345.mm.R.id.o_p);
        android.view.View findViewById2 = contentView.findViewById(com.p314xaae8f345.mm.R.id.qqi);
        boolean z17 = dVar.f284432d.f284354n;
        int[] iArr2 = this.f284413d;
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.leftMargin = ((iArr2[0] + (dVar.f284432d.getWidth() / 2)) - iArr[0]) - (findViewById.getWidth() / 2);
            findViewById.setLayoutParams(layoutParams);
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.measure(0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) findViewById2.getLayoutParams();
        layoutParams2.leftMargin = ((iArr2[0] + (dVar.f284432d.getWidth() / 2)) - iArr[0]) - (findViewById2.getMeasuredWidth() / 2);
        findViewById2.setLayoutParams(layoutParams2);
    }
}
