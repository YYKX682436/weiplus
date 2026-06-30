package wm3;

/* loaded from: classes3.dex */
public class l extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f528814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        ul5.k m78511x9f88d943;
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92;
        super.mo739xfd763ae1(bundle);
        if (this.f528814d) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf != null && (mo78514x143f1b92 = abstractActivityC21394xb3d2c0cf.mo78514x143f1b92()) != null) {
                mo78514x143f1b92.J();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = m158354x192630852 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852 : null;
            if (abstractActivityC21394xb3d2c0cf2 == null || (m78511x9f88d943 = abstractActivityC21394xb3d2c0cf2.m78511x9f88d943()) == null) {
                return;
            }
            m78511x9f88d943.mo82163x4e0f6657(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        this.f528814d = m158359x1e885992().getBooleanExtra("Contact_IsHalfScreen", false);
    }
}
