package fg3;

/* loaded from: classes12.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.o f343969d;

    public k(fg3.o oVar) {
        this.f343969d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/media/video/VideoOperationLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fg3.p pVar = (fg3.p) this.f343969d.g(fg3.p.class);
        if (pVar != null) {
            ((fg3.v) pVar).b0();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/media/video/VideoOperationLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
