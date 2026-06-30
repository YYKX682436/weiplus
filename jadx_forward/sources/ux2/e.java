package ux2;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux2.f f513383d;

    public e(ux2.f fVar) {
        this.f513383d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/recentimagebubble/FinderCommentRecentImageBubble$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ux2.f fVar = this.f513383d;
        ux2.h hVar = fVar.f513391h;
        if (hVar != null) {
            fVar.f513387d.mo146xb9724478(hVar);
        }
        db5.d5 d5Var = fVar.f513396m;
        if (d5Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bubble");
            throw null;
        }
        d5Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/recentimagebubble/FinderCommentRecentImageBubble$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
