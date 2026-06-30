package xq;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.m f537520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f537521e;

    public l(xq.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366) {
        this.f537520d = mVar;
        this.f537521e = c16077xb54fe366;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xq.m mVar = this.f537520d;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar = mVar.f537530i;
        if (uVar != null) {
            uVar.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar2 = mVar.f537530i;
        if (uVar2 != null) {
            uVar2.P = new xq.k(mVar, this.f537521e);
        }
    }
}
