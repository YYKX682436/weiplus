package cy3;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy3.d f306289d;

    public b(cy3.d dVar) {
        this.f306289d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cy3.g.a(this.f306289d, cy3.e.f306305f, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
