package ax2;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView f15097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f15098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f15099f;

    public x(com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView livePkCritBuffView, float f17, float f18) {
        this.f15097d = livePkCritBuffView;
        this.f15098e = f17;
        this.f15099f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.MMNeat7extView buffResultView;
        android.view.View lightView;
        android.view.View lightView2;
        android.view.View lightView3;
        android.view.View lightView4;
        android.view.View lightView5;
        android.view.View lightView6;
        com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView livePkCritBuffView = this.f15097d;
        buffResultView = livePkCritBuffView.getBuffResultView();
        int left = (int) (buffResultView.getLeft() + this.f15098e + ((this.f15099f / 2) - (livePkCritBuffView.getLIGHT_WIDTH() / 2)));
        lightView = livePkCritBuffView.getLightView();
        lightView2 = livePkCritBuffView.getLightView();
        android.view.ViewGroup.LayoutParams layoutParams = lightView2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            lightView4 = livePkCritBuffView.getLightView();
            kotlin.jvm.internal.o.f(lightView4, "access$getLightView(...)");
            android.view.ViewGroup.LayoutParams layoutParams2 = lightView4.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i17 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
            lightView5 = livePkCritBuffView.getLightView();
            kotlin.jvm.internal.o.f(lightView5, "access$getLightView(...)");
            android.view.ViewGroup.LayoutParams layoutParams3 = lightView5.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i18 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
            lightView6 = livePkCritBuffView.getLightView();
            kotlin.jvm.internal.o.f(lightView6, "access$getLightView(...)");
            android.view.ViewGroup.LayoutParams layoutParams4 = lightView6.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            marginLayoutParams.setMargins(left, i17, i18, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
        }
        lightView.setLayoutParams(layoutParams);
        lightView3 = livePkCritBuffView.getLightView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(lightView3, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView$updateBuffDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        lightView3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(lightView3, "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView$updateBuffDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
