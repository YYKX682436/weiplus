package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI */
/* loaded from: classes9.dex */
public class ActivityC19110xc60f679 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f261494s = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.CheckedTextView f261497f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.CheckedTextView f261498g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261499h;

    /* renamed from: m, reason: collision with root package name */
    public int f261501m;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l3 f261505q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21523x2cc1edc7 f261506r;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f261495d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f261496e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f261500i = 3;

    /* renamed from: n, reason: collision with root package name */
    public int f261502n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f261503o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f261504p = -1;

    public final void U6(boolean z17) {
        this.f261506r.setVisibility(0);
        if (z17) {
            this.f261497f.setChecked(true);
            this.f261498g.setChecked(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l3 l3Var = this.f261505q;
            l3Var.f261934e = this.f261495d;
            l3Var.notifyDataSetChanged();
            this.f261506r.clearChoices();
            int i17 = this.f261502n;
            if (i17 < 0) {
                m78501x43e00957(false);
                return;
            } else {
                this.f261506r.setItemChecked(i17, true);
                m78501x43e00957(true);
                return;
            }
        }
        this.f261497f.setChecked(false);
        this.f261498g.setChecked(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l3 l3Var2 = this.f261505q;
        l3Var2.f261934e = this.f261496e;
        l3Var2.notifyDataSetChanged();
        this.f261506r.clearChoices();
        int i18 = this.f261503o;
        if (i18 < 0) {
            m78501x43e00957(false);
        } else {
            this.f261506r.setItemChecked(i18, true);
            m78501x43e00957(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: checkProcLife */
    public boolean mo66577x53f7ec9a() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5u;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f261499h = m83105x7498fe14().getString("key_bank_type");
        this.f261501m = m83105x7498fe14().getInt("key_bankcard_type", 1);
        this.f261500i = m83105x7498fe14().getInt("key_support_bankcard", 1);
        this.f261504p = m83105x7498fe14().getInt("key_bind_scene", -1);
        this.f261506r = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21523x2cc1edc7) findViewById(com.p314xaae8f345.mm.R.id.mpt);
        this.f261497f = (android.widget.CheckedTextView) findViewById(com.p314xaae8f345.mm.R.id.bta);
        this.f261498g = (android.widget.CheckedTextView) findViewById(com.p314xaae8f345.mm.R.id.btb);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l3 l3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l3(this, this);
        this.f261505q = l3Var;
        this.f261506r.setAdapter((android.widget.ListAdapter) l3Var);
        this.f261506r.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e3(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f3(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g3(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78501x43e00957(false);
        this.f261497f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.h3(this));
        this.f261498g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i3(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kji);
        mo43517x10010bd5();
        ((java.util.LinkedList) this.f261496e).clear();
        ((java.util.LinkedList) this.f261495d).clear();
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.f95344b != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c : ((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.f95344b) {
                if (this.f261504p == 5 && !c19097xe6dc5b4c.R) {
                    c19097xe6dc5b4c.f261198y = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l1t);
                }
                if (2 == c19097xe6dc5b4c.f261191r) {
                    ((java.util.LinkedList) this.f261496e).add(c19097xe6dc5b4c);
                } else if (c19097xe6dc5b4c.b()) {
                    ((java.util.LinkedList) this.f261495d).add(c19097xe6dc5b4c);
                }
            }
        }
        if (this.f261500i == 3 && !this.f261496e.isEmpty()) {
            if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().t()) {
                java.util.Collections.sort(this.f261496e, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j3(this));
            } else {
                java.util.Collections.sort(this.f261496e, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k3(this));
            }
        }
        if (this.f261495d.isEmpty()) {
            int size = ((java.util.LinkedList) this.f261496e).size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) ((java.util.LinkedList) this.f261496e).get(i17)).f261192s.equals(this.f261499h)) {
                    this.f261503o = i17;
                    U6(false);
                    m78501x43e00957(true);
                    break;
                }
                i17++;
            }
            if (this.f261503o < 0) {
                U6(false);
                m78501x43e00957(false);
            }
            this.f261497f.setVisibility(8);
            this.f261498g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
            this.f261498g.setCheckMarkDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.axu);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261499h)) {
            this.f261497f.setChecked(false);
            this.f261498g.setChecked(false);
            this.f261506r.setVisibility(8);
            return;
        }
        if (this.f261501m == 2) {
            int size2 = ((java.util.LinkedList) this.f261496e).size();
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    break;
                }
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) ((java.util.LinkedList) this.f261496e).get(i18)).f261192s.equals(this.f261499h)) {
                    this.f261503o = i18;
                    U6(false);
                    m78501x43e00957(true);
                    break;
                }
                i18++;
            }
            if (this.f261503o < 0) {
                U6(false);
                m78501x43e00957(false);
                return;
            }
            return;
        }
        int size3 = ((java.util.LinkedList) this.f261495d).size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                break;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) ((java.util.LinkedList) this.f261495d).get(i19)).f261192s.equals(this.f261499h)) {
                this.f261502n = i19;
                U6(true);
                m78501x43e00957(true);
                break;
            }
            i19++;
        }
        if (this.f261502n < 0) {
            U6(false);
            m78501x43e00957(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof ss4.z;
        return false;
    }
}
