package vh0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvh0/w2;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "(Ljava/lang/String;)V", "feature-yuanbao_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class w2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518526d;

    public w2(java.lang.String chatbotUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatbotUsername, "$chatbotUsername");
        this.f518526d = chatbotUsername;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String string = data.getString("chatbotUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        vh0.f3.hj(this.f518526d, string, data.getInt("cmd"));
    }
}
