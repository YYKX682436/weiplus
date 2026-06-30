package wu3;

/* loaded from: classes5.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e f531302d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e) {
        this.f531302d = c17040x9d8b708e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wt3.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = this.f531302d;
        if (c17040x9d8b708e.N || (eVar = c17040x9d8b708e.M) == null) {
            return;
        }
        eVar.f530936l.obtainMessage(1).sendToTarget();
    }
}
