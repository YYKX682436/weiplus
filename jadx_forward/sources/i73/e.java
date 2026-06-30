package i73;

@j95.b
/* loaded from: classes12.dex */
public class e extends i95.w implements j73.e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f370980d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f370981e = new java.util.concurrent.ConcurrentLinkedQueue();

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            km5.q qVar = new km5.q();
            qVar.y(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            km5.q qVar2 = (km5.q) qVar.i(new l73.a()).q(new l73.b(false));
            qVar2.s(new i73.C28494x2e755c(this));
            qVar2.a(new i73.C28495x2e755d(this));
            return;
        }
        km5.q qVar3 = new km5.q();
        qVar3.y(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        km5.q qVar4 = (km5.q) qVar3.i(new l73.a());
        qVar4.s(new i73.C28494x2e755c(this));
        qVar4.a(new i73.C28495x2e755d(this));
    }

    public final void wi(boolean z17) {
        synchronized (this) {
            this.f370980d = z17;
            java.util.Iterator it = this.f370981e.iterator();
            if (it.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                if (this.f370980d) {
                    k73.a.b().a();
                }
                throw null;
            }
            this.f370981e.clear();
        }
    }
}
