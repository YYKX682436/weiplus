package pk2;

/* loaded from: classes3.dex */
public final class o3 implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f437589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437591d;

    public o3(r45.t62 t62Var, pk2.q3 q3Var, android.view.View view, r45.t62 t62Var2) {
        this.f437588a = t62Var;
        this.f437589b = q3Var;
        this.f437590c = view;
        this.f437591d = t62Var2;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorRecommendOption", "onDispatch: actionName=" + str + ", data=" + obj);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "submitPickCity") && (obj instanceof org.json.JSONObject)) {
            r45.t62 t62Var = this.f437588a;
            pk2.q3 q3Var = this.f437589b;
            android.view.View view = this.f437590c;
            r45.t62 t62Var2 = this.f437591d;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                org.json.JSONArray optJSONArray = ((org.json.JSONObject) obj).optJSONArray("areas");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (optJSONArray != null) {
                    if (!(optJSONArray.length() > 0)) {
                        optJSONArray = null;
                    }
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i18 = 0; i18 < length; i18++) {
                            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                            if (optJSONObject != null) {
                                java.lang.String string = optJSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                                if (string == null) {
                                    string = "";
                                }
                                int optInt = optJSONObject.optInt("adcode", 0);
                                arrayList.add(string);
                                arrayList2.add(java.lang.Integer.valueOf(optInt));
                            }
                        }
                    }
                }
                pm0.v.X(new pk2.n3(t62Var, arrayList, arrayList2, ((org.json.JSONObject) obj).optInt("cityCount", 0), q3Var, view, t62Var2));
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AnchorRecommendOption", m143898xd4a2fc34, "onDispatch: parse json error", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
