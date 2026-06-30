package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class w implements ot0.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x f284043d;

    public w(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x xVar) {
        this.f284043d = xVar;
    }

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return true;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseHistoryListPresenter", "[requestExitSelectedMode] %s del ", java.lang.Thread.currentThread(), e3Var);
        if (e3Var == ot0.e3.del) {
            this.f284043d.f284060g.f284077g.m8146xced61ae5();
        }
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
        if (e3Var == ot0.e3.del) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v vVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v(this);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x xVar = this.f284043d;
            vVar.f279944d = xVar.f284059f.m124847x74d37ac6();
            xVar.f284060g.f284079i.remove(vVar);
            xVar.f284060g.f284080m.remove(vVar);
        }
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}
