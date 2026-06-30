package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/multitask/a;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f231941d = "MicroMsg.MultiTask.AddTaskInfoTask";

    public a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.AddTaskInfoTask", "create add task info");
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            java.lang.String string = bundle.getString(dm.i4.f66865x76d1ec5a);
            int i17 = bundle.getInt("type");
            boolean z17 = bundle.getBoolean("starOpt");
            boolean z18 = bundle.getBoolean("isSync");
            byte[] byteArray = bundle.getByteArray("showData");
            if (string == null || byteArray == null) {
                return;
            }
            r45.lr4 lr4Var = new r45.lr4();
            try {
                lr4Var.mo11468x92b714fd(byteArray);
            } catch (java.lang.Exception unused) {
            }
            java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a.b(string);
            java.lang.String string2 = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (string2 == null) {
                string2 = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) || !com.p314xaae8f345.mm.vfs.w6.j(string2)) {
                lr4Var.set(7, java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.vfs.w6.j(b17)));
            } else {
                if (com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                    com.p314xaae8f345.mm.vfs.w6.h(b17);
                }
                com.p314xaae8f345.mm.vfs.w6.w(string2, b17);
                n11.a.b().p(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.f232034a.a(b17, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232040b));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231941d, "move tempPath:" + string2 + " to path:" + b17);
            }
            byte[] byteArray2 = bundle.getByteArray("reportdata");
            r45.kr4 kr4Var = new r45.kr4();
            if (byteArray2 != null) {
                try {
                    kr4Var.mo11468x92b714fd(byteArray2);
                } catch (java.lang.Exception unused2) {
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).wi(string, i17, lr4Var, bundle.getByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306), new mk3.a(kr4Var, z17, z18));
        }
    }
}
