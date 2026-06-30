package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class r7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225302g = "";

    /* renamed from: h, reason: collision with root package name */
    public final w65.o f225303h = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q7(this);

    public static void A(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r7 r7Var) {
        synchronized (r7Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartDownloadChatFile", "removeWeTaskListener");
            w65.n nVar = (w65.n) i95.n0.c(w65.n.class);
            w65.o taskListener = r7Var.f225303h;
            lm.r rVar = (lm.r) nVar;
            rVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskListener, "taskListener");
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) rVar.f400862m).mo141623x754a37bb(), null, new lm.h(rVar, taskListener, null), 1, null);
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartDownloadChatFile", "invoke %s.", this.f380556d);
        java.lang.String optString = jSONObject.optString("messageSvrId");
        java.lang.String optString2 = jSONObject.optString("chatName");
        java.lang.String optString3 = jSONObject.optString("extInfo");
        if (optString.isEmpty() || optString2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartDownloadChatFile", "invalid param %s", jSONObject.toString());
            this.f224975e.b("invalid param");
            return;
        }
        h40.f fVar = new h40.f(optString2, java.lang.Long.parseLong(optString));
        fVar.f360277e = new h40.a(optString3);
        fVar.f360278f = h40.b.f360256h;
        java.lang.String fj6 = ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).fj(fVar);
        this.f225302g = fj6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartDownloadChatFile", "get mediaId: %s", fj6);
        int i17 = 1;
        boolean z18 = false;
        if (!this.f380556d.equals("queryChatFileStatus")) {
            if (!this.f380556d.equals("startDownloadChatFile")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartDownloadChatFile", "unknown jsapi name %s", this.f380556d);
                this.f224975e.b("invoke jsapi error.");
                return;
            }
            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).aj(fVar);
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).Ai(pt0.f0.V9(optString2, com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(optString)));
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("complete", false);
                this.f224975e.f(jSONObject2, true);
                synchronized (this) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartDownloadChatFile", "addWeTaskListener");
                    w65.n nVar = (w65.n) i95.n0.c(w65.n.class);
                    w65.o taskListener = this.f225303h;
                    lm.r rVar = (lm.r) nVar;
                    rVar.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskListener, "taskListener");
                    v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) rVar.f400862m).mo141623x754a37bb(), null, new lm.f(rVar, taskListener, null), 1, null);
                }
                return;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartDownloadChatFile", "%s json exception: %s", this.f380556d, e17.toString());
                this.f224975e.b("start download json exception");
                return;
            }
        }
        h40.g bj6 = ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).bj(fVar);
        long j17 = bj6.f360283c;
        int i18 = j17 != 0 ? (int) ((bj6.f360282b / j17) * 100.0d) : 0;
        int i19 = bj6.f360281a;
        if (i19 == 102) {
            i17 = 0;
        } else {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
            if (i19 == 101) {
                synchronized (this) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartDownloadChatFile", "addWeTaskListener");
                    w65.n nVar2 = (w65.n) i95.n0.c(w65.n.class);
                    w65.o taskListener2 = this.f225303h;
                    lm.r rVar2 = (lm.r) nVar2;
                    rVar2.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskListener2, "taskListener");
                    v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) rVar2.f400862m).mo141623x754a37bb(), null, new lm.f(rVar2, taskListener2, null), 1, null);
                }
                z18 = true;
            } else {
                i17 = i19 == 199 ? 2 : -1;
            }
        }
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("status", i17);
            jSONObject3.put("progress", i18);
            this.f224975e.f(jSONObject3, z18);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartDownloadChatFile", "%s json exception: %s", this.f380556d, e18.toString());
            this.f224975e.b("file status json exception");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
