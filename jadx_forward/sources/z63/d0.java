package z63;

/* loaded from: classes5.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f551908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab f551909e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab, int i17) {
        this.f551909e = activityC16081x2d23fdab;
        this.f551908d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f551908d;
        if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = this.f551909e;
            activityC16081x2d23fdab.f223752e.smoothScrollBy(0, i17 + ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) activityC16081x2d23fdab.f223766v).getLineHeight());
        }
    }
}
