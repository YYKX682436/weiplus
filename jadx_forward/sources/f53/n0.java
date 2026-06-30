package f53;

/* loaded from: classes5.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341212d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341212d = activityC15905x15a0ec7b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341212d;
        activityC15905x15a0ec7b.X6().setVisibility(8);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = activityC15905x15a0ec7b.f221544d;
        if (abstractC19636xc6b37291 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b37291.i();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = activityC15905x15a0ec7b.f221544d;
        if (abstractC19636xc6b372912 != null) {
            abstractC19636xc6b372912.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
    }
}
