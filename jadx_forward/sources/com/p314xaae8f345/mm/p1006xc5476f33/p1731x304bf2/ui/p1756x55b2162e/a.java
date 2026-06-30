package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes3.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa.i f222763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f222764e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.b bVar, oa.i iVar, int i17) {
        this.f222763d = iVar;
        this.f222764e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        oa.i iVar = this.f222763d;
        android.view.View findViewById = iVar.f425316f.findViewById(com.p314xaae8f345.mm.R.id.nvn);
        android.widget.TextView textView = (android.widget.TextView) iVar.f425316f.findViewById(com.p314xaae8f345.mm.R.id.nvo);
        if (this.f222764e == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView.setVisibility(8);
    }
}
