package av4;

/* loaded from: classes8.dex */
public final class a extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.a f95786d = new av4.a();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        android.graphics.Bitmap bitmap;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAddMinimizeTaskJSAPI", "addToStar: handleMsg");
        if (!(env.f422393a instanceof android.app.Activity)) {
            throw new java.lang.IllegalStateException("WebViewAddMinimizeTaskJSAPI addToStar need Activity Context");
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(msg.f422323a);
        zv4.g gVar = zv4.h.f557994a;
        android.graphics.RectF e17 = gVar.e(jSONObject);
        boolean optBoolean = jSONObject.optBoolean("coverImgSnapshot", false);
        float f17 = env.f422393a.getResources().getDisplayMetrics().density;
        android.graphics.RectF rectF = new android.graphics.RectF(e17);
        rectF.top *= f17;
        rectF.left *= f17;
        rectF.right *= f17;
        rectF.bottom *= f17;
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.roundOut(rect);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
        if (optBoolean) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22633x83752a59);
            android.graphics.Bitmap f18 = c22633x83752a59.f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f18);
            bitmap = gVar.d(f18, rect);
        } else {
            bitmap = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22633x83752a59);
        android.graphics.Rect c17 = gVar.c(e17, c22633x83752a59);
        java.lang.Object obj = msg.f422323a.get("bizName");
        int b17 = gVar.b(obj instanceof java.lang.String ? (java.lang.String) obj : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAddMinimizeTaskJSAPI", "dl: onScreenshotCaptured, bitmap %s", bitmap);
        if (b17 != 30) {
            android.content.Context context = env.f422393a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            gVar.a((android.app.Activity) context, jSONObject, c17, bitmap);
            return true;
        }
        tg0.s1 s1Var = (tg0.s1) i95.n0.c(tg0.s1.class);
        android.content.Context context2 = env.f422393a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context2;
        ((sg0.k3) s1Var).getClass();
        int optInt = jSONObject.optInt("stateType", 0);
        sg0.j3[] j3VarArr = sg0.j3.f489270d;
        if (optInt == 2) {
            java.lang.String optString = jSONObject.optString("bizKey");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(57, optString, null);
            c12886x91aa2b6d.f174593u = com.p314xaae8f345.mm.R.raw.f79372x58047973;
            c12886x91aa2b6d.f174588p.f174600e = bitmap;
            c12886x91aa2b6d.G.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811));
            c12886x91aa2b6d.G.putInt("type", jSONObject.optInt("type"));
            c12886x91aa2b6d.G.putBoolean("isHomePage", jSONObject.optBoolean("isHomePage"));
            c12886x91aa2b6d.G.putString("query", jSONObject.optString("query"));
            c12886x91aa2b6d.G.putString("extParams", jSONObject.optString("extParams"));
            c12886x91aa2b6d.G.putString("navBarParams", jSONObject.optString("navBarParams"));
            wv4.a aVar = new wv4.a(new wv4.b(activity));
            aVar.b(57, optString);
            c12886x91aa2b6d.f174581f = 1;
            aVar.f174665d = c12886x91aa2b6d;
            aVar.A(true, 2);
        } else {
            java.lang.String optString2 = jSONObject.optString("bizKey");
            java.lang.String optString3 = jSONObject.optString("iconUrl");
            java.lang.String optString4 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            java.lang.String optString5 = jSONObject.optString("displaySourceName");
            long optLong = jSONObject.optLong("createTime");
            r45.ax5 ax5Var = new r45.ax5();
            ax5Var.set(0, java.lang.Integer.valueOf(jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)));
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = eVar.f381610a;
            if (c16601x7ed0e40c != null) {
                c16601x7ed0e40c.f66791xc8a07680 = optString2;
                z17 = true;
                c16601x7ed0e40c.v0().set(1, optString4);
                c16601x7ed0e40c.v0().set(5, optString3);
                c16601x7ed0e40c.f66790x225a93cf = ax5Var.mo14344x5f01b1f6();
                c16601x7ed0e40c.v0().set(0, optString5);
                c16601x7ed0e40c.f66789xac3be4e = j17;
            } else {
                z17 = true;
            }
            eVar.l(bitmap, z17);
            eVar.B(z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 b18 = env.b();
        if (b18 == null) {
            return true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("bizKey", jSONObject.optString("bizKey"));
        b18.mo70207xf5bc2045(162, bundle);
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
