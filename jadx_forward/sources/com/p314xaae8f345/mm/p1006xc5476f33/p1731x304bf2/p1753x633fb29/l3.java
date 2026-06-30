package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class l3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991 f221892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15925xf475065d f221893e;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15925xf475065d c15925xf475065d, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991 c5756xf590b991) {
        this.f221893e = c15925xf475065d;
        this.f221892d = c5756xf590b991;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload complete. total time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15925xf475065d.f221714g));
        if (bundle == null) {
            return;
        }
        this.f221893e.f(this.f221892d, bundle);
    }
}
