package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class p0 implements kx5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f148773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f148774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148775c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f148776d;

    public p0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, int i17, android.content.Context context, android.content.Intent intent) {
        this.f148773a = abstractC3700xe41a2874;
        this.f148774b = i17;
        this.f148775c = context;
        this.f148776d = intent;
    }

    @Override // kx5.k
    public void a() {
        int i17 = this.f148774b;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.f148773a;
        if (abstractC3700xe41a2874 != null) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
            hashMap.put("result", "ok");
            abstractC3700xe41a2874.mo28879x145c484d("Android.Feature.openLiteApp.prepareFlutterEngineGroup", false, hashMap);
            java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
            hashMap2.put("requestCode", java.lang.String.valueOf(i17));
            abstractC3700xe41a2874.mo28879x145c484d("Android.Feature.openLiteApp.startActivity->UI.onCreate", true, hashMap2);
        }
        android.content.Intent intent = this.f148776d;
        if (i17 > 0) {
            ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) this.f148775c).startActivityForResult(intent, i17);
            return;
        }
        android.content.Context context = this.f148775c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/lite/LiteAppFeatureService$33", "onCallback", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/lite/LiteAppFeatureService$33", "onCallback", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
