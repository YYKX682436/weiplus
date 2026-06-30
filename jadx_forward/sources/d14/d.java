package d14;

/* loaded from: classes11.dex */
public class d extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f307263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f307264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f307266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f307267i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d14.f f307268m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d14.f fVar, int i17, r35.m3 m3Var, java.util.Map map, android.os.Bundle bundle, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.String str2, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f307268m = fVar;
        this.f307263e = map;
        this.f307264f = bundle;
        this.f307265g = str;
        this.f307266h = weakReference;
        this.f307267i = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        java.lang.String str;
        java.util.Map map;
        d14.f fVar = this.f307268m;
        fVar.getClass();
        int i17 = 0;
        while (true) {
            str = ".sysmsg.sysmsgtemplate.content_template.link_list.link";
            if (i17 != 0) {
                str = ".sysmsg.sysmsgtemplate.content_template.link_list.link" + i17;
            }
            map = this.f307263e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(str))) {
                str = null;
                break;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0((java.lang.String) map.get(str + ".$type"), "link_history")) {
                break;
            } else {
                i17++;
            }
        }
        android.os.Bundle bundle = this.f307264f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f307265g, bundle.getLong("msg_id"));
        boolean z17 = (Li.F & 4096) > 0;
        java.lang.ref.WeakReference weakReference = this.f307266h;
        if (z17) {
            db5.e1.y((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.htv), "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new d14.c(this));
        } else if (weakReference != null) {
            try {
                if (weakReference.get() != null) {
                    fVar.f307275f = bundle.getLong("msg_sever_id");
                    fVar.f307276g = bundle.getString("conv_talker_username");
                    fVar.f307277h = bundle.getString("send_msg_username");
                    long m124847x74d37ac6 = Li.m124847x74d37ac6();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wcf://selectrecord/");
                    sg3.r.aj();
                    sb6.append(m124847x74d37ac6);
                    java.lang.String sb7 = sb6.toString();
                    fVar.f307278i = sb7;
                    if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
                        d14.f.e(Li.m124847x74d37ac6(), fVar.f307275f, fVar.f307277h, fVar.f307276g, new java.lang.String(com.p314xaae8f345.mm.vfs.w6.N(fVar.f307278i, 0, -1)));
                    } else {
                        fVar.f307279m = true;
                        android.content.Context context = (android.content.Context) weakReference.get();
                        android.app.ProgressDialog progressDialog = fVar.f307274e;
                        if (progressDialog == null) {
                            fVar.f307274e = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, true, new d14.e(fVar));
                        } else if (!progressDialog.isShowing()) {
                            fVar.f307274e.show();
                        }
                        d14.f.h(Li, map, str, "tmpl_type_profilewithrevoke", fVar);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        java.lang.String string = bundle.getString("conv_talker_username", null);
        int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(bundle.getString("template_type"), "tmpl_type_profilewithrevoke") ^ true ? 2 : 1;
        long parseLong = java.lang.Long.parseLong(Li.Y1());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6870x3c5d54a3 c6870x3c5d54a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6870x3c5d54a3();
        c6870x3c5d54a3.f141879d = c6870x3c5d54a3.b("RoomId", string, true);
        c6870x3c5d54a3.f141880e = i18;
        c6870x3c5d54a3.f141881f = parseLong;
        c6870x3c5d54a3.n();
        c6870x3c5d54a3.k();
        ((ih3.e) ((tg3.k1) i95.n0.c(tg3.k1.class))).Di("link_history", this.f307263e, this.f307264f, this.f307266h, this.f307267i);
    }
}
