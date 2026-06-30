package bm2;

/* loaded from: classes3.dex */
public final class d2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f103373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bm2.f2 f103374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bm2.b2 f103375c;

    public d2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, bm2.f2 f2Var, bm2.b2 b2Var) {
        this.f103373a = z2Var;
        this.f103374b = f2Var;
        this.f103375c = b2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        this.f103373a.B();
        yz5.l lVar = this.f103374b.f103416e;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f103375c);
        }
    }
}
