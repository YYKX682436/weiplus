package kf3;

/* loaded from: classes.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16490x9762c945 f388941d;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16490x9762c945 activityC16490x9762c945) {
        this.f388941d = activityC16490x9762c945;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendSelectPreviewFinderActivity$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16490x9762c945 activityC16490x9762c945 = this.f388941d;
        activityC16490x9762c945.setResult(-1);
        activityC16490x9762c945.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendSelectPreviewFinderActivity$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
