package mo1;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final mo1.v f411871d = new mo1.v();

    public v() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkg = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkg, "pkg");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81.class);
        intent.addFlags(268435456);
        intent.putExtra("packageId", pkg.f297362d);
        intent.putExtra("dummyAsRestore", !booleanValue);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLitePackageListUI$FillRootView$1$2$2", "invoke", "(Lcom/tencent/wechat/aff/affroam/AffRoamBackupPackage;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLitePackageListUI$FillRootView$1$2$2", "invoke", "(Lcom/tencent/wechat/aff/affroam/AffRoamBackupPackage;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
