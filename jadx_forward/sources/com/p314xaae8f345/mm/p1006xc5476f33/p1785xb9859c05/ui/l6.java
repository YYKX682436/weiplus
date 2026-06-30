package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes14.dex */
public class l6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.l, j83.a {
    public long A;

    /* renamed from: a, reason: collision with root package name */
    public android.widget.EditText f224435a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f224436b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f224437c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f224438d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f224439e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b f224440f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b f224441g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b f224442h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageButton f224443i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ViewOnClickListenerC16124xc5ddcee3 f224444j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f224445k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f224446l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageButton f224447m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f224448n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f224449o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f224451q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f224452r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f224453s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f224454t;

    /* renamed from: u, reason: collision with root package name */
    public int f224455u;

    /* renamed from: v, reason: collision with root package name */
    public int f224456v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5 f224457w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Bitmap f224458x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j f224459y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k6 f224460z;

    /* renamed from: p, reason: collision with root package name */
    public int f224450p = -1;
    public long B = -1;
    public boolean C = false;
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5 activityC16150x8f474cc5) {
        this.f224457w = activityC16150x8f474cc5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Bi().f224041i;
        this.f224459y = jVar;
        jVar.f223977d = this;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398632e = this.f224457w;
        l83.d Di = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di();
        l83.l lVar = Di.f398628a;
        lVar.f398650h = Di;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = lVar.f398646d;
        if (!c21000x8b2f716.f273966h) {
            c21000x8b2f716.b(lVar);
            if (lVar.f398647e.a(new l83.i(lVar))) {
                lVar.f398648f = 0L;
            } else {
                lVar.f398648f = -1L;
            }
        }
        j83.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398629b;
        if (bVar != null) {
            bVar.f379693k = this;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398631d = this;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Bi().f224041i.a(false);
    }

    public void b() {
        android.widget.TextView textView = this.f224445k;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.View view = this.f224446l;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "dismissNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "dismissNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void c() {
        this.f224435a.setKeyListener(null);
        this.f224435a.setHorizontallyScrolling(true);
        this.f224444j.setVisibility(4);
        this.f224444j.m65172x80095805(true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224454t)) {
            h(this.f224454t);
        }
        if (fp.h.c(16)) {
            this.f224435a.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
            this.f224436b.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224451q)) {
            this.f224458x = t83.c.d(this.f224457w, this.f224451q, true);
        }
        if (this.f224458x == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224449o)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c5 c5Var = t83.c.f497944a;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5247xb7907c7d c5247xb7907c7d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5247xb7907c7d();
            c5247xb7907c7d.e();
            if (c5247xb7907c7d.f135580g.f88752a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5 activityC16150x8f474cc5 = this.f224457w;
                java.lang.String str = this.f224449o;
                java.lang.String e17 = t83.c.e(activityC16150x8f474cc5, str);
                android.graphics.Bitmap d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17) ? null : t83.c.d(activityC16150x8f474cc5, e17, true);
                if (d17 == null) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5247xb7907c7d c5247xb7907c7d2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5247xb7907c7d();
                    c5247xb7907c7d2.e();
                    if (c5247xb7907c7d2.f135580g.f88752a) {
                        java.lang.String j17 = t83.c.j(str);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                            d17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).Vi(j17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 4);
                        }
                    }
                }
                this.f224458x = d17;
            }
        }
        if (this.f224458x == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224453s)) {
            this.f224458x = ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).Vi(this.f224453s, 480, 480, 4);
        }
        if (this.f224458x == null) {
            this.f224438d.setVisibility(0);
            this.f224439e.setVisibility(8);
        }
        if (this.f224458x != null) {
            this.f224438d.setVisibility(8);
            this.f224439e.setVisibility(0);
            this.f224439e.setImageBitmap(this.f224458x);
        }
        this.f224447m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f6(this));
        this.f224442h.m65182x483864ab(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.g6(this));
        this.f224440f.m65182x483864ab(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h6(this));
        this.f224441g.m65182x483864ab(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i6(this));
        this.f224443i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j6(this));
        this.f224444j.m65171xb1e1a3f8(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y5(this));
    }

    public void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "onBluetoothPlugStateChange, isPlugged: %b", java.lang.Boolean.valueOf(z17));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().b()) {
            if (!z17) {
                l83.d Di = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di();
                j83.b Ai = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
                Di.b(Ai != null ? Ai.f379699q : false);
                this.f224442h.m65183xae17c85(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b c16138x11b4d11b = this.f224442h;
                j83.b Ai2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
                c16138x11b4d11b.m65181xdd7d58e5(Ai2 != null ? Ai2.f379699q : false);
                return;
            }
            boolean a17 = this.f224442h.a();
            j83.b Ai3 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
            if (Ai3 != null) {
                Ai3.f379699q = a17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().b(false);
            this.f224442h.m65183xae17c85(false);
            j83.b Ai4 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "mBluetoothResumeSpeaker:%s", java.lang.Boolean.valueOf(Ai4 != null ? Ai4.f379699q : false));
        }
    }

    public void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "onHeadsetPlugStateChange, isPlugged: %b", java.lang.Boolean.valueOf(z17));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().b()) {
            if (!z17) {
                l83.d Di = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di();
                j83.b Ai = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
                Di.b(Ai != null ? Ai.f379698p : false);
                this.f224442h.m65183xae17c85(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b c16138x11b4d11b = this.f224442h;
                j83.b Ai2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
                c16138x11b4d11b.m65181xdd7d58e5(Ai2 != null ? Ai2.f379698p : false);
                return;
            }
            boolean a17 = this.f224442h.a();
            j83.b Ai3 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
            if (Ai3 != null) {
                Ai3.f379698p = a17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().b(false);
            this.f224442h.m65183xae17c85(false);
            j83.b Ai4 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "mHeadsetResumeSpeaker:%s", java.lang.Boolean.valueOf(Ai4 != null ? Ai4.f379698p : false));
        }
    }

    public void f() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().b()) {
            boolean a17 = this.f224442h.a();
            j83.b Ai = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
            if (Ai != null) {
                Ai.f379698p = a17;
            }
            boolean a18 = this.f224442h.a();
            j83.b Ai2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
            if (Ai2 != null) {
                Ai2.f379699q = a18;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().b(this.f224442h.a());
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398629b.f379695m.b(this.f224440f.a());
        }
    }

    public void g(int i17) {
        java.lang.String str;
        if (i17 != 3) {
            if (i17 == 5) {
                this.f224437c.setText(java.lang.String.format("%02d:%02d", java.lang.Long.valueOf(this.A / 60), java.lang.Long.valueOf(this.A % 60)));
                return;
            } else {
                if (i17 != 10) {
                    return;
                }
                this.f224437c.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g4y);
                return;
            }
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386450t;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if ((i18 & 1) > 0 && (i18 & 2) <= 0) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6h) + " ";
        } else if ((i18 & 8) > 0) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6i) + " ";
        } else {
            str = "";
        }
        int i19 = this.f224450p;
        if (i19 == -1) {
            this.f224437c.setText(str + this.f224457w.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4v));
            return;
        }
        java.lang.String n17 = t83.c.n(i19);
        this.f224437c.setText(str + this.f224457w.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4w, n17));
    }

    public final void h(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224448n)) {
            i(t83.c.c(str), "");
        } else {
            i(this.f224448n, t83.c.c(str));
        }
    }

    public final void i(java.lang.String str, java.lang.String str2) {
        this.f224435a.setText(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f224435a.setSelection(r2.getText().length() - 1);
        }
        this.f224436b.setText(str2);
    }

    public final void j(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        java.lang.String str4;
        b();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                str4 = str3;
                if (2 != i17 && str2 != null) {
                    this.f224437c.setText(str2);
                    return;
                } else {
                    if (1 == i17 || str2 == null) {
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5 activityC16150x8f474cc5 = this.f224457w;
                    db5.e1.E(activityC16150x8f474cc5, str2, str4, activityC16150x8f474cc5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3i), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e6(this));
                    return;
                }
            }
            str = this.f224457w.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3h);
        }
        str4 = str;
        if (2 != i17) {
        }
        if (1 == i17) {
        }
    }

    public final void k(int i17) {
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f(42);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k6 k6Var = this.f224460z;
        if (k6Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5 activityC16150x8f474cc5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5) k6Var;
            if (this.D) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i5(activityC16150x8f474cc5), 3000L);
            }
        }
    }
}
