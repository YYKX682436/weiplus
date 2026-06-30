package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f264384a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f264385b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.LinkedList f264386c;

    /* renamed from: d, reason: collision with root package name */
    public int f264387d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f264388e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 f264389f;

    /* renamed from: g, reason: collision with root package name */
    public fl1.c0 f264390g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f264391h;

    /* renamed from: i, reason: collision with root package name */
    public int f264392i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f264393j;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var, java.lang.ref.WeakReference context, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        android.view.Window window;
        android.app.Dialog dialog;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f264393j = f3Var;
        this.f264384a = context;
        this.f264385b = str;
        this.f264386c = new java.util.LinkedList();
        java.lang.Object obj = context.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        this.f264390g = new fl1.c0((android.content.Context) obj, null);
        this.f264391h = new java.util.ArrayList();
        if (weakReference == null || (dialog = (android.app.Dialog) weakReference.get()) == null || (window = dialog.getWindow()) == null) {
            java.lang.Object obj2 = context.get();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type android.app.Activity");
            window = ((android.app.Activity) obj2).getWindow();
        }
        android.view.View decorView = window.getDecorView();
        if (decorView != null) {
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup != null) {
                viewGroup.addView(this.f264390g);
            }
        }
    }

    public final void a(int i17) {
        java.lang.String string;
        r45.ix4 ix4Var = new r45.ix4();
        android.os.Bundle bundle = this.f264388e;
        java.lang.String str = "";
        if (bundle != null && (string = bundle.getString("oauth_url", "")) != null) {
            str = string;
        }
        ix4Var.f458924d = str;
        ix4Var.f458925e = i17;
        ix4Var.f458926f.addAll(this.f264391h);
        ix4Var.f458927g = this.f264392i;
        ix4Var.f458928h = this.f264385b;
        java.util.Objects.toString(ix4Var.f458926f);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ix4Var;
        lVar.f152198b = new r45.jx4();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/oauth_authorize_confirm";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ld.f34430x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b3(this.f264393j, this));
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var;
        fl1.c0 c0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var = this.f264389f;
        if (y2Var != null) {
            if ((y2Var != null ? y2Var.f264728c : null) != null && (c0Var = this.f264390g) != null) {
                c0Var.a(y2Var != null ? y2Var.f264728c : null);
            }
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f264386c) || this.f264387d >= this.f264386c.size();
        java.lang.ref.WeakReference weakReference = this.f264384a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var = this.f264393j;
        if (z17) {
            android.os.Bundle bundle = this.f264388e;
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.d(bundle != null ? bundle.getString("oauth_url", "") : null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f264391h)) {
                ((r60.e) ((s60.e) i95.n0.c(s60.e.class))).wi((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.p939x633fb29.p940x30579f.a.OPENSDK, d17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.d3(d17, f3Var, this));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.sendResult] allowScope empty");
            hy4.b bVar = hy4.b.INSTANCE;
            bVar.a(d17 == null ? "" : d17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264513a, 0, 1, 0, 1, 0);
            bVar.b(2, (int) (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264514b), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.reject] reject");
            a(2);
            java.lang.ref.WeakReference weakReference2 = f3Var.f264410c;
            if (weakReference2 == null || (l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2) weakReference2.get()) == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var).d();
            return;
        }
        java.lang.Object obj = weakReference.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        fl1.c0 c0Var2 = this.f264390g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2(f3Var, (android.content.Context) obj, c0Var2);
        y2Var2.f264729d = this;
        android.os.Bundle bundle2 = this.f264388e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle2);
        java.lang.Object obj2 = this.f264386c.get(this.f264387d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        r45.jv5 jv5Var = (r45.jv5) obj2;
        y2Var2.f264730e = jv5Var;
        fl1.o oVar = y2Var2.f264728c;
        oVar.s(2);
        oVar.mo2026xce3d2713(oVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ghg, bundle2.getString("appname", "")));
        oVar.mo2039xb4c13ffe(jv5Var.f459665e);
        oVar.mo2027xea2586cc("");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jv5Var.f459669i)) {
            oVar.mo2042x364e0e56(jv5Var.f459669i);
        }
        oVar.mo2036xc499c596(oVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gii));
        oVar.mo2038xd611ee5a(oVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573933gh3));
        oVar.mo2033x12ec1b74(bundle2.getString("appicon_url", ""));
        java.io.Serializable serializable = bundle2.getSerializable("avatar_list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(serializable, "null cannot be cast to non-null type java.util.ArrayList<kotlin.ByteArray>");
        java.util.ArrayList<byte[]> arrayList = (java.util.ArrayList) serializable;
        y2Var2.f264737l.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            for (byte[] bArr : arrayList) {
                try {
                    r45.mx4 mx4Var = new r45.mx4();
                    mx4Var.mo11468x92b714fd(bArr);
                    arrayList2.add(mx4Var);
                } catch (java.io.IOException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OauthMultiAccountMgr", "bytesListToAvatarList: exception");
                    arrayList2.clear();
                }
            }
        }
        int i17 = bundle2.getInt("default_avatar_id");
        y2Var2.f264732g = bundle2.getBoolean("is_ban_modify_avatar");
        java.lang.String string = bundle2.getString("create_avatar_title", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        y2Var2.f264736k = string;
        y2Var2.f264733h = bundle2.getInt("avatar_limit");
        y2Var2.f264734i = 0;
        java.lang.String d18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.d(bundle2.getString("oauth_url", ""));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "parseAppId(...)");
        y2Var2.f264735j = d18;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jv5Var.f459664d, "snsapi_userinfo");
        fl1.c0 c0Var3 = y2Var2.f264727b;
        if (b17) {
            y2Var2.f264734i = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var = y2Var2.f264729d;
            if (e3Var != null) {
                e3Var.f264392i = i17;
            }
            oVar.mo2034x26df5226(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q2(y2Var2));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
                y2Var2.f264734i = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var2 = y2Var2.f264729d;
                if (e3Var2 != null) {
                    e3Var2.f264392i = i17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthDialog.showDialog] avatarList null");
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, null, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.w2.f264699d.getClass(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.x2(y2Var2, jv5Var));
            } else {
                java.util.ArrayList arrayList3 = y2Var2.f264731f;
                arrayList3.clear();
                java.lang.String Scope = jv5Var.f459664d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Scope, "Scope");
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    r45.mx4 mx4Var2 = (r45.mx4) it.next();
                    java.lang.String str = mx4Var2.f462427e;
                    java.lang.String str2 = mx4Var2.f462429g;
                    boolean z18 = i17 == mx4Var2.f462426d;
                    java.lang.String avatarurl = mx4Var2.f462428f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(avatarurl, "avatarurl");
                    arrayList4.add(new fl1.h1(0, str, str2, Scope, z18, avatarurl, mx4Var2.f462426d));
                }
                arrayList3.addAll(arrayList4);
                y2Var2.a(jv5Var, oVar, arrayList3, y2Var2.f264732g, y2Var2.f264733h);
                oVar.mo2037x3aaa4d8e(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v2(y2Var2, jv5Var));
                c0Var3.c(oVar);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthDialog.showDialog] non snsapi_userinfo");
            oVar.mo2026xce3d2713(y2Var2.f264726a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ghe, bundle2.getString("appname", "")));
            java.lang.String Scope2 = jv5Var.f459664d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Scope2, "Scope");
            oVar.f345368z = Scope2;
            c0Var3.c(oVar);
        }
        this.f264389f = y2Var2;
        this.f264387d++;
    }
}
