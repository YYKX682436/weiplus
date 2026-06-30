package ly4;

/* loaded from: classes14.dex */
public final class e implements i95.m, ly4.j, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public xc0.a f403817d;

    /* renamed from: e, reason: collision with root package name */
    public ly4.i f403818e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f403819f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f403820g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f403821h;

    /* renamed from: i, reason: collision with root package name */
    public ly4.h f403822i = ly4.h.f403828d;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f403823m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.p f403824n;

    public final void b(boolean z17) {
        if (z17) {
            i(z17);
            xc0.a aVar = this.f403817d;
            if (aVar != null) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.j.f298231b.b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.a.ExtDeviceHandoff_Download, aVar.j(), aVar.n(), c01.id.c(), ly4.a.f403811a);
                long c17 = c01.id.c();
                java.lang.String domain = aVar.l();
                aVar.p("");
                aVar.q(java.lang.String.valueOf(c17));
                java.lang.String xml = aVar.m126747x696739c();
                java.lang.String sendTime = aVar.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(domain, "domain");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendTime, "sendTime");
                java.lang.String r17 = c01.z1.r();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
                this.f403818e = new ly4.i(xml, domain, sendTime, r17, r17, this);
                com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                ly4.i iVar = this.f403818e;
                if (iVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sendHandler");
                    throw null;
                }
                d17.g(iVar);
            }
        } else {
            yz5.a aVar2 = this.f403823m;
            if (aVar2 != null) {
                i(z17);
                aVar2.mo152xb9724478();
            }
        }
        this.f403823m = null;
    }

    public final boolean c() {
        if (c01.d9.b().F()) {
            if (ug3.i.f509072m != c01.d9.b().x()) {
                c01.d9.e().g(new ug3.i(c01.d9.b().x()));
                return false;
            }
        }
        if (!c01.d9.b().F()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!com.p314xaae8f345.mm.ui.bk.A() || !c01.d9.b().F()) {
                return false;
            }
            int i17 = ug3.i.f509075p;
            if (ug3.i.f509073n != 0) {
                return false;
            }
            if (i17 != 2 && i17 != 1) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String f(ly4.h descType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descType, "descType");
        if (!c()) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571429me2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        int ordinal = descType.ordinal();
        if (ordinal == 0) {
            return "";
        }
        if (ordinal == 1) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mdz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal == 2) {
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571428me1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            return string3;
        }
        if (ordinal != 3) {
            throw new jz5.j();
        }
        java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571426me0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        return string4;
    }

    public final boolean h(java.lang.String str) {
        return str == null || str.length() == 0;
    }

    public final void i(boolean z17) {
        xc0.a aVar = this.f403817d;
        if (aVar != null) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            java.lang.String l17 = aVar.l();
            if (l17 == null) {
                l17 = "";
            }
            lVarArr[0] = new jz5.l("dl_domain_name", l17);
            java.lang.String n17 = aVar.n();
            lVarArr[1] = new jz5.l("ad_linkid", n17 != null ? n17 : "");
            lVarArr[2] = new jz5.l("pop_win_btn", java.lang.Integer.valueOf(z17 ? 1 : 2));
            lVarArr[3] = new jz5.l("pop_win_type", java.lang.Integer.valueOf(c() ? 1 : 2));
            lVarArr[4] = new jz5.l("view_id", "mobile_confirm_pop_win");
            ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 34575);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(android.content.Context r17, xc0.a r18) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ly4.e.k(android.content.Context, xc0.a):void");
    }

    public final void l(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f403819f;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        boolean c17 = c();
        if (!z17) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f574200hf0);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c().setOnDismissListener(this);
            return;
        }
        if (c17) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.f293309c = f(this.f403822i);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f80079x4c4ca46a);
            e4Var2.c().setOnDismissListener(this);
            return;
        }
        int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var3.f293309c = f(this.f403822i);
        e4Var3.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var3.c().setOnDismissListener(this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        yz5.p pVar = this.f403824n;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.valueOf(this.f403820g), this.f403821h);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        yz5.p pVar = this.f403824n;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.valueOf(this.f403820g), this.f403821h);
        }
    }
}
