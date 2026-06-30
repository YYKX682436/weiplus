package p61;

/* loaded from: classes11.dex */
public class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11372x193fe158 f433831d;

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11372x193fe158 activityC11372x193fe158) {
        this.f433831d = activityC11372x193fe158;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/StartUnbindQQ$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11372x193fe158 activityC11372x193fe158 = this.f433831d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC11372x193fe158.f154627f;
        if (j0Var == null) {
            activityC11372x193fe158.f154627f = db5.e1.u(activityC11372x193fe158, activityC11372x193fe158.getString(com.p314xaae8f345.mm.R.C30867xcad56011.inz), null, new p61.h5(this), new p61.i5(this));
        } else {
            j0Var.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/StartUnbindQQ$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
