package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class v7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f184161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184163c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184165e;

    public v7(android.content.Intent intent, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        this.f184161a = intent;
        this.f184162b = str;
        this.f184163c = str2;
        this.f184164d = str3;
        this.f184165e = i18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.n73 n73Var;
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7 w7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7.f184189a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderThirdPartyGameLiveUtil", "CgiFinderLiveGetUserGameConfig failed.");
            return java.lang.Boolean.valueOf(hz2.d.f367846a.j(fVar.f152148a, fVar.f152149b, (r45.qp1) ((r45.hv1) fVar.f152151d).m75936x14adae67(2)));
        }
        r45.hv1 hv1Var = (r45.hv1) fVar.f152151d;
        java.lang.String str2 = this.f184162b;
        if (hv1Var == null || (m75941xfb821914 = hv1Var.m75941xfb821914(1)) == null) {
            n73Var = null;
        } else {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                r45.z53 z53Var = (r45.z53) ((r45.n73) obj2).m75936x14adae67(1);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z53Var != null ? z53Var.m75945x2fec8307(0) : null, str2)) {
                    break;
                }
            }
            n73Var = (r45.n73) obj2;
        }
        if ((n73Var != null ? (r45.s63) n73Var.m75936x14adae67(3) : null) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7 w7Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7.f184189a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderThirdPartyGameLiveUtil", "detail null");
        } else {
            r45.s63 s63Var = (r45.s63) n73Var.m75936x14adae67(3);
            java.lang.String str3 = "";
            if (s63Var == null || (str = s63Var.m75945x2fec8307(1)) == null) {
                str = "";
            }
            r45.s63 s63Var2 = (r45.s63) n73Var.m75936x14adae67(3);
            if (s63Var2 != null && (m75945x2fec8307 = s63Var2.m75945x2fec8307(0)) != null) {
                str3 = m75945x2fec8307;
            }
            android.content.Intent intent = this.f184161a;
            intent.putExtra("COVER_URL", str);
            intent.putExtra("DESC", str3);
            intent.putExtra("APPID", str2);
            intent.putExtra("POST_FROM_SCENE", 0);
            intent.putExtra("GameUserInfo", n73Var.mo14344x5f01b1f6());
            intent.putExtra("KEY_ANTI_INFO", this.f184163c);
            java.lang.String str4 = this.f184164d;
            intent.putExtra("GAME_USER_ID", str4);
            int i17 = this.f184165e;
            intent.putExtra("GAME_PLATFROM_ID", i17);
            if (i17 != 0) {
                r45.xl6 xl6Var = new r45.xl6();
                xl6Var.set(0, str2);
                xl6Var.set(2, java.lang.Integer.valueOf(i17));
                xl6Var.set(3, str4);
                intent.putExtra("KEY_FROM_THIRD_PARTY_SHARE", xl6Var.mo14344x5f01b1f6());
            }
            intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7 w7Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7.f184189a;
            intent.addFlags(268435456);
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c61.yb.H7((c61.yb) c17, context, intent, 0L, null, 0, 0, false, 124, null);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14021x37325479.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/FinderThirdPartyGameLiveUtil", "goToLivePostUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/assist/FinderThirdPartyGameLiveUtil", "goToLivePostUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
