package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class x implements com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f262753a = "";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 f262754b;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02) {
        this.f262754b = activityC19168xd4c44a02;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    public int a() {
        return 2755;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    public com.p314xaae8f345.mm.p944x882e457a.m1 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = this.f262754b;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = activityC19168xd4c44a02.f262619h;
        nt4.k kVar = new nt4.k(c19761xc2874b62.f273662d, c19761xc2874b62.f273664f, c19761xc2874b62.f273665g, c19761xc2874b62.f273667i, c19761xc2874b62.f273671p, c19761xc2874b62.f273666h, c19761xc2874b62.f273673r, c19761xc2874b62.f273674s, c19761xc2874b62.f273677v, c19761xc2874b62.f273675t, c19761xc2874b62.f273680y);
        kVar.m82990x6fae0924(java.lang.System.currentTimeMillis());
        kVar.m82989x7c4af7d8("PayProcess");
        kVar.m82991x53aed94a(activityC19168xd4c44a02.f262619h.f273675t);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(kVar);
        return kVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    public java.lang.String c() {
        return this.f262753a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    /* renamed from: onSceneEnd */
    public void mo73991x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = this.f262754b;
        if (i17 != 0 || i18 != 0) {
            activityC19168xd4c44a02.finish();
            return;
        }
        nt4.k kVar = (nt4.k) m1Var;
        java.lang.String str2 = kVar.f421367f;
        this.f262753a = str2;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
        c19760x34448d56.f273647m = str2;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = activityC19168xd4c44a02.f262619h;
        c19760x34448d56.f273649o = c19761xc2874b62.f273662d;
        c19760x34448d56.f273650p = kVar.f421368g;
        int i19 = c19761xc2874b62.f273675t;
        c19760x34448d56.f273642e = i19;
        c19760x34448d56.f273654t = str;
        c19760x34448d56.f273644g = c19761xc2874b62.f273677v;
        c19760x34448d56.F = kVar.f39851x243a3e51;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.b(i19, str2, i18);
        h45.a0.f(activityC19168xd4c44a02, c19760x34448d56, 1);
    }
}
