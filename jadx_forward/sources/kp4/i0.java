package kp4;

/* loaded from: classes10.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 f392648d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727) {
        this.f392648d = c18809x90659727;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727 = this.f392648d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae1456 = c18809x90659727.f257556d;
        if (c18811xb3ae1456 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c18811xb3ae1456.scrollBy(c18809x90659727.f257562m, 0);
        c18809x90659727.f257567r = false;
    }
}
