package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/q;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "com/tencent/mm/plugin/lite/jsapi/comms/l", "com/tencent/mm/plugin/lite/jsapi/comms/m", "com/tencent/mm/plugin/lite/jsapi/comms/n", "com/tencent/mm/plugin/lite/jsapi/comms/o", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f225253g;

    static {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        f225253g = lp0.b.h0("liteappjsapi_addfiletofavorites");
    }

    public final void A(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String str6;
        r45.bq0 bq0Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
        if (str3 == null) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str7 = a17.f294812f;
            if (str7 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str7, false, false);
                if (!str7.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            java.lang.String str8 = a17.f294812f;
            int lastIndexOf = str8.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str8 = str8.substring(lastIndexOf + 1);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str8, "getName(...)");
            str6 = str8;
        } else {
            str6 = str3;
        }
        java.lang.String str9 = str4 == null ? "" : str4;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) c5Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.k(c5303xc75d2f73, 37, str, str6, str9, str5);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        r45.jq0 jq0Var = (c4Var == null || (bq0Var = c4Var.f87848a) == null) ? null : bq0Var.f452495d;
        if (jq0Var != null) {
            jq0Var.i("c2c_file_preview_" + str2);
        }
        c5303xc75d2f73.e();
        am.d4 d4Var = c5303xc75d2f73.f135624h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiAddFileToFavorites", "addFileToFavorites, ret: " + (d4Var != null ? java.lang.Integer.valueOf(d4Var.f87966a) : null));
    }

    public final void B(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n) it.next();
            java.lang.String str = nVar.f225219a;
            byte[] bytes = (nVar.f225219a + nVar.f225220b).getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
            java.lang.String str2 = nVar.f225220b;
            A(str, g17, str2, nVar.f225221c, com.p314xaae8f345.mm.vfs.w6.n(str2));
        }
    }

    public final java.lang.Integer C(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.app.Activity activity) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.j(c5303xc75d2f73, f9Var, false);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (c4Var != null) {
            c4Var.f87856i = activity;
        }
        c5303xc75d2f73.e();
        am.d4 d4Var = c5303xc75d2f73.f135624h;
        java.lang.Integer valueOf = d4Var != null ? java.lang.Integer.valueOf(d4Var.f87966a) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiAddFileToFavorites", "addMessageToFavorites, ret: " + valueOf);
        return valueOf;
    }

    public final void D(java.util.List list) {
        e40.c0 c0Var = (e40.c0) i95.n0.c(e40.c0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o) it.next();
            arrayList.add(new e40.y(oVar.f225227a, oVar.f225228b, oVar.f225231e, oVar.f225229c, oVar.f225230d, 0L, 32, null));
        }
        ((d40.t) c0Var).Zi(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p(this, list));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0011, B:6:0x001f, B:8:0x0029, B:13:0x0035, B:15:0x0050, B:17:0x0058, B:18:0x005d, B:22:0x0092, B:23:0x009d, B:25:0x009e, B:27:0x00a4, B:28:0x00b2, B:31:0x00b9, B:34:0x00c7, B:36:0x00d7, B:38:0x0115, B:39:0x011b, B:41:0x0125, B:43:0x0135, B:45:0x0166, B:47:0x017c, B:51:0x0184, B:53:0x0197, B:55:0x01b7, B:59:0x00a9), top: B:2:0x0011 }] */
    @Override // jd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r26, org.json.JSONObject r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q.a(java.lang.String, org.json.JSONObject, boolean):void");
    }
}
