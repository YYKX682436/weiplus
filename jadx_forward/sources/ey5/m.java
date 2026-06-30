package ey5;

/* loaded from: classes13.dex */
public class m implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapPoiClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapPoiClickListener f339190a;

    public m(ey5.r rVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapPoiClickListener onMapPoiClickListener) {
        this.f339190a = onMapPoiClickListener;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapPoiClickListener
    /* renamed from: onClicked */
    public void mo99162x82f09148(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26055x88f0336e c26055x88f0336e) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4408x88f0336e c4408x88f0336e;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapPoiClickListener onMapPoiClickListener = this.f339190a;
        if (onMapPoiClickListener != null) {
            if (c26055x88f0336e == null) {
                c4408x88f0336e = null;
            } else if (c26055x88f0336e instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26037x46253a1) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26037x46253a1 c26037x46253a1 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26037x46253a1) c26055x88f0336e;
                c4408x88f0336e = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4404x46253a1(c26037x46253a1.m99624xfb82e301(), ey5.x.a(c26037x46253a1.m99626xa86cd69f()), c26037x46253a1.m99475xd2c0f6e5(), c26037x46253a1.m99476x266119d5(), c26037x46253a1.m99477x99599e01());
            } else {
                c4408x88f0336e = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4408x88f0336e(c26055x88f0336e.m99624xfb82e301(), ey5.x.a(c26055x88f0336e.m99626xa86cd69f()));
            }
            onMapPoiClickListener.mo14568x82f09148(c4408x88f0336e);
        }
    }
}
