package re5;

/* loaded from: classes8.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2769xc43d2152.C22724xdb26ef0b f476118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg3.c f476119e;

    public o(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2769xc43d2152.C22724xdb26ef0b c22724xdb26ef0b, gg3.c cVar) {
        this.f476118d = c22724xdb26ef0b;
        this.f476119e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String q17 = com.p314xaae8f345.mm.vfs.w6.q(this.f476119e.f353262d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2769xc43d2152.C22724xdb26ef0b c22724xdb26ef0b = this.f476118d;
        c22724xdb26ef0b.setText(q17);
        c22724xdb26ef0b.invalidate();
    }
}
