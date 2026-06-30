package ma0;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma0.h f406670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b21.r f406671e;

    public g(ma0.h hVar, b21.r rVar) {
        this.f406670d = hVar;
        this.f406671e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ma0.h hVar = this.f406670d;
        b21.r rVar = this.f406671e;
        synchronized (hVar) {
            if (rVar != null) {
                java.lang.String str = rVar.f98891t;
                if (str != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, hVar.f406679n)) {
                    java.lang.String j17 = gm0.j1.b().j();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    try {
                        org.json.JSONArray jSONArray = new org.json.JSONObject(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(hVar.f406674f + j17).getString(hVar.f406675g, "")).getJSONArray(hVar.f406676h);
                        int length = jSONArray.length();
                        for (int i17 = 0; i17 < length; i17++) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(jSONArray.getString(i17));
                            ma0.e eVar = new ma0.e(hVar);
                            try {
                                eVar.f406665a = jSONObject.getString(hVar.f406677i);
                                eVar.f406666b = jSONObject.getString(hVar.f406678m);
                                arrayList.add(eVar);
                            } catch (org.json.JSONException unused) {
                            }
                        }
                    } catch (org.json.JSONException unused2) {
                    }
                    ma0.e eVar2 = new ma0.e(hVar);
                    eVar2.f406665a = rVar.f98881g;
                    eVar2.f406666b = rVar.f98882h;
                    if (arrayList.contains(eVar2)) {
                        arrayList.remove(eVar2);
                    }
                    arrayList.add(0, eVar2);
                    int size = arrayList.size();
                    java.util.List list = arrayList;
                    if (size > 10) {
                        list = arrayList.subList(0, 10);
                    }
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    int size2 = list.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        ma0.e eVar3 = (ma0.e) list.get(i18);
                        jSONObject3.put(hVar.f406677i, eVar3.f406665a);
                        jSONObject3.put(hVar.f406678m, eVar3.f406666b);
                        jSONArray2.put(i18, jSONObject3);
                    }
                    jSONObject2.put(hVar.f406676h, jSONArray2);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(hVar.f406674f + j17).putString(hVar.f406675g, jSONObject2.toString());
                }
            }
        }
    }
}
