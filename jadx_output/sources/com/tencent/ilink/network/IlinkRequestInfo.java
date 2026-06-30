package com.tencent.ilink.network;

/* loaded from: classes15.dex */
public class IlinkRequestInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkRequestInfo DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkRequestInfo();
    private java.lang.String auth_h5_url;
    private com.tencent.mm.protobuf.g body;
    private int cgi_method;
    private com.tencent.ilink.network.IlinkReqCGIType cgi_type;
    private int cmdid;
    private com.tencent.ilink.network.IlinkContentType content_type;
    private com.tencent.ilink.network.IlinkCryptoAlgo crypto_algo;
    private boolean limit_flow;
    private boolean limit_frequency;
    private boolean long_polling;
    private int long_polling_timeout;
    private com.tencent.ilink.network.IlinkNetType net_type;
    private boolean network_status_sensitive;
    private int retry_count;
    private int timeout_ms;
    private java.lang.String url;
    private com.tencent.ilink.network.IlinkNetworkType use_network_type;
    private java.util.LinkedList<com.tencent.ilink.network.HttpHeader> cgi_header = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[19];

    public static com.tencent.ilink.network.IlinkRequestInfo create() {
        return new com.tencent.ilink.network.IlinkRequestInfo();
    }

    public static com.tencent.ilink.network.IlinkRequestInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkRequestInfo newBuilder() {
        return new com.tencent.ilink.network.IlinkRequestInfo();
    }

    public com.tencent.ilink.network.IlinkRequestInfo addAllElementCgiHeader(java.util.Collection<com.tencent.ilink.network.HttpHeader> collection) {
        this.cgi_header.addAll(collection);
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo addElementCgiHeader(com.tencent.ilink.network.HttpHeader httpHeader) {
        this.cgi_header.add(httpHeader);
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkRequestInfo)) {
            return false;
        }
        com.tencent.ilink.network.IlinkRequestInfo ilinkRequestInfo = (com.tencent.ilink.network.IlinkRequestInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.cmdid), java.lang.Integer.valueOf(ilinkRequestInfo.cmdid)) && n51.f.a(this.url, ilinkRequestInfo.url) && n51.f.a(this.body, ilinkRequestInfo.body) && n51.f.a(java.lang.Integer.valueOf(this.timeout_ms), java.lang.Integer.valueOf(ilinkRequestInfo.timeout_ms)) && n51.f.a(java.lang.Integer.valueOf(this.retry_count), java.lang.Integer.valueOf(ilinkRequestInfo.retry_count)) && n51.f.a(this.net_type, ilinkRequestInfo.net_type) && n51.f.a(this.crypto_algo, ilinkRequestInfo.crypto_algo) && n51.f.a(java.lang.Boolean.valueOf(this.limit_flow), java.lang.Boolean.valueOf(ilinkRequestInfo.limit_flow)) && n51.f.a(java.lang.Boolean.valueOf(this.limit_frequency), java.lang.Boolean.valueOf(ilinkRequestInfo.limit_frequency)) && n51.f.a(java.lang.Boolean.valueOf(this.long_polling), java.lang.Boolean.valueOf(ilinkRequestInfo.long_polling)) && n51.f.a(java.lang.Integer.valueOf(this.long_polling_timeout), java.lang.Integer.valueOf(ilinkRequestInfo.long_polling_timeout)) && n51.f.a(this.content_type, ilinkRequestInfo.content_type) && n51.f.a(java.lang.Boolean.valueOf(this.network_status_sensitive), java.lang.Boolean.valueOf(ilinkRequestInfo.network_status_sensitive)) && n51.f.a(this.cgi_type, ilinkRequestInfo.cgi_type) && n51.f.a(this.cgi_header, ilinkRequestInfo.cgi_header) && n51.f.a(java.lang.Integer.valueOf(this.cgi_method), java.lang.Integer.valueOf(ilinkRequestInfo.cgi_method)) && n51.f.a(this.auth_h5_url, ilinkRequestInfo.auth_h5_url) && n51.f.a(this.use_network_type, ilinkRequestInfo.use_network_type);
    }

    public java.lang.String getAuthH5Url() {
        return this.hasSetFields[17] ? this.auth_h5_url : "";
    }

    public com.tencent.mm.protobuf.g getBody() {
        return this.hasSetFields[3] ? this.body : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.util.LinkedList<com.tencent.ilink.network.HttpHeader> getCgiHeader() {
        return this.cgi_header;
    }

    public int getCgiMethod() {
        return this.cgi_method;
    }

    public com.tencent.ilink.network.IlinkReqCGIType getCgiType() {
        return this.hasSetFields[14] ? this.cgi_type : com.tencent.ilink.network.IlinkReqCGIType.kIlinkCGITypeDirect;
    }

    public int getCmdid() {
        return this.cmdid;
    }

    public com.tencent.ilink.network.IlinkContentType getContentType() {
        return this.hasSetFields[12] ? this.content_type : com.tencent.ilink.network.IlinkContentType.kIlinkContentTypeDefault;
    }

    public com.tencent.ilink.network.IlinkCryptoAlgo getCryptoAlgo() {
        return this.hasSetFields[7] ? this.crypto_algo : com.tencent.ilink.network.IlinkCryptoAlgo.kIlinkNoCrypto;
    }

    public boolean getLimitFlow() {
        return this.limit_flow;
    }

    public boolean getLimitFrequency() {
        return this.limit_frequency;
    }

    public boolean getLongPolling() {
        return this.long_polling;
    }

    public int getLongPollingTimeout() {
        return this.long_polling_timeout;
    }

    public com.tencent.ilink.network.IlinkNetType getNetType() {
        return this.hasSetFields[6] ? this.net_type : com.tencent.ilink.network.IlinkNetType.kIlinkShortlink;
    }

    public boolean getNetworkStatusSensitive() {
        return this.network_status_sensitive;
    }

    public int getRetryCount() {
        return this.retry_count;
    }

    public int getTimeoutMs() {
        return this.timeout_ms;
    }

    public java.lang.String getUrl() {
        return this.hasSetFields[2] ? this.url : "";
    }

    public com.tencent.ilink.network.IlinkNetworkType getUseNetworkType() {
        return this.hasSetFields[18] ? this.use_network_type : com.tencent.ilink.network.IlinkNetworkType.kIlinkNetworkTypeDefault;
    }

    public boolean hasAuthH5Url() {
        return hasFieldNumber(17);
    }

    public boolean hasBody() {
        return hasFieldNumber(3);
    }

    public boolean hasCgiHeader() {
        return hasFieldNumber(15);
    }

    public boolean hasCgiMethod() {
        return hasFieldNumber(16);
    }

    public boolean hasCgiType() {
        return hasFieldNumber(14);
    }

    public boolean hasCmdid() {
        return hasFieldNumber(1);
    }

    public boolean hasContentType() {
        return hasFieldNumber(12);
    }

    public boolean hasCryptoAlgo() {
        return hasFieldNumber(7);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLimitFlow() {
        return hasFieldNumber(8);
    }

    public boolean hasLimitFrequency() {
        return hasFieldNumber(9);
    }

    public boolean hasLongPolling() {
        return hasFieldNumber(10);
    }

    public boolean hasLongPollingTimeout() {
        return hasFieldNumber(11);
    }

    public boolean hasNetType() {
        return hasFieldNumber(6);
    }

    public boolean hasNetworkStatusSensitive() {
        return hasFieldNumber(13);
    }

    public boolean hasRetryCount() {
        return hasFieldNumber(5);
    }

    public boolean hasTimeoutMs() {
        return hasFieldNumber(4);
    }

    public boolean hasUrl() {
        return hasFieldNumber(2);
    }

    public boolean hasUseNetworkType() {
        return hasFieldNumber(18);
    }

    public com.tencent.ilink.network.IlinkRequestInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkRequestInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.cmdid);
            }
            java.lang.String str = this.url;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.body;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.timeout_ms);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.retry_count);
            }
            com.tencent.ilink.network.IlinkNetType ilinkNetType = this.net_type;
            if (ilinkNetType != null && this.hasSetFields[6]) {
                fVar.e(6, ilinkNetType.value);
            }
            com.tencent.ilink.network.IlinkCryptoAlgo ilinkCryptoAlgo = this.crypto_algo;
            if (ilinkCryptoAlgo != null && this.hasSetFields[7]) {
                fVar.e(7, ilinkCryptoAlgo.value);
            }
            if (this.hasSetFields[8]) {
                fVar.a(8, this.limit_flow);
            }
            if (this.hasSetFields[9]) {
                fVar.a(9, this.limit_frequency);
            }
            if (this.hasSetFields[10]) {
                fVar.a(10, this.long_polling);
            }
            if (this.hasSetFields[11]) {
                fVar.e(11, this.long_polling_timeout);
            }
            com.tencent.ilink.network.IlinkContentType ilinkContentType = this.content_type;
            if (ilinkContentType != null && this.hasSetFields[12]) {
                fVar.e(12, ilinkContentType.value);
            }
            if (this.hasSetFields[13]) {
                fVar.a(13, this.network_status_sensitive);
            }
            com.tencent.ilink.network.IlinkReqCGIType ilinkReqCGIType = this.cgi_type;
            if (ilinkReqCGIType != null && this.hasSetFields[14]) {
                fVar.e(14, ilinkReqCGIType.value);
            }
            fVar.g(15, 8, this.cgi_header);
            if (this.hasSetFields[16]) {
                fVar.e(16, this.cgi_method);
            }
            java.lang.String str2 = this.auth_h5_url;
            if (str2 != null && this.hasSetFields[17]) {
                fVar.j(17, str2);
            }
            com.tencent.ilink.network.IlinkNetworkType ilinkNetworkType = this.use_network_type;
            if (ilinkNetworkType != null && this.hasSetFields[18]) {
                fVar.e(18, ilinkNetworkType.value);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? b36.f.e(1, this.cmdid) + 0 : 0;
            java.lang.String str3 = this.url;
            if (str3 != null && this.hasSetFields[2]) {
                e17 += b36.f.j(2, str3);
            }
            com.tencent.mm.protobuf.g gVar2 = this.body;
            if (gVar2 != null && this.hasSetFields[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.e(4, this.timeout_ms);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.e(5, this.retry_count);
            }
            com.tencent.ilink.network.IlinkNetType ilinkNetType2 = this.net_type;
            if (ilinkNetType2 != null && this.hasSetFields[6]) {
                e17 += b36.f.e(6, ilinkNetType2.value);
            }
            com.tencent.ilink.network.IlinkCryptoAlgo ilinkCryptoAlgo2 = this.crypto_algo;
            if (ilinkCryptoAlgo2 != null && this.hasSetFields[7]) {
                e17 += b36.f.e(7, ilinkCryptoAlgo2.value);
            }
            if (this.hasSetFields[8]) {
                e17 += b36.f.a(8, this.limit_flow);
            }
            if (this.hasSetFields[9]) {
                e17 += b36.f.a(9, this.limit_frequency);
            }
            if (this.hasSetFields[10]) {
                e17 += b36.f.a(10, this.long_polling);
            }
            if (this.hasSetFields[11]) {
                e17 += b36.f.e(11, this.long_polling_timeout);
            }
            com.tencent.ilink.network.IlinkContentType ilinkContentType2 = this.content_type;
            if (ilinkContentType2 != null && this.hasSetFields[12]) {
                e17 += b36.f.e(12, ilinkContentType2.value);
            }
            if (this.hasSetFields[13]) {
                e17 += b36.f.a(13, this.network_status_sensitive);
            }
            com.tencent.ilink.network.IlinkReqCGIType ilinkReqCGIType2 = this.cgi_type;
            if (ilinkReqCGIType2 != null && this.hasSetFields[14]) {
                e17 += b36.f.e(14, ilinkReqCGIType2.value);
            }
            int g17 = e17 + b36.f.g(15, 8, this.cgi_header);
            if (this.hasSetFields[16]) {
                g17 += b36.f.e(16, this.cgi_method);
            }
            java.lang.String str4 = this.auth_h5_url;
            if (str4 != null && this.hasSetFields[17]) {
                g17 += b36.f.j(17, str4);
            }
            com.tencent.ilink.network.IlinkNetworkType ilinkNetworkType2 = this.use_network_type;
            return (ilinkNetworkType2 == null || !this.hasSetFields[18]) ? g17 : g17 + b36.f.e(18, ilinkNetworkType2.value);
        }
        if (i17 == 2) {
            this.cgi_header.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.cmdid = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.url = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.body = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.timeout_ms = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.retry_count = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.net_type = com.tencent.ilink.network.IlinkNetType.forNumber(aVar2.g(intValue));
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.crypto_algo = com.tencent.ilink.network.IlinkCryptoAlgo.forNumber(aVar2.g(intValue));
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.limit_flow = aVar2.c(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.limit_frequency = aVar2.c(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.long_polling = aVar2.c(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.long_polling_timeout = aVar2.g(intValue);
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                this.content_type = com.tencent.ilink.network.IlinkContentType.forNumber(aVar2.g(intValue));
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                this.network_status_sensitive = aVar2.c(intValue);
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.cgi_type = com.tencent.ilink.network.IlinkReqCGIType.forNumber(aVar2.g(intValue));
                this.hasSetFields[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.ilink.network.HttpHeader httpHeader = new com.tencent.ilink.network.HttpHeader();
                    if (bArr != null && bArr.length > 0) {
                        httpHeader.parseFrom(bArr);
                    }
                    this.cgi_header.add(httpHeader);
                }
                this.hasSetFields[15] = true;
                return 0;
            case 16:
                this.cgi_method = aVar2.g(intValue);
                this.hasSetFields[16] = true;
                return 0;
            case 17:
                this.auth_h5_url = aVar2.k(intValue);
                this.hasSetFields[17] = true;
                return 0;
            case 18:
                this.use_network_type = com.tencent.ilink.network.IlinkNetworkType.forNumber(aVar2.g(intValue));
                this.hasSetFields[18] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.network.IlinkRequestInfo setAuthH5Url(java.lang.String str) {
        this.auth_h5_url = str;
        this.hasSetFields[17] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setBody(com.tencent.mm.protobuf.g gVar) {
        this.body = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setCgiHeader(java.util.LinkedList<com.tencent.ilink.network.HttpHeader> linkedList) {
        this.cgi_header = linkedList;
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setCgiMethod(int i17) {
        this.cgi_method = i17;
        this.hasSetFields[16] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setCgiType(com.tencent.ilink.network.IlinkReqCGIType ilinkReqCGIType) {
        this.cgi_type = ilinkReqCGIType;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setCmdid(int i17) {
        this.cmdid = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setContentType(com.tencent.ilink.network.IlinkContentType ilinkContentType) {
        this.content_type = ilinkContentType;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setCryptoAlgo(com.tencent.ilink.network.IlinkCryptoAlgo ilinkCryptoAlgo) {
        this.crypto_algo = ilinkCryptoAlgo;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setLimitFlow(boolean z17) {
        this.limit_flow = z17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setLimitFrequency(boolean z17) {
        this.limit_frequency = z17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setLongPolling(boolean z17) {
        this.long_polling = z17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setLongPollingTimeout(int i17) {
        this.long_polling_timeout = i17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setNetType(com.tencent.ilink.network.IlinkNetType ilinkNetType) {
        this.net_type = ilinkNetType;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setNetworkStatusSensitive(boolean z17) {
        this.network_status_sensitive = z17;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setRetryCount(int i17) {
        this.retry_count = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setTimeoutMs(int i17) {
        this.timeout_ms = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setUrl(java.lang.String str) {
        this.url = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo setUseNetworkType(com.tencent.ilink.network.IlinkNetworkType ilinkNetworkType) {
        this.use_network_type = ilinkNetworkType;
        this.hasSetFields[18] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkRequestInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkRequestInfo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkRequestInfo) super.parseFrom(bArr);
    }
}
