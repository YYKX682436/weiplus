package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class g5 implements p012xc85e97e9.p093xedfae76a.y, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f171985d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f171986e;

    public g5(int i17, im5.c lifecycleKeeper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleKeeper, "lifecycleKeeper");
        this.f171985d = "MicroMsg.VendingLifecycleAdapter#" + i17;
        p012xc85e97e9.p093xedfae76a.b0 b0Var = new p012xc85e97e9.p093xedfae76a.b0(this, true);
        this.f171986e = b0Var;
        lifecycleKeeper.mo46316x322b85(this);
        b0Var.i(p012xc85e97e9.p093xedfae76a.n.CREATED);
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f171985d, "dead");
        this.f171986e.i(p012xc85e97e9.p093xedfae76a.n.DESTROYED);
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f171986e;
    }
}
