package ku3;

/* loaded from: classes3.dex */
public final class h4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m4 f393781d;

    public h4(ku3.m4 m4Var) {
        this.f393781d = m4Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.d dVar = (zt3.d) obj;
        int i17 = dVar.f557126b;
        ku3.m4 m4Var = this.f393781d;
        if (i17 != 0) {
            android.view.View a17 = m4Var.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuFilterPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuFilterPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View a18 = m4Var.a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(a18, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuFilterPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(a18, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuFilterPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(m4Var.a(), "scaleX", 0.0f, 1.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(m4Var.a(), "alpha", 0.0f, 1.0f);
        android.os.Bundle bundle = dVar.f557127c;
        java.lang.Float valueOf = bundle != null ? java.lang.Float.valueOf(bundle.getFloat("PARAM_1_FLOAT")) : null;
        m4Var.f393860p = valueOf != null ? valueOf.floatValue() : m4Var.a().getWidth() / 2.0f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMenuFilterPlugin", "FILTER_UNFOLD_BAR >> " + valueOf + ", " + m4Var.f393860p);
        m4Var.a().setPivotX(m4Var.f393860p);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
