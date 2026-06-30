package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/f;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
public final class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        r45.n23 n23Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19482x27941f6f c19482x27941f6f = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19482x27941f6f) obj;
        if (c19482x27941f6f != null && (n23Var = c19482x27941f6f.f268514d) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "enterFinderFullScreen invoke localFeedId: %s", n23Var.m75945x2fec8307(20));
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) n23Var.m75936x14adae67(0);
            long m76784x5db1b11 = c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : -1L;
            java.lang.String m75945x2fec8307 = n23Var.m75945x2fec8307(1);
            java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
            java.lang.String m75945x2fec83072 = n23Var.m75945x2fec8307(2);
            java.lang.String str2 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
            int m75939xb282bd08 = n23Var.m75939xb282bd08(4);
            java.lang.String m75945x2fec83073 = n23Var.m75945x2fec8307(5);
            ((c61.l7) b6Var).hl(m76784x5db1b11, str, "", str2, m75939xb282bd08, m75945x2fec83073 == null ? "" : m75945x2fec83073, n23Var.m75939xb282bd08(13), n23Var.m75942xfb822ef2(11), n23Var.m75942xfb822ef2(12), n23Var.m75939xb282bd08(14), n23Var.m75939xb282bd08(15), n23Var.m75945x2fec8307(6), n23Var.m75945x2fec8307(7), n23Var.m75933x41a8a7f2(21));
            cl0.g gVar = new cl0.g();
            gVar.o("playBackTime", n23Var.m75939xb282bd08(16));
            gVar.r("isPause", n23Var.m75933x41a8a7f2(17));
            gVar.n("playbackRate", n23Var.m75937x160e9ec7(18));
            gVar.r("showBarrage", n23Var.m75933x41a8a7f2(19));
            gVar.h("feedID", n23Var.m75945x2fec8307(20));
            gVar.h("mediaId", n23Var.m75945x2fec8307(1));
            if (c19482x27941f6f.f268515e.length() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(c19482x27941f6f.f268515e);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(keys);
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    gVar.h(next, jSONObject.opt(next));
                }
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            long Z = pm0.v.Z(n23Var.m75945x2fec8307(20));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) n23Var.m75936x14adae67(0);
            java.lang.String m76803x6c285d75 = c19792x256d27252 != null ? c19792x256d27252.m76803x6c285d75() : null;
            if (Z == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "enterProfileForWxPay exportId empty");
            } else {
                int optInt = gVar.optInt("playBackTime");
                boolean optBoolean = gVar.optBoolean("isPause");
                double optDouble = gVar.optDouble("playbackRate");
                gVar.optBoolean("showBarrage");
                java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("mediaId");
                int mo15080xc3ca103c = gVar.mo15080xc3ca103c("requestScene", 3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "enterFeedForWxPay feedId:" + Z + " exportId:null, enterCommentScene:184");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("feed_object_id", Z);
                intent.putExtra("feed_encrypted_object_id", (java.lang.String) null);
                if (m76803x6c285d75 == null) {
                    m76803x6c285d75 = "";
                }
                intent.putExtra("feed_object_nonceId", m76803x6c285d75);
                intent.putExtra("key_need_related_list", true);
                intent.putExtra("key_comment_scene", 184);
                intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", optInt);
                intent.putExtra("KEY_VIDEO_CLEAR_VIDEO_CACHE", true);
                intent.putExtra("KEY_VIDEO_PLAY_SPEED_RATIO", (float) optDouble);
                intent.putExtra("KEY_VIDEO_IS_PAUSE", optBoolean);
                intent.putExtra("KEY_VIDEO_MEDIA_ID", mo15082x48bce8a4);
                intent.putExtra("key_reuqest_scene", mo15080xc3ca103c);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(26, 33, 184, intent);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).uk(context, intent, false);
            }
        }
        if (rVar != null) {
            rVar.a(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d);
        }
    }
}
