package qx0;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx0.e f448802d;

    public a(qx0.e eVar) {
        this.f448802d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/guide/StartShootingGuideBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qx0.e eVar = this.f448802d;
        eVar.getClass();
        eVar.dismiss();
        android.view.View contentView = eVar.getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new qx0.d(eVar.f448808e));
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/guide/StartShootingGuideBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
