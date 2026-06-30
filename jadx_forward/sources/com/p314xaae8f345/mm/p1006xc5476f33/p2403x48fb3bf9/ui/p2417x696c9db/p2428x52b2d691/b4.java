package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class b4 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267503e;

    public b4(java.lang.String str, nw4.k kVar) {
        this.f267502d = str;
        this.f267503e = kVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267838e) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("event", i18 != -1 ? i18 != 0 ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d : "canceled" : ya.b.f77504xbb80cbe3);
            if (intent != null) {
                hashMap.put("sendChatType", new jz5.u(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267837d, i18, intent)));
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
                if (stringArrayListExtra != null && stringArrayListExtra.size() != 0) {
                    java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                        boolean B = r26.n0.B(next, "@chatroom", false);
                        java.lang.String str = this.f267502d;
                        if (B) {
                            jx3.f.INSTANCE.d(28358, 2, next, str);
                        } else {
                            jx3.f.INSTANCE.d(28358, 1, next, str);
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "createHalfBottomMenu for sns resultCode:" + i18 + " event:" + hashMap.get("event"));
            nw4.g gVar = this.f267503e.f422396d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar).o("onShareEmbedExcerptEvent", hashMap);
        }
    }
}
