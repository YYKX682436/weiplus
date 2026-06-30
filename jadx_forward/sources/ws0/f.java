package ws0;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws0.g f530496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f530497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ws0.g gVar, yz5.q qVar) {
        super(0);
        this.f530496d = gVar;
        this.f530497e = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v19, types: [android.util.Range] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        java.lang.String str;
        java.util.ArrayList arrayList2;
        int i17;
        java.util.Iterator<java.lang.String> it;
        java.lang.Object obj;
        ws0.g gVar = this.f530496d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f530498a, "available request: tag value : " + gVar.f530500c + ' ');
        java.lang.String str2 = "available result: tag value : " + gVar.f530501d + ' ';
        java.lang.String str3 = gVar.f530498a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "available sessionType: tag value : " + gVar.f530502e + ' ');
        org.json.JSONArray jSONArray = gVar.f530500c;
        int length = jSONArray != null ? jSONArray.length() : 0;
        int i18 = 0;
        while (true) {
            arrayList = gVar.f530503f;
            str = "stream";
            if (i18 >= length) {
                break;
            }
            xs0.a aVar = new xs0.a();
            org.json.JSONArray jSONArray2 = gVar.f530500c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray2);
            org.json.JSONObject optJSONObject = jSONArray2.optJSONObject(i18);
            if (optJSONObject != null) {
                java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, "cameraId")) {
                        aVar.f537819b = java.lang.Integer.valueOf(optJSONObject.optInt(next));
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, "parentKey")) {
                        aVar.f537818a = optJSONObject.optString(next);
                    } else {
                        int i19 = length;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, "childKey")) {
                            aVar.f537821d = optJSONObject.optString(next);
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, "vendorTag")) {
                            aVar.f537823f = optJSONObject.optString(next);
                        } else {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, "supportValue")) {
                                java.lang.String optString = optJSONObject.optString(next);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                                java.util.List f07 = r26.n0.f0(optString, new java.lang.String[]{","}, false, 0, 6, null);
                                java.lang.String str4 = (java.lang.String) f07.get(0);
                                it = keys;
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, "range")) {
                                    obj = new android.util.Range(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) f07.get(1))), java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) f07.get(2))));
                                } else {
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, "array")) {
                                        java.lang.Object obj2 = aVar.f537820c;
                                        if (obj2 instanceof java.lang.Boolean) {
                                            obj = new java.util.ArrayList();
                                            java.util.Iterator it6 = f07.subList(1, f07.size()).iterator();
                                            while (it6.hasNext()) {
                                                obj.add(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean((java.lang.String) it6.next())));
                                            }
                                        } else if (obj2 instanceof java.lang.String) {
                                            obj = new java.util.ArrayList();
                                            java.util.Iterator it7 = f07.subList(1, f07.size()).iterator();
                                            while (it7.hasNext()) {
                                                obj.add((java.lang.String) it7.next());
                                            }
                                        } else if (obj2 instanceof java.lang.Integer) {
                                            obj = new java.util.ArrayList();
                                            java.util.Iterator it8 = f07.subList(1, f07.size()).iterator();
                                            while (it8.hasNext()) {
                                                obj.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it8.next())));
                                            }
                                        }
                                    }
                                    obj = 0;
                                }
                                aVar.f537822e = obj;
                            } else {
                                it = keys;
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, "defaultValue")) {
                                    aVar.f537820c = optJSONObject.opt(next);
                                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, "stream")) {
                                    aVar.f537824g = java.lang.Integer.valueOf(optJSONObject.optInt(next));
                                }
                            }
                            length = i19;
                            keys = it;
                        }
                        length = i19;
                    }
                }
            }
            int i27 = length;
            java.util.Objects.toString(aVar.f537820c);
            java.lang.Object obj3 = aVar.f537822e;
            if (obj3 instanceof android.util.Range) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type android.util.Range<kotlin.Int>");
                java.util.Objects.toString(((android.util.Range) obj3).getLower());
                java.lang.Object obj4 = aVar.f537822e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type android.util.Range<kotlin.Int>");
                java.util.Objects.toString(((android.util.Range) obj4).getUpper());
            } else if (obj3 instanceof java.util.ArrayList) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.lang.Object obj5 = aVar.f537822e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                for (java.lang.Object obj6 : (java.util.ArrayList) obj5) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(obj6);
                    sb6.append((char) 12289);
                    stringBuffer.append(sb6.toString());
                }
            }
            arrayList.add(aVar);
            i18++;
            length = i27;
        }
        org.json.JSONArray jSONArray3 = gVar.f530501d;
        int length2 = jSONArray3 != null ? jSONArray3.length() : 0;
        int i28 = 0;
        while (true) {
            arrayList2 = gVar.f530504g;
            if (i28 >= length2) {
                break;
            }
            ys0.a aVar2 = new ys0.a();
            org.json.JSONArray jSONArray4 = gVar.f530501d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray4);
            org.json.JSONObject optJSONObject2 = jSONArray4.optJSONObject(i28);
            if (optJSONObject2 != null) {
                java.util.Iterator<java.lang.String> keys2 = optJSONObject2.keys();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys2, "keys(...)");
                while (keys2.hasNext()) {
                    int i29 = length2;
                    java.lang.String next2 = keys2.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next2, "cameraId")) {
                        aVar2.f546651b = java.lang.Integer.valueOf(optJSONObject2.optInt(next2));
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next2, "parentKey")) {
                        aVar2.f546650a = optJSONObject2.optString(next2);
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next2, "vendorTag")) {
                        aVar2.f546652c = optJSONObject2.optString(next2);
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next2, str)) {
                        aVar2.f546653d = java.lang.Integer.valueOf(optJSONObject2.optInt(next2));
                    } else {
                        java.lang.String str5 = str;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next2, "valueType")) {
                            aVar2.f546654e = optJSONObject2.optString(next2);
                        }
                        str = str5;
                    }
                    length2 = i29;
                }
            }
            int i37 = length2;
            java.lang.String str6 = str;
            arrayList2.add(aVar2);
            i28++;
            str = str6;
            length2 = i37;
        }
        org.json.JSONArray jSONArray5 = gVar.f530502e;
        int length3 = jSONArray5 != null ? jSONArray5.length() : 0;
        int i38 = 0;
        while (true) {
            java.util.ArrayList arrayList3 = gVar.f530505h;
            if (i38 >= length3) {
                this.f530497e.mo147xb9724478(arrayList, arrayList2, arrayList3);
                return jz5.f0.f384359a;
            }
            zs0.a aVar3 = new zs0.a();
            org.json.JSONArray jSONArray6 = gVar.f530502e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray6);
            org.json.JSONObject optJSONObject3 = jSONArray6.optJSONObject(i38);
            if (optJSONObject3 != null) {
                java.util.Iterator<java.lang.String> keys3 = optJSONObject3.keys();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys3, "keys(...)");
                while (keys3.hasNext()) {
                    java.lang.String next3 = keys3.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next3, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)) {
                        optJSONObject3.optString(next3);
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next3, "value")) {
                        aVar3.f556763a = optJSONObject3.optInt(next3);
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next3, "supportTag")) {
                        java.lang.String optString2 = optJSONObject3.optString(next3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                        java.util.List f08 = r26.n0.f0(optString2, new java.lang.String[]{","}, false, 0, 6, null);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) f08.get(0), "array")) {
                            i17 = length3;
                            java.util.Iterator it9 = f08.subList(1, f08.size()).iterator();
                            while (it9.hasNext()) {
                                arrayList4.add((java.lang.String) it9.next());
                            }
                        } else {
                            i17 = length3;
                        }
                        aVar3.f556764b = arrayList4;
                        length3 = i17;
                    }
                }
            }
            int i39 = length3;
            arrayList3.add(aVar3);
            i38++;
            length3 = i39;
        }
    }
}
