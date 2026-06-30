package ap1;

/* loaded from: classes.dex */
public final class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f94306d;

    public z1(yz5.a aVar) {
        this.f94306d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectContactErrorUIC$showError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f94306d.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectContactErrorUIC$showError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
