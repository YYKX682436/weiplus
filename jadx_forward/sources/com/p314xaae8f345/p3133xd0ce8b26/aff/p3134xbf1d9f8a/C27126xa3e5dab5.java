package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.affroam.ZIDL_esFfH6f8K */
/* loaded from: classes5.dex */
public class C27126xa3e5dab5 {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* renamed from: ZIDL_DX */
    private void m110731x1964d1dc(java.lang.Object obj, int i17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j1) obj).mo53948xdc453139(i17);
    }

    /* renamed from: ZIDL_EX */
    private void m110732x1964d1fb(java.lang.Object obj, int i17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m1) obj).mo110999xdc453139(i17);
    }

    /* renamed from: ZIDL_GX */
    private void m110733x1964d239(java.lang.Object obj, int i17, int i18, byte[] bArr, byte[] bArr2) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        if (i18 != 0) {
        }
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        throw null;
    }

    /* renamed from: ZIDL_HX */
    private void m110734x1964d258(java.lang.Object obj, int i17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v vVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v.f297525i, bArr);
        lo1.d dVar = (lo1.d) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n1) obj);
        dVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on deviceInfo gotten, errorCode=");
        sb6.append(i17);
        sb6.append(", deviceId=");
        java.lang.String str = dVar.f401629a;
        sb6.append(str);
        sb6.append(", info=");
        sb6.append(vVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.AppBrandJsApiRoamApiHandler", sb6.toString());
        if (i17 != 0) {
            dVar.f401630b.mo152xb9724478();
            return;
        }
        org.json.JSONObject put = new org.json.JSONObject().put("deviceId", str).put("totalSize", vVar.f297526d).put("usedSize", vVar.f297527e).put("backupUsedSize", vVar.f297528f).put("lastBackupTime", vVar.f297529g).put("cached", vVar.f297530h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(put);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamJsApiEvent", "post event:deviceInfo, data:" + put);
        put.put("notify_type", "deviceInfo");
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Ai("wxd930c3b7cf7c92e6", put.toString());
    }

    /* renamed from: ZIDL_esFfH6f8D */
    public static native void m110735xa3e5daae(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_B */
    public native int m110736x9db8edfa(long j17, byte[] bArr);

    /* renamed from: ZIDL_C */
    public native int m110737x9db8edfb(long j17, byte[] bArr);

    /* renamed from: ZIDL_DV */
    public native void m110738x1964d1da(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_EV */
    public native void m110739x1964d1f9(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_GV */
    public native void m110740x1964d237(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_HV */
    public native void m110741x1964d256(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_esFfH6f8C */
    public native void m110742xa3e5daad(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2, java.lang.Object obj3);
}
