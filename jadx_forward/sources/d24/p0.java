package d24;

/* loaded from: classes5.dex */
public final class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 f307489d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1) {
        this.f307489d = c17513xe6a0fae1;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1 = this.f307489d;
        if (itemId != c17513xe6a0fae1.f243388n) {
            if (itemId == c17513xe6a0fae1.f243389o) {
                c17513xe6a0fae1.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11545, java.lang.Integer.valueOf(c17513xe6a0fae1.f243392r));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseWeChat");
                if (c17513xe6a0fae1.f243398x == null) {
                    android.view.View inflate = android.view.View.inflate(c17513xe6a0fae1.m80379x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cl9, null);
                    c17513xe6a0fae1.f243398x = inflate;
                    android.widget.CheckBox checkBox = (android.widget.CheckBox) (inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.f568406mq3) : null);
                    c17513xe6a0fae1.f243399y = checkBox;
                    if (checkBox != null) {
                        checkBox.setChecked(true);
                    }
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = c17513xe6a0fae1.f243397w;
                if (j0Var == null) {
                    c17513xe6a0fae1.f243397w = db5.e1.r(c17513xe6a0fae1.m80379x76847179(), null, c17513xe6a0fae1.f243398x, c17513xe6a0fae1.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.gis), c17513xe6a0fae1.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new d24.y(c17513xe6a0fae1), new d24.z(c17513xe6a0fae1));
                    return;
                } else {
                    j0Var.show();
                    return;
                }
            }
            return;
        }
        c17513xe6a0fae1.getClass();
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k())};
        java.util.HashMap hashMap = new java.util.HashMap(1);
        java.util.Map.Entry entry = entryArr[0];
        java.lang.Object key = entry.getKey();
        java.util.Objects.requireNonNull(key);
        java.lang.Object value = entry.getValue();
        java.util.Objects.requireNonNull(value);
        if (hashMap.put(key, value) != null) {
            throw new java.lang.IllegalArgumentException("duplicate key: " + key);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("log_out_ack", "view_clk", java.util.Collections.unmodifiableMap(hashMap), 34575);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        if (r26.i0.y(r17, "wxid", false) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.c()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !c01.z1.x() && ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(c17513xe6a0fae1.m80379x76847179());
            u1Var.g(c17513xe6a0fae1.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f574578is3));
            u1Var.n(c17513xe6a0fae1.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f574577is2));
            u1Var.l(new d24.b0(c17513xe6a0fae1));
            u1Var.a(true);
            u1Var.q(false);
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0 && c01.z1.t() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.c()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            db5.e1.C(c17513xe6a0fae1.m80379x76847179(), c17513xe6a0fae1.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.giw), null, c17513xe6a0fae1.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bln), c17513xe6a0fae1.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new d24.a0(c17513xe6a0fae1), null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1.x7(c17513xe6a0fae1);
        }
    }
}
