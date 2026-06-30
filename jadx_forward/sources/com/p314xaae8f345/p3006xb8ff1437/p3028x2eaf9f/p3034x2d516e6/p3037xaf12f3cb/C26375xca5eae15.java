package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3037xaf12f3cb;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient */
/* loaded from: classes16.dex */
public class C26375xca5eae15 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f53002x59634b6e = "TPDownloadProxyClient";

    /* renamed from: downloadProxyAidl */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491 f53003x4a947696;

    public C26375xca5eae15(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491 interfaceC26353x2bfd9491) {
        this.f53003x4a947696 = interfaceC26353x2bfd9491;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: checkResourceStatus */
    public int mo102231xc32400c8(java.lang.String str, java.lang.String str2, int i17) {
        try {
            return this.f53003x4a947696.mo102153xc32400c8(str, str2, i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "checkResourceStatus failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: clearCache */
    public int mo102232xd2bef135(java.lang.String str, java.lang.String str2, int i17) {
        try {
            return this.f53003x4a947696.mo102154xd2bef135(str, str2, i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "clearCache failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: deinit */
    public int mo102233xb0654911() {
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: getClipPlayUrl */
    public java.lang.String mo102234x5a566f5(int i17, int i18, int i19) {
        try {
            return this.f53003x4a947696.mo102155x5a566f5(i17, i18, i19);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getClipPlayUrl failed, error:" + th6.toString());
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: getNativeInfo */
    public java.lang.String mo102235xa741fd5b(int i17) {
        try {
            return this.f53003x4a947696.mo102156xa741fd5b(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getNativeInfo failed, error:" + th6.toString());
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: getPlayErrorCodeStr */
    public java.lang.String mo102236xe1ed3aa6(int i17) {
        try {
            return this.f53003x4a947696.mo102157xe1ed3aa6(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getPlayErrorCodeStr failed, error:" + th6.toString());
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: getPlayUrl */
    public java.lang.String mo102237x2061c165(int i17, int i18) {
        try {
            return this.f53003x4a947696.mo102158x2061c165(i17, i18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getPlayUrl failed, error:" + th6.toString());
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: getResourceSize */
    public long mo102238x4a08f3a5(java.lang.String str, java.lang.String str2) {
        try {
            return this.f53003x4a947696.mo102159x4a08f3a5(str, str2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getResourceSize failed, error:" + th6.toString());
            return -1L;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: init */
    public int mo102239x316510(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26368x17a977b3 c26368x17a977b3) {
        java.lang.String m102498xddd166e0 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102498xddd166e0(c26368x17a977b3);
        if (android.text.TextUtils.isEmpty(m102498xddd166e0)) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "param is null");
            return -1;
        }
        try {
            return this.f53003x4a947696.mo102160x316510(m102498xddd166e0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "init failed, error:" + th6.toString());
            return -2;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: pauseDownload */
    public int mo102240xe51afc9e(int i17) {
        try {
            return this.f53003x4a947696.mo102161xe51afc9e(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "pauseDownload failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: pushEvent */
    public void mo102241xd0c233a0(int i17) {
        try {
            this.f53003x4a947696.mo102162xd0c233a0(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "pushEvent failed, error:" + th6.toString());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: removeStorageCache */
    public int mo102242xd0dc786b(java.lang.String str) {
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: resumeDownload */
    public int mo102243xb0277d5(int i17) {
        try {
            return this.f53003x4a947696.mo102163xb0277d5(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "resumeDownload failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: setClipInfo */
    public boolean mo102244xad41f2a0(int i17, int i18, java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 c26369x41f783c9) {
        try {
            return this.f53003x4a947696.mo102164xad41f2a0(i17, i18, str, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19(c26369x41f783c9.m102321x33a4d677(), c26369x41f783c9.m102311x15d5aed8(), c26369x41f783c9.m102313xb883b063()));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "setClipInfo failed, error:" + th6.toString());
            return false;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: setLogListener */
    public void mo102245x282f0256(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7 interfaceC26358x35916b7) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.m102493x282f0256(10303, interfaceC26358x35916b7);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: setMaxStorageSizeMB */
    public void mo102246xd7e17d2f(long j17) {
        try {
            this.f53003x4a947696.mo102165xd7e17d2f(j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "setMaxStorageSizeMB failed, error:" + th6.toString());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: setPlayState */
    public void mo102247xeb2f5b7b(int i17, int i18) {
        try {
            this.f53003x4a947696.mo102166xeb2f5b7b(i17, i18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "setPlayState failed, error:" + th6.toString());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: setUserData */
    public void mo102248x66a91097(java.lang.String str, java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(str, obj);
        try {
            this.f53003x4a947696.mo102167x66a91097(hashMap);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "setUserData failed, error:" + th6.toString());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startClipOfflineDownload */
    public int mo102249xc5764659(java.lang.String str, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26362x7fbc8b1a interfaceC26362x7fbc8b1a) {
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startClipPlay */
    public int mo102250x3e462126(java.lang.String str, int i17, final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d interfaceC26364x758c112d) {
        try {
            if (interfaceC26364x758c112d == null) {
                return this.f53003x4a947696.mo102168x3e462126(str, i17, null);
            }
            return this.f53003x4a947696.mo102168x3e462126(str, i17, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d.Stub() { // from class: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient.2
                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: getAdvRemainTime */
                public long mo102180x7dd980b6() {
                    return interfaceC26364x758c112d.mo102271x7dd980b6();
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: getContentType */
                public java.lang.String mo102181xc2a49a1d(int i18, java.lang.String str2, java.lang.String str3) {
                    return null;
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: getCurrentPlayClipNo */
                public int mo102182xce1eb728() {
                    return interfaceC26364x758c112d.mo102273xce1eb728();
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: getCurrentPlayOffset */
                public long mo102183xe243028a() {
                    return interfaceC26364x758c112d.mo102274xe243028a();
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: getCurrentPosition */
                public long mo102184x9746038c() {
                    return interfaceC26364x758c112d.mo102275x9746038c();
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: getDataFilePath */
                public java.lang.String mo102185x84354c01(int i18, java.lang.String str2, java.lang.String str3) {
                    return null;
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: getDataTotalSize */
                public long mo102186x2f5bd925(int i18, java.lang.String str2, java.lang.String str3) {
                    return 0L;
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: getM3U8Content */
                public java.lang.String mo102187x79c2649a(int i18, java.lang.String str2, java.lang.String str3) {
                    return null;
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: getPlayInfo */
                public java.lang.String mo102188xebd0e778(java.lang.String str2) {
                    java.lang.Object mo102280xebd0e778 = interfaceC26364x758c112d.mo102280xebd0e778(str2);
                    if (mo102280xebd0e778 == null || mo102280xebd0e778.getClass() != java.lang.String.class) {
                        return null;
                    }
                    if (mo102280xebd0e778.getClass() == java.lang.String.class) {
                        return (java.lang.String) mo102280xebd0e778;
                    }
                    if (mo102280xebd0e778.getClass() == java.lang.Integer.class) {
                        return java.lang.Integer.toString(((java.lang.Integer) mo102280xebd0e778).intValue());
                    }
                    return null;
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: getPlayerBufferLength */
                public long mo102189xe15692bd() {
                    return interfaceC26364x758c112d.mo102281xe15692bd();
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onDownloadCdnUrlExpired */
                public void mo102190x61548e7c(java.util.Map map) {
                    interfaceC26364x758c112d.mo102282x61548e7c(map);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onDownloadCdnUrlInfoUpdate */
                public void mo102191x73241460(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                    interfaceC26364x758c112d.mo102283x73241460(str2, str3, str4, str5);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onDownloadCdnUrlUpdate */
                public void mo102192xe42c8a92(java.lang.String str2) {
                    interfaceC26364x758c112d.mo102284xe42c8a92(str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onDownloadError */
                public void mo102193x338612c1(int i18, int i19, java.lang.String str2) {
                    interfaceC26364x758c112d.mo102285x338612c1(i18, i19, str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onDownloadFinish */
                public void mo102194x3e7062fa() {
                    interfaceC26364x758c112d.mo102286x3e7062fa();
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onDownloadProgressUpdate */
                public void mo102195x32d250bd(int i18, int i19, long j17, long j18, java.lang.String str2) {
                    interfaceC26364x758c112d.mo102287x32d250bd(i18, i19, j17, j18, str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onDownloadProtocolUpdate */
                public void mo102196xab39e0e8(java.lang.String str2, java.lang.String str3) {
                    interfaceC26364x758c112d.mo102288xab39e0e8(str2, str3);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onDownloadStatusUpdate */
                public void mo102197xe40fe482(int i18) {
                    interfaceC26364x758c112d.mo102289xe40fe482(i18);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onPlayCallback */
                public int mo102198x41392718(int i18, java.util.List list) {
                    java.lang.Object obj = 0;
                    if (list != null && !list.isEmpty()) {
                        if (list.size() == 1) {
                            obj = interfaceC26364x758c112d.mo102290x41392718(i18, list.get(0), null, null, null);
                        } else if (list.size() == 2) {
                            obj = interfaceC26364x758c112d.mo102290x41392718(i18, list.get(0), list.get(1), null, null);
                        } else if (list.size() == 3) {
                            obj = interfaceC26364x758c112d.mo102290x41392718(i18, list.get(0), list.get(1), list.get(2), null);
                        }
                    }
                    if (obj == null || obj.getClass() != java.lang.Integer.class) {
                        return -1;
                    }
                    return ((java.lang.Integer) obj).intValue();
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onReadData */
                public int mo102199x715d255f(int i18, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                    return 0;
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onStartReadData */
                public int mo102200x6e58d43(int i18, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                    return 0;
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                /* renamed from: onStopReadData */
                public int mo102201xfb96d801(int i18, java.lang.String str2, java.lang.String str3, int i19) {
                    return 0;
                }
            });
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startClipPlay failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startClipPreload */
    public int mo102251xed7cbad7(java.lang.String str, int i17, final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8 interfaceC26365x6c7f32b8) {
        try {
            return this.f53003x4a947696.mo102169xed7cbad7(str, i17, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub() { // from class: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient.4
                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
                /* renamed from: onPrepareDownloadProgressUpdate */
                public void mo102206x8ea30446(int i18, int i19, long j17, long j18, java.lang.String str2) {
                    interfaceC26365x6c7f32b8.mo102294x8ea30446(i18, i19, j17, j18, str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
                /* renamed from: onPrepareError */
                public void mo102207xfaf06cc0(int i18, int i19, java.lang.String str2) {
                    interfaceC26365x6c7f32b8.mo102295xfaf06cc0(i18, i19, str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
                /* renamed from: onPrepareOK */
                public void mo102208xc1e12e04() {
                    interfaceC26365x6c7f32b8.mo102296xc1e12e04();
                }
            });
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startClipPreload failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startOfflineDownload */
    public int mo102252xbd770ac9(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 c26369x41f783c9, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26362x7fbc8b1a interfaceC26362x7fbc8b1a) {
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startPlay */
    public int mo102253x8113c2b6(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 c26369x41f783c9, final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d interfaceC26364x758c112d) {
        if (this.f53003x4a947696 != null && c26369x41f783c9 != null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19 c26356xafad9a19 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19(c26369x41f783c9.m102321x33a4d677(), c26369x41f783c9.m102311x15d5aed8(), c26369x41f783c9.m102313xb883b063());
            try {
                if (interfaceC26364x758c112d == null) {
                    return this.f53003x4a947696.mo102170x8113c2b6(str, c26356xafad9a19, null);
                }
                return this.f53003x4a947696.mo102170x8113c2b6(str, c26356xafad9a19, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d.Stub() { // from class: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient.1
                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: getAdvRemainTime */
                    public long mo102180x7dd980b6() {
                        return interfaceC26364x758c112d.mo102271x7dd980b6();
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: getContentType */
                    public java.lang.String mo102181xc2a49a1d(int i17, java.lang.String str2, java.lang.String str3) {
                        return interfaceC26364x758c112d.mo102272xc2a49a1d(i17, str2, str3);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: getCurrentPlayClipNo */
                    public int mo102182xce1eb728() {
                        return interfaceC26364x758c112d.mo102273xce1eb728();
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: getCurrentPlayOffset */
                    public long mo102183xe243028a() {
                        return interfaceC26364x758c112d.mo102274xe243028a();
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: getCurrentPosition */
                    public long mo102184x9746038c() {
                        return interfaceC26364x758c112d.mo102275x9746038c();
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: getDataFilePath */
                    public java.lang.String mo102185x84354c01(int i17, java.lang.String str2, java.lang.String str3) {
                        return interfaceC26364x758c112d.mo102276x84354c01(i17, str2, str3);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: getDataTotalSize */
                    public long mo102186x2f5bd925(int i17, java.lang.String str2, java.lang.String str3) {
                        return interfaceC26364x758c112d.mo102277x2f5bd925(i17, str2, str3);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: getM3U8Content */
                    public java.lang.String mo102187x79c2649a(int i17, java.lang.String str2, java.lang.String str3) {
                        return interfaceC26364x758c112d.mo102278x79c2649a(i17, str2, str3);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: getPlayInfo */
                    public java.lang.String mo102188xebd0e778(java.lang.String str2) {
                        java.lang.Object mo102280xebd0e778 = interfaceC26364x758c112d.mo102280xebd0e778(str2);
                        if (mo102280xebd0e778 == null || mo102280xebd0e778.getClass() != java.lang.String.class) {
                            return null;
                        }
                        if (mo102280xebd0e778.getClass() == java.lang.String.class) {
                            return (java.lang.String) mo102280xebd0e778;
                        }
                        if (mo102280xebd0e778.getClass() == java.lang.Integer.class) {
                            return java.lang.Integer.toString(((java.lang.Integer) mo102280xebd0e778).intValue());
                        }
                        return null;
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: getPlayerBufferLength */
                    public long mo102189xe15692bd() {
                        return interfaceC26364x758c112d.mo102281xe15692bd();
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onDownloadCdnUrlExpired */
                    public void mo102190x61548e7c(java.util.Map map) {
                        interfaceC26364x758c112d.mo102282x61548e7c(map);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onDownloadCdnUrlInfoUpdate */
                    public void mo102191x73241460(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                        interfaceC26364x758c112d.mo102283x73241460(str2, str3, str4, str5);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onDownloadCdnUrlUpdate */
                    public void mo102192xe42c8a92(java.lang.String str2) {
                        interfaceC26364x758c112d.mo102284xe42c8a92(str2);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onDownloadError */
                    public void mo102193x338612c1(int i17, int i18, java.lang.String str2) {
                        interfaceC26364x758c112d.mo102285x338612c1(i17, i18, str2);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onDownloadFinish */
                    public void mo102194x3e7062fa() {
                        interfaceC26364x758c112d.mo102286x3e7062fa();
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onDownloadProgressUpdate */
                    public void mo102195x32d250bd(int i17, int i18, long j17, long j18, java.lang.String str2) {
                        interfaceC26364x758c112d.mo102287x32d250bd(i17, i18, j17, j18, str2);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onDownloadProtocolUpdate */
                    public void mo102196xab39e0e8(java.lang.String str2, java.lang.String str3) {
                        interfaceC26364x758c112d.mo102288xab39e0e8(str2, str3);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onDownloadStatusUpdate */
                    public void mo102197xe40fe482(int i17) {
                        interfaceC26364x758c112d.mo102289xe40fe482(i17);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onPlayCallback */
                    public int mo102198x41392718(int i17, java.util.List list) {
                        java.lang.Object obj = 0;
                        if (list != null && !list.isEmpty()) {
                            if (list.size() == 1) {
                                obj = interfaceC26364x758c112d.mo102290x41392718(i17, list.get(0), null, null, null);
                            } else if (list.size() == 2) {
                                obj = interfaceC26364x758c112d.mo102290x41392718(i17, list.get(0), list.get(1), null, null);
                            } else if (list.size() == 3) {
                                obj = interfaceC26364x758c112d.mo102290x41392718(i17, list.get(0), list.get(1), list.get(2), null);
                            }
                        }
                        if (obj == null || obj.getClass() != java.lang.Integer.class) {
                            return -1;
                        }
                        return ((java.lang.Integer) obj).intValue();
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onReadData */
                    public int mo102199x715d255f(int i17, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                        return interfaceC26364x758c112d.mo102291x715d255f(i17, str2, str3, j17, j18);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onStartReadData */
                    public int mo102200x6e58d43(int i17, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                        return interfaceC26364x758c112d.mo102292x6e58d43(i17, str2, str3, j17, j18);
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d
                    /* renamed from: onStopReadData */
                    public int mo102201xfb96d801(int i17, java.lang.String str2, java.lang.String str3, int i18) {
                        return interfaceC26364x758c112d.mo102293xfb96d801(i17, str2, str3, i18);
                    }
                });
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startPlay failed, error:" + th6.toString());
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startPreload */
    public int mo102254xe500ef47(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 c26369x41f783c9, final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8 interfaceC26365x6c7f32b8) {
        try {
            return this.f53003x4a947696.mo102171xe500ef47(str, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19(c26369x41f783c9.m102321x33a4d677(), c26369x41f783c9.m102311x15d5aed8(), c26369x41f783c9.m102313xb883b063()), new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub() { // from class: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient.3
                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
                /* renamed from: onPrepareDownloadProgressUpdate */
                public void mo102206x8ea30446(int i17, int i18, long j17, long j18, java.lang.String str2) {
                    interfaceC26365x6c7f32b8.mo102294x8ea30446(i17, i18, j17, j18, str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
                /* renamed from: onPrepareError */
                public void mo102207xfaf06cc0(int i17, int i18, java.lang.String str2) {
                    interfaceC26365x6c7f32b8.mo102295xfaf06cc0(i17, i18, str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
                /* renamed from: onPrepareOK */
                public void mo102208xc1e12e04() {
                    interfaceC26365x6c7f32b8.mo102296xc1e12e04();
                }
            });
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startPreload failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startTask */
    public void mo102255x81156d07(int i17) {
        try {
            this.f53003x4a947696.mo102172x81156d07(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startTask failed, error:" + th6.toString());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: stopOfflineDownload */
    public void mo102256xa81329(int i17) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: stopPlay */
    public void mo102257x66343656(int i17) {
        try {
            this.f53003x4a947696.mo102173x66343656(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "stopPlay failed, error:" + th6.toString());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: stopPreload */
    public void mo102258xa07057a7(int i17) {
        try {
            this.f53003x4a947696.mo102174xa07057a7(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "stopPreload failed, error:" + th6.toString());
        }
    }

    /* renamed from: updateAidl */
    public void m102392xee53cf19(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491 interfaceC26353x2bfd9491) {
        this.f53003x4a947696 = interfaceC26353x2bfd9491;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: updateStoragePath */
    public void mo102259x9cbbacb7(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: updateTaskInfo */
    public void mo102260x1b6687bc(int i17, java.lang.String str, java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(str, obj);
        try {
            this.f53003x4a947696.mo102175x1b6687bc(i17, hashMap);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53002x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "updateTaskInfo failed, error:" + th6.toString());
        }
    }
}
