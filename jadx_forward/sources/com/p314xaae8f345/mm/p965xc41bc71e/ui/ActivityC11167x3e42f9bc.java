package com.p314xaae8f345.mm.p965xc41bc71e.ui;

/* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI */
/* loaded from: classes9.dex */
public class ActivityC11167x3e42f9bc extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f153390w = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f153391d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f153393f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f153394g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f153395h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f153396i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f153397m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p965xc41bc71e.p967xc84c5534.C11163x161e898f f153398n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f153399o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f153400p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f153401q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f153402r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f153403s;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 f153392e = null;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f153404t = null;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f153405u = null;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f153406v = new java.util.concurrent.atomic.AtomicLong(0);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void V6() {
        char c17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = this.f153405u;
        if (c21571x8a410717 == null || c21571x8a410717 == this.f153404t) {
            setResult(0, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "setResData, has changed, state:%s", c21571x8a410717.f279313q);
        java.lang.String str = this.f153405u.f279313q;
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
                this.f153392e.C = true;
                this.f153393f = true;
                break;
            case 1:
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = this.f153392e;
                c11159x8f55e6d3.f153348u = false;
                c11159x8f55e6d3.f153351x = false;
                c11159x8f55e6d3.C = false;
                this.f153393f = false;
                break;
            case 2:
                this.f153392e.f153351x = true;
                this.f153393f = true;
                break;
            case 3:
                this.f153392e.f153348u = true;
                this.f153393f = true;
                break;
            case 4:
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = this.f153392e;
                c11159x8f55e6d32.f153348u = false;
                c11159x8f55e6d32.f153351x = false;
                c11159x8f55e6d32.C = false;
                this.f153393f = true;
                break;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_data", this.f153392e);
        intent.putExtra("key_status_subscribed", this.f153393f);
        setResult(-1, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        V6();
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo54448x9c8c0d33(new m31.l(this));
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("key_data");
        this.f153393f = getIntent().getBooleanExtra("key_status_subscribed", false);
        this.f153394g = getIntent().getBooleanExtra("key_from_biz", false);
        this.f153396i = getIntent().getStringExtra("key_biz_username");
        this.f153397m = getIntent().getStringExtra("key_template_id");
        this.f153398n = (com.p314xaae8f345.mm.p965xc41bc71e.p967xc84c5534.C11163x161e898f) getIntent().getParcelableExtra("key_report_info");
        this.f153395h = getIntent().getBooleanExtra("key_should_hide_accept", false);
        if (parcelableExtra instanceof com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) {
            this.f153392e = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) parcelableExtra;
            if (getIntent() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f153392e.f153335e)) {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571347ci);
            } else {
                mo54450xbf7c1df6(this.f153392e.f153335e);
            }
        } else {
            finish();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f153391d = m79336x8b97809d;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).t();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717(this);
        this.f153399o = c21571x8a410717;
        c21571x8a410717.C("preference_key_no_accept");
        this.f153399o.J(com.p314xaae8f345.mm.R.C30867xcad56011.akm);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f153391d).d(this.f153399o, -1);
        this.f153400p = null;
        if (!this.f153395h) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107172 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717(this);
            this.f153400p = c21571x8a4107172;
            c21571x8a4107172.C("preference_key_accept");
            this.f153400p.J(com.p314xaae8f345.mm.R.C30867xcad56011.akk);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f153391d).d(this.f153400p, -1);
        }
        this.f153401q = null;
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = this.f153392e;
        if (c11159x8f55e6d3.f153347t) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107173 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717(this);
            this.f153401q = c21571x8a4107173;
            c21571x8a4107173.C("preference_key_accept_allow_play_voice");
            this.f153401q.J(com.p314xaae8f345.mm.R.C30867xcad56011.akl);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f153391d).d(this.f153401q, -1);
        } else if (c11159x8f55e6d3.f153350w) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107174 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717(this);
            this.f153402r = c21571x8a4107174;
            c21571x8a4107174.C("preference_key_accept_allow_force_notify");
            this.f153402r.J(com.p314xaae8f345.mm.R.C30867xcad56011.aka);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107175 = this.f153402r;
            c21571x8a4107175.M(c21571x8a4107175.f279303d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.akb));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f153391d).d(this.f153402r, -1);
        } else if (c11159x8f55e6d3.B) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107176 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717(this);
            this.f153403s = c21571x8a4107176;
            c21571x8a4107176.C("preference_key_accept_allow_notify");
            this.f153403s.J(com.p314xaae8f345.mm.R.C30867xcad56011.o1y);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107177 = this.f153403s;
            c21571x8a4107177.M(c21571x8a4107177.f279303d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o1x));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f153391d).d(this.f153403s, -1);
        }
        if (this.f153394g) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f153391d).d(new m31.t(this, this, new m31.r(this)), -1);
        } else if (this.f153392e.f153339i.size() > 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f153391d).d(new m31.t(this, this, new m31.n(this)), -1);
        }
        if (this.f153393f) {
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = this.f153392e;
            if (c11159x8f55e6d32.f153347t && c11159x8f55e6d32.f153348u) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107178 = this.f153401q;
                if (c21571x8a4107178 != null) {
                    c21571x8a4107178.P = true;
                    this.f153404t = c21571x8a4107178;
                }
            } else if (c11159x8f55e6d32.f153350w && c11159x8f55e6d32.f153351x) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107179 = this.f153402r;
                if (c21571x8a4107179 != null) {
                    c21571x8a4107179.P = true;
                    this.f153404t = c21571x8a4107179;
                }
            } else if (c11159x8f55e6d32.B && c11159x8f55e6d32.C) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071710 = this.f153403s;
                if (c21571x8a41071710 != null) {
                    c21571x8a41071710.P = true;
                    this.f153404t = c21571x8a41071710;
                }
            } else {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071711 = this.f153400p;
                if (c21571x8a41071711 != null) {
                    c21571x8a41071711.P = true;
                    this.f153404t = c21571x8a41071711;
                } else {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071712 = this.f153399o;
                    c21571x8a41071712.P = true;
                    this.f153404t = c21571x8a41071712;
                }
            }
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071713 = this.f153399o;
            c21571x8a41071713.P = true;
            this.f153404t = c21571x8a41071713;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f153391d).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "onPreferenceTreeClick, key:%s", c21560x1fce98fb.f279313q);
        if (c21560x1fce98fb.f279313q.equalsIgnoreCase("preference_key_accept_allow_play_voice")) {
            this.f153399o.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = this.f153400p;
            if (c21571x8a410717 != null) {
                c21571x8a410717.P = false;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107172 = this.f153401q;
            if (!c21571x8a4107172.P) {
                c21571x8a4107172.P = true;
                this.f153405u = c21571x8a4107172;
                if (this.f153392e.f153349v.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "audioTemplateUrl is null, do not show audio sample dialog");
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this);
                    j0Var.setTitle(com.p314xaae8f345.mm.R.C30867xcad56011.akq);
                    j0Var.f293378z.setVisibility(0);
                    j0Var.f293366n.setVisibility(0);
                    j0Var.f293366n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ako);
                    j0Var.u(com.p314xaae8f345.mm.R.C30867xcad56011.akn, new m31.o(this, j0Var));
                    j0Var.A(getString(com.p314xaae8f345.mm.R.C30867xcad56011.akp), true, new m31.p(this));
                    j0Var.M = new m31.q(this);
                    j0Var.show();
                }
            }
        } else if (c21560x1fce98fb.f279313q.equalsIgnoreCase("preference_key_accept_allow_force_notify")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107173 = this.f153402r;
            c21571x8a4107173.P = true;
            this.f153399o.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107174 = this.f153400p;
            if (c21571x8a4107174 != null) {
                c21571x8a4107174.P = false;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107175 = this.f153403s;
            if (c21571x8a4107175 != null) {
                c21571x8a4107175.P = false;
            }
            this.f153405u = c21571x8a4107173;
        } else if (c21560x1fce98fb.f279313q.equalsIgnoreCase("preference_key_accept_allow_notify")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107176 = this.f153403s;
            if (c21571x8a4107176 != null) {
                c21571x8a4107176.P = true;
            }
            this.f153399o.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107177 = this.f153400p;
            if (c21571x8a4107177 != null) {
                c21571x8a4107177.P = false;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107178 = this.f153401q;
            if (c21571x8a4107178 != null) {
                c21571x8a4107178.P = false;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107179 = this.f153402r;
            if (c21571x8a4107179 != null) {
                c21571x8a4107179.P = false;
            }
            this.f153405u = c21571x8a4107176;
        } else if (c21560x1fce98fb.f279313q.equalsIgnoreCase("preference_key_accept")) {
            this.f153399o.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071710 = this.f153400p;
            if (c21571x8a41071710 != null) {
                c21571x8a41071710.P = true;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071711 = this.f153401q;
            if (c21571x8a41071711 != null) {
                c21571x8a41071711.P = false;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071712 = this.f153402r;
            if (c21571x8a41071712 != null) {
                c21571x8a41071712.P = false;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071713 = this.f153403s;
            if (c21571x8a41071713 != null) {
                c21571x8a41071713.P = false;
            }
            this.f153405u = c21571x8a41071710;
        } else if (c21560x1fce98fb.f279313q.equalsIgnoreCase("preference_key_no_accept")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071714 = this.f153399o;
            c21571x8a41071714.P = true;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071715 = this.f153400p;
            if (c21571x8a41071715 != null) {
                c21571x8a41071715.P = false;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071716 = this.f153401q;
            if (c21571x8a41071716 != null) {
                c21571x8a41071716.P = false;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071717 = this.f153402r;
            if (c21571x8a41071717 != null) {
                c21571x8a41071717.P = false;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071718 = this.f153403s;
            if (c21571x8a41071718 != null) {
                c21571x8a41071718.P = false;
            }
            this.f153405u = c21571x8a41071714;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f153391d).notifyDataSetChanged();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f153406v;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p965xc41bc71e.p969x6b2e132.C11171xe3ef7b08(atomicLong.get(), "", 1), p31.e.class, p31.b.f432982d);
        atomicLong.set(0L);
    }
}
