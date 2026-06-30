package av4;

/* loaded from: classes8.dex */
public final class a extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.a f14253d = new av4.a();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        android.graphics.Bitmap bitmap;
        boolean z17;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("WebViewAddMinimizeTaskJSAPI", "addToStar: handleMsg");
        if (!(env.f340860a instanceof android.app.Activity)) {
            throw new java.lang.IllegalStateException("WebViewAddMinimizeTaskJSAPI addToStar need Activity Context");
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(msg.f340790a);
        zv4.g gVar = zv4.h.f476461a;
        android.graphics.RectF e17 = gVar.e(jSONObject);
        boolean optBoolean = jSONObject.optBoolean("coverImgSnapshot", false);
        float f17 = env.f340860a.getResources().getDisplayMetrics().density;
        android.graphics.RectF rectF = new android.graphics.RectF(e17);
        rectF.top *= f17;
        rectF.left *= f17;
        rectF.right *= f17;
        rectF.bottom *= f17;
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.roundOut(rect);
        com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
        if (optBoolean) {
            kotlin.jvm.internal.o.d(mMWebView);
            android.graphics.Bitmap f18 = mMWebView.f();
            kotlin.jvm.internal.o.d(f18);
            bitmap = gVar.d(f18, rect);
        } else {
            bitmap = null;
        }
        kotlin.jvm.internal.o.d(mMWebView);
        android.graphics.Rect c17 = gVar.c(e17, mMWebView);
        java.lang.Object obj = msg.f340790a.get("bizName");
        int b17 = gVar.b(obj instanceof java.lang.String ? (java.lang.String) obj : null);
        com.tencent.mars.xlog.Log.i("WebViewAddMinimizeTaskJSAPI", "dl: onScreenshotCaptured, bitmap %s", bitmap);
        if (b17 != 30) {
            android.content.Context context = env.f340860a;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            gVar.a((android.app.Activity) context, jSONObject, c17, bitmap);
            return true;
        }
        tg0.s1 s1Var = (tg0.s1) i95.n0.c(tg0.s1.class);
        android.content.Context context2 = env.f340860a;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context2;
        ((sg0.k3) s1Var).getClass();
        int optInt = jSONObject.optInt("stateType", 0);
        sg0.j3[] j3VarArr = sg0.j3.f407737d;
        if (optInt == 2) {
            java.lang.String optString = jSONObject.optString("bizKey");
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = new com.tencent.mm.plugin.ball.model.BallInfo(57, optString, null);
            ballInfo.f93060u = com.tencent.mm.R.raw.float_ball_icon_search_default;
            ballInfo.f93055p.f93067e = bitmap;
            ballInfo.G.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
            ballInfo.G.putInt("type", jSONObject.optInt("type"));
            ballInfo.G.putBoolean("isHomePage", jSONObject.optBoolean("isHomePage"));
            ballInfo.G.putString("query", jSONObject.optString("query"));
            ballInfo.G.putString("extParams", jSONObject.optString("extParams"));
            ballInfo.G.putString("navBarParams", jSONObject.optString("navBarParams"));
            wv4.a aVar = new wv4.a(new wv4.b(activity));
            aVar.b(57, optString);
            ballInfo.f93048f = 1;
            aVar.f93132d = ballInfo;
            aVar.A(true, 2);
        } else {
            java.lang.String optString2 = jSONObject.optString("bizKey");
            java.lang.String optString3 = jSONObject.optString("iconUrl");
            java.lang.String optString4 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            java.lang.String optString5 = jSONObject.optString("displaySourceName");
            long optLong = jSONObject.optLong("createTime");
            r45.ax5 ax5Var = new r45.ax5();
            ax5Var.set(0, java.lang.Integer.valueOf(jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)));
            ax5Var.set(1, java.lang.Integer.valueOf(jSONObject.optInt("type")));
            ax5Var.set(2, java.lang.Boolean.valueOf(jSONObject.optBoolean("isHomePage")));
            ax5Var.set(3, jSONObject.optString("query"));
            ax5Var.set(4, jSONObject.optString("extParams"));
            ax5Var.set(5, jSONObject.optString("navBarParams"));
            xv4.e eVar = new xv4.e(new ak3.i(activity));
            eVar.y(30, optString2);
            if (optLong == 0) {
                optLong = c01.id.c();
            }
            long j17 = optLong;
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = eVar.f300077a;
            if (multiTaskInfo != null) {
                multiTaskInfo.field_id = optString2;
                z17 = true;
                multiTaskInfo.v0().set(1, optString4);
                multiTaskInfo.v0().set(5, optString3);
                multiTaskInfo.field_data = ax5Var.toByteArray();
                multiTaskInfo.v0().set(0, optString5);
                multiTaskInfo.field_createTime = j17;
            } else {
                z17 = true;
            }
            eVar.l(bitmap, z17);
            eVar.B(z17);
        }
        com.tencent.mm.plugin.webview.stub.z0 b18 = env.b();
        if (b18 == null) {
            return true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("bizKey", jSONObject.optString("bizKey"));
        b18.callback(162, bundle);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "addMinimizeTask";
    }
}
