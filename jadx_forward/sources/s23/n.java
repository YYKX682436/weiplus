package s23;

/* loaded from: classes4.dex */
public final class n implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.n f483842d = new s23.n();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f483843e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.ArrayList f483844f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static s23.o f483845g;

    /* renamed from: h, reason: collision with root package name */
    public static r45.ib6 f483846h;

    /* renamed from: i, reason: collision with root package name */
    public static int f483847i;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f483848m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f483849n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f483850o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f483851p;

    /* renamed from: q, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.i0 f483852q;

    /* renamed from: r, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.i0 f483853r;

    /* renamed from: s, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.k0 f483854s;

    /* renamed from: t, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.k0 f483855t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f483856u;

    /* renamed from: v, reason: collision with root package name */
    public static int f483857v;

    /* renamed from: w, reason: collision with root package name */
    public static long f483858w;

    /* renamed from: x, reason: collision with root package name */
    public static java.lang.ref.WeakReference f483859x;

    /* renamed from: y, reason: collision with root package name */
    public static final yz5.a f483860y;

    static {
        p012xc85e97e9.p093xedfae76a.i0 i0Var = new p012xc85e97e9.p093xedfae76a.i0();
        f483852q = i0Var;
        p012xc85e97e9.p093xedfae76a.i0 i0Var2 = new p012xc85e97e9.p093xedfae76a.i0();
        f483853r = i0Var2;
        f483854s = s23.l.f483840d;
        f483855t = s23.g.f483836d;
        f483857v = -1;
        f483860y = s23.m.f483841d;
        s23.a[] aVarArr = s23.a.f483830d;
        i0Var.mo523x53d8522f(0);
        i0Var2.mo523x53d8522f("");
    }

    public final void a(final s23.o templateView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateView, "templateView");
        java.util.ArrayList arrayList = f483844f;
        if (arrayList.contains(templateView)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MJTemplateHandleNew", "[" + hashCode() + " already bind ui:" + templateView.hashCode() + ", return]");
            return;
        }
        dx1.f fVar = dx1.g.f326022a;
        java.lang.String d17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6907x7ba2ad3b.class).d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        fVar.g("SnsTemplate", d17);
        f483850o = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", "[" + hashCode() + " bind ui:" + templateView.hashCode() + ']');
        arrayList.add(templateView);
        f483845g = templateView;
        s23.x xVar = new s23.x(templateView, f483846h);
        xVar.f483886q = s23.d.f483833d;
        xVar.f483888s = s23.e.f483834d;
        xVar.f483889t = s23.f.f483835d;
        f483843e.put(templateView, xVar);
        p012xc85e97e9.p093xedfae76a.i0 i0Var = f483852q;
        i0Var.mo7807xc74540ab(f483854s);
        i0Var.mo3194xffc8101c(xVar.f483884o, s23.b.f483831d);
        p012xc85e97e9.p093xedfae76a.i0 i0Var2 = f483853r;
        i0Var2.mo7807xc74540ab(f483855t);
        i0Var2.mo3194xffc8101c(xVar.f483885p, s23.c.f483832d);
        templateView.mo126862x19263085().mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$bind$3
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onResume */
            public final void m63656x57429eec() {
                s23.n nVar = s23.n.f483842d;
                s23.n.f483845g = s23.o.this;
            }
        });
        k(templateView.c());
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        if (!f483856u) {
            return true;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_total_duration_seconds, 600);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaTotalDurationLimitSeconds: " + Ni);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078 : null;
        int i17 = (c15635xf0ea441b != null ? c15635xf0ea441b.f219979x : 0) / 1000;
        if ((f483847i / 1000) + i17 <= Ni && i17 <= Ni) {
            return true;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573713fi4, java.lang.Integer.valueOf(a06.d.b(Ni / 60.0f))));
        return false;
    }

    public final boolean c() {
        r45.ib6 ib6Var = f483846h;
        if (ib6Var == null) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ib6Var);
        java.lang.String aIModelType = ib6Var.f458448m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aIModelType, "aIModelType");
        return aIModelType.length() > 0;
    }

    public final boolean d() {
        java.lang.Integer num = (java.lang.Integer) f483852q.mo3195x754a37bb();
        s23.a[] aVarArr = s23.a.f483830d;
        return num == null || num.intValue() != 0;
    }

    public final boolean e(java.util.ArrayList mediaList, yz5.a onRequestResult) {
        java.lang.Object m143895xf1229813;
        s23.x xVar;
        s23.o oVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRequestResult, "onRequestResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", "ensureActivityTemplateTipsAllDead: ");
        java.util.Set entrySet = f483843e.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            s23.x xVar2 = (s23.x) entry.getValue();
            if (xVar2 != null && (oVar = xVar2.f483876d) != null && true == oVar.d()) {
                z17 = true;
            }
            if (z17 && (xVar = (s23.x) entry.getValue()) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", "makeTipsPopupDead: ");
                k33.b bVar = xVar.f483890u;
                if (bVar != null) {
                    bVar.dismiss();
                }
            }
        }
        if (f483856u && (d() || f483849n)) {
            java.lang.ref.WeakReference weakReference = f483859x;
            if (weakReference == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                throw null;
            }
            if (weakReference.get() != null) {
                ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
                vy0.g gVar = vy0.g.f522947a;
                if (!gVar.a("scene_sns_v2")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", "onSendItemClick no permission, permissionRequesting: " + f483851p);
                    if (f483851p) {
                        return true;
                    }
                    f483851p = true;
                    dx1.g.f326022a.j("SnsPublishProcess", "permissionSheetCnt", 1, bx1.u.f117843e);
                    ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
                    java.lang.ref.WeakReference weakReference2 = f483859x;
                    if (weakReference2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                        throw null;
                    }
                    android.content.Context context = (android.app.Activity) weakReference2.get();
                    if (context == null) {
                        context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                    gVar.c("scene_sns_v2", context, new s23.h(onRequestResult), s23.i.f483838d);
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", "onSendItemClick has permission");
                java.lang.ref.WeakReference weakReference3 = f483859x;
                if (weakReference3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                    throw null;
                }
                android.app.Activity activity = (android.app.Activity) weakReference3.get();
                r45.ib6 ib6Var = f483846h;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToTemplatePage isUserClickTemplateView=");
                sb6.append(f483857v);
                sb6.append(", templateId=");
                sb6.append(ib6Var != null ? ib6Var.f458443e : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", sb6.toString());
                if (activity != null) {
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
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MJTemplateHandleNew", m143898xd4a2fc34, "to array error", new java.lang.Object[0]);
                        }
                        intent.putExtra("key_maas_entrance", 101);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", "cut same");
                    } else {
                        intent.putExtra("key_maas_entrance", 100);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", "post main");
                    }
                    intent.putExtra("key_entrance_event_type", f483858w);
                    intent.putExtra("key_is_user_manual_switch_template_view", f483857v);
                    ((ez0.i) hVar).getClass();
                    com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p919x7e63ca91.ActivityC11007x7cb63ad9.f151289g.a(activity, intent, 4384, sy0.b.f495359d, mediaList, null);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f(android.content.Context context, java.util.ArrayList selectMediaList, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectMediaList, "selectMediaList");
        if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5v);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            i(context, string);
            return false;
        }
        int h17 = h();
        if (selectMediaList.size() < h()) {
            return true;
        }
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5u, java.lang.Integer.valueOf(h17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        i(context, string2);
        return false;
    }

    public final void g() {
        dx1.f fVar = dx1.g.f326022a;
        s23.x xVar = (s23.x) f483843e.get(f483845g);
        fVar.i("SnsTemplate", ya.b.f77502x92235c1b, java.lang.Integer.valueOf(xVar != null ? xVar.c() ? 3 : xVar.f483883n : 0));
        java.lang.String wi6 = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wi6, "checkSnsPostSessionId(...)");
        fVar.i("SnsTemplate", "sessionID", wi6);
        dx1.f.b(fVar, "SnsTemplate", false, false, 4, null);
        f483850o = true;
    }

    public final int h() {
        if (!f483856u) {
            return -1;
        }
        r45.ib6 ib6Var = f483846h;
        if (ib6Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ib6Var);
            java.lang.String aIModelType = ib6Var.f458448m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aIModelType, "aIModelType");
            if (aIModelType.length() > 0) {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_publish_ai_template_image_litmit, 9);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishAITemplateImageLimit: " + Ni);
                return Ni;
            }
        }
        if (!f483849n && !d()) {
            return f483848m ? 1 : 9;
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + Ni2);
        return Ni2;
    }

    public final void i(android.content.Context context, java.lang.String str) {
        if (context != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.u(str);
            u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fil));
            u1Var.l(s23.k.f483839a);
            u1Var.q(false);
        }
    }

    public final void j(s23.o templateView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateView, "templateView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", "[" + hashCode() + " unbind ui:" + templateView.hashCode() + ", unbind release maas: " + z17 + ']');
        if (!f483850o && d()) {
            g();
        }
        if (z17) {
            ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
            az0.i5.x(az0.i5.f97090a, false, false, 3, null);
        }
        java.util.HashMap hashMap = f483843e;
        s23.x xVar = (s23.x) hashMap.get(templateView);
        p012xc85e97e9.p093xedfae76a.i0 i0Var = f483853r;
        p012xc85e97e9.p093xedfae76a.i0 i0Var2 = f483852q;
        if (xVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", "onUnbind: ");
            p3325xe03a0797.p3326xc267989b.y0 y0Var = xVar.f483887r;
            if (p3325xe03a0797.p3326xc267989b.v2.h(((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) y0Var).f392029d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", "asyncScope cancel: ");
                p3325xe03a0797.p3326xc267989b.z0.e(y0Var, null, 1, null);
            }
            i0Var2.m7811xccdcd9bf(xVar.f483884o);
            i0Var.m7811xccdcd9bf(xVar.f483885p);
        }
        java.util.ArrayList arrayList = f483844f;
        arrayList.remove(templateView);
        hashMap.remove(templateView);
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MJTemplateHandleNew", "viewList.size == 0", "update live data value");
            s23.a[] aVarArr = s23.a.f483830d;
            i0Var2.mo523x53d8522f(0);
            i0Var.mo523x53d8522f("");
            i0Var2.mo522xb5bdeb7a(f483854s);
            i0Var.mo522xb5bdeb7a(f483855t);
            f483845g = null;
            f483846h = null;
            f483857v = -1;
            f483858w = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s23.n.k(java.util.ArrayList):void");
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public /* bridge */ /* synthetic */ void mo525x7bb163d5(java.lang.Object obj) {
    }
}
