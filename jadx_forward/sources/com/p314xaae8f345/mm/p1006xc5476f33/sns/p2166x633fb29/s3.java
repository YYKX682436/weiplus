package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class s3 extends com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3 {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f246198c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f246199d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f246200e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f246201f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f246202g = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f246203h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f246204i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3 f246205j;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3 t3Var) {
        this.f246205j = t3Var;
        this.f246198c = null;
        this.f246199d = "";
        this.f246200e = "";
        this.f246198c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("preferences_remove_task", 0);
        gm0.j1.i();
        if (gm0.j1.b().m()) {
            java.lang.String r17 = c01.z1.r();
            this.f246204i = r17;
            this.f246199d = "remove_key_base" + r17;
            this.f246200e = "remove_key" + r17;
            gm0.j1.i();
            if (!gm0.j1.b().m() || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj() || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj() == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej() == null) {
                return;
            }
            this.f246203h = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0(r17).f67938x2259bc65;
            boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3.f246219e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            t3Var.f246221a = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3
    public java.lang.Object a(java.lang.Object[] objArr) {
        java.lang.Boolean bool;
        java.lang.StringBuilder sb6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3.f246219e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            boolean z17 = this.f246205j.f246221a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            if (!z17) {
                bool = java.lang.Boolean.FALSE;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3.f246219e = false;
                bool = java.lang.Boolean.FALSE;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            } else {
                java.lang.String str = this.f246199d;
                android.content.SharedPreferences sharedPreferences = this.f246198c;
                int i17 = sharedPreferences.getInt(str, 0);
                com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = this.f246201f;
                c19767x257d7f.f38864x6ac9171 = i17;
                int i18 = sharedPreferences.getInt(this.f246200e, 0);
                com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = this.f246202g;
                c19767x257d7f2.f38864x6ac9171 = i18;
                java.lang.String Di = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di();
                try {
                    java.lang.System.currentTimeMillis();
                    sb6 = new java.lang.StringBuilder();
                    sb6.append(Di);
                    char[] cArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3.f246220f;
                    sb6.append(cArr[c19767x257d7f.f38864x6ac9171 % 36]);
                    sb6.append("/");
                    sb6.append(cArr[c19767x257d7f2.f38864x6ac9171 % 36]);
                } catch (java.lang.Exception unused) {
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3.a(sb6.toString(), this.f246203h, this.f246204i)) {
                    java.lang.System.currentTimeMillis();
                    bool = java.lang.Boolean.TRUE;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
                } else {
                    bool = java.lang.Boolean.FALSE;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
                }
            }
        } else {
            bool = java.lang.Boolean.FALSE;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        return bool;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3
    public java.util.concurrent.ExecutorService b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExecutor", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        java.util.concurrent.ExecutorService cj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.cj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExecutor", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        return cj6;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3
    public void c(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3.f246219e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$008", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3 t3Var = this.f246205j;
        t3Var.f246223c++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$008", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNextFile", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = this.f246202g;
            int i17 = c19767x257d7f.f38864x6ac9171 + 1;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = this.f246201f;
            if (i17 >= 36) {
                c19767x257d7f.f38864x6ac9171 = 0;
                c19767x257d7f2.f38864x6ac9171 = (c19767x257d7f2.f38864x6ac9171 + 1) % 36;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNextFile", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            } else {
                c19767x257d7f.f38864x6ac9171 = i17 % 36;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNextFile", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            }
            android.content.SharedPreferences sharedPreferences = this.f246198c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt(this.f246199d, c19767x257d7f2.f38864x6ac9171).apply();
                sharedPreferences.edit().putInt(this.f246200e, c19767x257d7f.f38864x6ac9171).apply();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = t3Var.f246224d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            n3Var.mo50307xb9e94560(0, 20000L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        t3Var.f246221a = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
    }
}
