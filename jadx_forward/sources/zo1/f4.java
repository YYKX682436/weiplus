package zo1;

/* loaded from: classes5.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.b4 f556142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f556143e;

    public f4(zo1.b4 b4Var, zo1.k4 k4Var) {
        this.f556142d = b4Var;
        this.f556143e = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zo1.k4 k4Var;
        zo1.a4 a4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f556142d.m8183xf806b362();
        int i17 = -1;
        if (m8183xf806b362 != -1 && (a4Var = (k4Var = this.f556143e).f556206d) != null) {
            java.lang.Object obj = k4Var.f556207e.get(m8183xf806b362);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj;
            zo1.r4 r4Var = (zo1.r4) a4Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.H, gVar, null, null, null, null, 60, null);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h hVar = gVar.f297370o;
            if (hVar.f297372e <= 0) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mzt;
            } else if (hVar.f297371d <= 0) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mzn;
            } else {
                qo1.j0 d17 = qo1.j1.f447056a.d(gVar.f297362d);
                if ((d17 instanceof qo1.v0) && d17.b()) {
                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.n0p;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = r4Var.f556292a;
            if (i17 > 0) {
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC12873xf94c39e);
                e4Var.d(i17);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
                e4Var.c();
            } else {
                android.content.Intent intent = new android.content.Intent(activityC12873xf94c39e.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.class);
                intent.putExtra("packageId", gVar.f297362d);
                activityC12873xf94c39e.startActivityForResult(intent, 123);
                activityC12873xf94c39e.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
