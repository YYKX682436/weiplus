package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

@db5.a(m123858x6ac9171 = 2048)
/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI */
/* loaded from: classes12.dex */
public class ActivityC13579xef51058a extends com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 implements s82.h, w82.a0, w82.r1 {

    /* renamed from: y1, reason: collision with root package name */
    public static final /* synthetic */ int f181969y1 = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c T;
    public w82.k U;
    public o72.r2 V;
    public android.widget.TextView X;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 Z;

    /* renamed from: p1, reason: collision with root package name */
    public o72.r2 f181972p1;
    public long S = 0;
    public int W = 0;
    public java.lang.String Y = "";

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f181971p0 = null;

    /* renamed from: x0, reason: collision with root package name */
    public final int[] f181973x0 = new int[2];

    /* renamed from: y0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f181975y0 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.tb(this);

    /* renamed from: l1, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemLongClickListener f181970l1 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.vb(this);

    /* renamed from: x1, reason: collision with root package name */
    public final android.view.View.OnClickListener f181974x1 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.xa(this);

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$4, reason: invalid class name */
    /* loaded from: classes12.dex */
    class AnonymousClass4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5431x20c53acc> {
        public AnonymousClass4(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 354680028;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5431x20c53acc c5431x20c53acc) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.this.f181812t.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.rb(this));
            return true;
        }
    }

    public static void o7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a, android.content.Context context, int i17, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar, o72.r2 r2Var) {
        java.lang.String str;
        int i18;
        boolean z17;
        activityC13579xef51058a.getClass();
        long i19 = ip.c.i();
        int i27 = com.p314xaae8f345.mm.R.C30867xcad56011.c_s;
        if (4105 == i17) {
            r2 = cVar != null ? cVar.m() : 0L;
            str = "fav_multi_send,";
        } else if (4106 == i17) {
            r2 = r2Var != null ? r2Var.f67637x73e2be56 : 0L;
            if (r2Var.f67657x2262335f == 18) {
                i19 = ip.c.h();
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.c_t;
            } else {
                i19 = ip.c.i();
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.c_u;
            }
            i27 = i18;
            str = "fav_trans_send,";
        } else {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteMenuHelper", "%s totalSize:%s, maxLimitSize:%s", str, java.lang.Long.valueOf(r2), java.lang.Long.valueOf(i19));
        if (r2 > i19) {
            db5.e1.T(context, context.getString(i27, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(i19)));
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17 && com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.g(context, i17, cVar, r2Var)) {
            o72.z2.a(".ui.transmit.SelectConversationUI");
        }
    }

    public static void p7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = activityC13579xef51058a.Z;
        if (y1Var != null) {
            android.view.View view = y1Var.f293560f;
            long a07 = o72.x1.a0();
            long b07 = o72.x1.b0();
            if (b07 > a07) {
                b07 = a07;
            }
            java.lang.String O = o72.x1.O((float) a07);
            java.lang.String O2 = o72.x1.O((float) b07);
            com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc)).getPaint(), 0.8f);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.vkz);
            textView.setText(O2 + " / " + O);
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            java.util.List o47 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().o4();
            long j17 = 0;
            if (o47 != null) {
                java.util.Iterator it = o47.iterator();
                while (it.hasNext()) {
                    j17 += o72.x1.b((o72.r2) it.next());
                }
            }
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tzb);
            int i17 = activityC13579xef51058a.f181812t.f525356n;
            if (i17 == 1) {
                str = activityC13579xef51058a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ntz, o72.x1.O((float) (j17 - o72.x1.K())));
            } else if (i17 == 3) {
                str = activityC13579xef51058a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573274nu0, o72.x1.O((float) o72.x1.K()));
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str);
            }
        }
    }

    public static boolean r7(java.util.List list, android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener, boolean z17, boolean z18) {
        r45.bq0 bq0Var;
        r45.op0 op0Var;
        if (list == null || list.isEmpty()) {
            return true;
        }
        o72.b3 b3Var = new o72.b3();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z19 = false;
        while (it.hasNext()) {
            o72.r2 r2Var = (o72.r2) it.next();
            if (r2Var != null && (bq0Var = r2Var.f67640x5ab01132) != null && bq0Var.f452497f != null) {
                int i37 = r2Var.f67657x2262335f;
                if (i37 == 3) {
                    i27++;
                } else if (i37 == 19 && com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b0.b(bq0Var.I)) {
                    i28++;
                } else if ((r2Var.f67657x2262335f == 5 && o72.j3.a(r2Var.f67640x5ab01132.f452501m)) || (r2Var.f67657x2262335f == 24 && (op0Var = r2Var.f67640x5ab01132.P) != null && op0Var.f463953t)) {
                    i29++;
                } else {
                    java.util.Iterator it6 = r2Var.f67640x5ab01132.f452497f.iterator();
                    int i38 = 0;
                    while (it6.hasNext()) {
                        int i39 = ((r45.gp0) it6.next()).X1;
                        java.util.Iterator it7 = it6;
                        if (i39 == 2) {
                            i17++;
                        } else if (i39 == 1) {
                            i18++;
                        } else {
                            i38++;
                        }
                        it6 = it7;
                    }
                    if (b3Var.a(r2Var, z17, z18)) {
                        i19++;
                        if (i38 > 0) {
                            i38--;
                        }
                    }
                    if (!z19 && i38 == r2Var.f67640x5ab01132.f452497f.size()) {
                        z19 = true;
                    }
                }
            }
        }
        if (1 != list.size()) {
            if (i17 <= 0 && i18 <= 0 && i19 <= 0 && i27 <= 0 && i28 <= 0 && i29 <= 0) {
                return true;
            }
            if (z19) {
                db5.e1.B(context, context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.nxu : com.p314xaae8f345.mm.R.C30867xcad56011.f572724ca1), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572472bb1), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), onClickListener, null, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
                return false;
            }
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572723ca0));
            return false;
        }
        if (((o72.r2) list.get(0)).f67657x2262335f == 14 && (i17 > 0 || i18 > 0)) {
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_v));
            return false;
        }
        if (i17 > 0) {
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_w, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).rj(((o72.r2) list.get(0)).f67657x2262335f))));
            return false;
        }
        if (i18 > 0) {
            int i47 = ((o72.r2) list.get(0)).f67657x2262335f;
            if (i47 == 2) {
                db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_y));
                return false;
            }
            if (i47 != 4) {
                if (i47 == 8) {
                    db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_x));
                    return false;
                }
                if (i47 != 16) {
                    return false;
                }
            }
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_z));
            return false;
        }
        if (i19 > 0) {
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571238e));
            return false;
        }
        if (i27 > 0) {
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571239f));
            return false;
        }
        if (i28 > 0) {
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571236c));
            return false;
        }
        if (i29 <= 0) {
            return true;
        }
        db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571240g));
        return false;
    }

    @Override // s82.h
    public void F4(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.T;
        if (cVar.f182017q) {
            this.U.b(cVar.l() > 0);
            Z6(this.T.l());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public boolean V6() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo150754x7444f759() > 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public void a7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "enterMoreModeImpl hide post");
        mo74407xb0dfae51(11, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public void c7() {
        t7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.b d7() {
        if (this.T == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c(mo55332x76847179(), this.f181814v, false);
            this.T = cVar;
            cVar.f182010h = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ta(this);
            cVar.f182025y = this;
            cVar.F = 1;
            cVar.I = this.f181803h;
        }
        return this.T;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public java.util.Set e7() {
        return new java.util.HashSet();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public o72.i4 f7() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public android.view.View.OnClickListener g7() {
        return this.f181974x1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public java.lang.String h7() {
        return i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572731cb1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public void j7() {
        super.j7();
        this.f181812t.b(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public void l7() {
        this.f181812t.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ua(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public void m7() {
        this.f181805m.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f79121x9520e9b4, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84)));
        this.f181804i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ca7);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public void n7() {
        super.n7();
        this.f181808p.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ub(this));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x00e8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0329  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r20, int r21, android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o25.n1.d(this, m78513xc2a54588());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f181818z = this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex");
        super.onCreate(bundle);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().u2() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex, but favorite db is null ,return");
            finish();
            return;
        }
        ((m82.l) pf5.z.f435481a.a(this).a(m82.l.class)).f406246d = this.D;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572731cb1);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.gb(this));
        this.f181803h.setOnItemLongClickListener(this.f181970l1);
        this.f181803h.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.pb(this));
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f181975y0;
        d17.a(438, u0Var);
        gm0.j1.d().a(401, u0Var);
        android.view.LayoutInflater.from(this);
        new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, false);
        new db5.g4(this);
        new db5.g4(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "initPostEntry: ");
        m78478x84f07bce(11, com.p314xaae8f345.mm.R.C30867xcad56011.c98, com.p314xaae8f345.mm.R.raw.f79996xebd1f109, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.wa(this));
        boolean z17 = this.F;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "initSelectAllButton: useTopFilter=%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "initSelectAllButton: calling addTextOptionMenu with text: %s", getString(com.p314xaae8f345.mm.R.C30867xcad56011.nxf));
            mo78491xd9193382(12, getString(com.p314xaae8f345.mm.R.C30867xcad56011.nxf), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$$b
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y1 y1Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.this;
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.f181969y1;
                    activityC13579xef51058a.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "Select All button clicked");
                    if (activityC13579xef51058a.F) {
                        h0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da) pf5.z.f435481a.a(activityC13579xef51058a).a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da.class)).f182115m;
                        if (h0Var == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavGallery");
                            throw null;
                        }
                    } else {
                        h0Var = null;
                    }
                    if (h0Var == null || !h0Var.a() || (y1Var = h0Var.f182474a) == null) {
                        return true;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) y1Var;
                    if (l2Var.d()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a1 a1Var = h0Var.f182493t;
                        if (a1Var != null) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_cancel_select_all_btn", "view_clk", a1Var.c(h0Var.f182474a), 32903);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[unselectAll] Clear all selections");
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.b();
                        l2Var.f182529d.m8146xced61ae5();
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.z1 z1Var = l2Var.f182526a;
                        if (z1Var != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) z1Var).k(0);
                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.z0 z0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) l2Var.f182526a).f182496w;
                            if (z0Var != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t9) z0Var).c(null);
                            }
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a1 a1Var2 = h0Var.f182493t;
                        if (a1Var2 != null) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_select_all_btn", "view_clk", a1Var2.c(h0Var.f182474a), 32903);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Start loading all image/video data from database");
                        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.k2(l2Var));
                    }
                    activityC13579xef51058a.invalidateOptionsMenu();
                    return true;
                }
            });
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "initSelectAllButton: hiding select all button by default");
            mo74407xb0dfae51(12, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "initSelectAllButton: completed");
        }
        w82.k kVar = new w82.k();
        this.U = kVar;
        kVar.a(findViewById(com.p314xaae8f345.mm.R.id.dtg));
        this.U.f525436k = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ab(this);
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.mb(this));
        o72.i2.b().a(null);
        kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
        o72.z2.f425068a = new java.util.Vector();
        o25.n1.d(this, m78513xc2a54588());
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FavoriteIndexUI)).Rj(this, iy1.a.Fav);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(43, 34, 188, getIntent());
        android.widget.TextView textView = (android.widget.TextView) this.f181807o.findViewById(com.p314xaae8f345.mm.R.id.v_8);
        this.X = textView;
        ym5.a1.h(textView, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.qb(this));
        this.X.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.f181969y1;
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.this;
                activityC13579xef51058a.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13579xef51058a, array);
                activityC13579xef51058a.s7("");
                activityC13579xef51058a.v7("view_clk");
                yj0.a.h(activityC13579xef51058a, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f181812t.m173332xcb673d62(this);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.AnonymousClass4 anonymousClass4 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.AnonymousClass4(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f181971p0 = anonymousClass4;
        anonymousClass4.mo48813x58998cd();
        android.view.View view = this.f181807o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.Y = gm0.j1.b().j() + "_" + java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da.class);
        java.lang.String str = this.Y;
        daVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        daVar.H = str;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        boolean z17 = this.F;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "onCreateOptionsMenu: called, useTopFilter=%b, menu size=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(menu.size()));
        if (!z17) {
            android.view.MenuItem add = menu.add(0, 10, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jzr);
            add.setIcon(com.p314xaae8f345.mm.ui.uk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f78356x618865ad, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            add.setShowAsAction(2);
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "onCreateOptionsMenu: completed, result=%b, menu size=%d", java.lang.Boolean.valueOf(onCreateOptionsMenu), java.lang.Integer.valueOf(menu.size()));
        return onCreateOptionsMenu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        r6[r9] = r0;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.onDestroy():void");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.T;
        if (cVar != null) {
            cVar.onItemClick(adapterView, view, i17, j17);
            s82.g gVar = (s82.g) view.getTag();
            if (gVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteIndexUI", "on item click, holder is null..");
                return;
            }
            o72.r2 r2Var = gVar.f486307a;
            if (r2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteIndexUI", "on item click, info is null..");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "click type is %d", java.lang.Integer.valueOf(r2Var.f67657x2262335f));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12746, java.lang.Integer.valueOf(gVar.f486307a.f67657x2262335f), 0, java.lang.Integer.valueOf(i17 - 1));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 || !this.T.f182017q) {
            return super.onKeyUp(i17, keyEvent);
        }
        t7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (this.F || menuItem.getItemId() != 10) {
            return super.onOptionsItemSelected(menuItem);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_fav_search_from", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.e(mo55332x76847179(), this.T.f182017q, intent);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        o72.z2.c(getClass().getSimpleName(), "");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 64) {
            if (i17 != 80) {
                return;
            }
            if (iArr[0] != 0) {
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ib(this), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.jb(this));
                return;
            } else {
                o72.x1.M0(this, ".ui.FavPostVoiceUI", new android.content.Intent(), 4102, null);
                overridePendingTransition(0, 0);
                return;
            }
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.kb(this), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.lb(this));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
        intent.putExtra("map_view_type", 3);
        j45.l.n(this, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, 4097);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        java.lang.System.currentTimeMillis();
        super.onResume();
        this.f181808p.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.va(this));
        java.lang.System.currentTimeMillis();
        o72.z2.a(getClass().getSimpleName());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q7(java.util.List r22, java.lang.String r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.q7(java.util.List, java.lang.String, java.lang.String, boolean):void");
    }

    public void s7(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.Z;
        if (y1Var != null) {
            y1Var.q();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(this);
        this.Z = y1Var2;
        y1Var2.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570294e55);
        android.view.View view = this.Z.f293560f;
        view.setBackground(null);
        view.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nb(this));
        long a07 = o72.x1.a0();
        long b07 = o72.x1.b0();
        if (b07 > a07) {
            b07 = a07;
        }
        java.lang.String O = o72.x1.O((float) a07);
        java.lang.String O2 = o72.x1.O((float) b07);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc)).getPaint(), 0.8f);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.vkz);
        textView.setText(O2 + " / " + O);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tzb);
        if (str.isEmpty()) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13621xd713929d) view.findViewById(com.p314xaae8f345.mm.R.id.lbl)).m55397x3ae760af((o72.x1.b0() * 1.0d) / o72.x1.a0());
        view.findViewById(com.p314xaae8f345.mm.R.id.ssu).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ob(this));
        this.Z.s();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(m82.l.class);
    }

    public final void t7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "exitEditMode: show post");
        this.T.g(false, null);
        this.f181803h.setOnItemLongClickListener(this.f181970l1);
        mo74407xb0dfae51(11, true);
        this.U.c();
        b7();
    }

    public void u7(boolean z17) {
        android.view.View view = this.f181807o;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "onVisibilityChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "onVisibilityChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        w7();
    }

    public final void v7(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fav_cap_status", 0);
        hashMap.put("fav_cap_usage", java.lang.Float.valueOf(((float) o72.x1.b0()) / 1024.0f));
        hashMap.put("fav_cap_limit", java.lang.Float.valueOf(((float) o72.x1.a0()) / 1024.0f));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_space_cap_bar", str, hashMap, 32903);
    }

    public final void w7() {
        long a07 = o72.x1.a0();
        long b07 = o72.x1.b0();
        if (b07 > a07) {
            b07 = a07;
        }
        this.X.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.nuo, o72.x1.O((float) a07), o72.x1.O((float) b07)));
    }
}
