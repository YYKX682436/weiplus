package qj4;

/* loaded from: classes11.dex */
public final class t extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ui();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPostDestroyed */
    public void mo47481x6449b5ba() {
        super.mo47481x6449b5ba();
        java.util.Stack stack = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).f445493e;
        if (stack.empty()) {
            return;
        }
        stack.pop();
    }
}
