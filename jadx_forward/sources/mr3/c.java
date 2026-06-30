package mr3;

/* loaded from: classes8.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mr3.d f412383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f412384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f412385f;

    public c(mr3.d dVar, android.app.Activity activity, int i17) {
        this.f412383d = dVar;
        this.f412384e = activity;
        this.f412385f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.app.Activity activity = this.f412384e;
        mr3.d dVar = this.f412383d;
        if (itemId == 1) {
            dVar.getClass();
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(activity, "android.permission.CAMERA", 16, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DescImageAddClicker", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), activity);
            if (a17) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                java.lang.String K = lp0.b.K();
                java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
                ((ub0.r) oVar).getClass();
                if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(activity, K, str, 100)) {
                    return;
                }
                dp.a.m125854x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igw), 1).show();
                return;
            }
            return;
        }
        int i18 = this.f412385f;
        if (itemId == 2) {
            int i19 = dVar.f412389d - i18;
            if (i19 > 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("max_select_count", i19);
                intent.putExtra("show_header_view", false);
                intent.putExtra("query_source_type", 19);
                intent.putExtra("send_btn_string", activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
                intent.addFlags(67108864);
                intent.putExtra("gallery_report_tag", 19);
                j45.l.n(activity, "gallery", ".ui.GalleryEntryUI", intent, 200);
                return;
            }
            return;
        }
        if (itemId != 3) {
            return;
        }
        java.lang.String str2 = dVar.f412386a;
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DescImageAddClicker", "targetUserName shouldn't be null");
            return;
        }
        int i27 = dVar.f412389d - i18;
        if (i27 > 0) {
            if (!(activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DescImageAddClicker", "selectChatImage: context is not MMFragmentActivity");
                return;
            }
            ((uv1.d) ((lo.k) i95.n0.c(lo.k.class))).wi((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity, str2, "image", i27, "", dVar.f412388c, mr3.a.f412380a);
        }
    }
}
