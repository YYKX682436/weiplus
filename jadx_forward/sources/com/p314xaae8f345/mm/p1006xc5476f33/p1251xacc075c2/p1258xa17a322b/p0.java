package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes3.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f174205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(long j17) {
        super(1);
        this.f174205d = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context it = (android.content.Context) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[For delete] Enter SelectPackageUI from force notify. pkgId=");
        long j17 = this.f174205d;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.f174397q.a();
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.class);
        intent.putExtra("expandCard", true);
        intent.putExtra("packageId", j17);
        if (a17 == null || a17.isFinishing() || a17.isDestroyed()) {
            intent.setFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/NewRoamBackupManager$tryForceNotifyForDelete$msgItem$1", "invoke", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/backup/roambackup/NewRoamBackupManager$tryForceNotifyForDelete$msgItem$1", "invoke", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            intent.setFlags(67108864);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/NewRoamBackupManager$tryForceNotifyForDelete$msgItem$1", "invoke", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            a17.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(a17, "com/tencent/mm/plugin/backup/roambackup/NewRoamBackupManager$tryForceNotifyForDelete$msgItem$1", "invoke", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
