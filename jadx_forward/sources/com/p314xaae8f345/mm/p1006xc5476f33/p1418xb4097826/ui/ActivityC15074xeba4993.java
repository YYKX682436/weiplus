package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderShareFeedAffinityUI;", "Lcom/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI;", "Lru2/a;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI */
/* loaded from: classes2.dex */
public final class ActivityC15074xeba4993 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 implements ru2.a {

    /* renamed from: t2, reason: collision with root package name */
    public static long f210286t2 = -1;

    /* renamed from: u2, reason: collision with root package name */
    public static long f210287u2;

    /* renamed from: v2, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f210288v2;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f210289q2;

    /* renamed from: r2, reason: collision with root package name */
    public long f210290r2;

    /* renamed from: s2, reason: collision with root package name */
    public long f210291s2;

    @Override // ru2.a
    public void C1(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ji(this));
    }

    public final boolean U7(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str) {
        if ((c01.z1.j() & 34359738368L) != 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209503uc).mo141623x754a37bb()).r()).intValue();
        int i17 = (intValue != -3 ? intValue != -2 ? intValue != -1 ? intValue * 60 * 60 : 3 : 1800 : 120) * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "checkJump3tab onBackGroundTime " + this.f210291s2 + " intervals " + i17 + " source " + str);
        if (this.f210291s2 == 0 || i17 == 0 || c01.id.c() - this.f210291s2 <= i17) {
            return false;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        if (c19792x256d2725 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "jump finder " + c19792x256d2725.m76784x5db1b11());
            pf5.u uVar = pf5.u.f435469a;
            ey2.o0 N6 = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4);
            ey2.q0 q0Var = ey2.q0.f339005e;
            N6.a(q0Var);
            N6.f338982i = c01.id.c();
            ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4).a(q0Var);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
            intent.putExtra("KEY_FROM_SHARE_REL", true);
            intent.putExtra("KEY_TARGET_TAB_TYPE", 4);
            intent.putExtra("KEY_OBJECT_ID", c19792x256d2725.m76784x5db1b11());
            intent.putExtra("KEY_OBJECT_NONCE_ID", c19792x256d2725.m76803x6c285d75());
            intent.putExtra("insert_source_feed", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.d();
            bu2.j.f106067a.n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0), bu2.i.f106064l);
            finish();
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub.L7((c61.ub) c17, mo55332x76847179, intent, 1, false, 8, null);
        }
        this.f210291s2 = 0L;
        return true;
    }

    @Override // ru2.a
    public void V4(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "onFinderBackground");
        this.f210291s2 = c01.id.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "onStop save onBackGroundTime " + this.f210291s2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).f216038d;
        if (!this.f210289q2 || z17) {
            super.finish();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            j45.l.u(this, ".ui.LauncherUI", intent, null);
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
            pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ii(this));
        }
        this.f210291s2 = c01.id.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "finishAffinity isFromMultitask " + this.f210289q2 + " isFromFloatBall " + z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        byte[] byteArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079;
        this.f210291s2 = bundle != null ? bundle.getLong("key_get_relative_restore_stop_time", 0L) : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.C, "restore onBackGroundTime " + this.f210291s2);
        java.lang.Long valueOf = bundle != null ? java.lang.Long.valueOf(bundle.getLong("feed_object_id", -1L)) : null;
        if (!(valueOf == null || valueOf.longValue() != -1)) {
            valueOf = null;
        }
        long longExtra = getIntent().getLongExtra("key_get_relative_open_time", -1L);
        if (longExtra == f210286t2 && (c14994x9b99c079 = f210288v2) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "restore lastOpen " + longExtra);
            getIntent().putExtra("feed_object_id", c14994x9b99c079.m59251x5db1b11());
            getIntent().putExtra("feed_encrypted_object_id", c14994x9b99c079.getEncryptedObjectId());
            valueOf = java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11());
            this.f210291s2 = f210287u2;
        } else if (valueOf != null) {
            long longValue = valueOf.longValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "restore saveInstance " + longValue);
            getIntent().putExtra("feed_object_id", longValue);
            getIntent().putExtra("feed_encrypted_object_id", bundle != null ? bundle.getString("feed_encrypted_object_id") : null);
        }
        super.onCreate(bundle);
        f210286t2 = getIntent().getLongExtra("key_get_relative_open_time", f210286t2);
        f210288v2 = null;
        setTaskDescription(new android.app.ActivityManager.TaskDescription(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfj), m95.a.a(mo55332x76847179().getResources(), com.p314xaae8f345.mm.R.raw.f79738xec77053e, 3.0f), 0));
        if (bundle != null && (byteArray = bundle.getByteArray("key_get_relative_restore_last_buff")) != null) {
            E7().m56377x73095078(new com.p314xaae8f345.mm.p2495xc50a8b8b.g(byteArray, 0, byteArray.length));
        }
        if (valueOf != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(valueOf.longValue());
            if (U7(h17 != null ? h17.getFeedObject() : null, "onCreate")) {
                return;
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1) pf5.z.f435481a.a(mo55332x76847179).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
        if (g1Var != null) {
            g1Var.f215989e = false;
        }
        f210287u2 = 0L;
        ru2.j jVar = ru2.j.f481274d;
        ru2.j.f481279i.add(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "onDestroy");
        ru2.j jVar = ru2.j.f481274d;
        ru2.j.f481279i.remove(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (c01.id.c() - this.f210290r2 < 500) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f210313l2;
            U7(c14994x9b99c079 != null ? c14994x9b99c079.getFeedObject() : null, "onResume");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "skip jump3tab");
        }
        this.f210291s2 = 0L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m56357x44e5026c = E7().m56357x44e5026c();
        outState.putByteArray("key_get_relative_restore_last_buff", m56357x44e5026c != null ? m56357x44e5026c.g() : null);
        outState.putLong("key_get_relative_restore_stop_time", this.f210291s2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "onSaveInstanceState");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f210313l2;
        if (c14994x9b99c079 != null) {
            outState.putLong("feed_object_id", c14994x9b99c079.m59251x5db1b11());
            outState.putString("feed_encrypted_object_id", c14994x9b99c079.getFeedObject().m76803x6c285d75());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareFeedAffinityUI", "store onBackGroundTime " + this.f210291s2 + " lastCenterFeed id " + pm0.v.u(c14994x9b99c079.m59251x5db1b11()) + " nonceId " + c14994x9b99c079.getFeedObject().m76803x6c285d75() + " pos " + this.f210314m2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f210290r2 = c01.id.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        if (f210286t2 == getIntent().getLongExtra("key_get_relative_open_time", -1L)) {
            f210288v2 = this.f210313l2;
            f210287u2 = c01.id.c();
        }
    }
}
