package pr;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpr/c1;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class c1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f439229d = "MicroMsg.EmojiSyncLoaderIPC_data";

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String str = this.f439229d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "invoke: get data");
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle == null) {
            if (rVar != null) {
                rVar.a(bundle2);
                return;
            }
            return;
        }
        int i17 = bundle.getInt("custom_type");
        bundle2.putParcelable(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, pr.k0.f439256q.c(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "invoke get data: " + i17);
        if (rVar != null) {
            rVar.a(bundle2);
        }
    }
}
