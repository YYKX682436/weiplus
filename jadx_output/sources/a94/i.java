package a94;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a94.j f2454d;

    public i(a94.j jVar) {
        this.f2454d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3$1");
        com.tencent.mars.xlog.Log.i("GLCardAnimView", "startFlip");
        com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView = this.f2454d.f2455e;
        int i17 = com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView.f163810z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        gLCardAnimView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startFlip, target=null?");
        sb6.append(gLCardAnimView.f163815u == null);
        sb6.append(", mainView=null?");
        sb6.append(gLCardAnimView.f163816v == null);
        com.tencent.mars.xlog.Log.i("GLCardAnimView", sb6.toString());
        android.view.View view = gLCardAnimView.f163815u;
        if (view != null && gLCardAnimView.f163816v != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = gLCardAnimView.f163815u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l44.s5 s5Var = new l44.s5(gLCardAnimView.f163815u, gLCardAnimView.f163816v, gLCardAnimView.f163811q, false, 1000, com.tenpay.tsm.TSMException.ERR_JNIV2_BEGIN);
            a94.k kVar = new a94.k(gLCardAnimView);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            s5Var.f316352g = kVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            s5Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3$1");
    }
}
