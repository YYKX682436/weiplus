package nv2;

/* loaded from: classes10.dex */
public final class c2 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.e2 f422002a;

    public c2(nv2.e2 e2Var) {
        this.f422002a = e2Var;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        nv2.g2 task = (nv2.g2) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        nv2.e2 e2Var = nv2.e2.f422014d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ThankActionMgr", "task callback " + status);
        fp0.u uVar = fp0.u.f346823f;
        nv2.e2 e2Var2 = this.f422002a;
        if (status == uVar) {
            e2Var2.c();
            return;
        }
        if (task.f422035g) {
            e2Var2.f422016b.add(task.f422034f);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(e2Var2.f422017c);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(e2Var2.f422017c, nv2.a.f421964a);
    }
}
