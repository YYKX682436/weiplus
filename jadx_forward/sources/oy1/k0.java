package oy1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loy1/k0;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-data-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class k0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        int i17;
        byte[] byteArray;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (i17 = bundle.getInt("other_process_add_msg_id")) <= 0 || (byteArray = bundle.getByteArray("other_process_add_msg")) == null) {
            return;
        }
        r45.uc4 uc4Var = new r45.uc4();
        uc4Var.mo11468x92b714fd(byteArray);
        oy1.q0 q0Var = oy1.q0.f431452d;
        r45.pq5 itemData = uc4Var.f468751e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemData, "itemData");
        q0Var.d(i17, itemData);
        oy1.c0 a17 = oy1.u.f431461a.a(i17);
        if (a17 != null) {
            a17.e(uc4Var);
        }
    }
}
