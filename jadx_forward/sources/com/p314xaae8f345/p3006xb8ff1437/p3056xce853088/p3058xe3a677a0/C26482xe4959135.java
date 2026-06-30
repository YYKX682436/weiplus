package com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0;

/* renamed from: com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin */
/* loaded from: classes16.dex */
public class C26482xe4959135 implements com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09 {

    /* renamed from: REPORT_EVENT_RICH_MEDIA_FEATURE_DATA_CALLBACK */
    private static final java.lang.String f53998xb59f1303 = "rich_media_feature_data_callback";

    /* renamed from: REPORT_EVENT_RICH_MEDIA_FEATURE_SELECT */
    private static final java.lang.String f53999x890eef53 = "rich_media_feature_select";

    /* renamed from: REPORT_EVENT_RICH_MEDIA_PREPARE */
    private static final java.lang.String f54000xcbee37d9 = "rich_media_prepare";

    /* renamed from: REPORT_KEY_APP_PLATFORM */
    private static final java.lang.String f54001x8d100a9c = "appplatform";

    /* renamed from: REPORT_KEY_CODE */
    private static final java.lang.String f54002xbed2ce98 = "code";

    /* renamed from: REPORT_KEY_DURATION */
    private static final java.lang.String f54003x223318bf = "duration";

    /* renamed from: REPORT_KEY_FEATURE_TYPE */
    private static final java.lang.String f54004xeab65cae = "featuretype";

    /* renamed from: REPORT_KEY_FLOW_ID */
    private static final java.lang.String f54005xf0105141 = "flowid";

    /* renamed from: REPORT_KEY_GUID */
    private static final java.lang.String f54006xbed4b734 = "guid";

    /* renamed from: REPORT_KEY_NETWORK */
    private static final java.lang.String f54007x8b967983 = "network";

    /* renamed from: REPORT_KEY_POSITION */
    private static final java.lang.String f54008xc5816454 = "position";

    /* renamed from: REPORT_KEY_SEQ */
    private static final java.lang.String f54009x6940d634 = "seq";

    /* renamed from: REPORT_KEY_URL */
    private static final java.lang.String f54010x6940df44 = "url";

    /* renamed from: SUCCESS */
    private static final int f54011xbb80cbe3 = 0;

    /* renamed from: mFeatures */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[] f54015x13aa8bca;

    /* renamed from: mFlowId */
    private java.lang.String f54016x3a09db6;

    /* renamed from: mUrl */
    private java.lang.String f54021x32d9c2;

    /* renamed from: mLock */
    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26579x7b4fc798 f54017x6243b38 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26579x7b4fc798();

    /* renamed from: mSelectSeq */
    private int f54020x146f67d6 = 0;

    /* renamed from: mCallbackDataSeq */
    private int f54013xcfcfc23 = 0;

    /* renamed from: mCurrentPositionMs */
    private int f54014x27805a1b = -1;

    /* renamed from: mPrepareStartTimeMs */
    private long f54018x310981b = 0;

    /* renamed from: mSelectFeatureParams */
    private java.util.List<com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135.TPSelectFeatureParam> f54019xc98ed2d3 = new java.util.ArrayList();

    /* renamed from: mCallbackDataParams */
    private java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135.TPCallbackDataParam> f54012x6ecc7342 = new java.util.HashMap();

    /* renamed from: com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin$TPCallbackDataParam */
    /* loaded from: classes16.dex */
    public static class TPCallbackDataParam {
        public int seq;

        /* renamed from: startTimeMs */
        public long f54022x91dc3c55;

        private TPCallbackDataParam() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin$TPSelectFeatureParam */
    /* loaded from: classes16.dex */
    public static class TPSelectFeatureParam {

        /* renamed from: featureIndex */
        public int f54023x46da277c;
        public int seq;

        /* renamed from: startTimeMs */
        public long f54024x91dc3c55;

        private TPSelectFeatureParam() {
        }
    }

    /* renamed from: addCommonProperties */
    private void m103254x8159c43f(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
        interfaceC26262x6f07842c.put("url", this.f54021x32d9c2);
        interfaceC26262x6f07842c.put("flowid", this.f54016x3a09db6);
        interfaceC26262x6f07842c.put("guid", com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101634xfb7ffeff());
        interfaceC26262x6f07842c.put(f54001x8d100a9c, com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101638xeb97a5e9());
        interfaceC26262x6f07842c.put("network", com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.m104328xdc22dfe4());
    }

    /* renamed from: allFeatureDataCallbackDone */
    private void m103255x72434e66(int i17) {
        if (this.f54015x13aa8bca != null) {
            for (int i18 = 0; i18 < this.f54015x13aa8bca.length; i18++) {
                m103258xf0153547(i18, 0);
            }
        }
    }

    /* renamed from: allFeatureSelectDone */
    private void m103256x28afa693(int i17) {
        if (this.f54015x13aa8bca != null) {
            for (int i18 = 0; i18 < this.f54015x13aa8bca.length; i18++) {
                m103259xc82c8a34(i18, 0);
            }
        }
    }

    /* renamed from: clearResource */
    private void m103257xbfab417b() {
        this.f54015x13aa8bca = null;
        this.f54020x146f67d6 = 0;
        this.f54013xcfcfc23 = 0;
        this.f54018x310981b = 0L;
        this.f54019xc98ed2d3.clear();
        this.f54012x6ecc7342.clear();
    }

    /* renamed from: featureDataCallbackDone */
    private void m103258xf0153547(int i17, int i18) {
        if (this.f54012x6ecc7342.containsKey(java.lang.Integer.valueOf(i17))) {
            m103276x443c1651(this.f54012x6ecc7342.get(java.lang.Integer.valueOf(i17)), m103262xc35e5a1a(i17), i18);
            this.f54012x6ecc7342.remove(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: featureSelectDone */
    private void m103259xc82c8a34(int i17, int i18) {
        java.lang.String m103262xc35e5a1a = m103262xc35e5a1a(i17);
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135.TPSelectFeatureParam> it = this.f54019xc98ed2d3.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135.TPSelectFeatureParam next = it.next();
            if (next.f54023x46da277c == i17) {
                m103277x6cd1fabe(next, m103262xc35e5a1a, i18);
                it.remove();
            }
        }
    }

    /* renamed from: finishReport */
    private void m103260xa395d3a7(int i17) {
        m103278x9b93c9f1(i17);
        m103256x28afa693(i17);
        m103255x72434e66(i17);
    }

    /* renamed from: finishReportAndClearResource */
    private void m103261x869dd6ab(int i17) {
        m103260xa395d3a7(i17);
        m103257xbfab417b();
    }

    /* renamed from: getFeatureType */
    private java.lang.String m103262xc35e5a1a(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[] c26250xdf42e40aArr = this.f54015x13aa8bca;
        return (c26250xdf42e40aArr == null || i17 < 0 || i17 >= c26250xdf42e40aArr.length) ? "" : c26250xdf42e40aArr[i17].m101531xc35e5a1a();
    }

    /* renamed from: onDeselectDone */
    private void m103263xd226995e(int i17) {
        m103258xf0153547(i17, 0);
    }

    /* renamed from: onError */
    private void m103264xaf8aa769(int i17) {
        m103261x869dd6ab(i17);
    }

    /* renamed from: onFeatureFailure */
    private void m103265x7323d573(int i17, int i18) {
        m103259xc82c8a34(i17, i18);
        m103258xf0153547(i17, i18);
    }

    /* renamed from: onPrepared */
    private void m103266x58d5b73c(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[]) {
            this.f54015x13aa8bca = (com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[]) obj;
        }
        m103278x9b93c9f1(0);
    }

    /* renamed from: onRelease */
    private void m103267x90a72928() {
        m103261x869dd6ab(0);
    }

    /* renamed from: onReset */
    private void m103268xb03bf2b0() {
        m103261x869dd6ab(0);
    }

    /* renamed from: onSelectDone */
    private void m103269x64624ddd(int i17) {
        m103259xc82c8a34(i17, 0);
        if (this.f54012x6ecc7342.containsKey(java.lang.Integer.valueOf(i17))) {
            return;
        }
        this.f54013xcfcfc23++;
        com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135.TPCallbackDataParam tPCallbackDataParam = new com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135.TPCallbackDataParam();
        tPCallbackDataParam.seq = this.f54013xcfcfc23;
        tPCallbackDataParam.f54022x91dc3c55 = android.os.SystemClock.elapsedRealtime();
        this.f54012x6ecc7342.put(java.lang.Integer.valueOf(i17), tPCallbackDataParam);
    }

    /* renamed from: onSetUrl */
    private void m103270x58f7746c(java.lang.String str) {
        this.f54016x3a09db6 = java.util.UUID.randomUUID().toString() + java.lang.System.nanoTime() + "_" + com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101638xeb97a5e9();
        this.f54021x32d9c2 = str;
    }

    /* renamed from: onStartDeselect */
    private void m103271x776ca7a0(int i17) {
        m103259xc82c8a34(i17, 0);
    }

    /* renamed from: onStartPrepare */
    private void m103272x5a4519c4() {
        this.f54018x310981b = android.os.SystemClock.elapsedRealtime();
    }

    /* renamed from: onStartSelect */
    private void m103273xac7d1c9f(int i17) {
        this.f54020x146f67d6++;
        com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135.TPSelectFeatureParam tPSelectFeatureParam = new com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135.TPSelectFeatureParam();
        tPSelectFeatureParam.f54023x46da277c = i17;
        tPSelectFeatureParam.seq = this.f54020x146f67d6;
        tPSelectFeatureParam.f54024x91dc3c55 = android.os.SystemClock.elapsedRealtime();
        this.f54019xc98ed2d3.add(tPSelectFeatureParam);
    }

    /* renamed from: onUpdatePosition */
    private void m103274x8f3e04d1(int i17) {
        this.f54014x27805a1b = i17;
    }

    /* renamed from: reportEvent */
    private void m103275xefe04dc6(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
        m103254x8159c43f(interfaceC26262x6f07842c);
        com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26263x413d0abf.m101574xbcd477d3(str, interfaceC26262x6f07842c);
    }

    /* renamed from: reportFeatureDataCallback */
    private void m103276x443c1651(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135.TPCallbackDataParam tPCallbackDataParam, java.lang.String str, int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        c26578x4d6188cf.put("duration", android.os.SystemClock.elapsedRealtime() - tPCallbackDataParam.f54022x91dc3c55);
        c26578x4d6188cf.put("code", i17);
        c26578x4d6188cf.put("seq", tPCallbackDataParam.seq);
        c26578x4d6188cf.put(f54004xeab65cae, str);
        c26578x4d6188cf.put(f54008xc5816454, this.f54014x27805a1b);
        m103275xefe04dc6(f53998xb59f1303, c26578x4d6188cf);
    }

    /* renamed from: reportFeatureSelect */
    private void m103277x6cd1fabe(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135.TPSelectFeatureParam tPSelectFeatureParam, java.lang.String str, int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        c26578x4d6188cf.put("duration", android.os.SystemClock.elapsedRealtime() - tPSelectFeatureParam.f54024x91dc3c55);
        c26578x4d6188cf.put("code", i17);
        c26578x4d6188cf.put("seq", tPSelectFeatureParam.seq);
        c26578x4d6188cf.put(f54004xeab65cae, str);
        c26578x4d6188cf.put(f54008xc5816454, this.f54014x27805a1b);
        m103275xefe04dc6(f53999x890eef53, c26578x4d6188cf);
    }

    /* renamed from: reportRichMediaPrepared */
    private void m103278x9b93c9f1(int i17) {
        if (this.f54018x310981b <= 0) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        c26578x4d6188cf.put("duration", android.os.SystemClock.elapsedRealtime() - this.f54018x310981b);
        c26578x4d6188cf.put("code", i17);
        m103275xefe04dc6(f54000xcbee37d9, c26578x4d6188cf);
        this.f54018x310981b = 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onAttach */
    public void mo103279x3b13c504() {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onDetach */
    public void mo103280x3f5eee52() {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onEvent */
    public void mo103281xaf8c47fb(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        this.f54017x6243b38.writeLock().lock();
        switch (i17) {
            case 300:
                m103272x5a4519c4();
                break;
            case 301:
                m103266x58d5b73c(obj);
                break;
            case 302:
                m103273xac7d1c9f(i18);
                break;
            case 303:
                m103269x64624ddd(i18);
                break;
            case 304:
                m103271x776ca7a0(i18);
                break;
            case 305:
                m103263xd226995e(i18);
                break;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630 /* 306 */:
                m103268xb03bf2b0();
                break;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54460xdba898a8 /* 307 */:
                m103267x90a72928();
                break;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54457x5e52d6e7 /* 308 */:
                m103264xaf8aa769(i18);
                break;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54463x110bac93 /* 309 */:
                m103270x58f7746c(str);
                break;
            case 310:
                m103265x7323d573(i18, i19);
                break;
            case 311:
                m103274x8f3e04d1(i18);
                break;
        }
        this.f54017x6243b38.writeLock().unlock();
    }
}
