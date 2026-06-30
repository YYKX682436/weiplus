package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.mm.brand_service.ZIDL_q1bTCHfwK */
/* loaded from: classes11.dex */
public class C27652x79467dfb {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* renamed from: ZIDL_AX */
    private void m118846x1964d17f(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        java.lang.Integer h17;
        java.lang.String str;
        ow.j jVar = (ow.j) ((com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c0) obj);
        jVar.getClass();
        e31.k a17 = e31.n.f328620a.a("name_biz");
        if (a17 != null) {
            g31.l lVar = (g31.l) a17;
            if (lVar.f349627g) {
                boolean z17 = false;
                k31.a aVar = lVar.f349621a;
                if (aVar != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(((k31.h) aVar).c()).i("HasReceivedAutoNotifySubscribeMsg", false) : false) {
                    return;
                }
                java.lang.String str2 = jVar.f430786a.f300522w;
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    if (str2 != null) {
                        java.lang.String str3 = null;
                        if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2))) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, "msgsource", null);
                            if (d17 != null && (str = (java.lang.String) d17.get(".msgsource.notify_option.is_notify_by_tmpl")) != null) {
                                str3 = r26.n0.u0(str).toString();
                            }
                            if (((str3 == null || (h17 = r26.h0.h(str3)) == null) ? 0 : h17.intValue()) > 0) {
                                z17 = true;
                            }
                        }
                    }
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17));
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                if (m143898xd4a2fc34 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrsNotificationNotifyUtils", "isBrsImportantNotification parse error: " + m143898xd4a2fc34.getMessage());
                    m143895xf1229813 = java.lang.Boolean.FALSE;
                }
                if (!((java.lang.Boolean) m143895xf1229813).booleanValue() || aVar == null) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "markAutoNotifySubscribeMsgAsReceived");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(((k31.h) aVar).c()).G("HasReceivedAutoNotifySubscribeMsg", true);
            }
        }
    }

    /* renamed from: ZIDL_IX */
    private void m118847x1964d277(java.lang.Object obj) {
        ((com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.f0) obj).getClass();
    }

    /* renamed from: ZIDL_LX */
    private void m118848x1964d2d4(java.lang.Object obj) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    /* renamed from: ZIDL_AV */
    public native void m118849x1964d17d(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_B */
    public native byte[] m118850x9db8edfa(long j17, long j18, int i17);

    /* renamed from: ZIDL_C */
    public native long m118851x9db8edfb(long j17);

    /* renamed from: ZIDL_D */
    public native byte[] m118852x9db8edfc(long j17, long j18, int i17);

    /* renamed from: ZIDL_E */
    public native byte[] m118853x9db8edfd(long j17, long j18);

    /* renamed from: ZIDL_F */
    public native long m118854x9db8edfe(long j17);

    /* renamed from: ZIDL_G */
    public native long m118855x9db8edff(long j17);

    /* renamed from: ZIDL_H */
    public native byte[] m118856x9db8ee00(long j17);

    /* renamed from: ZIDL_IV */
    public native void m118857x1964d275(long j17, java.lang.Object obj, long j18);

    /* renamed from: ZIDL_K */
    public native void m118858x9db8ee03(long j17);

    /* renamed from: ZIDL_LV */
    public native void m118859x1964d2d2(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_M */
    public native boolean m118860x9db8ee05(long j17, long j18);

    /* renamed from: ZIDL_N */
    public native boolean m118861x9db8ee06(long j17, byte[] bArr);

    /* renamed from: ZIDL_P */
    public native void m118862x9db8ee08(long j17, byte[] bArr);

    /* renamed from: ZIDL_R */
    public native void m118863x9db8ee0a(long j17, byte[] bArr);

    /* renamed from: ZIDL_T */
    public native void m118864x9db8ee0c(long j17, long j18, byte[] bArr, long j19);

    /* renamed from: ZIDL_V */
    public native void m118865x9db8ee0e(long j17, long j18);

    /* renamed from: ZIDL_W */
    public native boolean m118866x9db8ee0f(long j17);

    /* renamed from: ZIDL_q1bTCHfwC */
    public native void m118867x79467df3(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2);
}
