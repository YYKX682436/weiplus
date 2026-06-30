package cj4;

/* loaded from: classes5.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f123568d;

    public t(cj4.a0 a0Var) {
        this.f123568d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj4.a0 a0Var = this.f123568d;
        java.lang.String str = a0Var.D1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tv.setOnClickListener :  hasClickCollageSuffix:");
        sb6.append(a0Var.Q1);
        sb6.append(" isPostOpen:");
        sb6.append(a0Var.Y);
        sb6.append(" pullDownListView?.translationY:");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = a0Var.G1;
        sb6.append(c22702xa9a9ae2a != null ? java.lang.Float.valueOf(c22702xa9a9ae2a.getTranslationY()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (a0Var.Q1) {
            a0Var.Q1 = false;
        } else if (!a0Var.Y) {
            yz5.a aVar = a0Var.f123502z1;
            if (aVar != null) {
                aVar.mo152xb9724478();
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
