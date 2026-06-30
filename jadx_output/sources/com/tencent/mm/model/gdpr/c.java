package com.tencent.mm.model.gdpr;

/* loaded from: classes7.dex */
public class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.model.gdpr.b f70372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f70373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.model.gdpr.a f70374c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70375d;

    public c(com.tencent.mm.model.gdpr.b bVar, android.content.Context context, com.tencent.mm.model.gdpr.a aVar, java.lang.String str) {
        this.f70372a = bVar;
        this.f70373b = context;
        this.f70374c = aVar;
        this.f70375d = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            return null;
        }
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver(handler) { // from class: com.tencent.mm.model.gdpr.MPGdprPolicyUtil$1$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                com.tencent.mm.model.gdpr.c.this.f70372a.a(i17 > 0 ? 0 : 1);
            }
        };
        android.content.Context context = this.f70373b;
        android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI.class).putExtra("MPGdprPolicyUI_KEY_BUSINESS", this.f70374c.f70370d).putExtra("MPGdprPolicyUI_KEY_APPID", this.f70375d).putExtra("MPGdprPolicyUI_KEY_RECEIVER", resultReceiver);
        if (!(context instanceof android.app.Activity)) {
            putExtra.addFlags(268435456);
        }
        android.content.Context context2 = this.f70373b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/model/gdpr/MPGdprPolicyUtil$1", "call", "(Ljava/lang/Boolean;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/model/gdpr/MPGdprPolicyUtil$1", "call", "(Ljava/lang/Boolean;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }
}
