package bq4;

/* loaded from: classes10.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2342xa4f4bf5f.C18826x415dbe7e f105125d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2342xa4f4bf5f.C18826x415dbe7e c18826x415dbe7e) {
        this.f105125d = c18826x415dbe7e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/video/textstatus/RecordTextStatusEditVideoPluginLayout$statusChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2342xa4f4bf5f.C18826x415dbe7e.f257642p1;
        this.f105125d.getEditFinishPlugin().onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/video/textstatus/RecordTextStatusEditVideoPluginLayout$statusChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
