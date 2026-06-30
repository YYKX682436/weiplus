package s33;

/* loaded from: classes8.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final lt0.l f484074a = new lt0.l(8);

    public static android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int[] iArr = {android.graphics.Color.argb(180, 0, 0, 0), android.graphics.Color.argb(125, 0, 0, 0)};
        com.p314xaae8f345.mm.ui.bk.C();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        gradientDrawable.draw(new android.graphics.Canvas(bitmap));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatUtils", "addGradientDrawableToBitmap end, cost:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return bitmap;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String query = parse.getQuery();
        if (query != null) {
            str2 = query + "&" + str2;
        }
        try {
            return new java.net.URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), str2, parse.getFragment()).toString();
        } catch (java.net.URISyntaxException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("GameChatRoom.GameChatUtils", e17, "", new java.lang.Object[0]);
            return str;
        }
    }

    public static boolean c(boolean z17) {
        for (android.app.ActivityManager.AppTask appTask : ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getAppTasks()) {
            android.content.ComponentName component = appTask.getTaskInfo().baseIntent.getComponent();
            if (component != null && component.getClassName().equals(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15841xb112d221.class.getName())) {
                if (z17) {
                    appTask.finishAndRemoveTask();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatUtils", "finish and remove multi task, clear:%b", java.lang.Boolean.valueOf(z17));
                return true;
            }
        }
        return false;
    }

    public static java.lang.String d(java.util.List list) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return "()";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        for (int i17 = 0; i17 < list.size() - 1; i17++) {
            sb6.append("'");
            sb6.append((java.lang.String) list.get(i17));
            sb6.append("',");
        }
        sb6.append("'");
        sb6.append((java.lang.String) list.get(list.size() - 1));
        sb6.append("')");
        return sb6.toString();
    }

    public static s33.g e(java.lang.String str) {
        java.util.Map map = s33.n.f484062a;
        return !((java.util.HashMap) map).containsKey(str) ? new s33.g() : (s33.g) ((java.util.HashMap) map).get(str);
    }

    public static boolean f(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        boolean z17 = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15841xb112d221;
        java.lang.String str = s33.n.f484064c;
        return z17 && (str != null && str.contains(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15841xb112d221.class.getName()));
    }

    public static boolean g() {
        return ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_chatroom_open_multitask, 0) == 1;
    }

    public static int h(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        return i(context, c15780xf49d6a1c, 0, null);
    }

    public static int i(final android.content.Context context, final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c, final int i17, final java.lang.String str) {
        if (c15780xf49d6a1c == null) {
            return 0;
        }
        int i18 = c15780xf49d6a1c.f36742x28d6c0ab;
        if (i18 == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15780xf49d6a1c.f36743xf0cd21de)) {
                return 0;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Di(c15780xf49d6a1c.f36743xf0cd21de, new m33.f1() { // from class: s33.y$$a
                @Override // m33.f1
                public final void a(m33.e1 e1Var) {
                    android.content.Context context2 = context;
                    int i19 = i17;
                    java.lang.String str2 = str;
                    android.os.Bundle bundle = new android.os.Bundle();
                    java.util.Objects.toString(e1Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = c15780xf49d6a1c;
                    if (e1Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f404815a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f404816b) || (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.l() != null && com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.l().f405658d.contains(e1Var.f404815a))) {
                        s33.y.j(context2, c15780xf49d6a1c2, i19, str2);
                        return;
                    }
                    android.net.Uri parse = android.net.Uri.parse(c15780xf49d6a1c2.f36743xf0cd21de);
                    bundle.putString("pkgId", parse.getQueryParameter("wechat_pkgid"));
                    java.lang.String query = parse.getQuery();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        query = query + "&__game_center_present_custom_data__=" + str2;
                    }
                    bundle.putString("appId", e1Var.f404815a);
                    bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, e1Var.f404816b);
                    bundle.putString("query", query);
                    if (c15780xf49d6a1c2.f36741x68a8edf8 != null) {
                        bundle.putInt("KHalfScreenBackGroundColor", com.p314xaae8f345.mm.ui.bk.C() ? context2.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560758td) : context2.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560757tc));
                        bundle.putBoolean("isHalfScreen", true);
                        bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, true);
                        bundle.putDouble("heightPercent", c15780xf49d6a1c2.f36741x68a8edf8.f36731x3474cd60);
                    }
                    if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(e1Var.f404815a) == null) {
                        s33.y.j(context2, c15780xf49d6a1c2, i19, str2);
                        return;
                    }
                    s33.z zVar = new s33.z();
                    boolean Jj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj(bundle.getString("appId"));
                    com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Bj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(bundle.getString("appId"));
                    java.lang.String queryParameter = android.net.Uri.parse(c15780xf49d6a1c2.f36743xf0cd21de).getQueryParameter("force_open_liteapp");
                    boolean z17 = false;
                    boolean z18 = queryParameter == null || !queryParameter.equals("0");
                    if (Bj != null && !com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65266x7cc9f2f3(Bj.f14369x346425, Bj.f14359x58b7f1c, Bj.f14372xa8503287, bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714))) {
                        if (z18) {
                            z17 = true;
                        } else {
                            s33.y.j(context2, c15780xf49d6a1c2, i19, str2);
                            zVar.mo555x2fd71e();
                        }
                    }
                    if (!Jj) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameChatRoom.GameChatUtils", "gamelog.util, jumpToPage, openLiteApp  is forbidden");
                        zVar.mo555x2fd71e();
                        s33.y.j(context2, c15780xf49d6a1c2, i19, str2);
                        return;
                    }
                    java.lang.String string = bundle.getString("preInjectData");
                    cl0.g gVar = new cl0.g();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        try {
                            cl0.g gVar2 = new cl0.g();
                            try {
                                gVar2.h("preInjectData", new cl0.g(string));
                                gVar = gVar2;
                            } catch (org.json.JSONException e17) {
                                e = e17;
                                gVar = gVar2;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameChatRoom.GameChatUtils", "parse preInjectData fail. %s", e.toString());
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).hk(context2, bundle, z17, gVar, null, new s33.a0(zVar, context2, c15780xf49d6a1c2, i19, str2));
                            }
                        } catch (org.json.JSONException e18) {
                            e = e18;
                        }
                    }
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).hk(context2, bundle, z17, gVar, null, new s33.a0(zVar, context2, c15780xf49d6a1c2, i19, str2));
                }
            });
            return 2;
        }
        if (i18 != 2) {
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f c15838x34f4a78f = c15780xf49d6a1c.f36745x92fd8573;
        if (c15838x34f4a78f == null) {
            return 3;
        }
        java.lang.String str2 = c15838x34f4a78f.f36918x58b82fc;
        java.lang.String str3 = c15838x34f4a78f.f36919x346425;
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = str2;
        b1Var.f398555f = str3;
        b1Var.f398549c = 0;
        b1Var.f398565k = 1079;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
        return 3;
    }

    public static int j(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c, int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f c15777x5c9b169f = c15780xf49d6a1c.f36741x68a8edf8;
        if (c15777x5c9b169f != null) {
            int i18 = c15777x5c9b169f.f36732x368f3a;
            if (i18 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.n.a(context, c15780xf49d6a1c.f36743xf0cd21de, i17, true, c15777x5c9b169f.f36730xd371e91, -1.0f, str, null);
                return 2;
            }
            if (i18 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.n.a(context, c15780xf49d6a1c.f36743xf0cd21de, i17, true, 0, c15777x5c9b169f.f36731x3474cd60, str, null);
                return 2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.n.b(context, c15780xf49d6a1c.f36743xf0cd21de, i17, true, str);
        return 2;
    }

    public static int k(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(i17);
        }
        java.lang.Integer l17 = l(str);
        if (l17 == null) {
            l17 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(i17));
        }
        return l17.intValue();
    }

    public static java.lang.Integer l(java.lang.String str) {
        try {
            return java.lang.Integer.valueOf(android.graphics.Color.parseColor(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameChatRoom.GameChatUtils", "parseColor: " + e17.getMessage());
            return null;
        }
    }

    public static java.lang.String m(java.lang.String str, boolean z17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.startsWith("ChatRoomImgPath://")) {
            try {
                java.lang.String decode = java.net.URLDecoder.decode(new java.net.URI(str).getPath());
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(decode)) {
                    decode = decode.substring(1);
                }
                java.lang.String decode2 = java.net.URLDecoder.decode(decode);
                java.lang.String str2 = s33.n.f484065d + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(decode2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatUtils", "pre send img, path:$filePath");
                return z17 ? str2 : decode2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("GameChatRoom.GameChatUtils", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
