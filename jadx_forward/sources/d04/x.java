package d04;

/* loaded from: classes13.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f307078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f307079e;

    public x(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb) {
        this.f307078d = i17;
        this.f307079e = c17326x8613bffb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f307078d;
        if (i17 < 2) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb.H1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb = this.f307079e;
            c17326x8613bffb.getClass();
            c17326x8613bffb.G(1.0f, 0.8f, c17326x8613bffb.f241222p1, new d04.v(c17326x8613bffb, new d04.y(i17 + 1, c17326x8613bffb)));
        }
    }
}
