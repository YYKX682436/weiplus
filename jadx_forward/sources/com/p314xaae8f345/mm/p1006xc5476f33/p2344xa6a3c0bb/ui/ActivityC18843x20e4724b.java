package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI */
/* loaded from: classes15.dex */
public class ActivityC18843x20e4724b extends com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 implements fq4.v {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f257731z = 0;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f257732x = null;

    /* renamed from: y, reason: collision with root package name */
    public fq4.w f257733y = null;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00
    public void V6() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m3m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        X6();
        this.f257701h.m72729xdc742163(com.p314xaae8f345.mm.R.C30867xcad56011.k9m);
        this.f257701h.f257759f.setVisibility(8);
        this.f257698e.setEnabled(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00
    public void W6() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f257704n) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f257705o)) {
            return;
        }
        fq4.w wVar = this.f257733y;
        fq4.o oVar = new fq4.o(this.f257704n, wVar.f347182f, 0, wVar.f347180d);
        oVar.f347158h = true;
        c01.d9.e().g(oVar);
        this.f257698e.setEnabled(false);
        X6();
    }

    public void Z6(boolean z17) {
        T6();
        this.f257698e.setEnabled(true);
        int i17 = 0;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLoginUI", "login failed");
            this.f257701h.m72725xca0261a3(com.p314xaae8f345.mm.R.C30867xcad56011.k9l);
            this.f257701h.c();
            java.lang.String str = fq4.e0.f347124a;
            if (str == null) {
                str = v61.d.a(1);
            }
            java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("login_sessionid", str), new java.util.AbstractMap.SimpleEntry("voicelock_verify_result", 1)};
            java.util.HashMap hashMap = new java.util.HashMap(2);
            while (i17 < 2) {
                java.util.Map.Entry entry = entryArr[i17];
                java.lang.Object key = entry.getKey();
                java.util.Objects.requireNonNull(key);
                java.lang.Object value = entry.getValue();
                java.util.Objects.requireNonNull(value);
                if (hashMap.put(key, value) != null) {
                    throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                }
                i17++;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_login_request_end", java.util.Collections.unmodifiableMap(hashMap), 34575);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLoginUI", "login success[%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.f257733y.f347183g));
        java.lang.String str2 = fq4.e0.f347124a;
        if (str2 == null) {
            str2 = v61.d.a(1);
        }
        java.util.Map.Entry[] entryArr2 = {new java.util.AbstractMap.SimpleEntry("login_sessionid", str2), new java.util.AbstractMap.SimpleEntry("voicelock_verify_result", 0)};
        java.util.HashMap hashMap2 = new java.util.HashMap(2);
        while (i17 < 2) {
            java.util.Map.Entry entry2 = entryArr2[i17];
            java.lang.Object key2 = entry2.getKey();
            java.util.Objects.requireNonNull(key2);
            java.lang.Object value2 = entry2.getValue();
            java.util.Objects.requireNonNull(value2);
            if (hashMap2.put(key2, value2) != null) {
                throw new java.lang.IllegalArgumentException("duplicate key: " + key2);
            }
            i17++;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_login_request_end", java.util.Collections.unmodifiableMap(hashMap2), 34575);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("VoiceLoginAuthPwd", this.f257733y.f347183g);
        setResult(-1, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11557, 1);
        java.lang.String stringExtra = getIntent().getStringExtra("Kusername");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = null;
        }
        this.f257732x = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("Kvertify_key");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f257732x) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceLoginUI", "onCreate error, username and ticket are both null");
            return;
        }
        this.f257708r = true;
        fq4.w wVar = new fq4.w();
        this.f257733y = wVar;
        wVar.f347184h = this.f257732x;
        wVar.f347180d = str;
        wVar.f347181e = this;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            c01.d9.e().g(new fq4.h(1, wVar.f347184h));
        } else {
            c01.d9.e().g(new fq4.l(73, wVar.f347180d));
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0y);
        ((sb0.f) jVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLoginUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", java.lang.Boolean.valueOf(j35.u.a(this, "android.permission.RECORD_AUDIO", 80, "", string)), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), this);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.u(this));
        if (fp.h.c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560994zy));
            m78607xef685e15(com.p314xaae8f345.mm.ui.bk.C());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fq4.w wVar = this.f257733y;
        if (wVar != null) {
            wVar.getClass();
            c01.d9.e().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ia.f34362x366c91de, wVar);
            c01.d9.e().q(616, wVar);
            c01.d9.e().q(617, wVar);
            wVar.f347181e = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        setResult(0);
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLoginUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLoginUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 80) {
            return;
        }
        if (iArr[0] == 0) {
            Y6();
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.v(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.w(this));
        }
    }
}
