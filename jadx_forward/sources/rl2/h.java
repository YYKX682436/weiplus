package rl2;

/* loaded from: classes3.dex */
public final class h extends be2.f {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f478730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l75.k0 db6) {
        super(db6, ce2.i.V1, "FinderLiveGiftInfo", dm.o4.Q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        ce2.g gVar = ce2.i.U1;
        this.f478730e = db6;
    }

    public java.util.LinkedHashMap D0() {
        try {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            org.json.JSONObject jSONObject = new org.json.JSONObject(gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GIFT_TAB_INFO_STRING_SYNC, ""));
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    cf.f.b(optJSONArray, new rl2.g(linkedList));
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                linkedHashMap.put(next, linkedList);
            }
            return linkedHashMap;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftStorage", "[getLiveGiftTabInfo] e:" + e17.getMessage());
            return null;
        }
    }

    public int J0(ce2.i giftInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftInfo, "giftInfo");
        int m17 = (int) this.f478730e.m("FinderLiveGiftInfo", "rewardProductId", giftInfo.mo9763xeb27878e());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftStorage", "insert gift " + giftInfo + ' ' + m17);
        return m17;
    }

    @Override // be2.f
    public void y0(java.util.LinkedList linkedList) {
        jz5.f0 f0Var;
        if (linkedList != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.sv1 sv1Var = (r45.sv1) it.next();
                    java.lang.String m75945x2fec8307 = sv1Var.m75945x2fec8307(0);
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.LinkedList m75941xfb821914 = sv1Var.m75941xfb821914(1);
                    if (m75941xfb821914 != null) {
                        java.util.Iterator it6 = m75941xfb821914.iterator();
                        while (it6.hasNext()) {
                            jSONArray.put(((r45.kv1) it6.next()).m75945x2fec8307(0));
                        }
                    }
                    jSONObject.put(m75945x2fec8307, jSONArray);
                }
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GIFT_TAB_INFO_STRING_SYNC, jSONObject.toString());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftStorage", "[saveLiveGiftTabInfo] e:" + e17.getMessage());
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GIFT_TAB_INFO_STRING_SYNC, "");
        }
    }

    public java.util.List z0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f478730e.f("SELECT * FROM FinderLiveGiftInfo order by FinderLiveGiftInfo.giftIndex asc", null, 2);
        while (f17.moveToNext()) {
            ce2.i iVar = new ce2.i();
            iVar.mo9015xbf5d97fd(f17);
            arrayList.add(iVar);
        }
        f17.close();
        return arrayList;
    }
}
