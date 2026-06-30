package mr3;

/* loaded from: classes.dex */
public final class w extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.app.Activity m80379x76847179 = m80379x76847179();
        if (!(m80379x76847179 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileChooseMsgFileListUIC", "onCreate: context is not MMActivity");
            return;
        }
        m80379x76847179.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, 0);
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179).m78609x92231eec(m80379x76847179.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562259b6));
        android.view.View findViewById = m80379x76847179.findViewById(com.p314xaae8f345.mm.R.id.uno);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/mod/desc_image/ProfileChooseMsgFileListUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/mod/desc_image/ProfileChooseMsgFileListUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        if (!(m80379x76847179() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileChooseMsgFileListUIC", "onCreate: context is not MMActivity");
            return;
        }
        try {
            m158359x1e885992().putExtra("MMActivity.OverrideEnterAnimation", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IntentUtil", e17, "", new java.lang.Object[0]);
        }
        try {
            m158359x1e885992().putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IntentUtil", e18, "", new java.lang.Object[0]);
        }
    }
}
