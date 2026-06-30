package cw1;

/* loaded from: classes3.dex */
public final class f7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da f304472d;

    public f7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da) {
        this.f304472d = activityC13123x212a66da;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f304472d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
