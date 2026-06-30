package zl2;

/* loaded from: classes2.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f555453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f555454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z63 f555455f;

    public p3(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, r45.z63 z63Var) {
        this.f555453d = c0Var;
        this.f555454e = e3Var;
        this.f555455f = z63Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$showGamePermissionBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f555453d.f391645d = true;
        this.f555454e.h();
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.String m75945x2fec8307 = this.f555455f.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GAME_RANK_PERMISSION_SHOW_STRING_SYNC;
        java.lang.String str = c17.v(u3Var, "") + ',' + m75945x2fec8307;
        gm0.j1.u().c().x(u3Var, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "appendAppid result " + str);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$showGamePermissionBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
