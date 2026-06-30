package com.p314xaae8f345.p3133xd0ce8b26.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.iam.biz.ZIDL_pjvjmq0eK */
/* loaded from: classes11.dex */
public class C27610x500dfcdc {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* renamed from: ZIDL_DX */
    private void m118173x1964d1dc(java.lang.Object obj, byte[][] bArr) {
        java.util.ArrayList<r45.d6> m119629xd40dd8d = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(r45.d6.f453671g, bArr);
        vw.i iVar = (vw.i) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l1) obj);
        yz5.l lVar = iVar.f522192b;
        vw.k kVar = iVar.f522191a;
        if (m119629xd40dd8d == null) {
            kVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizProfileDraftDataUtil", "getBizProfileDraftAppMsgIdTask msg null");
            lVar.mo146xb9724478("");
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (r45.d6 d6Var : m119629xd40dd8d) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("appMsgId", d6Var.f453672d);
            jSONObject.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, d6Var.f453673e);
            kVar.getClass();
            jSONArray.put(jSONObject);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("appMsgIds", jSONArray);
        kVar.getClass();
        jSONObject2.toString();
        java.lang.String jSONObject3 = jSONObject2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        lVar.mo146xb9724478(jSONObject3);
    }

    /* renamed from: ZIDL_FX */
    private void m118174x1964d21a(java.lang.Object obj, byte[][] bArr) {
        java.util.ArrayList m119629xd40dd8d = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(r45.e6.f454570f, bArr);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.j(((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.k) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.k1) obj)).f235908a, m119629xd40dd8d));
    }

    /* renamed from: ZIDL_GX */
    private void m118175x1964d239(java.lang.Object obj, byte[][] bArr) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(r45.e6.f454570f, bArr);
        throw null;
    }

    /* renamed from: ZIDL_HX */
    private void m118176x1964d258(java.lang.Object obj, boolean z17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.i1) obj).mo67673xdc453139(z17);
    }

    /* renamed from: ZIDL_IX */
    private void m118177x1964d277(java.lang.Object obj, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l(((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.m1) obj)).f235983a, str));
    }

    /* renamed from: ZIDL_JX */
    private void m118178x1964d296(java.lang.Object obj) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    /* renamed from: ZIDL_pjvjmq0eD */
    public static native void m118179x500dfcd5(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_B */
    public native void m118180x9db8edfa(long j17, int i17);

    /* renamed from: ZIDL_C */
    public native void m118181x9db8edfb(long j17, byte[][] bArr);

    /* renamed from: ZIDL_DV */
    public native void m118182x1964d1da(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_E */
    public native void m118183x9db8edfd(long j17, int i17);

    /* renamed from: ZIDL_FV */
    public native void m118184x1964d218(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_GV */
    public native void m118185x1964d237(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_HV */
    public native void m118186x1964d256(long j17, java.lang.Object obj, int i17, int i18);

    /* renamed from: ZIDL_IV */
    public native void m118187x1964d275(long j17, java.lang.Object obj, int i17, int i18);

    /* renamed from: ZIDL_JV */
    public native void m118188x1964d294(long j17, java.lang.Object obj, int i17);

    /* renamed from: ZIDL_K */
    public native void m118189x9db8ee03(long j17);

    /* renamed from: ZIDL_L */
    public native void m118190x9db8ee04(long j17);

    /* renamed from: ZIDL_M */
    public native void m118191x9db8ee05(long j17, byte[][] bArr);

    /* renamed from: ZIDL_O */
    public native void m118192x9db8ee07(long j17, byte[][] bArr);

    /* renamed from: ZIDL_pjvjmq0eC */
    public native void m118193x500dfcd4(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2, java.lang.Object obj3);
}
