package xq;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.m f537518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f537519e;

    public k(xq.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366) {
        this.f537518d = mVar;
        this.f537519e = c16077xb54fe366;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xq.m mVar = this.f537518d;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar = mVar.f537530i;
        if (uVar != null) {
            uVar.f223723d = false;
        }
        this.f537519e.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).withEndAction(new xq.j(mVar));
    }
}
