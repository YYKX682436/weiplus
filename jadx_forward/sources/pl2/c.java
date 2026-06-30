package pl2;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f438152d;

    public c(pl2.s sVar) {
        this.f438152d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b17;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b18;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b19;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b27;
        km2.n nVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pl2.m mVar = this.f438152d.f438184f;
        if (mVar != null) {
            vd2.l4 l4Var = (vd2.l4) mVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "sidebar onCreateKtvRoomClick");
            pl2.s.e(l4Var.f517338d, 0L, null, 3, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = l4Var.f517337c;
            km2.t c17 = (c14167x40aca97c.f193019h == null || (nVar = dk2.ef.H) == null) ? null : nVar.c();
            r45.m84 m84Var = new r45.m84();
            long j17 = 0;
            m84Var.set(1, java.lang.Long.valueOf((c17 == null || (b27 = c17.b()) == null) ? 0L : b27.f150070e));
            if (c17 != null && (b19 = c17.b()) != null) {
                j17 = b19.f150082s;
            }
            m84Var.set(0, java.lang.Long.valueOf(j17));
            if (c17 == null || (b18 = c17.b()) == null || (str = b18.f150089z) == null) {
                str = "";
            }
            m84Var.set(2, str);
            m84Var.set(3, (c17 == null || (b17 = c17.b()) == null) ? null : b17.f150075m);
            p3325xe03a0797.p3326xc267989b.y0 b28 = v65.m.b(c14167x40aca97c.f193017f);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(b28, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new vd2.h4(c14167x40aca97c, m84Var, null), 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
