package qe5;

/* loaded from: classes3.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.w0 f443729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(qe5.w0 w0Var) {
        super(0);
        this.f443729d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f443729d.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        qe5.n1 n1Var = (qe5.n1) pf5.z.f435481a.a(activity).a(qe5.n1.class);
        kd5.e T6 = n1Var.T6();
        java.lang.Long valueOf = T6 != null ? java.lang.Long.valueOf(T6.f388412g) : null;
        kd5.e T62 = n1Var.T6();
        java.lang.String str = T62 != null ? T62.f388413h : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = n1Var.P6();
        if (P6 != null) {
            android.content.Intent intent = new android.content.Intent(P6, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
            intent.putExtra("msg_local_id", valueOf);
            intent.putExtra("finish_direct", true);
            intent.putExtra("show_search_chat_content_result", true);
            intent.putExtra("need_hight_item", true);
            intent.putExtra("Chat_User", str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(P6, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC", "doGotoChatting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            P6.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(P6, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC", "doGotoChatting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
