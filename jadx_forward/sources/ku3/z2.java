package ku3;

/* loaded from: classes3.dex */
public final class z2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.e3 f394036d;

    public z2(ku3.e3 e3Var) {
        this.f394036d = e3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.d dVar = (zt3.d) obj;
        int i17 = dVar.f557126b;
        ku3.e3 e3Var = this.f394036d;
        if (i17 != 0) {
            android.view.View c17 = e3Var.c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View c18 = e3Var.c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c18, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c18, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(e3Var.c(), "scaleX", 0.0f, 1.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(e3Var.c(), "alpha", 0.0f, 1.0f);
        android.os.Bundle bundle = dVar.f557127c;
        java.lang.Float valueOf = bundle != null ? java.lang.Float.valueOf(bundle.getFloat("PARAM_1_FLOAT")) : null;
        e3Var.f393754x = valueOf != null ? valueOf.floatValue() : e3Var.c().getWidth() / 2.0f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMenuBeautyPlugin", "BEAUTY_UNFOLD_BAR >> " + valueOf + ", " + e3Var.f393754x);
        e3Var.c().setPivotX(e3Var.f393754x);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
