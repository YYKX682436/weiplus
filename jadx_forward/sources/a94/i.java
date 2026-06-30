package a94;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a94.j f83987d;

    public i(a94.j jVar) {
        this.f83987d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLCardAnimView", "startFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b c17810x696dfd0b = this.f83987d.f83988e;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b.f245343z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        c17810x696dfd0b.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startFlip, target=null?");
        sb6.append(c17810x696dfd0b.f245348u == null);
        sb6.append(", mainView=null?");
        sb6.append(c17810x696dfd0b.f245349v == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLCardAnimView", sb6.toString());
        android.view.View view = c17810x696dfd0b.f245348u;
        if (view != null && c17810x696dfd0b.f245349v != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = c17810x696dfd0b.f245348u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l44.s5 s5Var = new l44.s5(c17810x696dfd0b.f245348u, c17810x696dfd0b.f245349v, c17810x696dfd0b.f245344q, false, 1000, com.p3249xcbb51f6b.tsm.C28041x16492e41.f65623x728dffb1);
            a94.k kVar = new a94.k(c17810x696dfd0b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            s5Var.f397885g = kVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            s5Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3$1");
    }
}
