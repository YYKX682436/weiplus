package zo1;

/* loaded from: classes5.dex */
public final class e4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.b4 f556126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f556127e;

    public e4(zo1.b4 b4Var, zo1.k4 k4Var) {
        this.f556126d = b4Var;
        this.f556127e = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zo1.k4 k4Var;
        zo1.a4 a4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f556126d.m8183xf806b362();
        if (m8183xf806b362 != -1 && (a4Var = (k4Var = this.f556127e).f556206d) != null) {
            java.lang.Object obj = k4Var.f556207e.get(m8183xf806b362);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "onAutoBackupBtnClick, pkgId=" + gVar.f297362d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.G, gVar, null, null, null, null, 60, null);
            zo1.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.f174397q;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = ((zo1.r4) a4Var).f556292a;
            activityC12873xf94c39e.getClass();
            uo1.w wVar = uo1.w.f511130a;
            int i17 = gVar.f297368m;
            po1.c cVar = po1.d.f438827i;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = gVar.f297365g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
            java.lang.String b17 = cVar.a(uVar).b();
            long j17 = gVar.f297362d;
            jz5.l lVar = new jz5.l(0L, 0L);
            if (gVar.f297367i.f297374d.size() >= 1) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m mVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m) gVar.f297367i.f297374d.get(0);
                if (mVar.f297433f.size() >= 1) {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l lVar2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l) mVar.f297433f.get(0);
                    lVar = new jz5.l(java.lang.Long.valueOf(lVar2.f297417d), java.lang.Long.valueOf(lVar2.f297418e));
                }
            }
            wVar.a(activityC12873xf94c39e, i17, b17, j17, ((java.lang.Number) lVar.f384367e).longValue() > 0, new zo1.g5(gVar, activityC12873xf94c39e));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
