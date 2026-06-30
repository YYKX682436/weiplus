package ci2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci2.d f41673d;

    public c(ci2.d dVar) {
        this.f41673d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/chatvoiceroom/layout/ChatVoiceRoomContentLayout$updateWithMicTopicData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.u3 u3Var = (df2.u3) this.f41673d.f41674d.o(df2.u3.class);
        if (u3Var != null) {
            df2.h3[] h3VarArr = df2.h3.f230280d;
            u3Var.Z6(1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/chatvoiceroom/layout/ChatVoiceRoomContentLayout$updateWithMicTopicData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
