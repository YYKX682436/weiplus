package com.p314xaae8f345.mm.p939x633fb29.p940x30579f;

/* loaded from: classes7.dex */
public class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p939x633fb29.p940x30579f.b f151905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f151906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p939x633fb29.p940x30579f.a f151907c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151908d;

    public c(com.p314xaae8f345.mm.p939x633fb29.p940x30579f.b bVar, android.content.Context context, com.p314xaae8f345.mm.p939x633fb29.p940x30579f.a aVar, java.lang.String str) {
        this.f151905a = bVar;
        this.f151906b = context;
        this.f151907c = aVar;
        this.f151908d = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            return null;
        }
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver(handler) { // from class: com.tencent.mm.model.gdpr.MPGdprPolicyUtil$1$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p939x633fb29.p940x30579f.c.this.f151905a.a(i17 > 0 ? 0 : 1);
            }
        };
        android.content.Context context = this.f151906b;
        android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p939x633fb29.p940x30579f.ui.ActivityC11103xcf50d948.class).putExtra("MPGdprPolicyUI_KEY_BUSINESS", this.f151907c.f151903d).putExtra("MPGdprPolicyUI_KEY_APPID", this.f151908d).putExtra("MPGdprPolicyUI_KEY_RECEIVER", resultReceiver);
        if (!(context instanceof android.app.Activity)) {
            putExtra.addFlags(268435456);
        }
        android.content.Context context2 = this.f151906b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/model/gdpr/MPGdprPolicyUtil$1", "call", "(Ljava/lang/Boolean;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/model/gdpr/MPGdprPolicyUtil$1", "call", "(Ljava/lang/Boolean;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }
}
