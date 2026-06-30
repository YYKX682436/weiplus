package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class wb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.wb f268143d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.wb();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f268144e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f268145f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        f268144e = env;
        f268145f = msg;
        android.content.Context context = env.f422393a;
        java.lang.String str = (java.lang.String) msg.f422323a.get("titleName");
        new java.util.ArrayList();
        try {
            java.lang.Object obj = msg.f422323a.get("selectedUserNames");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.lang.String) obj);
            int length = jSONArray.length();
            java.lang.String[] strArr = new java.lang.String[length];
            for (int i17 = 0; i17 < length; i17++) {
                strArr[i17] = jSONArray.get(i17);
            }
            arrayList = nf.e.e(strArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiSelectContacts", "Failed to parse selectedUserNames: " + e17.getMessage());
            arrayList = new java.util.ArrayList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiSelectContacts", "input json selectedUserNames: " + arrayList);
        rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
        if (str == null) {
            str = env.f422393a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nja);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        ((qd0.q0) e1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", str);
        if (!arrayList.isEmpty()) {
            intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
        }
        intent.putExtra("default_multi_search", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(c01.z1.r());
        arrayList2.add("weixin");
        arrayList2.add("filehelper");
        arrayList2.addAll(c01.e2.i());
        arrayList2.addAll(c01.e2.h());
        arrayList2.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        arrayList2.remove("message_fold");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
            intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ","));
        }
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.k.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0.class);
        intent.putExtra("KOrientation", 1);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.r0.class);
        pf5.j0.a(intent, cj5.j0.class);
        intent.putExtra("KEY_IS_ONLY_MULTI_SELECT_MODE", true);
        intent.putExtra("max_limit_num", 9);
        intent.putExtra("too_many_member_tip_string", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifr, 9));
        intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
        pf5.j0.a(intent, cj5.y2.class);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiSelectContacts", "ui is MMActivity");
            ((com.p314xaae8f345.mm.ui.bd) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).m78751x5dc77fb5(intent)).f279410a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.tb(hashMap);
        } else if ((context instanceof com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) && (context instanceof q80.z)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiSelectContacts", "env.context is SwipeBackActivity  && env.context is ILiteAppFeatureService.ISetOnActivityResult");
            ((q80.z) context).R1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ub.f268095a);
            ((com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) context).startActivityForResult(intent, 223);
        } else {
            env.f422396d.e(msg.f422546c, msg.f422552i + ":fail ui is unknown type", hashMap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiSelectContacts", "ui is unknown");
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 556;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "selectContacts";
    }
}
