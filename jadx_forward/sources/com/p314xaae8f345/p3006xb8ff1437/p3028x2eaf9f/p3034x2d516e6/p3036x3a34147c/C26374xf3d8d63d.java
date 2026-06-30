package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager */
/* loaded from: classes16.dex */
public class C26374xf3d8d63d {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f52943x59634b6e = "TPListenerManager";

    /* renamed from: MSG_CONFIG_URL */
    private static final int f52944xf5e17270 = 2011;

    /* renamed from: MSG_CURRENT_CDN_URL */
    private static final int f52945x1f84d459 = 5;

    /* renamed from: MSG_CURRENT_CDN_URL_INFO */
    private static final int f52946x539c10d4 = 6;

    /* renamed from: MSG_DID_RELEASE_MEMORY */
    private static final int f52947xe45249d7 = 2016;

    /* renamed from: MSG_DOWNLOAD_PROTOCOL */
    private static final int f52948x1d866f11 = 9;

    /* renamed from: MSG_DOWNLOAD_STATUS */
    private static final int f52949xabba7eab = 8;

    /* renamed from: MSG_ERROR */
    private static final int f52950x98809b8a = 4;

    /* renamed from: MSG_FINISH */
    private static final int f52951x78c6f331 = 3;

    /* renamed from: MSG_M3U8_REFRESH */
    private static final int f52952x9f8c7b23 = 2017;

    /* renamed from: MSG_MULTI_NETWORK_LOW_SPEED */
    private static final int f52953x46f1e7 = 2020;

    /* renamed from: MSG_MULTI_NETWORK_STATUS */
    private static final int f52954x7fcb147 = 2021;

    /* renamed from: MSG_NOTIFY_FLV_PRELOAD_STATUS */
    private static final int f52955x851cc2f = 2009;

    /* renamed from: MSG_NOTIFY_HTTP_HEADER */
    private static final int f52956x56ce63cc = 2006;

    /* renamed from: MSG_NOTIFY_LOSE_PACKAGE_CEHCK */
    private static final int f52957xef8c2b63 = 2004;

    /* renamed from: MSG_NOTIFY_M3U8_CONTENT */
    private static final int f52958x8f2a13fb = 2007;

    /* renamed from: MSG_NOTIFY_PLAYER_SWITCH_DEFINITION */
    private static final int f52959x33249cb8 = 2003;

    /* renamed from: MSG_NOTIFY_SOCKET_FD */
    private static final int f52960x64e8c4b2 = 2008;

    /* renamed from: MSG_PLAY_VIDEO_NOT_FOUND */
    private static final int f52961xcd3e3705 = 101;

    /* renamed from: MSG_PREPARE_FINISH */
    private static final int f52962x65c45789 = 50;

    /* renamed from: MSG_PROGRESS */
    private static final int f52963x4f52f54b = 2;

    /* renamed from: MSG_PROXY_CANCEL_READ_DATA */
    private static final int f52964xc828d59d = 202;

    /* renamed from: MSG_PROXY_GET_CONTENT_TYPE */
    private static final int f52965x815eba38 = 205;

    /* renamed from: MSG_PROXY_GET_DATA_FILE_PATH */
    private static final int f52966x4cc79f8b = 204;

    /* renamed from: MSG_PROXY_GET_DATA_TOTAL_SIZE */
    private static final int f52967x6daaea19 = 203;

    /* renamed from: MSG_PROXY_GET_M3U8_CONTENT */
    private static final int f52968x3953837b = 206;

    /* renamed from: MSG_PROXY_READ_DATA */
    private static final int f52969x291e3f24 = 201;

    /* renamed from: MSG_PROXY_START_READ_DATA */
    private static final int f52970xecdc2a7 = 200;

    /* renamed from: MSG_QUIC_DOWNLOAD_STATUS */
    private static final int f52971x494e99a6 = 3001;

    /* renamed from: MSG_REPORT_QUIC_QUALITY */
    private static final int f52972xaa97e32b = 3002;

    /* renamed from: MSG_REPORT_URL */
    private static final int f52973x376ffb62 = 2010;

    /* renamed from: MSG_TAB_TESTID */
    private static final int f52974x719538d5 = 2014;

    /* renamed from: MSG_URL_EXPIRED */
    private static final int f52975x6042e437 = 7;

    /* renamed from: MSG_WILL_RELEASE_MEMORY */
    private static final int f52976xe4733e88 = 2015;

    /* renamed from: MSG_WUJI_CONFIG_URL */
    private static final int f52977xe6f28ad6 = 2013;

    /* renamed from: THREAD_NAME */
    private static final java.lang.String f52981xf52cdfa0 = "TVKDL-Listener";

    /* renamed from: mITPDownloadListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26360x5292a001 f52982xf27ae674;

    /* renamed from: mMsgHandler */
    private android.os.Handler f52983xd251fcd6;

    /* renamed from: mMsgHandlerThread */
    private android.os.HandlerThread f52984x81a07e80;

    /* renamed from: mNetwork */
    private android.net.Network f52985xbfa0d01;

    /* renamed from: mOfflineDownloadListenerMap */
    private java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26362x7fbc8b1a> f52986x87d0e5ca;

    /* renamed from: mPlayListenerMap */
    private java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d> f52987x1ef3c007;

    /* renamed from: mPreLoadListenerMap */
    private java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8> f52988x99c5196c;

    /* renamed from: updatePlayerInfo */
    private java.lang.Runnable f52989x306388d8;

    /* renamed from: PLAY_LISTENER_MAP_MUTEX */
    private static final java.lang.Object f52979x44dd75bc = new java.lang.Object();

    /* renamed from: PRELOAD_LISTENER_MAP_MUTEX */
    private static final java.lang.Object f52980x872fd0e7 = new java.lang.Object();

    /* renamed from: OFFLINE_LISTENER_MAP_MUTEX */
    private static final java.lang.Object f52978xb3585ecd = new java.lang.Object();

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager$SingletonHolder */
    /* loaded from: classes16.dex */
    public static class SingletonHolder {

        /* renamed from: INSTANCE */
        private static final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d f53001x4fbc8495 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d();

        private SingletonHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dispatchCallbackMessage */
    public void m102368xe1214028(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d m102374x838f6e5e = m102374x838f6e5e(i18);
        if (m102374x838f6e5e != null) {
            m102370x1df07d59(m102374x838f6e5e, i17, i18, obj, obj2, obj3, obj4, obj5);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8 m102375x8962a3c7 = m102375x8962a3c7(i18);
        if (m102375x8962a3c7 != null) {
            m102371xd68558b8(m102375x8962a3c7, i17, i18, obj, obj2, obj3, obj4, obj5);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26362x7fbc8b1a m102373xeea17d29 = m102373xeea17d29(i18);
        if (m102373xeea17d29 != null) {
            m102369x9b8e6716(m102373xeea17d29, i17, i18, obj, obj2, obj3, obj4, obj5);
            return;
        }
        if (this.f52982xf27ae674 != null) {
            if (i17 == 2015) {
                this.f52982xf27ae674.m102230x1681b536(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj));
            } else if (i17 == f52947xe45249d7) {
                this.f52982xf27ae674.m102228x1331a1a9(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj));
            } else {
                if (i17 != 3002) {
                    return;
                }
                this.f52982xf27ae674.m102229x109441bf(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj));
            }
        }
    }

    /* renamed from: dispatchOfflineDownloadMessage */
    private void m102369x9b8e6716(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26362x7fbc8b1a interfaceC26362x7fbc8b1a, int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        if (interfaceC26362x7fbc8b1a == null) {
            return;
        }
        switch (i17) {
            case 2:
                interfaceC26362x7fbc8b1a.m102266x32d250bd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj, 0), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj2, 0), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj3, 0L), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj4, 0L), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj5));
                return;
            case 3:
                interfaceC26362x7fbc8b1a.m102265x3e7062fa();
                return;
            case 4:
                interfaceC26362x7fbc8b1a.m102264x338612c1(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj3));
                return;
            case 5:
                interfaceC26362x7fbc8b1a.m102263xe42c8a92(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj));
                return;
            case 6:
                interfaceC26362x7fbc8b1a.m102262x73241460(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj2), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj3), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj4));
                return;
            case 7:
                java.lang.String m102494xdb3a7bbd = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj);
                long m102497xb4fa77b6 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj2, 0L);
                java.util.HashMap hashMap = new java.util.HashMap();
                if (!android.text.TextUtils.isEmpty(m102494xdb3a7bbd)) {
                    hashMap.put("exttag", m102494xdb3a7bbd);
                    hashMap.put("randnum", java.lang.String.valueOf(m102497xb4fa77b6));
                }
                interfaceC26362x7fbc8b1a.m102261x61548e7c(hashMap);
                return;
            case 8:
                interfaceC26362x7fbc8b1a.m102268xe40fe482(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj, 0));
                return;
            case 9:
                interfaceC26362x7fbc8b1a.m102267xab39e0e8(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj2));
                return;
            default:
                return;
        }
    }

    /* renamed from: dispatchPlayMessage */
    private void m102370x1df07d59(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d interfaceC26364x758c112d, int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        if (interfaceC26364x758c112d == null) {
            return;
        }
        if (i17 == 2) {
            interfaceC26364x758c112d.mo102287x32d250bd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj, 0), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj2, 0), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj3, 0L), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj4, 0L), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj5));
            return;
        }
        if (i17 == 3) {
            interfaceC26364x758c112d.mo102286x3e7062fa();
            return;
        }
        if (i17 == 101) {
            java.lang.String m102494xdb3a7bbd = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj);
            long m102497xb4fa77b6 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj2, 0L);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (!android.text.TextUtils.isEmpty(m102494xdb3a7bbd)) {
                hashMap.put("exttag", m102494xdb3a7bbd);
                hashMap.put("randnum", java.lang.String.valueOf(m102497xb4fa77b6));
            }
            interfaceC26364x758c112d.mo102290x41392718(1, hashMap, null, null, null);
            return;
        }
        if (i17 == 2009) {
            interfaceC26364x758c112d.mo102290x41392718(5, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj, 0)), obj2 == null ? null : (byte[]) obj2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj3), java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj4, 0)));
            return;
        }
        if (i17 == 2014) {
            java.lang.Object m102494xdb3a7bbd2 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj);
            java.lang.String m102494xdb3a7bbd3 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj2);
            interfaceC26364x758c112d.mo102290x41392718(8, m102494xdb3a7bbd2, m102494xdb3a7bbd3, null, null);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52943x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "MSG_TAB_TESTID: " + m102494xdb3a7bbd3);
            return;
        }
        if (i17 == f52952x9f8c7b23) {
            interfaceC26364x758c112d.mo102290x41392718(9, null, null, null, null);
            return;
        }
        if (i17 == 3001) {
            interfaceC26364x758c112d.mo102290x41392718(6, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), null, null, null);
            return;
        }
        if (i17 == 2003) {
            interfaceC26364x758c112d.mo102290x41392718(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj2), java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj3, 0)), null);
            return;
        }
        if (i17 == 2004) {
            final int m102496xb341d775 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj2, 0);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26384xa7dd4815.m102505x3e763920().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.3
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52913x8b6ca94f, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102495x485aa017(m102496xb341d775));
                }
            });
            return;
        }
        if (i17 == 2006) {
            interfaceC26364x758c112d.mo102290x41392718(3, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), null, null, null);
        } else if (i17 == 2007) {
            interfaceC26364x758c112d.mo102290x41392718(4, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), null, null, null);
        } else if (i17 == f52953x46f1e7) {
            java.lang.String m102494xdb3a7bbd4 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj);
            interfaceC26364x758c112d.mo102290x41392718(10, m102494xdb3a7bbd4, null, null, null);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52943x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "MULTI_NETWORK msg: " + i17 + ", info: " + m102494xdb3a7bbd4);
        } else if (i17 != f52954x7fcb147) {
            switch (i17) {
                case 5:
                    interfaceC26364x758c112d.mo102284xe42c8a92(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj));
                    break;
                case 6:
                    interfaceC26364x758c112d.mo102283x73241460(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj2), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj3), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj4));
                    break;
                case 7:
                    java.lang.String m102494xdb3a7bbd5 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj);
                    long m102497xb4fa77b62 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj2, 0L);
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    if (!android.text.TextUtils.isEmpty(m102494xdb3a7bbd5)) {
                        hashMap2.put("exttag", m102494xdb3a7bbd5);
                        hashMap2.put("randnum", java.lang.String.valueOf(m102497xb4fa77b62));
                    }
                    interfaceC26364x758c112d.mo102282x61548e7c(hashMap2);
                    break;
                case 8:
                    interfaceC26364x758c112d.mo102289xe40fe482(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj, 0));
                    break;
                case 9:
                    interfaceC26364x758c112d.mo102288xab39e0e8(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj2));
                    break;
            }
        } else {
            java.lang.String m102494xdb3a7bbd6 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj);
            interfaceC26364x758c112d.mo102290x41392718(11, m102494xdb3a7bbd6, null, null, null);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52943x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "MULTI_NETWORK msg: " + i17 + ", info: " + m102494xdb3a7bbd6);
        }
    }

    /* renamed from: dispatchPreLoadMessage */
    private void m102371xd68558b8(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8 interfaceC26365x6c7f32b8, int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        if (interfaceC26365x6c7f32b8 == null) {
            return;
        }
        if (i17 == 2) {
            interfaceC26365x6c7f32b8.mo102294x8ea30446(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj, 0), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj2, 0), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj3, 0L), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj4, 0L), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj5));
        } else if (i17 == 4) {
            interfaceC26365x6c7f32b8.mo102295xfaf06cc0(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj3));
        } else {
            if (i17 != 50) {
                return;
            }
            interfaceC26365x6c7f32b8.mo102296xc1e12e04();
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d m102372x9cf0d20b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.SingletonHolder.f53001x4fbc8495;
    }

    /* renamed from: getOfflineDownloadListener */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26362x7fbc8b1a m102373xeea17d29(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26362x7fbc8b1a interfaceC26362x7fbc8b1a;
        synchronized (f52978xb3585ecd) {
            interfaceC26362x7fbc8b1a = this.f52986x87d0e5ca.get(java.lang.Integer.valueOf(i17));
        }
        return interfaceC26362x7fbc8b1a;
    }

    /* renamed from: getPlaylistener */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d m102374x838f6e5e(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d interfaceC26364x758c112d;
        synchronized (f52979x44dd75bc) {
            interfaceC26364x758c112d = this.f52987x1ef3c007.get(java.lang.Integer.valueOf(i17));
        }
        return interfaceC26364x758c112d;
    }

    /* renamed from: getPreLoadListener */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8 m102375x8962a3c7(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8 interfaceC26365x6c7f32b8;
        synchronized (f52980x872fd0e7) {
            interfaceC26365x6c7f32b8 = this.f52988x99c5196c.get(java.lang.Integer.valueOf(i17));
        }
        return interfaceC26365x6c7f32b8;
    }

    /* renamed from: handleCallbackMessage */
    public synchronized void m102376xf5a5c4ba(final int i17, final int i18, final java.lang.Object obj, final java.lang.Object obj2, final java.lang.Object obj3, final java.lang.Object obj4, final java.lang.Object obj5) {
        if (2008 != i17) {
            if (i17 != 2010 && i17 != 2011 && i17 != 2013) {
                this.f52983xd251fcd6.post(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.this.m102368xe1214028(i17, i18, obj, obj2, obj3, obj4, obj5);
                    }
                });
                return;
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.m102442x9cf0d20b().m102446x698e32e1(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), i17);
                return;
            }
        }
        if (this.f52985xbfa0d01 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52943x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network, network is null");
            return;
        }
        java.lang.String m102494xdb3a7bbd = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj);
        int parseInt = java.lang.Integer.parseInt(m102494xdb3a7bbd);
        try {
            java.io.FileDescriptor fileDescriptor = new java.io.FileDescriptor();
            java.lang.reflect.Field declaredField = java.io.FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.setInt(fileDescriptor, parseInt);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52943x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network, bind begin, sock fd: " + parseInt);
            this.f52985xbfa0d01.bindSocket(fileDescriptor);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52943x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network, bind socket success, sock fd: " + parseInt);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52737x73f1b047, "-1");
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52943x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network, bind socket failed: " + th6.toString());
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52943x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network, sock call back end, sock fd: " + parseInt + ", str_sock: " + m102494xdb3a7bbd);
    }

    /* renamed from: handleIntCallbackMessage */
    public int m102377xe498e45b(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d m102374x838f6e5e = m102374x838f6e5e(i18);
        if (m102374x838f6e5e == null) {
            return 0;
        }
        if (i17 == 200) {
            return m102374x838f6e5e.mo102292x6e58d43(i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj4), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj2, 0L), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj3, -1L));
        }
        if (i17 == 202) {
            return m102374x838f6e5e.mo102293xfb96d801(i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj3), i18);
        }
        if (i17 == 201) {
            return m102374x838f6e5e.mo102291x715d255f(i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj4), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102497xb4fa77b6(obj2, 0L), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102496xb341d775(obj3, 0));
        }
        return 0;
    }

    /* renamed from: handleStringCallbackMessage */
    public java.lang.String m102378x296a6e69(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d m102374x838f6e5e = m102374x838f6e5e(i18);
        if (m102374x838f6e5e != null) {
            if (i17 == 205) {
                return m102374x838f6e5e.mo102272xc2a49a1d(i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj2));
            }
            if (i17 == 203) {
                return java.lang.String.valueOf(m102374x838f6e5e.mo102277x2f5bd925(i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj2)));
            }
            if (i17 == 204) {
                return m102374x838f6e5e.mo102276x84354c01(i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj2));
            }
            if (i17 == 206) {
                return m102374x838f6e5e.mo102278x79c2649a(i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd((byte[]) obj2));
            }
        }
        return "";
    }

    /* renamed from: initHandler */
    public void m102379x77f9b81a() {
        if (this.f52984x81a07e80 == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread(f52981xf52cdfa0);
            this.f52984x81a07e80 = handlerThread;
            handlerThread.start();
            android.os.Handler handler = new android.os.Handler(this.f52984x81a07e80.getLooper());
            this.f52983xd251fcd6 = handler;
            handler.postDelayed(this.f52989x306388d8, 1000L);
        }
    }

    /* renamed from: removeAllPlayListener */
    public void m102380xe26ccb25() {
        synchronized (f52979x44dd75bc) {
            this.f52987x1ef3c007.clear();
        }
    }

    /* renamed from: removeAllPreLoadListener */
    public void m102381xa82895c0() {
        synchronized (f52980x872fd0e7) {
            this.f52988x99c5196c.clear();
        }
    }

    /* renamed from: removeOfflineDownloadListener */
    public void m102382xd019a03b(int i17) {
        if (i17 > 0) {
            synchronized (f52978xb3585ecd) {
                this.f52986x87d0e5ca.remove(java.lang.Integer.valueOf(i17));
            }
        }
    }

    /* renamed from: removePlayListener */
    public void m102383xc368e6ac(int i17) {
        if (i17 > 0) {
            synchronized (f52979x44dd75bc) {
                this.f52987x1ef3c007.remove(java.lang.Integer.valueOf(i17));
            }
        }
    }

    /* renamed from: removePreLoadListener */
    public void m102384x622ff8d9(int i17) {
        if (i17 > 0) {
            synchronized (f52980x872fd0e7) {
                this.f52988x99c5196c.remove(java.lang.Integer.valueOf(i17));
            }
        }
    }

    /* renamed from: setITPDownloadListener */
    public void m102385xae53745f(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26360x5292a001 interfaceC26360x5292a001) {
        this.f52982xf27ae674 = interfaceC26360x5292a001;
    }

    /* renamed from: setNetwork */
    public void m102386x1f1fe36c(android.net.Network network) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52943x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network, set network");
        this.f52985xbfa0d01 = network;
    }

    /* renamed from: setOfflineDownloadListener */
    public void m102387x4d1629d(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26362x7fbc8b1a interfaceC26362x7fbc8b1a) {
        if (i17 <= 0 || interfaceC26362x7fbc8b1a == null) {
            return;
        }
        synchronized (f52978xb3585ecd) {
            this.f52986x87d0e5ca.put(java.lang.Integer.valueOf(i17), interfaceC26362x7fbc8b1a);
        }
    }

    /* renamed from: setPlayListener */
    public void m102388xbdb2cd8a(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d interfaceC26364x758c112d) {
        if (i17 <= 0 || interfaceC26364x758c112d == null) {
            return;
        }
        synchronized (f52979x44dd75bc) {
            this.f52987x1ef3c007.put(java.lang.Integer.valueOf(i17), interfaceC26364x758c112d);
        }
    }

    /* renamed from: setPreLoadListener */
    public void m102389xc0393d3b(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8 interfaceC26365x6c7f32b8) {
        if (i17 <= 0 || interfaceC26365x6c7f32b8 == null) {
            return;
        }
        synchronized (f52980x872fd0e7) {
            this.f52988x99c5196c.put(java.lang.Integer.valueOf(i17), interfaceC26365x6c7f32b8);
        }
    }

    private C26374xf3d8d63d() {
        this.f52985xbfa0d01 = null;
        this.f52982xf27ae674 = null;
        this.f52987x1ef3c007 = new java.util.HashMap();
        this.f52988x99c5196c = new java.util.HashMap();
        this.f52986x87d0e5ca = new java.util.HashMap();
        this.f52989x306388d8 = new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.1
            @Override // java.lang.Runnable
            public void run() {
                java.util.Map map;
                synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.f52979x44dd75bc) {
                    map = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.this.f52987x1ef3c007;
                }
                try {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        int intValue = ((java.lang.Integer) entry.getKey()).intValue();
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d interfaceC26364x758c112d = (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d) entry.getValue();
                        int mo102275x9746038c = (int) (interfaceC26364x758c112d.mo102275x9746038c() / 1000);
                        int mo102281xe15692bd = (int) (interfaceC26364x758c112d.mo102281xe15692bd() / 1000);
                        int mo102271x7dd980b6 = (int) (interfaceC26364x758c112d.mo102271x7dd980b6() / 1000);
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102430x1b6687bc(intValue, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52903x7e093972, java.lang.String.valueOf(interfaceC26364x758c112d.mo102274xe243028a()));
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102428x7d92db43(intValue, mo102275x9746038c, mo102281xe15692bd, mo102271x7dd980b6);
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        };
    }
}
