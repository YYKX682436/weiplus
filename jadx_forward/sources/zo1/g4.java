package zo1;

/* loaded from: classes5.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.b4 f556158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f556159e;

    public g4(zo1.b4 b4Var, zo1.k4 k4Var) {
        this.f556158d = b4Var;
        this.f556159e = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zo1.k4 k4Var;
        zo1.a4 a4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f556158d.m8183xf806b362();
        if (m8183xf806b362 != -1 && (a4Var = (k4Var = this.f556159e).f556206d) != null) {
            java.lang.Object obj = k4Var.f556207e.get(m8183xf806b362);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj;
            zo1.r4 r4Var = (zo1.r4) a4Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "onManagerBtnClick, pkgId=" + gVar.f297362d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.I, gVar, null, null, null, null, 60, null);
            android.content.Intent intent = new android.content.Intent(r4Var.f556292a.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b.class);
            intent.putExtra("packageId", gVar.f297362d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = r4Var.f556292a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC12873xf94c39e, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$onCreate$3", "onManagerBtnClick", "(Lcom/tencent/wechat/aff/affroam/AffRoamBackupPackage;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC12873xf94c39e.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC12873xf94c39e, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$onCreate$3", "onManagerBtnClick", "(Lcom/tencent/wechat/aff/affroam/AffRoamBackupPackage;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
