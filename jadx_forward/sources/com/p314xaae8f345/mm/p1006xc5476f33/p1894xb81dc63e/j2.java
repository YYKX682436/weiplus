package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/multitask/j2;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class j2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    public j2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.ReportTaskInfoTask", "create report task info");
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            int i17 = bundle.getInt("reporttype");
            byte[] byteArray = bundle.getByteArray("reportdata");
            r45.kr4 kr4Var = new r45.kr4();
            if (byteArray != null) {
                try {
                    kr4Var.mo11468x92b714fd(byteArray);
                } catch (java.lang.Exception unused) {
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).getClass();
            if (i17 != 2) {
                if (i17 != 3) {
                    return;
                }
                nk3.f.f419574a.e(kr4Var);
            } else {
                nk3.f fVar = nk3.f.f419574a;
                fVar.f(kr4Var);
                fVar.g(kr4Var.m75939xb282bd08(3), (r45.jr4) kr4Var.m75936x14adae67(8));
            }
        }
    }
}
