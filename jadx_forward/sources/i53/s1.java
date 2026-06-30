package i53;

/* loaded from: classes8.dex */
public class s1 implements vl1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.a2 f370243a;

    public s1(i53.a2 a2Var) {
        this.f370243a = a2Var;
    }

    @Override // vl1.p
    public void a(android.view.View view, int i17, long j17) {
        p33.l lVar;
        p33.s sVar;
        i53.a2 a2Var = this.f370243a;
        i53.k0 k0Var = a2Var.f370033h.f370204e2;
        if (i17 >= 0) {
            java.util.LinkedList linkedList = k0Var.f370160i;
            if (i17 < linkedList.size()) {
                lVar = (p33.l) linkedList.get(i17);
                if (!lVar.f433136e || lVar.f433137f) {
                }
                a2Var.f370043u = lVar;
                p33.g0 g0Var = lVar.f433154z;
                if (!((g0Var == null || (sVar = g0Var.f433111e) == null) ? false : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sVar.f433175d)) || lVar.f433135d) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("game_straight_to_publish", a2Var.f370041s);
                    if (lVar.f433135d) {
                        ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(a2Var.getContext(), 7, lVar.f433147s, lVar.f433140i, null, null, a2Var.hashCode() & 65535, bundle, a2Var.f370042t);
                        return;
                    } else {
                        ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(a2Var.getContext(), 7, lVar.f433147s, null, lVar.f433140i, lVar.f433139h, a2Var.hashCode() & 65535, bundle, a2Var.f370042t);
                        return;
                    }
                }
                java.lang.String str = lVar.f433147s;
                java.lang.String str2 = lVar.f433148t;
                p33.s sVar2 = lVar.f433154z.f433111e;
                android.app.Activity activity = (android.app.Activity) a2Var.getContext();
                if (sVar2 == null || activity == null) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_game_video_appid", str);
                intent.putExtra("key_game_video_appname", str2);
                intent.putExtra("key_game_video_page_type", 1);
                intent.putExtra("key_game_video_encode_json_array", true);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("jumpType", sVar2.f433176e);
                jSONObject.put("jumpUrl", sVar2.f433175d);
                cl0.e eVar = new cl0.e();
                eVar.q(jSONObject);
                java.lang.String mo15068x9616526c = eVar.mo15068x9616526c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15068x9616526c, "toString(...)");
                intent.putExtra("key_video_info", mo15068x9616526c);
                activity.setResult(-1, intent);
                activity.finish();
                return;
            }
        } else {
            k0Var.getClass();
        }
        lVar = null;
        if (lVar.f433136e) {
        }
    }
}
