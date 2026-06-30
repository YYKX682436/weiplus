package dk5;

/* loaded from: classes9.dex */
public final class q6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk5.e6 f316363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f316364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316365c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f316366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f316367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f316368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f316369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk5.f6 f316370h;

    public q6(dk5.e6 e6Var, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, java.util.LinkedList linkedList, boolean z17, boolean z18, dk5.f6 f6Var) {
        this.f316363a = e6Var;
        this.f316364b = c11286x34a5504;
        this.f316365c = str;
        this.f316366d = mVar;
        this.f316367e = linkedList;
        this.f316368f = z17;
        this.f316369g = z18;
        this.f316370h = f6Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e c11127xcc7d6e4e;
        k91.v5 v5Var = (k91.v5) obj;
        if (v5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendWXMediaMessageHelper", "sendImgMsg, get wxaAttributes for appbrand info failed");
            dk5.e6 e6Var = this.f316363a;
            if (e6Var != null) {
                dk5.e6.a(e6Var, 5, null, 2, null);
            }
        } else {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject mediaObject = this.f316364b.f33122xe4128443;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaObject, "mediaObject");
            if (mediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9 c11283x90d63ed9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) mediaObject;
                java.lang.String entranceMiniProgramUsername = c11283x90d63ed9.f33103x7c8b278d;
                if (entranceMiniProgramUsername != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entranceMiniProgramUsername, "entranceMiniProgramUsername");
                    if (entranceMiniProgramUsername.length() > 0) {
                        java.lang.String field_appId = v5Var.f68904x28d45f97;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
                        java.lang.String str = v5Var.f68913x21f9b213;
                        java.lang.String str2 = str == null ? "" : str;
                        java.lang.String str3 = v5Var.f68920x68aa7b8d;
                        java.lang.String str4 = str3 == null ? "" : str3;
                        java.lang.String str5 = c11283x90d63ed9.f33102x71a7f65c;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1:");
                        sb6.append(gm0.j1.b().k());
                        sb6.append(':');
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(com.p314xaae8f345.mm.vfs.w6.q(c11283x90d63ed9.f33105xcba65c20) + java.lang.System.currentTimeMillis() + gm0.j1.b().h()));
                        c11127xcc7d6e4e = new com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e(field_appId, str2, str4, str5, sb6.toString(), 1, 0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendImgMsg, get wxaAttributes success, username:" + this.f316365c + " wxaInfo:" + c11127xcc7d6e4e);
                        dk5.y6.f316543a.k(this.f316366d, this.f316364b, this.f316367e, this.f316368f, this.f316369g, this.f316363a, this.f316370h, c11127xcc7d6e4e);
                    }
                }
            }
            c11127xcc7d6e4e = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendImgMsg, get wxaAttributes success, username:" + this.f316365c + " wxaInfo:" + c11127xcc7d6e4e);
            dk5.y6.f316543a.k(this.f316366d, this.f316364b, this.f316367e, this.f316368f, this.f316369g, this.f316363a, this.f316370h, c11127xcc7d6e4e);
        }
        return null;
    }
}
