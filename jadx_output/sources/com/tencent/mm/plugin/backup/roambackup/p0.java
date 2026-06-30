package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes3.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f92672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(long j17) {
        super(1);
        this.f92672d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context it = (android.content.Context) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[For delete] Enter SelectPackageUI from force notify. pkgId=");
        long j17 = this.f92672d;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", sb6.toString());
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI a17 = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.f92864q.a();
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.class);
        intent.putExtra("expandCard", true);
        intent.putExtra("packageId", j17);
        if (a17 == null || a17.isFinishing() || a17.isDestroyed()) {
            intent.setFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
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
        return jz5.f0.f302826a;
    }
}
