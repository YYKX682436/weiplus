package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class q7 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.SportHistoryUI f99634a;

    public q7(com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI) {
        this.f99634a = sportHistoryUI;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f293125i;
                com.tencent.mm.plugin.exdevice.ui.f7 f7Var = obj instanceof com.tencent.mm.plugin.exdevice.ui.f7 ? (com.tencent.mm.plugin.exdevice.ui.f7) obj : null;
                if (f7Var != null) {
                    com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI = this.f99634a;
                    r45.ab0 ab0Var = f7Var.f99459e;
                    java.util.Iterator it6 = com.tencent.mm.plugin.exdevice.ui.SportHistoryUI.U6(sportHistoryUI, ab0Var).iterator();
                    while (it6.hasNext()) {
                        for (r45.ed6 sportRecord : (java.util.LinkedList) it6.next()) {
                            androidx.appcompat.app.AppCompatActivity context = sportHistoryUI.getContext();
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            z32.e0 e0Var = (z32.e0) pf5.z.f353948a.a(context).a(z32.e0.class);
                            java.lang.String userName = sportHistoryUI.f99391g;
                            int i17 = ab0Var.f369880d;
                            e0Var.getClass();
                            kotlin.jvm.internal.o.g(userName, "userName");
                            kotlin.jvm.internal.o.g(sportRecord, "sportRecord");
                            androidx.appcompat.app.AppCompatActivity activity = e0Var.getActivity();
                            kotlin.jvm.internal.o.g(activity, "activity");
                            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(te5.y1.class);
                            kotlin.jvm.internal.o.f(a17, "get(...)");
                            te5.y1 y1Var = (te5.y1) a17;
                            java.lang.String str2 = sportRecord.f373328e;
                            java.lang.String str3 = str2 == null || str2.length() == 0 ? i17 + "appId:" + sportRecord.f373327d : i17 + "appName:" + sportRecord.f373328e;
                            if (!y1Var.P6().contains(str3)) {
                                int i18 = sportRecord.f373335o;
                                a42.c cVar = a42.c.f1200a;
                                if (i18 != 0) {
                                    str = str3;
                                    if (i18 == 1) {
                                        try {
                                            int i19 = !com.tencent.mm.sdk.platformtools.t8.K0(new org.json.JSONObject(sportRecord.f373333m).optString("finder_username")) ? 1 : 2;
                                            java.lang.String appName = sportRecord.f373328e;
                                            kotlin.jvm.internal.o.f(appName, "appName");
                                            cVar.a(3, 2, appName, i19, 2, userName);
                                        } catch (org.json.JSONException e17) {
                                            com.tencent.mars.xlog.Log.printErrStackTrace("SportScrollReportUIC", e17, "SportScrollReportUIC", new java.lang.Object[0]);
                                        }
                                    }
                                } else if (kotlin.jvm.internal.o.b("21f9d636b41b25be", sportRecord.f373327d)) {
                                    str = str3;
                                    cVar.a(3, 1, e0Var.getString(com.tencent.mm.R.string.jjh), 2, 2, userName);
                                } else {
                                    str = str3;
                                    ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ni(sportRecord.f373327d, new z32.b0(i17, 3, userName, sportRecord));
                                }
                                y1Var.P6().add(str);
                            }
                        }
                    }
                }
            }
        }
    }
}
