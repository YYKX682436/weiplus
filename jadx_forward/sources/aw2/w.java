package aw2;

/* loaded from: classes10.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.c0 f96336d;

    public w(aw2.c0 c0Var) {
        this.f96336d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderHighlightTopicWidget$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        aw2.c0 c0Var = this.f96336d;
        if (c0Var.f96265o.length() == 0) {
            aw2.c0.a(c0Var);
        } else {
            c0Var.getClass();
            ry2.j.f482931a.a(c0Var.f96257d, kz5.c0.i(new ry2.f(3, 0, 0, new aw2.a0(c0Var), null, 22, null), new ry2.f(2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, 0, new aw2.b0(c0Var), null, 20, null)), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderHighlightTopicWidget$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
