package w35;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw35/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "ui-appchooser_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        long j17 = data.getLong("msgId");
        java.lang.String string = data.getString("msgTalker");
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = android.os.Build.VERSION.SDK_INT >= 33 ? (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) data.getParcelable("deviceInfo", com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2.class) : (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) data.getParcelable("deviceInfo");
        j30.m mVar = (j30.m) i95.n0.c(j30.m.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((gb0.i) mVar).Bi(context, j17, string, c10597xb1f0d2);
    }
}
