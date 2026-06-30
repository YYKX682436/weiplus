package ij2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij2.c f373220d;

    public a(ij2.c cVar) {
        this.f373220d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ij2.c cVar = this.f373220d;
        cVar.b(!cVar.f373224a.isSelected());
        xh2.a aVar = cVar.f373229f;
        if (aVar != null) {
            cVar.f373225b.mo149xb9724478(java.lang.Integer.valueOf(aVar.f536054b.f536086e), cVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
