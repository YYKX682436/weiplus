package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/feature/api/screenshot/q;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class q implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.e7 e7Var;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            return;
        }
        boolean z17 = bundle.getBoolean("isRegister");
        java.lang.String string = bundle.getString("callbackProcess");
        if (string == null || (e7Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274392d) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p) e7Var).a(string, z17);
    }
}
