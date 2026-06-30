package bk5;

/* loaded from: classes.dex */
public final class b implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.toast.ForwardSnackBarReceiver f21650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f21651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21653d;

    public b(com.tencent.mm.ui.toast.ForwardSnackBarReceiver forwardSnackBarReceiver, android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f21650a = forwardSnackBarReceiver;
        this.f21651b = context;
        this.f21652c = str;
        this.f21653d = str2;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public final void a() {
        int i17 = com.tencent.mm.ui.toast.ForwardSnackBarReceiver.f209957a;
        this.f21650a.getClass();
        android.content.Context context = this.f21651b;
        if (context == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EnterChattingAfterTrans enterChatting toUsername=");
        java.lang.String str = this.f21652c;
        sb6.append(str);
        sb6.append(" fromUsername=");
        java.lang.String str2 = this.f21653d;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("WeToastStarter", sb6.toString());
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
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
