package zp1;

/* renamed from: zp1.a$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC30845x2ca3e0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981 f556472d;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC30845x2ca3e0(com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981 activityC12952x7179b981) {
        this.f556472d = activityC12952x7179b981;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.f175360m;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981 activityC12952x7179b981 = this.f556472d;
        activityC12952x7179b981.getClass();
        ph.a.b(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class, new wh.t0() { // from class: zp1.a$$f
            @Override // wh.t0
            /* renamed from: accept */
            public final void mo40853xab27b508(java.lang.Object obj) {
                final com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k kVar = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k) obj;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.f175360m;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981 activityC12952x7179b9812 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.this;
                activityC12952x7179b9812.getClass();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC12952x7179b9812.mo55332x76847179(), 1, true);
                k0Var.f293405n = new db5.o4() { // from class: zp1.a$$g
                    @Override // db5.o4
                    /* renamed from: onCreateMMMenu */
                    public final void mo887xc459429a(db5.g4 g4Var) {
                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.f175360m;
                        g4Var.add(":main");
                        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.this.getClass();
                        for (java.lang.String str : java.util.Collections.emptySet()) {
                            if (!com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29.equals(str)) {
                                g4Var.add(":" + str);
                            }
                        }
                    }
                };
                k0Var.f293414s = new db5.t4() { // from class: zp1.a$$h
                    @Override // db5.t4
                    /* renamed from: onMMMenuItemSelected */
                    public final void mo888x34063ac(android.view.MenuItem menuItem2, int i19) {
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.f175360m;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981 activityC12952x7179b9813 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.this;
                        activityC12952x7179b9813.getClass();
                        java.lang.String charSequence = menuItem2.getTitle().toString();
                        if (charSequence.contains(":")) {
                            java.lang.String substring = charSequence.substring(charSequence.lastIndexOf(":") + 1);
                            activityC12952x7179b9813.m78548x39037dd1();
                            activityC12952x7179b9813.m78494xd9193382(1, ":" + substring, new zp1.MenuItemOnMenuItemClickListenerC30845x2ca3e0(activityC12952x7179b9813), null, com.p314xaae8f345.mm.ui.fb.NORMAL);
                            zp1.e eVar = activityC12952x7179b9813.f175361d;
                            eVar.f518362e = substring;
                            eVar.f518361d = 0;
                            eVar.f518360c.post(new vh.w(eVar));
                            activityC12952x7179b9813.f175361d.b();
                            activityC12952x7179b9813.U6(0);
                        }
                    }
                };
                k0Var.t(true);
                k0Var.q("选择进程", 17);
                k0Var.e(true);
                k0Var.v();
            }
        });
        return false;
    }
}
