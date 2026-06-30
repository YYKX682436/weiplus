package p61;

/* loaded from: classes5.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 f433750d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970) {
        this.f433750d = activityC11360x90d2d970;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970 = this.f433750d;
        int ordinal = activityC11360x90d2d970.f154501n.ordinal();
        if (ordinal == 1) {
            gm0.j1.u().c().w(4097, "");
            gm0.j1.u().c().w(6, "");
            activityC11360x90d2d970.mo43517x10010bd5();
        } else if (ordinal == 2) {
            activityC11360x90d2d970.Z6(true);
        } else if (ordinal == 3) {
            activityC11360x90d2d970.Z6(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
