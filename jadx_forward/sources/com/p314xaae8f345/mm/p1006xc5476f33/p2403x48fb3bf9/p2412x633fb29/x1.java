package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public class x1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f264710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 f264711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 f264712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 f264713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f264715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f264716g;

    public x1(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 u1Var, java.lang.String str, int i17, android.app.Dialog dialog) {
        this.f264710a = weakReference;
        this.f264711b = v0Var;
        this.f264712c = l2Var;
        this.f264713d = u1Var;
        this.f264714e = str;
        this.f264715f = i17;
        this.f264716g = dialog;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        android.content.Context context = (android.content.Context) this.f264710a.get();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "onSceneEnd doOauthAuthorize errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (context == null || this.f264711b == null || this.f264712c == null || this.f264713d == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f152244b.f152233a) == null || !(fVar instanceof r45.lx4)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.c(false, str, bundle, context, this.f264711b, this.f264712c, this.f264713d, this.f264715f, i18, this.f264716g);
            return;
        }
        r45.lx4 lx4Var = (r45.lx4) fVar;
        bundle.putString("oauth_url", this.f264714e);
        java.util.LinkedList linkedList = lx4Var.f461467d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList != null && !linkedList.isEmpty()) {
            for (int i19 = 0; i19 < linkedList.size(); i19++) {
                try {
                    arrayList.add(((r45.px4) linkedList.get(i19)).mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OauthAuthorizeLogic", "oauthScopeInfoListToBytesList index:%d, exp:%s ", java.lang.Integer.valueOf(i19), e17.getLocalizedMessage());
                    arrayList.clear();
                }
            }
        }
        bundle.putSerializable("scope_list", arrayList);
        bundle.putString("appname", lx4Var.f461468e);
        bundle.putString("appicon_url", lx4Var.f461469f);
        bundle.putString("redirect_url", lx4Var.f461470g);
        bundle.putBoolean("is_recent_has_auth", lx4Var.f461471h);
        bundle.putBoolean("is_silence_auth", lx4Var.f461472i);
        bundle.putBoolean("is_call_server_when_confirm", lx4Var.f461473m);
        java.util.LinkedList linkedList2 = lx4Var.f461474n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2) && linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                try {
                    arrayList2.add(((r45.mx4) it.next()).mo14344x5f01b1f6());
                } catch (java.io.IOException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OauthMultiAccountMgr", "oauthAvatarListToBytesList exception");
                    arrayList2.clear();
                }
            }
        }
        bundle.putSerializable("avatar_list", arrayList2);
        bundle.putBoolean("is_use_new_page", lx4Var.f461475o);
        bundle.putBoolean("is_ban_modify_avatar", lx4Var.f461476p);
        r45.qx4 qx4Var = lx4Var.f461482v;
        if (qx4Var != null) {
            bundle.putString("create_avatar_title", qx4Var.f465869e);
        }
        bundle.putInt("avatar_limit", lx4Var.f461477q);
        bundle.putInt("default_avatar_id", lx4Var.f461478r);
        bundle.putString("default_headimg_url", lx4Var.f461479s);
        bundle.putString("default_headimg_fileid", lx4Var.f461480t);
        bundle.putBoolean("is_tourist_oauth", lx4Var.f461481u);
        bundle.putString("tourist_banner_wording", lx4Var.f461482v.f465870f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.c(true, str, bundle, context, this.f264711b, this.f264712c, this.f264713d, this.f264715f, i18, this.f264716g);
    }
}
