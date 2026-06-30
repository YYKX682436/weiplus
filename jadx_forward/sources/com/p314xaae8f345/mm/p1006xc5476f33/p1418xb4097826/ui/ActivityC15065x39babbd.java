package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingDetailInfoUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "Lzy2/gc;", "Lr45/ri2;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI */
/* loaded from: classes8.dex */
public class ActivityC15065x39babbd extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f210242d = "Finder.FinderSettingDetailInfoUI";

    /* renamed from: e, reason: collision with root package name */
    public final int f210243e = 1000;

    /* renamed from: f, reason: collision with root package name */
    public final int f210244f = 1001;

    /* renamed from: g, reason: collision with root package name */
    public final int f210245g = 1002;

    /* renamed from: h, reason: collision with root package name */
    public final int f210246h = 1003;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f210247i = "";

    /* renamed from: m, reason: collision with root package name */
    public ya2.b2 f210248m;

    /* renamed from: n, reason: collision with root package name */
    public r45.lk2 f210249n;

    /* renamed from: o, reason: collision with root package name */
    public android.app.ProgressDialog f210250o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd f210251p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f210252q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f210253r;

    public static final void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15065x39babbd activityC15065x39babbd) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_scene", 1);
        intent.putExtra("finder_username", activityC15065x39babbd.f210247i);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Ok(activityC15065x39babbd, intent);
    }

    public static final void X6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15065x39babbd activityC15065x39babbd, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC15065x39babbd);
        u1Var.g(activityC15065x39babbd.getString(i17));
        u1Var.a(true);
        u1Var.n(activityC15065x39babbd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.chv));
        u1Var.q(false);
    }

    public final void V6() {
        if (this.f210253r) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(getLifecycleAsyncScope(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.lg(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6() {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15065x39babbd.Y6():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576417al;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        int i19;
        super.onActivityResult(i17, i18, intent);
        int i27 = this.f210243e;
        int i28 = this.f210244f;
        java.lang.String str3 = this.f210242d;
        if (i17 == i27) {
            if (intent == null || i18 != -1) {
                return;
            }
            setIntent(new android.content.Intent());
            java.lang.String b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(mo55332x76847179(), intent, g83.a.a());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) || !com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "no img select");
                return;
            }
            getIntent().putExtra("key_source_img_path", b17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Intent intent2 = getIntent();
            i0Var.getClass();
            ((w40.e) i95.n0.c(w40.e.class)).getClass();
            qs2.v.f447860a.b(this, intent2, i28);
            return;
        }
        if (i17 == i28) {
            if (intent == null || i18 != -1) {
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("key_result_img_path");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || !com.p314xaae8f345.mm.vfs.w6.j(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "no avatar set");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "avatar file length %d KB", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(stringExtra) / 1024));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0 s0Var = hb2.s0.f361623e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            java.lang.String str4 = this.f210247i;
            s0Var.getClass();
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_NetSceneUploadHead";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_headimg_upload_");
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(stringExtra.getBytes()));
            mVar.f69601xaca5bdda = sb6.toString();
            mVar.f69609xd84b8349 = 2;
            mVar.f69606xccdbf540 = true;
            mVar.f69595x6d25b0d9 = stringExtra;
            mVar.f69592xf1ebe47b = 20301;
            mVar.f69580x454032b6 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508;
            mVar.f69594x4b409164 = false;
            mVar.f69621xf91593ca = true;
            mVar.f69587xa6fe74c = false;
            mVar.f69618x114ef53e = "";
            mVar.f69597x853bb235 = false;
            mVar.f69584x89a4c0cf = 2;
            hb2.n0 n0Var = new hb2.n0(str4, this, stringExtra);
            java.lang.String str5 = "start cdn upload task taskName:" + mVar.f323318d + " pullpath:" + mVar.f69595x6d25b0d9;
            java.lang.String str6 = hb2.s0.f361624f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str6, str5);
            if (((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ui(mVar, new java.lang.ref.WeakReference(n0Var)) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str6, "cdn addSendTask failed taskName:" + mVar.f323318d);
            }
            m60897x918cb44a();
            return;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == this.f210245g) {
            if (intent == null || i18 != -1) {
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("Country");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            java.lang.String stringExtra3 = intent.getStringExtra("Contact_Province");
            java.lang.String str7 = stringExtra3 == null ? "" : stringExtra3;
            java.lang.String stringExtra4 = intent.getStringExtra("Contact_City");
            java.lang.String str8 = stringExtra4 == null ? "" : stringExtra4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "countryCode " + stringExtra2 + " provinceCode" + str7 + " cityCode" + str8);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra2, "unshow")) {
                g92.b bVar = g92.b.f351302e;
                ya2.b2 b2Var = this.f210248m;
                java.lang.String str9 = b2Var != null ? b2Var.f69347xdec927b : null;
                if (str9 == null) {
                    str9 = "";
                }
                m92.b j37 = g92.a.j3(bVar, str9, false, 2, null);
                int i29 = (j37 != null ? j37.f68698x26b1b2e8 : 0) & (-5);
                ya2.b2 b2Var2 = this.f210248m;
                java.lang.String str10 = b2Var2 != null ? b2Var2.f69347xdec927b : null;
                if (str10 == null) {
                    str10 = "";
                }
                m92.c cVar = new m92.c(str10);
                cVar.f68698x26b1b2e8 = i29;
                m92.j jVar = m92.j.f406530o;
                bVar.C(cVar, jVar);
                ya2.b2 b2Var3 = this.f210248m;
                java.lang.String str11 = b2Var3 != null ? b2Var3.f69347xdec927b : null;
                if (str11 == null) {
                    str11 = "";
                }
                m92.c cVar2 = new m92.c(str11);
                cVar2.f68698x26b1b2e8 = i29;
                bVar.C(cVar2, jVar);
                i19 = 1;
                str2 = "";
            } else {
                str2 = stringExtra2;
                i19 = 0;
            }
            ya2.b2 b2Var4 = this.f210248m;
            if (b2Var4 != null) {
                r45.hz0 hz0Var = b2Var4.f69309x26b3182a;
                if (hz0Var != null) {
                    hz0Var.set(0, str2);
                    hz0Var.set(1, str7);
                    hz0Var.set(2, str8);
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    r45.hz0 hz0Var2 = new r45.hz0();
                    b2Var4.f69309x26b3182a = hz0Var2;
                    hz0Var2.set(0, str2);
                    b2Var4.f69309x26b3182a.set(1, str7);
                    b2Var4.f69309x26b3182a.set(2, str8);
                }
                ya2.h.f542017a.o(b2Var4);
                this.f210253r = true;
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0.f361623e.r(str2, str7, str8, i19, this, this.f210247i);
            pm0.v.X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.mg.f211056d);
            m60897x918cb44a();
            return;
        }
        if (i17 != this.f210246h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "handleActivityResult by selectProfileCoverHelper: " + i17 + ' ' + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd sdVar = this.f210251p;
            if (sdVar != null) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = sdVar.f211336a;
                switch (i17) {
                    case 2000:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelectCoverHelper", "REQUEST_CODE_CAPTURE_PROFILE_COVER return");
                        return;
                    case 2001:
                        if (intent == null || i18 != -1) {
                            return;
                        }
                        java.lang.String b18 = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(abstractActivityC21394xb3d2c0cf, intent, g83.a.a());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
                        sdVar.c(b18);
                        return;
                    case 2002:
                        if (intent == null || i18 != -1) {
                            return;
                        }
                        java.lang.String stringExtra5 = intent.getStringExtra("key_result_img_path");
                        sdVar.d();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5) || !com.p314xaae8f345.mm.vfs.w6.j(stringExtra5)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.SelectCoverHelper", "no profile cover set");
                            az2.f fVar = sdVar.f211337b;
                            if (fVar != null) {
                                fVar.b();
                            }
                            db5.t7.g(abstractActivityC21394xb3d2c0cf, sdVar.b(com.p314xaae8f345.mm.R.C30867xcad56011.f9c));
                            return;
                        }
                        java.lang.String str12 = stringExtra5 != null ? stringExtra5 : "";
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.kd kdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.kd(sdVar, stringExtra5);
                        so2.w5 w5Var = sdVar.f211338c;
                        w5Var.getClass();
                        pf5.e.m158343xd39de650(w5Var, null, null, new so2.r5(str12, w5Var, kdVar, null), 3, null);
                        return;
                    case 2003:
                        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                        android.content.Context applicationContext = abstractActivityC21394xb3d2c0cf.getApplicationContext();
                        java.lang.String a17 = g83.a.a();
                        ((ub0.r) oVar).getClass();
                        java.lang.String b19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(applicationContext, intent, a17);
                        if (b19 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelectCoverHelper", "REQUEST_CODE_CAPTURE_PROFILE_COVER_OLD: path:".concat(b19));
                            sdVar.c(b19);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            return;
        }
        if (intent == null || i18 != -1) {
            return;
        }
        java.lang.String stringExtra6 = intent.getStringExtra("key_output_sex");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        if (stringExtra6.length() > 0) {
            g92.b bVar2 = g92.b.f351302e;
            ya2.b2 b2Var5 = this.f210248m;
            java.lang.String str13 = b2Var5 != null ? b2Var5.f69347xdec927b : null;
            if (str13 == null) {
                str13 = "";
            }
            m92.b j38 = g92.a.j3(bVar2, str13, false, 2, null);
            int i37 = j38 != null ? j38.f68698x26b1b2e8 : 0;
            ya2.b2 b2Var6 = this.f210248m;
            if (b2Var6 != null) {
                int hashCode = stringExtra6.hashCode();
                if (hashCode != -1278174388) {
                    if (hashCode != -840239850) {
                        if (hashCode != 3343885 || !stringExtra6.equals("male")) {
                            return;
                        }
                        r45.hz0 hz0Var3 = b2Var6.f69309x26b3182a;
                        if (hz0Var3 != null) {
                            hz0Var3.set(3, 1);
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            r45.hz0 hz0Var4 = new r45.hz0();
                            b2Var6.f69309x26b3182a = hz0Var4;
                            hz0Var4.set(3, 1);
                        }
                        ya2.h.f542017a.o(b2Var6);
                        int i38 = i37 | 8;
                        ya2.b2 b2Var7 = this.f210248m;
                        str = b2Var7 != null ? b2Var7.f69347xdec927b : null;
                        m92.c cVar3 = new m92.c(str != null ? str : "");
                        cVar3.f68698x26b1b2e8 = i38;
                        bVar2.C(cVar3, m92.j.f406530o);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        hb2.s0 s0Var2 = hb2.s0.f361623e;
                        r45.hz0 hz0Var5 = b2Var6.f69309x26b3182a;
                        s0Var2.t(hz0Var5 != null ? hz0Var5.m75939xb282bd08(3) : 0, 0, this, this.f210247i);
                    } else {
                        if (!stringExtra6.equals("unshow")) {
                            return;
                        }
                        r45.hz0 hz0Var6 = b2Var6.f69309x26b3182a;
                        if (hz0Var6 != null) {
                            hz0Var6.set(3, 0);
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            r45.hz0 hz0Var7 = new r45.hz0();
                            b2Var6.f69309x26b3182a = hz0Var7;
                            hz0Var7.set(3, 0);
                        }
                        ya2.h.f542017a.o(b2Var6);
                        int i39 = i37 & (-9);
                        ya2.b2 b2Var8 = this.f210248m;
                        str = b2Var8 != null ? b2Var8.f69347xdec927b : null;
                        m92.c cVar4 = new m92.c(str != null ? str : "");
                        cVar4.f68698x26b1b2e8 = i39;
                        bVar2.C(cVar4, m92.j.f406530o);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        hb2.s0 s0Var3 = hb2.s0.f361623e;
                        r45.hz0 hz0Var8 = b2Var6.f69309x26b3182a;
                        s0Var3.t(hz0Var8 != null ? hz0Var8.m75939xb282bd08(3) : 0, 1, this, this.f210247i);
                    }
                } else {
                    if (!stringExtra6.equals("female")) {
                        return;
                    }
                    r45.hz0 hz0Var9 = b2Var6.f69309x26b3182a;
                    if (hz0Var9 != null) {
                        hz0Var9.set(3, 2);
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        r45.hz0 hz0Var10 = new r45.hz0();
                        b2Var6.f69309x26b3182a = hz0Var10;
                        hz0Var10.set(3, 2);
                    }
                    ya2.h.f542017a.o(b2Var6);
                    int i47 = i37 | 8;
                    ya2.b2 b2Var9 = this.f210248m;
                    str = b2Var9 != null ? b2Var9.f69347xdec927b : null;
                    m92.c cVar5 = new m92.c(str != null ? str : "");
                    cVar5.f68698x26b1b2e8 = i47;
                    bVar2.C(cVar5, m92.j.f406530o);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    hb2.s0 s0Var4 = hb2.s0.f361623e;
                    r45.hz0 hz0Var11 = b2Var6.f69309x26b3182a;
                    s0Var4.t(hz0Var11 != null ? hz0Var11.m75939xb282bd08(3) : 0, 0, this, this.f210247i);
                }
                this.f210253r = true;
                pm0.v.X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ng.f211087d);
            }
            m60897x918cb44a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f210247i = stringExtra;
        if (stringExtra.length() == 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            this.f210247i = xy2.c.e(mo55332x76847179);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f210242d, "myFinderUser " + this.f210247i);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f4a);
        this.f210251p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd(this, this.f210247i);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.og(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd sdVar = this.f210251p;
        if (sdVar != null) {
            sdVar.f211338c.mo528x82b764cd();
        }
        this.f210251p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e8  */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r r13, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb r14) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15065x39babbd.mo26755x5cc6f590(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeLongClick */
    public boolean mo60896x898ea874(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, android.view.View view) {
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21560x1fce98fb);
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f210242d, "long click " + str);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_finder_id")) {
            return super.mo60896x898ea874(rVar, c21560x1fce98fb, view);
        }
        r45.lk2 lk2Var = this.f210249n;
        if (lk2Var != null && (m75941xfb821914 = lk2Var.m75941xfb821914(20)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.ac5) next).m75936x14adae67(1);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, this.f210247i)) {
                    obj = next;
                    break;
                }
            }
            r45.ac5 ac5Var = (r45.ac5) obj;
            if (ac5Var != null && (m75945x2fec8307 = ac5Var.m75945x2fec8307(41)) != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(m75945x2fec8307);
                db5.t7.m(mo55332x76847179(), mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ewg));
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        V6();
        Y6();
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        android.app.ProgressDialog progressDialog = this.f210250o;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (ret.m75939xb282bd08(1) == 0) {
            db5.t7.m123883x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9d), 0).show();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("NEED_REFRESH_AVATAR", true);
            setResult(-1, intent);
        } else {
            db5.t7.m123883x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9b), 0).show();
        }
        if (this.f210253r || ret.m75939xb282bd08(1) == 0) {
            this.f210253r = false;
            V6();
        }
    }

    /* renamed from: showProgress */
    public final void m60897x918cb44a() {
        android.app.ProgressDialog progressDialog = this.f210250o;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f210250o = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, false, null);
    }
}
