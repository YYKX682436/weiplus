package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public final class x3 extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f264219x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.k97 f264220y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f264221z;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        hashSet.add("webpageTitle");
        hashSet.add("hide_option_menu");
        hashSet.add("translate_webview");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
        hashSet.add("KOpenArticleSceneFromScene");
        java.lang.String KTmplSubScene = com.p314xaae8f345.mm.ui.w2.f292727g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KTmplSubScene, "KTmplSubScene");
        hashSet.add(KTmplSubScene);
        hashSet.add("pay_channel");
        hashSet.add("key_download_restrict");
        hashSet.add("key_wallet_region");
        hashSet.add("key_function_id");
        java.lang.String KTmplItemShowType = com.p314xaae8f345.mm.ui.w2.f292730j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KTmplItemShowType, "KTmplItemShowType");
        hashSet.add(KTmplItemShowType);
        hashSet.add("geta8key_scene");
        hashSet.add("ad_ux_info_for_jsapi_pay");
        hashSet.add("key_menu_hide_expose");
        hashSet.add("webviewCurrentProcess");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 page, ak3.c adapter) {
        super(adapter);
        android.os.Bundle extras;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f264219x = page;
        r45.k97 k97Var = new r45.k97();
        this.f264220y = k97Var;
        android.content.Intent mo2160x1e885992 = adapter.mo2160x1e885992();
        if (mo2160x1e885992 == null || (extras = mo2160x1e885992.getExtras()) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ui(extras, k97Var);
    }

    @Override // jk3.b
    public void B(boolean z17) {
        j();
        super.B(z17);
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        j();
        return super.U(i17, z17);
    }

    @Override // jk3.b, jk3.e
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264219x;
        r45.k97 k97Var = this.f264220y;
        try {
            k97Var.set(1, e0Var.s());
            k97Var.set(4, e0Var.t());
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
            if (c16601x7ed0e40c == null) {
                return;
            }
            c16601x7ed0e40c.f66790x225a93cf = k97Var.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebMultiTaskHelper", "onMenuMultiTaskSelected error, ex = " + e17.getMessage());
        }
    }

    @Override // jk3.b
    public boolean w() {
        return true;
    }

    @Override // jk3.b
    public boolean x() {
        return this.f264219x.n();
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        android.content.Intent mo2160x1e885992;
        super.y(i17, str);
        ak3.c cVar = this.f381644d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (cVar == null || (mo2160x1e885992 = cVar.mo2160x1e885992()) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) mo2160x1e885992.getParcelableExtra("KMutilTaskInfo");
        if (c16601x7ed0e40c != null) {
            this.f381610a = c16601x7ed0e40c;
        }
    }
}
