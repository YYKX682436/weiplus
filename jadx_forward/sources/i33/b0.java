package i33;

/* loaded from: classes10.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.c0 f369693d;

    public b0(i33.c0 c0Var) {
        this.f369693d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC$checkBottomPermissionTipsForOnlyCanShowMediaPart$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i33.c0 c0Var = this.f369693d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i33.e eVar = (i33.e) pf5.z.f435481a.a(activity).a(i33.e.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f369707f, "markJumpingPermissionChange: ");
        eVar.f369711m = true;
        eVar.X6("set_allow_all_tips");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c0Var.m158354x19263085();
        ((sb0.f) jVar).getClass();
        j35.u.g(m158354x19263085);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC$checkBottomPermissionTipsForOnlyCanShowMediaPart$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
