package e33;

/* loaded from: classes3.dex */
public class o3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f328956d;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561) {
        this.f328956d = activityC15656x6f26b561;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f328956d.o7(view);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
