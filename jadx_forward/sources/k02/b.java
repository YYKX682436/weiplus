package k02;

/* loaded from: classes.dex */
public class b implements j35.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f384597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f384598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k02.j f384599c;

    public b(android.content.Context context, android.content.Intent intent, k02.j jVar) {
        this.f384597a = context;
        this.f384598b = intent;
        this.f384599c = jVar;
    }

    @Override // j35.g0
    public void a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "onRequestPermissionsResult, resultCode = %d", java.lang.Integer.valueOf(i18));
        android.content.Intent intent2 = this.f384598b;
        k02.j jVar = this.f384599c;
        if (i18 == -1) {
            try {
                android.content.Context context = this.f384597a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DownloadAppUtil", e17, "install app failed! %s", intent2);
            }
            if (jVar != null) {
                jVar.b(true);
                jVar.a(true);
                return;
            }
            return;
        }
        android.content.Context context2 = this.f384597a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadAppUtil", "no get!!!");
        dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.h9z, 1).show();
        if (jVar != null) {
            jVar.b(false);
            jVar.a(false);
        }
    }
}
