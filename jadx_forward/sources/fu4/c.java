package fu4;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f348419d;

    public c(fu4.b bVar, android.content.Intent intent) {
        this.f348419d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f348419d;
        if (intent.getIntExtra("retCode", -1) != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE.h();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f();
            c6244x161a780f.f136493g.f88925a = 5;
            c6244x161a780f.e();
            return;
        }
        android.content.Intent intent2 = (android.content.Intent) intent.getParcelableExtra("page_intent");
        if (intent2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE.h();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f();
            c6244x161a780f2.f136493g.f88925a = 5;
            c6244x161a780f2.e();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE;
        nVar.j(true);
        nVar.k(true);
        android.content.Context n17 = com.p314xaae8f345.mm.app.w.INSTANCE.n();
        if (n17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(n17, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/fingerprint/model/FingerprintLockImpl$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            n17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(n17, "com/tencent/mm/plugin/walletlock/fingerprint/model/FingerprintLockImpl$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
