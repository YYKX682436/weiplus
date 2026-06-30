package a94;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a94.e f83982d;

    public d(a94.e eVar) {
        this.f83982d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "startFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17809xf60523a6 c17809xf60523a6 = this.f83982d.f83983e;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17809xf60523a6.f245333p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        c17809xf60523a6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startFlip, target=null?");
        sb6.append(c17809xf60523a6.f245338h == null);
        sb6.append(", mainView=null?");
        sb6.append(c17809xf60523a6.f245339i == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", sb6.toString());
        android.view.View view = c17809xf60523a6.f245338h;
        if (view != null && c17809xf60523a6.f245339i != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = c17809xf60523a6.f245338h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l44.s5 s5Var = new l44.s5(c17809xf60523a6.f245338h, c17809xf60523a6.f245339i, c17809xf60523a6.f245334d, false, 1000, com.p3249xcbb51f6b.tsm.C28041x16492e41.f65623x728dffb1);
            a94.f fVar = new a94.f(c17809xf60523a6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            s5Var.f397885g = fVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            s5Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3$1");
    }
}
