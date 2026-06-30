package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/multitask/p0;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    public p0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.HideMultiTaskUIC", "create add task info");
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle != null ? bundle.getString(dm.i4.f66865x76d1ec5a) : null;
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("type")) : null;
        java.lang.Integer valueOf2 = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("event_type")) : null;
        if (string == null || valueOf == null || valueOf2 == null) {
            return;
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.o0(valueOf.intValue(), string, valueOf2.intValue()));
    }
}
