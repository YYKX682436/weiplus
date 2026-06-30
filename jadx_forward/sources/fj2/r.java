package fj2;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final fj2.r f344715a = new fj2.r();

    public final java.util.LinkedList a(android.graphics.Point windowSize, java.util.LinkedList tempList, java.util.LinkedHashMap rectMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowSize, "windowSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempList, "tempList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectMap, "rectMap");
        int i17 = windowSize.x;
        int i18 = windowSize.y;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(tempList, 10));
        java.util.Iterator it = tempList.iterator();
        while (it.hasNext()) {
            xh2.a aVar = (xh2.a) it.next();
            xh2.a aVar2 = new xh2.a(aVar.f536053a, aVar.f536054b.a());
            xh2.i iVar = aVar2.f536054b;
            if (!(iVar.f364144c == 1.0f)) {
                if (!(iVar.f364145d == 1.0f)) {
                    float f17 = i17;
                    iVar.f364142a = (((android.graphics.Rect) rectMap.get(aVar2.b())) != null ? r4.left : 0.0f) / f17;
                    float f18 = i18;
                    aVar2.f536054b.f364143b = (((android.graphics.Rect) rectMap.get(aVar2.b())) != null ? r4.top : 0.0f) / f18;
                    aVar2.f536054b.f364144c = (((android.graphics.Rect) rectMap.get(aVar2.b())) != null ? r4.width() : 0.0f) / f17;
                    aVar2.f536054b.f364145d = (((android.graphics.Rect) rectMap.get(aVar2.b())) != null ? r4.height() : 0.0f) / f18;
                }
            }
            arrayList.add(aVar2);
        }
        return new java.util.LinkedList(arrayList);
    }

    public final boolean b(java.lang.String curAnchorUid, org.json.JSONObject jSONObject, xh2.d dVar) {
        java.lang.String str;
        java.lang.String str2;
        float f17;
        java.lang.String str3;
        float f18;
        java.lang.String str4;
        java.lang.Object obj;
        float f19;
        java.lang.String str5;
        int i17;
        int i18;
        float f27;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        int i19;
        float f28;
        float f29;
        int i27;
        java.lang.String str9;
        int i28;
        long j17;
        java.util.ArrayList arrayList;
        java.lang.Object obj2;
        float f37;
        long j18;
        java.lang.Integer num;
        java.lang.String str10;
        int i29;
        xh2.i iVar;
        xh2.i iVar2;
        xh2.i iVar3;
        xh2.i iVar4;
        xh2.i iVar5;
        xh2.i iVar6;
        xh2.i iVar7;
        xh2.i iVar8;
        java.lang.String optString;
        java.lang.Float f38;
        java.lang.String optString2;
        java.lang.Float f39;
        java.lang.String optString3;
        java.lang.Float f47;
        java.lang.String optString4;
        java.lang.Float f48;
        xh2.i iVar9;
        xh2.i iVar10;
        xh2.i iVar11;
        xh2.i iVar12;
        xh2.i iVar13;
        xh2.i iVar14;
        java.lang.Float f49;
        java.lang.Float f57;
        java.lang.Float f58;
        java.lang.Float f59;
        java.lang.Float f66;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curAnchorUid, "curAnchorUid");
        if (jSONObject == null || dVar == null) {
            return (jSONObject == null && dVar != null) || (jSONObject != null && dVar == null);
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("list");
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("gl");
        org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("sl");
        int optInt = jSONObject.optInt("m");
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        int length2 = (optJSONArray2 != null ? optJSONArray2.length() : 0) + length + (optJSONArray3 != null ? optJSONArray3.length() : 0);
        java.lang.String str11 = "FinderLiveMicRatioUtil";
        if (!(curAnchorUid.length() == 0)) {
            java.util.LinkedList linkedList = dVar.f536073a;
            int size = linkedList.size();
            int i37 = dVar.f536074b;
            if (size != 1 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) linkedList.get(0)).b(), curAnchorUid) || length != 0 || optInt != i37) {
                java.lang.String optString5 = jSONObject.optString("x");
                float floatValue = (optString5 == null || (f66 = r26.g0.f(optString5)) == null) ? 0.0f : f66.floatValue();
                java.lang.String optString6 = jSONObject.optString("y");
                float floatValue2 = (optString6 == null || (f59 = r26.g0.f(optString6)) == null) ? 0.0f : f59.floatValue();
                java.lang.String optString7 = jSONObject.optString("w");
                float floatValue3 = (optString7 == null || (f58 = r26.g0.f(optString7)) == null) ? 0.0f : f58.floatValue();
                java.lang.String optString8 = jSONObject.optString("h");
                if (optString8 == null || (f57 = r26.g0.f(optString8)) == null) {
                    str = "h";
                    str2 = "w";
                    f17 = 0.0f;
                } else {
                    float floatValue4 = f57.floatValue();
                    str2 = "w";
                    str = "h";
                    f17 = floatValue4;
                }
                java.lang.String optString9 = jSONObject.optString("a");
                if (optString9 == null || (f49 = r26.g0.f(optString9)) == null) {
                    str3 = "y";
                    f18 = 0.0f;
                } else {
                    f18 = f49.floatValue();
                    str3 = "y";
                }
                java.lang.String str12 = "x";
                int optInt2 = jSONObject.optInt("f");
                java.lang.String str13 = "f";
                java.lang.String str14 = "i";
                int optInt3 = jSONObject.optInt("i");
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str4 = str14;
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    str4 = str14;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj).b(), curAnchorUid)) {
                        break;
                    }
                    str14 = str4;
                }
                xh2.a aVar = (xh2.a) obj;
                org.json.JSONArray jSONArray = optJSONArray;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : linkedList) {
                    java.util.LinkedList linkedList2 = linkedList;
                    int i38 = length2;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj3).b(), curAnchorUid)) {
                        arrayList2.add(obj3);
                    }
                    linkedList = linkedList2;
                    length2 = i38;
                }
                int i39 = length2;
                java.util.LinkedList linkedList3 = linkedList;
                int size2 = arrayList2.size();
                java.lang.String b17 = aVar != null ? aVar.b() : "";
                float f67 = (aVar == null || (iVar14 = aVar.f536054b) == null) ? 0.0f : iVar14.f364142a;
                float f68 = (aVar == null || (iVar13 = aVar.f536054b) == null) ? 0.0f : iVar13.f364143b;
                float f69 = f18;
                float f76 = (aVar == null || (iVar12 = aVar.f536054b) == null) ? 0.0f : iVar12.f364144c;
                float f77 = f17;
                float f78 = (aVar == null || (iVar11 = aVar.f536054b) == null) ? 0.0f : iVar11.f364145d;
                int i47 = (aVar == null || (iVar10 = aVar.f536054b) == null) ? 0 : iVar10.f536088g;
                int i48 = (aVar == null || (iVar9 = aVar.f536054b) == null) ? 0 : iVar9.f536086e;
                float f79 = floatValue3;
                if (!android.text.TextUtils.equals(curAnchorUid, b17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRatioUtil", "diffLastMicCoverDataList diff curAnchorUid: " + curAnchorUid + " lastAnchorUid: " + b17);
                    return true;
                }
                java.lang.String str15 = b17;
                java.lang.String str16 = " lastMode: ";
                java.lang.String str17 = " curMode: ";
                float f86 = dVar.f536075c;
                if (optInt3 == i48 && optInt == i37 && optInt2 == i47) {
                    if (floatValue == f67) {
                        if (floatValue2 == f68) {
                            if (f79 == f76) {
                                if (f77 == f78) {
                                    if (!(f69 == f86)) {
                                        f19 = f86;
                                        str5 = " curMode: ";
                                        i17 = optInt;
                                        str8 = "FinderLiveMicRatioUtil";
                                        i18 = i37;
                                        f27 = f76;
                                        str6 = " lastFocus: ";
                                        str7 = " curFocus: ";
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "diffLastMicCoverDataList diff curAnchorPos : " + optInt3 + " lastAnchorPos: " + i48 + str5 + i17 + " lastMode: " + i18 + str7 + optInt2 + str6 + i47 + "curAnchorUid: " + curAnchorUid + " lastAnchorUid: " + str15 + "  curAnchorX: " + floatValue + " lastAnchorX: " + f67 + " curAnchorY: " + floatValue2 + " lastAnchorY: " + f68 + " curAnchorW: " + f79 + " lastAnchorW: " + f27 + " curAnchorH: " + f77 + " lastAnchorH: " + f78 + " curVideoRate: " + f69 + " lastVideoRate: " + f19);
                                        return true;
                                    }
                                    if (i39 != size2) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRatioUtil", "diffLastMicCoverDataList diff curTotalSize: " + i39 + " lastDataListSize: " + size2);
                                        return true;
                                    }
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    for (java.lang.Object obj4 : linkedList3) {
                                        xh2.a aVar2 = (xh2.a) obj4;
                                        if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar2.b(), curAnchorUid) || aVar2.f536054b.f536089h) ? false : true) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    if (jSONArray == null) {
                                        return true;
                                    }
                                    if (jSONArray.length() != arrayList3.size()) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRatioUtil", "diffLastMicCoverDataList curList size: " + jSONArray.length() + " lastList size: " + arrayList3.size());
                                        return true;
                                    }
                                    int length3 = jSONArray.length();
                                    int i49 = 0;
                                    while (i49 < length3) {
                                        org.json.JSONArray jSONArray2 = jSONArray;
                                        org.json.JSONObject optJSONObject = jSONArray2.optJSONObject(i49);
                                        java.lang.String optString10 = optJSONObject != null ? optJSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.UID) : null;
                                        java.lang.String str18 = str12;
                                        float floatValue5 = (optJSONObject == null || (optString4 = optJSONObject.optString(str18)) == null || (f48 = r26.g0.f(optString4)) == null) ? 0.0f : f48.floatValue();
                                        java.lang.String str19 = str3;
                                        float floatValue6 = (optJSONObject == null || (optString3 = optJSONObject.optString(str19)) == null || (f47 = r26.g0.f(optString3)) == null) ? 0.0f : f47.floatValue();
                                        java.lang.String str20 = str2;
                                        if (optJSONObject == null || (optString2 = optJSONObject.optString(str20)) == null || (f39 = r26.g0.f(optString2)) == null) {
                                            i19 = length3;
                                            f28 = 0.0f;
                                        } else {
                                            i19 = length3;
                                            f28 = f39.floatValue();
                                        }
                                        jSONArray = jSONArray2;
                                        java.lang.String str21 = str;
                                        if (optJSONObject == null || (optString = optJSONObject.optString(str21)) == null || (f38 = r26.g0.f(optString)) == null) {
                                            str = str21;
                                            f29 = 0.0f;
                                        } else {
                                            float floatValue7 = f38.floatValue();
                                            str = str21;
                                            f29 = floatValue7;
                                        }
                                        str12 = str18;
                                        int optInt4 = optJSONObject != null ? optJSONObject.optInt("us") : 0;
                                        str3 = str19;
                                        int optInt5 = optJSONObject != null ? optJSONObject.optInt(str4) : 0;
                                        str2 = str20;
                                        if (optJSONObject != null) {
                                            java.lang.String str22 = str13;
                                            str13 = str22;
                                            i27 = optJSONObject.optInt(str22);
                                        } else {
                                            i27 = 0;
                                        }
                                        int i57 = i37;
                                        if (optJSONObject != null) {
                                            str9 = str16;
                                            i28 = optInt;
                                            j17 = optJSONObject.optLong("mt");
                                        } else {
                                            str9 = str16;
                                            i28 = optInt;
                                            j17 = 0;
                                        }
                                        java.util.Iterator it6 = arrayList3.iterator();
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                arrayList = arrayList3;
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = it6.next();
                                            arrayList = arrayList3;
                                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj2).b(), optString10)) {
                                                break;
                                            }
                                            arrayList3 = arrayList;
                                        }
                                        xh2.a aVar3 = (xh2.a) obj2;
                                        java.lang.String b18 = aVar3 != null ? aVar3.b() : "";
                                        int i58 = i28;
                                        float f87 = (aVar3 == null || (iVar8 = aVar3.f536054b) == null) ? 0.0f : iVar8.f364142a;
                                        java.lang.String str23 = str17;
                                        float f88 = (aVar3 == null || (iVar7 = aVar3.f536054b) == null) ? 0.0f : iVar7.f364143b;
                                        int i59 = i49;
                                        float f89 = (aVar3 == null || (iVar6 = aVar3.f536054b) == null) ? 0.0f : iVar6.f364144c;
                                        long j19 = j17;
                                        float f96 = (aVar3 == null || (iVar5 = aVar3.f536054b) == null) ? 0.0f : iVar5.f364145d;
                                        java.lang.Integer valueOf = (aVar3 == null || (iVar4 = aVar3.f536054b) == null) ? null : java.lang.Integer.valueOf(iVar4.f536088g);
                                        int i66 = optInt4;
                                        int i67 = (aVar3 == null || (iVar3 = aVar3.f536054b) == null) ? 0 : iVar3.f536090i;
                                        int i68 = (aVar3 == null || (iVar2 = aVar3.f536054b) == null) ? 0 : iVar2.f536086e;
                                        if (aVar3 == null || (iVar = aVar3.f536054b) == null) {
                                            f37 = f28;
                                            j18 = 0;
                                        } else {
                                            f37 = f28;
                                            j18 = iVar.f536092k;
                                        }
                                        long j27 = j18;
                                        if (!android.text.TextUtils.equals(optString10, b18)) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str11, "diffLastMicCoverDataList diff curUid: " + optString10 + " lastUid: " + b18);
                                            return true;
                                        }
                                        if (optInt5 == i68 && valueOf != null && i27 == valueOf.intValue()) {
                                            if (floatValue5 == f87) {
                                                if (floatValue6 == f88) {
                                                    if (f37 == f89) {
                                                        if (f29 == f96) {
                                                            num = valueOf;
                                                            str10 = str11;
                                                            i29 = i67;
                                                            if (!(pm0.v.z(i66, 2) != pm0.v.z(i29, 2)) && j19 == j27) {
                                                                i49 = i59 + 1;
                                                                length3 = i19;
                                                                arrayList3 = arrayList;
                                                                optInt = i58;
                                                                i37 = i57;
                                                                str16 = str9;
                                                                str17 = str23;
                                                                str11 = str10;
                                                            }
                                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str10, "diffLastMicCoverDataList diff curPos: " + optInt5 + " lastPos: " + i68 + " curUid: " + optString10 + " lastUid: " + b18 + " curX: " + floatValue5 + " lastX: " + f87 + " curY: " + floatValue6 + " lastY: " + f88 + " curW: " + f37 + " lastW: " + f89 + " curH: " + f29 + " lastH: " + f96 + str23 + i58 + str9 + i57 + " curFocus: " + i27 + " lastFocus: " + num + " curMt: " + j19 + " lastMt: " + j27 + " curUs: " + i66 + " lastUs: " + i29);
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        num = valueOf;
                                        str10 = str11;
                                        i29 = i67;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str10, "diffLastMicCoverDataList diff curPos: " + optInt5 + " lastPos: " + i68 + " curUid: " + optString10 + " lastUid: " + b18 + " curX: " + floatValue5 + " lastX: " + f87 + " curY: " + floatValue6 + " lastY: " + f88 + " curW: " + f37 + " lastW: " + f89 + " curH: " + f29 + " lastH: " + f96 + str23 + i58 + str9 + i57 + " curFocus: " + i27 + " lastFocus: " + num + " curMt: " + j19 + " lastMt: " + j27 + " curUs: " + i66 + " lastUs: " + i29);
                                        return true;
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                }
                f19 = f86;
                str5 = " curMode: ";
                i17 = optInt;
                i18 = i37;
                f27 = f76;
                str6 = " lastFocus: ";
                str7 = " curFocus: ";
                str8 = "FinderLiveMicRatioUtil";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "diffLastMicCoverDataList diff curAnchorPos : " + optInt3 + " lastAnchorPos: " + i48 + str5 + i17 + " lastMode: " + i18 + str7 + optInt2 + str6 + i47 + "curAnchorUid: " + curAnchorUid + " lastAnchorUid: " + str15 + "  curAnchorX: " + floatValue + " lastAnchorX: " + f67 + " curAnchorY: " + floatValue2 + " lastAnchorY: " + f68 + " curAnchorW: " + f79 + " lastAnchorW: " + f27 + " curAnchorH: " + f77 + " lastAnchorH: " + f78 + " curVideoRate: " + f69 + " lastVideoRate: " + f19);
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRatioUtil", "diffLastMicCoverDataList data is same return false curSize: " + length);
        return false;
    }

    public final java.util.LinkedHashMap c(gk2.e buContext, android.graphics.Point windowSize, java.util.LinkedList linkedList, float f17, fj2.l renderMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowSize, "windowSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderMode, "renderMode");
        java.lang.String str = ((mm2.e1) buContext.a(mm2.e1.class)).f410520q.f461834n;
        if (str == null) {
            str = "";
        }
        return d(str, windowSize, linkedList, f17, renderMode);
    }

    public final java.util.LinkedHashMap d(java.lang.String anchorUid, android.graphics.Point windowSize, java.util.LinkedList linkedList, float f17, fj2.l renderMode) {
        java.util.LinkedHashMap linkedHashMap;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUid, "anchorUid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowSize, "windowSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderMode, "renderMode");
        int ordinal = renderMode.ordinal();
        java.lang.String str9 = " topOffestMargin: ";
        java.lang.String str10 = " realVideoHeight:";
        java.lang.String str11 = "FinderLiveMicRatioUtil";
        java.lang.String str12 = " videoRate:";
        if (ordinal == 1 || ordinal == 2) {
            java.lang.String str13 = " videoRate:";
            java.lang.String str14 = " topOffestMargin: ";
            boolean z17 = renderMode == fj2.l.f344713f;
            linkedHashMap = new java.util.LinkedHashMap();
            int i17 = windowSize.x;
            int i18 = windowSize.y;
            float f18 = i17;
            int i19 = (int) (f18 / f17);
            int h17 = z17 ? com.p314xaae8f345.mm.ui.bl.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : (i18 - i19) / 2;
            if ((linkedList != null ? linkedList.size() : 0) > 0) {
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        xh2.a aVar = (xh2.a) it.next();
                        xh2.i iVar = aVar.f536054b;
                        float f19 = iVar.f364142a;
                        java.util.Iterator it6 = it;
                        float f27 = iVar.f364143b;
                        java.lang.String str15 = str14;
                        float f28 = i19;
                        linkedHashMap.put(aVar.b(), new android.graphics.Rect((int) (f19 * f18), ((int) (f27 * f28)) + h17, (int) ((f19 + iVar.f364144c) * f18), ((int) ((f27 + iVar.f364145d) * f28)) + h17));
                        it = it6;
                        str11 = str11;
                        str13 = str13;
                        str14 = str15;
                        str10 = str10;
                    }
                }
                str = str14;
                str2 = str13;
                str3 = str10;
                str4 = str11;
            } else {
                str = str14;
                str2 = str13;
                str3 = " realVideoHeight:";
                str4 = "FinderLiveMicRatioUtil";
                linkedHashMap.put(anchorUid, new android.graphics.Rect(0, 0, i17, i19));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "genMicFocusRectMapForScreenShare windowWidth:" + i17 + " windowHeight:" + i18 + str3 + i19 + str + h17 + str2 + f17);
        } else if (windowSize.y > windowSize.x / f17) {
            linkedHashMap = new java.util.LinkedHashMap();
            int i27 = windowSize.x;
            int i28 = windowSize.y;
            float f29 = i28;
            float f37 = f17 * f29;
            int i29 = (int) ((f37 - i27) / 2);
            if ((linkedList != null ? linkedList.size() : 0) > 0) {
                if (linkedList != null) {
                    java.util.Iterator it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        xh2.a aVar2 = (xh2.a) it7.next();
                        xh2.i iVar2 = aVar2.f536054b;
                        float f38 = iVar2.f364142a;
                        float f39 = iVar2.f364143b;
                        linkedHashMap.put(aVar2.b(), new android.graphics.Rect(((int) (f38 * f37)) - i29, (int) (f39 * f29), ((int) ((f38 + iVar2.f364144c) * f37)) - i29, (int) ((f39 + iVar2.f364145d) * f29)));
                        it7 = it7;
                        str11 = str11;
                    }
                }
                str8 = str11;
            } else {
                str8 = "FinderLiveMicRatioUtil";
                linkedHashMap.put(anchorUid, new android.graphics.Rect(0, 0, i27, i28));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "genMicFocusRectMapFixedByHeight windowWidth:" + i27 + " windowHeight:" + i28 + " realVideoWidth:" + f37 + " leftOffestMargin: " + i29 + " videoRate:" + f17);
        } else {
            java.lang.String str16 = "FinderLiveMicRatioUtil";
            linkedHashMap = new java.util.LinkedHashMap();
            int i37 = windowSize.x;
            int i38 = windowSize.y;
            float f47 = i37;
            float f48 = f47 / f17;
            int i39 = (int) ((f48 - i38) / 2);
            if ((linkedList != null ? linkedList.size() : 0) > 0) {
                if (linkedList != null) {
                    java.util.Iterator it8 = linkedList.iterator();
                    while (it8.hasNext()) {
                        xh2.a aVar3 = (xh2.a) it8.next();
                        xh2.i iVar3 = aVar3.f536054b;
                        float f49 = iVar3.f364142a;
                        java.util.Iterator it9 = it8;
                        float f57 = iVar3.f364143b;
                        linkedHashMap.put(aVar3.b(), new android.graphics.Rect((int) (f49 * f47), ((int) (f57 * f48)) - i39, (int) ((f49 + iVar3.f364144c) * f47), ((int) ((f57 + iVar3.f364145d) * f48)) - i39));
                        it8 = it9;
                        str16 = str16;
                        str12 = str12;
                        str9 = str9;
                    }
                }
                str5 = str16;
                str6 = str9;
                str7 = str12;
            } else {
                str5 = str16;
                str6 = " topOffestMargin: ";
                str7 = " videoRate:";
                linkedHashMap.put(anchorUid, new android.graphics.Rect(0, 0, i37, i38));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "genMicFocusRectMapFixedByWidth windowWidth:" + i37 + " windowHeight:" + i38 + " realVideoHeight:" + f48 + str6 + i39 + str7 + f17);
        }
        return linkedHashMap;
    }

    public final java.util.LinkedList e(org.json.JSONObject jSONObject, km2.q qVar, yz5.l userFilterBlock) {
        java.lang.String str;
        java.lang.String optString;
        java.lang.Float f17;
        java.lang.String optString2;
        java.lang.Float f18;
        java.lang.String optString3;
        java.lang.Float f19;
        java.lang.String optString4;
        java.lang.Float f27;
        java.lang.String optString5;
        java.lang.Float f28;
        java.lang.String optString6;
        java.lang.Float f29;
        java.lang.String optString7;
        java.lang.Float f37;
        java.lang.String optString8;
        java.lang.Float f38;
        java.lang.String optString9;
        java.lang.Float f39;
        java.lang.String optString10;
        java.lang.Float f47;
        java.lang.String optString11;
        java.lang.Float f48;
        java.lang.String optString12;
        java.lang.Float f49;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userFilterBlock, "userFilterBlock");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("list") : null;
        java.lang.String str2 = "i";
        org.json.JSONArray optJSONArray2 = jSONObject != null ? jSONObject.optJSONArray("gl") : null;
        linkedList.add(new xh2.a(qVar, new xh2.i((jSONObject == null || (optString12 = jSONObject.optString("x")) == null || (f49 = r26.g0.f(optString12)) == null) ? 0.0f : f49.floatValue(), (jSONObject == null || (optString11 = jSONObject.optString("y")) == null || (f48 = r26.g0.f(optString11)) == null) ? 0.0f : f48.floatValue(), (jSONObject == null || (optString10 = jSONObject.optString("w")) == null || (f47 = r26.g0.f(optString10)) == null) ? 0.0f : f47.floatValue(), (jSONObject == null || (optString9 = jSONObject.optString("h")) == null || (f39 = r26.g0.f(optString9)) == null) ? 0.0f : f39.floatValue(), jSONObject != null ? jSONObject.optInt("i") : 0, 0, 0, false, 0, 0, 0L, 1888, null)));
        if ((optJSONArray != null ? optJSONArray.length() : 0) > 0) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            int length = optJSONArray != null ? optJSONArray.length() : 0;
            int i17 = 0;
            while (i17 < length) {
                org.json.JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(i17) : null;
                float floatValue = (optJSONObject == null || (optString8 = optJSONObject.optString("x")) == null || (f38 = r26.g0.f(optString8)) == null) ? 0.0f : f38.floatValue();
                float floatValue2 = (optJSONObject == null || (optString7 = optJSONObject.optString("y")) == null || (f37 = r26.g0.f(optString7)) == null) ? 0.0f : f37.floatValue();
                float floatValue3 = (optJSONObject == null || (optString6 = optJSONObject.optString("w")) == null || (f29 = r26.g0.f(optString6)) == null) ? 0.0f : f29.floatValue();
                float floatValue4 = (optJSONObject == null || (optString5 = optJSONObject.optString("h")) == null || (f28 = r26.g0.f(optString5)) == null) ? 0.0f : f28.floatValue();
                java.lang.String optString13 = optJSONObject != null ? optJSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.UID) : null;
                int optInt = optJSONObject != null ? optJSONObject.optInt("us") : 0;
                java.lang.String str3 = str2;
                int optInt2 = optJSONObject != null ? optJSONObject.optInt(str3) : 0;
                long optLong = optJSONObject != null ? optJSONObject.optLong("mt") : 0L;
                if (optString13 == null) {
                    optString13 = "";
                }
                km2.q qVar2 = (km2.q) userFilterBlock.mo146xb9724478(optString13);
                if (qVar2 != null) {
                    qVar2.f390724v = optInt;
                    linkedList2.add(new xh2.a(qVar2, new xh2.i(floatValue, floatValue2, floatValue3, floatValue4, optInt2, 0, 0, false, optInt, 0, optLong, com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.ErrCode.f9505x29ffff96, null)));
                }
                i17++;
                str2 = str3;
            }
            str = str2;
            linkedList.addAll(linkedList2);
        } else {
            str = str2;
        }
        if ((optJSONArray2 != null ? optJSONArray2.length() : 0) > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("genMicGrabModeDataList glListSize: ");
            sb6.append(optJSONArray2 != null ? java.lang.Integer.valueOf(optJSONArray2.length()) : null);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRatioUtil", sb6.toString());
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            int length2 = optJSONArray2 != null ? optJSONArray2.length() : 0;
            int i18 = 0;
            while (i18 < length2) {
                org.json.JSONArray jSONArray = optJSONArray2;
                org.json.JSONObject optJSONObject2 = optJSONArray2 != null ? jSONArray.optJSONObject(i18) : null;
                linkedList3.add(new xh2.a(null, new xh2.i((optJSONObject2 == null || (optString4 = optJSONObject2.optString("x")) == null || (f27 = r26.g0.f(optString4)) == null) ? 0.0f : f27.floatValue(), (optJSONObject2 == null || (optString3 = optJSONObject2.optString("y")) == null || (f19 = r26.g0.f(optString3)) == null) ? 0.0f : f19.floatValue(), (optJSONObject2 == null || (optString2 = optJSONObject2.optString("w")) == null || (f18 = r26.g0.f(optString2)) == null) ? 0.0f : f18.floatValue(), (optJSONObject2 == null || (optString = optJSONObject2.optString("h")) == null || (f17 = r26.g0.f(optString)) == null) ? 0.0f : f17.floatValue(), optJSONObject2 != null ? optJSONObject2.optInt(str) : 0, 0, 0, true, 0, optJSONObject2 != null ? optJSONObject2.optInt("st") : 0, 0L, 1376, null)));
                i18++;
                optJSONArray2 = jSONArray;
            }
            linkedList.addAll(linkedList3);
        }
        if (linkedList.size() > 1) {
            kz5.g0.t(linkedList, new fj2.o());
        }
        return linkedList;
    }

    public final java.util.LinkedList f(org.json.JSONObject jSONObject) {
        java.lang.String optString;
        java.lang.Float f17;
        java.lang.String optString2;
        java.lang.Float f18;
        java.lang.String optString3;
        java.lang.Float f19;
        java.lang.String optString4;
        java.lang.Float f27;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("hl") : null;
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(i17) : null;
            float f28 = 0.0f;
            float floatValue = (optJSONObject == null || (optString4 = optJSONObject.optString("x")) == null || (f27 = r26.g0.f(optString4)) == null) ? 0.0f : f27.floatValue();
            float floatValue2 = (optJSONObject == null || (optString3 = optJSONObject.optString("y")) == null || (f19 = r26.g0.f(optString3)) == null) ? 0.0f : f19.floatValue();
            float floatValue3 = (optJSONObject == null || (optString2 = optJSONObject.optString("w")) == null || (f18 = r26.g0.f(optString2)) == null) ? 0.0f : f18.floatValue();
            if (optJSONObject != null && (optString = optJSONObject.optString("h")) != null && (f17 = r26.g0.f(optString)) != null) {
                f28 = f17.floatValue();
            }
            linkedList.add(new xh2.h(floatValue, floatValue2, floatValue3, f28));
        }
        return linkedList;
    }

    public final java.util.LinkedList g(org.json.JSONObject jSONObject, km2.q qVar, yz5.l userFilterBlock) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        int i17;
        int i18;
        org.json.JSONObject jSONObject2;
        java.lang.String optString;
        java.lang.Float f17;
        java.lang.String optString2;
        java.lang.Float f18;
        java.lang.String optString3;
        java.lang.Float f19;
        java.lang.String optString4;
        java.lang.Float f27;
        java.lang.String optString5;
        java.lang.Float f28;
        java.lang.String optString6;
        java.lang.Float f29;
        java.lang.String optString7;
        java.lang.Float f37;
        java.lang.String optString8;
        java.lang.Float f38;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userFilterBlock, "userFilterBlock");
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("list") : null;
        if ((optJSONArray != null ? optJSONArray.length() : 0) > 0) {
            float floatValue = (jSONObject == null || (optString8 = jSONObject.optString("x")) == null || (f38 = r26.g0.f(optString8)) == null) ? 0.0f : f38.floatValue();
            float floatValue2 = (jSONObject == null || (optString7 = jSONObject.optString("y")) == null || (f37 = r26.g0.f(optString7)) == null) ? 0.0f : f37.floatValue();
            float floatValue3 = (jSONObject == null || (optString6 = jSONObject.optString("w")) == null || (f29 = r26.g0.f(optString6)) == null) ? 0.0f : f29.floatValue();
            float floatValue4 = (jSONObject == null || (optString5 = jSONObject.optString("h")) == null || (f28 = r26.g0.f(optString5)) == null) ? 0.0f : f28.floatValue();
            java.lang.String str = "f";
            int optInt = jSONObject != null ? jSONObject.optInt("f") : 0;
            int optInt2 = jSONObject != null ? jSONObject.optInt("z") : 0;
            int optInt3 = jSONObject != null ? jSONObject.optInt("i") : 0;
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            if (optJSONArray != null) {
                linkedList2 = linkedList3;
                i17 = optJSONArray.length();
            } else {
                linkedList2 = linkedList3;
                i17 = 0;
            }
            int i19 = 0;
            while (i19 < i17) {
                if (optJSONArray != null) {
                    i18 = i17;
                    jSONObject2 = optJSONArray.optJSONObject(i19);
                } else {
                    i18 = i17;
                    jSONObject2 = null;
                }
                float floatValue5 = (jSONObject2 == null || (optString4 = jSONObject2.optString("x")) == null || (f27 = r26.g0.f(optString4)) == null) ? 0.0f : f27.floatValue();
                float floatValue6 = (jSONObject2 == null || (optString3 = jSONObject2.optString("y")) == null || (f19 = r26.g0.f(optString3)) == null) ? 0.0f : f19.floatValue();
                float floatValue7 = (jSONObject2 == null || (optString2 = jSONObject2.optString("w")) == null || (f18 = r26.g0.f(optString2)) == null) ? 0.0f : f18.floatValue();
                float floatValue8 = (jSONObject2 == null || (optString = jSONObject2.optString("h")) == null || (f17 = r26.g0.f(optString)) == null) ? 0.0f : f17.floatValue();
                int optInt4 = jSONObject2 != null ? jSONObject2.optInt(str) : 0;
                int optInt5 = jSONObject2 != null ? jSONObject2.optInt("z") : 0;
                int optInt6 = jSONObject2 != null ? jSONObject2.optInt("i") : 0;
                java.lang.String str2 = str;
                long optLong = jSONObject2 != null ? jSONObject2.optLong("mt") : 0L;
                java.lang.String optString9 = jSONObject2 != null ? jSONObject2.optString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.UID) : null;
                org.json.JSONArray jSONArray = optJSONArray;
                int optInt7 = jSONObject2 != null ? jSONObject2.optInt("us") : 0;
                if (optString9 == null) {
                    optString9 = "";
                }
                km2.q qVar2 = (km2.q) userFilterBlock.mo146xb9724478(optString9);
                if (qVar2 != null) {
                    qVar2.f390724v = optInt7;
                    linkedList4.add(new xh2.a(qVar2, new xh2.i(floatValue5, floatValue6, floatValue7, floatValue8, optInt6, optInt5, optInt4, false, optInt7, 0, optLong, 640, null)));
                }
                i19++;
                i17 = i18;
                str = str2;
                optJSONArray = jSONArray;
            }
            if (linkedList4.size() > 0) {
                linkedList = linkedList2;
                linkedList.add(new xh2.a(qVar, new xh2.i(floatValue, floatValue2, floatValue3, floatValue4, optInt3, optInt2, optInt, false, 0, 0, 0L, 1920, null)));
                linkedList.addAll(linkedList4);
            } else {
                linkedList = linkedList2;
                linkedList.add(new xh2.a(qVar, new xh2.i(0.0f, 0.0f, 1.0f, 1.0f, optInt3, 0, 0, false, 0, 0, 0L, 2016, null)));
            }
        } else {
            linkedList = linkedList3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRatioUtil", "genMicDataList add anchorLinkMicUser default ");
            linkedList.add(new xh2.a(qVar, new xh2.i(0.0f, 0.0f, 1.0f, 1.0f, 1, 0, 0, false, 0, 0, 0L, 2016, null)));
        }
        if (linkedList.size() > 1) {
            kz5.g0.t(linkedList, new fj2.p());
        }
        return linkedList;
    }

    public final java.util.LinkedList h(org.json.JSONObject jSONObject, km2.q qVar, yz5.l userFilterBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userFilterBlock, "userFilterBlock");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("list") : null;
        org.json.JSONArray optJSONArray2 = jSONObject != null ? jSONObject.optJSONArray("sl") : null;
        linkedList.add(new xh2.a(qVar, new xh2.i(0.0f, 0.0f, 0.0f, 0.0f, jSONObject != null ? jSONObject.optInt("i") : 0, 0, 0, false, 0, 0, 0L, 1888, null)));
        if ((optJSONArray != null ? optJSONArray.length() : 0) > 0) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            int length = optJSONArray != null ? optJSONArray.length() : 0;
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(i17) : null;
                java.lang.String optString = optJSONObject != null ? optJSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.UID) : null;
                int optInt = optJSONObject != null ? optJSONObject.optInt("us") : 0;
                int optInt2 = optJSONObject != null ? optJSONObject.optInt("i") : 0;
                if (optString == null) {
                    optString = "";
                }
                jz5.l lVar = (jz5.l) userFilterBlock.mo146xb9724478(optString);
                km2.q qVar2 = (km2.q) lVar.f384366d;
                if (qVar2 != null) {
                    qVar2.f390724v = optInt;
                    if (((java.lang.Boolean) lVar.f384367e).booleanValue()) {
                        qVar2.f390716n = pm0.v.z(optInt, 1);
                    }
                    linkedList2.add(new xh2.a(qVar2, new xh2.i(0.0f, 0.0f, 0.0f, 0.0f, optInt2, 0, 0, false, optInt, 0, 0L, 1632, null)));
                } else {
                    linkedList2.add(new xh2.a(null, new xh2.i(0.0f, 0.0f, 0.0f, 0.0f, optInt2, 0, 0, true, 0, 0, 0L, 1888, null)));
                }
            }
            linkedList.addAll(linkedList2);
        }
        if ((optJSONArray2 != null ? optJSONArray2.length() : 0) > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("genMultiVoiceModeDataList gsListSize: ");
            sb6.append(optJSONArray2 != null ? java.lang.Integer.valueOf(optJSONArray2.length()) : null);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRatioUtil", sb6.toString());
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            int length2 = optJSONArray2 != null ? optJSONArray2.length() : 0;
            for (int i18 = 0; i18 < length2; i18++) {
                org.json.JSONObject optJSONObject2 = optJSONArray2 != null ? optJSONArray2.optJSONObject(i18) : null;
                linkedList3.add(new xh2.a(null, new xh2.i(0.0f, 0.0f, 0.0f, 0.0f, optJSONObject2 != null ? optJSONObject2.optInt("i") : 0, 0, 0, true, 0, 0, 0L, 1888, null)));
            }
            linkedList.addAll(linkedList3);
        }
        if (linkedList.size() > 1) {
            kz5.g0.t(linkedList, new fj2.q());
        }
        return linkedList;
    }

    public final java.lang.String i(java.util.LinkedList dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        java.util.Iterator it = dataList.iterator();
        while (it.hasNext()) {
            xh2.a aVar = (xh2.a) it.next();
            if (aVar.f536054b.f536088g == 1) {
                return aVar.b();
            }
        }
        return "";
    }

    public final java.util.LinkedList j(java.util.LinkedList dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : dataList) {
            if (true ^ ((xh2.a) obj).f536054b.f536089h) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(((xh2.a) it.next()).f536054b.f536086e));
        }
        if (arrayList2.size() >= 8) {
            return linkedList;
        }
        if (!arrayList2.contains(2) && !arrayList2.contains(3)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.75f, 0.0f), new android.graphics.PointF(0.75f, 0.25f)));
        }
        if (!arrayList2.contains(4) && !arrayList2.contains(5)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.75f, 0.25f), new android.graphics.PointF(0.75f, 0.5f)));
        }
        if (!arrayList2.contains(1) && !arrayList2.contains(4)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.5f, 0.25f), new android.graphics.PointF(0.75f, 0.25f)));
        }
        if (!arrayList2.contains(3) && !arrayList2.contains(5)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.75f, 0.25f), new android.graphics.PointF(1.0f, 0.25f)));
        }
        if (!arrayList2.contains(6) && !arrayList2.contains(7)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.75f, 0.5f), new android.graphics.PointF(0.75f, 0.75f)));
        }
        if (!arrayList2.contains(4) && !arrayList2.contains(6)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.5f, 0.5f), new android.graphics.PointF(0.75f, 0.5f)));
        }
        if (!arrayList2.contains(5) && !arrayList2.contains(7)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.75f, 0.5f), new android.graphics.PointF(1.0f, 0.5f)));
        }
        if (!arrayList2.contains(8) && !arrayList2.contains(9)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.75f, 0.75f), new android.graphics.PointF(0.75f, 1.0f)));
        }
        if (!arrayList2.contains(6) && !arrayList2.contains(8)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.5f, 0.75f), new android.graphics.PointF(0.75f, 0.75f)));
        }
        if (!arrayList2.contains(7) && !arrayList2.contains(9)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.75f, 0.75f), new android.graphics.PointF(1.0f, 0.75f)));
        }
        return linkedList;
    }

    public final java.util.LinkedList k(java.util.LinkedList dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : dataList) {
            if (true ^ ((xh2.a) obj).f536054b.f536089h) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(((xh2.a) it.next()).f536054b.f536086e));
        }
        if (arrayList2.size() >= 8) {
            return linkedList;
        }
        if (!arrayList2.contains(1) && !arrayList2.contains(2)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.33333334f, 0.0f), new android.graphics.PointF(0.33333334f, 0.33333334f)));
        }
        if (!arrayList2.contains(2) && !arrayList2.contains(3)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.6666667f, 0.0f), new android.graphics.PointF(0.6666667f, 0.33333334f)));
        }
        if (!arrayList2.contains(4) && !arrayList2.contains(5)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.33333334f, 0.33333334f), new android.graphics.PointF(0.33333334f, 0.6666667f)));
        }
        if (!arrayList2.contains(5) && !arrayList2.contains(6)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.6666667f, 0.33333334f), new android.graphics.PointF(0.6666667f, 0.6666667f)));
        }
        if (!arrayList2.contains(1) && !arrayList2.contains(4)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.0f, 0.33333334f), new android.graphics.PointF(0.33333334f, 0.33333334f)));
        }
        if (!arrayList2.contains(2) && !arrayList2.contains(5)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.33333334f, 0.33333334f), new android.graphics.PointF(0.6666667f, 0.33333334f)));
        }
        if (!arrayList2.contains(3) && !arrayList2.contains(6)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.6666667f, 0.33333334f), new android.graphics.PointF(1.0f, 0.33333334f)));
        }
        if (!arrayList2.contains(7) && !arrayList2.contains(8)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.33333334f, 0.6666667f), new android.graphics.PointF(0.33333334f, 1.0f)));
        }
        if (!arrayList2.contains(8) && !arrayList2.contains(9)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.6666667f, 0.6666667f), new android.graphics.PointF(0.6666667f, 1.0f)));
        }
        if (!arrayList2.contains(4) && !arrayList2.contains(7)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.0f, 0.6666667f), new android.graphics.PointF(0.33333334f, 0.6666667f)));
        }
        if (!arrayList2.contains(5) && !arrayList2.contains(8)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.33333334f, 0.6666667f), new android.graphics.PointF(0.6666667f, 0.6666667f)));
        }
        if (!arrayList2.contains(6) && !arrayList2.contains(9)) {
            linkedList.add(new dj2.i(new android.graphics.PointF(0.6666667f, 0.6666667f), new android.graphics.PointF(1.0f, 0.6666667f)));
        }
        return linkedList;
    }

    public final android.graphics.RectF[] l(int i17, int i18, int i19, int i27, java.util.LinkedList dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        int i28 = 0;
        if (!((i17 == 0 && i19 == 0) || i17 == 1) || (i27 != 4 && i27 != 5 && i27 != 6)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : dataList) {
            xh2.a aVar = (xh2.a) obj;
            if ((aVar.f536053a == null || aVar.f536054b.f536089h) ? false : true) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[size];
        for (int i29 = 0; i29 < size; i29++) {
            rectFArr[i29] = new android.graphics.RectF();
        }
        for (java.lang.Object obj2 : arrayList) {
            int i37 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            xh2.i iVar = ((xh2.a) obj2).f536054b;
            float f17 = iVar.f364142a;
            float f18 = iVar.f364143b;
            rectFArr[i28] = new android.graphics.RectF(f17, f18, iVar.f364144c + f17, iVar.f364145d + f18);
            i28 = i37;
        }
        return rectFArr;
    }

    public final float m(float f17, android.graphics.Point curWindowSize, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curWindowSize, "curWindowSize");
        if (f17 == 1.0f) {
            return 0.0f;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf((i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 172) * f17) - ((curWindowSize.y - (i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17 == 5 ? 359 : 299) * f17)) / 2));
        if (!(valueOf.floatValue() >= 0.0f)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return 0.0f;
    }
}
