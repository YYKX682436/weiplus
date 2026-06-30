package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public final class z5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g6 f273555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g6 g6Var) {
        super(0);
        this.f273555d = g6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent className = new android.content.Intent().setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "setClassName(...)");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g6 g6Var = this.f273555d;
        className.putExtra("Retr_Msg_Id", g6Var.f273178b.f273520j);
        className.putExtra("Retr_MsgTalker", g6Var.f273178b.f273521k);
        className.addFlags(268435456);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$dealMenuClick$5", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$dealMenuClick$5", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
