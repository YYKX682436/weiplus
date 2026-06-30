package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public final class yg implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.zg f294122d;

    public yg(com.p314xaae8f345.mm.ui.zg zgVar) {
        this.f294122d = zgVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c3 c3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c3) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("value is ");
        sb6.append(c3Var);
        sb6.append(" and ");
        sb6.append(c3Var != null ? java.lang.Long.valueOf(c3Var.f231436c) : null);
        sb6.append(" and ");
        sb6.append(c3Var != null ? c3Var.f231435b : null);
        sb6.append(" and ");
        sb6.append(c3Var != null ? c3Var.f231434a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProfileReadyPluginUI", sb6.toString());
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().z();
        com.p314xaae8f345.mm.ui.zg zgVar = this.f294122d;
        if (!z17) {
            android.content.Context context = zgVar.f294154a;
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibg);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            zgVar.f294164k = e4Var.c();
            return;
        }
        if (c3Var == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = zgVar.f294165l;
            if (u3Var != null) {
                u3Var.dismiss();
                return;
            }
            return;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3Var.f231434a, com.p314xaae8f345.mm.vfs.w6.p(zgVar.f294155b));
        java.lang.String str = zgVar.f294155b;
        android.content.Context context2 = zgVar.f294154a;
        if (!b17) {
            sj3.n3 n3Var = sj3.o3.f490199e;
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getFileMD5String(...)");
            n3Var.b(p17, null);
            zgVar.f294165l = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572431b73), false, 3, null);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3Var.f231435b, java.lang.Boolean.TRUE) || (java.lang.System.currentTimeMillis() - c3Var.f231436c >= 3000 && c3Var.f231435b == null)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = zgVar.f294164k;
            if (f4Var != null) {
                f4Var.cancel();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = zgVar.f294165l;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            p012xc85e97e9.p093xedfae76a.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231716x1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j0Var.m7809x1ff8439((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2);
            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.class);
            intent.setFlags(603979776);
            intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str);
            intent.putExtra("fileExt", zgVar.f294156c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markStartProjectDuringProfileUI");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1538L, 3L, 1L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "goToScreenCastShow", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "goToScreenCastShow", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3Var.f231435b, java.lang.Boolean.FALSE)) {
            if (java.lang.System.currentTimeMillis() - c3Var.f231436c < 3000) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var2 = zgVar.f294164k;
                if (f4Var2 != null) {
                    f4Var2.cancel();
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = zgVar.f294165l;
                if (u3Var3 != null) {
                    u3Var3.dismiss();
                }
                zgVar.f294165l = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572431b73), false, 3, null);
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var3 = zgVar.f294164k;
            if (f4Var3 != null) {
                f4Var3.cancel();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var4 = zgVar.f294165l;
            if (u3Var4 != null) {
                u3Var4.dismiss();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var4 = zgVar.f294164k;
        if (f4Var4 != null) {
            f4Var4.cancel();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var5 = zgVar.f294165l;
        if (u3Var5 != null) {
            u3Var5.dismiss();
        }
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
        e4Var2.f293309c = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cf6);
        e4Var2.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        zgVar.f294164k = e4Var2.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).setRequestedOrientation(1);
        p012xc85e97e9.p093xedfae76a.j0 j0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231716x1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        j0Var2.m7809x1ff8439((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2);
        android.content.Intent intent2 = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.class);
        intent2.setFlags(603979776);
        android.content.Context context3 = zgVar.f294154a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context3, arrayList2.toArray(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI$mSecurityObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/multitalk/model/SecurityParamsData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context3.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context3, "com/tencent/mm/ui/ScreenProfileReadyPluginUI$mSecurityObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/multitalk/model/SecurityParamsData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
