package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes7.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static int f162222a;

    /* renamed from: b, reason: collision with root package name */
    public static int f162223b;

    /* renamed from: c, reason: collision with root package name */
    public static long f162224c;

    /* renamed from: d, reason: collision with root package name */
    public static long f162225d;

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, android.view.View view, int i17, android.view.MotionEvent motionEvent, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 oVar;
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float x17 = motionEvent.getX(actionIndex);
        float y17 = motionEvent.getY(actionIndex);
        if (f162222a == motionEvent.getAction() && f162223b == pointerId && f162224c == motionEvent.getEventTime() && f162225d == motionEvent.getDownTime()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InsertViewTouchEventDispatch", "action:%d, eventId:%d, eventTime:%d, downTime:%d, don't send Duplicate event", java.lang.Integer.valueOf(motionEvent.getAction()), java.lang.Integer.valueOf(pointerId), java.lang.Long.valueOf(motionEvent.getEventTime()), java.lang.Long.valueOf(motionEvent.getDownTime()));
            return;
        }
        f162222a = motionEvent.getAction();
        f162223b = pointerId;
        f162224c = motionEvent.getEventTime();
        f162225d = motionEvent.getDownTime();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
            jSONObject.put("viewId", i17);
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InsertViewTouchEventDispatch", "action:%d, eventId:%d, eventTime:%d, downTime:%d", java.lang.Integer.valueOf(motionEvent.getAction()), java.lang.Integer.valueOf(pointerId), java.lang.Long.valueOf(f162224c), java.lang.Long.valueOf(f162225d));
        int action = motionEvent.getAction();
        if (action == 0) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put(dm.i4.f66865x76d1ec5a, pointerId);
                    jSONObject2.put("x", x17 / ik1.w.f());
                    jSONObject2.put("y", y17 / ik1.w.f());
                } catch (org.json.JSONException unused2) {
                }
                jSONObject.put("touch", jSONObject2);
            } catch (org.json.JSONException unused3) {
            }
            oVar = new if1.o();
        } else if (action != 1) {
            int i18 = 0;
            if (action == 2) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                try {
                    jSONObject.put("touches", jSONArray);
                } catch (org.json.JSONException unused4) {
                }
                if1.r[] b17 = b(motionEvent);
                if (b17.length > 0) {
                    while (i18 < b17.length) {
                        jSONArray.put(b17[i18].a());
                        i18++;
                    }
                }
                oVar = new if1.p();
            } else if (action != 3) {
                oVar = null;
            } else {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                try {
                    jSONObject.put("touches", jSONArray2);
                } catch (org.json.JSONException unused5) {
                }
                if1.r[] b18 = b(motionEvent);
                if (b18.length > 0) {
                    while (i18 < b18.length) {
                        jSONArray2.put(b18[i18].a());
                        i18++;
                    }
                }
                oVar = new if1.n();
            }
        } else {
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put(dm.i4.f66865x76d1ec5a, pointerId);
                    jSONObject3.put("x", x17 / ik1.w.f());
                    jSONObject3.put("y", y17 / ik1.w.f());
                } catch (org.json.JSONException unused6) {
                }
                jSONObject.put("touch", jSONObject3);
            } catch (org.json.JSONException unused7) {
            }
            oVar = new if1.q();
        }
        if (oVar != null && z17) {
            oVar.r(jSONObject.toString());
            tVar.p(oVar);
        } else if (oVar != null) {
            oVar.r(jSONObject.toString());
            tVar.i(oVar, null);
        }
    }

    public static if1.r[] b(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < motionEvent.getPointerCount(); i17++) {
            if1.r rVar = new if1.r();
            rVar.f372626a = motionEvent.getPointerId(i17);
            rVar.f372627b = motionEvent.getX(i17);
            rVar.f372628c = motionEvent.getY(i17);
            arrayList.add(rVar);
        }
        if1.r[] rVarArr = new if1.r[arrayList.size()];
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            rVarArr[i18] = (if1.r) arrayList.get(i18);
        }
        return rVarArr;
    }
}
