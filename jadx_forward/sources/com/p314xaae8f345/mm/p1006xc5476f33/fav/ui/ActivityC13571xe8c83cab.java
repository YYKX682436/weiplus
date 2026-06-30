package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.plugin.fav.ui.FavSelectUI */
/* loaded from: classes12.dex */
public class ActivityC13571xe8c83cab extends com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 {
    public java.lang.String S;
    public java.lang.String T;
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c U = null;
    public final java.util.Set V = new java.util.HashSet();
    public final o72.b3 W = new o72.b3(true, true);
    public final android.view.View.OnClickListener X = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w5(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public boolean V6() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo150754x7444f759() > 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public void a7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public void c7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.b d7() {
        if (this.U == null) {
            this.U = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c(mo55332x76847179(), this.f181814v, false);
        }
        return this.U;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public java.util.Set e7() {
        return this.V;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public o72.i4 f7() {
        return this.W;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public android.view.View.OnClickListener g7() {
        return this.X;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public java.lang.String h7() {
        return i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.cct);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public void l7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800
    public void m7() {
        this.f181805m.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f79121x9520e9b4, com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        this.f181804i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ca7);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 0 && -1 == i18) {
            finish();
        } else {
            super.onActivityResult(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.T = getIntent().getStringExtra("key_to_user");
        java.lang.String stringExtra = getIntent().getStringExtra("key_fav_item_id");
        this.S = stringExtra;
        java.util.Set set = this.V;
        if (stringExtra != null) {
            for (java.lang.String str : stringExtra.split(",")) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, Integer.MAX_VALUE);
                if (Integer.MAX_VALUE != P) {
                    ((java.util.HashSet) set).add(java.lang.Integer.valueOf(P));
                }
            }
        }
        ((java.util.HashSet) set).remove(3);
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.U;
        cVar.f182008f = set;
        o72.b3 b3Var = this.W;
        b3Var.f424843a = false;
        b3Var.f424844b = false;
        cVar.f182009g = b3Var;
        this.f181809q.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.q5(this));
        if (!this.F) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78356x618865ad, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r5(this));
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.cct);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.s5(this));
        ((qg5.j2) ((ct.y2) i95.n0.c(ct.y2.class))).getClass();
        fk5.y.f345216d.getClass();
        fk5.y.f345217e = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((qg5.j2) ((ct.y2) i95.n0.c(ct.y2.class))).getClass();
        fk5.y.f345216d.getClass();
        fk5.y.f345217e = true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        int i18;
        s82.g gVar = (s82.g) view.getTag();
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSelectUI", "on item click, holder is null");
            return;
        }
        o72.r2 r2Var = gVar.f486307a;
        if (r2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSelectUI", "on item click, info is null");
            return;
        }
        o72.v2.e(r2Var.f67645x88be67a1, 1, 1, i17 - this.f181803h.getHeaderViewsCount(), 0, -1, -1, -1);
        if (r2Var.f67657x2262335f == 19 && com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b0.b(r2Var.f67640x5ab01132.I)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571236c), null, this, null, null);
            return;
        }
        if (r2Var.f67657x2262335f == 5 && o72.j3.a(r2Var.f67640x5ab01132.f452501m)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571240g), null, this, null, null);
            return;
        }
        int i19 = r2Var.f67657x2262335f;
        if (i19 == 3) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571239f), null, this, null, null);
            return;
        }
        if (i19 == 8 && c01.e2.G(this.T)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571237d), null, this, null, null);
            return;
        }
        if (r2Var.f67657x2262335f == 8 && new o72.b3().a(r2Var, true, true)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571238e), null, this, null, null);
            return;
        }
        long i27 = ip.c.i();
        if (r2Var.f67657x2262335f == 18) {
            i27 = ip.c.h();
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.c_t;
        } else {
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.c_u;
        }
        long j18 = r2Var.f67637x73e2be56;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSelectUI", "fav total size:%s, limitSize:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(i27));
        if (j18 > i27) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(i27)), null, this, null, null);
            return;
        }
        ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).Ai(mo55332x76847179(), this.T, gVar.f486307a, com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya, true, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v5(this, gVar));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da.class);
        java.lang.String toUser = this.T;
        java.lang.String blockStr = this.S;
        daVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blockStr, "blockStr");
        daVar.f182126x = true;
        daVar.f182124v = toUser;
        daVar.f182125w = blockStr;
        o72.i4 i4Var = daVar.f182127y;
        o72.b3 b3Var = (o72.b3) i4Var;
        b3Var.f424845c = true;
        b3Var.f424846d = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = daVar.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        cVar.f182009g = i4Var;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(blockStr);
        java.util.HashSet hashSet = daVar.f182128z;
        if (!K0) {
            java.lang.String str = daVar.f182125w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            for (java.lang.String str2 : (java.lang.String[]) new r26.t(",").g(str, 0).toArray(new java.lang.String[0])) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2, Integer.MAX_VALUE);
                if (Integer.MAX_VALUE != P) {
                    hashSet.add(java.lang.Integer.valueOf(P));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = daVar.f182116n;
        if (cVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        cVar2.f182008f = hashSet;
        cVar2.f182009g = i4Var;
    }
}
