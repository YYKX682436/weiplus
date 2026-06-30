package b32;

/* loaded from: classes10.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 f99162d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 c13399xaee30621) {
        this.f99162d = c13399xaee30621;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 c13399xaee30621 = this.f99162d;
        c13399xaee30621.m54949xbd40714a();
        if (c13399xaee30621.f180265n.isEmpty()) {
            return;
        }
        java.util.Iterator it = c13399xaee30621.f180269r.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }
}
