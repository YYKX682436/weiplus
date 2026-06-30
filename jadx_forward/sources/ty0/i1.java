package ty0;

/* loaded from: classes4.dex */
public final class i1 implements n0.e4 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f504380d;

    @Override // n0.e4
    public void b() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ComposePagView", "onRemembered");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f504380d;
        boolean z17 = false;
        if (c22789xd23e9a9b2 != null && !c22789xd23e9a9b2.f()) {
            z17 = true;
        }
        if (!z17 || (c22789xd23e9a9b = this.f504380d) == null) {
            return;
        }
        c22789xd23e9a9b.g();
    }

    @Override // n0.e4
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ComposePagView", "onAbandoned");
        d();
    }

    @Override // n0.e4
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ComposePagView", "onForgotten");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f504380d;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.n();
        }
    }
}
