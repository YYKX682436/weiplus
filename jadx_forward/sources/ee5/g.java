package ee5;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f333414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.j f333415e;

    public g(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, ee5.j jVar) {
        this.f333414d = z2Var;
        this.f333415e = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        de5.a.f310929a.g(102);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).bj(true);
        this.f333414d.B();
        ee5.j jVar = this.f333415e;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = jVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ee5.q3 q3Var = (ee5.q3) pf5.z.f435481a.a(activity).a(ee5.q3.class);
        q3Var.f333550r = true;
        q3Var.R6();
        android.view.View view2 = jVar.f333463d;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = jVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ee5.z zVar = (ee5.z) pf5.z.f435481a.a(activity2).a(ee5.z.class);
        android.view.View view3 = jVar.f333465f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
        zVar.getClass();
        zVar.f333637n = true;
        zVar.f333641r = true;
        zVar.f333634h = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(zVar.m158354x19263085(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fzr), false, 0, null);
        p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(zVar), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new ee5.l(zVar, view3, null), 2, null);
        zVar.W6();
        zVar.f333639p = p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(zVar), null, null, new ee5.m(zVar, view3, null), 3, null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = jVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        ee5.h0 h0Var = (ee5.h0) pf5.z.f435481a.a(activity3).a(ee5.h0.class);
        h0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "setIsFromOpen");
        h0Var.C = true;
        h0Var.f333441t = false;
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
