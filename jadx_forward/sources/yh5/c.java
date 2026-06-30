package yh5;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yh5.e f543956d;

    public c(yh5.e eVar) {
        this.f543956d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yh5.e eVar = this.f543956d;
        lf3.j jVar = (lf3.j) eVar.U6(lf3.j.class);
        android.view.View findViewById = eVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.tzq);
        if (jVar == null || findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CleanGalleryToolbarComponent", "pageAnim or previewView null, fallback finish");
            eVar.m158354x19263085().finish();
        } else {
            jVar.E2(findViewById);
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
