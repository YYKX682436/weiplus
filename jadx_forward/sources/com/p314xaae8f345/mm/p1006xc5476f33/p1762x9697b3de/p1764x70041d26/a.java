package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26;

/* loaded from: classes8.dex */
public class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.e {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f223605a = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f223606b;

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f223607c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f223608d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f223609e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f223610f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f223611g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f223612h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f223613i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f223614j;

    /* renamed from: k, reason: collision with root package name */
    public org.json.JSONArray f223615k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16058xd8b0e3d7 f223616l;

    /* renamed from: m, reason: collision with root package name */
    public int f223617m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.c f223618n;

    /* renamed from: o, reason: collision with root package name */
    public h63.k1 f223619o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f223620p;

    public a(android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, int i17, h63.k1 k1Var) {
        new org.json.JSONObject();
        this.f223608d = false;
        this.f223609e = "";
        this.f223610f = "";
        this.f223611g = "";
        this.f223616l = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16058xd8b0e3d7(0, null, null, null, null, null, 0, null, 0, 0);
        this.f223617m = 6;
        this.f223618n = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.c(this);
        this.f223620p = false;
        this.f223606b = context;
        this.f223607c = jSONObject;
        this.f223619o = k1Var;
        a(str, i17);
        b();
    }

    public final void a(java.lang.String str, int i17) {
        if (!this.f223607c.optBoolean("canJoin", false)) {
            this.f223608d = false;
            return;
        }
        this.f223608d = true;
        this.f223609e = this.f223607c.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        this.f223610f = this.f223607c.optString("subTitle", "");
        this.f223611g = this.f223607c.optString("statusWording", "");
        this.f223615k = this.f223607c.optJSONArray("condition");
        this.f223617m = this.f223607c.optInt("defaultConditionIndex");
        java.lang.String str2 = this.f223609e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16058xd8b0e3d7 c16058xd8b0e3d7 = this.f223616l;
        c16058xd8b0e3d7.f223563e = str2;
        c16058xd8b0e3d7.f223564f = this.f223610f;
        c16058xd8b0e3d7.f223565g = this.f223611g;
        c16058xd8b0e3d7.f223566h = this.f223607c.optString("teamupExtraData", "");
        c16058xd8b0e3d7.f223567i = str;
        c16058xd8b0e3d7.f223568m = i17;
        c16058xd8b0e3d7.f223562d = this.f223617m;
        c16058xd8b0e3d7.f223569n = this.f223607c.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
        c16058xd8b0e3d7.f223570o = this.f223607c.optInt("sourceType");
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16058xd8b0e3d7 c16058xd8b0e3d7;
        org.json.JSONObject jSONObject;
        boolean z17 = this.f223608d;
        android.content.Context context = this.f223606b;
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context, 0, false, false);
            this.f223605a = y1Var;
            y1Var.f293570s = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$a
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2
                /* renamed from: onDismiss */
                public final void mo51018xb349b3ab() {
                    h63.k1 k1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a.this.f223619o;
                    if (k1Var != null) {
                        ((mc1.C29140x31a3f6) k1Var).a(0, 0, true);
                    }
                }
            };
            y1Var.f293566o = true;
            y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569572f4);
            ((android.view.ViewGroup) this.f223605a.f293560f.findViewById(com.p314xaae8f345.mm.R.id.gpy)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a.this;
                    aVar.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array2);
                    aVar.f223605a.q();
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f223605a.s();
            return;
        }
        if (this.f223605a == null) {
            this.f223605a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context, 0, true, false);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context, 0, false, false);
            this.f223605a = y1Var2;
            y1Var2.f293570s = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$c
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2
                /* renamed from: onDismiss */
                public final void mo51018xb349b3ab() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a.this;
                    h63.k1 k1Var = aVar.f223619o;
                    if (k1Var == null || aVar.f223620p) {
                        return;
                    }
                    ((mc1.C29140x31a3f6) k1Var).a(0, 0, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16058xd8b0e3d7 c16058xd8b0e3d72 = aVar.f223616l;
                    c16058xd8b0e3d72.f223571p = 3;
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433719y, null, 0, c16058xd8b0e3d72), p60.q.class, null);
                }
            };
            y1Var2.f293566o = true;
            y1Var2.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569576f8);
            android.view.View view = this.f223605a.f293560f;
            view.findViewById(com.p314xaae8f345.mm.R.id.gpx).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a.this;
                    aVar.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array2);
                    aVar.f223620p = true;
                    aVar.f223605a.q();
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433718x, null, 0, aVar.f223616l), p60.q.class, new com.p314xaae8f345.mm.p794xb0fa9b5e.r() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$g
                        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
                        public final void a(java.lang.Object obj) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a aVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a.this;
                            aVar2.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16054xbab20ef0 c16054xbab20ef0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16054xbab20ef0) ((com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57) obj).f148644g;
                            if (aVar2.f223619o != null && aVar2.f223620p) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLivePlayGameAnchorInviteWidget", "zbqzbq callback");
                                ((mc1.C29140x31a3f6) aVar2.f223619o).a(aVar2.f223617m, c16054xbab20ef0.f223556d, false);
                                aVar2.f223620p = false;
                            }
                            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.b(aVar2, c16054xbab20ef0));
                        }
                    });
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            ((android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.gpy)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$e
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a.this;
                    aVar.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array2);
                    aVar.f223605a.q();
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f223612h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gpz);
            this.f223613i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f566676gq0);
            this.f223614j = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f566677gq1);
            ((android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.f566678gq2)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$f
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a.this;
                    aVar.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array2);
                    org.json.JSONArray jSONArray = aVar.f223615k;
                    int i17 = aVar.f223617m;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.c cVar = aVar.f223618n;
                    java.util.ArrayList arrayList3 = cVar.f223632g;
                    try {
                        arrayList3.clear();
                        for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                            arrayList3.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.f(cVar, jSONObject2.optInt("conditionId"), jSONObject2.optString("wording")));
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLivePlayGameConditionChoosePage", "condition size:%d", java.lang.Integer.valueOf(arrayList3.size()));
                    } catch (org.json.JSONException unused) {
                    }
                    cVar.f223633h = i17;
                    aVar.f223605a.h(cVar);
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        this.f223612h.setText(this.f223609e);
        this.f223613i.setText(this.f223610f);
        this.f223614j.setText(this.f223611g);
        android.widget.TextView textView = (android.widget.TextView) this.f223605a.f293560f.findViewById(com.p314xaae8f345.mm.R.id.krq);
        int i17 = 0;
        while (true) {
            int length = this.f223615k.length();
            c16058xd8b0e3d7 = this.f223616l;
            if (i17 >= length) {
                break;
            }
            try {
                jSONObject = this.f223615k.getJSONObject(i17);
            } catch (java.lang.Exception e17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLivePlayGameAnchorInviteWidget", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
            if (jSONObject.optInt("conditionId") == this.f223617m) {
                textView.setText(jSONObject.optString("wording"));
                break;
            }
            if (i17 == this.f223615k.length() - 1) {
                int optInt = jSONObject.optInt("conditionId");
                this.f223617m = optInt;
                c16058xd8b0e3d7.f223562d = optInt;
                textView.setText(jSONObject.optString("wording"));
            }
            i17++;
        }
        this.f223605a.s();
        c16058xd8b0e3d7.f223571p = 1;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433719y, null, 0, c16058xd8b0e3d7), p60.q.class, null);
    }
}
