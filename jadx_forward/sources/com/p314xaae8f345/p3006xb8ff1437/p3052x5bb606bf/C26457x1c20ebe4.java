package com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf;

/* renamed from: com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy */
/* loaded from: classes16.dex */
public class C26457x1c20ebe4 implements java.lang.reflect.InvocationHandler {

    /* renamed from: METHOD_NAME_SET_PLAYER_LISTENER */
    private static final java.lang.String f53771x871e003f = "setPlayListener";

    /* renamed from: METHOD_NAME_START_DOWNLOAD_PLAY */
    private static final java.lang.String f53772x61764538 = "startDownloadPlay";

    /* renamed from: METHOD_NAME_START_DOWNLOAD_PLAY_BY_ASSET */
    private static final java.lang.String f53773xf62ccc0f = "startDownloadPlayByAsset";
    private static final java.lang.String TAG = "TPDataTransportManagerProxy";

    /* renamed from: mPlayManagerImpl */
    private com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d f53774xd1964b6c;

    /* renamed from: mPlayManagerImplInterfaceProxy */
    private java.lang.Object f53775x1567341;

    /* renamed from: mPlayManagerImplListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d f53776xc9114840;

    /* renamed from: mPlayManagerImplProxyListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.TPPlayManagerImplProxyListener f53777xa5e07936 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.TPPlayManagerImplProxyListener();

    /* renamed from: mPlayerContext */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26518xb8c23f93 f53778x31e66c21;

    /* renamed from: com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy$TPPlayManagerImplProxyListener */
    /* loaded from: classes16.dex */
    public class TPPlayManagerImplProxyListener implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d {
        private TPPlayManagerImplProxyListener() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getAdvRemainTime */
        public long mo102271x7dd980b6() {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102271x7dd980b6();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getContentType */
        public java.lang.String mo102272xc2a49a1d(int i17, java.lang.String str, java.lang.String str2) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102272xc2a49a1d(i17, str, str2);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getCurrentPlayClipNo */
        public int mo102273xce1eb728() {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102273xce1eb728();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getCurrentPlayOffset */
        public long mo102274xe243028a() {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102274xe243028a();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getCurrentPosition */
        public long mo102275x9746038c() {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102275x9746038c();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getDataFilePath */
        public java.lang.String mo102276x84354c01(int i17, java.lang.String str, java.lang.String str2) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102276x84354c01(i17, str, str2);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getDataTotalSize */
        public long mo102277x2f5bd925(int i17, java.lang.String str, java.lang.String str2) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102277x2f5bd925(i17, str, str2);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getM3U8Content */
        public java.lang.String mo102278x79c2649a(int i17, java.lang.String str, java.lang.String str2) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102272xc2a49a1d(i17, str, str2);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getPlayInfo */
        public java.lang.Object mo102279xebd0e778(long j17) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102279xebd0e778(j17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getPlayerBufferLength */
        public long mo102281xe15692bd() {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102281xe15692bd();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadCdnUrlExpired */
        public void mo102282x61548e7c(java.util.Map<java.lang.String, java.lang.String> map) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102282x61548e7c(map);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadCdnUrlInfoUpdate */
        public void mo102283x73241460(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo dTCdnUrlUpdataEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo();
            dTCdnUrlUpdataEventInfo.m103169x52cdf2f2(str2);
            dTCdnUrlUpdataEventInfo.m103170x26778554(str3);
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53778x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(dTCdnUrlUpdataEventInfo);
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102283x73241460(str, str2, str3, str4);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadCdnUrlUpdate */
        public void mo102284xe42c8a92(java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102284xe42c8a92(str);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadError */
        public void mo102285x338612c1(int i17, int i18, java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102285x338612c1(i17, i18, str);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadFinish */
        public void mo102286x3e7062fa() {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102286x3e7062fa();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadProgressUpdate */
        public void mo102287x32d250bd(int i17, int i18, long j17, long j18, java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTDownloadProgressUpdataEventInfo dTDownloadProgressUpdataEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTDownloadProgressUpdataEventInfo();
            dTDownloadProgressUpdataEventInfo.m103172x33dc1e97(i18 * 8);
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53778x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(dTDownloadProgressUpdataEventInfo);
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102287x32d250bd(i17, i18, j17, j18, str);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadProtocolUpdate */
        public void mo102288xab39e0e8(java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTProtocalUpdateEventInfo dTProtocalUpdateEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTProtocalUpdateEventInfo();
            dTProtocalUpdateEventInfo.m103175x3b9d2d1a(str);
            dTProtocalUpdateEventInfo.m103176x57c4d429(str2);
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53778x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(dTProtocalUpdateEventInfo);
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102288xab39e0e8(str, str2);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadStatusUpdate */
        public void mo102289xe40fe482(int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102289xe40fe482(i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onPlayCallback */
        public java.lang.Object mo102290x41392718(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102290x41392718(i17, obj, obj2, obj3, obj4);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onReadData */
        public int mo102291x715d255f(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102291x715d255f(i17, str, str2, j17, j18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onStartReadData */
        public int mo102292x6e58d43(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102292x6e58d43(i17, str, str2, j17, j18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onStopReadData */
        public int mo102293xfb96d801(int i17, java.lang.String str, java.lang.String str2, int i18) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102293xfb96d801(i17, str, str2, i18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getPlayInfo */
        public java.lang.Object mo102280xebd0e778(java.lang.String str) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26457x1c20ebe4.this.f53776xc9114840.mo102280xebd0e778(str);
        }
    }

    public C26457x1c20ebe4(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d c26458xbbcd017d, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26518xb8c23f93 c26518xb8c23f93) {
        this.f53774xd1964b6c = c26458xbbcd017d;
        this.f53778x31e66c21 = c26518xb8c23f93;
    }

    /* renamed from: dealReturn */
    private static java.lang.Object m103020x2ad624bc(java.lang.reflect.Method method) {
        java.lang.String name = method.getReturnType().getName();
        if (name.equals(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03)) {
            return java.lang.Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals("float")) {
            return java.lang.Float.valueOf(0.0f);
        }
        return null;
    }

    /* renamed from: hookListenerIfNeed */
    private void m103021x22f6152a(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (method.getName().equals(f53771x871e003f)) {
            this.f53776xc9114840 = (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d) objArr[0];
            objArr[0] = this.f53777xa5e07936;
        }
    }

    /* renamed from: publishEventAfterMethodInvokeIfNeed */
    private void m103022x2cf351d(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        name.getClass();
        if (name.equals(f53773xf62ccc0f) || name.equals(f53772x61764538)) {
            m103023x3b2c08be(objArr);
        }
    }

    /* renamed from: publishReturnConvertedUrlEvent */
    private void m103023x3b2c08be(java.lang.Object[] objArr) {
        this.f53778x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTReturnConvertedUrlEventInfo());
    }

    /* renamed from: getProxyInstance */
    public synchronized java.lang.Object m103024xceae316d() {
        if (this.f53775x1567341 == null) {
            this.f53775x1567341 = java.lang.reflect.Proxy.newProxyInstance(this.f53774xd1964b6c.getClass().getClassLoader(), this.f53774xd1964b6c.getClass().getInterfaces(), this);
        }
        return this.f53775x1567341;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        m103021x22f6152a(method, objArr);
        try {
            java.lang.Object invoke = method.invoke(this.f53774xd1964b6c, objArr);
            m103022x2cf351d(method, objArr);
            return invoke;
        } catch (java.lang.reflect.InvocationTargetException e17) {
            if (e17.getTargetException() != null) {
                throw e17.getTargetException();
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "invokeMethod " + method.getName() + " has excecption: " + e17.toString());
            return m103020x2ad624bc(method);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "invokeMethod " + method.getName() + " has excecption: " + th6.toString());
            return m103020x2ad624bc(method);
        }
    }
}
