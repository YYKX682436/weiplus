package b53;

/* loaded from: classes8.dex */
public class p extends b53.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.snackbar.g f18093b;

    public p(int i17) {
        super(i17);
        this.f18093b = new b53.o(this);
    }

    @Override // b53.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, r45.rk4 rk4Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("msg_id", e0Var.f406657n.getLong("msg_id", Long.MIN_VALUE));
        android.os.Bundle bundle2 = e0Var.f406657n;
        bundle.putString("msg_talker", bundle2.getString("msg_talker"));
        bundle.putString("sns_local_id", bundle2.getString("sns_local_id"));
        bundle.putInt("news_svr_id", bundle2.getInt("news_svr_id", 0));
        bundle.putString("news_svr_tweetid", bundle2.getString("news_svr_tweetid"));
        bundle.putInt("message_index", bundle2.getInt("message_index", 0));
        java.lang.String u17 = e0Var.u();
        java.lang.String s17 = e0Var.s();
        bundle.putString("rawUrl", s17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(s17) && s17.endsWith("#rd")) {
            java.lang.String substring = s17.substring(0, s17.length() - 3);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(u17) && !u17.startsWith(substring)) {
                bundle.putString("rawUrl", u17);
                bundle.putLong("msg_id", Long.MIN_VALUE);
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(u17) && !u17.startsWith(s17)) {
            bundle.putString("rawUrl", u17);
            bundle.putLong("msg_id", Long.MIN_VALUE);
            bundle.putString("sns_local_id", "");
        }
        bundle.putString("preChatName", bundle2.getString("preChatName"));
        bundle.putInt("preMsgIndex", bundle2.getInt("preMsgIndex", 0));
        bundle.putString("prePublishId", bundle2.getString("prePublishId"));
        bundle.putString("preUsername", bundle2.getString("preUsername"));
        com.tencent.mm.plugin.webview.luggage.FavUrlTask favUrlTask = new com.tencent.mm.plugin.webview.luggage.FavUrlTask();
        favUrlTask.f182116f = 1;
        favUrlTask.f182117g = bundle;
        favUrlTask.s();
        if (favUrlTask.f182118h) {
            com.tencent.mm.plugin.webview.luggage.jsapi.w3.f182494f = 1;
            e0Var.f406655i.c(new b53.n(this));
        } else {
            n82.e eVar = (n82.e) i95.n0.c(n82.e.class);
            com.tencent.mm.ui.widget.snackbar.g gVar = this.f18093b;
            ((a40.k) eVar).getClass();
            com.tencent.mm.plugin.fav.ui.u1.g(favUrlTask.f182120m, 35, (android.app.Activity) context, gVar);
        }
    }
}
