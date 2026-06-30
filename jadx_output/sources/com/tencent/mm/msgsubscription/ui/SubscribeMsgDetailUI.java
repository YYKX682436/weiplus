package com.tencent.mm.msgsubscription.ui;

/* loaded from: classes9.dex */
public class SubscribeMsgDetailUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f71857w = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f71858d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f71860f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f71861g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f71862h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f71863i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f71864m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.msgsubscription.report.SubscribeMsgReporter$SubscribeMsgSettingReportInfo f71865n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f71866o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f71867p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f71868q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f71869r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f71870s;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.msgsubscription.SubscribeMsgTmpItem f71859e = null;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f71871t = null;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f71872u = null;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f71873v = new java.util.concurrent.atomic.AtomicLong(0);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void V6() {
        char c17;
        com.tencent.mm.ui.base.preference.SelectPreference selectPreference = this.f71872u;
        if (selectPreference == null || selectPreference == this.f71871t) {
            setResult(0, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "setResData, has changed, state:%s", selectPreference.f197780q);
        java.lang.String str = this.f71872u.f197780q;
        str.getClass();
        switch (str.hashCode()) {
            case -1808702062:
                if (str.equals("preference_key_accept_allow_notify")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -539313406:
                if (str.equals("preference_key_no_accept")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 1193881254:
                if (str.equals("preference_key_accept_allow_force_notify")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case 1670060592:
                if (str.equals("preference_key_accept_allow_play_voice")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 1820626124:
                if (str.equals("preference_key_accept")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
                this.f71859e.C = true;
                this.f71860f = true;
                break;
            case 1:
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = this.f71859e;
                subscribeMsgTmpItem.f71815u = false;
                subscribeMsgTmpItem.f71818x = false;
                subscribeMsgTmpItem.C = false;
                this.f71860f = false;
                break;
            case 2:
                this.f71859e.f71818x = true;
                this.f71860f = true;
                break;
            case 3:
                this.f71859e.f71815u = true;
                this.f71860f = true;
                break;
            case 4:
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = this.f71859e;
                subscribeMsgTmpItem2.f71815u = false;
                subscribeMsgTmpItem2.f71818x = false;
                subscribeMsgTmpItem2.C = false;
                this.f71860f = true;
                break;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_data", this.f71859e);
        intent.putExtra("key_status_subscribed", this.f71860f);
        setResult(-1, intent);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        V6();
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setBackBtn(new m31.l(this));
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("key_data");
        this.f71860f = getIntent().getBooleanExtra("key_status_subscribed", false);
        this.f71861g = getIntent().getBooleanExtra("key_from_biz", false);
        this.f71863i = getIntent().getStringExtra("key_biz_username");
        this.f71864m = getIntent().getStringExtra("key_template_id");
        this.f71865n = (com.tencent.mm.msgsubscription.report.SubscribeMsgReporter$SubscribeMsgSettingReportInfo) getIntent().getParcelableExtra("key_report_info");
        this.f71862h = getIntent().getBooleanExtra("key_should_hide_accept", false);
        if (parcelableExtra instanceof com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) {
            this.f71859e = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) parcelableExtra;
            if (getIntent() == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f71859e.f71802e)) {
                setMMTitle(com.tencent.mm.R.string.f489814ci);
            } else {
                setMMTitle(this.f71859e.f71802e);
            }
        } else {
            finish();
        }
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f71858d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).t();
        com.tencent.mm.ui.base.preference.SelectPreference selectPreference = new com.tencent.mm.ui.base.preference.SelectPreference(this);
        this.f71866o = selectPreference;
        selectPreference.C("preference_key_no_accept");
        this.f71866o.J(com.tencent.mm.R.string.akm);
        ((com.tencent.mm.ui.base.preference.h0) this.f71858d).d(this.f71866o, -1);
        this.f71867p = null;
        if (!this.f71862h) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = new com.tencent.mm.ui.base.preference.SelectPreference(this);
            this.f71867p = selectPreference2;
            selectPreference2.C("preference_key_accept");
            this.f71867p.J(com.tencent.mm.R.string.akk);
            ((com.tencent.mm.ui.base.preference.h0) this.f71858d).d(this.f71867p, -1);
        }
        this.f71868q = null;
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = this.f71859e;
        if (subscribeMsgTmpItem.f71814t) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference3 = new com.tencent.mm.ui.base.preference.SelectPreference(this);
            this.f71868q = selectPreference3;
            selectPreference3.C("preference_key_accept_allow_play_voice");
            this.f71868q.J(com.tencent.mm.R.string.akl);
            ((com.tencent.mm.ui.base.preference.h0) this.f71858d).d(this.f71868q, -1);
        } else if (subscribeMsgTmpItem.f71817w) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference4 = new com.tencent.mm.ui.base.preference.SelectPreference(this);
            this.f71869r = selectPreference4;
            selectPreference4.C("preference_key_accept_allow_force_notify");
            this.f71869r.J(com.tencent.mm.R.string.aka);
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference5 = this.f71869r;
            selectPreference5.M(selectPreference5.f197770d.getResources().getString(com.tencent.mm.R.string.akb));
            ((com.tencent.mm.ui.base.preference.h0) this.f71858d).d(this.f71869r, -1);
        } else if (subscribeMsgTmpItem.B) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference6 = new com.tencent.mm.ui.base.preference.SelectPreference(this);
            this.f71870s = selectPreference6;
            selectPreference6.C("preference_key_accept_allow_notify");
            this.f71870s.J(com.tencent.mm.R.string.o1y);
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference7 = this.f71870s;
            selectPreference7.M(selectPreference7.f197770d.getResources().getString(com.tencent.mm.R.string.o1x));
            ((com.tencent.mm.ui.base.preference.h0) this.f71858d).d(this.f71870s, -1);
        }
        if (this.f71861g) {
            ((com.tencent.mm.ui.base.preference.h0) this.f71858d).d(new m31.t(this, this, new m31.r(this)), -1);
        } else if (this.f71859e.f71806i.size() > 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f71858d).d(new m31.t(this, this, new m31.n(this)), -1);
        }
        if (this.f71860f) {
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = this.f71859e;
            if (subscribeMsgTmpItem2.f71814t && subscribeMsgTmpItem2.f71815u) {
                com.tencent.mm.ui.base.preference.SelectPreference selectPreference8 = this.f71868q;
                if (selectPreference8 != null) {
                    selectPreference8.P = true;
                    this.f71871t = selectPreference8;
                }
            } else if (subscribeMsgTmpItem2.f71817w && subscribeMsgTmpItem2.f71818x) {
                com.tencent.mm.ui.base.preference.SelectPreference selectPreference9 = this.f71869r;
                if (selectPreference9 != null) {
                    selectPreference9.P = true;
                    this.f71871t = selectPreference9;
                }
            } else if (subscribeMsgTmpItem2.B && subscribeMsgTmpItem2.C) {
                com.tencent.mm.ui.base.preference.SelectPreference selectPreference10 = this.f71870s;
                if (selectPreference10 != null) {
                    selectPreference10.P = true;
                    this.f71871t = selectPreference10;
                }
            } else {
                com.tencent.mm.ui.base.preference.SelectPreference selectPreference11 = this.f71867p;
                if (selectPreference11 != null) {
                    selectPreference11.P = true;
                    this.f71871t = selectPreference11;
                } else {
                    com.tencent.mm.ui.base.preference.SelectPreference selectPreference12 = this.f71866o;
                    selectPreference12.P = true;
                    this.f71871t = selectPreference12;
                }
            }
        } else {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference13 = this.f71866o;
            selectPreference13.P = true;
            this.f71871t = selectPreference13;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f71858d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "onPreferenceTreeClick, key:%s", preference.f197780q);
        if (preference.f197780q.equalsIgnoreCase("preference_key_accept_allow_play_voice")) {
            this.f71866o.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference = this.f71867p;
            if (selectPreference != null) {
                selectPreference.P = false;
            }
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = this.f71868q;
            if (!selectPreference2.P) {
                selectPreference2.P = true;
                this.f71872u = selectPreference2;
                if (this.f71859e.f71816v.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "audioTemplateUrl is null, do not show audio sample dialog");
                } else {
                    com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this);
                    j0Var.setTitle(com.tencent.mm.R.string.akq);
                    j0Var.f211845z.setVisibility(0);
                    j0Var.f211833n.setVisibility(0);
                    j0Var.f211833n.setText(com.tencent.mm.R.string.ako);
                    j0Var.u(com.tencent.mm.R.string.akn, new m31.o(this, j0Var));
                    j0Var.A(getString(com.tencent.mm.R.string.akp), true, new m31.p(this));
                    j0Var.M = new m31.q(this);
                    j0Var.show();
                }
            }
        } else if (preference.f197780q.equalsIgnoreCase("preference_key_accept_allow_force_notify")) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference3 = this.f71869r;
            selectPreference3.P = true;
            this.f71866o.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference4 = this.f71867p;
            if (selectPreference4 != null) {
                selectPreference4.P = false;
            }
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference5 = this.f71870s;
            if (selectPreference5 != null) {
                selectPreference5.P = false;
            }
            this.f71872u = selectPreference3;
        } else if (preference.f197780q.equalsIgnoreCase("preference_key_accept_allow_notify")) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference6 = this.f71870s;
            if (selectPreference6 != null) {
                selectPreference6.P = true;
            }
            this.f71866o.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference7 = this.f71867p;
            if (selectPreference7 != null) {
                selectPreference7.P = false;
            }
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference8 = this.f71868q;
            if (selectPreference8 != null) {
                selectPreference8.P = false;
            }
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference9 = this.f71869r;
            if (selectPreference9 != null) {
                selectPreference9.P = false;
            }
            this.f71872u = selectPreference6;
        } else if (preference.f197780q.equalsIgnoreCase("preference_key_accept")) {
            this.f71866o.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference10 = this.f71867p;
            if (selectPreference10 != null) {
                selectPreference10.P = true;
            }
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference11 = this.f71868q;
            if (selectPreference11 != null) {
                selectPreference11.P = false;
            }
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference12 = this.f71869r;
            if (selectPreference12 != null) {
                selectPreference12.P = false;
            }
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference13 = this.f71870s;
            if (selectPreference13 != null) {
                selectPreference13.P = false;
            }
            this.f71872u = selectPreference10;
        } else if (preference.f197780q.equalsIgnoreCase("preference_key_no_accept")) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference14 = this.f71866o;
            selectPreference14.P = true;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference15 = this.f71867p;
            if (selectPreference15 != null) {
                selectPreference15.P = false;
            }
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference16 = this.f71868q;
            if (selectPreference16 != null) {
                selectPreference16.P = false;
            }
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference17 = this.f71869r;
            if (selectPreference17 != null) {
                selectPreference17.P = false;
            }
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference18 = this.f71870s;
            if (selectPreference18 != null) {
                selectPreference18.P = false;
            }
            this.f71872u = selectPreference14;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f71858d).notifyDataSetChanged();
        return false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f71873v;
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.msgsubscription.voice.PlayVoiceData(atomicLong.get(), "", 1), p31.e.class, p31.b.f351449d);
        atomicLong.set(0L);
    }
}
