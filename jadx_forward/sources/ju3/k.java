package ju3;

/* loaded from: classes10.dex */
public final class k implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f383493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e f383494b;

    public k(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e c17012x9e3c2e) {
        this.f383493a = z17;
        this.f383494b = c17012x9e3c2e;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (!bool.booleanValue() || this.f383493a) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e c17012x9e3c2e = this.f383494b;
        c17012x9e3c2e.getClass();
        try {
            if (c17012x9e3c2e.ignoreLifeCycle) {
                return;
            }
            c17012x9e3c2e.f237325n.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CameraKitPluginLayout", e17, "handleLifecycleEvent error", new java.lang.Object[0]);
        }
    }
}
