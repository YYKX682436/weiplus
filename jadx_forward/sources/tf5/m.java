package tf5;

/* loaded from: classes5.dex */
public final class m extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public long f500536d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f500537e;

    static {
        new tf5.l(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f500536d = c01.id.c();
    }

    public static final void O6(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        android.content.Context context = view.getContext();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "addressbook_cell");
        aVar.fk(view, "addressbook_cell_type", java.lang.Integer.valueOf(i17));
        aVar.Ai(view, new tf5.k(context));
        aVar.ik(view, 8, 33926);
    }

    public final void P6(java.lang.String str) {
        if (this.f500537e) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", kz5.c1.l(new jz5.l("page_sessionid", java.lang.Long.valueOf(this.f500536d)), new jz5.l("view_id", str)), 33926);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        P6("search_button_contact_tab");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onStartActivityForResult */
    public void mo14640xb30cf874(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        android.content.ComponentName component;
        super.mo14640xb30cf874(intent, i17, bundle);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((intent == null || (component = intent.getComponent()) == null) ? null : component.getClassName(), com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98.class.getName())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmAddressReportUIC", "onStartActivityForResult() FMessageConversationUI");
            if (intent != null) {
                pf5.j0.a(intent, tf5.j.class);
                intent.putExtra("MvvmAddressReportUIC_session_id", this.f500536d);
            }
        }
    }
}
