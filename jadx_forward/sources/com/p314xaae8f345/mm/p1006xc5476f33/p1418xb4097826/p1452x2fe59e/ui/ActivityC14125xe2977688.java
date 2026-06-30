package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/SelectLocalFileRouterUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI */
/* loaded from: classes10.dex */
public final class ActivityC14125xe2977688 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f191161p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f191162d;

    /* renamed from: h, reason: collision with root package name */
    public long f191166h;

    /* renamed from: i, reason: collision with root package name */
    public long f191167i;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f191163e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.mq(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f191164f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kq(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f191165g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lq(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f191168m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.gq(this));

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f191169n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f191170o = "";

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
    
        r0 = (java.lang.String) ((jz5.n) r0).mo141623x754a37bb();
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[Catch: all -> 0x0103, TRY_LEAVE, TryCatch #0 {all -> 0x0103, blocks: (B:8:0x000d, B:10:0x0017, B:13:0x001e, B:15:0x0023, B:17:0x0077, B:21:0x0083, B:23:0x0089, B:29:0x009c, B:32:0x00a3, B:35:0x00cd, B:37:0x00d8, B:42:0x00e2, B:43:0x00f6, B:45:0x00eb), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688.U6(java.lang.String):void");
    }

    public final int V6() {
        return ((java.lang.Number) ((jz5.n) this.f191164f).mo141623x754a37bb()).intValue();
    }

    public final long W6() {
        return ((java.lang.Number) ((jz5.n) this.f191163e).mo141623x754a37bb()).longValue();
    }

    public final void X6(android.net.Uri uri) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W0(uri)) {
            Y6(-201);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderSelectLocalFileUI", "onActivityResult fail uri not safe");
            return;
        }
        java.lang.String uri2 = uri.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri2, "toString(...)");
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(uri2);
        if (j17) {
            U6(uri2);
        } else {
            Y6(-201);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", "onActivityResult: exists=" + j17 + ", uri=" + uri + ", path=" + uri2);
    }

    public final void Y6(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579 c5723x5d13c579 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579();
        am.kk kkVar = c5723x5d13c579.f136046g;
        kkVar.f88693a = "";
        kkVar.f88695c = false;
        kkVar.f88696d = i17;
        c5723x5d13c579.e();
        finish();
    }

    public final void Z6(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", "startUpload filePath null");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f191162d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f191162d = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.qq.f192003d);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderSelectLocalFileUI", "uploadAudioTrack: audio track " + str + " is not file");
        }
        pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.rq(str, this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.net.Uri data;
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", "onActivityResult: requestCode=" + i17 + ", resultCode=" + i18);
        if (i17 != 88889 || i18 != -1) {
            if (i17 == 88889) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579 c5723x5d13c579 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579();
                am.kk kkVar = c5723x5d13c579.f136046g;
                kkVar.f88693a = "";
                kkVar.f88695c = true;
                c5723x5d13c579.e();
                finish();
                return;
            }
            return;
        }
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        boolean e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e1(mo55332x76847179(), data);
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean h17 = j35.u.h(mo55332x76847179(), "android.permission.READ_EXTERNAL_STORAGE");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", "onActivityResult: needRequestPermission=" + e17 + " hasStoragePermission " + h17);
        if (!e17 || h17) {
            X6(data);
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht);
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0k);
        java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0k);
        ((sb0.f) jVar).getClass();
        j35.u.k(mo55332x76847179(), 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.pq(this, data), new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, string, string2, string3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17 = true;
        mo2550x7c2abd06(1);
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575905la);
        vj5.o.e(getWindow());
        super.onCreate(bundle);
        if (getIntent().getIntExtra("PICKER_TYPE", 1) != 1) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
            intent.setType("audio/*");
            intent.addCategory("android.intent.category.OPENABLE");
            startActivityForResult(intent, 88889);
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("PICKER_FILE_TYPE");
        if (stringExtra == null || r26.n0.N(stringExtra)) {
            stringExtra = "file";
        }
        java.lang.String str = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("PICKER_FILE_EXTENSION");
        if (stringExtra2 != null && !r26.n0.N(stringExtra2)) {
            z17 = false;
        }
        if (z17) {
            stringExtra2 = "[mp3]";
        }
        ((uv1.d) ((lo.k) i95.n0.c(lo.k.class))).Ai(mo55332x76847179(), str, 1, stringExtra2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.iq(this));
    }
}
