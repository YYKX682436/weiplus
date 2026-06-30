package com.tencent.ilink.network;

/* loaded from: classes8.dex */
public class IlinkAppCommSessionInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkAppCommSessionInfo DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkAppCommSessionInfo();
    private com.tencent.ilink.network.IlinkAppAuthFlag auth_flag;
    private com.tencent.mm.protobuf.g autoauth_enc_key;
    private com.tencent.mm.protobuf.g client_session_key;
    private com.tencent.ilink.network.H5TransferRouteInfo h5_transfer_route_info;
    private final boolean[] hasSetFields = new boolean[8];
    private com.tencent.mm.protobuf.g server_session_key;
    private com.tencent.mm.protobuf.g serverid;
    private long uin;

    public static com.tencent.ilink.network.IlinkAppCommSessionInfo create() {
        return new com.tencent.ilink.network.IlinkAppCommSessionInfo();
    }

    public static com.tencent.ilink.network.IlinkAppCommSessionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkAppCommSessionInfo newBuilder() {
        return new com.tencent.ilink.network.IlinkAppCommSessionInfo();
    }

    public com.tencent.ilink.network.IlinkAppCommSessionInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkAppCommSessionInfo)) {
            return false;
        }
        com.tencent.ilink.network.IlinkAppCommSessionInfo ilinkAppCommSessionInfo = (com.tencent.ilink.network.IlinkAppCommSessionInfo) fVar;
        return n51.f.a(this.client_session_key, ilinkAppCommSessionInfo.client_session_key) && n51.f.a(this.server_session_key, ilinkAppCommSessionInfo.server_session_key) && n51.f.a(this.autoauth_enc_key, ilinkAppCommSessionInfo.autoauth_enc_key) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(ilinkAppCommSessionInfo.uin)) && n51.f.a(this.serverid, ilinkAppCommSessionInfo.serverid) && n51.f.a(this.auth_flag, ilinkAppCommSessionInfo.auth_flag) && n51.f.a(this.h5_transfer_route_info, ilinkAppCommSessionInfo.h5_transfer_route_info);
    }

    public com.tencent.ilink.network.IlinkAppAuthFlag getAuthFlag() {
        return this.hasSetFields[6] ? this.auth_flag : com.tencent.ilink.network.IlinkAppAuthFlag.kIlinkAppNoSessionEncrypt;
    }

    public com.tencent.mm.protobuf.g getAutoauthEncKey() {
        return this.hasSetFields[3] ? this.autoauth_enc_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getClientSessionKey() {
        return this.hasSetFields[1] ? this.client_session_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.network.H5TransferRouteInfo getH5TransferRouteInfo() {
        return this.hasSetFields[7] ? this.h5_transfer_route_info : com.tencent.ilink.network.H5TransferRouteInfo.create();
    }

    public com.tencent.mm.protobuf.g getServerSessionKey() {
        return this.hasSetFields[2] ? this.server_session_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getServerid() {
        return this.hasSetFields[5] ? this.serverid : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getUin() {
        return this.uin;
    }

    public boolean hasAuthFlag() {
        return hasFieldNumber(6);
    }

    public boolean hasAutoauthEncKey() {
        return hasFieldNumber(3);
    }

    public boolean hasClientSessionKey() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasH5TransferRouteInfo() {
        return hasFieldNumber(7);
    }

    public boolean hasServerSessionKey() {
        return hasFieldNumber(2);
    }

    public boolean hasServerid() {
        return hasFieldNumber(5);
    }

    public boolean hasUin() {
        return hasFieldNumber(4);
    }

    public com.tencent.ilink.network.IlinkAppCommSessionInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkAppCommSessionInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.client_session_key;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.server_session_key;
            if (gVar2 != null && this.hasSetFields[2]) {
                fVar.b(2, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.autoauth_enc_key;
            if (gVar3 != null && this.hasSetFields[3]) {
                fVar.b(3, gVar3);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.uin);
            }
            com.tencent.mm.protobuf.g gVar4 = this.serverid;
            if (gVar4 != null && this.hasSetFields[5]) {
                fVar.b(5, gVar4);
            }
            com.tencent.ilink.network.IlinkAppAuthFlag ilinkAppAuthFlag = this.auth_flag;
            if (ilinkAppAuthFlag != null && this.hasSetFields[6]) {
                fVar.e(6, ilinkAppAuthFlag.value);
            }
            com.tencent.ilink.network.H5TransferRouteInfo h5TransferRouteInfo = this.h5_transfer_route_info;
            if (h5TransferRouteInfo != null && this.hasSetFields[7]) {
                fVar.i(7, h5TransferRouteInfo.computeSize());
                this.h5_transfer_route_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar5 = this.client_session_key;
            if (gVar5 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.server_session_key;
            if (gVar6 != null && this.hasSetFields[2]) {
                i18 += b36.f.b(2, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.autoauth_enc_key;
            if (gVar7 != null && this.hasSetFields[3]) {
                i18 += b36.f.b(3, gVar7);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.h(4, this.uin);
            }
            com.tencent.mm.protobuf.g gVar8 = this.serverid;
            if (gVar8 != null && this.hasSetFields[5]) {
                i18 += b36.f.b(5, gVar8);
            }
            com.tencent.ilink.network.IlinkAppAuthFlag ilinkAppAuthFlag2 = this.auth_flag;
            if (ilinkAppAuthFlag2 != null && this.hasSetFields[6]) {
                i18 += b36.f.e(6, ilinkAppAuthFlag2.value);
            }
            com.tencent.ilink.network.H5TransferRouteInfo h5TransferRouteInfo2 = this.h5_transfer_route_info;
            return (h5TransferRouteInfo2 == null || !this.hasSetFields[7]) ? i18 : i18 + b36.f.i(7, h5TransferRouteInfo2.computeSize());
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
        switch (intValue) {
            case 1:
                this.client_session_key = aVar2.d(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.server_session_key = aVar2.d(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.autoauth_enc_key = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.uin = aVar2.i(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.serverid = aVar2.d(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.auth_flag = com.tencent.ilink.network.IlinkAppAuthFlag.forNumber(aVar2.g(intValue));
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.ilink.network.H5TransferRouteInfo h5TransferRouteInfo3 = new com.tencent.ilink.network.H5TransferRouteInfo();
                    if (bArr != null && bArr.length > 0) {
                        h5TransferRouteInfo3.parseFrom(bArr);
                    }
                    this.h5_transfer_route_info = h5TransferRouteInfo3;
                }
                this.hasSetFields[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.network.IlinkAppCommSessionInfo setAuthFlag(com.tencent.ilink.network.IlinkAppAuthFlag ilinkAppAuthFlag) {
        this.auth_flag = ilinkAppAuthFlag;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppCommSessionInfo setAutoauthEncKey(com.tencent.mm.protobuf.g gVar) {
        this.autoauth_enc_key = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppCommSessionInfo setClientSessionKey(com.tencent.mm.protobuf.g gVar) {
        this.client_session_key = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppCommSessionInfo setH5TransferRouteInfo(com.tencent.ilink.network.H5TransferRouteInfo h5TransferRouteInfo) {
        this.h5_transfer_route_info = h5TransferRouteInfo;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppCommSessionInfo setServerSessionKey(com.tencent.mm.protobuf.g gVar) {
        this.server_session_key = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppCommSessionInfo setServerid(com.tencent.mm.protobuf.g gVar) {
        this.serverid = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppCommSessionInfo setUin(long j17) {
        this.uin = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppCommSessionInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkAppCommSessionInfo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkAppCommSessionInfo) super.parseFrom(bArr);
    }
}
