package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class WalletMultiRcptSelectUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f74482i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f74483d;

    /* renamed from: e, reason: collision with root package name */
    public int f74484e = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.address.model.RcptItem f74485f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.address.model.RcptItem f74486g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f74487h;

    public final void V6(android.content.Intent intent) {
        com.tencent.mm.plugin.address.model.RcptItem rcptItem;
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiRptSelectUI", "initData intent is null");
            return;
        }
        this.f74484e = intent.getIntExtra("key_stage", 0);
        this.f74485f = (com.tencent.mm.plugin.address.model.RcptItem) intent.getParcelableExtra("key_province");
        this.f74486g = (com.tencent.mm.plugin.address.model.RcptItem) intent.getParcelableExtra("key_city");
        java.lang.String stringExtra = intent.getStringExtra("extra_province");
        com.tencent.mm.plugin.address.model.RcptItem rcptItem2 = null;
        if (stringExtra != null) {
            o71.l.wi();
            q71.f0 Bi = o71.l.Bi();
            Bi.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                java.util.Iterator it = ((java.util.ArrayList) Bi.d(0)).iterator();
                while (it.hasNext()) {
                    rcptItem = (com.tencent.mm.plugin.address.model.RcptItem) it.next();
                    if (rcptItem.f74371d.startsWith(stringExtra)) {
                        break;
                    }
                }
            }
            rcptItem = null;
            this.f74485f = rcptItem;
            if (rcptItem != null) {
                this.f74484e = 1;
            }
        }
        java.lang.String stringExtra2 = intent.getStringExtra("extra_city");
        if (stringExtra2 == null || 1 != this.f74484e) {
            return;
        }
        o71.l.wi();
        java.util.ArrayList arrayList = (java.util.ArrayList) o71.l.Bi().e(this.f74485f.f74372e);
        if (arrayList.size() != 0) {
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.address.model.RcptItem rcptItem3 = (com.tencent.mm.plugin.address.model.RcptItem) it6.next();
                if (rcptItem3.f74371d.startsWith(stringExtra2)) {
                    rcptItem2 = rcptItem3;
                    break;
                }
            }
        }
        this.f74486g = rcptItem2;
        if (rcptItem2 != null) {
            this.f74484e = 2;
        }
    }

    public final void W6() {
        int i17 = this.f74484e;
        if (i17 == 1) {
            this.f74485f = null;
            this.f74484e = 0;
        } else if (i17 == 2) {
            this.f74486g = null;
            this.f74484e = 1;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_stage", this.f74484e);
        intent.putExtra("key_province", this.f74485f);
        intent.putExtra("key_city", this.f74486g);
        setResult(0, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494919bl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0 != 2) goto L25;
     */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.address.ui.WalletMultiRcptSelectUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            return;
        }
        if (i18 != -1) {
            V6(intent);
        } else {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        W6();
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f74483d = getPreferenceScreen();
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference instanceof com.tencent.mm.plugin.address.ui.RcptPreference) {
            com.tencent.mm.plugin.address.model.RcptItem rcptItem = ((com.tencent.mm.plugin.address.ui.RcptPreference) preference).L;
            if (rcptItem != null) {
                java.lang.String str = rcptItem.f74371d;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    int i17 = rcptItem.f74374g;
                    if (!(i17 == 0)) {
                        if (!(i17 == 1)) {
                            this.f74484e = 2;
                        }
                    }
                    int i18 = this.f74484e;
                    if (i18 == 0) {
                        this.f74485f = rcptItem;
                        this.f74484e = 1;
                    } else if (i18 == 1) {
                        this.f74486g = rcptItem;
                        this.f74484e = 2;
                    } else if (i18 == 2) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        com.tencent.mm.plugin.address.model.RcptItem rcptItem2 = this.f74485f;
                        if (rcptItem2 != null) {
                            sb6.append(rcptItem2.f74371d);
                            sb6.append(" ");
                        }
                        com.tencent.mm.plugin.address.model.RcptItem rcptItem3 = this.f74486g;
                        if (rcptItem3 != null) {
                            sb6.append(rcptItem3.f74371d);
                            sb6.append(" ");
                        }
                        sb6.append(str);
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("karea_result", sb6.toString());
                        intent.putExtra("kpost_code", rcptItem.f74373f);
                        intent.putExtra("kwcode", rcptItem.f74372e);
                        setResult(-1, intent);
                        finish();
                    }
                    android.content.Intent intent2 = getIntent();
                    int intExtra = intent2 != null ? intent2.getIntExtra("ui_title", -1) : -1;
                    android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.address.ui.WalletMultiRcptSelectUI.class);
                    intent3.putExtra("key_stage", this.f74484e);
                    intent3.putExtra("key_province", this.f74485f);
                    intent3.putExtra("key_city", this.f74486g);
                    if (-1 != intExtra) {
                        intent3.putExtra("ui_title", intExtra);
                    }
                    startActivityForResult(intent3, 1);
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiRptSelectUI", "onPreferenceTreeClick error item, item is null or item.name isNullOrNil");
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
