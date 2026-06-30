package a94;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a94.e f2449d;

    public d(a94.e eVar) {
        this.f2449d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3$1");
        com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "startFlip");
        com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView = this.f2449d.f2450e;
        int i17 = com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView.f163800p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        cardAnimView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startFlip, target=null?");
        sb6.append(cardAnimView.f163805h == null);
        sb6.append(", mainView=null?");
        sb6.append(cardAnimView.f163806i == null);
        com.tencent.mars.xlog.Log.i("ShakeCardAnimView", sb6.toString());
        android.view.View view = cardAnimView.f163805h;
        if (view != null && cardAnimView.f163806i != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = cardAnimView.f163805h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l44.s5 s5Var = new l44.s5(cardAnimView.f163805h, cardAnimView.f163806i, cardAnimView.f163801d, false, 1000, com.tenpay.tsm.TSMException.ERR_JNIV2_BEGIN);
            a94.f fVar = new a94.f(cardAnimView);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            s5Var.f316352g = fVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            s5Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3$1");
    }
}
