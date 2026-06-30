package com.tencent.ilink.network;

/* loaded from: classes8.dex */
public class H5TransferRouteItem extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.H5TransferRouteItem DEFAULT_INSTANCE = new com.tencent.ilink.network.H5TransferRouteItem();
    private int biz_cgi_cmdid;
    private java.lang.String biz_cgi_url;
    private final boolean[] hasSetFields = new boolean[6];
    private int transfer_cgi_cmdid;
    private java.lang.String transfer_cgi_url;
    private com.tencent.ilink.network.H5TransferReqType transfer_req_type;

    public static com.tencent.ilink.network.H5TransferRouteItem create() {
        return new com.tencent.ilink.network.H5TransferRouteItem();
    }

    public static com.tencent.ilink.network.H5TransferRouteItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.H5TransferRouteItem newBuilder() {
        return new com.tencent.ilink.network.H5TransferRouteItem();
    }

    public com.tencent.ilink.network.H5TransferRouteItem build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.H5TransferRouteItem)) {
            return false;
        }
        com.tencent.ilink.network.H5TransferRouteItem h5TransferRouteItem = (com.tencent.ilink.network.H5TransferRouteItem) fVar;
        return n51.f.a(this.biz_cgi_url, h5TransferRouteItem.biz_cgi_url) && n51.f.a(java.lang.Integer.valueOf(this.biz_cgi_cmdid), java.lang.Integer.valueOf(h5TransferRouteItem.biz_cgi_cmdid)) && n51.f.a(this.transfer_cgi_url, h5TransferRouteItem.transfer_cgi_url) && n51.f.a(java.lang.Integer.valueOf(this.transfer_cgi_cmdid), java.lang.Integer.valueOf(h5TransferRouteItem.transfer_cgi_cmdid)) && n51.f.a(this.transfer_req_type, h5TransferRouteItem.transfer_req_type);
    }

    public int getBizCgiCmdid() {
        return this.biz_cgi_cmdid;
    }

    public java.lang.String getBizCgiUrl() {
        return this.hasSetFields[1] ? this.biz_cgi_url : "";
    }

    public int getTransferCgiCmdid() {
        return this.transfer_cgi_cmdid;
    }

    public java.lang.String getTransferCgiUrl() {
        return this.hasSetFields[3] ? this.transfer_cgi_url : "";
    }

    public com.tencent.ilink.network.H5TransferReqType getTransferReqType() {
        return this.hasSetFields[5] ? this.transfer_req_type : com.tencent.ilink.network.H5TransferReqType.kH5TransferReqType_UnKnown;
    }

    public boolean hasBizCgiCmdid() {
        return hasFieldNumber(2);
    }

    public boolean hasBizCgiUrl() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasTransferCgiCmdid() {
        return hasFieldNumber(4);
    }

    public boolean hasTransferCgiUrl() {
        return hasFieldNumber(3);
    }

    public boolean hasTransferReqType() {
        return hasFieldNumber(5);
    }

    public com.tencent.ilink.network.H5TransferRouteItem mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.H5TransferRouteItem();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.biz_cgi_url;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.biz_cgi_cmdid);
            }
            java.lang.String str2 = this.transfer_cgi_url;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.transfer_cgi_cmdid);
            }
            com.tencent.ilink.network.H5TransferReqType h5TransferReqType = this.transfer_req_type;
            if (h5TransferReqType != null && this.hasSetFields[5]) {
                fVar.e(5, h5TransferReqType.value);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.biz_cgi_url;
            if (str3 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.biz_cgi_cmdid);
            }
            java.lang.String str4 = this.transfer_cgi_url;
            if (str4 != null && this.hasSetFields[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.e(4, this.transfer_cgi_cmdid);
            }
            com.tencent.ilink.network.H5TransferReqType h5TransferReqType2 = this.transfer_req_type;
            return (h5TransferReqType2 == null || !this.hasSetFields[5]) ? i18 : i18 + b36.f.e(5, h5TransferReqType2.value);
        }
        if (i17 == 2) {
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
        if (intValue == 1) {
            this.biz_cgi_url = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.biz_cgi_cmdid = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.transfer_cgi_url = aVar2.k(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.transfer_cgi_cmdid = aVar2.g(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.transfer_req_type = com.tencent.ilink.network.H5TransferReqType.forNumber(aVar2.g(intValue));
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.ilink.network.H5TransferRouteItem setBizCgiCmdid(int i17) {
        this.biz_cgi_cmdid = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.H5TransferRouteItem setBizCgiUrl(java.lang.String str) {
        this.biz_cgi_url = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.H5TransferRouteItem setTransferCgiCmdid(int i17) {
        this.transfer_cgi_cmdid = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.H5TransferRouteItem setTransferCgiUrl(java.lang.String str) {
        this.transfer_cgi_url = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.H5TransferRouteItem setTransferReqType(com.tencent.ilink.network.H5TransferReqType h5TransferReqType) {
        this.transfer_req_type = h5TransferReqType;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.H5TransferRouteItem mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.H5TransferRouteItem parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.H5TransferRouteItem) super.parseFrom(bArr);
    }
}
