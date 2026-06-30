package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.WXPCommReqResp */
/* loaded from: classes12.dex */
public class C3260xb1b43d3 extends com.p314xaae8f345.mm.p944x882e457a.k1 {

    /* renamed from: funcId */
    private int f12461xb4b28aff;

    /* renamed from: m_mockMgr */
    public java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360> f12462xf6c8fa5c;
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.Req req;

    /* renamed from: requestWrapper */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPRequestWrapper f12465xf076fb04;

    /* renamed from: resp */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.Resp f12466x355bd0;
    private java.lang.String uri;

    /* renamed from: option */
    private int f12464xc3ca8875 = 0;

    /* renamed from: responseWrapper */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPResponseWrapper f12467x8268ed12 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPResponseWrapper();

    /* renamed from: newExtFlag */
    private int f12463xd591df6d = 0;

    /* renamed from: transferHeader */
    private byte[] f12468x4ea5aa58 = null;

    /* renamed from: com.tencent.kinda.framework.module.impl.WXPCommReqResp$Resp */
    /* loaded from: classes12.dex */
    public static final class Resp extends o45.ah implements o45.yg {

        /* renamed from: cmdId */
        private int f12473x5a623f5;

        /* renamed from: needHeader */
        private boolean f12474x9cee0ec3;

        /* renamed from: rImpl */
        private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPResponseWrapper f12475x6694db2;

        public Resp(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPResponseWrapper wXPResponseWrapper, int i17, boolean z17) {
            this.f12475x6694db2 = wXPResponseWrapper;
            this.f12473x5a623f5 = i17;
            this.f12474x9cee0ec3 = z17;
        }

        @Override // o45.yg
        /* renamed from: fromProtoBuf */
        public int mo13863x347f4535(byte[] bArr) {
            this.f12475x6694db2.m25986x76491f2c(bArr);
            return 0;
        }

        @Override // o45.ah
        /* renamed from: getCmdId */
        public int mo13864x7443ca3f() {
            return this.f12473x5a623f5;
        }

        /* renamed from: getResponseWrapper */
        public com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPResponseWrapper m25981x66cabedc() {
            return this.f12475x6694db2;
        }
    }

    /* renamed from: com.tencent.kinda.framework.module.impl.WXPCommReqResp$WXPRequestWrapper */
    /* loaded from: classes12.dex */
    public static final class WXPRequestWrapper {

        /* renamed from: data */
        private byte[] f12476x2eefaa;

        public WXPRequestWrapper() {
        }

        /* renamed from: getData */
        public byte[] m25982xfb7e5820() {
            return this.f12476x2eefaa;
        }

        /* renamed from: setData */
        public void m25983x76491f2c(byte[] bArr) {
            this.f12476x2eefaa = bArr;
        }

        public WXPRequestWrapper(byte[] bArr) {
            this.f12476x2eefaa = bArr;
        }
    }

    /* renamed from: com.tencent.kinda.framework.module.impl.WXPCommReqResp$WXPResponseWrapper */
    /* loaded from: classes12.dex */
    public class WXPResponseWrapper {

        /* renamed from: data */
        private byte[] f12477x2eefaa;

        /* renamed from: newData */
        private java.lang.String f12478x6df43d6a = null;

        public WXPResponseWrapper() {
        }

        /* renamed from: getData */
        public byte[] m25984xfb7e5820() {
            return this.f12477x2eefaa;
        }

        /* renamed from: getNewData */
        public java.lang.String m25985xabc17934() {
            return this.f12478x6df43d6a;
        }

        /* renamed from: setData */
        public void m25986x76491f2c(byte[] bArr) {
            this.f12477x2eefaa = bArr;
        }

        /* renamed from: setNewData */
        public void m25987x1f32c6a8(java.lang.String str) {
            this.f12478x6df43d6a = str;
        }
    }

    public C3260xb1b43d3(byte[] bArr, java.lang.String str, int i17, int i18, int i19, boolean z17, int i27, int i28, java.lang.String str2, com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360 abstractC3484x5b74a360) {
        this.req = null;
        this.f12466x355bd0 = null;
        this.f12465xf076fb04 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPRequestWrapper(bArr);
        this.req = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.Req(this.f12465xf076fb04, i17, i18, z17, i27, i28, str2);
        this.f12466x355bd0 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.Resp(this.f12467x8268ed12, i19, z17);
        this.uri = str;
        this.f12461xb4b28aff = i17;
        this.f12462xf6c8fa5c = new java.lang.ref.WeakReference<>(abstractC3484x5b74a360);
        if (i27 == 0) {
            m47986x306cfea3(true);
        }
    }

    /* renamed from: addNewExtFlag */
    public void m25957xd6c39eee(int i17) {
        this.f12463xd591df6d = i17 | this.f12463xd591df6d;
    }

    /* renamed from: clearNewExtFlag */
    public void m25958xa7a7b59a() {
        this.f12463xd591df6d = 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1, com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getNewExtFlags */
    public int mo25959xb6805570() {
        return this.f12463xd591df6d;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1, com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getOptions */
    public int mo14486xf353c268() {
        return this.f12464xc3ca8875;
    }

    /* renamed from: getReqCmdId */
    public final int m25960x61ac6b6d() {
        return this.req.f12469x5a623f5;
    }

    /* renamed from: getRequestProtoBuf */
    public final com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPRequestWrapper m25961x43bd3ce4() {
        return this.req.f12472x6694db2;
    }

    /* renamed from: getRespCmdId */
    public final int m25962x882c2b4f() {
        return this.f12466x355bd0.f12473x5a623f5;
    }

    /* renamed from: getResponseProtoBuf */
    public final com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPResponseWrapper m25963xb3802242() {
        return this.f12466x355bd0.f12475x6694db2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1, com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getTransHeader */
    public byte[] mo25964x2ee16a1f() {
        return this.f12468x4ea5aa58;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getType */
    public final int mo13822xfb85f7b0() {
        return this.f12461xb4b28aff;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getUri */
    public final java.lang.String mo13823xb5887636() {
        return this.uri;
    }

    /* renamed from: getWXPReqData */
    public byte[] m25965x8eb9b0af() {
        return this.f12465xf076fb04.m25982xfb7e5820();
    }

    /* renamed from: getWXPRespData */
    public byte[] m25966x4e44ad33() {
        return this.f12467x8268ed12.m25984xfb7e5820();
    }

    /* renamed from: getWXPRespNewData */
    public java.lang.String m25967x41e7a741() {
        return this.f12467x8268ed12.m25985xabc17934();
    }

    /* renamed from: resp2Json */
    public java.lang.String m25968x87bf7e6a(byte[] bArr) {
        java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360> weakReference = this.f12462xf6c8fa5c;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f12462xf6c8fa5c.get().mo28043x634b016e(bArr);
    }

    /* renamed from: setOptions */
    public void m25969x66c50fdc(int i17) {
        this.f12464xc3ca8875 = i17;
    }

    /* renamed from: setRsaInfo */
    public void m25970x97bfc4c(o45.pi piVar) {
        this.req.m150628x97bfc4c(piVar);
    }

    /* renamed from: setTransferHeader */
    public void m25971x533df5a(byte[] bArr) {
        this.f12468x4ea5aa58 = bArr;
    }

    /* renamed from: setUri */
    public void m25972xca029daa(java.lang.String str) {
        this.uri = str;
    }

    /* renamed from: setWXPReqData */
    public void m25973xbcddfebb(byte[] bArr) {
        this.f12465xf076fb04.m25983x76491f2c(bArr);
    }

    /* renamed from: setWXPRespData */
    public void m25974xe4aa20a7(byte[] bArr) {
        this.f12467x8268ed12.m25986x76491f2c(bArr);
    }

    /* renamed from: setWXPRespNewData */
    public void m25975x9de0f4d(java.lang.String str) {
        this.f12467x8268ed12.m25987x1f32c6a8(str);
        java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360> weakReference = this.f12462xf6c8fa5c;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        m25974xe4aa20a7(this.f12462xf6c8fa5c.get().mo28041xf25ff4ae(str));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1
    /* renamed from: getReqObjImp */
    public final com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.Req mo13820xe7c2e2dd() {
        return this.req;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getRespObj */
    public final com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.Resp mo13821x7f35c2d1() {
        return this.f12466x355bd0;
    }

    /* renamed from: com.tencent.kinda.framework.module.impl.WXPCommReqResp$Req */
    /* loaded from: classes12.dex */
    public static final class Req extends o45.zg implements o45.xg {

        /* renamed from: cmdId */
        private int f12469x5a623f5;

        /* renamed from: funcId */
        private int f12470xb4b28aff;

        /* renamed from: needHeader */
        private boolean f12471x9cee0ec3;

        /* renamed from: rImpl */
        private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPRequestWrapper f12472x6694db2;

        public Req(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPRequestWrapper wXPRequestWrapper, int i17, int i18, boolean z17) {
            this.f12472x6694db2 = wXPRequestWrapper;
            this.f12470xb4b28aff = i17;
            this.f12469x5a623f5 = i18;
            this.f12471x9cee0ec3 = z17;
        }

        @Override // o45.zg
        /* renamed from: getCmdId */
        public int mo13850x7443ca3f() {
            return this.f12469x5a623f5;
        }

        @Override // o45.xg
        /* renamed from: getFuncId */
        public int mo13851x19c9adf5() {
            return this.f12470xb4b28aff;
        }

        /* renamed from: getImpl */
        public com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPRequestWrapper m25978xfb80ca96() {
            return this.f12472x6694db2;
        }

        @Override // o45.xg
        /* renamed from: toProtoBuf */
        public byte[] mo13852xc3d7db06() {
            return this.f12472x6694db2.m25982xfb7e5820();
        }

        public Req(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.WXPRequestWrapper wXPRequestWrapper, int i17, int i18, boolean z17, int i19, int i27, java.lang.String str) {
            this.f12472x6694db2 = wXPRequestWrapper;
            this.f12470xb4b28aff = i17;
            this.f12469x5a623f5 = i18;
            this.f12471x9cee0ec3 = z17;
            m150627x65ba7055(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0));
        }
    }
}
