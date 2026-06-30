package hr3;

/* loaded from: classes.dex */
public final class kf implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365259d;

    public kf(hr3.pf pfVar) {
        this.f365259d = pfVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        hr3.pf pfVar = this.f365259d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            pfVar.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("max_select_count", 1);
            intent.putExtra("show_header_view", false);
            intent.putExtra("query_source_type", 19);
            intent.putExtra("send_btn_string", pfVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
            intent.addFlags(67108864);
            j45.l.n(pfVar.m158354x19263085(), "gallery", ".ui.GalleryEntryUI", intent, 102);
            return;
        }
        pfVar.getClass();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = pfVar.m158354x19263085();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(m158354x19263085, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), pfVar.m80379x76847179());
        if (a17) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = pfVar.m158354x19263085();
            java.lang.String K = lp0.b.K();
            java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
            ((ub0.r) oVar).getClass();
            if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(m158354x192630852, K, str, 101)) {
                return;
            }
            dp.a.m125854x26a183b(pfVar.m158354x19263085(), pfVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.igw), 1).show();
        }
    }
}
