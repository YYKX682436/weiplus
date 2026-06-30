package x10;

/* loaded from: classes9.dex */
public final class d extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        bw5.v7 g17 = jumpInfo.g();
        java.lang.String c17 = g17 != null ? g17.c() : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.NativeHandler.RevealBlindGift", "handle params nil");
            callback.c("handle params nil");
            return;
        }
        try {
            java.util.Map e17 = b00.p0.f98280a.e(new org.json.JSONObject(c17));
            java.lang.String wi6 = ((j00.o) ((c00.d3) i95.n0.c(c00.d3.class))).wi(context.f439086c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.NativeHandler.RevealBlindGift", "set open event callback, eventId:" + wi6);
            e17.put("ecsOpenEventId", wi6);
            c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
            android.content.Context c18 = context.c();
            j00.k1 k1Var = (j00.k1) e3Var;
            k1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "openEcsGiftRevealBlindGiftPageWithParams, open with loading");
            k1Var.sj(c18, e17, null, new j00.y0(k1Var, c18));
            callback.d(null);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.NativeHandler.RevealBlindGift", "handle error:" + e18);
            callback.c("handle error");
        }
    }
}
