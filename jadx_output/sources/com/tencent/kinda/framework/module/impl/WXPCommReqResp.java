package com.tencent.kinda.framework.module.impl;

/* loaded from: classes12.dex */
public class WXPCommReqResp extends com.tencent.mm.modelbase.k1 {
    private int funcId;
    public java.lang.ref.WeakReference<com.tencent.kinda.gen.KNetworkMockManager> m_mockMgr;
    private com.tencent.kinda.framework.module.impl.WXPCommReqResp.Req req;
    private com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPRequestWrapper requestWrapper;
    private com.tencent.kinda.framework.module.impl.WXPCommReqResp.Resp resp;
    private java.lang.String uri;
    private int option = 0;
    private com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPResponseWrapper responseWrapper = new com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPResponseWrapper();
    private int newExtFlag = 0;
    private byte[] transferHeader = null;

    /* loaded from: classes12.dex */
    public static final class Resp extends o45.ah implements o45.yg {
        private int cmdId;
        private boolean needHeader;
        private com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPResponseWrapper rImpl;

        public Resp(com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPResponseWrapper wXPResponseWrapper, int i17, boolean z17) {
            this.rImpl = wXPResponseWrapper;
            this.cmdId = i17;
            this.needHeader = z17;
        }

        @Override // o45.yg
        public int fromProtoBuf(byte[] bArr) {
            this.rImpl.setData(bArr);
            return 0;
        }

        @Override // o45.ah
        public int getCmdId() {
            return this.cmdId;
        }

        public com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPResponseWrapper getResponseWrapper() {
            return this.rImpl;
        }
    }

    /* loaded from: classes12.dex */
    public static final class WXPRequestWrapper {
        private byte[] data;

        public WXPRequestWrapper() {
        }

        public byte[] getData() {
            return this.data;
        }

        public void setData(byte[] bArr) {
            this.data = bArr;
        }

        public WXPRequestWrapper(byte[] bArr) {
            this.data = bArr;
        }
    }

    /* loaded from: classes12.dex */
    public class WXPResponseWrapper {
        private byte[] data;
        private java.lang.String newData = null;

        public WXPResponseWrapper() {
        }

        public byte[] getData() {
            return this.data;
        }

        public java.lang.String getNewData() {
            return this.newData;
        }

        public void setData(byte[] bArr) {
            this.data = bArr;
        }

        public void setNewData(java.lang.String str) {
            this.newData = str;
        }
    }

    public WXPCommReqResp(byte[] bArr, java.lang.String str, int i17, int i18, int i19, boolean z17, int i27, int i28, java.lang.String str2, com.tencent.kinda.gen.KNetworkMockManager kNetworkMockManager) {
        this.req = null;
        this.resp = null;
        this.requestWrapper = new com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPRequestWrapper(bArr);
        this.req = new com.tencent.kinda.framework.module.impl.WXPCommReqResp.Req(this.requestWrapper, i17, i18, z17, i27, i28, str2);
        this.resp = new com.tencent.kinda.framework.module.impl.WXPCommReqResp.Resp(this.responseWrapper, i19, z17);
        this.uri = str;
        this.funcId = i17;
        this.m_mockMgr = new java.lang.ref.WeakReference<>(kNetworkMockManager);
        if (i27 == 0) {
            setIsUserCmd(true);
        }
    }

    public void addNewExtFlag(int i17) {
        this.newExtFlag = i17 | this.newExtFlag;
    }

    public void clearNewExtFlag() {
        this.newExtFlag = 0;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getNewExtFlags() {
        return this.newExtFlag;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return this.option;
    }

    public final int getReqCmdId() {
        return this.req.cmdId;
    }

    public final com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPRequestWrapper getRequestProtoBuf() {
        return this.req.rImpl;
    }

    public final int getRespCmdId() {
        return this.resp.cmdId;
    }

    public final com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPResponseWrapper getResponseProtoBuf() {
        return this.resp.rImpl;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public byte[] getTransHeader() {
        return this.transferHeader;
    }

    @Override // com.tencent.mm.network.v0
    public final int getType() {
        return this.funcId;
    }

    @Override // com.tencent.mm.network.v0
    public final java.lang.String getUri() {
        return this.uri;
    }

    public byte[] getWXPReqData() {
        return this.requestWrapper.getData();
    }

    public byte[] getWXPRespData() {
        return this.responseWrapper.getData();
    }

    public java.lang.String getWXPRespNewData() {
        return this.responseWrapper.getNewData();
    }

    public java.lang.String resp2Json(byte[] bArr) {
        java.lang.ref.WeakReference<com.tencent.kinda.gen.KNetworkMockManager> weakReference = this.m_mockMgr;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.m_mockMgr.get().responseDataToJson(bArr);
    }

    public void setOptions(int i17) {
        this.option = i17;
    }

    public void setRsaInfo(o45.pi piVar) {
        this.req.setRsaInfo(piVar);
    }

    public void setTransferHeader(byte[] bArr) {
        this.transferHeader = bArr;
    }

    public void setUri(java.lang.String str) {
        this.uri = str;
    }

    public void setWXPReqData(byte[] bArr) {
        this.requestWrapper.setData(bArr);
    }

    public void setWXPRespData(byte[] bArr) {
        this.responseWrapper.setData(bArr);
    }

    public void setWXPRespNewData(java.lang.String str) {
        this.responseWrapper.setNewData(str);
        java.lang.ref.WeakReference<com.tencent.kinda.gen.KNetworkMockManager> weakReference = this.m_mockMgr;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        setWXPRespData(this.m_mockMgr.get().jsonToResponseData(str));
    }

    @Override // com.tencent.mm.modelbase.k1
    public final com.tencent.kinda.framework.module.impl.WXPCommReqResp.Req getReqObjImp() {
        return this.req;
    }

    @Override // com.tencent.mm.network.v0
    public final com.tencent.kinda.framework.module.impl.WXPCommReqResp.Resp getRespObj() {
        return this.resp;
    }

    /* loaded from: classes12.dex */
    public static final class Req extends o45.zg implements o45.xg {
        private int cmdId;
        private int funcId;
        private boolean needHeader;
        private com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPRequestWrapper rImpl;

        public Req(com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPRequestWrapper wXPRequestWrapper, int i17, int i18, boolean z17) {
            this.rImpl = wXPRequestWrapper;
            this.funcId = i17;
            this.cmdId = i18;
            this.needHeader = z17;
        }

        @Override // o45.zg
        public int getCmdId() {
            return this.cmdId;
        }

        @Override // o45.xg
        public int getFuncId() {
            return this.funcId;
        }

        public com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPRequestWrapper getImpl() {
            return this.rImpl;
        }

        @Override // o45.xg
        public byte[] toProtoBuf() {
            return this.rImpl.getData();
        }

        public Req(com.tencent.kinda.framework.module.impl.WXPCommReqResp.WXPRequestWrapper wXPRequestWrapper, int i17, int i18, boolean z17, int i19, int i27, java.lang.String str) {
            this.rImpl = wXPRequestWrapper;
            this.funcId = i17;
            this.cmdId = i18;
            this.needHeader = z17;
            setRouteInfo(com.tencent.mm.sdk.platformtools.t8.P(str, 0));
        }
    }
}
