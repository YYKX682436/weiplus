package vh4;

/* loaded from: classes.dex */
public class d2 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh4.e f518600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh4.t1 f518601b;

    public d2(vh4.t1 t1Var, uh4.e eVar) {
        this.f518601b = t1Var;
        this.f518600a = eVar;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("operationType");
        boolean mo27542xfb7da360 = abstractC3411xcfaed72e.mo27542xfb7da360("operationSuccess");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mo27544xb58848b9);
        objArr[1] = mo27542xfb7da360 ? ya.b.f77504xbb80cbe3 : "fail";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "callback from TeenagerModeOperationUseCase, operationType: %s, operationSuccess: %s", objArr);
        if (mo27544xb58848b9 != uh4.b0.TeenagerModeOperationType_OPEN.f509511d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "callback from TeenagerModeOperationUseCase, close or unknown, do nothing");
            return;
        }
        uh4.e eVar = this.f518600a;
        if (!mo27542xfb7da360) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TeenModeService", "callback from TeenagerModeOperationUseCase, open fail, callback onChangeLimitedModeFail");
            dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f575378pb5, 0).show();
            if (eVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.v4) eVar).a(false);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "callback from TeenagerModeOperationUseCase, open success, continue oplog");
        vh4.t1 t1Var = this.f518601b;
        t1Var.getClass();
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 59;
        p53Var.f464295e = 1;
        if (((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "enableTeenMode: set ticket");
            r45.cu5 cu5Var = new r45.cu5();
            p53Var.f464296f = cu5Var;
            cu5Var.d(((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h.getBytes());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TeenModeService", "enableTeenMode: ticket null");
        }
        p53Var.f464297g = ((vh4.t1) i95.n0.c(vh4.t1.class)).f518672i;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new xg3.p0(23, p53Var));
        e21.j jVar = new e21.j(linkedList);
        gm0.j1.i();
        jVar.mo807x6c193ac1(gm0.j1.n().f354821b.f152297d, new vh4.e2(t1Var, eVar));
    }
}
