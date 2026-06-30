package fg3;

/* loaded from: classes12.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.o f343967d;

    public i(fg3.o oVar) {
        this.f343967d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/media/video/VideoOperationLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mf3.o oVar = (mf3.o) this.f343967d.g(mf3.o.class);
        if (oVar != null) {
            oVar.j();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/media/video/VideoOperationLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
