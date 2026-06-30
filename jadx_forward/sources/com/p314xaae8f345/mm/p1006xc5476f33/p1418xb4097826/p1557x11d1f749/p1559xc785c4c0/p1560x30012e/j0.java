package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e;

/* loaded from: classes10.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.q0 f202478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.q0 q0Var) {
        super(0);
        this.f202478d = q0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.n nVar = p012xc85e97e9.p093xedfae76a.n.INITIALIZED;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.q0 q0Var = this.f202478d;
        p012xc85e97e9.p093xedfae76a.b0 b0Var = q0Var.f202526f;
        p012xc85e97e9.p093xedfae76a.n nVar2 = b0Var.f93138c;
        if (nVar != nVar2) {
            p012xc85e97e9.p093xedfae76a.n nVar3 = p012xc85e97e9.p093xedfae76a.n.RESUMED;
            p012xc85e97e9.p093xedfae76a.b0 b0Var2 = q0Var.f202526f;
            if (nVar3 == nVar2) {
                b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
                b0Var2.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MegaVideoFlutterTabLifeCycle", "onDestroy called after resumed!!!");
            }
            b0Var2.f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
        }
        return jz5.f0.f384359a;
    }
}
