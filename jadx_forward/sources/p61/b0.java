package p61;

/* loaded from: classes14.dex */
public class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11359x4d6f2c6f f433749d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11359x4d6f2c6f activityC11359x4d6f2c6f) {
        this.f433749d = activityC11359x4d6f2c6f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11359x4d6f2c6f activityC11359x4d6f2c6f = this.f433749d;
        db5.e1.u(activityC11359x4d6f2c6f, activityC11359x4d6f2c6f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.beg), null, new p61.z(this), new p61.a0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
