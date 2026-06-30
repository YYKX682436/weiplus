package com.p314xaae8f345.mm.app.p622xc5476f33;

/* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet */
/* loaded from: classes4.dex */
public class C5082xed6d00e {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f135123a;

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$AAUriSpanHandler */
    /* loaded from: classes4.dex */
    public class AAUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public AAUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{35, 36, 37};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://weixinnewaa/opendetail")) {
                return new r35.m3(str, 35, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://weixinnewaa/closeurgenotify")) {
                return new r35.m3(str, 36, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://weixinnewaa/closeaa")) {
                return new r35.m3(str, 37, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            android.net.Uri parse;
            java.lang.String queryParameter;
            java.lang.String obj;
            int i17 = m3Var.f450728d;
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (i17 == 35) {
                try {
                    parse = android.net.Uri.parse(m3Var.e());
                    queryParameter = parse.getQueryParameter("billno");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "handle click new aa open detail link error: %s, url: %s", e17.getMessage(), m3Var.e());
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "url error, billno is null");
                    return true;
                }
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 3);
                java.lang.Object obj2 = m3Var.f450729e;
                if (obj2 instanceof android.os.Bundle) {
                    obj = ((android.os.Bundle) obj2).getString("chatroom_name");
                } else {
                    if (!(obj2 instanceof java.lang.String)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "illegal data type, %s", m3Var);
                        return true;
                    }
                    obj = obj2.toString();
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("bill_no", queryParameter);
                intent.putExtra("enter_scene", P);
                intent.putExtra("chatroom", obj);
                j45.l.j(c5082xed6d00e.f135123a, "aa", ".ui.PaylistAAUI", intent, null);
                return true;
            }
            if (i17 != 37) {
                if (i17 != 36) {
                    return false;
                }
                try {
                    java.lang.String queryParameter2 = android.net.Uri.parse(m3Var.e()).getQueryParameter("billno");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "url error, billno is null");
                        return true;
                    }
                    java.lang.Object obj3 = m3Var.f450729e;
                    android.os.Bundle bundle = obj3 instanceof android.os.Bundle ? (android.os.Bundle) obj3 : null;
                    if (bundle != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bundle.getString("chatroom_name"))) {
                        db5.e1.j(c5082xed6d00e.f135123a, com.p314xaae8f345.mm.R.C30867xcad56011.jjc, -1, com.p314xaae8f345.mm.R.C30867xcad56011.jjd, com.p314xaae8f345.mm.R.C30867xcad56011.aq7, new com.p314xaae8f345.mm.app.p622xc5476f33.u(this, queryParameter2, bundle.getString("chatroom_name"), bundle.getLong("msg_id", -1L)), null);
                        return false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "empty chatroom!");
                    return true;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "handle click new aa urge notify link error: %s, url: %s", e18.getMessage(), m3Var.e());
                    return false;
                }
            }
            try {
                java.lang.String queryParameter3 = android.net.Uri.parse(m3Var.e()).getQueryParameter("billno");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "url error, billno is null");
                    return true;
                }
                java.lang.Object obj4 = m3Var.f450729e;
                if (!(obj4 instanceof android.os.Bundle)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "error data!");
                    return true;
                }
                android.os.Bundle bundle2 = (android.os.Bundle) obj4;
                java.lang.String string = bundle2.getString("chatroom_name");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "empty chatroom!");
                    return true;
                }
                long j17 = bundle2.getLong("msg_id", -1L);
                if (j17 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "msgId is null");
                    return true;
                }
                db5.e1.j(c5082xed6d00e.f135123a, com.p314xaae8f345.mm.R.C30867xcad56011.jjb, -1, com.p314xaae8f345.mm.R.C30867xcad56011.jje, com.p314xaae8f345.mm.R.C30867xcad56011.aq7, new com.p314xaae8f345.mm.app.p622xc5476f33.t(this, queryParameter3, string, j17), null);
                return false;
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "handle click new aa close link error: %s, url: %s", e19.getMessage(), m3Var.e());
                return false;
            }
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$AddressUriSpanHandler */
    /* loaded from: classes4.dex */
    public class AddressUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public AddressUriSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{44};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 44) {
                return false;
            }
            android.net.Uri parse = android.net.Uri.parse("geo:0,0?q=" + android.net.Uri.encode(m3Var.e()));
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            if (intent.resolveActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager()) != null) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$AddressUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$AddressUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 9, "");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "Cannot find map app");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 8, "");
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$AlphaInstallUriSpanHandler */
    /* loaded from: classes4.dex */
    public class AlphaInstallUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public AlphaInstallUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{32};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://alphainstall?")) {
                return new r35.m3(str, 32, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 32) {
                return false;
            }
            java.lang.String replace = m3Var.e().replace("weixin://alphainstall?", "");
            java.lang.String str = lp0.b.D() + android.net.Uri.parse(replace).getQueryParameter("md5") + ".apk";
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", replace.toString());
                j45.l.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, "webview", ".ui.tools.WebViewUI", intent, null);
                return true;
            }
            zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((yb0.c) yVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(context, str, null, false);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$AppBrandLinkSpanHandler */
    /* loaded from: classes9.dex */
    public class AppBrandLinkSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public AppBrandLinkSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{45};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
            if (m3Var.f450728d == 45) {
                if (m3Var.f450738n == 1 && (f9Var = m3Var.f450739o) != null) {
                    r01.r1.d(f9Var, r01.r1.f449749j, r01.r1.f449750k, 0);
                }
                if (zVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "AppBrandLinkSpanHandler click appbrandlink");
                    zVar.a(m3Var);
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "clickCallback is null, return");
            }
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler */
    /* loaded from: classes9.dex */
    public static abstract class BaseUriSpanHandler {
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2;
            java.lang.String m07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[9];
            lVarArr[0] = new jz5.l("stack", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            java.lang.String e17 = m3Var != null ? m3Var.e() : null;
            if (e17 == null) {
                e17 = "";
            }
            lVarArr[1] = new jz5.l("url", e17);
            java.lang.String str = m3Var != null ? m3Var.f450727c : null;
            if (str == null) {
                str = "";
            }
            lVarArr[2] = new jz5.l("originURL", str);
            lVarArr[3] = new jz5.l("msgType", (m3Var == null || (f9Var2 = m3Var.f450739o) == null) ? "" : java.lang.Integer.valueOf(f9Var2.mo78013xfb85f7b0()));
            java.lang.String Q0 = (m3Var == null || (f9Var = m3Var.f450739o) == null) ? null : f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            lVarArr[4] = new jz5.l("talker", Q0);
            lVarArr[5] = new jz5.l("hrefInfoType", m3Var != null ? java.lang.Integer.valueOf(m3Var.f450728d) : "");
            lVarArr[6] = new jz5.l("fromScene", m3Var != null ? java.lang.Integer.valueOf(m3Var.f450738n) : "");
            java.lang.String str2 = m3Var != null ? m3Var.f450730f : null;
            lVarArr[7] = new jz5.l(dm.i4.f66875xa013b0d5, str2 != null ? str2 : "");
            lVarArr[8] = new jz5.l(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, m07);
            ((cy1.a) rVar).Ej("uri_span_click", kz5.c1.k(lVarArr), 36085);
            return true;
        }

        public abstract int[] b();

        public abstract r35.m3 c(java.lang.String str);

        public abstract boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar);

        public boolean e(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (a(view, m3Var)) {
                return d(view, m3Var, zVar);
            }
            return false;
        }

        public abstract boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle);
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$BindMobileUrilSpanHandler */
    /* loaded from: classes4.dex */
    public class BindMobileUrilSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public BindMobileUrilSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{5};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/bindphone")) {
                return new r35.m3(str, 5, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 5) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(c5082xed6d00e.f135123a, new android.content.Intent(c5082xed6d00e.f135123a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class));
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/bindphone")) {
                return false;
            }
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            android.content.Intent intent = new android.content.Intent(c5082xed6d00e.f135123a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(c5082xed6d00e.f135123a, intent);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$BizMsgMenuUriSpanHandler */
    /* loaded from: classes9.dex */
    public class BizMsgMenuUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public BizMsgMenuUriSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m3Var.f450730f) && (c01.e2.G(m3Var.f450730f) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(m3Var.f450730f));
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler %s not biz user", m3Var.f450730f);
            }
            return z17;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{43};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://bizmsgmenu")) {
                return new r35.m3(str, 43, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
            if (43 != m3Var.f450728d) {
                return false;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m3Var.f450730f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler Username is null.");
                return true;
            }
            if (m3Var.f450738n == 1 && (f9Var = m3Var.f450739o) != null) {
                r01.r1.d(f9Var, r01.r1.f449749j, r01.r1.f449750k, 0);
            }
            m3Var.e();
            android.net.Uri parse = android.net.Uri.parse(m3Var.e().trim());
            java.lang.String queryParameter = parse.getQueryParameter("msgmenuid");
            if (queryParameter == null) {
                queryParameter = "";
            }
            java.lang.String trim = queryParameter.trim();
            java.lang.String queryParameter2 = parse.getQueryParameter("msgmenucontent");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = trim != null ? trim : "";
            objArr[1] = m3Var.f450730f;
            g0Var.d(14522, objArr);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler id or msgContent is null.");
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("bizmsgmenuid", trim);
            if (w11.t1.a(m3Var.f450730f)) {
                w11.r1 a17 = w11.s1.a(m3Var.f450730f);
                a17.g(m3Var.f450730f);
                a17.e(queryParameter2);
                a17.f523663e = c01.e2.C(m3Var.f450730f);
                a17.f523664f = 1;
                a17.f523666h = hashMap;
                a17.b();
            } else {
                w11.r1 a18 = w11.s1.a(m3Var.f450730f);
                a18.g(m3Var.f450730f);
                a18.e(queryParameter2);
                a18.f523663e = c01.e2.C(m3Var.f450730f);
                a18.f523664f = 1;
                a18.f523666h = hashMap;
                a18.f523667i = 5;
                a18.a().a();
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$CardUriSpanHandler */
    /* loaded from: classes4.dex */
    public class CardUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public CardUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.startsWith("wxcard://cardjumptype=1")) {
                return false;
            }
            java.lang.String obj = o2Var != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e) o2Var).f280485a.f280113d.u().d1().toString() : null;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("user_name", obj);
            intent.putExtra("view_type", 1);
            j45.l.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, "card", ".ui.CardViewUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$ChatroomNotifyDetailSpanHandler */
    /* loaded from: classes4.dex */
    public class ChatroomNotifyDetailSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public ChatroomNotifyDetailSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{67};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://chatroomnotify/detail/")) {
                return new r35.m3(str, 67, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 67) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "ChatroomNotifyDetailSpanHandler");
            android.net.Uri.parse(m3Var.e());
            java.lang.String e17 = m3Var.e();
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(e17.substring(e17.trim().lastIndexOf("/") + 1), 0L);
            if (V > 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(m3Var.f450733i, V);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.x) ((d81.e) i95.n0.c(d81.e.class))).Bi(view.getContext(), Li.Q0(), Li.J0(), false);
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$ContactUriSpanHandler */
    /* loaded from: classes9.dex */
    public class ContactUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public ContactUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{23, 21, 22, 2};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            java.lang.String substring;
            int lastIndexOf;
            boolean equals = str.trim().equals("weixin://contacts/all/");
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (equals) {
                return new r35.m3(str, 23, new c01.s7("@all.android", null, c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsa), null, true, true));
            }
            if (str.trim().equals("weixin://contacts/microblog/")) {
                return new r35.m3(str, 22, c01.t7.c(c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fti)));
            }
            if (str.trim().equals("weixin://contacts/micromessenger/")) {
                return new r35.m3(str, 2, new c01.s7("@micromsg.qq.com", null, c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ftj), null, true, true));
            }
            if (!str.trim().startsWith("weixin://contacts/") || (lastIndexOf = (substring = str.trim().substring(0, str.trim().length() - 1)).lastIndexOf("/")) == -1) {
                return null;
            }
            return new r35.m3(str, 21, c01.t7.b("@" + substring.substring(lastIndexOf + 1), c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsc)));
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            boolean z17;
            int i17 = m3Var.f450728d;
            if (i17 != 23 && i17 != 21 && i17 != 22 && i17 != 2) {
                return false;
            }
            c01.s7 s7Var = (c01.s7) m3Var.b(c01.s7.class);
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (s7Var == null) {
                android.content.Context context = c5082xed6d00e.f135123a;
                db5.e1.s(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbg), c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                return false;
            }
            if (s7Var.a().equals("@t.qq.com")) {
                if (!(((com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com") != null)) {
                    android.content.Context context2 = c5082xed6d00e.f135123a;
                    db5.e1.s(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbg), c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                }
            }
            if (s7Var.a().equals("@domain.android")) {
                com.p314xaae8f345.mm.p2621x8fb0427b.ka kaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj();
                kaVar.getClass();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                android.database.Cursor D = kaVar.f276611d.D("role_info", null, "int_reserved1=1", null, null, null, null, 2);
                while (D.moveToNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.ja jaVar = new com.p314xaae8f345.mm.p2621x8fb0427b.ja();
                    jaVar.a(D);
                    linkedList.add(jaVar);
                }
                D.close();
                if (linkedList.size() > 0) {
                    for (int i18 = 0; i18 < linkedList.size(); i18++) {
                        if (((com.p314xaae8f345.mm.p2621x8fb0427b.ja) linkedList.get(i18)).c()) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                    android.content.Context context3 = c5082xed6d00e.f135123a;
                    db5.e1.s(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbg), c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                }
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(c5082xed6d00e.f135123a, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.class);
            android.content.Intent putExtra = intent.putExtra("Contact_GroupFilter_Type", s7Var.a());
            java.lang.String str = s7Var.f118991c;
            if (str == null) {
                str = "";
            }
            android.content.Intent putExtra2 = putExtra.putExtra("Contact_GroupFilter_Str", str);
            java.lang.String str2 = s7Var.f118990b;
            putExtra2.putExtra("Contact_GroupFilter_DisplayName", str2 != null ? str2 : "");
            intent.addFlags(268435456);
            android.content.Context context4 = c5082xed6d00e.f135123a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context4, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$ContactUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context4.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context4, "com/tencent/mm/app/plugin/URISpanHandlerSet$ContactUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (zVar != null) {
                zVar.a(m3Var);
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://contacts/microblog/") && !str.equals("weixin://contacts/micromessenger/") && !str.equals("weixin://contacts/all/")) {
                return false;
            }
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            c01.s7 c17 = c01.t7.c(c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ftj));
            if (str.equals("weixin://contacts/microblog/")) {
                c17 = c01.t7.c(c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fti));
            }
            if (str.equals("weixin://contacts/micromessenger/")) {
                c17 = c01.t7.c(c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ftj));
            }
            if (str.equals("weixin://contacts/all/")) {
                c17 = c01.t7.c(c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsa));
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(c5082xed6d00e.f135123a, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.class);
            android.content.Intent putExtra = intent.putExtra("Contact_GroupFilter_Type", c17.a());
            java.lang.String str2 = c17.f118991c;
            if (str2 == null) {
                str2 = "";
            }
            android.content.Intent putExtra2 = putExtra.putExtra("Contact_GroupFilter_Str", str2);
            java.lang.String str3 = c17.f118990b;
            putExtra2.putExtra("Contact_GroupFilter_DisplayName", str3 != null ? str3 : "");
            intent.addFlags(268435456);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$CouponSpanHandler */
    /* loaded from: classes9.dex */
    public class CouponSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public CouponSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{74};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://wxpay/coupon/remindmsg")) {
                return new r35.m3(str, 74, null);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 74) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "TYPE_COUPON_JUMP_MSG go to third c2c msg");
            java.lang.Object obj = m3Var.f450729e;
            if (obj != null && (obj instanceof android.os.Bundle)) {
                java.lang.String queryParameter = android.net.Uri.parse(m3Var.e()).getQueryParameter("paymsgid");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "TYPE_COUPON_JUMP_MSG payMsgId is null");
                } else {
                    jz5.g gVar = rb3.g.f475391a;
                    up5.a0 a0Var = (up5.a0) ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) rb3.g.f475393c).mo141623x754a37bb()).m107127x946de4d9(up5.m.f511548c.eq(queryParameter));
                    if (a0Var == null || a0Var.f511422b.longValue() <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "TYPE_COUPON_JUMP_MSG can not find record for payMsgId:%s", queryParameter);
                    } else {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(a0Var.f511423c, a0Var.f511422b.longValue());
                        if (Li.m124847x74d37ac6() > 0) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372 c5979x79adf372 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372();
                            long m124847x74d37ac6 = Li.m124847x74d37ac6();
                            am.gt gtVar = c5979x79adf372.f136276g;
                            gtVar.f88322b = m124847x74d37ac6;
                            gtVar.f88321a = Li.Q0();
                            gtVar.f88323c = Li.Q0();
                            c5979x79adf372.e();
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "TYPE_COUPON_JUMP_MSG can not find msg for payMsgId:%s", queryParameter);
                        }
                    }
                }
            }
            if (zVar == null) {
                return false;
            }
            zVar.a(m3Var);
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0(m43050xba8879a4 = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.PRIORITY.LOW)
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$DeeplinkUriSpanHandler */
    /* loaded from: classes9.dex */
    public class DeeplinkUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public DeeplinkUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{30};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler getHrefFromUrl %s", str);
            if (str.trim().toLowerCase().startsWith("weixin://")) {
                return new r35.m3(str, 30, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler handleSpanClick %d, %s", java.lang.Integer.valueOf(m3Var.f450728d), m3Var.e());
            java.lang.String str = zVar != null ? (java.lang.String) zVar.b(m3Var) : null;
            if (m3Var.f450728d != 30) {
                return false;
            }
            java.lang.String e17 = m3Var.e();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (e17 == null) {
                e17 = "";
            }
            final java.lang.String str2 = e17;
            if (str2.startsWith("weixin://shieldBrandMsg/") || str2.startsWith("weixin://receiveBrandMsg/")) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler username is null");
                    return true;
                }
                qk.o b17 = r01.z.b(str);
                if (b17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler BizInfo is null");
                    return true;
                }
                if (str2.startsWith("weixin://shieldBrandMsg/")) {
                    db5.e1.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, com.p314xaae8f345.mm.R.C30867xcad56011.f574879ju1, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.R.C30867xcad56011.f574878ju0, com.p314xaae8f345.mm.R.C30867xcad56011.aq7, new com.p314xaae8f345.mm.app.p622xc5476f33.v(this, b17, str2, str), null);
                } else if (str2.startsWith("weixin://receiveBrandMsg/")) {
                    db5.e1.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, com.p314xaae8f345.mm.R.C30867xcad56011.jtz, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.R.C30867xcad56011.jty, com.p314xaae8f345.mm.R.C30867xcad56011.aq7, new com.p314xaae8f345.mm.app.p622xc5476f33.w(this, b17, str2, str), null);
                }
            } else if (o25.z.u(android.net.Uri.parse(str2))) {
                o25.z.h(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, str, str2);
            } else {
                if (nf.z.d(str2, "weixin://dl/business") ? !android.text.TextUtils.isEmpty(u46.l.u(android.net.Uri.parse(str2).getQueryParameter("appid"))) : false) {
                    o25.z.h(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, str, str2);
                } else if (str2.startsWith("weixin://receiveWeAppKFMsg")) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler username is null, handle the BUILTIN_RECEIVE_WEAPP_KFMSG ,  the herfUrl is %s", str2);
                        return true;
                    }
                    db5.e1.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, com.p314xaae8f345.mm.R.C30867xcad56011.f571810qh, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.R.C30867xcad56011.f571809qg, com.p314xaae8f345.mm.R.C30867xcad56011.aq7, new com.p314xaae8f345.mm.app.p622xc5476f33.x(this, str), null);
                } else if (str2.startsWith("weixin://xmail/bind")) {
                    android.content.Intent putExtra = new android.content.Intent().putExtra("Contact_User", "qqmail");
                    putExtra.putExtra("key_need_rebind_xmail", true);
                    j45.l.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", putExtra, null);
                } else if (!str2.startsWith("weixin://chatbot/") && !str2.startsWith("weixin://setting/sayhello") && !str2.startsWith("weixin://schedule_message/")) {
                    if (o25.z.r(str2)) {
                        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.app.plugin.URISpanHandlerSet$DeeplinkUriSpanHandler$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "LiteApp jump result: %b", java.lang.Boolean.valueOf(o25.z.m(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, str2)));
                            }
                        });
                    } else {
                        o25.z.d(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, str2, str, 1, str2, null);
                    }
                }
            }
            if (zVar != null) {
                zVar.a(m3Var);
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || bundle == null) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Boolean.valueOf(str == null);
                objArr[1] = java.lang.Boolean.valueOf(bundle == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "url is null ? %b, paramsBundle is null ? %b", objArr);
                return false;
            }
            if (!o25.z.u(android.net.Uri.parse(str))) {
                return false;
            }
            int i17 = bundle.getInt("key_scene", -1);
            if (i17 == -1) {
                i17 = 5;
            }
            int i18 = i17;
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            o25.z.g(c5082xed6d00e.f135123a, str, i18, null, new com.p314xaae8f345.mm.app.p622xc5476f33.y(this, db5.e1.Q(c5082xed6d00e.f135123a, "", "", false, true, null)), null, null, false);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$EcsGiftUriSpanHandler */
    /* loaded from: classes9.dex */
    public class EcsGiftUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public EcsGiftUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{75};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://ecsgift/")) {
                return new r35.m3(str, 75, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            java.lang.Integer h17;
            if (m3Var.f450728d == 75) {
                java.lang.String linkUrl = m3Var.e();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(linkUrl)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "EcsGiftUriSpanHandler handleSpanClick, url is empty");
                    return false;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
                if (f9Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "EcsGiftUriSpanHandler, handleSpanClick, get msg null");
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "EcsGiftUriSpanHandler, url:%s", linkUrl);
                c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
                android.content.Context context = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a;
                j00.k1 k1Var = (j00.k1) e3Var;
                k1Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkUrl, "linkUrl");
                android.net.Uri parse = android.net.Uri.parse(linkUrl);
                java.lang.String path = parse != null ? parse.getPath() : null;
                java.util.List f07 = path != null ? r26.n0.f0(path, new java.lang.String[]{"/"}, false, 0, 6, null) : kz5.p0.f395529d;
                java.lang.String str = f07.size() > 2 ? (java.lang.String) f07.get(2) : null;
                if (str == null || str.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Ecs", "[Ecs] openEcsGiftWithSystemMsg orderid is nil");
                } else {
                    java.lang.String queryParameter = parse != null ? parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) : null;
                    int intValue = (queryParameter == null || (h17 = r26.h0.h(queryParameter)) == null) ? 1 : h17.intValue();
                    n00.e y07 = n00.d.f415348a.a().y0(str);
                    long j17 = y07.f67884x9a279b8a;
                    java.lang.String str2 = y07.f67885x3e123854;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "openEcsGiftWithSystemMsg, giftMsgId:" + str + ", msgId:" + j17 + ", talker:" + str2);
                    int wi6 = g95.e0.g(f9Var) ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2) : 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "openEcsGiftWithSystemMsg with loading");
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    linkedHashMap.put("orderId", str);
                    int i17 = h20.a.f359794a;
                    linkedHashMap.put("pageOpenScene", "chatroom_sys_msg");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    linkedHashMap.put("chatroomId", str2);
                    linkedHashMap.put("groupMemberCnt", java.lang.Integer.valueOf(wi6));
                    linkedHashMap.put("cgiScene", java.lang.Integer.valueOf(intValue));
                    if (g95.e0.g(f9Var)) {
                        linkedHashMap.put("sendType", 1);
                        linkedHashMap.put("presentStyleType", 1);
                        linkedHashMap.put("isGroupChatroom", java.lang.Boolean.TRUE);
                    } else {
                        linkedHashMap.put("sendType", 0);
                        linkedHashMap.put("presentStyleType", 0);
                        linkedHashMap.put("isGroupChatroom", java.lang.Boolean.FALSE);
                    }
                    c00.e3.n9(k1Var, context, linkedHashMap, null, 4, null);
                }
            }
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$EcsNewXmlJumpUriSpanHandler */
    /* loaded from: classes4.dex */
    public class EcsNewXmlJumpUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public EcsNewXmlJumpUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{77};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://ecsnewxmljump")) {
                return new r35.m3(str, 77, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            java.lang.Integer h17;
            java.lang.Integer h18;
            if (m3Var.f450728d == 77) {
                java.lang.String linkUrl = m3Var.e();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(linkUrl)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "EcsNewXmlJumpUriSpanHandler handleSpanClick, url is empty");
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "EcsNewXmlJumpUriSpanHandler, url:%s", linkUrl);
                c00.w3 w3Var = (c00.w3) i95.n0.c(c00.w3.class);
                android.content.Context context = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a;
                ((j00.f2) w3Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkUrl, "linkUrl");
                android.net.Uri parse = android.net.Uri.parse(linkUrl);
                java.lang.String queryParameter = parse.getQueryParameter("jumpinfo");
                if (queryParameter == null || queryParameter.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsJumpInfoMsgService", "[Ecs] openEcsNewXmlJumpWithSystemMsg jumpInfo is nil");
                } else {
                    java.lang.String queryParameter2 = parse.getQueryParameter("action");
                    int intValue = (queryParameter2 == null || (h18 = r26.h0.h(queryParameter2)) == null) ? 0 : h18.intValue();
                    java.lang.String queryParameter3 = parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                    int intValue2 = (queryParameter3 == null || (h17 = r26.h0.h(queryParameter3)) == null) ? 0 : h17.intValue();
                    java.lang.String queryParameter4 = parse.getQueryParameter("reportextradata");
                    if (queryParameter4 == null) {
                        queryParameter4 = "";
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsJumpInfoMsgService", "[Ecs] action: " + intValue + ", scene: " + intValue2 + ", extra: " + queryParameter4);
                    if (view != null) {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("ecs_new_xml_jump_view", "view_clk", kz5.c1.k(new jz5.l("action", java.lang.String.valueOf(intValue)), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(intValue2)), new jz5.l("reportExtraData", queryParameter4)), 12, false);
                    }
                    int i17 = i20.c.f369403a;
                    if (intValue != 0 && intValue == 1) {
                        i95.m c17 = i95.n0.c(pq.q.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        pq.q qVar = (pq.q) c17;
                        if (context == null) {
                            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                        pq.q.se(qVar, new pq.a(context), queryParameter, null, 4, null);
                    }
                }
            }
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$EmotionStoreUriSpanHandler */
    /* loaded from: classes4.dex */
    public class EmotionStoreUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public EmotionStoreUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{29};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (!str.trim().startsWith("weixin://emoticonstore/")) {
                return null;
            }
            int lastIndexOf = str.lastIndexOf("/");
            return new r35.m3(str, 29, lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "");
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 29) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            java.lang.String substring = (m3Var.e() == null || !m3Var.e().trim().startsWith("weixin://emoticonstore/")) ? "" : m3Var.e().substring(23);
            if (substring.isEmpty()) {
                java.lang.String str = (java.lang.String) m3Var.b(java.lang.String.class);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                substring = str != null ? str : "";
            }
            qk.c0 c0Var = new qk.c0(substring);
            c0Var.f445731g = 3;
            c0Var.f445688a = 21;
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
            if (p6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "emoticon liteapp service not found");
                return false;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, c0Var);
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$EnterChatRoomUriSpanHandler */
    /* loaded from: classes4.dex */
    public class EnterChatRoomUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public EnterChatRoomUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{55};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://jump/chatroom/")) {
                return new r35.m3(str, 55, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (m3Var.f450728d == 55) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleClickEnterChatRoomSystemMsgUrl");
                try {
                    java.lang.String e17 = m3Var.e();
                    int lastIndexOf = e17.trim().lastIndexOf("/");
                    if (lastIndexOf >= 0 && lastIndexOf < e17.trim().length() - 1) {
                        java.lang.String substring = e17.trim().substring(lastIndexOf + 1);
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(substring) && ((n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(substring, true)) == null || ((int) n17.E2) == 0)) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                            z3Var.X1(substring);
                            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).h0(z3Var);
                        }
                        android.content.Intent putExtra = new android.content.Intent(c5082xed6d00e.f135123a, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class).putExtra("Chat_User", substring).putExtra("Chat_Mode", 1);
                        if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                            putExtra.addFlags(268435456);
                        }
                        android.content.Context context = c5082xed6d00e.f135123a;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(putExtra);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterChatRoomUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterChatRoomUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        if (m3Var.f450734j == 1) {
                            java.lang.String str = m3Var.f450733i;
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            if (str == null) {
                                str = "";
                            }
                            jn.j.d(substring == null ? "" : substring, str, 3);
                            java.lang.Object[] objArr = new java.lang.Object[2];
                            objArr[0] = str;
                            if (substring == null) {
                                substring = "";
                            }
                            objArr[1] = substring;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleClickEnterChatRoomSystemMsgUrl migrate(%s -> %s)", objArr);
                        }
                        return true;
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "handle click link error: %s, url: %s", e18.getMessage(), m3Var.e());
                }
            }
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$EnterRoomUriSpanHandler */
    /* loaded from: classes4.dex */
    public class EnterRoomUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public EnterRoomUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            int lastIndexOf;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
            if (!str.startsWith("weixin://jump/mainframe/") || (lastIndexOf = str.trim().lastIndexOf("/")) < 0 || lastIndexOf >= str.trim().length() - 1) {
                return false;
            }
            java.lang.String substring = str.trim().substring(lastIndexOf + 1);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(substring) && ((n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(substring, true)) == null || ((int) n17.E2) == 0)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.X1(substring);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).h0(z3Var);
            }
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            android.content.Intent putExtra = new android.content.Intent(c5082xed6d00e.f135123a, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class).putExtra("Chat_User", substring).putExtra("Chat_Mode", 1).putExtra("enter_room_from_uri_jump", true);
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                putExtra.addFlags(268435456);
            }
            android.content.Context context = c5082xed6d00e.f135123a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(putExtra);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterRoomUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterRoomUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$ExposeUriSpanHandler */
    /* loaded from: classes4.dex */
    public class ExposeUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public ExposeUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{31};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().equals("weixin://expose/")) {
                return new r35.m3(str, 31, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 31) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            if (zVar == null) {
                return false;
            }
            java.lang.String str = (java.lang.String) zVar.b(m3Var);
            intent.putExtra("k_username", str);
            int i17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.endsWith("@chatroom")) ? 39 : 36;
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.ui.n2.f290931a, java.lang.Integer.valueOf(i17)));
            j45.l.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, "webview", ".ui.tools.WebViewUI", intent, null);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FeedbackUriSpanHandler */
    /* loaded from: classes4.dex */
    public class FeedbackUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public FeedbackUriSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{34};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://feedback/next/")) {
                return new r35.m3(str, 34, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 34) {
                return false;
            }
            java.lang.String replace = m3Var.e().trim().replace("weixin://feedback/next/", "");
            m3Var.e();
            c01.d9.e().g(new k14.f0(wo.w0.l(), replace, 8));
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FlightNumberSpanHandler */
    /* loaded from: classes8.dex */
    public class FlightNumberSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public FlightNumberSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{50};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (zVar != null) {
                zVar.b(m3Var);
            }
            if (m3Var.f450728d == 50) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "FlightNumberSpanHandler click %s", m3Var.e());
                java.lang.Object obj = m3Var.f450729e;
                long j17 = (obj == null || !(obj instanceof android.os.Bundle)) ? 0L : ((android.os.Bundle) obj).getLong("msgSvrId");
                sq1.g gVar = (sq1.g) i95.n0.c(sq1.g.class);
                android.content.Context context = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a;
                java.lang.String e17 = m3Var.e();
                ((rq1.b) gVar).getClass();
                java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(2).c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxUILogic", "startBoxHomeUI type=%d query=%s messageSvrID=%d", 3, e17, java.lang.Long.valueOf(j17));
                r45.sn snVar = new r45.sn();
                snVar.f467384e = java.util.UUID.randomUUID().toString();
                snVar.f467383d = e17;
                snVar.f467386g = 3;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("query", e17);
                hashMap.put("type", java.lang.String.valueOf(3));
                hashMap.put("messageSvrID", java.lang.String.valueOf(j17));
                hashMap.put("lang", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                hashMap.put("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
                hashMap.put("version", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(2)));
                hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b());
                hashMap.put("isClientLoading", "1");
                hashMap.put("wechatVersion", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
                stringBuffer.append(c17);
                stringBuffer.append("?");
                stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.k(hashMap));
                snVar.f467385f = stringBuffer.toString();
                wq1.c cVar = new wq1.c(context, snVar);
                cVar.show();
                cVar.getWindow().setLayout(-1, -1);
            }
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FlowStatUriSpanHandler */
    /* loaded from: classes8.dex */
    public class FlowStatUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public FlowStatUriSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{16};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://flowstat")) {
                return new r35.m3(str, 16, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 16) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b != null) {
                m78443x9cf0d20b.f7().o("tab_settings");
            }
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://flowstat")) {
                return false;
            }
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b == null) {
                return true;
            }
            m78443x9cf0d20b.f7().o("tab_settings");
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FriendMobileUriSpanHandler */
    /* loaded from: classes4.dex */
    public class FriendMobileUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public FriendMobileUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{20};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://findfriend/mobile")) {
                return new r35.m3(str, 20, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 20) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            android.content.Intent intent = new android.content.Intent(c5082xed6d00e.f135123a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494.class);
            android.content.Context context = c5082xed6d00e.f135123a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$FriendMobileUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$FriendMobileUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://findfriend/mobile")) {
                return false;
            }
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            android.content.Intent intent = new android.content.Intent(c5082xed6d00e.f135123a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494.class);
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            android.content.Context context = c5082xed6d00e.f135123a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$FriendMobileUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$FriendMobileUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FriendSearchUriSpanHandler */
    /* loaded from: classes4.dex */
    public class FriendSearchUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public FriendSearchUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{17};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://findfriend/search")) {
                return new r35.m3(str, 17, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 17) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            j45.l.h(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, "subapp", ".ui.pluginapp.ContactSearchUI");
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://findfriend/search")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(c5082xed6d00e.f135123a, "subapp", ".ui.pluginapp.ContactSearchUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FriendShareUriSpanHandler */
    /* loaded from: classes4.dex */
    public class FriendShareUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public FriendShareUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{18};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://findfriend/share")) {
                return new r35.m3(str, 18, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 18) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            j45.l.h(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, "setting", ".ui.qrcode.ShareMicroMsgChoiceUI");
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://findfriend/share")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(c5082xed6d00e.f135123a, "setting", ".ui.qrcode.ShareMicroMsgChoiceUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$HoneyPayLinkSpanHandler */
    /* loaded from: classes9.dex */
    public class HoneyPayLinkSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public HoneyPayLinkSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{46, 47};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("native://wcpay/honeypay")) {
                return new r35.m3(str, 46, null);
            }
            if (str.trim().startsWith("weixin://wcpay/bankCardList")) {
                return new r35.m3(str, 47, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            int i17 = m3Var.f450728d;
            if (i17 == 46) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "go to honey pay proxy");
                java.lang.Object obj = m3Var.f450729e;
                if (obj != null && (obj instanceof android.os.Bundle)) {
                    android.net.Uri parse = android.net.Uri.parse(m3Var.e());
                    java.lang.String queryParameter = parse.getQueryParameter("cardNo");
                    boolean equals = parse.getQueryParameter("isPayer").equals("1");
                    java.lang.String queryParameter2 = parse.getQueryParameter("paymsgid");
                    java.lang.String queryParameter3 = parse.getQueryParameter("routeInfo");
                    boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter3);
                    com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
                    if (!K0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "has routeInfo in sysmsg url, try handle");
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p4.g(queryParameter3, "", "", c5082xed6d00e.f135123a);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter2)) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_card_no", queryParameter);
                        intent.putExtra("key_is_payer", equals);
                        j45.l.j(c5082xed6d00e.f135123a, "honey_pay", ".ui.HoneyPayProxyUI", intent, null);
                    } else {
                        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                        u73.b bVar = new u73.b();
                        bVar.f67674x6e706659 = queryParameter2;
                        ((u73.c) ((q73.f) i95.n0.c(q73.f.class)).f441914d.a()).get(bVar, new java.lang.String[0]);
                        long j17 = bVar.f67673x297eb4f7;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleSpanClick: %s,find msg: %s", m3Var.e(), java.lang.Long.valueOf(j17));
                        if (j17 > 0) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(f9Var != null ? f9Var.Q0() : "", j17);
                            if (Li.m124847x74d37ac6() <= 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "cannot find msg in msg storage!");
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0_));
                                u1Var.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
                                u1Var.l(new com.p314xaae8f345.mm.app.p622xc5476f33.z(this));
                                u1Var.q(false);
                            } else {
                                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372 c5979x79adf372 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372();
                                am.gt gtVar = c5979x79adf372.f136276g;
                                gtVar.f88322b = j17;
                                gtVar.f88321a = Li.Q0();
                                gtVar.f88323c = Li.Q0();
                                c5979x79adf372.e();
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_HONEY_PAY_CARD_MANAGER, cannot find local msg");
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                            u1Var2.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0_));
                            u1Var2.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                            u1Var2.m(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
                            u1Var2.l(new com.p314xaae8f345.mm.app.p622xc5476f33.a0(this));
                            u1Var2.q(false);
                        }
                    }
                }
            } else if (i17 == 47) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "go to bank card list");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "isKindaBankCardManagerEnable");
                ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("bankCard", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.mm.app.p622xc5476f33.b0(this));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15191, 0, 0, 0, 0, 0, 1);
            }
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$HttpUriSpanHandler */
    /* loaded from: classes9.dex */
    public class HttpUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f135143a = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/newsubscribemsg?action=subscribepage";

        public HttpUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{1};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("http")) {
                return new r35.m3(str, 1, null);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean d(android.view.View r23, r35.m3 r24, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z r25) {
            /*
                Method dump skipped, instructions count: 856
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.HttpUriSpanHandler.d(android.view.View, r35.m3, com.tencent.mm.pluginsdk.ui.span.z):boolean");
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$JumpActivityUriSpanHandler */
    /* loaded from: classes4.dex */
    public class JumpActivityUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public JumpActivityUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.toLowerCase().startsWith("weixin://jump/")) {
                return false;
            }
            java.lang.String[] split = str.split("/");
            java.lang.String str2 = split[split.length - 1];
            boolean equalsIgnoreCase = "mainframe".equalsIgnoreCase(str2);
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (equalsIgnoreCase) {
                android.content.Intent intent = new android.content.Intent(c5082xed6d00e.f135123a, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
                if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                    intent.addFlags(268435456);
                }
                intent.addFlags(67108864);
                android.content.Context context = c5082xed6d00e.f135123a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpActivityUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpActivityUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if ("shake".equalsIgnoreCase(str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10221, "1");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.addFlags(67108864);
                if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                    intent2.addFlags(268435456);
                }
                ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(c5082xed6d00e.f135123a, intent2, true);
                android.content.Context context2 = c5082xed6d00e.f135123a;
                if (context2 != null && (context2 instanceof android.app.Activity)) {
                    ((android.app.Activity) context2).finish();
                }
            } else if ("scanqrcode".equalsIgnoreCase(str2)) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("key_scan_report_enter_scene", 24);
                intent3.putExtra("BaseScanUI_select_scan_mode", 1);
                intent3.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
                intent3.setFlags(65536);
                intent3.addFlags(67108864);
                if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                    intent3.addFlags(268435456);
                }
                j45.l.j(c5082xed6d00e.f135123a, "scanner", ".ui.BaseScanUI", intent3, null);
            }
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$JumpPatSettingDialogUriSpanHandler */
    /* loaded from: classes4.dex */
    public class JumpPatSettingDialogUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public JumpPatSettingDialogUriSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{61};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://jump/setpat_bottom_sheet/")) {
                return new r35.m3(str, 61, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 61) {
                return false;
            }
            ((r45.n55) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(view.getContext(), 4, r45.n55.class)).f462624d = 1;
            pp3.u uVar = new pp3.u(view.getContext());
            uVar.show();
            uVar.getWindow().setLayout(-1, -1);
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$JumpPatSettingUriSpanHandler */
    /* loaded from: classes4.dex */
    public class JumpPatSettingUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public JumpPatSettingUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{57};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://jump/setpat/")) {
                return new r35.m3(str, 57, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d == 57) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleClickJumpToPatSetting");
                android.content.Intent intent = new android.content.Intent();
                boolean wi6 = ((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi();
                com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
                if (wi6) {
                    intent.setClass(c5082xed6d00e.f135123a, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17442xea4ad84b.class);
                } else {
                    intent.setClass(c5082xed6d00e.f135123a, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17453xf4ad1945.class);
                }
                intent.putExtra("jumptoPat", true);
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39695x233c02ec.getClass();
                intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39705x8cb7317, 0);
                android.content.Context context = c5082xed6d00e.f135123a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpPatSettingUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpPatSettingUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.app.p622xc5476f33.c0(this), 2000L);
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$LqtDetailSpanHandler */
    /* loaded from: classes4.dex */
    public class LqtDetailSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public LqtDetailSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{69};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://wcpay/lqt/lqtTransferInKnowDetail")) {
                return new r35.m3(str, 69, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d == 69) {
                java.lang.String queryParameter = android.net.Uri.parse(m3Var.e()).getQueryParameter("url");
                if (queryParameter.length() > 0) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", queryParameter);
                    intent.putExtra("showShare", true);
                    intent.putExtra("allow_mix_content_mode", false);
                    j45.l.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, "webview", ".ui.tools.WebViewUI", intent, null);
                    return true;
                }
            }
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0(m43050xba8879a4 = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.PRIORITY.HIGH)
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$LuckyMoneyUriSpanHandler */
    /* loaded from: classes4.dex */
    public class LuckyMoneyUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public LuckyMoneyUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{33, 59};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://weixinhongbao/") || str.trim().toLowerCase().startsWith("frhb://c2cbizmessagehandler/hongbao/receivehongbao")) {
                return new r35.m3(str, 33, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://weixinunionhongbao/")) {
                return new r35.m3(str, 59, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            int i17 = m3Var.f450728d;
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (i17 != 33) {
                if (i17 != 59) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "hrefInfo.getType() == MMSpanConstants.Type.TYPE_LUCKY_MONEY_UNION");
                if (zVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null");
                    return false;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_native_url", m3Var.e());
                intent.putExtra("key_username", (java.lang.String) zVar.b(m3Var));
                intent.putExtra("key_lucky_money_can_received", true);
                intent.putExtra("key_jump_from", 4);
                intent.putExtra("scene_id", 1005);
                j45.l.j(c5082xed6d00e.f135123a, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.d(12097, 11, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                g0Var.d(11850, 4, 1);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "hrefInfo.getType() == MMSpanConstants.Type.TYPE_LUCKY_MONEY_NORMAL");
            if (zVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null");
                return false;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_native_url", m3Var.e());
            intent2.putExtra("key_username", (java.lang.String) zVar.b(m3Var));
            intent2.putExtra("key_lucky_money_can_received", true);
            intent2.putExtra("key_jump_from", 4);
            intent2.putExtra("scene_id", 1002);
            if (m3Var.e().startsWith("frhb://c2cbizmessagehandler/hongbao/receivehongbao")) {
                intent2.putExtra("key_hk_scene", 1);
                j45.l.j(c5082xed6d00e.f135123a, "luckymoney", ".hk.ui.LuckyMoneyHKBeforeDetailUI", intent2, null);
            } else {
                j45.l.j(c5082xed6d00e.f135123a, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent2, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.d(12097, 11, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var2.d(11850, 4, 1);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$OfflineFQFSpanHandler */
    /* loaded from: classes4.dex */
    public class OfflineFQFSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public OfflineFQFSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{51};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://wcpay/fqf/opentinyapp")) {
                return new r35.m3(str, 51, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d == 51) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "go to offline fqf");
                java.lang.Object obj = m3Var.f450729e;
                if (obj != null && (obj instanceof android.os.Bundle)) {
                    android.os.Bundle bundle = (android.os.Bundle) obj;
                    java.lang.String string = bundle.getString("repayment_tiny_app_username");
                    java.lang.String string2 = bundle.getString("repayment_tiny_app_path");
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
                    am.nx nxVar = c6113xa3727625.f136390g;
                    nxVar.f88999a = string;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (string2 == null) {
                        string2 = "";
                    }
                    nxVar.f89000b = string2;
                    nxVar.f89001c = 0;
                    c6113xa3727625.e();
                }
                if (zVar != null) {
                    zVar.a(m3Var);
                }
            }
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$OpenFinderLiveLotteryDetailSpanHandler */
    /* loaded from: classes9.dex */
    public class OpenFinderLiveLotteryDetailSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public OpenFinderLiveLotteryDetailSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
            if (f9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "MsgInfo is null");
                return false;
            }
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(f9Var.Q0())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "MsgInfo.talker:" + f9Var.Q0() + " is not finder session");
                return false;
            }
            if (f9Var.G.contains("<live>")) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "MsgInfo.source:" + f9Var.G + " is not live");
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{68};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://finderlive/lotteryDetail")) {
                return new r35.m3(str, 68, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            java.lang.Object obj;
            if (m3Var.f450728d == 68 && (obj = m3Var.f450729e) != null && (obj instanceof android.os.Bundle)) {
                android.os.Bundle bundle = (android.os.Bundle) obj;
                int i17 = bundle.getInt("KEY_FINDER_LIVE_JUMP_TYPE");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "[OpenFinderLiveLotteryDetailSpanHandler], type:" + i17);
                if (i17 != 2) {
                    r45.uq4 uq4Var = new r45.uq4();
                    try {
                        uq4Var.mo11468x92b714fd(bundle.getByteArray("KEY_FINDER_LIVE_JUMP_DATA"));
                        java.lang.String str = uq4Var.f469105d;
                        java.lang.String str2 = uq4Var.f469107f;
                        java.lang.String str3 = uq4Var.f469106e;
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("FROM_SCENE", 1);
                        intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", pm0.v.Z(str2));
                        intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", pm0.v.Z(str3));
                        intent.putExtra("KEY_LOTTERY_HISTORY_SOURCE", 1);
                        intent.putExtra("KEY_LOTTERY_ID", str);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.h(m3Var.f450739o.y0());
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                            intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", h17);
                        }
                        if (uq4Var.f469108g) {
                            try {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                                cl0.g gVar = new cl0.g();
                                gVar.o("user_type", 2);
                                g0Var.d(20849, 6, 2, str, "", gVar.toString().replace(",", ";"));
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "[setContent] e.msg:" + e17.getMessage());
                            }
                            intent.putExtra("FINDER_NICKNAME", uq4Var.f469109h);
                            intent.putExtra("KEY_SCENE", 2);
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            android.app.Activity context = (android.app.Activity) view.getContext();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Nj(context, intent);
                        } else {
                            try {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                                cl0.g gVar2 = new cl0.g();
                                gVar2.o("user_type", 1);
                                g0Var2.d(20849, 6, 2, str, "", gVar2.toString().replace(",", ";"));
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "[setContent] e.msg:" + e18.getMessage());
                            }
                            intent.putExtra("KEY_SCENE", 1);
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            android.app.Activity context2 = (android.app.Activity) view.getContext();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Pj(context2, intent);
                        }
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "[OpenFinderLiveLotteryDetailSpanHandler],e:" + e19.getMessage());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "[OpenFinderLiveLotteryDetailSpanHandler],e:" + e19.getMessage());
                } else {
                    r45.tq4 tq4Var = new r45.tq4();
                    try {
                        tq4Var.mo11468x92b714fd(bundle.getByteArray("KEY_FINDER_LIVE_JUMP_DATA"));
                        java.lang.String giftId = tq4Var.f468237e;
                        long j17 = tq4Var.f468236d;
                        m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
                        android.content.Context context3 = view.getContext();
                        ((b92.y0) i0Var).getClass();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
                        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new b92.x0(context3, j17, giftId, null), 3, null);
                    } catch (java.lang.Exception e27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "[OpenFinderLiveLotteryGiftDetailSpanHandler],e:" + e27.getMessage());
                    }
                }
            }
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$OpenIMKefuMsgMenuUriSpanHandler */
    /* loaded from: classes9.dex */
    public class OpenIMKefuMsgMenuUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public OpenIMKefuMsgMenuUriSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(m3Var.f450730f);
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{62};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://kefumenu")) {
                return new r35.m3(str, 62, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (62 != m3Var.f450728d) {
                return false;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m3Var.f450730f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler Username is null.");
                return true;
            }
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(m3Var.f450730f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "OpenIMKefuMsgMenuUriSpanHandler Username not openim kefu: %s", m3Var.f450730f);
                return true;
            }
            m3Var.e();
            android.net.Uri parse = android.net.Uri.parse(m3Var.e().trim());
            java.lang.String queryParameter = parse.getQueryParameter("kefumenuid");
            if (queryParameter == null) {
                queryParameter = "";
            }
            java.lang.String trim = queryParameter.trim();
            java.lang.String queryParameter2 = parse.getQueryParameter("kefumenucontent");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "OpenIMKefuMsgMenuUriSpanHandler id or msgContent is null.");
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("kefumenuid", trim);
            if (w11.t1.a(m3Var.f450730f)) {
                w11.r1 a17 = w11.s1.a(m3Var.f450730f);
                a17.g(m3Var.f450730f);
                a17.e(queryParameter2);
                a17.h(c01.e2.C(m3Var.f450730f));
                a17.f523664f = 1;
                a17.f523666h = hashMap;
                a17.b();
            } else {
                w11.r1 a18 = w11.s1.a(m3Var.f450730f);
                a18.g(m3Var.f450730f);
                a18.e(queryParameter2);
                a18.h(c01.e2.C(m3Var.f450730f));
                a18.f523664f = 1;
                a18.f523666h = hashMap;
                a18.f523667i = 5;
                a18.a().a();
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$OpenIMKefuRequestLocationAcceptSpanHandler */
    /* loaded from: classes4.dex */
    public class OpenIMKefuRequestLocationAcceptSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public OpenIMKefuRequestLocationAcceptSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{66};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://wwkf/systemmsg/location_request/")) {
                return new r35.m3(str, 66, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            java.lang.Object obj;
            if (m3Var.f450728d != 66 || (obj = m3Var.f450729e) == null || !(obj instanceof android.os.Bundle)) {
                return false;
            }
            w41.u.f524421a.b(view.getContext(), ((android.os.Bundle) obj).getString("chatroom_name"));
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$PRIORITY */
    /* loaded from: classes6.dex */
    public enum PRIORITY {
        LOW,
        NORMAL,
        HIGH
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$PayTransferUriSpanHandler */
    /* loaded from: classes9.dex */
    public class PayTransferUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public PayTransferUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [nr4.a] */
        /* JADX WARN: Type inference failed for: r8v5, types: [nr4.a] */
        /* JADX WARN: Type inference failed for: r8v6 */
        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            ?? r86;
            if (str.startsWith("wxpay://")) {
                if (o2Var != null) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e eVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e) o2Var;
                    java.lang.String obj = eVar.f280485a.f280113d.u().d1().toString();
                    ?? r87 = eVar.f280485a.f280528e;
                    r86 = r87 instanceof nr4.a ? r87 : null;
                    r7 = obj;
                } else {
                    r86 = 0;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "SERVICE_JUMP_TO_PAY fail, null username");
                    return false;
                }
                java.lang.String substring = str.substring(8);
                if (substring.indexOf("&") > 0) {
                    substring = substring.split("&")[0];
                }
                int indexOf = substring.indexOf("=");
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(indexOf >= 0 ? substring.substring(indexOf + 1) : "", 0);
                com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
                if (P == 1) {
                    if (c01.z1.z() || c01.z1.A()) {
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r7)) {
                            og0.o oVar = (og0.o) i95.n0.c(og0.o.class);
                            android.content.Context context = c5082xed6d00e.f135123a;
                            ((ng0.q) oVar).getClass();
                            h45.a0.i(context, 5, r7, 14, r86);
                        } else {
                            og0.o oVar2 = (og0.o) i95.n0.c(og0.o.class);
                            android.content.Context context2 = c5082xed6d00e.f135123a;
                            ((ng0.q) oVar2).getClass();
                            h45.a0.i(context2, 5, r7, 11, r86);
                        }
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r7)) {
                        og0.o oVar3 = (og0.o) i95.n0.c(og0.o.class);
                        android.content.Context context3 = c5082xed6d00e.f135123a;
                        ((ng0.q) oVar3).getClass();
                        h45.a0.i(context3, 2, r7, 14, r86);
                    } else {
                        og0.o oVar4 = (og0.o) i95.n0.c(og0.o.class);
                        android.content.Context context4 = c5082xed6d00e.f135123a;
                        ((ng0.q) oVar4).getClass();
                        h45.a0.i(context4, 2, r7, 11, r86);
                    }
                    return true;
                }
                android.content.Context context5 = c5082xed6d00e.f135123a;
                dp.a.m125854x26a183b(context5, context5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iis), 0).show();
            }
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$PayUriSpanHandler */
    /* loaded from: classes9.dex */
    public class PayUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public PayUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{28};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 28) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec();
            am.df dfVar = c5587xf7a06bec.f135909g;
            dfVar.f87979a = 11;
            dfVar.f87980b = m3Var.e();
            dfVar.f87981c = new java.lang.ref.WeakReference(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a);
            dfVar.f87982d = new android.os.Bundle();
            dfVar.f87982d.putInt("pay_channel", 6);
            c5587xf7a06bec.b(android.os.Looper.myLooper());
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$PhoneEmailUriSpanHandler */
    /* loaded from: classes9.dex */
    public class PhoneEmailUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public PhoneEmailUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{25, 24};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            java.lang.String str;
            if (zVar != null) {
                zVar.b(m3Var);
            }
            int i17 = m3Var.f450728d;
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (i17 != 25) {
                if (i17 == 24) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.c(c5082xed6d00e.f135123a, m3Var.e(), null);
                }
                if (zVar == null) {
                    return false;
                }
                zVar.a(m3Var);
                return false;
            }
            java.lang.String str2 = m3Var.f450730f;
            android.os.Bundle bundle = new android.os.Bundle();
            if (str2 != null && !str2.equals(c01.z1.r())) {
                bundle.putString("Contact_User", str2);
                r61.a h17 = m61.k.wi().h(str2);
                if (h17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.e())) {
                    str = null;
                } else {
                    java.lang.String f17 = h17.f();
                    if (f17 == null) {
                        f17 = "";
                    }
                    str = f17.replace(" ", "");
                }
                bundle.putString("Contact_Mobile_MD5", str);
            }
            bundle.putInt("fromScene", 1);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.d(c5082xed6d00e.f135123a, m3Var.e(), null, bundle);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$PluginUriSpanHandler */
    /* loaded from: classes4.dex */
    public class PluginUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public PluginUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{26};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://plugin")) {
                return new r35.m3(str, 26, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://plugin")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(c5082xed6d00e.f135123a, "setting", ".ui.setting.SettingsPluginsUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$ProfileUriSpanHandler */
    /* loaded from: classes4.dex */
    public class ProfileUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public ProfileUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{3};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://contacts/profile/")) {
                return new r35.m3(str, 3, str.trim().replace("weixin://contacts/profile/", "").replace("/", ""));
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 3) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            java.lang.String str = (java.lang.String) m3Var.b(java.lang.String.class);
            if (android.text.TextUtils.isEmpty(str)) {
                java.lang.String e17 = m3Var.e();
                try {
                    if (e17.trim().startsWith("weixin://contacts/profile/")) {
                        str = e17.trim().replace("weixin://contacts/profile/", "").replace("/", "");
                    }
                } catch (java.lang.Throwable unused) {
                }
                str = null;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.putExtra("Contact_User", str);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
            if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.g1.c(intent, str);
            }
            if ((str != null ? str : "").length() > 0) {
                j45.l.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            }
            if (zVar != null) {
                zVar.a(m3Var);
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.startsWith("weixin://contacts/profile/")) {
                return false;
            }
            java.lang.String replace = str.trim().replace("weixin://contacts/profile/", "").replace("/", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(replace)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "jumpToActivity fail, user is null");
                return true;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.putExtra("Contact_User", replace);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(replace, true);
            if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.g1.c(intent, replace);
            }
            j45.l.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$ScanQrCodeUriSpanHandler */
    /* loaded from: classes4.dex */
    public class ScanQrCodeUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public ScanQrCodeUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            boolean z18 = false;
            if (!str.equals("weixin://scanqrcode/")) {
                return false;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "jumpToActivity, scan qrcode permission fail");
                return true;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 1);
            if (bundle != null && bundle.getInt("fromScene") == 100) {
                z18 = true;
            }
            if (!z18) {
                intent.addFlags(67108864);
            }
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            intent.putExtra("key_scan_report_enter_scene", 24);
            j45.l.j(c5082xed6d00e.f135123a, "scanner", ".ui.BaseScanUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SetSafeDeviceUriSpanHandler */
    /* loaded from: classes4.dex */
    public class SetSafeDeviceUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public SetSafeDeviceUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/account/safedevice")) {
                return false;
            }
            java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(6, "");
            java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(4097, "");
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (!K0) {
                android.content.Intent intent = new android.content.Intent();
                if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                    intent.addFlags(268435456);
                }
                j45.l.h(c5082xed6d00e.f135123a, "account", ".security.ui.MySafeDeviceListUI");
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                android.content.Intent intent2 = new android.content.Intent();
                if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                    intent2.addFlags(268435456);
                }
                j45.l.B(c5082xed6d00e.f135123a, "account", ".security.ui.BindSafeDeviceUI", intent2);
            } else {
                android.content.Intent intent3 = new android.content.Intent(c5082xed6d00e.f135123a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
                intent3.putExtra("bind_scene", 1);
                if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                    intent3.addFlags(268435456);
                }
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(c5082xed6d00e.f135123a, intent3);
            }
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingBindEmailUriSpanHandler */
    /* loaded from: classes8.dex */
    public class SettingBindEmailUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public SettingBindEmailUriSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{7};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/bindemail")) {
                return new r35.m3(str, 7, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 7) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b != null) {
                m78443x9cf0d20b.f7().o("tab_settings");
            }
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingBlacklistUriSpanHandler */
    /* loaded from: classes9.dex */
    public class SettingBlacklistUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public SettingBlacklistUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{14};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/blacklist")) {
                return new r35.m3(str, 14, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 14) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            c01.s7 a17 = c01.t7.a(c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsb));
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(c5082xed6d00e.f135123a, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.class);
            intent.putExtra("Contact_GroupFilter_Type", a17.a());
            java.lang.String str = a17.f118990b;
            if (str == null) {
                str = "";
            }
            intent.putExtra("Contact_GroupFilter_DisplayName", str);
            intent.addFlags(67108864);
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b != null) {
                m78443x9cf0d20b.f7().o("tab_settings");
            }
            android.content.Context context = c5082xed6d00e.f135123a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$SettingBlacklistUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$SettingBlacklistUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/blacklist")) {
                return false;
            }
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            c01.s7 a17 = c01.t7.a(c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsb));
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(c5082xed6d00e.f135123a, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.class);
            intent.putExtra("Contact_GroupFilter_Type", a17.a());
            java.lang.String str2 = a17.f118990b;
            if (str2 == null) {
                str2 = "";
            }
            intent.putExtra("Contact_GroupFilter_DisplayName", str2);
            intent.addFlags(67108864);
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b != null) {
                m78443x9cf0d20b.f7().o("tab_settings");
            }
            android.content.Context context = c5082xed6d00e.f135123a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$SettingBlacklistUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$SettingBlacklistUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingHeadImgUriSpanHandler */
    /* loaded from: classes8.dex */
    public class SettingHeadImgUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public SettingHeadImgUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{6};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/setheadimage")) {
                return new r35.m3(str, 6, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 6) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b != null) {
                m78443x9cf0d20b.f7().o("tab_settings");
            }
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/setheadimage")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", c01.z1.r());
            intent.putExtra("Contact_Nick", c01.z1.l());
            intent.putExtra("User_Avatar", true);
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(c5082xed6d00e.f135123a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingNotifyUriSpanHandler */
    /* loaded from: classes8.dex */
    public class SettingNotifyUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public SettingNotifyUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{9};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/notify")) {
                return new r35.m3(str, 9, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 9) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b != null) {
                m78443x9cf0d20b.f7().o("tab_settings");
            }
            j45.l.h(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, "setting", ".ui.setting.SettingsNotificationUI");
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/notify")) {
                return false;
            }
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b != null) {
                m78443x9cf0d20b.f7().o("tab_settings");
            }
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(c5082xed6d00e.f135123a, "setting", ".ui.setting.SettingsNotificationUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingPluginLomoUriSpanHandler */
    /* loaded from: classes4.dex */
    public class SettingPluginLomoUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public SettingPluginLomoUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{12};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/plugin/lomo")) {
                return new r35.m3(str, 12, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 12) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", "weibo");
            j45.l.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/plugin/lomo")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", "weibo");
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(c5082xed6d00e.f135123a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingPluginQQMailUriSpanHandler */
    /* loaded from: classes4.dex */
    public class SettingPluginQQMailUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public SettingPluginQQMailUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{10};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/plugin/qqmail")) {
                return new r35.m3(str, 10, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 10) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", "qqmail");
            j45.l.j(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/plugin/qqmail")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", "qqmail");
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(c5082xed6d00e.f135123a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingPluginQQMsgUriSpanHandler */
    /* loaded from: classes4.dex */
    public class SettingPluginQQMsgUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public SettingPluginQQMsgUriSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{13};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/plugin/qqmsg")) {
                return new r35.m3(str, 13, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingPluginSxMsgUriSpanHandler */
    /* loaded from: classes4.dex */
    public class SettingPluginSxMsgUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public SettingPluginSxMsgUriSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{11};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/plugin/sxmsg")) {
                return new r35.m3(str, 11, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingPrivacyUriSpanHandler */
    /* loaded from: classes8.dex */
    public class SettingPrivacyUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public SettingPrivacyUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{15};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/privacy")) {
                return new r35.m3(str, 15, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 15) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b != null) {
                m78443x9cf0d20b.f7().o("tab_settings");
            }
            j45.l.h(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, "setting", ".ui.setting.SettingsPrivacyUI");
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/privacy")) {
                return false;
            }
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b != null) {
                m78443x9cf0d20b.f7().o("tab_settings");
            }
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(c5082xed6d00e.f135123a, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
            return true;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$StoryEntranceHandler */
    /* loaded from: classes4.dex */
    public class StoryEntranceHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public StoryEntranceHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{48};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 48 || android.text.TextUtils.isEmpty(m3Var.f450730f)) {
                return false;
            }
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TeenModeAgreeAuthorizationSpanHandler */
    /* loaded from: classes4.dex */
    public class TeenModeAgreeAuthorizationSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public TeenModeAgreeAuthorizationSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{64};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://teenagerModeAgreenAuthorization/")) {
                return new r35.m3(str, 64, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 64) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "TeenModeAgreeAuthorizationSpanHandler");
            android.net.Uri.parse(m3Var.e());
            java.lang.String e17 = m3Var.e();
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(e17.substring(e17.trim().lastIndexOf("/") + 1), 0L);
            if (V > 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(m3Var.f450730f, V);
                if (o27.I0() > 0) {
                    int A0 = o27.A0();
                    com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
                    if (A0 == 1) {
                        ((uh4.c0) i95.n0.c(uh4.c0.class)).rh(c5082xed6d00e.f135123a, m3Var.f450730f, c01.z1.r(), o27.mo78012x3fdd41df(), o27.I0(), o27.j(), o27.z0(), java.lang.Boolean.TRUE);
                    } else {
                        ((uh4.c0) i95.n0.c(uh4.c0.class)).rh(c5082xed6d00e.f135123a, c01.z1.r(), m3Var.f450730f, o27.mo78012x3fdd41df(), o27.I0(), o27.j(), o27.z0(), java.lang.Boolean.TRUE);
                    }
                    return true;
                }
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TodoSystemMsgUrlSpanHandler */
    /* loaded from: classes9.dex */
    public class TodoSystemMsgUrlSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public TodoSystemMsgUrlSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{54};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://roomtoolstodo?")) {
                return new r35.m3(str, 54, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            boolean z17;
            if (m3Var.f450728d != 54) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleClickTodoSystemMsgUrl");
            try {
                android.net.Uri parse = android.net.Uri.parse(m3Var.e());
                java.lang.String str = m3Var.f450733i;
                java.lang.String queryParameter = parse.getQueryParameter("todoid");
                parse.getQueryParameter("related_msgid");
                java.lang.String queryParameter2 = parse.getQueryParameter(dm.i4.f66875xa013b0d5);
                java.lang.String queryParameter3 = parse.getQueryParameter(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(str, queryParameter);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("roomannouncement@app.origin", queryParameter2)) {
                    kn.j0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, true);
                } else {
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398545a = queryParameter2;
                    b1Var.f398555f = queryParameter3;
                    b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e5.f34113x366c91de;
                    b1Var.f398575t = str;
                    ((nn.j) i95.n0.c(nn.j.class)).wi(b1Var, z07);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, b1Var);
                }
                boolean e17 = kn.j0.e(z07);
                if (e17) {
                    z17 = kn.j0.j(z07);
                    if (z17) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe c5759x7ac701fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe();
                        am.ql qlVar = c5759x7ac701fe.f136078g;
                        qlVar.f89248a = 3;
                        qlVar.f89249b = z07.f66259x137a1f8b;
                        qlVar.f89250c = queryParameter;
                        c5759x7ac701fe.b(android.os.Looper.getMainLooper());
                    }
                } else {
                    z17 = false;
                }
                kn.k0.a(str, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("roomannouncement@app.origin", queryParameter2) ? 1 : 0, 2, queryParameter, queryParameter2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleClickTodoSystemMsgUrl stoTodo(%s %s %s) update finish(%s)", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter2)), java.lang.Boolean.valueOf(e17), java.lang.Boolean.valueOf(z17));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "handle click link error: %s, url: %s", e18.getMessage(), m3Var.e());
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TopicSpanHandler */
    /* loaded from: classes4.dex */
    public class TopicSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public TopicSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{58};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean d(android.view.View r21, r35.m3 r22, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z r23) {
            /*
                Method dump skipped, instructions count: 379
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.TopicSpanHandler.d(android.view.View, r35.m3, com.tencent.mm.pluginsdk.ui.span.z):boolean");
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }

        public final java.lang.String g(int i17, java.lang.String str, int i18) {
            java.lang.String[] split;
            if (i17 == 3 && !android.text.TextUtils.isEmpty(str) && (split = str.split("#")) != null && split.length >= 2) {
                java.lang.String str2 = split[1];
                if ((android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.equals("0", str2)) && i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchReportLogic", "need correct feeId");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i18);
                    if (i19 != null) {
                        long j17 = i19.f68891x29d1292e;
                        if (j17 != 0) {
                            split[1] = ca4.z0.t0(j17);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            for (int i27 = 0; i27 < split.length; i27++) {
                                sb6.append(split[i27]);
                                if (i27 != split.length - 1) {
                                    sb6.append("#");
                                }
                            }
                            return sb6.toString();
                        }
                    }
                }
            }
            return str;
        }

        public void h(android.view.View view, r35.m3 m3Var, java.lang.String str, int i17, int i18) {
            int i19;
            java.lang.String str2;
            int i27;
            r45.ek6 ek6Var = (r45.ek6) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Vi(1, view);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "TopicSpanHandler click %s %s", m3Var.e(), ek6Var);
            long e17 = c01.id.e();
            if (ek6Var != null) {
                i19 = ek6Var.f455118e;
                java.lang.String str3 = ek6Var.f455119f;
                long j17 = ek6Var.f455120g;
                i27 = ek6Var.f455121h;
                str2 = g(i19, str3, ek6Var.f455123m);
                e17 = j17;
            } else {
                i19 = 0;
                str2 = "";
                i27 = 0;
            }
            java.lang.String e18 = m3Var.e();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7061xa3bba179 c7061xa3bba179 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7061xa3bba179();
            c7061xa3bba179.f143690d = 1L;
            c7061xa3bba179.f143691e = c01.id.e();
            c7061xa3bba179.f143692f = 1L;
            if (!android.text.TextUtils.isEmpty(e18) && e18.startsWith("#")) {
                e18 = e18.substring(1);
            }
            c7061xa3bba179.f143693g = c7061xa3bba179.b("ResultQuery", e18, true);
            c7061xa3bba179.f143694h = i19;
            c7061xa3bba179.f143695i = c7061xa3bba179.b("ShareSceneId", str2, true);
            c7061xa3bba179.f143696j = e17;
            c7061xa3bba179.f143697k = i27;
            c7061xa3bba179.f143698l = c7061xa3bba179.b("SearchSessionId", str, true);
            c7061xa3bba179.f143699m = i17;
            c7061xa3bba179.f143700n = i18;
            c7061xa3bba179.k();
            su4.k3.m(c7061xa3bba179);
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TransferUriSpanHandler */
    /* loaded from: classes9.dex */
    public class TransferUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public TransferUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{39, 40, 41, 70, 42, 49, 56, 63, 78};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/retrysendmsg")) {
                return new r35.m3(str, 39, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/rebacksendmsg")) {
                return new r35.m3(str, 40, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/watchbalance")) {
                return new r35.m3(str, 41, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/watchotheraccount")) {
                return new r35.m3(str, 70, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/watchlqt")) {
                return new r35.m3(str, 42, null);
            }
            if (str.trim().toLowerCase().startsWith("wechat://wcpay/transfer/transferquery")) {
                return new r35.m3(str, 49, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wxpay/transfer/remindrcvmsg")) {
                return new r35.m3(str, 56, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wxpay/transfer/transfer_overtime")) {
                return new r35.m3(str, 63, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/limitinfo")) {
                return new r35.m3(str, 78, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            java.lang.String str;
            java.lang.String str2;
            if (m3Var != null) {
                com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
                int i17 = m3Var.f450728d;
                if (i17 == 42) {
                    if (!((h45.q) i95.n0.c(h45.q.class)).mo24812x391b2a71(c5082xed6d00e.f135123a)) {
                        j45.l.j(c5082xed6d00e.f135123a, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", new android.content.Intent(), null);
                    }
                    return true;
                }
                if (i17 == 41) {
                    if (!((h45.q) i95.n0.c(h45.q.class)).mo24838x4e268286(c5082xed6d00e.f135123a)) {
                        j45.l.h(c5082xed6d00e.f135123a, "wallet", ".balance.ui.WalletBalanceManagerUI");
                    }
                    return true;
                }
                if (i17 == 70 || i17 == 78) {
                    android.net.Uri parse = android.net.Uri.parse(m3Var.e());
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5901x11e46cba c5901x11e46cba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5901x11e46cba();
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("jumpinfo_type"), 0);
                    am.pq pqVar = c5901x11e46cba.f136207g;
                    pqVar.f89181a = P;
                    pqVar.f89182b = parse.getQueryParameter("jumpinfo_url");
                    pqVar.f89183c = parse.getQueryParameter("jumpinfo_username");
                    pqVar.f89184d = parse.getQueryParameter("jumpinfo_pagepath");
                    pqVar.f89185e = parse.getQueryParameter("jumpinfo_appid");
                    pqVar.f89186f = parse.getQueryParameter("jumpinfo_page");
                    c5901x11e46cba.e();
                    return true;
                }
                if (i17 == 39) {
                    java.lang.Object obj = m3Var.f450729e;
                    if (obj != null && (obj instanceof android.os.Bundle)) {
                        android.os.Bundle bundle = (android.os.Bundle) obj;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api.C19564xaf6ceaf4 c19564xaf6ceaf4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api.C19564xaf6ceaf4) bundle.getParcelable("resend_msg_info");
                        o05.i iVar = (o05.i) i95.n0.c(o05.i.class);
                        android.content.Context context = c5082xed6d00e.f135123a;
                        com.p314xaae8f345.mm.app.p622xc5476f33.d0 d0Var = new com.p314xaae8f345.mm.app.p622xc5476f33.d0(this, bundle);
                        ((kw3.j) iVar).getClass();
                        new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.d0(context).a(c19564xaf6ceaf4, d0Var);
                    }
                    return true;
                }
                if (i17 == 40) {
                    java.lang.Object obj2 = m3Var.f450729e;
                    if (obj2 != null && (obj2 instanceof android.os.Bundle)) {
                        android.os.Bundle bundle2 = (android.os.Bundle) obj2;
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5905xd2ae9448 c5905xd2ae9448 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5905xd2ae9448();
                        java.lang.String string = bundle2.getString(ya.b.f77506xba41a63c);
                        am.sq sqVar = c5905xd2ae9448.f136210g;
                        sqVar.f89459a = string;
                        sqVar.f89460b = bundle2.getString("transfer_id");
                        sqVar.f89461c = bundle2.getInt("total_fee");
                        sqVar.f89462d = bundle2.getString("sender_name");
                        c5905xd2ae9448.e();
                    }
                    return true;
                }
                if (i17 == 49) {
                    android.net.Uri parse2 = android.net.Uri.parse(m3Var.e());
                    java.lang.String queryParameter = parse2.getQueryParameter("transfer_id");
                    java.lang.String queryParameter2 = parse2.getQueryParameter("trans_id");
                    java.lang.Object obj3 = m3Var.f450729e;
                    if (obj3 == null || !(obj3 instanceof android.os.Bundle)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "hrefInfo.getType() == TYPE_TRANSFER_QUERY_MSG senderName == null");
                        str = "";
                        str2 = "";
                    } else {
                        android.os.Bundle bundle3 = (android.os.Bundle) obj3;
                        str = bundle3.getString("sender_name");
                        str2 = bundle3.getString("receiver_name");
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("transfer_id", queryParameter);
                    intent.putExtra(ya.b.f77506xba41a63c, queryParameter2);
                    intent.putExtra("sender_name", str);
                    intent.putExtra("receiver_name", str2);
                    j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "remittance", ".ui.RemittanceDetailUI", intent, null);
                    return true;
                }
                if (i17 == 56 || i17 == 63) {
                    android.net.Uri parse3 = android.net.Uri.parse(m3Var.e());
                    java.lang.String queryParameter3 = parse3.getQueryParameter("transferid");
                    java.lang.String queryParameter4 = parse3.getQueryParameter("fromusername");
                    java.lang.String queryParameter5 = parse3.getQueryParameter("transfer_msg_type");
                    if (i17 == 56) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "click MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG, transferId: %s，msgType:%s", queryParameter3, queryParameter5);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20467, "transfer_to_change", "click message", "", "", "", "", 3, queryParameter3, queryParameter5);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter3)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG");
                        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                        rw3.c y07 = kw3.p.Ai().Ni().y0(queryParameter3);
                        if (y07 != null) {
                            long j17 = y07.f68617x512156d6;
                            if (j17 > 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG, localMsgId: %s", java.lang.Long.valueOf(j17));
                                if (pt0.f0.Li(y07.f68621x114ef53e, y07.f68617x512156d6).m124847x74d37ac6() <= 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "cannot find msg in msg storage!");
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                    u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0_));
                                    u1Var.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                                    u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
                                    u1Var.l(new com.p314xaae8f345.mm.app.p622xc5476f33.e0(this));
                                    u1Var.q(false);
                                } else {
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372 c5979x79adf372 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372();
                                    long j18 = y07.f68617x512156d6;
                                    am.gt gtVar = c5979x79adf372.f136276g;
                                    gtVar.f88322b = j18;
                                    gtVar.f88321a = queryParameter4;
                                    gtVar.f88323c = y07.f68621x114ef53e;
                                    c5979x79adf372.e();
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG, cannot find local msg");
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        u1Var2.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0_));
                        u1Var2.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                        u1Var2.m(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
                        u1Var2.l(new com.p314xaae8f345.mm.app.p622xc5476f33.f0(this));
                        u1Var2.q(false);
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$UnKnowToUrlSpanHandler */
    /* loaded from: classes4.dex */
    public class UnKnowToUrlSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public UnKnowToUrlSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{2147483646};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 2147483646) {
                return false;
            }
            java.lang.Object obj = m3Var.f450729e;
            if (obj instanceof android.os.Bundle) {
                java.lang.String string = ((android.os.Bundle) obj).getString("rawUrl");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "TYPE_UNKNOW_TO_URL url == null");
                } else {
                    c71.b.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string, 0, true);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "TYPE_UNKNOW_TO_URL hrefInfo.getData() no instanceof Bundle");
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$UpgradeAssociateChatRoomUrlSpanHandler */
    /* loaded from: classes9.dex */
    public class UpgradeAssociateChatRoomUrlSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public UpgradeAssociateChatRoomUrlSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{53};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://weixingroupupdate?")) {
                return new r35.m3(str, 53, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            java.lang.String queryParameter;
            if (m3Var.f450728d != 53) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl");
            try {
                queryParameter = android.net.Uri.parse(m3Var.e()).getQueryParameter("roomname");
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URISpanHandlerSet", "Username is null.");
                return true;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(queryParameter)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(queryParameter);
                if (z07 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl %s member is null", queryParameter);
                    return true;
                }
                int i17 = 3;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = queryParameter;
                objArr[1] = java.lang.Integer.valueOf(z07.f69084x8729abea);
                java.lang.String str = z07.f69107x5be1edb3;
                if (str == null) {
                    str = "";
                }
                objArr[2] = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl room:%s chatroomStatus:%s owener:%s", objArr);
                boolean z17 = z07.f69098xbcb1bed0 >= c01.v1.q();
                boolean F = c01.e2.F(queryParameter);
                com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
                try {
                    if (F) {
                        if (!z07.L0(c01.z1.r())) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：no owner");
                            android.content.Context context = c5082xed6d00e.f135123a;
                            if (context != null) {
                                db5.e1.E(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0e), "", c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, null);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：mContext is null");
                            }
                            if (!z17) {
                                i17 = 1;
                            }
                            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752.T6(queryParameter, 2, 2, i17);
                            return true;
                        }
                    } else if (c01.e2.E(queryParameter) && !z07.L0(c01.z1.r())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：isAssociateChatRoom ");
                        android.content.Context context2 = c5082xed6d00e.f135123a;
                        if (context2 != null) {
                            db5.e1.E(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0b), "", c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, null);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：mContext is null");
                        }
                        return true;
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：exceed maxnum");
                        android.content.Context context3 = c5082xed6d00e.f135123a;
                        if (context3 != null) {
                            db5.e1.E(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0c), "", c5082xed6d00e.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, null);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：mContext is null");
                        }
                        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752.T6(queryParameter, 2, 2, 2);
                        return true;
                    }
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().a(25);
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().a(26);
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().a(27);
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752.class);
                    intent.addFlags(268435456);
                    intent.putExtra("RoomInfo_Id", queryParameter);
                    intent.putExtra("upgrade_openim_room_from_scene", 2);
                    android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context4, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$UpgradeAssociateChatRoomUrlSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context4.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context4, "com/tencent/mm/app/plugin/URISpanHandlerSet$UpgradeAssociateChatRoomUrlSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandlerSet", "handle click link error: %s, url: %s", e.getMessage(), m3Var.e());
                    return true;
                }
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$VerifyContactUriSpanHandler */
    /* loaded from: classes4.dex */
    public class VerifyContactUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public VerifyContactUriSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{4};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://findfriend/verifycontact")) {
                return new r35.m3(str, 4, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 4) {
                return false;
            }
            if (zVar == null) {
                return true;
            }
            zVar.b(m3Var);
            zVar.a(m3Var);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$VoipCallAgainUrilSpanHandler */
    /* loaded from: classes8.dex */
    public class VoipCallAgainUrilSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public VoipCallAgainUrilSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{38};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://voip/callagain/")) {
                return new r35.m3(str, 38, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 38) {
                return false;
            }
            android.net.Uri parse = android.net.Uri.parse(m3Var.e());
            java.lang.String queryParameter = parse.getQueryParameter(dm.i4.f66875xa013b0d5);
            java.lang.String queryParameter2 = parse.getQueryParameter("isvideocall");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
            am.y00 y00Var = c6231x4f3054ba.f136478g;
            y00Var.f89948b = 5;
            y00Var.f89951e = queryParameter;
            y00Var.f89950d = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7015xf9eade38 c7015xf9eade38 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7015xf9eade38();
            c7015xf9eade38.f143292e = 1L;
            c7015xf9eade38.k();
            if (queryParameter == null || queryParameter.equals("") || !queryParameter.equals(m3Var.f450730f)) {
                return false;
            }
            if (queryParameter2 == null || !queryParameter2.equals("true")) {
                y00Var.f89952f = 4;
            } else {
                y00Var.f89952f = 2;
            }
            c6231x4f3054ba.e();
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$VoipDetailUriSpanHandler */
    /* loaded from: classes4.dex */
    public class VoipDetailUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public VoipDetailUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{72};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://jump/voipdetail")) {
                return new r35.m3(str, 72, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
            if (m3Var.f450728d != 72 || ((f9Var = m3Var.f450739o) != null && !f9Var.j2())) {
                return false;
            }
            java.lang.String queryParameter = android.net.Uri.parse(m3Var.e()).getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("userInfos", queryParameter);
            com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this;
            if (c5082xed6d00e.f135123a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(c5082xed6d00e.f135123a, "account", "com.tencent.mm.voipmp.support.VoipDetailActivity", intent, null);
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$WeTypeSpanHandler */
    /* loaded from: classes8.dex */
    public class WeTypeSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public WeTypeSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{71};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://wetype/")) {
                return new r35.m3(str, 71, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            if (m3Var.f450728d != 71) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "WeTypeSpanHandler");
            try {
                cl0.g gVar = new cl0.g("{\"wetype\":{\"scene\":2}}");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "query:%s", gVar.toString());
                ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).bj(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, gVar.toString());
            } catch (cl0.f e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.URISpanHandlerSet", e17, "", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c c7010x69e1879c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c();
            c7010x69e1879c.f143232d = 3L;
            c7010x69e1879c.k();
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$WeWorkUrlSpanHandler */
    /* loaded from: classes4.dex */
    public class WeWorkUrlSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f135170a = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyv) + "/wework_admin/commdownload";

        public WeWorkUrlSpanHandler(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e) {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{52};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("wxwork://jump?")) {
                return new r35.m3(str, 52, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            java.lang.String str;
            if (m3Var.f450728d == 52) {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(android.net.Uri.parse(m3Var.e()));
                intent.setPackage("com.tencent.wework");
                intent.setFlags(268435456);
                try {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    android.content.pm.PackageManager packageManager = context.getPackageManager();
                    try {
                        str = packageManager.getApplicationInfo("com.tencent.wework", 0).loadLabel(packageManager).toString();
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        str = null;
                    }
                    ((kt.c) i0Var).getClass();
                    boolean v17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context, intent, str, null, null);
                    if (!v17) {
                        c71.b.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f135170a, 0, true);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "WeWorkUrlSpanHandler result:%s", java.lang.Boolean.valueOf(v17));
                    return true;
                } catch (java.lang.Exception unused2) {
                }
            }
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.p314xaae8f345.mm.app.p622xc5476f33.g0
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$WxaShortLinkUriSpanHandler */
    /* loaded from: classes9.dex */
    public class WxaShortLinkUriSpanHandler extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
        public WxaShortLinkUriSpanHandler() {
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{60};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("mp://")) {
                return new r35.m3(str, 60, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            java.lang.String str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] handleSpanClick ");
            java.lang.Object obj = m3Var.f450729e;
            if (!(obj instanceof android.os.Bundle)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] HrefInfo has not data");
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return false;
            }
            android.os.Bundle bundle = (android.os.Bundle) obj;
            java.lang.String str3 = "";
            java.lang.String string = bundle.getString("key_wxa_short_link_launch_scene", "");
            int i17 = bundle.getInt("key_wxa_short_link_launch_chat_type", -1);
            if (string.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] scene is null ");
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return false;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1 m75717xdce0328 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.m75717xdce0328(string);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] sceneName=%s  scene=%d  preScene=%d", string, java.lang.Integer.valueOf(m75717xdce0328.f272797d), java.lang.Integer.valueOf(m75717xdce0328.f272798e));
            l81.r0 r0Var = (l81.r0) i95.n0.c(l81.r0.class);
            android.content.Context context = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a;
            java.lang.String e17 = m3Var.e();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m3Var.d())) {
                java.lang.String str5 = m3Var.f450731g;
                if (str5 != null) {
                    str = str5;
                } else {
                    java.lang.String str6 = m3Var.f450730f;
                    if (str6 != null) {
                        str = str6;
                    }
                }
                ((kj1.a0) r0Var).wi(context, e17, str, m75717xdce0328, i17);
                return false;
            }
            str3 = m3Var.d();
            str = str3;
            ((kj1.a0) r0Var).wi(context, e17, str, m75717xdce0328, i17);
            return false;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    public C5082xed6d00e(android.content.Context context) {
        this.f135123a = null;
        this.f135123a = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : null;
    }
}
