package wo1;

/* loaded from: classes5.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.u f529560d;

    public t(wo1.u uVar) {
        this.f529560d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseContactAdapter$selectedListAdapter$1$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wo1.u uVar = this.f529560d;
        boolean z17 = !uVar.f529565f;
        uVar.f529565f = z17;
        yz5.l lVar = uVar.f529513d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseContactAdapter$selectedListAdapter$1$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
