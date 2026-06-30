package cw1;

/* loaded from: classes12.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db f304247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.v0 f304248e;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db, cw1.v0 v0Var) {
        this.f304247d = activityC13108x43db50db;
        this.f304248e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db = this.f304247d;
        android.content.Intent intent = new android.content.Intent(activityC13108x43db50db, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13110x50e4df39.class);
        cw1.v0 v0Var = this.f304248e;
        android.content.Intent putExtra = intent.putExtra("size", v0Var.f304893b).putExtra("checked", v0Var.f304894c).putExtra("appIds", activityC13108x43db50db.f177201s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        lk5.s.e(putExtra, true);
        activityC13108x43db50db.startActivityForResult(putExtra, 4);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
