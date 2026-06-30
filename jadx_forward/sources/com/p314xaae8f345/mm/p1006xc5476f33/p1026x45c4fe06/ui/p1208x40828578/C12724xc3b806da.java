package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.RecentsFolderActivityContext */
/* loaded from: classes7.dex */
public class C12724xc3b806da extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932 {

    /* renamed from: d, reason: collision with root package name */
    public int f171551d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f171552e;

    /* renamed from: f, reason: collision with root package name */
    public int f171553f;

    public C12724xc3b806da(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(abstractActivityC21394xb3d2c0cf);
        this.f171553f = 0;
    }

    @Override // zj1.a
    public void H3(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment fragment;
        java.lang.Class cls = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90.class : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12643xc46c9cdd.class;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7664x6f4c869b = a().mo7595x9cdc264().m7664x6f4c869b(android.R.id.content);
        if ((m7664x6f4c869b != null && cls.isInstance(m7664x6f4c869b)) || a().isFinishing() || a().m78477x9d1e994e() || a().m78542x6d20d943()) {
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = a().mo7595x9cdc264().m7630xb2c12e75();
        if (z17) {
            fragment = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90(a() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da);
        } else {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571648lc);
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571719nb);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12643xc46c9cdd c12643xc46c9cdd = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12643xc46c9cdd();
            android.os.Bundle bundle = new android.os.Bundle(2);
            bundle.putString("extra_title", string);
            bundle.putString("extra_tip", string2);
            c12643xc46c9cdd.mo7562xe26dab14(bundle);
            fragment = c12643xc46c9cdd;
        }
        fragment.o0(this.f171551d);
        fragment.f170901f = this.f171552e;
        m7630xb2c12e75.k(android.R.id.content, fragment, null);
        m7630xb2c12e75.d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932
    public void b(android.content.Intent intent) {
        this.f171551d = intent.getIntExtra("extra_enter_scene", 1);
        this.f171552e = intent.getStringExtra("extra_enter_scene_note");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932
    /* renamed from: onActivityDidResume */
    public void mo52972xf541971e() {
        boolean z17 = true;
        if (!(a() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da)) {
            a().mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571718na);
            int i17 = this.f171553f + 1;
            this.f171553f = i17;
            if (i17 == 1) {
                H3(true);
                return;
            }
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.c() && !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2[] f2VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2.f157964d;
            int ordinal = (!gm0.j1.a() ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e2.FORCE_OFF : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e2.FORCE_ON).ordinal();
            if (!(ordinal == 1 || (ordinal == 2 && gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_HAS_SEEN_NEARBY_SHOWCASE_BOOLEAN_SYNC, false)))) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e1.f157957a == null) {
                    synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e1.class) {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e1.f157957a == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e1.f157957a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e1();
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e1.f157957a.getClass();
                gm0.j1.a();
                z17 = false;
            }
        }
        H3(z17);
    }
}
