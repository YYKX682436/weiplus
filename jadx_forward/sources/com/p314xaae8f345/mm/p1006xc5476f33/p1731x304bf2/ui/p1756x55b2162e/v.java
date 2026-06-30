package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f222852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f222853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.w f222854f;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.w wVar, int i17, java.util.List list) {
        this.f222854f = wVar;
        this.f222852d = i17;
        this.f222853e = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.w wVar = this.f222854f;
        int i17 = this.f222852d;
        if (i17 > 0) {
            android.view.View findViewById = wVar.f222857a.getRootView().findViewById(com.p314xaae8f345.mm.R.id.glj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = wVar.f222857a.getRootView().findViewById(com.p314xaae8f345.mm.R.id.glj);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.List list = this.f222853e;
        if (list.size() <= 15) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.z zVar = wVar.f222857a.f222659i2;
            zVar.f222875d = i17;
            java.util.LinkedList linkedList = (java.util.LinkedList) zVar.f222876e;
            linkedList.clear();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                linkedList.addAll(list);
            }
            zVar.m8146xced61ae5();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.z zVar2 = wVar.f222857a.f222659i2;
        java.util.List subList = list.subList(0, 15);
        zVar2.f222875d = i17;
        java.util.LinkedList linkedList2 = (java.util.LinkedList) zVar2.f222876e;
        linkedList2.clear();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(subList)) {
            linkedList2.addAll(subList);
        }
        zVar2.m8146xced61ae5();
    }
}
