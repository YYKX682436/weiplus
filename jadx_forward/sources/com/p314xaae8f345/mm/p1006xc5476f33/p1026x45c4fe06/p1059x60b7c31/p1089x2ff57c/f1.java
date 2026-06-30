package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class f1 {
    public f1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.lang.String TAG, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TAG, "TAG");
        java.lang.String optString = jSONObject != null ? jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37650x1214b17) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "invokeSync with filename:" + optString + ", appId:" + yVar.mo48798x74292566());
        if (optString == null || optString.length() == 0) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0("fail:invalid data", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = yVar.x();
        if (x17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "invokeSync get NULL reader, appId:" + yVar.mo48798x74292566());
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0("fail:internal error", new java.lang.Object[0]);
        }
        java.io.InputStream a17 = x17.a(optString);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "invokeSync filename(" + optString + ") not found, appId:" + yVar.mo48798x74292566());
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0("fail:file doesn't exist", new java.lang.Object[0]);
        }
        try {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(a17.available());
            if (a17 instanceof nf.a) {
                allocateDirect.put(((nf.a) a17).f418105d);
            } else {
                allocateDirect.put(java.nio.ByteBuffer.wrap(ik1.f.b(a17)));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(allocateDirect);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0("ok", new java.lang.Object[0]);
            ((java.util.HashMap) j0Var.f162852a).put("arrayBuffer", allocateDirect);
            vz5.b.a(a17, null);
            return j0Var;
        } finally {
        }
    }
}
