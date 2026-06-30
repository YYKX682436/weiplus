package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.k0 f165380a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.k0();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0 a(org.json.JSONObject jSONObject, org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e videoSink, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l appBrandComponent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.j0 opCode) {
        com.p314xaae8f345.mm.p817x5682e1b2.C10823x808d2998 c10823x808d2998;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoSink, "videoSink");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandComponent, "appBrandComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opCode, "opCode");
        if (jSONObject == null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0.f165370g;
        }
        int optInt = jSONObject.optInt("mediaStreamTrackId");
        if (appBrandComponent instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 y17 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) appBrandComponent).y1();
            synchronized (y17) {
                c10823x808d2998 = y17.f128897h;
            }
        } else if (appBrandComponent instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 y18 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) appBrandComponent).v3().y1();
            synchronized (y18) {
                c10823x808d2998 = y18.f128897h;
            }
        } else {
            c10823x808d2998 = null;
        }
        if (c10823x808d2998 == null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0.f165368e;
        }
        if (!c10823x808d2998.m46415x39e05d35()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0.f165369f;
        }
        int ordinal = opCode.ordinal();
        if (ordinal == 0) {
            return c10823x808d2998.m46407xfc9c2106(videoSink, optInt) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0.f165367d : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0.f165371h;
        }
        if (ordinal == 1) {
            return c10823x808d2998.m46417x46f32260(videoSink, optInt) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0.f165367d : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0.f165371h;
        }
        throw new jz5.j();
    }
}
