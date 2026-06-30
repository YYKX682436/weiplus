package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes8.dex */
public class t2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.u2 f81132d;

    public t2(com.tencent.mm.plugin.appbrand.jsapi.file.u2 u2Var) {
        this.f81132d = u2Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        com.tencent.mm.ui.MMActivity activityContext;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.ui.MMActivity activityContext2;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.tencent.mm.ui.MMActivity activityContext3;
        java.lang.String str9;
        java.lang.String str10;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.appbrand.jsapi.file.u2 u2Var = this.f81132d;
        if (itemId == 0) {
            str = u2Var.f81133a.f81028g;
            by5.s0.j(str);
            uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
            com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a aVar = u2Var.f81133a;
            activityContext = aVar.getActivityContext();
            str2 = aVar.f81026e;
            str3 = aVar.f81027f;
            str4 = aVar.f81028g;
            ((th0.u) rVar).getClass();
            com.tencent.mm.xwebutil.i.f(activityContext, str2, str3, str4, 0L, "", false);
            return;
        }
        if (itemId == 1) {
            str5 = u2Var.f81133a.f81028g;
            by5.s0.i(str5);
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a aVar2 = u2Var.f81133a;
            activityContext2 = aVar2.getActivityContext();
            str6 = aVar2.f81026e;
            str7 = aVar2.f81027f;
            str8 = aVar2.f81028g;
            ((ht.a) vVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.f.m(activityContext2, str6, str7, str8, 8);
            return;
        }
        if (itemId == 2) {
            if (u2Var.f81133a.getAppBrandTaskProxyUI() != null) {
                com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a aVar3 = u2Var.f81133a;
                if (aVar3.getAppBrandTaskProxyUI().f78369q != null) {
                    aVar3.getAppBrandTaskProxyUI().f78369q.B(false);
                    return;
                }
                return;
            }
            return;
        }
        if (itemId == 3) {
            if (u2Var.f81133a.getAppBrandTaskProxyUI() != null) {
                com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a aVar4 = u2Var.f81133a;
                if (aVar4.getAppBrandTaskProxyUI().f78369q != null) {
                    aVar4.getAppBrandTaskProxyUI().f78369q.B(true);
                    return;
                }
                return;
            }
            return;
        }
        if (itemId == 4) {
            u2Var.f81133a.F();
            return;
        }
        if (itemId != 5) {
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        activityContext3 = u2Var.f81133a.getActivityContext();
        com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a aVar5 = u2Var.f81133a;
        str9 = aVar5.f81026e;
        str10 = aVar5.f81027f;
        com.tencent.mm.plugin.appbrand.jsapi.file.s2 s2Var = new com.tencent.mm.plugin.appbrand.jsapi.file.s2(this);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.e(activityContext3, str9, str10, s2Var);
    }
}
