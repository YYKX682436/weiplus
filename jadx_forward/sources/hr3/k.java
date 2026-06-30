package hr3;

/* loaded from: classes.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f f365240d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f) {
        this.f365240d = activityC16833xebe5488f;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f = this.f365240d;
        if (itemId != 1) {
            if (itemId == 2 && (i18 = 3 - activityC16833xebe5488f.f235169o) > 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("max_select_count", i18);
                intent.putExtra("show_header_view", false);
                intent.putExtra("query_source_type", 19);
                intent.putExtra("send_btn_string", activityC16833xebe5488f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
                intent.addFlags(67108864);
                intent.putExtra("gallery_report_tag", 19);
                j45.l.n(activityC16833xebe5488f, "gallery", ".ui.GalleryEntryUI", intent, 200);
                return;
            }
            return;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f.B;
        activityC16833xebe5488f.getClass();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16833xebe5488f.mo55332x76847179();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(mo55332x76847179, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.AddDescriptionUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), activityC16833xebe5488f.mo55332x76847179());
        if (a17) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String K = lp0.b.K();
            java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
            ((ub0.r) oVar).getClass();
            if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(activityC16833xebe5488f, K, str, 100)) {
                return;
            }
            dp.a.m125854x26a183b(activityC16833xebe5488f, activityC16833xebe5488f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igw), 1).show();
        }
    }
}
