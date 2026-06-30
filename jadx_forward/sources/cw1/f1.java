package cw1;

/* loaded from: classes12.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db f304465d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db) {
        this.f304465d = activityC13108x43db50db;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cw1.t0 t0Var = this.f304465d.f177189d;
        if (t0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        t0Var.z(true);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
