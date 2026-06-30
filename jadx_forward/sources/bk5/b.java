package bk5;

/* loaded from: classes.dex */
public final class b implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2739x6969627.C22492x73358eb9 f103183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103185c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103186d;

    public b(com.p314xaae8f345.mm.ui.p2739x6969627.C22492x73358eb9 c22492x73358eb9, android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f103183a = c22492x73358eb9;
        this.f103184b = context;
        this.f103185c = str;
        this.f103186d = str2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g
    public final void a() {
        int i17 = com.p314xaae8f345.mm.ui.p2739x6969627.C22492x73358eb9.f291490a;
        this.f103183a.getClass();
        android.content.Context context = this.f103184b;
        if (context == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EnterChattingAfterTrans enterChatting toUsername=");
        java.lang.String str = this.f103185c;
        sb6.append(str);
        sb6.append(" fromUsername=");
        java.lang.String str2 = this.f103186d;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeToastStarter", sb6.toString());
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        intent.addFlags(335544320);
        if (str != null) {
            intent.putExtra("Chat_User", str);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/toast/ForwardSnackBarReceiver", "enterChatting", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/toast/ForwardSnackBarReceiver", "enterChatting", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        pm0.v.K(null, new bk5.d(context, str2));
    }
}
