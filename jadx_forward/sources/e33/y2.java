package e33;

/* loaded from: classes10.dex */
public class y2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 f329085d;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14) {
        this.f329085d = c15655x4db85b14;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e33.f3 f3Var = this.f329085d.f220104s;
        if (f3Var != null && (c15655x4db85b14 = (activityC15653x403456cd = ((e33.y0) f3Var).f329082a).f220073r) != null && c15655x4db85b14.f220098m) {
            c15655x4db85b14.d();
            activityC15653x403456cd.m78547xfde6309c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
