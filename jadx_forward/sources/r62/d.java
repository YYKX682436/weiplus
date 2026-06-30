package r62;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static java.util.Map f474542d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f474543a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f474544b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f474545c = new r62.b(this);

    public d(android.content.Context context, java.lang.String str, boolean z17) {
        this.f474543a = "";
        this.f474544b = null;
        this.f474544b = context;
        this.f474543a = str;
    }

    public static void a(r62.d dVar, r45.iw5 iw5Var) {
        dVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("add_more_friend_search_scene", 3);
        if (iw5Var != null) {
            try {
                intent.putExtra("result", iw5Var.mo14344x5f01b1f6());
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: IOException: %s", e17.toString());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: more than one contact is resolved. starting to ContactSearchResultUI");
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.n(intent, dVar.f474544b);
    }

    public final void b(java.lang.String str, r62.c cVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: username is null when put to cache");
            return;
        }
        if (f474542d == null) {
            f474542d = new java.util.HashMap();
        }
        f474542d.put(str, cVar);
    }

    public final int c(java.lang.String str, r45.iw5 iw5Var, r45.gw5 gw5Var) {
        if (this.f474544b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RedirectToChattingByPhoneHelper", "hy: error param. start redirect param error: context is null");
            return -1;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).h(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: is friend. direct to chatting");
            d(str);
            return 0;
        }
        if (iw5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via searchResp");
            f(iw5Var);
            return 1;
        }
        if (gw5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: no matching for starting redirect");
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via SearchContactItem");
        e(gw5Var);
        return 1;
    }

    public final void d(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", false);
        j45.l.u(this.f474544b, ".ui.chatting.ChattingUI", intent, null);
    }

    public final void e(r45.gw5 gw5Var) {
        if (gw5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: item or context is null");
            return;
        }
        java.lang.String g17 = x51.j1.g(gw5Var.f457094d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
            return;
        }
        b(this.f474543a, new r62.c(this, x51.j1.g(gw5Var.f457094d), null, gw5Var));
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).h(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search item is friend. start to chatting");
            d(g17);
        } else {
            android.content.Intent intent = new android.content.Intent();
            ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).wi(intent, gw5Var, 15);
            intent.putExtra("add_more_friend_search_scene", 2);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, this.f474544b);
        }
    }

    public final void f(r45.iw5 iw5Var) {
        if (iw5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: resp or context is null");
            return;
        }
        java.lang.String g17 = x51.j1.g(iw5Var.f458889d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
            return;
        }
        b(this.f474543a, new r62.c(this, x51.j1.g(iw5Var.f458889d), iw5Var, null));
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).h(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search response is friend. start to chatting");
            d(g17);
        } else {
            android.content.Intent intent = new android.content.Intent();
            qk.p.a(intent, iw5Var, 15);
            intent.putExtra("add_more_friend_search_scene", 2);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, this.f474544b);
        }
    }
}
