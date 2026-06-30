package ss2;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f493517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f493518e;

    public t(ss2.a0 a0Var, int i17) {
        this.f493517d = a0Var;
        this.f493518e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/question/QAPostMediaWidget$refreshImageThumbView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMediaWidget$refreshImageThumbView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ss2.a0.c(this.f493517d, this.f493518e);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMediaWidget$refreshImageThumbView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
