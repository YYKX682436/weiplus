package zo1;

/* loaded from: classes5.dex */
public final class x implements fo1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f f556350a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f) {
        this.f556350a = activityC12867x6b26c82f;
    }

    @Override // fo1.o
    public final void a(fo1.n it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f = this.f556350a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC12867x6b26c82f.f174332e, "Permission reauthorize result = " + it + '.');
        if (it == fo1.n.f346419f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b.f174101a;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = activityC12867x6b26c82f.f174341q;
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
                throw null;
            }
            bVar.c(gVar.f297362d, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a.f174093d, null);
            android.content.Intent intent = new android.content.Intent(activityC12867x6b26c82f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.class);
            intent.putExtra("expandCard", true);
            intent.putExtra("packageId", activityC12867x6b26c82f.f174333f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f2 = this.f556350a;
            android.content.Intent intent2 = activityC12867x6b26c82f2.getIntent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC12867x6b26c82f2, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$checkPermission$1$1", "onResult", "(Lcom/tencent/mm/plugin/backup/roambackup/helper/RoamPermissionHelper$IReauthorizeCallback$ErrorCode;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC12867x6b26c82f2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC12867x6b26c82f2, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$checkPermission$1$1", "onResult", "(Lcom/tencent/mm/plugin/backup/roambackup/helper/RoamPermissionHelper$IReauthorizeCallback$ErrorCode;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
