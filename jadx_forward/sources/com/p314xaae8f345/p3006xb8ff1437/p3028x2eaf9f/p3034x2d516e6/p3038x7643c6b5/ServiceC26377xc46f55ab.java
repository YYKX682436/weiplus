package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService */
/* loaded from: classes13.dex */
public class ServiceC26377xc46f55ab extends android.app.Service {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f53018x59634b6e = "TPDownloadProxyService";
    private int pid = -1;

    /* renamed from: downloadProxyFactory */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub f53019xeda39764 = null;

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService$DownloadProxy */
    /* loaded from: classes16.dex */
    public class DownloadProxy extends com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491.Stub {

        /* renamed from: downloadProxy */
        private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 f53020x11226c6;

        public DownloadProxy(int i17) {
            this.f53020x11226c6 = null;
            this.f53020x11226c6 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102340x61ce4f94(i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: checkResourceStatus */
        public int mo102153xc32400c8(java.lang.String str, java.lang.String str2, int i17) {
            try {
                return this.f53020x11226c6.mo102231xc32400c8(str, str2, i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "checkResourceStatus failed, error:" + th6.toString());
                return -1;
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: clearCache */
        public int mo102154xd2bef135(java.lang.String str, java.lang.String str2, int i17) {
            try {
                return this.f53020x11226c6.mo102232xd2bef135(str, str2, i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "checkResourceStatus failed, error:" + th6.toString());
                return -1;
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: getClipPlayUrl */
        public java.lang.String mo102155x5a566f5(int i17, int i18, int i19) {
            return this.f53020x11226c6.mo102234x5a566f5(i17, i18, i19);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: getNativeInfo */
        public java.lang.String mo102156xa741fd5b(int i17) {
            try {
                return this.f53020x11226c6.mo102235xa741fd5b(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getNativeInfo failed, error:" + th6.toString());
                return null;
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: getPlayErrorCodeStr */
        public java.lang.String mo102157xe1ed3aa6(int i17) {
            return this.f53020x11226c6.mo102236xe1ed3aa6(i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: getPlayUrl */
        public java.lang.String mo102158x2061c165(int i17, int i18) {
            return this.f53020x11226c6.mo102237x2061c165(i17, i18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: getResourceSize */
        public long mo102159x4a08f3a5(java.lang.String str, java.lang.String str2) {
            try {
                return this.f53020x11226c6.mo102238x4a08f3a5(str, str2);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getResourceSize failed, error:" + th6.toString());
                return -1L;
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: init */
        public int mo102160x316510(java.lang.String str) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26368x17a977b3 c26368x17a977b3 = (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26368x17a977b3) com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102499xf08809a(str);
                if (c26368x17a977b3 != null) {
                    return this.f53020x11226c6.mo102239x316510(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102349x76847179(), c26368x17a977b3);
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "param is null");
                return -1;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "init failed, error:" + th6.toString());
                return -2;
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: pauseDownload */
        public int mo102161xe51afc9e(int i17) {
            return this.f53020x11226c6.mo102240xe51afc9e(i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: pushEvent */
        public void mo102162xd0c233a0(int i17) {
            this.f53020x11226c6.mo102241xd0c233a0(i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: resumeDownload */
        public int mo102163xb0277d5(int i17) {
            return this.f53020x11226c6.mo102243xb0277d5(i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: setClipInfo */
        public boolean mo102164xad41f2a0(int i17, int i18, java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19 c26356xafad9a19) {
            return this.f53020x11226c6.mo102244xad41f2a0(i17, i18, str, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9(c26356xafad9a19.m102216x33a4d677(), c26356xafad9a19.m102214x15d5aed8(), c26356xafad9a19.m102215xb883b063()));
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: setMaxStorageSizeMB */
        public void mo102165xd7e17d2f(long j17) {
            this.f53020x11226c6.mo102246xd7e17d2f(j17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: setPlayState */
        public void mo102166xeb2f5b7b(int i17, int i18) {
            this.f53020x11226c6.mo102247xeb2f5b7b(i17, i18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: setUserData */
        public void mo102167x66a91097(java.util.Map map) {
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (entry != null) {
                        try {
                            if (entry.getValue() != null) {
                                this.f53020x11226c6.mo102248x66a91097((java.lang.String) entry.getKey(), entry.getValue());
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "setUserData failed, error:" + th6.toString());
                        }
                    }
                }
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: startClipPlay */
        public int mo102168x3e462126(java.lang.String str, int i17, final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d) {
            return this.f53020x11226c6.mo102250x3e462126(str, i17, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d() { // from class: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.2
                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getAdvRemainTime */
                public long mo102271x7dd980b6() {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102180x7dd980b6();
                        }
                        return -1L;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getAdvRemainTime failed, error:" + th6.toString());
                        return -1L;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getContentType */
                public java.lang.String mo102272xc2a49a1d(int i18, java.lang.String str2, java.lang.String str3) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        return interfaceC26354xc1b4d57d2 != null ? interfaceC26354xc1b4d57d2.mo102181xc2a49a1d(i18, str2, str3) : "";
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getContentType key failed, error:" + th6.toString());
                        return "";
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getCurrentPlayClipNo */
                public int mo102273xce1eb728() {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102182xce1eb728();
                        }
                        return -1;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getCurrentPlayClipNo failed, error:" + th6.toString());
                        return -1;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getCurrentPlayOffset */
                public long mo102274xe243028a() {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102183xe243028a();
                        }
                        return -1L;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getCurrentPlayOffset failed, error:" + th6.toString());
                        return -1L;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getCurrentPosition */
                public long mo102275x9746038c() {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102184x9746038c();
                        }
                        return -1L;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getCurrentPosition failed, error:" + th6.toString());
                        return -1L;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getDataFilePath */
                public java.lang.String mo102276x84354c01(int i18, java.lang.String str2, java.lang.String str3) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        return interfaceC26354xc1b4d57d2 != null ? interfaceC26354xc1b4d57d2.mo102185x84354c01(i18, str2, str3) : "";
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getDataFilePath key failed, error:" + th6.toString());
                        return "";
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getDataTotalSize */
                public long mo102277x2f5bd925(int i18, java.lang.String str2, java.lang.String str3) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102186x2f5bd925(i18, str2, str3);
                        }
                        return -1L;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getDataTotalSize key failed, error:" + th6.toString());
                        return -1L;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getM3U8Content */
                public java.lang.String mo102278x79c2649a(int i18, java.lang.String str2, java.lang.String str3) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        return interfaceC26354xc1b4d57d2 != null ? interfaceC26354xc1b4d57d2.mo102187x79c2649a(i18, str2, str3) : "";
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getM3U8Content key failed, error:" + th6.toString());
                        return "";
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getPlayInfo */
                public java.lang.Object mo102279xebd0e778(long j17) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102188xebd0e778(java.lang.Long.toString(j17));
                        }
                        return null;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getPlayInfo type failed, error:" + th6.toString());
                        return null;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getPlayerBufferLength */
                public long mo102281xe15692bd() {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102189xe15692bd();
                        }
                        return -1L;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getPlayerBufferLength failed, error:" + th6.toString());
                        return -1L;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onDownloadCdnUrlExpired */
                public void mo102282x61548e7c(java.util.Map<java.lang.String, java.lang.String> map) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            interfaceC26354xc1b4d57d2.mo102190x61548e7c(map);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadCdnUrlExpired failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onDownloadCdnUrlInfoUpdate */
                public void mo102283x73241460(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            interfaceC26354xc1b4d57d2.mo102191x73241460(str2, str3, str4, str5);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadCdnUrlInfoUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onDownloadCdnUrlUpdate */
                public void mo102284xe42c8a92(java.lang.String str2) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            interfaceC26354xc1b4d57d2.mo102192xe42c8a92(str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadCdnUrlUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onDownloadError */
                public void mo102285x338612c1(int i18, int i19, java.lang.String str2) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            interfaceC26354xc1b4d57d2.mo102193x338612c1(i18, i19, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadError failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onDownloadFinish */
                public void mo102286x3e7062fa() {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            interfaceC26354xc1b4d57d2.mo102194x3e7062fa();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadFinish failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onDownloadProgressUpdate */
                public void mo102287x32d250bd(int i18, int i19, long j17, long j18, java.lang.String str2) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            interfaceC26354xc1b4d57d2.mo102195x32d250bd(i18, i19, j17, j18, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadProgressUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onDownloadProtocolUpdate */
                public void mo102288xab39e0e8(java.lang.String str2, java.lang.String str3) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            interfaceC26354xc1b4d57d2.mo102196xab39e0e8(str2, str3);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadProtocolUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onDownloadStatusUpdate */
                public void mo102289xe40fe482(int i18) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            interfaceC26354xc1b4d57d2.mo102197xe40fe482(i18);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadStatusUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onPlayCallback */
                public java.lang.Object mo102290x41392718(int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                        if (obj != null) {
                            arrayList.add(obj2);
                        }
                        if (obj != null) {
                            arrayList.add(obj3);
                        }
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 == null) {
                            return null;
                        }
                        interfaceC26354xc1b4d57d2.mo102198x41392718(i18, arrayList);
                        return null;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onPlayCallback failed, error:" + th6.toString());
                        return null;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onReadData */
                public int mo102291x715d255f(int i18, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102199x715d255f(i18, str2, str3, j17, j18);
                        }
                        return -1;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onReadData key failed, error:" + th6.toString());
                        return -1;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onStartReadData */
                public int mo102292x6e58d43(int i18, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102200x6e58d43(i18, str2, str3, j17, j18);
                        }
                        return -1;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onStartReadData key failed, error:" + th6.toString());
                        return -1;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: onStopReadData */
                public int mo102293xfb96d801(int i18, java.lang.String str2, java.lang.String str3, int i19) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102201xfb96d801(i18, str2, str3, i19);
                        }
                        return -1;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onStopReadData key failed, error:" + th6.toString());
                        return -1;
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                /* renamed from: getPlayInfo */
                public java.lang.Object mo102280xebd0e778(java.lang.String str2) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                        if (interfaceC26354xc1b4d57d2 != null) {
                            return interfaceC26354xc1b4d57d2.mo102188xebd0e778(str2);
                        }
                        return null;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getPlayInfo key failed, error:" + th6.toString());
                        return null;
                    }
                }
            });
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: startClipPreload */
        public int mo102169xed7cbad7(java.lang.String str, int i17, final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 interfaceC26355xdfd63988) {
            return this.f53020x11226c6.mo102251xed7cbad7(str, i17, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8() { // from class: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.4
                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8
                /* renamed from: onPrepareDownloadProgressUpdate */
                public void mo102294x8ea30446(int i18, int i19, long j17, long j18, java.lang.String str2) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 interfaceC26355xdfd639882 = interfaceC26355xdfd63988;
                        if (interfaceC26355xdfd639882 != null) {
                            interfaceC26355xdfd639882.mo102206x8ea30446(i18, i19, j17, j18, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onPrepareDownloadProgressUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8
                /* renamed from: onPrepareError */
                public void mo102295xfaf06cc0(int i18, int i19, java.lang.String str2) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 interfaceC26355xdfd639882 = interfaceC26355xdfd63988;
                        if (interfaceC26355xdfd639882 != null) {
                            interfaceC26355xdfd639882.mo102207xfaf06cc0(i18, i19, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onPrepareError failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8
                /* renamed from: onPrepareOK */
                public void mo102296xc1e12e04() {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 interfaceC26355xdfd639882 = interfaceC26355xdfd63988;
                        if (interfaceC26355xdfd639882 != null) {
                            interfaceC26355xdfd639882.mo102208xc1e12e04();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onPrepareOK failed, error:" + th6.toString());
                    }
                }
            });
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: startPlay */
        public int mo102170x8113c2b6(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19 c26356xafad9a19, final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d) {
            try {
                return this.f53020x11226c6.mo102253x8113c2b6(str, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9(c26356xafad9a19.m102216x33a4d677(), c26356xafad9a19.m102214x15d5aed8(), c26356xafad9a19.m102215xb883b063()), new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d() { // from class: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.1
                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getAdvRemainTime */
                    public long mo102271x7dd980b6() {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                return interfaceC26354xc1b4d57d2.mo102180x7dd980b6();
                            }
                            return -1L;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getAdvRemainTime failed, error:" + th6.toString());
                            return -1L;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getContentType */
                    public java.lang.String mo102272xc2a49a1d(int i17, java.lang.String str2, java.lang.String str3) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            return interfaceC26354xc1b4d57d2 != null ? interfaceC26354xc1b4d57d2.mo102181xc2a49a1d(i17, str2, str3) : "";
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getContentType key failed, error:" + th6.toString());
                            return "";
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getCurrentPlayClipNo */
                    public int mo102273xce1eb728() {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                return interfaceC26354xc1b4d57d2.mo102182xce1eb728();
                            }
                            return -1;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getCurrentPlayClipInfo failed, error:" + th6.toString());
                            return -1;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getCurrentPlayOffset */
                    public long mo102274xe243028a() {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                return interfaceC26354xc1b4d57d2.mo102183xe243028a();
                            }
                            return -1L;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getCurrentPlayOffset failed, error:" + th6.toString());
                            return -1L;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getCurrentPosition */
                    public long mo102275x9746038c() {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                return interfaceC26354xc1b4d57d2.mo102184x9746038c();
                            }
                            return -1L;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getCurrentPosition failed, error:" + th6.toString());
                            return -1L;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getDataFilePath */
                    public java.lang.String mo102276x84354c01(int i17, java.lang.String str2, java.lang.String str3) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            return interfaceC26354xc1b4d57d2 != null ? interfaceC26354xc1b4d57d2.mo102185x84354c01(i17, str2, str3) : "";
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getDataFilePath key failed, error:" + th6.toString());
                            return "";
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getDataTotalSize */
                    public long mo102277x2f5bd925(int i17, java.lang.String str2, java.lang.String str3) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                return interfaceC26354xc1b4d57d2.mo102186x2f5bd925(i17, str2, str3);
                            }
                            return -1L;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getDataTotalSize key failed, error:" + th6.toString());
                            return -1L;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getM3U8Content */
                    public java.lang.String mo102278x79c2649a(int i17, java.lang.String str2, java.lang.String str3) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            return interfaceC26354xc1b4d57d2 != null ? interfaceC26354xc1b4d57d2.mo102187x79c2649a(i17, str2, str3) : "";
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getM3U8Content key failed, error:" + th6.toString());
                            return "";
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getPlayInfo */
                    public java.lang.Object mo102279xebd0e778(long j17) {
                        try {
                            return interfaceC26354xc1b4d57d.mo102188xebd0e778(java.lang.Long.toString(j17));
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getPlayInfo type failed, error:" + th6.toString());
                            return null;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getPlayerBufferLength */
                    public long mo102281xe15692bd() {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                return interfaceC26354xc1b4d57d2.mo102189xe15692bd();
                            }
                            return -1L;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getPlayerBufferLength failed, error:" + th6.toString());
                            return -1L;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onDownloadCdnUrlExpired */
                    public void mo102282x61548e7c(java.util.Map<java.lang.String, java.lang.String> map) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                interfaceC26354xc1b4d57d2.mo102190x61548e7c(map);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadCdnUrlExpired failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onDownloadCdnUrlInfoUpdate */
                    public void mo102283x73241460(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                interfaceC26354xc1b4d57d2.mo102191x73241460(str2, str3, str4, str5);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadCdnUrlInfoUpdate failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onDownloadCdnUrlUpdate */
                    public void mo102284xe42c8a92(java.lang.String str2) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                interfaceC26354xc1b4d57d2.mo102192xe42c8a92(str2);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadCdnUrlUpdate failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onDownloadError */
                    public void mo102285x338612c1(int i17, int i18, java.lang.String str2) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                interfaceC26354xc1b4d57d2.mo102193x338612c1(i17, i18, str2);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadError failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onDownloadFinish */
                    public void mo102286x3e7062fa() {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                interfaceC26354xc1b4d57d2.mo102194x3e7062fa();
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownlaodFinish failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onDownloadProgressUpdate */
                    public void mo102287x32d250bd(int i17, int i18, long j17, long j18, java.lang.String str2) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                interfaceC26354xc1b4d57d2.mo102195x32d250bd(i17, i18, j17, j18, str2);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownlaodProgressUpdate failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onDownloadProtocolUpdate */
                    public void mo102288xab39e0e8(java.lang.String str2, java.lang.String str3) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                interfaceC26354xc1b4d57d2.mo102196xab39e0e8(str2, str3);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadProtocolUpdate failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onDownloadStatusUpdate */
                    public void mo102289xe40fe482(int i17) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                interfaceC26354xc1b4d57d2.mo102197xe40fe482(i17);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onDownloadStatusUpdate failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onPlayCallback */
                    public java.lang.Object mo102290x41392718(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        try {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                            if (obj2 != null) {
                                arrayList.add(obj2);
                            }
                            if (obj3 != null) {
                                arrayList.add(obj3);
                            }
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 == null) {
                                return null;
                            }
                            interfaceC26354xc1b4d57d2.mo102198x41392718(i17, arrayList);
                            return null;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onPlayCallback failed, error:" + th6.toString());
                            return null;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onReadData */
                    public int mo102291x715d255f(int i17, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                return interfaceC26354xc1b4d57d2.mo102199x715d255f(i17, str2, str3, j17, j18);
                            }
                            return -1;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onReadData key failed, error:" + th6.toString());
                            return -1;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onStartReadData */
                    public int mo102292x6e58d43(int i17, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                return interfaceC26354xc1b4d57d2.mo102200x6e58d43(i17, str2, str3, j17, j18);
                            }
                            return -1;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onStartReadData key failed, error:" + th6.toString());
                            return -1;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: onStopReadData */
                    public int mo102293xfb96d801(int i17, java.lang.String str2, java.lang.String str3, int i18) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26354xc1b4d57d interfaceC26354xc1b4d57d2 = interfaceC26354xc1b4d57d;
                            if (interfaceC26354xc1b4d57d2 != null) {
                                return interfaceC26354xc1b4d57d2.mo102201xfb96d801(i17, str2, str3, i18);
                            }
                            return -1;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onStopReadData key failed, error:" + th6.toString());
                            return -1;
                        }
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
                    /* renamed from: getPlayInfo */
                    public java.lang.Object mo102280xebd0e778(java.lang.String str2) {
                        try {
                            return interfaceC26354xc1b4d57d.mo102188xebd0e778(str2);
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getPlayInfo key failed, error:" + th6.toString());
                            return null;
                        }
                    }
                });
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startPlay failed, error:" + th6.toString());
                return -1;
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: startPreload */
        public int mo102171xe500ef47(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19 c26356xafad9a19, final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 interfaceC26355xdfd63988) {
            return this.f53020x11226c6.mo102254xe500ef47(str, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9(c26356xafad9a19.m102216x33a4d677(), c26356xafad9a19.m102214x15d5aed8(), c26356xafad9a19.m102215xb883b063()), new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8() { // from class: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.3
                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8
                /* renamed from: onPrepareDownloadProgressUpdate */
                public void mo102294x8ea30446(int i17, int i18, long j17, long j18, java.lang.String str2) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 interfaceC26355xdfd639882 = interfaceC26355xdfd63988;
                        if (interfaceC26355xdfd639882 != null) {
                            interfaceC26355xdfd639882.mo102206x8ea30446(i17, i18, j17, j18, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onPrepareDownloadProgressUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8
                /* renamed from: onPrepareError */
                public void mo102295xfaf06cc0(int i17, int i18, java.lang.String str2) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 interfaceC26355xdfd639882 = interfaceC26355xdfd63988;
                        if (interfaceC26355xdfd639882 != null) {
                            interfaceC26355xdfd639882.mo102207xfaf06cc0(i17, i18, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onPrepareError failed, error:" + th6.toString());
                    }
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8
                /* renamed from: onPrepareOK */
                public void mo102296xc1e12e04() {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 interfaceC26355xdfd639882 = interfaceC26355xdfd63988;
                        if (interfaceC26355xdfd639882 != null) {
                            interfaceC26355xdfd639882.mo102208xc1e12e04();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onPrepareOK failed, error:" + th6.toString());
                    }
                }
            });
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: startTask */
        public void mo102172x81156d07(int i17) {
            this.f53020x11226c6.mo102255x81156d07(i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: stopPlay */
        public void mo102173x66343656(int i17) {
            this.f53020x11226c6.mo102257x66343656(i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: stopPreload */
        public void mo102174xa07057a7(int i17) {
            this.f53020x11226c6.mo102258xa07057a7(i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491
        /* renamed from: updateTaskInfo */
        public void mo102175x1b6687bc(int i17, java.util.Map map) {
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (entry != null) {
                        try {
                            if (entry.getValue() != null) {
                                this.f53020x11226c6.mo102260x1b6687bc(i17, (java.lang.String) entry.getKey(), entry.getValue());
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "updateTaskInfo failed, error:" + th6.toString());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService$DownloadProxyFactory */
    /* loaded from: classes16.dex */
    public class DownloadProxyFactory extends com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub {

        /* renamed from: mvTPDownloadProxyMap */
        private java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491> f53030x8e7874bb;

        private DownloadProxyFactory() {
            this.f53030x8e7874bb = new java.util.HashMap<>();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
        /* renamed from: getNativeVersion */
        public java.lang.String mo102220x994c290b() {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102339x994c290b();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
        /* renamed from: getTPDownloadProxy */
        public synchronized com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491 mo102221x61ce4f94(int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491 interfaceC26353x2bfd9491;
            interfaceC26353x2bfd9491 = this.f53030x8e7874bb.get(java.lang.Integer.valueOf(i17));
            if (interfaceC26353x2bfd9491 == null) {
                interfaceC26353x2bfd9491 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.DownloadProxy(i17);
                this.f53030x8e7874bb.put(java.lang.Integer.valueOf(i17), interfaceC26353x2bfd9491);
            }
            return interfaceC26353x2bfd9491;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
        /* renamed from: isReadyForDownload */
        public boolean mo102222xf56d1818() {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102343xf56d1818();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
        /* renamed from: isReadyForPlay */
        public boolean mo102223xccbd22c4() {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102344xccbd22c4();
        }
    }

    /* renamed from: isExistMainProcess */
    private boolean m102434x28d7c849() {
        int i17;
        try {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses()) {
                java.lang.String str = runningAppProcessInfo.processName;
                if (!android.text.TextUtils.isEmpty(str) && str.equals(getPackageName())) {
                    int i18 = this.pid;
                    if (i18 != -1 && i18 != (i17 = runningAppProcessInfo.pid)) {
                        this.pid = i17;
                        return false;
                    }
                    this.pid = runningAppProcessInfo.pid;
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "app main exist!");
                    return true;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "isExistMainProcess failed, error:" + th6.toString());
        }
        return false;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (this.f53019xeda39764 == null) {
            this.f53019xeda39764 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.DownloadProxyFactory();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "on bind!");
        m102434x28d7c849();
        return this.f53019xeda39764;
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "on rebind!");
        m102434x28d7c849();
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        super.onStartCommand(intent, i17, i18);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "on start command!");
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "on unbind!");
        super.onUnbind(intent);
        if (m102434x28d7c849()) {
            return true;
        }
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102426x41795fe7(3);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102380xe26ccb25();
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102381xa82895c0();
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53018x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, th6.toString());
            return true;
        }
    }
}
