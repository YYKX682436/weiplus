package cj4;

/* loaded from: classes5.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f42035d;

    public t(cj4.a0 a0Var) {
        this.f42035d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj4.a0 a0Var = this.f42035d;
        java.lang.String str = a0Var.D1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tv.setOnClickListener :  hasClickCollageSuffix:");
        sb6.append(a0Var.Q1);
        sb6.append(" isPostOpen:");
        sb6.append(a0Var.Y);
        sb6.append(" pullDownListView?.translationY:");
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = a0Var.G1;
        sb6.append(pullDownListView != null ? java.lang.Float.valueOf(pullDownListView.getTranslationY()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (a0Var.Q1) {
            a0Var.Q1 = false;
        } else if (!a0Var.Y) {
            yz5.a aVar = a0Var.f41969z1;
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            if (!a0Var.X()) {
                yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            a0Var.M(4);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
