package d04;

/* loaded from: classes13.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f307044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d04.y f307045e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb, d04.y yVar) {
        this.f307044d = c17326x8613bffb;
        this.f307045e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb = this.f307044d;
        c17326x8613bffb.G(0.8f, 1.0f, c17326x8613bffb.f241225x1, this.f307045e);
    }
}
