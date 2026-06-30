package ym5;

/* loaded from: classes9.dex */
public final class r5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f545032d;

    public r5(ym5.y5 y5Var) {
        this.f545032d = y5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/StickerDrawingView$getTextEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f545032d.f();
        yj0.a.h(this, "com/tencent/mm/view/StickerDrawingView$getTextEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
