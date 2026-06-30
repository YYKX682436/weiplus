package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc;

/* loaded from: classes15.dex */
public class m extends android.widget.LinearLayout {
    public android.media.AudioManager A;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.t3 B;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 C;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 D;
    public final int E;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 f273598d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f273599e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f273600f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f273601g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.l f273602h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f273603i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f273604m;

    /* renamed from: n, reason: collision with root package name */
    public android.content.Context f273605n;

    /* renamed from: o, reason: collision with root package name */
    public long f273606o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f273607p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f273608q;

    /* renamed from: r, reason: collision with root package name */
    public long f273609r;

    /* renamed from: s, reason: collision with root package name */
    public long f273610s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f273611t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f273612u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f273613v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.Toast f273614w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f273615x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f273616y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f273617z;

    public m(android.content.Context context, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        super(context);
        this.f273606o = 0L;
        this.f273607p = false;
        this.f273608q = false;
        this.f273609r = 0L;
        this.f273610s = 0L;
        this.f273611t = false;
        this.f273612u = false;
        this.f273613v = false;
        this.f273615x = new java.util.ArrayList();
        this.f273617z = "";
        this.B = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.i(this);
        this.C = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.j(this);
        this.D = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.k(this);
        this.E = i65.a.b(getContext(), 280);
        this.F = true;
        this.f273605n = context;
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.d9n, this);
        this.f273599e = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.p5p);
        this.f273600f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.p5o);
        this.f273601g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.p5u);
        this.f273604m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568631ni0);
        this.f273599e.setVisibility(0);
        this.f273601g.setVisibility(4);
        this.f273600f.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.p5w);
        this.f273603i = c22621x7603e0172;
        c22621x7603e0172.setHintTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a09));
        this.f273603i.setClickable(false);
        this.f273599e.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.h(this));
        this.f273603i.clearFocus();
        this.f273603i.setFocusable(false);
        this.f273603i.setClickable(false);
        this.f273603i.setLongClickable(false);
        this.A = (android.media.AudioManager) getContext().getSystemService("audio");
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.nanoTime());
        this.f273617z = valueOf;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "mToUser %s", valueOf);
        d();
    }

    public static void a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar, int i17) {
        android.widget.Toast toast = mVar.f273614w;
        if (toast != null) {
            toast.cancel();
        }
        android.content.Context context = mVar.f273605n;
        android.widget.Toast m125854x26a183b = dp.a.m125854x26a183b(context, context.getResources().getString(i17), 0);
        mVar.f273614w = m125854x26a183b;
        m125854x26a183b.setGravity(17, 0, 0);
        mVar.f273614w.show();
    }

    public static void b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mVar.f273603i;
        if (c22621x7603e017 == null || c22621x7603e017.getText() == null) {
            return;
        }
        java.lang.String obj = mVar.f273603i.getText().toString();
        if ((obj.trim().length() == 0 && obj.length() == 0) || mVar.f273602h == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a();
        c17189xc14104a.f37856x35cf88 = 1;
        if (mVar.f273612u) {
            c17189xc14104a.f37856x35cf88 = 2;
        }
        if (i17 != 1 && i17 == 4) {
            c17189xc14104a.f37856x35cf88 = 4;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "sendMsg onSendMsg");
        zk5.c cVar = (zk5.c) mVar.f273602h;
        cVar.getClass();
        if (!android.text.TextUtils.isEmpty(obj) && obj.length() > 2) {
            obj = obj.substring(0, obj.length() - 1);
        }
        java.lang.String str = obj;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, str);
        com.p314xaae8f345.mm.ui.p2746xf1c361fc.ActivityC22595x36a11daa activityC22595x36a11daa = cVar.f555082a;
        activityC22595x36a11daa.setResult(0, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15178, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, activityC22595x36a11daa.f292759f, activityC22595x36a11daa.f292760g, java.lang.Integer.valueOf(activityC22595x36a11daa.f292761h), java.lang.Integer.valueOf(activityC22595x36a11daa.f292762i));
        activityC22595x36a11daa.finish();
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "destroy");
        e();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f273616y;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
            this.f273616y = null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722 = this.f273598d;
        if (abstractC19655xeb0f7722 != null) {
            abstractC19655xeb0f7722.a();
            this.f273598d.m75387xc1b94687(null);
            this.f273598d.c();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f77222 = this.f273598d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = abstractC19655xeb0f77222.f271394o;
            if (n3Var != null) {
                n3Var.mo50302x6b17ad39(null);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = abstractC19655xeb0f77222.f271395p;
            if (n3Var2 != null) {
                n3Var2.mo50302x6b17ad39(null);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = abstractC19655xeb0f77222.f271396q;
            if (b4Var != null) {
                b4Var.d();
            }
            this.f273598d = null;
        }
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).Di(this.C);
        this.C = null;
        this.f273605n = null;
    }

    public void d() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f273606o = android.os.SystemClock.elapsedRealtime();
        if (this.f273616y == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", " initVoiceResultListener");
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6218x5d218385> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6218x5d218385>(a0Var) { // from class: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputPanel$3
                {
                    this.f39173x3fe91575 = -191167627;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6218x5d218385 c6218x5d218385) {
                    am.n00 n00Var;
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6218x5d218385 c6218x5d2183852 = c6218x5d218385;
                    if (!(c6218x5d2183852 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6218x5d218385)) {
                        return false;
                    }
                    if (c6218x5d2183852 == null || (n00Var = c6218x5d2183852.f136467g) == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent event data is null");
                        return false;
                    }
                    java.lang.String str = n00Var.f88921d;
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m.this;
                    if (!str.equalsIgnoreCase(mVar.f273617z)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent userCode not equals!");
                        mVar.c();
                        return false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent action = %s, textChange: %b", java.lang.Integer.valueOf(n00Var.f88918a), java.lang.Integer.valueOf(n00Var.f88919b));
                    int i17 = n00Var.f88918a;
                    if (i17 == 2) {
                        if (n00Var.f88919b == 1) {
                            mVar.f273612u = true;
                        } else {
                            mVar.f273612u = false;
                        }
                        mVar.f273603i.setText(n00Var.f88920c);
                        mVar.f();
                    } else if (i17 == 3) {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.l lVar = mVar.f273602h;
                        if (lVar != null) {
                            ((zk5.c) lVar).a();
                        }
                    } else if (i17 == 1 || i17 == 4) {
                        if (n00Var.f88919b == 1) {
                            mVar.f273612u = true;
                        } else {
                            mVar.f273612u = false;
                        }
                        mVar.f273603i.setText(n00Var.f88920c);
                        mVar.f();
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m.b(mVar, n00Var.f88918a);
                    } else {
                        mVar.e();
                    }
                    return true;
                }
            };
            this.f273616y = abstractC20980x9b9ad01d;
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        if (this.f273598d == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722) findViewById(com.p314xaae8f345.mm.R.id.p5x);
            this.f273598d = abstractC19655xeb0f7722;
            abstractC19655xeb0f7722.m75387xc1b94687(this.D);
            this.f273598d.m75386xa5426eff(this.B);
        }
        this.f273604m.setVisibility(0);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).wi(this.C);
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceInputPanel reset");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "pause");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722 = this.f273598d;
        if (abstractC19655xeb0f7722 != null) {
            abstractC19655xeb0f7722.a();
        }
        this.f273611t = false;
        this.F = true;
        this.f273612u = false;
        ((java.util.ArrayList) this.f273615x).clear();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f273603i;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setText("");
            f();
        }
    }

    public final void f() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f273603i;
        if (c22621x7603e017 == null || c22621x7603e017.getText() == null || this.f273603i.getText().length() != 0) {
            this.f273599e.setVisibility(4);
            this.f273604m.setVisibility(8);
        } else {
            this.f273601g.setVisibility(4);
            this.f273599e.setVisibility(0);
            this.f273600f.setVisibility(8);
            this.f273604m.setVisibility(0);
        }
        android.media.AudioManager audioManager = this.A;
        if (audioManager != null) {
            audioManager.setStreamMute(3, false);
        }
        if (this.f273608q) {
            return;
        }
        this.f273608q = true;
        java.lang.System.currentTimeMillis();
    }

    /* renamed from: setCallback */
    public void m75918x6c4ebec7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.l lVar) {
        this.f273602h = lVar;
    }

    /* renamed from: setToUser */
    public void m75919x24830fe8(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceInputPanel", "setToUser toUser is isNullOrNil");
        } else {
            this.f273617z = str;
        }
    }
}
