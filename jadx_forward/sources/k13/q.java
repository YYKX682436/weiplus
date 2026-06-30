package k13;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 f384791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384792e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 activityC15561x6c397057, java.lang.String str) {
        this.f384791d = activityC15561x6c397057;
        this.f384792e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 activityC15561x6c397057 = this.f384791d;
        java.lang.String string = activityC15561x6c397057.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 activityC15561x6c3970572 = this.f384791d;
        activityC15561x6c397057.f218867f = db5.e1.Q(activityC15561x6c397057, string, activityC15561x6c3970572.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, k13.o.f384786d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC15561x6c3970572.f218867f;
        if (u3Var != null) {
            u3Var.show();
        }
        new i13.d(this.f384792e).l().h(new k13.p(activityC15561x6c3970572));
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
