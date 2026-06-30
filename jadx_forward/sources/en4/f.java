package en4;

/* loaded from: classes4.dex */
public final class f extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        R6(new en4.b(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.ogg);
        android.os.Bundle bundleExtra = m158354x19263085().getIntent().getBundleExtra("key_extra_data");
        if (bundleExtra == null || !bundleExtra.getBoolean("_openbusinessview_personal_center", false)) {
            return;
        }
        findViewById.post(new en4.c(findViewById));
    }
}
