package c75;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c75.c f121170a = new c75.c();

    public static final org.json.JSONObject a(org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        java.lang.String[] strArr = new java.lang.String[jSONObject.length()];
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        int i17 = 0;
        while (keys.hasNext()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            kz5.u0 u0Var = new kz5.u0(i17, keys.next());
            strArr[u0Var.f395548a] = (java.lang.String) u0Var.f395549b;
            i17 = i18;
        }
        return new org.json.JSONObject(jSONObject, strArr);
    }

    public static final void d(org.json.JSONArray jSONArray, yz5.l block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONArray, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            block.mo146xb9724478(jSONArray.get(i17));
        }
    }

    public static final java.lang.String e(org.json.JSONObject jsonObject, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.Object opt = jsonObject.opt(key);
        return (opt == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(org.json.JSONObject.NULL, opt)) ? "" : opt.toString();
    }

    public final org.json.JSONArray b(org.json.JSONArray jSONArray) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONArray, "<this>");
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        d(jSONArray, new c75.a(jSONArray2));
        return jSONArray2;
    }

    public final org.json.JSONObject c(org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object opt = jSONObject.opt(next);
            boolean z17 = opt instanceof org.json.JSONObject;
            c75.c cVar = f121170a;
            if (z17) {
                opt = cVar.c((org.json.JSONObject) opt);
            } else if (opt instanceof org.json.JSONArray) {
                opt = cVar.b((org.json.JSONArray) opt);
            }
            jSONObject2.put(next, opt);
        }
        return jSONObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #0 {Exception -> 0x001a, blocks: (B:18:0x0030, B:22:0x0036, B:25:0x0044, B:27:0x004b, B:30:0x005b, B:32:0x0061, B:35:0x0071, B:37:0x0077, B:40:0x0087, B:42:0x0090, B:44:0x00a1, B:47:0x00b1, B:49:0x00b9, B:51:0x00c2, B:54:0x00c8, B:63:0x0093, B:65:0x009b), top: B:17:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(org.json.JSONObject r8, android.net.Uri r9) {
        /*
            r7 = this;
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            if (r9 != 0) goto L8
            return
        L8:
            java.util.Set r0 = r9.getQueryParameterNames()
            if (r0 == 0) goto Lcd
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            goto Lcd
        L16:
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lcd
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L29
            goto L1a
        L29:
            java.lang.String r2 = r9.getQueryParameter(r1)
            if (r2 != 0) goto L30
            goto L1a
        L30:
            java.lang.Integer r3 = r26.h0.h(r2)     // Catch: java.lang.Exception -> L1a
            if (r3 == 0) goto L44
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L1a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L1a
            org.json.JSONObject r3 = r8.putOpt(r1, r3)     // Catch: java.lang.Exception -> L1a
            if (r3 != 0) goto L1a
        L44:
            java.lang.Long r3 = r26.h0.j(r2)     // Catch: java.lang.Exception -> L1a
            r4 = 0
            if (r3 == 0) goto L58
            long r5 = r3.longValue()     // Catch: java.lang.Exception -> L1a
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L1a
            org.json.JSONObject r3 = r8.putOpt(r1, r3)     // Catch: java.lang.Exception -> L1a
            goto L59
        L58:
            r3 = r4
        L59:
            if (r3 != 0) goto L1a
            java.lang.Float r3 = r26.g0.f(r2)     // Catch: java.lang.Exception -> L1a
            if (r3 == 0) goto L6e
            float r3 = r3.floatValue()     // Catch: java.lang.Exception -> L1a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1a
            org.json.JSONObject r3 = r8.putOpt(r1, r3)     // Catch: java.lang.Exception -> L1a
            goto L6f
        L6e:
            r3 = r4
        L6f:
            if (r3 != 0) goto L1a
            java.lang.Double r3 = r26.g0.e(r2)     // Catch: java.lang.Exception -> L1a
            if (r3 == 0) goto L84
            double r5 = r3.doubleValue()     // Catch: java.lang.Exception -> L1a
            java.lang.Double r3 = java.lang.Double.valueOf(r5)     // Catch: java.lang.Exception -> L1a
            org.json.JSONObject r3 = r8.putOpt(r1, r3)     // Catch: java.lang.Exception -> L1a
            goto L85
        L84:
            r3 = r4
        L85:
            if (r3 != 0) goto L1a
            java.lang.String r3 = "true"
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)     // Catch: java.lang.Exception -> L1a
            if (r3 == 0) goto L93
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L1a
            goto L9f
        L93:
            java.lang.String r3 = "false"
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)     // Catch: java.lang.Exception -> L1a
            if (r3 == 0) goto L9e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L1a
            goto L9f
        L9e:
            r3 = r4
        L9f:
            if (r3 == 0) goto Lae
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L1a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L1a
            org.json.JSONObject r3 = r8.putOpt(r1, r3)     // Catch: java.lang.Exception -> L1a
            goto Laf
        Lae:
            r3 = r4
        Laf:
            if (r3 != 0) goto L1a
            r26.t r3 = r26.w.f450454a     // Catch: java.lang.Exception -> L1a java.lang.NumberFormatException -> Lbf
            boolean r3 = r3.e(r2)     // Catch: java.lang.Exception -> L1a java.lang.NumberFormatException -> Lbf
            if (r3 == 0) goto Lbf
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L1a java.lang.NumberFormatException -> Lbf
            r3.<init>(r2)     // Catch: java.lang.Exception -> L1a java.lang.NumberFormatException -> Lbf
            goto Lc0
        Lbf:
            r3 = r4
        Lc0:
            if (r3 == 0) goto Lc6
            org.json.JSONObject r4 = r8.putOpt(r1, r3)     // Catch: java.lang.Exception -> L1a
        Lc6:
            if (r4 != 0) goto L1a
            r8.putOpt(r1, r2)     // Catch: java.lang.Exception -> L1a
            goto L1a
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c75.c.f(org.json.JSONObject, android.net.Uri):void");
    }

    public final android.os.Bundle g(org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            java.lang.String str = next;
            java.lang.Object opt = jSONObject.opt(str);
            if (opt != null) {
                if (opt instanceof java.lang.Integer) {
                    bundle.putInt(str, ((java.lang.Number) opt).intValue());
                } else if (opt instanceof java.lang.Long) {
                    bundle.putLong(str, ((java.lang.Number) opt).longValue());
                } else if (opt instanceof java.lang.Float) {
                    bundle.putFloat(str, ((java.lang.Number) opt).floatValue());
                } else if (opt instanceof java.lang.Double) {
                    bundle.putDouble(str, ((java.lang.Number) opt).doubleValue());
                } else if (opt instanceof java.lang.Boolean) {
                    bundle.putBoolean(str, ((java.lang.Boolean) opt).booleanValue());
                } else if (opt instanceof java.lang.String) {
                    bundle.putString(str, (java.lang.String) opt);
                }
            }
        }
        return bundle;
    }
}
