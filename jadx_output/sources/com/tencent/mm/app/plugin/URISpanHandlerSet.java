package com.tencent.mm.app.plugin;

/* loaded from: classes4.dex */
public class URISpanHandlerSet {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f53590a;

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class AAUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public AAUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{35, 36, 37};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
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

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            android.net.Uri parse;
            java.lang.String queryParameter;
            java.lang.String obj;
            int i17 = m3Var.f369195d;
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (i17 == 35) {
                try {
                    parse = android.net.Uri.parse(m3Var.e());
                    queryParameter = parse.getQueryParameter("billno");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "handle click new aa open detail link error: %s, url: %s", e17.getMessage(), m3Var.e());
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "url error, billno is null");
                    return true;
                }
                int P = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 3);
                java.lang.Object obj2 = m3Var.f369196e;
                if (obj2 instanceof android.os.Bundle) {
                    obj = ((android.os.Bundle) obj2).getString("chatroom_name");
                } else {
                    if (!(obj2 instanceof java.lang.String)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "illegal data type, %s", m3Var);
                        return true;
                    }
                    obj = obj2.toString();
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("bill_no", queryParameter);
                intent.putExtra("enter_scene", P);
                intent.putExtra("chatroom", obj);
                j45.l.j(uRISpanHandlerSet.f53590a, "aa", ".ui.PaylistAAUI", intent, null);
                return true;
            }
            if (i17 != 37) {
                if (i17 != 36) {
                    return false;
                }
                try {
                    java.lang.String queryParameter2 = android.net.Uri.parse(m3Var.e()).getQueryParameter("billno");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter2)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "url error, billno is null");
                        return true;
                    }
                    java.lang.Object obj3 = m3Var.f369196e;
                    android.os.Bundle bundle = obj3 instanceof android.os.Bundle ? (android.os.Bundle) obj3 : null;
                    if (bundle != null && !com.tencent.mm.sdk.platformtools.t8.K0(bundle.getString("chatroom_name"))) {
                        db5.e1.j(uRISpanHandlerSet.f53590a, com.tencent.mm.R.string.jjc, -1, com.tencent.mm.R.string.jjd, com.tencent.mm.R.string.aq7, new com.tencent.mm.app.plugin.u(this, queryParameter2, bundle.getString("chatroom_name"), bundle.getLong("msg_id", -1L)), null);
                        return false;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "empty chatroom!");
                    return true;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "handle click new aa urge notify link error: %s, url: %s", e18.getMessage(), m3Var.e());
                    return false;
                }
            }
            try {
                java.lang.String queryParameter3 = android.net.Uri.parse(m3Var.e()).getQueryParameter("billno");
                if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter3)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "url error, billno is null");
                    return true;
                }
                java.lang.Object obj4 = m3Var.f369196e;
                if (!(obj4 instanceof android.os.Bundle)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "error data!");
                    return true;
                }
                android.os.Bundle bundle2 = (android.os.Bundle) obj4;
                java.lang.String string = bundle2.getString("chatroom_name");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "empty chatroom!");
                    return true;
                }
                long j17 = bundle2.getLong("msg_id", -1L);
                if (j17 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "msgId is null");
                    return true;
                }
                db5.e1.j(uRISpanHandlerSet.f53590a, com.tencent.mm.R.string.jjb, -1, com.tencent.mm.R.string.jje, com.tencent.mm.R.string.aq7, new com.tencent.mm.app.plugin.t(this, queryParameter3, string, j17), null);
                return false;
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "handle click new aa close link error: %s, url: %s", e19.getMessage(), m3Var.e());
                return false;
            }
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class AddressUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public AddressUriSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{44};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 44) {
                return false;
            }
            android.net.Uri parse = android.net.Uri.parse("geo:0,0?q=" + android.net.Uri.encode(m3Var.e()));
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            if (intent.resolveActivity(com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager()) != null) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$AddressUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$AddressUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 9, "");
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "Cannot find map app");
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 8, "");
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class AlphaInstallUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public AlphaInstallUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{32};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://alphainstall?")) {
                return new r35.m3(str, 32, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 32) {
                return false;
            }
            java.lang.String replace = m3Var.e().replace("weixin://alphainstall?", "");
            java.lang.String str = lp0.b.D() + android.net.Uri.parse(replace).getQueryParameter("md5") + ".apk";
            if (!com.tencent.mm.vfs.w6.j(str)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", replace.toString());
                j45.l.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, "webview", ".ui.tools.WebViewUI", intent, null);
                return true;
            }
            zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((yb0.c) yVar).getClass();
            com.tencent.mm.pluginsdk.model.app.n1.d(context, str, null, false);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class AppBrandLinkSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public AppBrandLinkSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{45};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            com.tencent.mm.storage.f9 f9Var;
            if (m3Var.f369195d == 45) {
                if (m3Var.f369205n == 1 && (f9Var = m3Var.f369206o) != null) {
                    r01.r1.d(f9Var, r01.r1.f368216j, r01.r1.f368217k, 0);
                }
                if (zVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "AppBrandLinkSpanHandler click appbrandlink");
                    zVar.a(m3Var);
                    return true;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "clickCallback is null, return");
            }
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class BaseUriSpanHandler {
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.tencent.mm.storage.f9 f9Var;
            com.tencent.mm.storage.f9 f9Var2;
            java.lang.String m07 = com.tencent.mm.sdk.platformtools.t8.m0(com.tencent.mm.sdk.platformtools.x2.f193071a);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[9];
            lVarArr[0] = new jz5.l("stack", com.tencent.mm.sdk.platformtools.z3.b(true));
            java.lang.String e17 = m3Var != null ? m3Var.e() : null;
            if (e17 == null) {
                e17 = "";
            }
            lVarArr[1] = new jz5.l("url", e17);
            java.lang.String str = m3Var != null ? m3Var.f369194c : null;
            if (str == null) {
                str = "";
            }
            lVarArr[2] = new jz5.l("originURL", str);
            lVarArr[3] = new jz5.l("msgType", (m3Var == null || (f9Var2 = m3Var.f369206o) == null) ? "" : java.lang.Integer.valueOf(f9Var2.getType()));
            java.lang.String Q0 = (m3Var == null || (f9Var = m3Var.f369206o) == null) ? null : f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            lVarArr[4] = new jz5.l("talker", Q0);
            lVarArr[5] = new jz5.l("hrefInfoType", m3Var != null ? java.lang.Integer.valueOf(m3Var.f369195d) : "");
            lVarArr[6] = new jz5.l("fromScene", m3Var != null ? java.lang.Integer.valueOf(m3Var.f369205n) : "");
            java.lang.String str2 = m3Var != null ? m3Var.f369197f : null;
            lVarArr[7] = new jz5.l(dm.i4.COL_USERNAME, str2 != null ? str2 : "");
            lVarArr[8] = new jz5.l(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, m07);
            ((cy1.a) rVar).Ej("uri_span_click", kz5.c1.k(lVarArr), 36085);
            return true;
        }

        public abstract int[] b();

        public abstract r35.m3 c(java.lang.String str);

        public abstract boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar);

        public boolean e(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (a(view, m3Var)) {
                return d(view, m3Var, zVar);
            }
            return false;
        }

        public abstract boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle);
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class BindMobileUrilSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public BindMobileUrilSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{5};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/bindphone")) {
                return new r35.m3(str, 5, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 5) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            com.tencent.mm.ui.MMWizardActivity.X6(uRISpanHandlerSet.f53590a, new android.content.Intent(uRISpanHandlerSet.f53590a, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class));
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/bindphone")) {
                return false;
            }
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            android.content.Intent intent = new android.content.Intent(uRISpanHandlerSet.f53590a, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            com.tencent.mm.ui.MMWizardActivity.X6(uRISpanHandlerSet.f53590a, intent);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class BizMsgMenuUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public BizMsgMenuUriSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(m3Var.f369197f) && (c01.e2.G(m3Var.f369197f) || com.tencent.mm.storage.z3.z3(m3Var.f369197f));
            if (!z17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler %s not biz user", m3Var.f369197f);
            }
            return z17;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{43};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://bizmsgmenu")) {
                return new r35.m3(str, 43, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            com.tencent.mm.storage.f9 f9Var;
            if (43 != m3Var.f369195d) {
                return false;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(m3Var.f369197f)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler Username is null.");
                return true;
            }
            if (m3Var.f369205n == 1 && (f9Var = m3Var.f369206o) != null) {
                r01.r1.d(f9Var, r01.r1.f368216j, r01.r1.f368217k, 0);
            }
            m3Var.e();
            android.net.Uri parse = android.net.Uri.parse(m3Var.e().trim());
            java.lang.String queryParameter = parse.getQueryParameter("msgmenuid");
            if (queryParameter == null) {
                queryParameter = "";
            }
            java.lang.String trim = queryParameter.trim();
            java.lang.String queryParameter2 = parse.getQueryParameter("msgmenucontent");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = trim != null ? trim : "";
            objArr[1] = m3Var.f369197f;
            g0Var.d(14522, objArr);
            if (com.tencent.mm.sdk.platformtools.t8.K0(trim) || com.tencent.mm.sdk.platformtools.t8.K0(queryParameter2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler id or msgContent is null.");
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("bizmsgmenuid", trim);
            if (w11.t1.a(m3Var.f369197f)) {
                w11.r1 a17 = w11.s1.a(m3Var.f369197f);
                a17.g(m3Var.f369197f);
                a17.e(queryParameter2);
                a17.f442130e = c01.e2.C(m3Var.f369197f);
                a17.f442131f = 1;
                a17.f442133h = hashMap;
                a17.b();
            } else {
                w11.r1 a18 = w11.s1.a(m3Var.f369197f);
                a18.g(m3Var.f369197f);
                a18.e(queryParameter2);
                a18.f442130e = c01.e2.C(m3Var.f369197f);
                a18.f442131f = 1;
                a18.f442133h = hashMap;
                a18.f442134i = 5;
                a18.a().a();
            }
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class CardUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public CardUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.startsWith("wxcard://cardjumptype=1")) {
                return false;
            }
            java.lang.String obj = o2Var != null ? ((com.tencent.mm.ui.chatting.component.e) o2Var).f198952a.f198580d.u().d1().toString() : null;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("user_name", obj);
            intent.putExtra("view_type", 1);
            j45.l.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, "card", ".ui.CardViewUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class ChatroomNotifyDetailSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public ChatroomNotifyDetailSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{67};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://chatroomnotify/detail/")) {
                return new r35.m3(str, 67, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 67) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "ChatroomNotifyDetailSpanHandler");
            android.net.Uri.parse(m3Var.e());
            java.lang.String e17 = m3Var.e();
            long V = com.tencent.mm.sdk.platformtools.t8.V(e17.substring(e17.trim().lastIndexOf("/") + 1), 0L);
            if (V > 0) {
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(m3Var.f369200i, V);
                ((com.tencent.mm.plugin.announcement.x) ((d81.e) i95.n0.c(d81.e.class))).Bi(view.getContext(), Li.Q0(), Li.J0(), false);
            }
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class ContactUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public ContactUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{23, 21, 22, 2};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            java.lang.String substring;
            int lastIndexOf;
            boolean equals = str.trim().equals("weixin://contacts/all/");
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (equals) {
                return new r35.m3(str, 23, new c01.s7("@all.android", null, uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.fsa), null, true, true));
            }
            if (str.trim().equals("weixin://contacts/microblog/")) {
                return new r35.m3(str, 22, c01.t7.c(uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.fti)));
            }
            if (str.trim().equals("weixin://contacts/micromessenger/")) {
                return new r35.m3(str, 2, new c01.s7("@micromsg.qq.com", null, uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.ftj), null, true, true));
            }
            if (!str.trim().startsWith("weixin://contacts/") || (lastIndexOf = (substring = str.trim().substring(0, str.trim().length() - 1)).lastIndexOf("/")) == -1) {
                return null;
            }
            return new r35.m3(str, 21, c01.t7.b("@" + substring.substring(lastIndexOf + 1), uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.fsc)));
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            boolean z17;
            int i17 = m3Var.f369195d;
            if (i17 != 23 && i17 != 21 && i17 != 22 && i17 != 2) {
                return false;
            }
            c01.s7 s7Var = (c01.s7) m3Var.b(c01.s7.class);
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (s7Var == null) {
                android.content.Context context = uRISpanHandlerSet.f53590a;
                db5.e1.s(context, context.getString(com.tencent.mm.R.string.gbg), uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.f490573yv));
                return false;
            }
            if (s7Var.a().equals("@t.qq.com")) {
                if (!(((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com") != null)) {
                    android.content.Context context2 = uRISpanHandlerSet.f53590a;
                    db5.e1.s(context2, context2.getString(com.tencent.mm.R.string.gbg), uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.f490573yv));
                }
            }
            if (s7Var.a().equals("@domain.android")) {
                com.tencent.mm.storage.ka kaVar = (com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj();
                kaVar.getClass();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                android.database.Cursor D = kaVar.f195078d.D("role_info", null, "int_reserved1=1", null, null, null, null, 2);
                while (D.moveToNext()) {
                    com.tencent.mm.storage.ja jaVar = new com.tencent.mm.storage.ja();
                    jaVar.a(D);
                    linkedList.add(jaVar);
                }
                D.close();
                if (linkedList.size() > 0) {
                    for (int i18 = 0; i18 < linkedList.size(); i18++) {
                        if (((com.tencent.mm.storage.ja) linkedList.get(i18)).c()) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                    android.content.Context context3 = uRISpanHandlerSet.f53590a;
                    db5.e1.s(context3, context3.getString(com.tencent.mm.R.string.gbg), uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.f490573yv));
                }
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(uRISpanHandlerSet.f53590a, com.tencent.mm.ui.contact.SelectContactUI.class);
            android.content.Intent putExtra = intent.putExtra("Contact_GroupFilter_Type", s7Var.a());
            java.lang.String str = s7Var.f37458c;
            if (str == null) {
                str = "";
            }
            android.content.Intent putExtra2 = putExtra.putExtra("Contact_GroupFilter_Str", str);
            java.lang.String str2 = s7Var.f37457b;
            putExtra2.putExtra("Contact_GroupFilter_DisplayName", str2 != null ? str2 : "");
            intent.addFlags(268435456);
            android.content.Context context4 = uRISpanHandlerSet.f53590a;
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

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://contacts/microblog/") && !str.equals("weixin://contacts/micromessenger/") && !str.equals("weixin://contacts/all/")) {
                return false;
            }
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            c01.s7 c17 = c01.t7.c(uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.ftj));
            if (str.equals("weixin://contacts/microblog/")) {
                c17 = c01.t7.c(uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.fti));
            }
            if (str.equals("weixin://contacts/micromessenger/")) {
                c17 = c01.t7.c(uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.ftj));
            }
            if (str.equals("weixin://contacts/all/")) {
                c17 = c01.t7.c(uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.fsa));
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(uRISpanHandlerSet.f53590a, com.tencent.mm.ui.contact.SelectContactUI.class);
            android.content.Intent putExtra = intent.putExtra("Contact_GroupFilter_Type", c17.a());
            java.lang.String str2 = c17.f37458c;
            if (str2 == null) {
                str2 = "";
            }
            android.content.Intent putExtra2 = putExtra.putExtra("Contact_GroupFilter_Str", str2);
            java.lang.String str3 = c17.f37457b;
            putExtra2.putExtra("Contact_GroupFilter_DisplayName", str3 != null ? str3 : "");
            intent.addFlags(268435456);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class CouponSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public CouponSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{74};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://wxpay/coupon/remindmsg")) {
                return new r35.m3(str, 74, null);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 74) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "TYPE_COUPON_JUMP_MSG go to third c2c msg");
            java.lang.Object obj = m3Var.f369196e;
            if (obj != null && (obj instanceof android.os.Bundle)) {
                java.lang.String queryParameter = android.net.Uri.parse(m3Var.e()).getQueryParameter("paymsgid");
                if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "TYPE_COUPON_JUMP_MSG payMsgId is null");
                } else {
                    jz5.g gVar = rb3.g.f393858a;
                    up5.a0 a0Var = (up5.a0) ((com.tencent.wcdb.core.Table) ((jz5.n) rb3.g.f393860c).getValue()).getFirstObject(up5.m.f430015c.eq(queryParameter));
                    if (a0Var == null || a0Var.f429889b.longValue() <= 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "TYPE_COUPON_JUMP_MSG can not find record for payMsgId:%s", queryParameter);
                    } else {
                        com.tencent.mm.storage.f9 Li = pt0.f0.Li(a0Var.f429890c, a0Var.f429889b.longValue());
                        if (Li.getMsgId() > 0) {
                            com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent scrollChattingUIConversationListEvent = new com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent();
                            long msgId = Li.getMsgId();
                            am.gt gtVar = scrollChattingUIConversationListEvent.f54743g;
                            gtVar.f6789b = msgId;
                            gtVar.f6788a = Li.Q0();
                            gtVar.f6790c = Li.Q0();
                            scrollChattingUIConversationListEvent.e();
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "TYPE_COUPON_JUMP_MSG can not find msg for payMsgId:%s", queryParameter);
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

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0(priority = com.tencent.mm.app.plugin.URISpanHandlerSet.PRIORITY.LOW)
    /* loaded from: classes9.dex */
    public class DeeplinkUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public DeeplinkUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{30};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler getHrefFromUrl %s", str);
            if (str.trim().toLowerCase().startsWith("weixin://")) {
                return new r35.m3(str, 30, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler handleSpanClick %d, %s", java.lang.Integer.valueOf(m3Var.f369195d), m3Var.e());
            java.lang.String str = zVar != null ? (java.lang.String) zVar.b(m3Var) : null;
            if (m3Var.f369195d != 30) {
                return false;
            }
            java.lang.String e17 = m3Var.e();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (e17 == null) {
                e17 = "";
            }
            final java.lang.String str2 = e17;
            if (str2.startsWith("weixin://shieldBrandMsg/") || str2.startsWith("weixin://receiveBrandMsg/")) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler username is null");
                    return true;
                }
                qk.o b17 = r01.z.b(str);
                if (b17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler BizInfo is null");
                    return true;
                }
                if (str2.startsWith("weixin://shieldBrandMsg/")) {
                    db5.e1.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, com.tencent.mm.R.string.f493346ju1, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.f493345ju0, com.tencent.mm.R.string.aq7, new com.tencent.mm.app.plugin.v(this, b17, str2, str), null);
                } else if (str2.startsWith("weixin://receiveBrandMsg/")) {
                    db5.e1.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, com.tencent.mm.R.string.jtz, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.jty, com.tencent.mm.R.string.aq7, new com.tencent.mm.app.plugin.w(this, b17, str2, str), null);
                }
            } else if (o25.z.u(android.net.Uri.parse(str2))) {
                o25.z.h(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, str, str2);
            } else {
                if (nf.z.d(str2, "weixin://dl/business") ? !android.text.TextUtils.isEmpty(u46.l.u(android.net.Uri.parse(str2).getQueryParameter("appid"))) : false) {
                    o25.z.h(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, str, str2);
                } else if (str2.startsWith("weixin://receiveWeAppKFMsg")) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler username is null, handle the BUILTIN_RECEIVE_WEAPP_KFMSG ,  the herfUrl is %s", str2);
                        return true;
                    }
                    db5.e1.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, com.tencent.mm.R.string.f490277qh, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.f490276qg, com.tencent.mm.R.string.aq7, new com.tencent.mm.app.plugin.x(this, str), null);
                } else if (str2.startsWith("weixin://xmail/bind")) {
                    android.content.Intent putExtra = new android.content.Intent().putExtra("Contact_User", "qqmail");
                    putExtra.putExtra("key_need_rebind_xmail", true);
                    j45.l.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", putExtra, null);
                } else if (!str2.startsWith("weixin://chatbot/") && !str2.startsWith("weixin://setting/sayhello") && !str2.startsWith("weixin://schedule_message/")) {
                    if (o25.z.r(str2)) {
                        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.app.plugin.URISpanHandlerSet$DeeplinkUriSpanHandler$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "LiteApp jump result: %b", java.lang.Boolean.valueOf(o25.z.m(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, str2)));
                            }
                        });
                    } else {
                        o25.z.d(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, str2, str, 1, str2, null);
                    }
                }
            }
            if (zVar != null) {
                zVar.a(m3Var);
            }
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || bundle == null) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Boolean.valueOf(str == null);
                objArr[1] = java.lang.Boolean.valueOf(bundle == null);
                com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "url is null ? %b, paramsBundle is null ? %b", objArr);
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
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            o25.z.g(uRISpanHandlerSet.f53590a, str, i18, null, new com.tencent.mm.app.plugin.y(this, db5.e1.Q(uRISpanHandlerSet.f53590a, "", "", false, true, null)), null, null, false);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class EcsGiftUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public EcsGiftUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{75};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://ecsgift/")) {
                return new r35.m3(str, 75, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            java.lang.Integer h17;
            if (m3Var.f369195d == 75) {
                java.lang.String linkUrl = m3Var.e();
                if (com.tencent.mm.sdk.platformtools.t8.K0(linkUrl)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "EcsGiftUriSpanHandler handleSpanClick, url is empty");
                    return false;
                }
                com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
                if (f9Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "EcsGiftUriSpanHandler, handleSpanClick, get msg null");
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "EcsGiftUriSpanHandler, url:%s", linkUrl);
                c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
                android.content.Context context = com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a;
                j00.k1 k1Var = (j00.k1) e3Var;
                k1Var.getClass();
                kotlin.jvm.internal.o.g(linkUrl, "linkUrl");
                android.net.Uri parse = android.net.Uri.parse(linkUrl);
                java.lang.String path = parse != null ? parse.getPath() : null;
                java.util.List f07 = path != null ? r26.n0.f0(path, new java.lang.String[]{"/"}, false, 0, 6, null) : kz5.p0.f313996d;
                java.lang.String str = f07.size() > 2 ? (java.lang.String) f07.get(2) : null;
                if (str == null || str.length() == 0) {
                    com.tencent.mars.xlog.Log.e("Ecs", "[Ecs] openEcsGiftWithSystemMsg orderid is nil");
                } else {
                    java.lang.String queryParameter = parse != null ? parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : null;
                    int intValue = (queryParameter == null || (h17 = r26.h0.h(queryParameter)) == null) ? 1 : h17.intValue();
                    n00.e y07 = n00.d.f333815a.a().y0(str);
                    long j17 = y07.field_msgLocalId;
                    java.lang.String str2 = y07.field_talkerUserName;
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "openEcsGiftWithSystemMsg, giftMsgId:" + str + ", msgId:" + j17 + ", talker:" + str2);
                    int wi6 = g95.e0.g(f9Var) ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2) : 1;
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "openEcsGiftWithSystemMsg with loading");
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    linkedHashMap.put("orderId", str);
                    int i17 = h20.a.f278261a;
                    linkedHashMap.put("pageOpenScene", "chatroom_sys_msg");
                    kotlin.jvm.internal.o.d(str2);
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

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class EcsNewXmlJumpUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public EcsNewXmlJumpUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{77};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://ecsnewxmljump")) {
                return new r35.m3(str, 77, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            java.lang.Integer h17;
            java.lang.Integer h18;
            if (m3Var.f369195d == 77) {
                java.lang.String linkUrl = m3Var.e();
                if (com.tencent.mm.sdk.platformtools.t8.K0(linkUrl)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "EcsNewXmlJumpUriSpanHandler handleSpanClick, url is empty");
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "EcsNewXmlJumpUriSpanHandler, url:%s", linkUrl);
                c00.w3 w3Var = (c00.w3) i95.n0.c(c00.w3.class);
                android.content.Context context = com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a;
                ((j00.f2) w3Var).getClass();
                kotlin.jvm.internal.o.g(linkUrl, "linkUrl");
                android.net.Uri parse = android.net.Uri.parse(linkUrl);
                java.lang.String queryParameter = parse.getQueryParameter("jumpinfo");
                if (queryParameter == null || queryParameter.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EcsJumpInfoMsgService", "[Ecs] openEcsNewXmlJumpWithSystemMsg jumpInfo is nil");
                } else {
                    java.lang.String queryParameter2 = parse.getQueryParameter("action");
                    int intValue = (queryParameter2 == null || (h18 = r26.h0.h(queryParameter2)) == null) ? 0 : h18.intValue();
                    java.lang.String queryParameter3 = parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    int intValue2 = (queryParameter3 == null || (h17 = r26.h0.h(queryParameter3)) == null) ? 0 : h17.intValue();
                    java.lang.String queryParameter4 = parse.getQueryParameter("reportextradata");
                    if (queryParameter4 == null) {
                        queryParameter4 = "";
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsJumpInfoMsgService", "[Ecs] action: " + intValue + ", scene: " + intValue2 + ", extra: " + queryParameter4);
                    if (view != null) {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("ecs_new_xml_jump_view", "view_clk", kz5.c1.k(new jz5.l("action", java.lang.String.valueOf(intValue)), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(intValue2)), new jz5.l("reportExtraData", queryParameter4)), 12, false);
                    }
                    int i17 = i20.c.f287870a;
                    if (intValue != 0 && intValue == 1) {
                        i95.m c17 = i95.n0.c(pq.q.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        pq.q qVar = (pq.q) c17;
                        if (context == null) {
                            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        }
                        kotlin.jvm.internal.o.d(context);
                        pq.q.se(qVar, new pq.a(context), queryParameter, null, 4, null);
                    }
                }
            }
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class EmotionStoreUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public EmotionStoreUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{29};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (!str.trim().startsWith("weixin://emoticonstore/")) {
                return null;
            }
            int lastIndexOf = str.lastIndexOf("/");
            return new r35.m3(str, 29, lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "");
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 29) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            java.lang.String substring = (m3Var.e() == null || !m3Var.e().trim().startsWith("weixin://emoticonstore/")) ? "" : m3Var.e().substring(23);
            if (substring.isEmpty()) {
                java.lang.String str = (java.lang.String) m3Var.b(java.lang.String.class);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                substring = str != null ? str : "";
            }
            qk.c0 c0Var = new qk.c0(substring);
            c0Var.f364198g = 3;
            c0Var.f364155a = 21;
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "emoticon liteapp service not found");
                return false;
            }
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, c0Var);
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class EnterChatRoomUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public EnterChatRoomUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{55};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://jump/chatroom/")) {
                return new r35.m3(str, 55, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            com.tencent.mm.storage.z3 n17;
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (m3Var.f369195d == 55) {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleClickEnterChatRoomSystemMsgUrl");
                try {
                    java.lang.String e17 = m3Var.e();
                    int lastIndexOf = e17.trim().lastIndexOf("/");
                    if (lastIndexOf >= 0 && lastIndexOf < e17.trim().length() - 1) {
                        java.lang.String substring = e17.trim().substring(lastIndexOf + 1);
                        if (com.tencent.mm.storage.z3.R4(substring) && ((n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(substring, true)) == null || ((int) n17.E2) == 0)) {
                            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                            z3Var.X1(substring);
                            ((com.tencent.mm.storage.k4) c01.d9.b().q()).h0(z3Var);
                        }
                        android.content.Intent putExtra = new android.content.Intent(uRISpanHandlerSet.f53590a, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class).putExtra("Chat_User", substring).putExtra("Chat_Mode", 1);
                        if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                            putExtra.addFlags(268435456);
                        }
                        android.content.Context context = uRISpanHandlerSet.f53590a;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(putExtra);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterChatRoomUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterChatRoomUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        if (m3Var.f369201j == 1) {
                            java.lang.String str = m3Var.f369200i;
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
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
                            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleClickEnterChatRoomSystemMsgUrl migrate(%s -> %s)", objArr);
                        }
                        return true;
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "handle click link error: %s, url: %s", e18.getMessage(), m3Var.e());
                }
            }
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class EnterRoomUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public EnterRoomUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            int lastIndexOf;
            com.tencent.mm.storage.z3 n17;
            if (!str.startsWith("weixin://jump/mainframe/") || (lastIndexOf = str.trim().lastIndexOf("/")) < 0 || lastIndexOf >= str.trim().length() - 1) {
                return false;
            }
            java.lang.String substring = str.trim().substring(lastIndexOf + 1);
            if (com.tencent.mm.storage.z3.R4(substring) && ((n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(substring, true)) == null || ((int) n17.E2) == 0)) {
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.X1(substring);
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).h0(z3Var);
            }
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            android.content.Intent putExtra = new android.content.Intent(uRISpanHandlerSet.f53590a, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class).putExtra("Chat_User", substring).putExtra("Chat_Mode", 1).putExtra("enter_room_from_uri_jump", true);
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                putExtra.addFlags(268435456);
            }
            android.content.Context context = uRISpanHandlerSet.f53590a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(putExtra);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterRoomUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterRoomUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class ExposeUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public ExposeUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{31};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().equals("weixin://expose/")) {
                return new r35.m3(str, 31, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 31) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            if (zVar == null) {
                return false;
            }
            java.lang.String str = (java.lang.String) zVar.b(m3Var);
            intent.putExtra("k_username", str);
            int i17 = (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.endsWith("@chatroom")) ? 39 : 36;
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, java.lang.Integer.valueOf(i17)));
            j45.l.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, "webview", ".ui.tools.WebViewUI", intent, null);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class FeedbackUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public FeedbackUriSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{34};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://feedback/next/")) {
                return new r35.m3(str, 34, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 34) {
                return false;
            }
            java.lang.String replace = m3Var.e().trim().replace("weixin://feedback/next/", "");
            m3Var.e();
            c01.d9.e().g(new k14.f0(wo.w0.l(), replace, 8));
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes8.dex */
    public class FlightNumberSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public FlightNumberSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{50};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (zVar != null) {
                zVar.b(m3Var);
            }
            if (m3Var.f369195d == 50) {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "FlightNumberSpanHandler click %s", m3Var.e());
                java.lang.Object obj = m3Var.f369196e;
                long j17 = (obj == null || !(obj instanceof android.os.Bundle)) ? 0L : ((android.os.Bundle) obj).getLong("msgSvrId");
                sq1.g gVar = (sq1.g) i95.n0.c(sq1.g.class);
                android.content.Context context = com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a;
                java.lang.String e17 = m3Var.e();
                ((rq1.b) gVar).getClass();
                java.lang.String c17 = com.tencent.mm.plugin.websearch.l2.g(2).c();
                com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxUILogic", "startBoxHomeUI type=%d query=%s messageSvrID=%d", 3, e17, java.lang.Long.valueOf(j17));
                r45.sn snVar = new r45.sn();
                snVar.f385851e = java.util.UUID.randomUUID().toString();
                snVar.f385850d = e17;
                snVar.f385853g = 3;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("query", e17);
                hashMap.put("type", java.lang.String.valueOf(3));
                hashMap.put("messageSvrID", java.lang.String.valueOf(j17));
                hashMap.put("lang", com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
                hashMap.put("platform", com.eclipsesource.mmv8.Platform.ANDROID);
                hashMap.put("version", java.lang.String.valueOf(com.tencent.mm.plugin.websearch.l2.a(2)));
                hashMap.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.tencent.mm.plugin.websearch.l2.b());
                hashMap.put("isClientLoading", "1");
                hashMap.put("wechatVersion", com.tencent.mm.sdk.platformtools.z.f193111g);
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
                stringBuffer.append(c17);
                stringBuffer.append("?");
                stringBuffer.append(com.tencent.mm.plugin.websearch.l2.k(hashMap));
                snVar.f385852f = stringBuffer.toString();
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

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes8.dex */
    public class FlowStatUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public FlowStatUriSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{16};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://flowstat")) {
                return new r35.m3(str, 16, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 16) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI != null) {
                launcherUI.f7().o("tab_settings");
            }
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://flowstat")) {
                return false;
            }
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI == null) {
                return true;
            }
            launcherUI.f7().o("tab_settings");
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class FriendMobileUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public FriendMobileUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{20};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://findfriend/mobile")) {
                return new r35.m3(str, 20, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 20) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            android.content.Intent intent = new android.content.Intent(uRISpanHandlerSet.f53590a, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.class);
            android.content.Context context = uRISpanHandlerSet.f53590a;
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

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://findfriend/mobile")) {
                return false;
            }
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            android.content.Intent intent = new android.content.Intent(uRISpanHandlerSet.f53590a, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.class);
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            android.content.Context context = uRISpanHandlerSet.f53590a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$FriendMobileUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$FriendMobileUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class FriendSearchUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public FriendSearchUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{17};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://findfriend/search")) {
                return new r35.m3(str, 17, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 17) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            j45.l.h(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, "subapp", ".ui.pluginapp.ContactSearchUI");
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://findfriend/search")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(uRISpanHandlerSet.f53590a, "subapp", ".ui.pluginapp.ContactSearchUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class FriendShareUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public FriendShareUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{18};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://findfriend/share")) {
                return new r35.m3(str, 18, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 18) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            j45.l.h(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, "setting", ".ui.qrcode.ShareMicroMsgChoiceUI");
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://findfriend/share")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(uRISpanHandlerSet.f53590a, "setting", ".ui.qrcode.ShareMicroMsgChoiceUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class HoneyPayLinkSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public HoneyPayLinkSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{46, 47};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("native://wcpay/honeypay")) {
                return new r35.m3(str, 46, null);
            }
            if (str.trim().startsWith("weixin://wcpay/bankCardList")) {
                return new r35.m3(str, 47, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            int i17 = m3Var.f369195d;
            if (i17 == 46) {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "go to honey pay proxy");
                java.lang.Object obj = m3Var.f369196e;
                if (obj != null && (obj instanceof android.os.Bundle)) {
                    android.net.Uri parse = android.net.Uri.parse(m3Var.e());
                    java.lang.String queryParameter = parse.getQueryParameter("cardNo");
                    boolean equals = parse.getQueryParameter("isPayer").equals("1");
                    java.lang.String queryParameter2 = parse.getQueryParameter("paymsgid");
                    java.lang.String queryParameter3 = parse.getQueryParameter("routeInfo");
                    boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(queryParameter3);
                    com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
                    if (!K0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "has routeInfo in sysmsg url, try handle");
                        com.tencent.mm.ui.chatting.viewitems.p4.g(queryParameter3, "", "", uRISpanHandlerSet.f53590a);
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter2)) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_card_no", queryParameter);
                        intent.putExtra("key_is_payer", equals);
                        j45.l.j(uRISpanHandlerSet.f53590a, "honey_pay", ".ui.HoneyPayProxyUI", intent, null);
                    } else {
                        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                        u73.b bVar = new u73.b();
                        bVar.field_payMsgId = queryParameter2;
                        ((u73.c) ((q73.f) i95.n0.c(q73.f.class)).f360381d.a()).get(bVar, new java.lang.String[0]);
                        long j17 = bVar.field_msgId;
                        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleSpanClick: %s,find msg: %s", m3Var.e(), java.lang.Long.valueOf(j17));
                        if (j17 > 0) {
                            com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
                            com.tencent.mm.storage.f9 Li = pt0.f0.Li(f9Var != null ? f9Var.Q0() : "", j17);
                            if (Li.getMsgId() <= 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "cannot find msg in msg storage!");
                                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i0_));
                                u1Var.k(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo));
                                u1Var.m(com.tencent.mm.R.string.f492294fz1);
                                u1Var.l(new com.tencent.mm.app.plugin.z(this));
                                u1Var.q(false);
                            } else {
                                com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent scrollChattingUIConversationListEvent = new com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent();
                                am.gt gtVar = scrollChattingUIConversationListEvent.f54743g;
                                gtVar.f6789b = j17;
                                gtVar.f6788a = Li.Q0();
                                gtVar.f6790c = Li.Q0();
                                scrollChattingUIConversationListEvent.e();
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_HONEY_PAY_CARD_MANAGER, cannot find local msg");
                            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                            u1Var2.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i0_));
                            u1Var2.k(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo));
                            u1Var2.m(com.tencent.mm.R.string.f492294fz1);
                            u1Var2.l(new com.tencent.mm.app.plugin.a0(this));
                            u1Var2.q(false);
                        }
                    }
                }
            } else if (i17 == 47) {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "go to bank card list");
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "isKindaBankCardManagerEnable");
                ((h45.q) i95.n0.c(h45.q.class)).startUseCase("bankCard", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.app.plugin.b0(this));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 0, 0, 0, 0, 1);
            }
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class HttpUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f53610a = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/mp/newsubscribemsg?action=subscribepage";

        public HttpUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{1};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
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
        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean d(android.view.View r23, r35.m3 r24, com.tencent.mm.pluginsdk.ui.span.z r25) {
            /*
                Method dump skipped, instructions count: 856
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.plugin.URISpanHandlerSet.HttpUriSpanHandler.d(android.view.View, r35.m3, com.tencent.mm.pluginsdk.ui.span.z):boolean");
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class JumpActivityUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public JumpActivityUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.toLowerCase().startsWith("weixin://jump/")) {
                return false;
            }
            java.lang.String[] split = str.split("/");
            java.lang.String str2 = split[split.length - 1];
            boolean equalsIgnoreCase = "mainframe".equalsIgnoreCase(str2);
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (equalsIgnoreCase) {
                android.content.Intent intent = new android.content.Intent(uRISpanHandlerSet.f53590a, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
                if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                    intent.addFlags(268435456);
                }
                intent.addFlags(67108864);
                android.content.Context context = uRISpanHandlerSet.f53590a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpActivityUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpActivityUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if ("shake".equalsIgnoreCase(str2)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10221, "1");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.addFlags(67108864);
                if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                    intent2.addFlags(268435456);
                }
                ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(uRISpanHandlerSet.f53590a, intent2, true);
                android.content.Context context2 = uRISpanHandlerSet.f53590a;
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
                if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                    intent3.addFlags(268435456);
                }
                j45.l.j(uRISpanHandlerSet.f53590a, "scanner", ".ui.BaseScanUI", intent3, null);
            }
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class JumpPatSettingDialogUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public JumpPatSettingDialogUriSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{61};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://jump/setpat_bottom_sheet/")) {
                return new r35.m3(str, 61, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 61) {
                return false;
            }
            ((r45.n55) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(view.getContext(), 4, r45.n55.class)).f381091d = 1;
            pp3.u uVar = new pp3.u(view.getContext());
            uVar.show();
            uVar.getWindow().setLayout(-1, -1);
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class JumpPatSettingUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public JumpPatSettingUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{57};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://jump/setpat/")) {
                return new r35.m3(str, 57, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d == 57) {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleClickJumpToPatSetting");
                android.content.Intent intent = new android.content.Intent();
                boolean wi6 = ((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi();
                com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
                if (wi6) {
                    intent.setClass(uRISpanHandlerSet.f53590a, com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI.class);
                } else {
                    intent.setClass(uRISpanHandlerSet.f53590a, com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI.class);
                }
                intent.putExtra("jumptoPat", true);
                com.tencent.mm.ui.vas.VASActivity.Companion.getClass();
                intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_START_MODE, 0);
                android.content.Context context = uRISpanHandlerSet.f53590a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpPatSettingUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpPatSettingUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.app.plugin.c0(this), 2000L);
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class LqtDetailSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public LqtDetailSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{69};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://wcpay/lqt/lqtTransferInKnowDetail")) {
                return new r35.m3(str, 69, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d == 69) {
                java.lang.String queryParameter = android.net.Uri.parse(m3Var.e()).getQueryParameter("url");
                if (queryParameter.length() > 0) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", queryParameter);
                    intent.putExtra("showShare", true);
                    intent.putExtra("allow_mix_content_mode", false);
                    j45.l.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, "webview", ".ui.tools.WebViewUI", intent, null);
                    return true;
                }
            }
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0(priority = com.tencent.mm.app.plugin.URISpanHandlerSet.PRIORITY.HIGH)
    /* loaded from: classes4.dex */
    public class LuckyMoneyUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public LuckyMoneyUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{33, 59};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://weixinhongbao/") || str.trim().toLowerCase().startsWith("frhb://c2cbizmessagehandler/hongbao/receivehongbao")) {
                return new r35.m3(str, 33, null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://weixinunionhongbao/")) {
                return new r35.m3(str, 59, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            int i17 = m3Var.f369195d;
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (i17 != 33) {
                if (i17 != 59) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "hrefInfo.getType() == MMSpanConstants.Type.TYPE_LUCKY_MONEY_UNION");
                if (zVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null");
                    return false;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_native_url", m3Var.e());
                intent.putExtra("key_username", (java.lang.String) zVar.b(m3Var));
                intent.putExtra("key_lucky_money_can_received", true);
                intent.putExtra("key_jump_from", 4);
                intent.putExtra("scene_id", 1005);
                j45.l.j(uRISpanHandlerSet.f53590a, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent, null);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(12097, 11, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                g0Var.d(11850, 4, 1);
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "hrefInfo.getType() == MMSpanConstants.Type.TYPE_LUCKY_MONEY_NORMAL");
            if (zVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null");
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
                j45.l.j(uRISpanHandlerSet.f53590a, "luckymoney", ".hk.ui.LuckyMoneyHKBeforeDetailUI", intent2, null);
            } else {
                j45.l.j(uRISpanHandlerSet.f53590a, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent2, null);
            }
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.d(12097, 11, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var2.d(11850, 4, 1);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class OfflineFQFSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public OfflineFQFSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{51};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://wcpay/fqf/opentinyapp")) {
                return new r35.m3(str, 51, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d == 51) {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "go to offline fqf");
                java.lang.Object obj = m3Var.f369196e;
                if (obj != null && (obj instanceof android.os.Bundle)) {
                    android.os.Bundle bundle = (android.os.Bundle) obj;
                    java.lang.String string = bundle.getString("repayment_tiny_app_username");
                    java.lang.String string2 = bundle.getString("repayment_tiny_app_path");
                    com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                    am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                    nxVar.f7466a = string;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (string2 == null) {
                        string2 = "";
                    }
                    nxVar.f7467b = string2;
                    nxVar.f7468c = 0;
                    startAppBrandUIFromOuterEvent.e();
                }
                if (zVar != null) {
                    zVar.a(m3Var);
                }
            }
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class OpenFinderLiveLotteryDetailSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public OpenFinderLiveLotteryDetailSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
            if (f9Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "MsgInfo is null");
                return false;
            }
            if (!com.tencent.mm.storage.z3.V3(f9Var.Q0())) {
                com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "MsgInfo.talker:" + f9Var.Q0() + " is not finder session");
                return false;
            }
            if (f9Var.G.contains("<live>")) {
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "MsgInfo.source:" + f9Var.G + " is not live");
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{68};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://finderlive/lotteryDetail")) {
                return new r35.m3(str, 68, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            java.lang.Object obj;
            if (m3Var.f369195d == 68 && (obj = m3Var.f369196e) != null && (obj instanceof android.os.Bundle)) {
                android.os.Bundle bundle = (android.os.Bundle) obj;
                int i17 = bundle.getInt("KEY_FINDER_LIVE_JUMP_TYPE");
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "[OpenFinderLiveLotteryDetailSpanHandler], type:" + i17);
                if (i17 != 2) {
                    r45.uq4 uq4Var = new r45.uq4();
                    try {
                        uq4Var.parseFrom(bundle.getByteArray("KEY_FINDER_LIVE_JUMP_DATA"));
                        java.lang.String str = uq4Var.f387572d;
                        java.lang.String str2 = uq4Var.f387574f;
                        java.lang.String str3 = uq4Var.f387573e;
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("FROM_SCENE", 1);
                        intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", pm0.v.Z(str2));
                        intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", pm0.v.Z(str3));
                        intent.putExtra("KEY_LOTTERY_HISTORY_SOURCE", 1);
                        intent.putExtra("KEY_LOTTERY_ID", str);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        java.lang.String h17 = com.tencent.mm.plugin.finder.service.m4.f126148a.h(m3Var.f369206o.y0());
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                            intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", h17);
                        }
                        if (uq4Var.f387575g) {
                            try {
                                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                cl0.g gVar = new cl0.g();
                                gVar.o("user_type", 2);
                                g0Var.d(20849, 6, 2, str, "", gVar.toString().replace(",", ";"));
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "[setContent] e.msg:" + e17.getMessage());
                            }
                            intent.putExtra("FINDER_NICKNAME", uq4Var.f387576h);
                            intent.putExtra("KEY_SCENE", 2);
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            android.app.Activity context = (android.app.Activity) view.getContext();
                            kotlin.jvm.internal.o.g(context, "context");
                            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Nj(context, intent);
                        } else {
                            try {
                                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                cl0.g gVar2 = new cl0.g();
                                gVar2.o("user_type", 1);
                                g0Var2.d(20849, 6, 2, str, "", gVar2.toString().replace(",", ";"));
                            } catch (java.lang.Exception e18) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "[setContent] e.msg:" + e18.getMessage());
                            }
                            intent.putExtra("KEY_SCENE", 1);
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            android.app.Activity context2 = (android.app.Activity) view.getContext();
                            kotlin.jvm.internal.o.g(context2, "context");
                            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Pj(context2, intent);
                        }
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "[OpenFinderLiveLotteryDetailSpanHandler],e:" + e19.getMessage());
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "[OpenFinderLiveLotteryDetailSpanHandler],e:" + e19.getMessage());
                } else {
                    r45.tq4 tq4Var = new r45.tq4();
                    try {
                        tq4Var.parseFrom(bundle.getByteArray("KEY_FINDER_LIVE_JUMP_DATA"));
                        java.lang.String giftId = tq4Var.f386704e;
                        long j17 = tq4Var.f386703d;
                        m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
                        android.content.Context context3 = view.getContext();
                        ((b92.y0) i0Var).getClass();
                        kotlin.jvm.internal.o.g(context3, "context");
                        kotlin.jvm.internal.o.g(giftId, "giftId");
                        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new b92.x0(context3, j17, giftId, null), 3, null);
                    } catch (java.lang.Exception e27) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "[OpenFinderLiveLotteryGiftDetailSpanHandler],e:" + e27.getMessage());
                    }
                }
            }
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class OpenIMKefuMsgMenuUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public OpenIMKefuMsgMenuUriSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return com.tencent.mm.storage.z3.p4(m3Var.f369197f);
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{62};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://kefumenu")) {
                return new r35.m3(str, 62, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (62 != m3Var.f369195d) {
                return false;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(m3Var.f369197f)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler Username is null.");
                return true;
            }
            if (!com.tencent.mm.storage.z3.p4(m3Var.f369197f)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "OpenIMKefuMsgMenuUriSpanHandler Username not openim kefu: %s", m3Var.f369197f);
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
            if (com.tencent.mm.sdk.platformtools.t8.K0(trim) || com.tencent.mm.sdk.platformtools.t8.K0(queryParameter2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "OpenIMKefuMsgMenuUriSpanHandler id or msgContent is null.");
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("kefumenuid", trim);
            if (w11.t1.a(m3Var.f369197f)) {
                w11.r1 a17 = w11.s1.a(m3Var.f369197f);
                a17.g(m3Var.f369197f);
                a17.e(queryParameter2);
                a17.h(c01.e2.C(m3Var.f369197f));
                a17.f442131f = 1;
                a17.f442133h = hashMap;
                a17.b();
            } else {
                w11.r1 a18 = w11.s1.a(m3Var.f369197f);
                a18.g(m3Var.f369197f);
                a18.e(queryParameter2);
                a18.h(c01.e2.C(m3Var.f369197f));
                a18.f442131f = 1;
                a18.f442133h = hashMap;
                a18.f442134i = 5;
                a18.a().a();
            }
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class OpenIMKefuRequestLocationAcceptSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public OpenIMKefuRequestLocationAcceptSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{66};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://wwkf/systemmsg/location_request/")) {
                return new r35.m3(str, 66, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            java.lang.Object obj;
            if (m3Var.f369195d != 66 || (obj = m3Var.f369196e) == null || !(obj instanceof android.os.Bundle)) {
                return false;
            }
            w41.u.f442888a.b(view.getContext(), ((android.os.Bundle) obj).getString("chatroom_name"));
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public enum PRIORITY {
        LOW,
        NORMAL,
        HIGH
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class PayTransferUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public PayTransferUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [nr4.a] */
        /* JADX WARN: Type inference failed for: r8v5, types: [nr4.a] */
        /* JADX WARN: Type inference failed for: r8v6 */
        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            ?? r86;
            if (str.startsWith("wxpay://")) {
                if (o2Var != null) {
                    com.tencent.mm.ui.chatting.component.e eVar = (com.tencent.mm.ui.chatting.component.e) o2Var;
                    java.lang.String obj = eVar.f198952a.f198580d.u().d1().toString();
                    ?? r87 = eVar.f198952a.f198995e;
                    r86 = r87 instanceof nr4.a ? r87 : null;
                    r7 = obj;
                } else {
                    r86 = 0;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(r7)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "SERVICE_JUMP_TO_PAY fail, null username");
                    return false;
                }
                java.lang.String substring = str.substring(8);
                if (substring.indexOf("&") > 0) {
                    substring = substring.split("&")[0];
                }
                int indexOf = substring.indexOf("=");
                int P = com.tencent.mm.sdk.platformtools.t8.P(indexOf >= 0 ? substring.substring(indexOf + 1) : "", 0);
                com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
                if (P == 1) {
                    if (c01.z1.z() || c01.z1.A()) {
                        if (com.tencent.mm.storage.z3.R4(r7)) {
                            og0.o oVar = (og0.o) i95.n0.c(og0.o.class);
                            android.content.Context context = uRISpanHandlerSet.f53590a;
                            ((ng0.q) oVar).getClass();
                            h45.a0.i(context, 5, r7, 14, r86);
                        } else {
                            og0.o oVar2 = (og0.o) i95.n0.c(og0.o.class);
                            android.content.Context context2 = uRISpanHandlerSet.f53590a;
                            ((ng0.q) oVar2).getClass();
                            h45.a0.i(context2, 5, r7, 11, r86);
                        }
                    } else if (com.tencent.mm.storage.z3.R4(r7)) {
                        og0.o oVar3 = (og0.o) i95.n0.c(og0.o.class);
                        android.content.Context context3 = uRISpanHandlerSet.f53590a;
                        ((ng0.q) oVar3).getClass();
                        h45.a0.i(context3, 2, r7, 14, r86);
                    } else {
                        og0.o oVar4 = (og0.o) i95.n0.c(og0.o.class);
                        android.content.Context context4 = uRISpanHandlerSet.f53590a;
                        ((ng0.q) oVar4).getClass();
                        h45.a0.i(context4, 2, r7, 11, r86);
                    }
                    return true;
                }
                android.content.Context context5 = uRISpanHandlerSet.f53590a;
                dp.a.makeText(context5, context5.getString(com.tencent.mm.R.string.iis), 0).show();
            }
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class PayUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public PayUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{28};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 28) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = new com.tencent.mm.autogen.events.GetA8KeyRedirectEvent();
            am.df dfVar = getA8KeyRedirectEvent.f54376g;
            dfVar.f6446a = 11;
            dfVar.f6447b = m3Var.e();
            dfVar.f6448c = new java.lang.ref.WeakReference(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a);
            dfVar.f6449d = new android.os.Bundle();
            dfVar.f6449d.putInt("pay_channel", 6);
            getA8KeyRedirectEvent.b(android.os.Looper.myLooper());
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class PhoneEmailUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public PhoneEmailUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{25, 24};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            java.lang.String str;
            if (zVar != null) {
                zVar.b(m3Var);
            }
            int i17 = m3Var.f369195d;
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (i17 != 25) {
                if (i17 == 24) {
                    com.tencent.mm.pluginsdk.ui.span.u0.c(uRISpanHandlerSet.f53590a, m3Var.e(), null);
                }
                if (zVar == null) {
                    return false;
                }
                zVar.a(m3Var);
                return false;
            }
            java.lang.String str2 = m3Var.f369197f;
            android.os.Bundle bundle = new android.os.Bundle();
            if (str2 != null && !str2.equals(c01.z1.r())) {
                bundle.putString("Contact_User", str2);
                r61.a h17 = m61.k.wi().h(str2);
                if (h17 == null || com.tencent.mm.sdk.platformtools.t8.K0(h17.e())) {
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
            com.tencent.mm.pluginsdk.ui.span.u0.d(uRISpanHandlerSet.f53590a, m3Var.e(), null, bundle);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class PluginUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public PluginUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{26};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://plugin")) {
                return new r35.m3(str, 26, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://plugin")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(uRISpanHandlerSet.f53590a, "setting", ".ui.setting.SettingsPluginsUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class ProfileUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public ProfileUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{3};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://contacts/profile/")) {
                return new r35.m3(str, 3, str.trim().replace("weixin://contacts/profile/", "").replace("/", ""));
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 3) {
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
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                com.tencent.mm.ui.contact.g1.c(intent, str);
            }
            if ((str != null ? str : "").length() > 0) {
                j45.l.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            }
            if (zVar != null) {
                zVar.a(m3Var);
            }
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.startsWith("weixin://contacts/profile/")) {
                return false;
            }
            java.lang.String replace = str.trim().replace("weixin://contacts/profile/", "").replace("/", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(replace)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "jumpToActivity fail, user is null");
                return true;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.putExtra("Contact_User", replace);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(replace, true);
            if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                com.tencent.mm.ui.contact.g1.c(intent, replace);
            }
            j45.l.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class ScanQrCodeUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public ScanQrCodeUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            boolean z18 = false;
            if (!str.equals("weixin://scanqrcode/")) {
                return false;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "jumpToActivity, scan qrcode permission fail");
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
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            intent.putExtra("key_scan_report_enter_scene", 24);
            j45.l.j(uRISpanHandlerSet.f53590a, "scanner", ".ui.BaseScanUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class SetSafeDeviceUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public SetSafeDeviceUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[0];
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/account/safedevice")) {
                return false;
            }
            java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(6, "");
            java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(4097, "");
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (!K0) {
                android.content.Intent intent = new android.content.Intent();
                if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                    intent.addFlags(268435456);
                }
                j45.l.h(uRISpanHandlerSet.f53590a, "account", ".security.ui.MySafeDeviceListUI");
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                android.content.Intent intent2 = new android.content.Intent();
                if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                    intent2.addFlags(268435456);
                }
                j45.l.B(uRISpanHandlerSet.f53590a, "account", ".security.ui.BindSafeDeviceUI", intent2);
            } else {
                android.content.Intent intent3 = new android.content.Intent(uRISpanHandlerSet.f53590a, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
                intent3.putExtra("bind_scene", 1);
                if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                    intent3.addFlags(268435456);
                }
                com.tencent.mm.ui.MMWizardActivity.X6(uRISpanHandlerSet.f53590a, intent3);
            }
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes8.dex */
    public class SettingBindEmailUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public SettingBindEmailUriSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{7};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/bindemail")) {
                return new r35.m3(str, 7, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 7) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI != null) {
                launcherUI.f7().o("tab_settings");
            }
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class SettingBlacklistUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public SettingBlacklistUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{14};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/blacklist")) {
                return new r35.m3(str, 14, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 14) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            c01.s7 a17 = c01.t7.a(uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.fsb));
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(uRISpanHandlerSet.f53590a, com.tencent.mm.ui.contact.SelectContactUI.class);
            intent.putExtra("Contact_GroupFilter_Type", a17.a());
            java.lang.String str = a17.f37457b;
            if (str == null) {
                str = "";
            }
            intent.putExtra("Contact_GroupFilter_DisplayName", str);
            intent.addFlags(67108864);
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI != null) {
                launcherUI.f7().o("tab_settings");
            }
            android.content.Context context = uRISpanHandlerSet.f53590a;
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

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/blacklist")) {
                return false;
            }
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            c01.s7 a17 = c01.t7.a(uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.fsb));
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(uRISpanHandlerSet.f53590a, com.tencent.mm.ui.contact.AddressUI.class);
            intent.putExtra("Contact_GroupFilter_Type", a17.a());
            java.lang.String str2 = a17.f37457b;
            if (str2 == null) {
                str2 = "";
            }
            intent.putExtra("Contact_GroupFilter_DisplayName", str2);
            intent.addFlags(67108864);
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI != null) {
                launcherUI.f7().o("tab_settings");
            }
            android.content.Context context = uRISpanHandlerSet.f53590a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$SettingBlacklistUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$SettingBlacklistUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes8.dex */
    public class SettingHeadImgUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public SettingHeadImgUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{6};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/setheadimage")) {
                return new r35.m3(str, 6, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 6) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI != null) {
                launcherUI.f7().o("tab_settings");
            }
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/setheadimage")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", c01.z1.r());
            intent.putExtra("Contact_Nick", c01.z1.l());
            intent.putExtra("User_Avatar", true);
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(uRISpanHandlerSet.f53590a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes8.dex */
    public class SettingNotifyUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public SettingNotifyUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{9};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/notify")) {
                return new r35.m3(str, 9, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 9) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI != null) {
                launcherUI.f7().o("tab_settings");
            }
            j45.l.h(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, "setting", ".ui.setting.SettingsNotificationUI");
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/notify")) {
                return false;
            }
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI != null) {
                launcherUI.f7().o("tab_settings");
            }
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(uRISpanHandlerSet.f53590a, "setting", ".ui.setting.SettingsNotificationUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class SettingPluginLomoUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public SettingPluginLomoUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{12};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/plugin/lomo")) {
                return new r35.m3(str, 12, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 12) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", "weibo");
            j45.l.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/plugin/lomo")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", "weibo");
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(uRISpanHandlerSet.f53590a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class SettingPluginQQMailUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public SettingPluginQQMailUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{10};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/plugin/qqmail")) {
                return new r35.m3(str, 10, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 10) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", "qqmail");
            j45.l.j(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/plugin/qqmail")) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", "qqmail");
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(uRISpanHandlerSet.f53590a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class SettingPluginQQMsgUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public SettingPluginQQMsgUriSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{13};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/plugin/qqmsg")) {
                return new r35.m3(str, 13, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class SettingPluginSxMsgUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public SettingPluginSxMsgUriSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{11};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/plugin/sxmsg")) {
                return new r35.m3(str, 11, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes8.dex */
    public class SettingPrivacyUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public SettingPrivacyUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{15};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://setting/privacy")) {
                return new r35.m3(str, 15, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 15) {
                return false;
            }
            if (zVar != null) {
                zVar.b(m3Var);
            }
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI != null) {
                launcherUI.f7().o("tab_settings");
            }
            j45.l.h(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, "setting", ".ui.setting.SettingsPrivacyUI");
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            if (!str.equals("weixin://setting/privacy")) {
                return false;
            }
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI != null) {
                launcherUI.f7().o("tab_settings");
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(uRISpanHandlerSet.f53590a, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
            return true;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class StoryEntranceHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public StoryEntranceHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{48};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 48 || android.text.TextUtils.isEmpty(m3Var.f369197f)) {
                return false;
            }
            if (zVar == null) {
                return true;
            }
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class TeenModeAgreeAuthorizationSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public TeenModeAgreeAuthorizationSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{64};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://teenagerModeAgreenAuthorization/")) {
                return new r35.m3(str, 64, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 64) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "TeenModeAgreeAuthorizationSpanHandler");
            android.net.Uri.parse(m3Var.e());
            java.lang.String e17 = m3Var.e();
            long V = com.tencent.mm.sdk.platformtools.t8.V(e17.substring(e17.trim().lastIndexOf("/") + 1), 0L);
            if (V > 0) {
                com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(m3Var.f369197f, V);
                if (o27.I0() > 0) {
                    int A0 = o27.A0();
                    com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
                    if (A0 == 1) {
                        ((uh4.c0) i95.n0.c(uh4.c0.class)).rh(uRISpanHandlerSet.f53590a, m3Var.f369197f, c01.z1.r(), o27.getCreateTime(), o27.I0(), o27.j(), o27.z0(), java.lang.Boolean.TRUE);
                    } else {
                        ((uh4.c0) i95.n0.c(uh4.c0.class)).rh(uRISpanHandlerSet.f53590a, c01.z1.r(), m3Var.f369197f, o27.getCreateTime(), o27.I0(), o27.j(), o27.z0(), java.lang.Boolean.TRUE);
                    }
                    return true;
                }
            }
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class TodoSystemMsgUrlSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public TodoSystemMsgUrlSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{54};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://roomtoolstodo?")) {
                return new r35.m3(str, 54, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            boolean z17;
            if (m3Var.f369195d != 54) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleClickTodoSystemMsgUrl");
            try {
                android.net.Uri parse = android.net.Uri.parse(m3Var.e());
                java.lang.String str = m3Var.f369200i;
                java.lang.String queryParameter = parse.getQueryParameter("todoid");
                parse.getQueryParameter("related_msgid");
                java.lang.String queryParameter2 = parse.getQueryParameter(dm.i4.COL_USERNAME);
                java.lang.String queryParameter3 = parse.getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(str, queryParameter);
                if (com.tencent.mm.sdk.platformtools.t8.D0("roomannouncement@app.origin", queryParameter2)) {
                    kn.j0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, str, true);
                } else {
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f317012a = queryParameter2;
                    b1Var.f317022f = queryParameter3;
                    b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.e5.CTRL_INDEX;
                    b1Var.f317042t = str;
                    ((nn.j) i95.n0.c(nn.j.class)).wi(b1Var, z07);
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, b1Var);
                }
                boolean e17 = kn.j0.e(z07);
                if (e17) {
                    z17 = kn.j0.j(z07);
                    if (z17) {
                        com.tencent.mm.autogen.events.NotifyGroupTodoEvent notifyGroupTodoEvent = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent();
                        am.ql qlVar = notifyGroupTodoEvent.f54545g;
                        qlVar.f7715a = 3;
                        qlVar.f7716b = z07.field_roomname;
                        qlVar.f7717c = queryParameter;
                        notifyGroupTodoEvent.b(android.os.Looper.getMainLooper());
                    }
                } else {
                    z17 = false;
                }
                kn.k0.a(str, com.tencent.mm.sdk.platformtools.t8.D0("roomannouncement@app.origin", queryParameter2) ? 1 : 0, 2, queryParameter, queryParameter2);
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleClickTodoSystemMsgUrl stoTodo(%s %s %s) update finish(%s)", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(queryParameter2)), java.lang.Boolean.valueOf(e17), java.lang.Boolean.valueOf(z17));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "handle click link error: %s, url: %s", e18.getMessage(), m3Var.e());
            }
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class TopicSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public TopicSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{58};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean d(android.view.View r21, r35.m3 r22, com.tencent.mm.pluginsdk.ui.span.z r23) {
            /*
                Method dump skipped, instructions count: 379
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.plugin.URISpanHandlerSet.TopicSpanHandler.d(android.view.View, r35.m3, com.tencent.mm.pluginsdk.ui.span.z):boolean");
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }

        public final java.lang.String g(int i17, java.lang.String str, int i18) {
            java.lang.String[] split;
            if (i17 == 3 && !android.text.TextUtils.isEmpty(str) && (split = str.split("#")) != null && split.length >= 2) {
                java.lang.String str2 = split[1];
                if ((android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.equals("0", str2)) && i18 != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchReportLogic", "need correct feeId");
                    com.tencent.mm.plugin.sns.storage.SnsInfo i19 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i18);
                    if (i19 != null) {
                        long j17 = i19.field_snsId;
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
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "TopicSpanHandler click %s %s", m3Var.e(), ek6Var);
            long e17 = c01.id.e();
            if (ek6Var != null) {
                i19 = ek6Var.f373585e;
                java.lang.String str3 = ek6Var.f373586f;
                long j17 = ek6Var.f373587g;
                i27 = ek6Var.f373588h;
                str2 = g(i19, str3, ek6Var.f373590m);
                e17 = j17;
            } else {
                i19 = 0;
                str2 = "";
                i27 = 0;
            }
            java.lang.String e18 = m3Var.e();
            com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchContentActionStruct wCTopicSearchContentActionStruct = new com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchContentActionStruct();
            wCTopicSearchContentActionStruct.f62157d = 1L;
            wCTopicSearchContentActionStruct.f62158e = c01.id.e();
            wCTopicSearchContentActionStruct.f62159f = 1L;
            if (!android.text.TextUtils.isEmpty(e18) && e18.startsWith("#")) {
                e18 = e18.substring(1);
            }
            wCTopicSearchContentActionStruct.f62160g = wCTopicSearchContentActionStruct.b("ResultQuery", e18, true);
            wCTopicSearchContentActionStruct.f62161h = i19;
            wCTopicSearchContentActionStruct.f62162i = wCTopicSearchContentActionStruct.b("ShareSceneId", str2, true);
            wCTopicSearchContentActionStruct.f62163j = e17;
            wCTopicSearchContentActionStruct.f62164k = i27;
            wCTopicSearchContentActionStruct.f62165l = wCTopicSearchContentActionStruct.b("SearchSessionId", str, true);
            wCTopicSearchContentActionStruct.f62166m = i17;
            wCTopicSearchContentActionStruct.f62167n = i18;
            wCTopicSearchContentActionStruct.k();
            su4.k3.m(wCTopicSearchContentActionStruct);
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class TransferUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public TransferUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{39, 40, 41, 70, 42, 49, 56, 63, 78};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
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

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            java.lang.String str;
            java.lang.String str2;
            if (m3Var != null) {
                com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
                int i17 = m3Var.f369195d;
                if (i17 == 42) {
                    if (!((h45.q) i95.n0.c(h45.q.class)).startLqtDetailUseCaseInMMProcess(uRISpanHandlerSet.f53590a)) {
                        j45.l.j(uRISpanHandlerSet.f53590a, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", new android.content.Intent(), null);
                    }
                    return true;
                }
                if (i17 == 41) {
                    if (!((h45.q) i95.n0.c(h45.q.class)).startWalletBalanceEntryUseCase(uRISpanHandlerSet.f53590a)) {
                        j45.l.h(uRISpanHandlerSet.f53590a, "wallet", ".balance.ui.WalletBalanceManagerUI");
                    }
                    return true;
                }
                if (i17 == 70 || i17 == 78) {
                    android.net.Uri parse = android.net.Uri.parse(m3Var.e());
                    com.tencent.mm.autogen.events.RemittanceAccountDetailEvent remittanceAccountDetailEvent = new com.tencent.mm.autogen.events.RemittanceAccountDetailEvent();
                    int P = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("jumpinfo_type"), 0);
                    am.pq pqVar = remittanceAccountDetailEvent.f54674g;
                    pqVar.f7648a = P;
                    pqVar.f7649b = parse.getQueryParameter("jumpinfo_url");
                    pqVar.f7650c = parse.getQueryParameter("jumpinfo_username");
                    pqVar.f7651d = parse.getQueryParameter("jumpinfo_pagepath");
                    pqVar.f7652e = parse.getQueryParameter("jumpinfo_appid");
                    pqVar.f7653f = parse.getQueryParameter("jumpinfo_page");
                    remittanceAccountDetailEvent.e();
                    return true;
                }
                if (i17 == 39) {
                    java.lang.Object obj = m3Var.f369196e;
                    if (obj != null && (obj instanceof android.os.Bundle)) {
                        android.os.Bundle bundle = (android.os.Bundle) obj;
                        com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo resendMsgInfo = (com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo) bundle.getParcelable("resend_msg_info");
                        o05.i iVar = (o05.i) i95.n0.c(o05.i.class);
                        android.content.Context context = uRISpanHandlerSet.f53590a;
                        com.tencent.mm.app.plugin.d0 d0Var = new com.tencent.mm.app.plugin.d0(this, bundle);
                        ((kw3.j) iVar).getClass();
                        new com.tencent.mm.plugin.remittance.ui.d0(context).a(resendMsgInfo, d0Var);
                    }
                    return true;
                }
                if (i17 == 40) {
                    java.lang.Object obj2 = m3Var.f369196e;
                    if (obj2 != null && (obj2 instanceof android.os.Bundle)) {
                        android.os.Bundle bundle2 = (android.os.Bundle) obj2;
                        com.tencent.mm.autogen.events.RemittanceRefuseEvent remittanceRefuseEvent = new com.tencent.mm.autogen.events.RemittanceRefuseEvent();
                        java.lang.String string = bundle2.getString(ya.b.TRANSACTION_ID);
                        am.sq sqVar = remittanceRefuseEvent.f54677g;
                        sqVar.f7926a = string;
                        sqVar.f7927b = bundle2.getString("transfer_id");
                        sqVar.f7928c = bundle2.getInt("total_fee");
                        sqVar.f7929d = bundle2.getString("sender_name");
                        remittanceRefuseEvent.e();
                    }
                    return true;
                }
                if (i17 == 49) {
                    android.net.Uri parse2 = android.net.Uri.parse(m3Var.e());
                    java.lang.String queryParameter = parse2.getQueryParameter("transfer_id");
                    java.lang.String queryParameter2 = parse2.getQueryParameter("trans_id");
                    java.lang.Object obj3 = m3Var.f369196e;
                    if (obj3 == null || !(obj3 instanceof android.os.Bundle)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "hrefInfo.getType() == TYPE_TRANSFER_QUERY_MSG senderName == null");
                        str = "";
                        str2 = "";
                    } else {
                        android.os.Bundle bundle3 = (android.os.Bundle) obj3;
                        str = bundle3.getString("sender_name");
                        str2 = bundle3.getString("receiver_name");
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("transfer_id", queryParameter);
                    intent.putExtra(ya.b.TRANSACTION_ID, queryParameter2);
                    intent.putExtra("sender_name", str);
                    intent.putExtra("receiver_name", str2);
                    j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "remittance", ".ui.RemittanceDetailUI", intent, null);
                    return true;
                }
                if (i17 == 56 || i17 == 63) {
                    android.net.Uri parse3 = android.net.Uri.parse(m3Var.e());
                    java.lang.String queryParameter3 = parse3.getQueryParameter("transferid");
                    java.lang.String queryParameter4 = parse3.getQueryParameter("fromusername");
                    java.lang.String queryParameter5 = parse3.getQueryParameter("transfer_msg_type");
                    if (i17 == 56) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "click MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG, transferId: %s，msgType:%s", queryParameter3, queryParameter5);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20467, "transfer_to_change", "click message", "", "", "", "", 3, queryParameter3, queryParameter5);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter3)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG");
                        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                        rw3.c y07 = kw3.p.Ai().Ni().y0(queryParameter3);
                        if (y07 != null) {
                            long j17 = y07.field_locaMsgId;
                            if (j17 > 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG, localMsgId: %s", java.lang.Long.valueOf(j17));
                                if (pt0.f0.Li(y07.field_talker, y07.field_locaMsgId).getMsgId() <= 0) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "cannot find msg in msg storage!");
                                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                    u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i0_));
                                    u1Var.k(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo));
                                    u1Var.m(com.tencent.mm.R.string.f492294fz1);
                                    u1Var.l(new com.tencent.mm.app.plugin.e0(this));
                                    u1Var.q(false);
                                } else {
                                    com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent scrollChattingUIConversationListEvent = new com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent();
                                    long j18 = y07.field_locaMsgId;
                                    am.gt gtVar = scrollChattingUIConversationListEvent.f54743g;
                                    gtVar.f6789b = j18;
                                    gtVar.f6788a = queryParameter4;
                                    gtVar.f6790c = y07.field_talker;
                                    scrollChattingUIConversationListEvent.e();
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG, cannot find local msg");
                        com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        u1Var2.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i0_));
                        u1Var2.k(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo));
                        u1Var2.m(com.tencent.mm.R.string.f492294fz1);
                        u1Var2.l(new com.tencent.mm.app.plugin.f0(this));
                        u1Var2.q(false);
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class UnKnowToUrlSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public UnKnowToUrlSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{2147483646};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 2147483646) {
                return false;
            }
            java.lang.Object obj = m3Var.f369196e;
            if (obj instanceof android.os.Bundle) {
                java.lang.String string = ((android.os.Bundle) obj).getString("rawUrl");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "TYPE_UNKNOW_TO_URL url == null");
                } else {
                    c71.b.c(com.tencent.mm.sdk.platformtools.x2.f193071a, string, 0, true);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "TYPE_UNKNOW_TO_URL hrefInfo.getData() no instanceof Bundle");
            }
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class UpgradeAssociateChatRoomUrlSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public UpgradeAssociateChatRoomUrlSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{53};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("weixin://weixingroupupdate?")) {
                return new r35.m3(str, 53, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            java.lang.String queryParameter;
            if (m3Var.f369195d != 53) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl");
            try {
                queryParameter = android.net.Uri.parse(m3Var.e()).getQueryParameter("roomname");
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.URISpanHandlerSet", "Username is null.");
                return true;
            }
            if (com.tencent.mm.storage.z3.R4(queryParameter)) {
                com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(queryParameter);
                if (z07 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl %s member is null", queryParameter);
                    return true;
                }
                int i17 = 3;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = queryParameter;
                objArr[1] = java.lang.Integer.valueOf(z07.field_chatroomStatus);
                java.lang.String str = z07.field_roomowner;
                if (str == null) {
                    str = "";
                }
                objArr[2] = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl room:%s chatroomStatus:%s owener:%s", objArr);
                boolean z17 = z07.field_memberCount >= c01.v1.q();
                boolean F = c01.e2.F(queryParameter);
                com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
                try {
                    if (F) {
                        if (!z07.L0(c01.z1.r())) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：no owner");
                            android.content.Context context = uRISpanHandlerSet.f53590a;
                            if (context != null) {
                                db5.e1.E(context, context.getString(com.tencent.mm.R.string.b0e), "", uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.f490454vi), false, null);
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：mContext is null");
                            }
                            if (!z17) {
                                i17 = 1;
                            }
                            com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI.T6(queryParameter, 2, 2, i17);
                            return true;
                        }
                    } else if (c01.e2.E(queryParameter) && !z07.L0(c01.z1.r())) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：isAssociateChatRoom ");
                        android.content.Context context2 = uRISpanHandlerSet.f53590a;
                        if (context2 != null) {
                            db5.e1.E(context2, context2.getString(com.tencent.mm.R.string.b0b), "", uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.f490454vi), false, null);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：mContext is null");
                        }
                        return true;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：exceed maxnum");
                        android.content.Context context3 = uRISpanHandlerSet.f53590a;
                        if (context3 != null) {
                            db5.e1.E(context3, context3.getString(com.tencent.mm.R.string.b0c), "", uRISpanHandlerSet.f53590a.getString(com.tencent.mm.R.string.f490454vi), false, null);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：mContext is null");
                        }
                        com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI.T6(queryParameter, 2, 2, 2);
                        return true;
                    }
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().a(25);
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().a(26);
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().a(27);
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI.class);
                    intent.addFlags(268435456);
                    intent.putExtra("RoomInfo_Id", queryParameter);
                    intent.putExtra("upgrade_openim_room_from_scene", 2);
                    android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context4, arrayList.toArray(), "com/tencent/mm/app/plugin/URISpanHandlerSet$UpgradeAssociateChatRoomUrlSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context4.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context4, "com/tencent/mm/app/plugin/URISpanHandlerSet$UpgradeAssociateChatRoomUrlSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandlerSet", "handle click link error: %s, url: %s", e.getMessage(), m3Var.e());
                    return true;
                }
            }
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class VerifyContactUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public VerifyContactUriSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
            return f9Var != null && f9Var.j2();
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{4};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://findfriend/verifycontact")) {
                return new r35.m3(str, 4, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 4) {
                return false;
            }
            if (zVar == null) {
                return true;
            }
            zVar.b(m3Var);
            zVar.a(m3Var);
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes8.dex */
    public class VoipCallAgainUrilSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public VoipCallAgainUrilSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{38};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://voip/callagain/")) {
                return new r35.m3(str, 38, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 38) {
                return false;
            }
            android.net.Uri parse = android.net.Uri.parse(m3Var.e());
            java.lang.String queryParameter = parse.getQueryParameter(dm.i4.COL_USERNAME);
            java.lang.String queryParameter2 = parse.getQueryParameter("isvideocall");
            com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
            am.y00 y00Var = voipEvent.f54945g;
            y00Var.f8415b = 5;
            y00Var.f8418e = queryParameter;
            y00Var.f8417d = com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a;
            com.tencent.mm.autogen.mmdata.rpt.VoipExceptionReportStruct voipExceptionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoipExceptionReportStruct();
            voipExceptionReportStruct.f61759e = 1L;
            voipExceptionReportStruct.k();
            if (queryParameter == null || queryParameter.equals("") || !queryParameter.equals(m3Var.f369197f)) {
                return false;
            }
            if (queryParameter2 == null || !queryParameter2.equals("true")) {
                y00Var.f8419f = 4;
            } else {
                y00Var.f8419f = 2;
            }
            voipEvent.e();
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class VoipDetailUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public VoipDetailUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{72};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://jump/voipdetail")) {
                return new r35.m3(str, 72, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            com.tencent.mm.storage.f9 f9Var;
            if (m3Var.f369195d != 72 || ((f9Var = m3Var.f369206o) != null && !f9Var.j2())) {
                return false;
            }
            java.lang.String queryParameter = android.net.Uri.parse(m3Var.e()).getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("userInfos", queryParameter);
            com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = com.tencent.mm.app.plugin.URISpanHandlerSet.this;
            if (uRISpanHandlerSet.f53590a instanceof android.app.Service) {
                intent.addFlags(268435456);
            }
            j45.l.j(uRISpanHandlerSet.f53590a, "account", "com.tencent.mm.voipmp.support.VoipDetailActivity", intent, null);
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes8.dex */
    public class WeTypeSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public WeTypeSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{71};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().startsWith("weixin://wetype/")) {
                return new r35.m3(str, 71, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            if (m3Var.f369195d != 71) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "WeTypeSpanHandler");
            try {
                cl0.g gVar = new cl0.g("{\"wetype\":{\"scene\":2}}");
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "query:%s", gVar.toString());
                ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).bj(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, gVar.toString());
            } catch (cl0.f e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.URISpanHandlerSet", e17, "", new java.lang.Object[0]);
            }
            com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct voiceToTextChatInterfaceStruct = new com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct();
            voiceToTextChatInterfaceStruct.f61699d = 3L;
            voiceToTextChatInterfaceStruct.k();
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes4.dex */
    public class WeWorkUrlSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f53637a = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyv) + "/wework_admin/commdownload";

        public WeWorkUrlSpanHandler(com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet) {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{52};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("wxwork://jump?")) {
                return new r35.m3(str, 52, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            java.lang.String str;
            if (m3Var.f369195d == 52) {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(android.net.Uri.parse(m3Var.e()));
                intent.setPackage("com.tencent.wework");
                intent.setFlags(268435456);
                try {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    android.content.pm.PackageManager packageManager = context.getPackageManager();
                    try {
                        str = packageManager.getApplicationInfo("com.tencent.wework", 0).loadLabel(packageManager).toString();
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        str = null;
                    }
                    ((kt.c) i0Var).getClass();
                    boolean v17 = com.tencent.mm.pluginsdk.model.app.w.v(context, intent, str, null, null);
                    if (!v17) {
                        c71.b.c(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f53637a, 0, true);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "WeWorkUrlSpanHandler result:%s", java.lang.Boolean.valueOf(v17));
                    return true;
                } catch (java.lang.Exception unused2) {
                }
            }
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    @com.tencent.mm.app.plugin.g0
    /* loaded from: classes9.dex */
    public class WxaShortLinkUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
        public WxaShortLinkUriSpanHandler() {
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean a(android.view.View view, r35.m3 m3Var) {
            return true;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public int[] b() {
            return new int[]{60};
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            if (str.trim().toLowerCase().startsWith("mp://")) {
                return new r35.m3(str, 60, null);
            }
            return null;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.tencent.mm.pluginsdk.ui.span.z zVar) {
            java.lang.String str;
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] handleSpanClick ");
            java.lang.Object obj = m3Var.f369196e;
            if (!(obj instanceof android.os.Bundle)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] HrefInfo has not data");
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                return false;
            }
            android.os.Bundle bundle = (android.os.Bundle) obj;
            java.lang.String str3 = "";
            java.lang.String string = bundle.getString("key_wxa_short_link_launch_scene", "");
            int i17 = bundle.getInt("key_wxa_short_link_launch_chat_type", -1);
            if (string.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] scene is null ");
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                return false;
            }
            com.tencent.mm.pluginsdk.ui.span.l1 valueOf = com.tencent.mm.pluginsdk.ui.span.l1.valueOf(string);
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] sceneName=%s  scene=%d  preScene=%d", string, java.lang.Integer.valueOf(valueOf.f191264d), java.lang.Integer.valueOf(valueOf.f191265e));
            l81.r0 r0Var = (l81.r0) i95.n0.c(l81.r0.class);
            android.content.Context context = com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a;
            java.lang.String e17 = m3Var.e();
            if (com.tencent.mm.sdk.platformtools.t8.K0(m3Var.d())) {
                java.lang.String str5 = m3Var.f369198g;
                if (str5 != null) {
                    str = str5;
                } else {
                    java.lang.String str6 = m3Var.f369197f;
                    if (str6 != null) {
                        str = str6;
                    }
                }
                ((kj1.a0) r0Var).wi(context, e17, str, valueOf, i17);
                return false;
            }
            str3 = m3Var.d();
            str = str3;
            ((kj1.a0) r0Var).wi(context, e17, str, valueOf, i17);
            return false;
        }

        @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    }

    public URISpanHandlerSet(android.content.Context context) {
        this.f53590a = null;
        this.f53590a = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : null;
    }
}
