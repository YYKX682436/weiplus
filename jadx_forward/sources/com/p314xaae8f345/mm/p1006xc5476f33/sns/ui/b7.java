package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f249426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f249427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d f249428f;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d c17982x5116533d, boolean z17, float f17) {
        this.f249428f = c17982x5116533d;
        this.f249426d = z17;
        this.f249427e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d c17982x5116533d = this.f249428f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c17982x5116533d.hashCode());
        boolean z17 = this.f249426d;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
        float f17 = this.f249427e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVideoView", "%d switch video model isVideoPlay %b %f", valueOf, valueOf2, java.lang.Float.valueOf(f17));
        android.view.View view = (android.view.View) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.a(c17982x5116533d);
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.b(c17982x5116533d).setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.b(c17982x5116533d).setAlpha(f17);
            if (f17 >= 1.0d) {
                c17982x5116533d.f247945g.setVisibility(8);
            } else if (f17 == 0.0d) {
                c17982x5116533d.f247945g.setVisibility(0);
            }
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.b(c17982x5116533d).setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.b(c17982x5116533d).setAlpha(0.0f);
            c17982x5116533d.f247945g.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$3");
    }
}
