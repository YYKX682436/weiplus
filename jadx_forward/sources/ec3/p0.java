package ec3;

/* loaded from: classes.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332610e;

    public p0(ec3.g1 g1Var, int i17) {
        this.f332609d = g1Var;
        this.f332610e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 viewOnFocusChangeListenerC22901x93fec4d2;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = this.f332609d.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        if (activityC16373x8a110f13 == null || (viewOnFocusChangeListenerC22901x93fec4d2 = activityC16373x8a110f13.f227818x) == null) {
            return;
        }
        viewOnFocusChangeListenerC22901x93fec4d2.smoothScrollBy(0, this.f332610e);
    }
}
