package o25;

/* loaded from: classes.dex */
public class g0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f424058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f424059b;

    public g0(android.content.Intent intent, android.content.Context context) {
        this.f424058a = intent;
        this.f424059b = context;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeepLinkHelper", "getContact fail, %s", str);
            return;
        }
        android.content.Intent intent = this.f424058a;
        intent.putExtra("Chat_User", str);
        try {
            android.content.Context context = this.f424059b;
            if (context != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/DeepLinkHelper$5", "getContactCallBack", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/DeepLinkHelper$5", "getContactCallBack", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/DeepLinkHelper$5", "getContactCallBack", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/mm/pluginsdk/DeepLinkHelper$5", "getContactCallBack", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeepLinkHelper", e17, "", "");
        }
    }
}
