package dy3;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy3.n f326111d;

    public f(dy3.n nVar) {
        this.f326111d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f326111d.cancel();
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
