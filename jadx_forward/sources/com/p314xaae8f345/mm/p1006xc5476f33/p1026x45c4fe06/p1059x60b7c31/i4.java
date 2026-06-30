package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class i4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f34354x366c91de = 410;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f34355x24728b = "batchGetContact";

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u3(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null) {
            return;
        }
        if (jSONObject == null) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("appIds");
        if (optJSONArray != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int length = optJSONArray.length();
            int i18 = 0;
            while (true) {
                java.lang.String str = null;
                if (i18 >= length) {
                    break;
                }
                java.lang.Object opt = optJSONArray.opt(i18);
                if (opt != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(org.json.JSONObject.NULL, opt)) {
                    str = opt.toString();
                }
                if (!(str == null || str.length() == 0)) {
                    linkedList.add(str);
                }
                i18++;
            }
            if (linkedList.isEmpty()) {
                linkedList = null;
            }
            if (linkedList != null) {
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) yVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class);
                if (c0Var == null) {
                    yVar.a(i17, o("fail:internal error"));
                    return;
                }
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(yVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g4 g4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g4(weakReference, i17, this, uuid);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + i17 + ").load(), hostWxaAppId[" + yVar.mo48798x74292566() + "], eventCallbackId[" + uuid + "] appIds[" + u46.l.i(linkedList.iterator(), ",") + ']');
                java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y3(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b4(mo48798x74292566, i17, linkedList, c0Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f4(i17, weakReference, this), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c4(i17, g4Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e4(i17, weakReference, uuid), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d4(i17, g4Var, weakReference, uuid)));
                return;
            }
        }
        yVar.a(i17, o("fail:appIds is empty"));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
