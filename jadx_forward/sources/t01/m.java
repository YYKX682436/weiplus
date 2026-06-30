package t01;

@j95.b
/* loaded from: classes11.dex */
public final class m extends i95.w implements rm.c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final t01.i f495932d = new t01.i(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f495933e = jz5.h.b(t01.e.f495925d);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f495934f = "BizPersonalFinderRedDot_REGISTER_NOTICE_RED_POINT";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f495935g = "BizPersonalFinderRedDot_TIPS_ID_KV";

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0 f495936h = com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0.f299291c;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f495937i = jz5.h.b(t01.g.f495927d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f495938m = jz5.h.b(t01.h.f495928d);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f495939n = jz5.h.b(t01.f.f495926d);

    public m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "init subscribeNotifyFetchMeTabRedPointEvent");
        t01.a aVar = new t01.a(this);
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0 l0Var = f495936h;
        l0Var.k("BizPersonalCenterPluginAppHelper_METabRegisKey", aVar);
        l0Var.m("BizPersonalCenterPluginAppHelper_METabWorksEntryRedDotKey", new t01.b(this));
        l0Var.l("BizPersonalCenterPluginAppHelper_METabWorksEntryRedDotKey", new t01.c(this));
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1.f299325c.g("BizPersonalCenterPluginAppHelper_METabPhotoCreateSwitchKey", t01.d.f495924a);
    }

    public void Ai(int i17) {
        r45.vs2 vs2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "clearMeTabBizRedDot, scene: " + i17);
        t01.i iVar = f495932d;
        if (i17 == 0) {
            t01.i.c(iVar).N("MyTabPhotoProfile");
        } else if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizPersonalFinderRedDot", "clearMeTabBizRedDot, scene not support: " + i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = t01.i.c(iVar).L0("MyTabPhotoProfile");
        f495936h.b(java.util.Optional.ofNullable((L0 == null || (vs2Var = L0.f65874xb5f7102a) == null) ? null : vs2Var.m75963xebb06ba0()), i17, java.util.Optional.empty(), t01.k.f495930a);
    }

    public final void Bi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "disposeWorksEntryRedDot");
        t01.i iVar = f495932d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = t01.i.c(iVar).L0("MyTab");
        if (L0 != null) {
            r45.vs2 vs2Var = L0.f65874xb5f7102a;
            if (vs2Var != null && vs2Var.f470020e == 1026) {
                zy2.fa.J0(t01.i.c(iVar), L0, "MyTab", true, null, 8, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "dispose tabBar red dot");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = t01.i.c(iVar).L0("FinderMentionMyTab");
        if (L02 != null) {
            r45.vs2 vs2Var2 = L02.f65874xb5f7102a;
            if (vs2Var2 != null && vs2Var2.f470020e == 1026) {
                zy2.fa.J0(t01.i.c(iVar), L02, "FinderMentionMyTab", true, null, 8, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "dispose left count red dot");
            }
        }
    }

    public final boolean Di() {
        return ((ox.g) t01.i.b(f495932d)).qj();
    }

    public final boolean Ni() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) f495937i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return ((c61.l7) ((zy2.b6) mo141623x754a37bb)).vk();
    }

    public final boolean Ri() {
        boolean z17;
        java.lang.String str;
        t01.i.b(f495932d);
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f449681m.f449687b;
        if (bVar != null && (str = bVar.f299422e) != null) {
            if (str.length() > 0) {
                z17 = true;
                return !z17 && bVar.f299427m;
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public final int Ui() {
        return (Ni() && Di()) ? com.p314xaae8f345.mm.R.C30867xcad56011.o1n : Ni() ? com.p314xaae8f345.mm.R.C30867xcad56011.o1l : Di() ? com.p314xaae8f345.mm.R.C30867xcad56011.o1k : com.p314xaae8f345.mm.R.C30867xcad56011.ngx;
    }

    public final void wi() {
        t01.i iVar = f495932d;
        if (!((ox.g) t01.i.b(iVar)).vj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "shouldShowPhotoWorks is false, skip add edu red dot");
            return;
        }
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f470020e = 1026;
        vs2Var.f470019d = 100000;
        java.lang.String str = "BizPhotoLocal_" + (java.lang.System.currentTimeMillis() / 1000.0d);
        vs2Var.f470023h = str;
        vs2Var.f470036x = str;
        r45.f03 f03Var = new r45.f03();
        f03Var.f455424h = 1;
        f03Var.f455420d = 3;
        f03Var.f455425i = "FinderMyTab";
        f03Var.f455422f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(Ui());
        vs2Var.f470022g.add(f03Var);
        zy2.fa.D(t01.i.c(iVar), vs2Var, "bizMeTab", null, false, null, 28, null);
        t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "add edu red dot success, tipsUuid: " + vs2Var.f470036x);
    }
}
