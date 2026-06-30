package pa2;

/* loaded from: classes2.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa2.g f434502d;

    public b(pa2.g gVar) {
        this.f434502d = gVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem != null && menuItem.getItemId() == 10001) {
            pa2.g gVar = this.f434502d;
            java.lang.String B = gVar.B();
            if (B.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderTemplateShareHandler", "doUnpublish: templateId is empty");
                return;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = gVar.f515691a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC0065xcd7aa112, activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 0, null);
            java.lang.String stringExtra = activityC0065xcd7aa112.getIntent().getStringExtra("key_finder_user_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            new cq.k();
            pm0.v.T(new bq.x1(stringExtra, B).l(), new cq.r0(new pa2.d(f17, gVar), new pa2.e(f17, gVar)));
        }
    }
}
