package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.c f263566a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f263567b;

    /* renamed from: c, reason: collision with root package name */
    public long f263568c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f263569d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f263570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.b f263571f;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.C19247xf6130f4d c19247xf6130f4d) {
        this.f263571f = bVar;
    }

    public void a(int i17, java.lang.String str, java.lang.String str2, int i18, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = str2 == null ? "" : str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "error query:%s type:%d pagebuf:%s ", objArr);
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(i17);
        java.lang.String g17 = kk.k.g(stringBuffer.toString().getBytes());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f263567b) && this.f263567b.equals(g17) && java.lang.System.currentTimeMillis() - this.f263568c <= 8000 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (this.f263570e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "hit the search cache %s", str);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i18).w6(this.f263566a.H().f463247d, true, x51.j1.f(this.f263566a.H().f463248e), this.f263566a.H().f463249f);
                return;
            } else {
                if (this.f263569d) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.c cVar = this.f263566a;
                    if (cVar != null) {
                        cVar.f263578i = i18;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "wait the netscene running");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "netscene error try again");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "start New NetScene query:%s newMD5:%s webviewID:%d", str, g17, java.lang.Integer.valueOf(i18));
        if (this.f263566a != null) {
            gm0.j1.d().d(this.f263566a);
        }
        this.f263567b = g17;
        this.f263568c = java.lang.System.currentTimeMillis();
        this.f263569d = true;
        this.f263570e = false;
        gm0.j1.d().a(234, this.f263571f);
        this.f263566a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.c(i17, str, str2.getBytes(), i18, j17);
        gm0.j1.d().g(this.f263566a);
    }
}
