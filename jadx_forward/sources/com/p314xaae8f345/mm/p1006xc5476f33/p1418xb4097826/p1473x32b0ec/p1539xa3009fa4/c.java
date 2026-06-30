package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g f198492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f198493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198494c;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g gVar, int i17, java.lang.String str) {
        this.f198492a = gVar;
        this.f198493b = i17;
        this.f198494c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.n73 n73Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g gVar = this.f198492a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.hv1 hv1Var = (r45.hv1) fVar.f152151d;
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
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z53Var != null ? z53Var.m75945x2fec8307(0) : null, gVar.f198633f)) {
                        break;
                    }
                }
                n73Var = (r45.n73) obj2;
            }
            if ((n73Var != null ? (r45.s63) n73Var.m75936x14adae67(3) : null) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(gVar.f198631d, "detail null");
                pm0.z.b(xy2.b.f539688b, "AUTH_ERROR_USERCONFIG_NULL", false, null, null, false, false, null, 124, null);
                db5.t7.m123882x26a183b(gVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.dgq, 0).show();
            } else {
                r45.s63 s63Var = (r45.s63) n73Var.m75936x14adae67(3);
                java.lang.String str3 = "";
                if (s63Var == null || (str = s63Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                r45.s63 s63Var2 = (r45.s63) n73Var.m75936x14adae67(3);
                if (s63Var2 == null || (str2 = s63Var2.m75945x2fec8307(0)) == null) {
                    str2 = "";
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("COVER_URL", str);
                intent.putExtra("DESC", str2);
                intent.putExtra("TICKET", gVar.f198634g);
                intent.putExtra("APPID", gVar.f198633f);
                intent.putExtra("POST_FROM_SCENE", this.f198493b);
                intent.putExtra("GameUserInfo", n73Var.mo14344x5f01b1f6());
                intent.putExtra("KEY_ANTI_INFO", this.f198494c);
                r45.xl6 xl6Var = gVar.f198637m;
                if (xl6Var != null && (m75945x2fec8307 = xl6Var.m75945x2fec8307(3)) != null) {
                    str3 = m75945x2fec8307;
                }
                intent.putExtra("GAME_USER_ID", str3);
                r45.xl6 xl6Var2 = gVar.f198637m;
                intent.putExtra("GAME_PLATFROM_ID", xl6Var2 != null ? xl6Var2.m75939xb282bd08(2) : 0);
                r45.xl6 xl6Var3 = gVar.f198637m;
                if (xl6Var3 != null) {
                    intent.putExtra("KEY_FROM_THIRD_PARTY_SHARE", xl6Var3.mo14344x5f01b1f6());
                }
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.yb.H7((c61.yb) c17, gVar.m80379x76847179(), intent, 0L, null, 0, 0, false, 124, null);
                intent.setClass(gVar.m80379x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14021x37325479.class);
                android.app.Activity m80379x76847179 = gVar.m80379x76847179();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m80379x76847179, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "goToLivePostUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                m80379x76847179.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(m80379x76847179, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "goToLivePostUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                gVar.m158354x19263085().finish();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(gVar.f198631d, "CgiFinderLiveGetUserGameConfig failed.");
            pm0.z.b(xy2.b.f539688b, "AUTH_ERROR_USERCONFIG_FAILED", false, null, null, false, false, null, 124, null);
            db5.t7.m123882x26a183b(gVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.dgq, 0).show();
        }
        return jz5.f0.f384359a;
    }
}
