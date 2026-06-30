package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI */
/* loaded from: classes9.dex */
public class ActivityC16362xdbbebf79 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e f227573g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i6 f227574h;

    /* renamed from: i, reason: collision with root package name */
    public int f227575i = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f227576m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f227577n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f227578o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f227579p = "";

    public final void V6() {
        this.f227578o = true;
        int i17 = this.f227575i;
        if (i17 == 0) {
            this.f227579p = "";
        }
        m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a6(10, i17, 3, "", "v1.0", this.f227579p));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.buq;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a1(this));
        this.f227573g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e) findViewById(com.p314xaae8f345.mm.R.id.f567331j36);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.glf));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a7 a7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a7(mo55332x76847179());
        this.f227574h = a7Var;
        this.f227573g.setAdapter((android.widget.ListAdapter) a7Var);
        this.f227573g.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.b1(this));
        this.f227573g.m79055xb7d2c730(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        V6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.List list;
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a6) || i17 != 0 || i18 != 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a6 a6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a6) m1Var;
        java.util.LinkedList linkedList = a6Var.f226698h.f227010m;
        this.f227579p = a6Var.f226701n;
        if (linkedList != null) {
            int i19 = 0;
            while (true) {
                int size = linkedList.size();
                list = this.f227576m;
                if (i19 >= size) {
                    break;
                }
                ((java.util.LinkedList) list).add((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4) linkedList.get(i19));
                i19++;
            }
            this.f227575i += linkedList.size();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4 n4Var = a6Var.f226698h;
            this.f227577n = n4Var == null || n4Var.f227009i == 1;
            this.f227578o = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i6 i6Var = this.f227574h;
            if (list == null) {
                i6Var.getClass();
                i6Var.f228550d = new java.util.LinkedList();
            } else {
                i6Var.f228550d = list;
            }
            i6Var.notifyDataSetChanged();
        }
        if (this.f227577n) {
            this.f227573g.g();
        } else {
            this.f227573g.b();
        }
        return true;
    }
}
