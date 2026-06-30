package el;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lel/k;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-fav_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public final java.lang.String A(java.lang.String str) {
        if (str != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 B(el.g action, android.app.Activity activity, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 doFavEvent, r45.bq0 favProtoItem, r45.jq0 sourceItem, r45.op0 liteAppItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doFavEvent, "doFavEvent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favProtoItem, "favProtoItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceItem, "sourceItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppItem, "liteAppItem");
        am.c4 c4Var = doFavEvent.f135623g;
        java.lang.String str = action.f335232c;
        c4Var.f87852e = str;
        java.lang.String str2 = action.f335231b;
        c4Var.f87851d = str2;
        c4Var.f87850c = 24;
        c4Var.f87848a = favProtoItem;
        favProtoItem.o(sourceItem);
        c4Var.f87865r = action.f335242m;
        if (activity != null) {
            c4Var.f87856i = activity;
        }
        c4Var.f87866s = hashCode();
        int i17 = action.f335234e;
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    i18 = 0;
                }
            }
        }
        c4Var.f87867t = i18;
        sourceItem.e(c01.z1.r());
        sourceItem.j(c01.z1.r());
        sourceItem.b(action.f335244o);
        sourceItem.g(37);
        sourceItem.i(action.f335233d);
        sourceItem.c(java.lang.System.currentTimeMillis());
        liteAppItem.f463947n = action.f335238i;
        liteAppItem.f463948o = action.f335239j;
        liteAppItem.f463942f = action.f335241l;
        liteAppItem.f463949p = action.f335240k;
        liteAppItem.f463940d = action.f335236g;
        liteAppItem.f463946m = str;
        liteAppItem.f463945i = str2;
        liteAppItem.f463943g = action.f335237h;
        liteAppItem.f463944h = action.f335235f;
        liteAppItem.f463941e = i17;
        liteAppItem.f463950q = action.f335230a;
        liteAppItem.f463952s = action.f335243n;
        liteAppItem.f463954u = action.f335245p;
        c4Var.f87848a.P = liteAppItem;
        return doFavEvent;
    }

    public final java.util.LinkedList C(org.json.JSONArray jSONArray) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                try {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    r45.np0 np0Var = new r45.np0();
                    np0Var.f463097d = jSONObject.optString("excerptKey", "");
                    np0Var.f463098e = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "");
                    np0Var.f463099f = jSONObject.optString("url", "");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np0Var.f463097d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np0Var.f463098e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np0Var.f463099f)) {
                        linkedList.add(np0Var);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiFavoriteAction", "parse excerptList item error: " + e17.getMessage());
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013d A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:6:0x002e, B:8:0x0038, B:9:0x003c, B:11:0x0056, B:12:0x005a, B:14:0x006f, B:15:0x0073, B:17:0x0081, B:18:0x0085, B:20:0x0093, B:21:0x0097, B:23:0x00a5, B:26:0x00ac, B:27:0x00b3, B:29:0x00bd, B:31:0x00c3, B:32:0x00ca, B:34:0x00d5, B:35:0x00d9, B:37:0x00e8, B:38:0x00ec, B:40:0x00fa, B:42:0x0100, B:43:0x0107, B:46:0x0112, B:50:0x011e, B:52:0x0127, B:56:0x0133, B:58:0x013d, B:60:0x0143, B:61:0x014c, B:63:0x0157, B:66:0x0162, B:68:0x016c, B:70:0x0172, B:71:0x017b), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143 A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:6:0x002e, B:8:0x0038, B:9:0x003c, B:11:0x0056, B:12:0x005a, B:14:0x006f, B:15:0x0073, B:17:0x0081, B:18:0x0085, B:20:0x0093, B:21:0x0097, B:23:0x00a5, B:26:0x00ac, B:27:0x00b3, B:29:0x00bd, B:31:0x00c3, B:32:0x00ca, B:34:0x00d5, B:35:0x00d9, B:37:0x00e8, B:38:0x00ec, B:40:0x00fa, B:42:0x0100, B:43:0x0107, B:46:0x0112, B:50:0x011e, B:52:0x0127, B:56:0x0133, B:58:0x013d, B:60:0x0143, B:61:0x014c, B:63:0x0157, B:66:0x0162, B:68:0x016c, B:70:0x0172, B:71:0x017b), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157 A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:6:0x002e, B:8:0x0038, B:9:0x003c, B:11:0x0056, B:12:0x005a, B:14:0x006f, B:15:0x0073, B:17:0x0081, B:18:0x0085, B:20:0x0093, B:21:0x0097, B:23:0x00a5, B:26:0x00ac, B:27:0x00b3, B:29:0x00bd, B:31:0x00c3, B:32:0x00ca, B:34:0x00d5, B:35:0x00d9, B:37:0x00e8, B:38:0x00ec, B:40:0x00fa, B:42:0x0100, B:43:0x0107, B:46:0x0112, B:50:0x011e, B:52:0x0127, B:56:0x0133, B:58:0x013d, B:60:0x0143, B:61:0x014c, B:63:0x0157, B:66:0x0162, B:68:0x016c, B:70:0x0172, B:71:0x017b), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:6:0x002e, B:8:0x0038, B:9:0x003c, B:11:0x0056, B:12:0x005a, B:14:0x006f, B:15:0x0073, B:17:0x0081, B:18:0x0085, B:20:0x0093, B:21:0x0097, B:23:0x00a5, B:26:0x00ac, B:27:0x00b3, B:29:0x00bd, B:31:0x00c3, B:32:0x00ca, B:34:0x00d5, B:35:0x00d9, B:37:0x00e8, B:38:0x00ec, B:40:0x00fa, B:42:0x0100, B:43:0x0107, B:46:0x0112, B:50:0x011e, B:52:0x0127, B:56:0x0133, B:58:0x013d, B:60:0x0143, B:61:0x014c, B:63:0x0157, B:66:0x0162, B:68:0x016c, B:70:0x0172, B:71:0x017b), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172 A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:6:0x002e, B:8:0x0038, B:9:0x003c, B:11:0x0056, B:12:0x005a, B:14:0x006f, B:15:0x0073, B:17:0x0081, B:18:0x0085, B:20:0x0093, B:21:0x0097, B:23:0x00a5, B:26:0x00ac, B:27:0x00b3, B:29:0x00bd, B:31:0x00c3, B:32:0x00ca, B:34:0x00d5, B:35:0x00d9, B:37:0x00e8, B:38:0x00ec, B:40:0x00fa, B:42:0x0100, B:43:0x0107, B:46:0x0112, B:50:0x011e, B:52:0x0127, B:56:0x0133, B:58:0x013d, B:60:0x0143, B:61:0x014c, B:63:0x0157, B:66:0x0162, B:68:0x016c, B:70:0x0172, B:71:0x017b), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final el.g D(java.lang.String r25, org.json.JSONObject r26) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: el.k.D(java.lang.String, org.json.JSONObject):el.g");
    }

    public final jz5.l E(org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        java.lang.Object obj = hashMap.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        java.lang.String A = A(obj instanceof java.lang.String ? (java.lang.String) obj : null);
        java.lang.Object obj2 = hashMap.get("query");
        return new jz5.l(A, A(obj2 != null ? obj2.toString() : null));
    }

    public final java.lang.String F(org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        java.lang.Object obj = hashMap.get("appId");
        return A(obj instanceof java.lang.String ? (java.lang.String) obj : null);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        el.g D;
        if (jSONObject == null || (D = D(str, jSONObject)) == null) {
            return;
        }
        if (D.f335233d.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", "identifier is null or empty");
            this.f224976f.a("identifier is empty");
            return;
        }
        int i17 = D.f335246q;
        if (i17 == 1 || i17 == 3) {
            ((ku5.t0) ku5.t0.f394148d).B(new el.i(this, D));
        } else if (i17 == 2) {
            ((ku5.t0) ku5.t0.f394148d).B(new el.j(this, D));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", "actionType is illegal:%d", java.lang.Integer.valueOf(i17));
            this.f224976f.a("actionType is illegal");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        o72.r2 r2Var;
        if ((m1Var instanceof o72.h5) && (r2Var = ((o72.h5) m1Var).f424879f) != null && r2Var.f67654x36b6411 == hashCode()) {
            gm0.j1.d().q(401, this);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (i17 == 0 && i18 == 0) {
                jSONObject.put("result", true);
                jSONObject.put("errMsg", str);
                jSONObject.put(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e, r2Var.f67650x85d9e03b);
            } else {
                jSONObject.put("result", false);
                jSONObject.put("errMsg", str);
                jSONObject.put(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e, r2Var.f67650x85d9e03b);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", "[onSceneEnd] errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str + ", favId = " + r2Var.f67643xc8a07680 + ", return json = " + jSONObject);
            this.f224976f.c(jSONObject, false);
        }
    }
}
