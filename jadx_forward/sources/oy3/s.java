package oy3;

/* loaded from: classes13.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 f431575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f431576e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4, int i17) {
        this.f431575d = activityC17256xc70b42d4;
        this.f431576e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f c22703xb395948f = this.f431575d.f240129n;
        if (c22703xb395948f == null) {
            return;
        }
        c22703xb395948f.m82049x3ae760af(this.f431576e);
    }
}
