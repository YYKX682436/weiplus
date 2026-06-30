package ef0;

@j95.b
/* loaded from: classes9.dex */
public final class l4 extends i95.w implements qk.i9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f333803d = new java.util.HashMap();

    public java.lang.String Ai(android.content.Context context, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        il4.a aVar = (il4.a) content.y(il4.a.class);
        java.lang.String o17 = il4.d.o(context, aVar != null ? aVar.f373628e : null, true);
        if (!(o17.length() > 0)) {
            java.lang.String str = content.f430187f;
            return str == null ? "" : str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(o17);
        java.lang.String str2 = content.f430187f;
        sb6.append(str2 != null ? str2 : "");
        return sb6.toString();
    }

    public java.lang.String Bi(android.content.Context context, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        il4.a aVar = (il4.a) content.y(il4.a.class);
        boolean z17 = true;
        java.lang.String o17 = il4.d.o(context, aVar != null ? aVar.f373628e : null, true);
        java.lang.String str = content.f430187f;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return o17;
        }
        return o17 + content.f430187f;
    }

    public java.lang.String Di(android.content.Context context, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.omn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(string);
        sb6.append(']');
        java.lang.String str = content.f430187f;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        return sb6.toString();
    }

    public java.lang.String Ni(android.content.Context context, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.String str = content.f430187f;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0 i0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0) content.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0.class);
            return il4.l.f(context, i0Var != null ? i0Var.f273239r : 0, true);
        }
        java.lang.String title = content.f430187f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(title, "title");
        return title;
    }

    public java.lang.String Ri(android.content.Context context, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        boolean z17 = true;
        java.lang.String f17 = il4.l.f(context, ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0) content.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0.class)).f273239r, true);
        java.lang.String str = content.f430187f;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return f17;
        }
        return f17 + ' ' + content.f430187f;
    }

    public bw5.fr0 Ui(np1.a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            bw5.fr0 fr0Var = new bw5.fr0();
            fr0Var.mo11468x92b714fd(aVar.f472507e.f273689a);
            return fr0Var;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingUtilService", th6, "getTingSnapShotDataFromAudioPlayInfo exception", new java.lang.Object[0]);
            return null;
        }
    }

    public void Vi(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingUtilService", "markInTingPlayerPage %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        synchronized (this.f333803d) {
            if (z17) {
                this.f333803d.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
            } else {
                this.f333803d.remove(java.lang.Integer.valueOf(i17));
            }
        }
    }

    public r45.km6 Zi(java.lang.String prefix, java.util.Map values) {
        java.lang.String c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        r45.km6 km6Var = new r45.km6();
        try {
            java.lang.String concat = prefix.concat(".tingCategoryItem");
            boolean z17 = true;
            if (!values.isEmpty()) {
                km6Var.f460371d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(concat + ".type"), 0);
                java.lang.String str = (java.lang.String) values.get(concat + ".categoryItem");
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                km6Var.f460372e = str;
                java.lang.String str3 = (java.lang.String) values.get(concat + ".categoryId");
                if (str3 == null) {
                    str3 = "";
                }
                km6Var.f460373f = str3;
                if (str3.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    bw5.o50 v17 = il4.d.v(km6Var.f460372e);
                    if (v17 != null && (c17 = v17.c()) != null) {
                        str2 = c17;
                    }
                    km6Var.f460373f = str2;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingAlbumShareParser", "parse error! %s", e17.getMessage());
        }
        return km6Var;
    }

    public void aj(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(appId, "wxalitef1d58076d58fb4e8cc6bed37a19a4534")) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Wj(appId, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ui.ActivityC18731x34322739.class);
            com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class));
            iVar.getClass();
            if (!android.text.TextUtils.isEmpty(appId) && com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133.class.isAssignableFrom(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ui.ActivityC18730xef3d8581.class)) {
                ((java.util.concurrent.ConcurrentHashMap) iVar.f148706h).put(appId, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ui.ActivityC18730xef3d8581.class);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "registerTransparentLiteAppActivity error. " + com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ui.ActivityC18730xef3d8581.class + " is not subclass of WxaLiteAppTransparentUI");
        }
    }

    public qk.g9 bj() {
        boolean z17;
        synchronized (rk4.z8.class) {
            z17 = rk4.z8.f478665o;
        }
        if (z17) {
            return (qk.g9) i95.n0.c(qk.g9.class);
        }
        return null;
    }

    public void wi(java.lang.String listenId, boolean z17, boolean z18, yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (listenId.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingUtilService", "fetchMusicPlayItem  listenId empty");
            callback.mo147xb9724478(java.lang.Boolean.FALSE, "listenId invalid", null);
            return;
        }
        int i17 = jm4.y2.f381985d;
        jm4.x2 x2Var = (jm4.x2) p3380x6a61f93.p3381xf512d0a5.C30423x21b244a2.m168746x21b86386();
        if (x2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingUtilService", "fetchService is nil, fetch fail");
            callback.mo147xb9724478(java.lang.Boolean.FALSE, "cpp fetch service is nil", null);
            return;
        }
        bw5.v70 v70Var = new bw5.v70();
        v70Var.u(listenId);
        v70Var.y(1);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        lp0Var.g("temp_".concat(listenId));
        ef0.i4 i4Var = new ef0.i4(callback);
        byte[] mo14344x5f01b1f6 = lp0Var.mo14344x5f01b1f6();
        jm4.x1 x1Var = new jm4.x1();
        x1Var.f381976f = i4Var;
        long m105978x2737f10 = ((jm4.y2) x2Var).m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3380x6a61f93.p3381xf512d0a5.C30423x21b244a2.m168745x21b3d806(m105978x2737f10, mo14344x5f01b1f6, z17, z18, x1Var);
    }
}
