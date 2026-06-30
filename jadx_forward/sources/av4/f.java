package av4;

/* loaded from: classes.dex */
public final class f extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.f f95817d = new av4.f();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteAiHistoryMsgJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f422396d;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeleteAiHistoryMsgJsApi", "AIHistoryService is null");
            gVar.e(msg.f422546c, "deleteAiHistoryMsg:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f422323a.get("searchId");
        java.lang.String searchId = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        boolean z17 = false;
        if (searchId == null || searchId.length() == 0) {
            gVar.e(msg.f422546c, "deleteAiHistoryMsg:fail invalid searchId", null);
            return true;
        }
        pu4.a aVar = (pu4.a) eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        ru4.f fVar = aVar.f439965d;
        if (fVar != null) {
            fVar.z0(searchId);
            if (!(searchId.length() == 0)) {
                try {
                    fVar.f481320d.mo70514xb06685ab("AIHistoryMessage", "searchId = ?", new java.lang.String[]{searchId});
                    z17 = true;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AIHistory.MessageStorage", "deleteMessage failed: " + e17.getMessage());
                }
            }
            if (z17) {
                aVar.wi(searchId);
            }
        }
        if (z17) {
            gVar.e(msg.f422546c, "deleteAiHistoryMsg:ok", null);
        } else {
            gVar.e(msg.f422546c, "deleteAiHistoryMsg:fail", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "deleteAiHistoryMsg";
    }
}
