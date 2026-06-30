package qq;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final qq.b f447390a = new qq.b();

    public static final r45.fz2 a(qq.b bVar, java.lang.String str) {
        bVar.getClass();
        r45.fz2 fz2Var = new r45.fz2();
        fz2Var.f456274d = new java.util.LinkedList();
        r45.cp5 cp5Var = new r45.cp5();
        cp5Var.f453301d = 1;
        r45.ap5 ap5Var = new r45.ap5();
        cp5Var.f453302e = ap5Var;
        ap5Var.f451709d = new r45.x80();
        r45.ap5 ap5Var2 = cp5Var.f453302e;
        r45.x80 x80Var = ap5Var2 != null ? ap5Var2.f451709d : null;
        if (x80Var != null) {
            x80Var.f471386d = str;
        }
        r45.x80 x80Var2 = ap5Var2 != null ? ap5Var2.f451709d : null;
        if (x80Var2 != null) {
            r45.wm5 wm5Var = new r45.wm5();
            wm5Var.f470823d = 1;
            x80Var2.f471388f = wm5Var;
        }
        r45.ap5 ap5Var3 = cp5Var.f453302e;
        if (ap5Var3 != null) {
            ap5Var3.f451710e = new r45.x80();
        }
        r45.ap5 ap5Var4 = cp5Var.f453302e;
        r45.x80 x80Var3 = ap5Var4 != null ? ap5Var4.f451710e : null;
        if (x80Var3 != null) {
            x80Var3.f471386d = str;
        }
        r45.x80 x80Var4 = ap5Var4 != null ? ap5Var4.f451710e : null;
        if (x80Var4 != null) {
            r45.wm5 wm5Var2 = new r45.wm5();
            wm5Var2.f470823d = 1;
            x80Var4.f471388f = wm5Var2;
        }
        r45.yo5 yo5Var = new r45.yo5();
        cp5Var.f453303f = yo5Var;
        yo5Var.f472794d = new r45.t60();
        r45.yo5 yo5Var2 = cp5Var.f453303f;
        r45.t60 t60Var = yo5Var2 != null ? yo5Var2.f472794d : null;
        if (t60Var != null) {
            t60Var.f467701f = 0;
        }
        java.util.LinkedList linkedList = fz2Var.f456274d;
        if (linkedList != null) {
            linkedList.add(cp5Var);
        }
        return fz2Var;
    }

    public static final r45.fz2 b(qq.b bVar, java.lang.String str) {
        bVar.getClass();
        org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("nodes");
        r45.fz2 fz2Var = new r45.fz2();
        fz2Var.f456274d = new java.util.LinkedList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
            r45.cp5 cp5Var = new r45.cp5();
            cp5Var.f453301d = jSONObject.optInt("style", 1);
            if (jSONObject.has("content")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "getJSONObject(...)");
                r45.ap5 ap5Var = new r45.ap5();
                boolean has = jSONObject2.has("original");
                qq.b bVar2 = f447390a;
                if (has) {
                    org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("original");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "getJSONObject(...)");
                    ap5Var.f451709d = bVar2.c(jSONObject3);
                }
                if (jSONObject2.has(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47247x9eebe4b9)) {
                    org.json.JSONObject jSONObject4 = jSONObject2.getJSONObject(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47247x9eebe4b9);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "getJSONObject(...)");
                    ap5Var.f451710e = bVar2.c(jSONObject4);
                }
                cp5Var.f453302e = ap5Var;
            }
            if (jSONObject.has("attr")) {
                org.json.JSONObject jSONObject5 = jSONObject.getJSONObject("attr");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "getJSONObject(...)");
                r45.yo5 yo5Var = new r45.yo5();
                if (jSONObject5.has("common")) {
                    org.json.JSONObject jSONObject6 = jSONObject5.getJSONObject("common");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "getJSONObject(...)");
                    r45.t60 t60Var = new r45.t60();
                    t60Var.f467699d = jSONObject6.optInt("size", 0);
                    t60Var.f467701f = jSONObject6.optInt("line", 0);
                    t60Var.f467702g = jSONObject6.optInt("vertical_align", 0);
                    yo5Var.f472794d = t60Var;
                }
                if (jSONObject5.has("business")) {
                    org.json.JSONObject jSONObject7 = jSONObject5.getJSONObject("business");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject7, "getJSONObject(...)");
                    r45.lp lpVar = new r45.lp();
                    if (jSONObject7.has("radius")) {
                        lpVar.f461220f = (float) jSONObject7.getDouble("radius");
                    }
                    if (jSONObject7.has("reddot_pendant")) {
                        org.json.JSONObject optJSONObject = jSONObject7.optJSONObject("reddot_pendant");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optJSONObject, "optJSONObject(...)");
                        r45.xm5 xm5Var = new r45.xm5();
                        if (optJSONObject.has("original_position")) {
                            xm5Var.f471775d = optJSONObject.optInt("original_position");
                        }
                        if (optJSONObject.has("thumbnail_position")) {
                            xm5Var.f471776e = optJSONObject.optInt("thumbnail_position");
                        }
                        lpVar.f461222h = xm5Var;
                    }
                    yo5Var.f472795e = lpVar;
                }
                cp5Var.f453303f = yo5Var;
            }
            java.util.LinkedList linkedList = fz2Var.f456274d;
            if (linkedList != null) {
                linkedList.add(cp5Var);
            }
        }
        return fz2Var;
    }

    public final r45.x80 c(org.json.JSONObject jSONObject) {
        r45.x80 x80Var = new r45.x80();
        if (jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)) {
            x80Var.f471386d = jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        }
        if (jSONObject.has("icon")) {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("icon");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "getJSONObject(...)");
            r45.qy3 qy3Var = new r45.qy3();
            if (jSONObject2.has("image_url")) {
                org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("image_url");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "getJSONObject(...)");
                r45.xy3 xy3Var = new r45.xy3();
                if (jSONObject3.has("light")) {
                    xy3Var.f472126d = jSONObject3.getString("light");
                }
                if (jSONObject3.has("dark")) {
                    xy3Var.f472127e = jSONObject3.getString("dark");
                }
                qy3Var.f465885e = xy3Var;
            }
            x80Var.f471387e = qy3Var;
        }
        if (jSONObject.has("reddot_pendant")) {
            org.json.JSONObject jSONObject4 = jSONObject.getJSONObject("reddot_pendant");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "getJSONObject(...)");
            r45.wm5 wm5Var = new r45.wm5();
            wm5Var.f470823d = jSONObject4.optInt("static_icon", 0);
            x80Var.f471388f = wm5Var;
        }
        return x80Var;
    }
}
