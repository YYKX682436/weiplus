package bg2;

/* loaded from: classes2.dex */
public final class k5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.o5 f20248d;

    public k5(bg2.o5 o5Var) {
        this.f20248d = o5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveIndependentExpController$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FEED_ENTER_CLICK_AREA", 2);
        uc2.i iVar = (uc2.i) this.f20248d.O6(uc2.i.class);
        if (iVar != null) {
            kotlin.jvm.internal.o.d(view);
            ((sb2.o) iVar).Y6(view, intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveIndependentExpController$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
