package fb4;

/* loaded from: classes11.dex */
public abstract class e {
    public static final void a(android.content.Context context, java.lang.String callbackId, org.json.JSONObject paramsJson, eb4.k callbackInterface) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList;
        java.lang.String str3;
        java.util.ArrayList arrayList2;
        java.lang.Object obj;
        java.util.ArrayList arrayList3;
        int i17;
        java.util.ArrayList arrayList4;
        kb4.c cVar;
        java.lang.Object obj2;
        java.util.Iterator it;
        boolean z17;
        java.lang.String str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleOpenWheelPicker", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackId, "callbackId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsJson, "paramsJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackInterface, "callbackInterface");
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WheelPickerCaller", "handleOpenWheelPicker error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOpenWheelPicker", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(paramsJson.optString("pickerParams"));
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (optString == null) {
                optString = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseJson", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
            int optInt = jSONObject.optInt("deep");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("default");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.String str5 = "k";
            if (optJSONArray != null) {
                arrayList = arrayList5;
                int length = optJSONArray.length();
                str = "handleOpenWheelPicker";
                int i18 = 0;
                while (i18 < length) {
                    int i19 = length;
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                    org.json.JSONArray jSONArray = optJSONArray;
                    java.lang.String optString2 = optJSONObject != null ? optJSONObject.optString("k") : null;
                    java.lang.String str6 = str4;
                    java.lang.String str7 = optString2 == null ? "" : optString2;
                    java.lang.String optString3 = optJSONObject != null ? optJSONObject.optString(org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V) : null;
                    if (optString3 == null) {
                        optString3 = "";
                    }
                    arrayList6.add(new kb4.d(str7, optString3));
                    i18++;
                    length = i19;
                    optJSONArray = jSONArray;
                    str4 = str6;
                }
                str2 = str4;
            } else {
                str = "handleOpenWheelPicker";
                str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller";
                arrayList = arrayList5;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("transferTable");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                int i27 = 0;
                while (i27 < length2) {
                    int i28 = length2;
                    org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i27);
                    java.lang.String optString4 = optJSONObject2.optString(str5);
                    org.json.JSONArray jSONArray2 = optJSONArray2;
                    java.lang.String str8 = optString4 == null ? "" : optString4;
                    java.lang.String optString5 = optJSONObject2.optString(org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
                    linkedHashMap.put(str8, optString5);
                    i27++;
                    length2 = i28;
                    str5 = str5;
                    optJSONArray2 = jSONArray2;
                }
            }
            org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            kb4.c cVar2 = new kb4.c("root", "root", arrayList7, null);
            if (optJSONArray3 != null) {
                obj = null;
                arrayList2 = arrayList6;
                str3 = optString;
                i17 = 0;
                arrayList3 = arrayList;
                fb4.b.f342406a.a(optJSONArray3, arrayList7, cVar2, 0, optInt, linkedHashMap);
            } else {
                str3 = optString;
                arrayList2 = arrayList6;
                obj = null;
                arrayList3 = arrayList;
                i17 = 0;
            }
            int i29 = i17;
            kb4.c cVar3 = cVar2;
            while (i29 < optInt) {
                java.util.List a17 = cVar3.a();
                if (a17 != null) {
                    java.util.Iterator it6 = a17.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            arrayList4 = arrayList2;
                            cVar = cVar3;
                            obj2 = obj;
                            break;
                        }
                        obj2 = it6.next();
                        kb4.c cVar4 = (kb4.c) obj2;
                        if (arrayList2.size() > i29) {
                            java.lang.String b17 = cVar4.b();
                            arrayList4 = arrayList2;
                            kb4.d dVar = (kb4.d) arrayList4.get(i29);
                            dVar.getClass();
                            cVar = cVar3;
                            it = it6;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                            z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, dVar.f387777a);
                        } else {
                            arrayList4 = arrayList2;
                            cVar = cVar3;
                            it = it6;
                            z17 = false;
                        }
                        if (z17) {
                            break;
                        }
                        cVar3 = cVar;
                        arrayList2 = arrayList4;
                        it6 = it;
                    }
                    kb4.c cVar5 = (kb4.c) obj2;
                    if (cVar5 != null) {
                        arrayList3.add(cVar5);
                        cVar3 = cVar5;
                        i29++;
                        arrayList2 = arrayList4;
                    }
                } else {
                    arrayList4 = arrayList2;
                    cVar = cVar3;
                }
                cVar3 = cVar;
                i29++;
                arrayList2 = arrayList4;
            }
            fb4.a aVar = new fb4.a(optInt, cVar2, arrayList3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseJson", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
            lb4.c cVar6 = new lb4.c(context, aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 2);
            z2Var.m(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            z2Var.o(0);
            fb4.c cVar7 = new fb4.c(callbackInterface, callbackId, z2Var);
            fb4.d dVar2 = new fb4.d(cVar6, callbackInterface, callbackId, z2Var);
            z2Var.D = cVar7;
            z2Var.E = dVar2;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setGravity(17);
            int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562135aa1);
            textView.setText(str3);
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            textView.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560426k2));
            textView.setTextSize(0, h17);
            linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(-1, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a_v)));
            linearLayout.setGravity(17);
            z2Var.s(linearLayout);
            android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContainerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
            android.widget.LinearLayout linearLayout2 = cVar6.f399309c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContainerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
            relativeLayout.addView(linearLayout2, -1, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a_u));
            z2Var.j(relativeLayout);
            z2Var.C();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WheelPickerCaller", "handleOpenWheelPicker error params");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOpenWheelPicker", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller");
        }
    }
}
