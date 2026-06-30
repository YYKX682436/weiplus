package ik2;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ik2.c f373391a = new ik2.c();

    public final java.util.ArrayList a(java.lang.String str) {
        org.json.JSONArray jSONArray;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveFrameSetLayoutParam", "paramJson is empty");
            return arrayList;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFrameSetLayoutParam", "parseFrameSetParam:%s", str);
        try {
            jSONArray = new org.json.JSONArray(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderLiveFrameSetLayoutParam", e17, "parseFrameSetParam", new java.lang.Object[0]);
        }
        if (jSONArray.length() == 0) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            ik2.d dVar = new ik2.d();
            dVar.f373392a = jSONObject.getString(dm.i4.f66865x76d1ec5a);
            dVar.f373393b = jSONObject.getString("parentId");
            dVar.f373394c = jSONObject.optInt("portrait", 0) == 1;
            dVar.f373395d = jSONObject.optInt("landscape", 0) == 1;
            dVar.f373396e = jSONObject.optInt("clearScreen", 0) == 1;
            dVar.f373397f = (int) java.lang.Math.pow(2.0d, jSONObject.optInt("bit", 0));
            dVar.f373398g = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, jSONObject.optInt("marginTop", 0));
            dVar.f373399h = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, jSONObject.optInt("marginLeft", 0));
            dVar.f373400i = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, jSONObject.optInt("marginRight", 0));
            dVar.f373401j = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, jSONObject.optInt("marginBottom", 0));
            int optInt = jSONObject.optInt("width", 0);
            int optInt2 = jSONObject.optInt("height", 0);
            if (optInt >= 0) {
                dVar.f373402k = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optInt);
            } else {
                dVar.f373402k = optInt;
            }
            if (optInt2 >= 0) {
                dVar.f373403l = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optInt2);
            } else {
                dVar.f373403l = optInt2;
            }
            dVar.f373404m = jSONObject.optInt("alignParentTop", 0) == 1;
            dVar.f373405n = jSONObject.optInt("alignParentLeft", 0) == 1;
            dVar.f373406o = jSONObject.optInt("alignParentRight", 0) == 1;
            dVar.f373407p = jSONObject.optInt("alignParentBottom", 0) == 1;
            dVar.f373408q = jSONObject.optInt("alignParentStart", 0) == 1;
            dVar.f373409r = jSONObject.optInt("alignParentEnd", 0) == 1;
            dVar.f373410s = jSONObject.optInt("centerInParent", 0) == 1;
            dVar.f373411t = jSONObject.optInt("centerHorizontal", 0) == 1;
            dVar.f373412u = jSONObject.optInt("centerVertical", 0) == 1;
            jSONObject.optInt("alignWithParentIfMissing", 0);
            java.lang.String optString = jSONObject.optString("alignTop");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            dVar.f373413v = optString;
            java.lang.String optString2 = jSONObject.optString("alignBottom");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            dVar.f373414w = optString2;
            java.lang.String optString3 = jSONObject.optString("alignLeft");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            dVar.f373415x = optString3;
            java.lang.String optString4 = jSONObject.optString("alignRight");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
            dVar.f373416y = optString4;
            java.lang.String optString5 = jSONObject.optString("below");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
            dVar.f373417z = optString5;
            java.lang.String optString6 = jSONObject.optString("above");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString6, "optString(...)");
            dVar.A = optString6;
            java.lang.String optString7 = jSONObject.optString("toLeftOf");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString7, "optString(...)");
            dVar.B = optString7;
            java.lang.String optString8 = jSONObject.optString("toRightOf");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString8, "optString(...)");
            dVar.C = optString8;
            java.lang.String optString9 = jSONObject.optString("toStartOf");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString9, "optString(...)");
            dVar.D = optString9;
            java.lang.String optString10 = jSONObject.optString("toEndOf");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString10, "optString(...)");
            dVar.E = optString10;
            arrayList.add(dVar);
        }
        return arrayList;
    }
}
