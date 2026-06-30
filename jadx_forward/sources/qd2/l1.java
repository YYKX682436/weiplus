package qd2;

/* loaded from: classes10.dex */
public final class l1 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r13, qd2.k1 r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qd2.l1.a(android.content.Context, qd2.k1):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qd2.k1 b(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qd2.l1.b(java.lang.String):qd2.k1");
    }

    public final qd2.k1 c(java.lang.String str) {
        try {
            java.lang.String mo10219xa23d6ecc = ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10219xa23d6ecc(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderSharePostHelper", "get simple mp4 info %s", mo10219xa23d6ecc);
            org.json.JSONObject jSONObject = new org.json.JSONObject(mo10219xa23d6ecc);
            qd2.k1 k1Var = new qd2.k1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            k1Var.f443320a = str;
            jSONObject.getInt("videoDuration");
            k1Var.f443323d = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122);
            k1Var.f443324e = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b);
            jSONObject.getInt("videoBitrate");
            jSONObject.getInt("videoFPS");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10218x9787f6ed(str);
            k1Var.f443321b = j33.q.a(jSONObject.getString("videoType"));
            k1Var.f443322c = j33.q.a(jSONObject.getString("audioType"));
            return k1Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LogPost.FinderSharePostHelper", e17, "loadItemFromSimpleMP4Info fail", new java.lang.Object[0]);
            return null;
        }
    }
}
