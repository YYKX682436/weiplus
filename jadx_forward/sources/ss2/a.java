package ss2;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.b f493437d;

    public a(ss2.b bVar) {
        this.f493437d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/question/QAPostActionBarUIC$showCustomActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f493437d.m158354x19263085().finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC$showCustomActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
