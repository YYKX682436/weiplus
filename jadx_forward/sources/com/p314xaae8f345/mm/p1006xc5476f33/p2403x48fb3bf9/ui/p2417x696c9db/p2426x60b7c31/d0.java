package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class d0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0 f266573d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f266574e;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0 d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0();
        f266573d = d0Var;
        f266574e = cf.b.a(d0Var);
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("0", com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(msg.f422323a, "appid"));
        intent.putExtra("default_fileid", com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(msg.f422323a, "defaultAvatarFileId"));
        java.lang.Object obj = msg.f422323a.get("editAvatarInfo");
        org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
        if (jSONObject != null) {
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, env.f422393a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4w));
            intent.putExtra("extra_is_edit_page", true);
            intent.putExtra("extra_edit_avatar_id", jSONObject.optString(dm.i4.f66865x76d1ec5a));
            intent.putExtra("extra_edit_frefill_avatar_name", jSONObject.optString("nickname"));
            intent.putExtra("extra_edit_frefill_avatar_icon", jSONObject.optString("avatarUrl"));
        }
        android.content.Context context = env.f422393a;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, ".plugin.webview.ui.tools.CreateAvatarUI", intent, f266574e, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c0(env, msg));
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 490;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "createAvatar";
    }
}
