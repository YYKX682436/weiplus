package sg0;

@j95.b
/* loaded from: classes8.dex */
public class u3 extends jm0.o implements tg0.w1 {

    /* renamed from: m, reason: collision with root package name */
    public boolean f489355m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f489356n = new java.util.HashMap();

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(ug0.y.class);
        set.add(ug0.z.class);
        if (!ug0.q.f509005n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebSearchService", "CommonSyncRedDot disabled.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebSearchService", "CommonSyncRedDot enabled, importing WebSearchCommonSyncRedDotFSC.");
            set.add(ug0.q.class);
        }
    }

    public void Zi(j75.b bVar) {
        j75.f Ai = Ai();
        j75.f fVar = null;
        if (Ai != null && (Ai.mo140437x75286adb() instanceof ug0.x)) {
            fVar = Ai();
        }
        if (fVar != null) {
            fVar.B3(bVar);
        }
    }

    public tg0.u1 aj() {
        return ug0.q.T6(this).f509008h;
    }

    public boolean bj(java.lang.String str) {
        ug0.q T6 = ug0.q.T6(this);
        if (!ug0.q.f509005n) {
            return false;
        }
        if ((str == null || str.length() == 0) || !((java.util.Set) ((jz5.n) T6.f509006f).mo141623x754a37bb()).contains(str)) {
            return false;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Search.Entrance")) {
            return ug0.q.f509003i;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Search.MentionEntrance")) {
            return ug0.q.f509004m;
        }
        return false;
    }

    public boolean cj() {
        boolean z17 = j62.e.g().i("clicfg_android_fts_vertical_search_new_style", 1, true, true) > 0;
        if (z17 != this.f489355m) {
            this.f489355m = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebSearchService", "useVerticalSearchNewStyle: ".concat(z17 ? "true" : "false"));
        }
        return this.f489355m;
    }

    public void fj(int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("logid", java.lang.Integer.valueOf(i17));
        hashMap.put("log_buffer", str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONArray.put(new org.json.JSONObject(hashMap));
            jSONObject2.put("clientversion", o45.wf.f424562g);
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280, o45.wf.f424556a);
            jSONObject2.put(ya.b.f77483x2837e24a, jSONArray);
            jSONObject.put("cgiName", "MMDataReport");
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2);
            gm0.j1.d().g(new su4.s1("test", jSONObject.toString(), -1));
        } catch (org.json.JSONException unused) {
        }
    }

    public void hj(java.lang.String str, boolean z17) {
        ug0.q T6 = ug0.q.T6(this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setRedDotShowingAtPath, isCommonSyncRedDotEnabled: ");
        boolean z18 = ug0.q.f509005n;
        sb6.append(z18);
        sb6.append(", redDotPath: ");
        sb6.append(str);
        sb6.append(", isShowing: ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", sb6.toString());
        if (z18) {
            if ((str == null || str.length() == 0) || !((java.util.Set) ((jz5.n) T6.f509006f).mo141623x754a37bb()).contains(str)) {
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Search.Entrance")) {
                ug0.q.f509003i = z17;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Search.MentionEntrance")) {
                ug0.q.f509004m = z17;
            }
        }
    }
}
