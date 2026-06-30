package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI */
/* loaded from: classes10.dex */
public final class ActivityC18823xd24cb2c2 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: f, reason: collision with root package name */
    public rp4.f0 f257635f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f257637h;

    /* renamed from: i, reason: collision with root package name */
    public ct0.b f257638i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f257639m;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f257634e = "MicroMsg.VideoCompositionRemuxUI[" + hashCode() + ']';

    /* renamed from: g, reason: collision with root package name */
    public final rp4.x f257636g = new rp4.x();

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        android.os.Bundle bundle2;
        android.os.Bundle bundleExtra;
        super.onCreate(bundle);
        java.lang.String str2 = this.f257634e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onCreate");
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.d39);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "initData");
        this.f257635f = new rp4.f0(this, null);
        ut3.f fVar = ut3.f.f512709c;
        fVar.f512710a = new qt3.a();
        android.os.Bundle bundle3 = fVar.f512711b;
        bundle3.clear();
        if (getIntent().hasExtra("key_extra_data") && (bundleExtra = getIntent().getBundleExtra("key_extra_data")) != null && bundleExtra.containsKey("key_edit_video_bgm_listen_id") && bundleExtra.containsKey("key_edit_video_bgm_is_major_owned")) {
            java.lang.String string = bundleExtra.getString("key_edit_video_bgm_listen_id");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "listenId:%s", string);
            bundle3.putString("key_edit_video_bgm_listen_id", string);
            bundle3.putBoolean("key_edit_video_bgm_is_major_owned", bundleExtra.getBoolean("key_edit_video_bgm_is_major_owned"));
        }
        this.f257637h = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624) getIntent().getParcelableExtra("KEY_PARAMS_CONFIG");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "initMediaInfoFromProvider");
        ct0.b bVar = new ct0.b(null, null, false, 0, 0, null, null, 0, 0, null, null, null, false, null, null, 0, 65535, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f257637h;
        if (c16993xacc19624 != null) {
            java.util.ArrayList arrayList = c16993xacc19624.H;
            if (arrayList != null) {
                bVar.f303748l = arrayList;
            }
            java.util.ArrayList arrayList2 = c16993xacc19624.G;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                if (!(arrayList == null || arrayList.isEmpty()) && arrayList.size() == 1) {
                    java.lang.Object obj = arrayList.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    java.lang.String str3 = (java.lang.String) obj;
                    bVar.f303737a = str3;
                    bVar.f303741e = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str3, true).f243915a;
                    java.lang.String thumbPath = c16993xacc19624.C;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbPath, "thumbPath");
                    bVar.f303738b = thumbPath;
                }
            }
            bVar.f303750n = c16993xacc19624.M;
            if (!android.text.TextUtils.isEmpty(c16993xacc19624.A) && com.p314xaae8f345.mm.vfs.w6.j(c16993xacc19624.A)) {
                java.lang.String inputVideoPath = c16993xacc19624.A;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputVideoPath, "inputVideoPath");
                bVar.f303737a = inputVideoPath;
                bVar.f303741e = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(c16993xacc19624.A, true).f243915a;
                java.lang.String thumbPath2 = c16993xacc19624.C;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbPath2, "thumbPath");
                bVar.f303738b = thumbPath2;
            }
        }
        this.f257638i = bVar;
        nu3.m mVar = nu3.m.f421762a;
        mVar.k(android.os.SystemClock.elapsedRealtime());
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = this.f257637h;
        mVar.h(c16993xacc196242 != null ? c16993xacc196242.F : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196243 = this.f257637h;
        mVar.u((c16993xacc196243 == null || (bundle2 = c16993xacc196243.M) == null) ? 0 : bundle2.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0));
        mVar.f(this.f257637h);
        ct0.b bVar2 = this.f257638i;
        if (bVar2 == null || (str = bVar2.f303737a) == null) {
            str = "";
        }
        mVar.o(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "init media model");
        this.f257636g.d(vt3.q.f521570a, vt3.q.f521571b);
        ct0.b bVar3 = this.f257638i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar3);
        java.util.List c17 = kz5.b0.c(bVar3.d());
        java.util.List c18 = kz5.b0.c(2);
        java.lang.Integer[] numArr = new java.lang.Integer[1];
        ct0.b bVar4 = this.f257638i;
        numArr[0] = java.lang.Integer.valueOf((bVar4 == null || !bVar4.f303739c) ? 0 : 1);
        this.f257639m = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new rp4.h0(this, c17, c18, numArr, null), 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257634e, "onDestroy");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f257639m;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ut3.f.f512709c.f512710a = null;
        nu3.m.f421762a.a();
        rm5.l.f479053a.a();
    }
}
