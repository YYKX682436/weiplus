package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class v7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f102628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102630c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f102632e;

    public v7(android.content.Intent intent, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        this.f102628a = intent;
        this.f102629b = str;
        this.f102630c = str2;
        this.f102631d = str3;
        this.f102632e = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.n73 n73Var;
        java.lang.String str;
        java.lang.String string;
        java.util.LinkedList list;
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mm.plugin.finder.assist.w7 w7Var = com.tencent.mm.plugin.finder.assist.w7.f102656a;
            com.tencent.mars.xlog.Log.w("Finder.FinderThirdPartyGameLiveUtil", "CgiFinderLiveGetUserGameConfig failed.");
            return java.lang.Boolean.valueOf(hz2.d.f286313a.j(fVar.f70615a, fVar.f70616b, (r45.qp1) ((r45.hv1) fVar.f70618d).getCustom(2)));
        }
        r45.hv1 hv1Var = (r45.hv1) fVar.f70618d;
        java.lang.String str2 = this.f102629b;
        if (hv1Var == null || (list = hv1Var.getList(1)) == null) {
            n73Var = null;
        } else {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                r45.z53 z53Var = (r45.z53) ((r45.n73) obj2).getCustom(1);
                if (kotlin.jvm.internal.o.b(z53Var != null ? z53Var.getString(0) : null, str2)) {
                    break;
                }
            }
            n73Var = (r45.n73) obj2;
        }
        if ((n73Var != null ? (r45.s63) n73Var.getCustom(3) : null) == null) {
            com.tencent.mm.plugin.finder.assist.w7 w7Var2 = com.tencent.mm.plugin.finder.assist.w7.f102656a;
            com.tencent.mars.xlog.Log.w("Finder.FinderThirdPartyGameLiveUtil", "detail null");
        } else {
            r45.s63 s63Var = (r45.s63) n73Var.getCustom(3);
            java.lang.String str3 = "";
            if (s63Var == null || (str = s63Var.getString(1)) == null) {
                str = "";
            }
            r45.s63 s63Var2 = (r45.s63) n73Var.getCustom(3);
            if (s63Var2 != null && (string = s63Var2.getString(0)) != null) {
                str3 = string;
            }
            android.content.Intent intent = this.f102628a;
            intent.putExtra("COVER_URL", str);
            intent.putExtra("DESC", str3);
            intent.putExtra("APPID", str2);
            intent.putExtra("POST_FROM_SCENE", 0);
            intent.putExtra("GameUserInfo", n73Var.toByteArray());
            intent.putExtra("KEY_ANTI_INFO", this.f102630c);
            java.lang.String str4 = this.f102631d;
            intent.putExtra("GAME_USER_ID", str4);
            int i17 = this.f102632e;
            intent.putExtra("GAME_PLATFROM_ID", i17);
            if (i17 != 0) {
                r45.xl6 xl6Var = new r45.xl6();
                xl6Var.set(0, str2);
                xl6Var.set(2, java.lang.Integer.valueOf(i17));
                xl6Var.set(3, str4);
                intent.putExtra("KEY_FROM_THIRD_PARTY_SHARE", xl6Var.toByteArray());
            }
            intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            com.tencent.mm.plugin.finder.assist.w7 w7Var3 = com.tencent.mm.plugin.finder.assist.w7.f102656a;
            intent.addFlags(268435456);
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            c61.yb.H7((c61.yb) c17, context, intent, 0L, null, 0, 0, false, 124, null);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/FinderThirdPartyGameLiveUtil", "goToLivePostUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/assist/FinderThirdPartyGameLiveUtil", "goToLivePostUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f302826a;
    }
}
