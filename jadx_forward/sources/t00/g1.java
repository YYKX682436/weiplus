package t00;

/* loaded from: classes.dex */
public final class g1 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495867o;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.feature.ecs.share.o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        t00.e1 e1Var = new t00.e1();
        e1Var.f495810b = callback;
        e1Var.f495811c = jSONObject;
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("OpenShareDialogEcsActionHandler", "params not set");
            callback.a();
            return;
        }
        e1Var.f495809a = optJSONObject.optString("relayParams");
        ?? r37 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p.f147530d;
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("menuList1");
        if (optJSONArray != null) {
            t00.b1 b1Var = t00.b1.f495800d;
            linkedList = new java.util.LinkedList();
            cf.f.b(optJSONArray, new cf.e(b1Var, linkedList));
        } else {
            linkedList = null;
        }
        ?? r47 = kz5.p0.f395529d;
        if (linkedList == null) {
            linkedList = r47;
        }
        java.util.List a17 = r37.a(linkedList);
        org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("menuList2Custom");
        if (optJSONArray2 != null) {
            t00.c1 c1Var = t00.c1.f495803d;
            linkedList2 = new java.util.LinkedList();
            cf.f.b(optJSONArray2, new cf.e(c1Var, linkedList2));
        } else {
            linkedList2 = null;
        }
        if (linkedList2 == null) {
            linkedList2 = r47;
        }
        org.json.JSONArray optJSONArray3 = optJSONObject.optJSONArray("menuList2");
        if (optJSONArray3 != null) {
            t00.d1 d1Var = t00.d1.f495806d;
            linkedList3 = new java.util.LinkedList();
            cf.f.b(optJSONArray3, new cf.e(d1Var, linkedList3));
        } else {
            linkedList3 = null;
        }
        if (linkedList3 != null) {
            r47 = linkedList3;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) it.next();
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147503e;
            if (jSONObject2.optInt("disable") <= 0) {
                z17 = false;
            }
            arrayList2.add(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p(bVar, jSONObject2, z17));
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(r37.a(r47));
        java.util.ArrayList arrayList3 = (java.util.ArrayList) a17;
        if (arrayList3.isEmpty() && arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("OpenShareDialogEcsActionHandler", "menuList is empty");
            callback.a();
            return;
        }
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("sourceReportData");
        if (context == null) {
            callback.a();
            return;
        }
        if (arrayList3.isEmpty() && arrayList.isEmpty()) {
            str = "menuList is Empty";
        } else {
            java.util.Iterator it6 = arrayList3.iterator();
            while (true) {
                if (it6.hasNext()) {
                    com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar2 = ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p) it6.next()).f147531a;
                    if (bVar2 != com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147504f && bVar2 != com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147505g && bVar2 != com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147508m) {
                        str = "menuList1 parameter is invalid";
                        break;
                    }
                } else {
                    java.util.Iterator it7 = arrayList.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            str = null;
                            break;
                        }
                        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p pVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p) it7.next();
                        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar3 = pVar.f147531a;
                        if (bVar3 != com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147503e) {
                            if (bVar3 != com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147506h && bVar3 != com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147507i) {
                                str = "menuList2 parameter is invalid";
                                break;
                            }
                        } else {
                            org.json.JSONObject jSONObject3 = pVar.f147532b;
                            if (jSONObject3 == null || jSONObject3.optInt(dm.i4.f66865x76d1ec5a) == 0) {
                                break;
                            }
                            java.lang.String optString = jSONObject3.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                            if (optString == null || optString.length() == 0) {
                                break;
                            }
                            java.lang.String optString2 = jSONObject3.optString("icon");
                            if (optString2 == null || optString2.length() == 0) {
                                break;
                            }
                            java.lang.String optString3 = jSONObject3.optString("darkIcon");
                            if (optString3 == null || optString3.length() == 0) {
                                break;
                            }
                        }
                    }
                    str = "menuList2Custom parameter is invalid";
                }
            }
        }
        if (str == null) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.n(context, a17, arrayList, e1Var, optJSONObject2));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("OpenShareDialogEcsActionHandler", "didCancel: ".concat(str));
        c00.n3 n3Var = e1Var.f495810b;
        if (n3Var != null) {
            n3Var.a();
        }
    }

    @Override // t00.r0
    public org.json.JSONObject f(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envHandler, "envHandler");
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        org.json.JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("menuList2Custom") : null;
        if (optJSONArray == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        t00.f1 f1Var = t00.f1.f495812d;
        java.util.LinkedList<org.json.JSONObject> linkedList = new java.util.LinkedList();
        cf.f.b(optJSONArray, new cf.e(f1Var, linkedList));
        for (org.json.JSONObject jSONObject2 : linkedList) {
            java.lang.String optString = jSONObject2.optString("icon");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            java.lang.String mo13731xbb4d21ce = envHandler.mo13731xbb4d21ce(optString);
            boolean z17 = true;
            if (!(optString.length() == 0)) {
                if (!(mo13731xbb4d21ce == null || mo13731xbb4d21ce.length() == 0)) {
                    jSONObject.put(optString, mo13731xbb4d21ce);
                    java.lang.String optString2 = jSONObject2.optString("darkIcon");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    java.lang.String mo13731xbb4d21ce2 = envHandler.mo13731xbb4d21ce(optString2);
                    if (!(optString2.length() == 0)) {
                        if (mo13731xbb4d21ce2 != null && mo13731xbb4d21ce2.length() != 0) {
                            z17 = false;
                        }
                        if (!z17) {
                            jSONObject.put(optString2, mo13731xbb4d21ce2);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    @Override // t00.r0
    public boolean g() {
        return false;
    }
}
