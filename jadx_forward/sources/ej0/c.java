package ej0;

/* loaded from: classes9.dex */
public class c implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IWalletTenpayKBStateCallBackListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 f334805a;

    public c(com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 activityC10720x85cbbee2) {
        this.f334805a = activityC10720x85cbbee2;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IWalletTenpayKBStateCallBackListener
    /* renamed from: onCallBackKinda */
    public void mo26066xff698e49(boolean z17, float f17, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 activityC10720x85cbbee2 = this.f334805a;
        if (abstractViewOnTouchListenerC3283x43ef4061 == null) {
            abstractViewOnTouchListenerC3283x43ef4061 = activityC10720x85cbbee2.f149686f.m26138x80f8f943();
        }
        float c17 = f17 <= 0.0f ? 230.0f : i65.a.c(activityC10720x85cbbee2.mo55332x76847179(), (int) f17);
        if (abstractViewOnTouchListenerC3283x43ef4061 != null) {
            boolean z18 = false;
            if (!z17) {
                abstractViewOnTouchListenerC3283x43ef4061.mo25466x81b60303(false, (int) c17);
                return;
            }
            abstractViewOnTouchListenerC3283x43ef4061.mo25466x81b60303(true, (int) c17);
            if (activityC10720x85cbbee2.f149695r) {
                return;
            }
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 m26049x99e0b15d = activityC10720x85cbbee2.m26049x99e0b15d();
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 m26051x7f323baf = activityC10720x85cbbee2.m26051x7f323baf();
            if (m26049x99e0b15d == null || m26051x7f323baf == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "Keyboard or EditText not found");
            } else {
                ej0.g gVar = new ej0.g(null);
                m26049x99e0b15d.m121471xcc7da8b2(gVar);
                fo3.s.INSTANCE.lj(new ej0.d(activityC10720x85cbbee2, gVar));
                m26051x7f323baf.m121632xc90120ff(new ej0.e(activityC10720x85cbbee2, m26051x7f323baf));
                z18 = true;
            }
            activityC10720x85cbbee2.f149695r = z18;
        }
    }
}
