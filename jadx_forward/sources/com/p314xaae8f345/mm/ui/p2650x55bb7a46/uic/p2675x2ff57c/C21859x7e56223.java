package com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c;

/* renamed from: com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC */
/* loaded from: classes12.dex */
public final class C21859x7e56223 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f284280d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f284281e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f284282f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f284283g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f284284h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f284285i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21859x7e56223(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f284280d = jz5.h.b(qe5.o1.f443697d);
        this.f284281e = jz5.h.b(new qe5.u1(this));
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f284285i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC$liteAppDestroyListener$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                j75.f Q6;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 event = c5675xda3892c3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event.f136001g.f89350a != 3) {
                    return false;
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223 c21859x7e56223 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223.this;
                if (c21859x7e56223.Z6().o().getVisibility() != 0 || (Q6 = c21859x7e56223.Q6()) == null) {
                    return false;
                }
                kd5.n nVar = new kd5.n(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291257i);
                nVar.f388437c = true;
                Q6.B3(nVar);
                return false;
            }
        };
    }

    public static final void T6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223 c21859x7e56223) {
        c21859x7e56223.getClass();
        try {
            kd5.e Y6 = c21859x7e56223.Y6();
            if ((Y6 != null ? Y6.f388414i : null) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewUIC", "simpleMsgInfo is null");
                return;
            }
            java.lang.String V6 = c21859x7e56223.V6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FilePreviewUIC", "previewFile query: ".concat(V6));
            c21859x7e56223.b7(V6);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewUIC", "Preview file error", e17);
        }
    }

    public final java.lang.String U6() {
        java.lang.String str;
        java.lang.String str2;
        kd5.e Y6 = Y6();
        if (Y6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewUIC", "buildLocalCompressedFileQueryParams state is null");
            return "";
        }
        if (!Y6.f388417o || (str = Y6.f388418p) == null) {
            str = "";
        }
        cl0.g gVar = new cl0.g();
        gVar.h("fileSize", java.lang.String.valueOf(Y6.f388427y));
        gVar.h("fileExt", Y6.f388426x);
        gVar.h(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, com.p314xaae8f345.mm.vfs.w6.i(Y6.F, false));
        gVar.h(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, Y6.f388425w);
        oi3.g gVar2 = Y6.f388414i;
        if (gVar2 == null || (str2 = java.lang.Long.valueOf(gVar2.m75942xfb822ef2(gVar2.f427150d + 1)).toString()) == null) {
            str2 = "";
        }
        gVar.h("msgSvrId", str2);
        java.lang.String str3 = Y6.f388413h;
        if (str3 == null) {
            str3 = "";
        }
        gVar.h("chatName", str3);
        gVar.h("extInfo", str);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = Y6.f388410e;
        gVar.h("senderUsername", f9Var != null ? g95.e0.f(f9Var) : "");
        sc5.g gVar3 = sc5.g.f488105a;
        kd5.e Y62 = Y6();
        if (gVar3.e(Y62 != null ? Y62.f388426x : null)) {
            gVar.h("minVersion", "1.2.0");
        }
        java.lang.String gVar4 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
        return gVar4;
    }

    public final java.lang.String V6() {
        java.lang.String str;
        java.lang.String str2;
        oi3.g gVar;
        kd5.e Y6 = Y6();
        if (Y6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewUIC", "");
            return "";
        }
        java.lang.String str3 = Y6.B;
        boolean z17 = false;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = Y6.C;
        }
        kd5.e Y62 = Y6();
        int floor = (Y62 == null || (gVar = Y62.f388414i) == null) ? 0 : (int) java.lang.Math.floor((1209600 - c01.id.f(gVar.m75942xfb822ef2(gVar.f427150d + 2) / 1000)) / 86400.0d);
        if (!Y6.f388417o || (str = Y6.f388418p) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = Y6.f388410e;
        if (f9Var != null && f9Var.A0() == 1) {
            z17 = true;
        }
        int i17 = z17 ? 1 : 2;
        cl0.g gVar2 = new cl0.g();
        gVar2.h("fileId", str3);
        gVar2.h("aesKey", Y6.D);
        gVar2.h("fileSize", java.lang.String.valueOf(Y6.f388427y));
        gVar2.h("fileExt", Y6.f388426x);
        gVar2.h("expiredIn", java.lang.String.valueOf(floor));
        gVar2.h(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, Y6.f388425w);
        gVar2.o("sendSource", i17);
        oi3.g gVar3 = Y6.f388414i;
        if (gVar3 == null || (str2 = java.lang.Long.valueOf(gVar3.m75942xfb822ef2(gVar3.f427150d + 1)).toString()) == null) {
            str2 = "";
        }
        gVar2.h("msgSvrId", str2);
        java.lang.String str4 = Y6.f388413h;
        if (str4 == null) {
            str4 = "";
        }
        gVar2.h("chatName", str4);
        gVar2.h("extInfo", str);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = Y6.f388410e;
        gVar2.h("senderUsername", f9Var2 != null ? g95.e0.f(f9Var2) : "");
        java.lang.String gVar4 = gVar2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
        return gVar4;
    }

    public final boolean W6() {
        java.lang.Object m143895xf1229813;
        sc5.g gVar = sc5.g.f488105a;
        kd5.e Y6 = Y6();
        if (!gVar.a(Y6 != null ? Y6.f388426x : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAndPreviewLocalFile fileExt: ");
            kd5.e Y62 = Y6();
            sb6.append(Y62 != null ? Y62.f388426x : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FilePreviewUIC", sb6.toString());
            return false;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.String U6 = U6();
            kd5.e Y63 = Y6();
            a7(U6, gVar.e(Y63 != null ? Y63.f388426x : null) ? "pages/markdown" : "pages/archiveLocal");
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.File.FilePreviewUIC", m143898xd4a2fc34, "", new java.lang.Object[0]);
        return false;
    }

    public final boolean X6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        boolean b17;
        kd5.e Y6 = Y6();
        if (Y6 != null && (f9Var = Y6.f388410e) != null) {
            kd5.e Y62 = Y6();
            if (Y62 != null && Y62.f388417o) {
                te5.h hVar = te5.h.f500182a;
                kd5.e Y63 = Y6();
                b17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.d(f9Var, Y63 != null ? Y63.F : null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21739x6cf62a8());
            } else {
                b17 = te5.h.f500182a.b(f9Var);
            }
            this.f284282f = b17;
            this.f284283g = te5.h.f500182a.d(f9Var) == 7;
        }
        kd5.e Y64 = Y6();
        boolean z17 = Y64 != null ? Y64.P : false;
        if ((!this.f284282f && !this.f284283g) || z17) {
            return false;
        }
        em.d0 Z6 = Z6();
        Z6.c().setVisibility(8);
        Z6.h().setVisibility(8);
        Z6.g().setVisibility(8);
        Z6.t().setVisibility(8);
        Z6.r().setVisibility(8);
        Z6.s().setVisibility(8);
        Z6.u().setVisibility(8);
        Z6.a().setVisibility(8);
        Z6.b().setVisibility(8);
        Z6.p().setVisibility(8);
        Z6.k().setVisibility(8);
        Z6.f().setVisibility(8);
        Z6.q().setVisibility(8);
        Z6.x().setVisibility(8);
        Z6.l().setVisibility(0);
        Z6.l().setText(com.p314xaae8f345.mm.R.C30867xcad56011.nhq);
        if (this.f284282f) {
            Z6.l().setText(com.p314xaae8f345.mm.R.C30867xcad56011.nhq);
        } else if (this.f284283g) {
            Z6.l().setText(com.p314xaae8f345.mm.R.C30867xcad56011.n_y);
        }
        return true;
    }

    public final kd5.e Y6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.mo140437x75286adb();
        }
        return null;
    }

    public final em.d0 Z6() {
        return (em.d0) ((jz5.n) this.f284281e).mo141623x754a37bb();
    }

    public final void a7(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite1bb2f5d7cc00eda04a5fa173bf6643b8");
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
        bundle.putString("query", str);
        bundle.putBoolean("isHalfScreen", false);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(m80379x76847179(), bundle, true, false, new qe5.s1(this));
    }

    public final void b7(java.lang.String str) {
        int intValue = ((java.lang.Number) ((jz5.n) this.f284280d).mo141623x754a37bb()).intValue();
        float intValue2 = 1 <= intValue && intValue < 101 ? ((java.lang.Number) ((jz5.n) r0).mo141623x754a37bb()).intValue() / 100.0f : 0.85f;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite1bb2f5d7cc00eda04a5fa173bf6643b8");
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "pages/home");
        bundle.putString("query", str);
        bundle.putBoolean("isHalfScreen", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f34 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34();
        c16190x27388f34.f224947h = true;
        c16190x27388f34.f224944e = intValue2;
        c16190x27388f34.f224946g = 1.0d;
        c16190x27388f34.f224945f = 1.0d;
        bundle.putParcelable("halfScreenConfig", c16190x27388f34);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(m80379x76847179(), bundle, true, false, new qe5.t1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f284285i.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f284285i.mo48814x2efc64();
    }
}
