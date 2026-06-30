package qf0;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final qf0.s f443785d = new qf0.s();

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        xn4.e0 e0Var = xn4.e0.f537147d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_COMM_KV").getBoolean("MMKV_KEY_NeedNotifyFlag", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateManager", "tryNotifyUpdateWithRedDotAndDialog " + z17);
        if (z17) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_COMM_KV").getString("MMKV_KEY_LastNotifyMd5", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateManager", "notifyChangeIfNeed " + string + ' ' + e0Var.b().f462204g);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, e0Var.b().f462204g)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_COMM_KV").putString("MMKV_KEY_LastNotifyMd5", e0Var.b().f462204g);
                java.util.Iterator it = ((java.util.ArrayList) xn4.e0.f537155o).iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.mo146xb9724478(e0Var.b());
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        it.remove();
                    }
                }
            }
            e0Var.h(false, "notify success");
        }
    }
}
