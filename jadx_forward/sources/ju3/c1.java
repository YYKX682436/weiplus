package ju3;

/* loaded from: classes10.dex */
public final class c1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f383455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17020xf8b8139d f383456b;

    public c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17020xf8b8139d c17020xf8b8139d) {
        this.f383455a = z17;
        this.f383456b = c17020xf8b8139d;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (!bool.booleanValue() || this.f383455a) {
            return;
        }
        this.f383456b.T.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
    }
}
