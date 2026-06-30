package bt1;

/* loaded from: classes4.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bt1.l f24163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f24164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24165c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f24166d;

    public j(bt1.l lVar, java.util.List list, int i17, fp0.r rVar) {
        this.f24163a = lVar;
        this.f24164b = list;
        this.f24165c = i17;
        this.f24166d = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        fp0.r rVar = this.f24166d;
        try {
            int i17 = fVar.f70615a;
            bt1.l lVar = this.f24163a;
            if (i17 == 0 && fVar.f70616b == 0) {
                java.util.LinkedList resp_continue_flag = ((r45.xr) fVar.f70618d).f390348d;
                kotlin.jvm.internal.o.f(resp_continue_flag, "resp_continue_flag");
                if (!resp_continue_flag.isEmpty()) {
                    bt1.l lVar2 = this.f24163a;
                    java.util.LinkedList resp_continue_flag2 = ((r45.xr) fVar.f70618d).f390348d;
                    kotlin.jvm.internal.o.f(resp_continue_flag2, "resp_continue_flag");
                    bt1.l.b(lVar2, resp_continue_flag2, bt1.g.f24155h, true, 0, 8, null);
                }
                android.os.Message obtainMessage = lVar.f24173c.obtainMessage(1, ((r45.xr) fVar.f70618d).f390350f);
                java.util.LinkedList resp_continue_flag3 = ((r45.xr) fVar.f70618d).f390348d;
                kotlin.jvm.internal.o.f(resp_continue_flag3, "resp_continue_flag");
                obtainMessage.arg1 = !resp_continue_flag3.isEmpty() ? 1 : 0;
                obtainMessage.sendToTarget();
            } else {
                if (i17 != 3) {
                    lVar.a(this.f24164b, bt1.g.f24156i, false, this.f24165c + 1);
                }
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(20845, java.lang.Integer.valueOf(fVar.f70615a), 1, fVar.f70615a + ':' + fVar.f70616b + ':' + fVar.f70617c, 1);
                g0Var.C(1465L, 100L, 1L);
                g0Var.C(1465L, ((long) 100) + ((long) fVar.f70615a), 1L);
            }
            rVar.b(fp0.u.f265290f);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            rVar.b(fp0.u.f265290f);
            throw th6;
        }
    }
}
