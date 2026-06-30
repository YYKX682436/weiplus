package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes3.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 f219911d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78) {
        this.f219911d = abstractActivityC15595x3a75f78;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f219911d.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$10", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$10", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
