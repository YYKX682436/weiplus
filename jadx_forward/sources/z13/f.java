package z13;

/* loaded from: classes12.dex */
public final class f extends wm3.a {

    /* renamed from: s, reason: collision with root package name */
    public static final z13.a f550930s = new z13.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final t50.e f550931d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v f550932e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f550933f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f550934g;

    /* renamed from: h, reason: collision with root package name */
    public int f550935h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f550936i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f550937m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f550938n;

    /* renamed from: o, reason: collision with root package name */
    public k23.r2 f550939o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f550940p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f550941q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f550942r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.app.Activity m80379x76847179 = m80379x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = m80379x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) m80379x76847179 : null;
        if (activityC15607x502bbbb2 != null) {
            z13.d dVar = new z13.d(this);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q0 q0Var = activityC15607x502bbbb2.G1;
            java.util.ArrayList arrayList = (java.util.ArrayList) q0Var.f219678b;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            z13.e eVar = new z13.e(this);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) q0Var.f219678b;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        this.f550931d = new t50.e();
        this.f550934g = "";
        this.f550938n = "";
        this.f550939o = k23.r2.f385216e;
        this.f550940p = "";
        this.f550941q = "";
        this.f550942r = jz5.h.b(z13.b.f550925d);
    }

    public static void T6(z13.f fVar, java.lang.Boolean bool, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        boolean z19 = (i17 & 2) != 0 ? false : z17;
        boolean z27 = (i17 & 4) != 0 ? false : z18;
        android.app.Activity m80379x76847179 = fVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) m80379x76847179;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = fVar.f550932e;
        android.view.View view = null;
        java.lang.Boolean valueOf = vVar != null ? java.lang.Boolean.valueOf(vVar.f219867z) : null;
        if (bool == null || valueOf == null) {
            return;
        }
        if (z19 || z27) {
            java.util.List list = activityC15607x502bbbb2.L1.f219685q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((t13.k) obj2).mo9548xfb85f7b0() == 256) {
                        break;
                    }
                }
            }
            j23.y yVar = obj2 instanceof j23.y ? (j23.y) obj2 : null;
            if (yVar != null) {
                z13.c cVar = new z13.c(bool, valueOf);
                yVar.f378837w = cVar;
                e23.b1 b1Var = yVar.f378836v;
                if (b1Var != null) {
                    cVar.mo146xb9724478(b1Var);
                }
            }
        }
        if (!z19 || z27) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(c23.c0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            c23.c0 c0Var = (c23.c0) a17;
            if (!bool.booleanValue()) {
                em.l0 l0Var = c0Var.f119551t;
                if (l0Var != null) {
                    android.widget.LinearLayout linearLayout = l0Var.f336064c;
                    android.view.View view2 = l0Var.f336062a;
                    if (linearLayout == null) {
                        l0Var.f336064c = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.f568138uy4);
                    }
                    l0Var.f336064c.setVisibility(0);
                    if (l0Var.f336068g == null) {
                        l0Var.f336068g = view2.findViewById(com.p314xaae8f345.mm.R.id.t4c);
                    }
                    android.view.View view3 = l0Var.f336068g;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view4 = c0Var.f119549r;
                if (view4 == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (!valueOf.booleanValue()) {
                em.l0 l0Var2 = c0Var.f119551t;
                if (l0Var2 != null) {
                    if (l0Var2.f336068g == null) {
                        l0Var2.f336068g = l0Var2.f336062a.findViewById(com.p314xaae8f345.mm.R.id.t4c);
                    }
                    view = l0Var2.f336068g;
                }
                if (view == null) {
                    return;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                android.view.View view5 = view;
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "hideTopDivideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "hideTopDivideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            em.l0 l0Var3 = c0Var.f119551t;
            if (l0Var3 != null) {
                if (l0Var3.f336064c == null) {
                    l0Var3.f336064c = (android.widget.LinearLayout) l0Var3.f336062a.findViewById(com.p314xaae8f345.mm.R.id.f568138uy4);
                }
                view = l0Var3.f336064c;
            }
            if (view != null) {
                view.setVisibility(8);
            }
            android.view.View view6 = c0Var.f119549r;
            if (view6 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "hideRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "hideRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public static final z13.f Y6(android.content.Context context) {
        return f550930s.a(context);
    }

    public final void U6(org.json.JSONObject extParams) {
        java.lang.String optString;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extParams, "extParams");
        try {
            org.json.JSONArray Z6 = Z6();
            int length = Z6.length();
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length; i19++) {
                org.json.JSONObject optJSONObject = Z6.optJSONObject(i19);
                if (optJSONObject != null && (optString = optJSONObject.optString("key")) != null) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "globalSearchDeepThink")) {
                        i17 = optJSONObject.optInt("selected", 0);
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "globalSearchAskRealPeople")) {
                        i18 = optJSONObject.optInt("selected", 0);
                    }
                }
            }
            extParams.put("isFromVoice", this.f550939o.f385220d);
            extParams.put("voiceId", this.f550941q);
            int i27 = 1;
            extParams.put("isKeyboard", this.f550936i ? 1 : 0);
            extParams.put("uiStyle", f7() ? 2 : 1);
            extParams.put("isDeepThink", i17);
            extParams.put("isAskRealPeople", i18);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f550932e;
            extParams.put("changeReason", vVar != null ? vVar.m63649x76bd27c7() : 0);
            extParams.put("actionType", this.f550937m ? 3216 : 3013);
            xj.m mVar = (xj.m) ((jz5.n) this.f550942r).mo141623x754a37bb();
            if (mVar == null) {
                i27 = 0;
            } else if (mVar.f536293h) {
                i27 = 2;
            }
            extParams.put("yuanbao_user_state", i27);
            extParams.put("colorStyle", ((java.lang.Number) ((jz5.n) k23.c1.f385069h.a(m80379x76847179()).f385071d.f385065e).mo141623x754a37bb()).intValue());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSAISearchManagerUIC", e17, "", new java.lang.Object[0]);
        }
    }

    public final void V6(org.json.JSONObject extParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extParams, "extParams");
        try {
            g23.h hVar = this.f550931d.f497228g;
            boolean z17 = hVar.f349451b;
            boolean z18 = hVar.f349452c;
            extParams.put("AIMergeSearch", hVar.f349450a);
            W6(extParams, z17, z18);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSAISearchManagerUIC", e17, "", new java.lang.Object[0]);
        }
    }

    public final void W6(org.json.JSONObject jSONObject, boolean z17, boolean z18) {
        t50.e eVar = this.f550931d;
        try {
            jSONObject.put("hideSearchBar", z17);
            jSONObject.put("hideNavBar", z18);
            jSONObject.put("aiSearchPositionType", ((java.lang.Number) ((jz5.n) eVar.f497224c).mo141623x754a37bb()).intValue());
            jSONObject.put("aiSearchStyle", ((java.lang.Number) ((jz5.n) eVar.f497223b).mo141623x754a37bb()).intValue());
            jSONObject.put("webSearchStyle", eVar.a());
            jSONObject.put("localSearchQuery", this.f550934g);
            jSONObject.put("checkboxes", Z6());
            jSONObject.put("keyboardHeight", this.f550935h);
            jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, java.lang.String.valueOf(o13.p.f423783c));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSAISearchManagerUIC", e17, "", new java.lang.Object[0]);
        }
    }

    public final org.json.JSONObject X6(java.lang.String configExtParams, java.lang.String configNavBarParms) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configExtParams, "configExtParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configNavBarParms, "configNavBarParms");
        org.json.JSONObject jSONObject = new org.json.JSONObject(configNavBarParms);
        boolean optBoolean = jSONObject.optBoolean("hideSearchBar", true);
        boolean optBoolean2 = jSONObject.optBoolean("hideNavBar", false);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject(configExtParams);
        if (!jSONObject2.has("chatbot")) {
            jSONObject2.put("chatbot", 1);
        }
        W6(jSONObject2, optBoolean, optBoolean2);
        jSONObject2.put("hideSearchInput", optBoolean);
        return jSONObject2;
    }

    public final org.json.JSONArray Z6() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f550931d.f497228g.f349453d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                g23.g gVar = (g23.g) arrayList.get(i17);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("key", gVar.f349447a);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, gVar.f349448b);
                jSONObject.put("selected", gVar.f349449c ? 1 : 0);
                jSONArray.put(jSONObject);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSAISearchManagerUIC", e17, "", new java.lang.Object[0]);
        }
        return jSONArray;
    }

    public final org.json.JSONObject a7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        U6(jSONObject);
        return jSONObject;
    }

    public final java.lang.String b7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        U6(jSONObject);
        java.lang.String b17 = fp.s0.b(jSONObject.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "encode(...)");
        return b17;
    }

    public final org.json.JSONObject c7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        V6(jSONObject);
        return jSONObject;
    }

    public final org.json.JSONObject d7() {
        t50.e eVar = this.f550931d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String valueOf = java.lang.String.valueOf(o13.p.f423783c);
            java.lang.String valueOf2 = java.lang.String.valueOf(o13.p.f423784d);
            java.lang.String valueOf3 = java.lang.String.valueOf(o13.p.f423784d);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("key", "webSearchStyle");
            jSONObject2.put("uintValue", eVar.a());
            jSONArray.put(jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("key", "keyboardHeight");
            jSONObject3.put("uintValue", this.f550935h);
            jSONArray.put(jSONObject3);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("key", "AIMergeSearch");
            jSONObject4.put("uintValue", eVar.f497228g.f349450a ? 1 : 0);
            jSONArray.put(jSONObject4);
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("key", "lastSessionID");
            jSONObject5.put("textValue", valueOf);
            jSONArray.put(jSONObject5);
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put("key", "lastSearchId");
            jSONObject6.put("textValue", valueOf2);
            jSONArray.put(jSONObject6);
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            jSONObject7.put("key", "lastRequestID");
            jSONObject7.put("textValue", valueOf3);
            jSONArray.put(jSONObject7);
            jSONObject.put("extReqParams", jSONArray);
            jSONObject.put("checkboxes", Z6());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSAISearchManagerUIC", e17, "", new java.lang.Object[0]);
        }
        return jSONObject;
    }

    public final boolean e7() {
        return this.f550931d.a() > 0 && com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h();
    }

    public final boolean f7() {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(m158354x19263085())) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f550932e;
        return vVar != null && vVar.f219867z;
    }

    public final void g7(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[aisearch] setText ".concat(text));
        this.f550937m = true;
        this.f550938n = text;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f550932e;
        if (vVar != null) {
            vVar.m81064x765074af(text);
        }
    }

    public final void h7(java.lang.String text, k23.r2 voiceTextType, java.lang.String voiceID, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceTextType, "voiceTextType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceID, "voiceID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "nativeVoice: setVoiceText " + text + ", voiceTextType: " + voiceTextType);
        this.f550939o = voiceTextType;
        this.f550940p = text;
        this.f550941q = voiceID;
        if (!z17 || (vVar = this.f550932e) == null) {
            return;
        }
        vVar.m81064x765074af(text);
    }

    public final boolean i7() {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(m158354x19263085())) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f550932e;
        return vVar != null && vVar.D;
    }
}
