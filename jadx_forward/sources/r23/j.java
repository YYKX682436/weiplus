package r23;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final r23.j f450360a = new r23.j();

    /* renamed from: b, reason: collision with root package name */
    public static r23.c f450361b;

    /* renamed from: c, reason: collision with root package name */
    public static r23.n f450362c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.ref.WeakReference f450363d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.ref.WeakReference f450364e;

    /* renamed from: f, reason: collision with root package name */
    public static r45.ib6 f450365f;

    /* renamed from: g, reason: collision with root package name */
    public static int f450366g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f450367h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f450368i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f450369j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f450370k;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd) {
        r45.ib6 ib6Var;
        byte[] byteArrayExtra;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append(" bind ui:");
        sb6.append(activityC15653x403456cd != null ? java.lang.Integer.valueOf(activityC15653x403456cd.hashCode()) : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandle", sb6.toString());
        if (activityC15653x403456cd == null) {
            return;
        }
        f450363d = new java.lang.ref.WeakReference(activityC15653x403456cd);
        r23.c cVar = f450361b;
        if (cVar != null) {
            cVar.f450343d = null;
        }
        java.lang.Integer num = cVar != null ? (java.lang.Integer) cVar.f450347h.mo3195x754a37bb() : null;
        f450361b = null;
        android.content.Intent intent = activityC15653x403456cd.getIntent();
        if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("album_template_info")) == null) {
            ib6Var = null;
        } else {
            ib6Var = new r45.ib6();
            try {
                ib6Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        f450365f = ib6Var;
        r23.c cVar2 = new r23.c(new java.lang.ref.WeakReference(activityC15653x403456cd), f450365f);
        cVar2.f450354r = r23.e.f450355d;
        if (num != null) {
            int intValue = num.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTemplateUI", "setSelectStateValue: " + intValue);
            cVar2.f450346g.mo523x53d8522f(java.lang.Integer.valueOf(intValue));
        }
        f450361b = cVar2;
        p012xc85e97e9.p093xedfae76a.g0 g0Var = cVar2.f450347h;
        if (g0Var != null) {
            g0Var.mo7806x9d92d11c(activityC15653x403456cd, r23.f.f450356d);
        }
        e33.b0 b0Var = activityC15653x403456cd.f220061m;
        java.util.ArrayList arrayList = b0Var != null ? b0Var.f328664g : null;
        if (arrayList != null) {
            d(arrayList);
        }
    }

    public final boolean b(java.util.ArrayList mediaList, yz5.a onRequestResult) {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd;
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRequestResult, "onRequestResult");
        java.lang.ref.WeakReference weakReference = f450363d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd2 = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) weakReference.get() : null;
        r23.c cVar = f450361b;
        if (cVar != null && cVar.f450345f) {
            if (((cVar != null && cVar.a()) || f450368i) && activityC15653x403456cd2 != null) {
                ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
                vy0.g gVar = vy0.g.f522947a;
                if (!gVar.a("scene_sns_v2")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandle", "onSendItemClick no permission, permissionRequesting: " + f450370k);
                    if (f450370k) {
                        return true;
                    }
                    f450370k = true;
                    dx1.g.f326022a.j("SnsPublishProcess", "permissionSheetCnt", 1, bx1.u.f117843e);
                    ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
                    java.lang.ref.WeakReference weakReference2 = f450363d;
                    if (weakReference2 == null || (activityC15653x403456cd = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) weakReference2.get()) == null || (context = activityC15653x403456cd.mo55332x76847179()) == null) {
                        context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                    gVar.c("scene_sns_v2", context, new r23.g(onRequestResult), r23.h.f450358d);
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandle", "onSendItemClick has permission");
                r45.ib6 ib6Var = f450365f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandle", "jumpToTemplatePage");
                dx1.g.f326022a.j("SnsPublishProcess", "egsessionCnt", 1, bx1.u.f117843e);
                uy0.h hVar = (uy0.h) i95.n0.c(uy0.h.class);
                android.content.Intent intent = new android.content.Intent();
                if (ib6Var != null) {
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(intent.putExtra("key_video_template_info", ib6Var.mo14344x5f01b1f6()));
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                    java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                    if (m143898xd4a2fc34 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MJTemplateHandle", m143898xd4a2fc34, "to array error", new java.lang.Object[0]);
                    }
                    intent.putExtra("key_maas_entrance", 101);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandle", "cut same");
                } else {
                    intent.putExtra("key_maas_entrance", 100);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandle", "post main");
                }
                ((ez0.i) hVar).getClass();
                com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p919x7e63ca91.ActivityC11007x7cb63ad9.f151289g.a(activityC15653x403456cd2, intent, 4384, sy0.b.f495359d, mediaList, null);
                return true;
            }
        }
        return false;
    }

    public final void c() {
        f450369j = true;
        dx1.f fVar = dx1.g.f326022a;
        r23.c cVar = f450361b;
        int i17 = 0;
        if (cVar != null) {
            r45.ib6 ib6Var = cVar.f450344e;
            i17 = (ib6Var != null ? ib6Var.f458443e : null) != null ? 3 : cVar.f450353q;
        }
        fVar.i("SnsTemplate", ya.b.f77502x92235c1b, java.lang.Integer.valueOf(i17));
        java.lang.String wi6 = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wi6, "checkSnsPostSessionId(...)");
        fVar.i("SnsTemplate", "sessionID", wi6);
        dx1.f.b(fVar, "SnsTemplate", false, false, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r9) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r23.j.d(java.util.ArrayList):void");
    }
}
