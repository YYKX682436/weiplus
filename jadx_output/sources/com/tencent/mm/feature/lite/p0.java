package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class p0 implements kx5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f67240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f67241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f67243d;

    public p0(com.tencent.mm.feature.lite.i iVar, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, int i17, android.content.Context context, android.content.Intent intent) {
        this.f67240a = liteAppReporter;
        this.f67241b = i17;
        this.f67242c = context;
        this.f67243d = intent;
    }

    @Override // kx5.k
    public void a() {
        int i17 = this.f67241b;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f67240a;
        if (liteAppReporter != null) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
            hashMap.put("result", "ok");
            liteAppReporter.logPerf("Android.Feature.openLiteApp.prepareFlutterEngineGroup", false, hashMap);
            java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
            hashMap2.put("requestCode", java.lang.String.valueOf(i17));
            liteAppReporter.logPerf("Android.Feature.openLiteApp.startActivity->UI.onCreate", true, hashMap2);
        }
        android.content.Intent intent = this.f67243d;
        if (i17 > 0) {
            ((androidx.fragment.app.FragmentActivity) this.f67242c).startActivityForResult(intent, i17);
            return;
        }
        android.content.Context context = this.f67242c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/lite/LiteAppFeatureService$33", "onCallback", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/lite/LiteAppFeatureService$33", "onCallback", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
