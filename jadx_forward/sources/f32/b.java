package f32;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13406x1f846bbe f340820d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13406x1f846bbe c13406x1f846bbe) {
        this.f340820d = c13406x1f846bbe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewChangeMode$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l onModeSelected = this.f340820d.getOnModeSelected();
        if (onModeSelected != null) {
            onModeSelected.mo146xb9724478(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewChangeMode$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
