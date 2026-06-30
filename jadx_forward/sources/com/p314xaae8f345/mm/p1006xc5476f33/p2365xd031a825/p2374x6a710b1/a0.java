package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.a0 f262382a = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.a0();

    public final java.lang.Long a(java.lang.String base64Data, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base64Data, "base64Data");
        byte[] decode = android.util.Base64.decode(base64Data, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
        if (decode.length == 0) {
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27555xc6c7e3f0("half_page_view_data", decode);
        m27539xaf65a0fc.mo27564xf2e7ce2b("usecase_platform_session", currentTimeMillis);
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        if (qVar != null) {
            qVar.mo24837xef221a95("complianceHalfPage", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z(pVar));
        }
        return java.lang.Long.valueOf(currentTimeMillis);
    }
}
