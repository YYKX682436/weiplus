package com.tencent.ilink.network;

/* loaded from: classes8.dex */
public class IlinkAppGetSessionInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkAppGetSessionInfo DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkAppGetSessionInfo();
    private com.tencent.mm.protobuf.g client_session_key;
    private com.tencent.mm.protobuf.g cookie;
    private com.tencent.ilink.network.H5TransferRouteInfo h5_transfer_route_info;
    private final boolean[] hasSetFields = new boolean[8];
    private long real_uin;
    private com.tencent.mm.protobuf.g server_session_key;
    private com.tencent.mm.protobuf.g serverid;
    private long show_uin;

    public static com.tencent.ilink.network.IlinkAppGetSessionInfo create() {
        return new com.tencent.ilink.network.IlinkAppGetSessionInfo();
    }

    public static com.tencent.ilink.network.IlinkAppGetSessionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkAppGetSessionInfo newBuilder() {
        return new com.tencent.ilink.network.IlinkAppGetSessionInfo();
    }

    public com.tencent.ilink.network.IlinkAppGetSessionInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkAppGetSessionInfo)) {
            return false;
        }
        com.tencent.ilink.network.IlinkAppGetSessionInfo ilinkAppGetSessionInfo = (com.tencent.ilink.network.IlinkAppGetSessionInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.real_uin), java.lang.Long.valueOf(ilinkAppGetSessionInfo.real_uin)) && n51.f.a(java.lang.Long.valueOf(this.show_uin), java.lang.Long.valueOf(ilinkAppGetSessionInfo.show_uin)) && n51.f.a(this.client_session_key, ilinkAppGetSessionInfo.client_session_key) && n51.f.a(this.server_session_key, ilinkAppGetSessionInfo.server_session_key) && n51.f.a(this.serverid, ilinkAppGetSessionInfo.serverid) && n51.f.a(this.cookie, ilinkAppGetSessionInfo.cookie) && n51.f.a(this.h5_transfer_route_info, ilinkAppGetSessionInfo.h5_transfer_route_info);
    }

    public com.tencent.mm.protobuf.g getClientSessionKey() {
        return this.hasSetFields[3] ? this.client_session_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getCookie() {
        return this.hasSetFields[6] ? this.cookie : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.network.H5TransferRouteInfo getH5TransferRouteInfo() {
        return this.hasSetFields[7] ? this.h5_transfer_route_info : com.tencent.ilink.network.H5TransferRouteInfo.create();
    }

    public long getRealUin() {
        return this.real_uin;
    }

    public com.tencent.mm.protobuf.g getServerSessionKey() {
        return this.hasSetFields[4] ? this.server_session_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getServerid() {
        return this.hasSetFields[5] ? this.serverid : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getShowUin() {
        return this.show_uin;
    }

    public boolean hasClientSessionKey() {
        return hasFieldNumber(3);
    }

    public boolean hasCookie() {
        return hasFieldNumber(6);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasH5TransferRouteInfo() {
        return hasFieldNumber(7);
    }

    public boolean hasRealUin() {
        return hasFieldNumber(1);
    }

    public boolean hasServerSessionKey() {
        return hasFieldNumber(4);
    }

    public boolean hasServerid() {
        return hasFieldNumber(5);
    }

    public boolean hasShowUin() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.network.IlinkAppGetSessionInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkAppGetSessionInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.real_uin);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.show_uin);
            }
            com.tencent.mm.protobuf.g gVar = this.client_session_key;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.server_session_key;
            if (gVar2 != null && this.hasSetFields[4]) {
                fVar.b(4, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.serverid;
            if (gVar3 != null && this.hasSetFields[5]) {
                fVar.b(5, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.cookie;
            if (gVar4 != null && this.hasSetFields[6]) {
                fVar.b(6, gVar4);
            }
            com.tencent.ilink.network.H5TransferRouteInfo h5TransferRouteInfo = this.h5_transfer_route_info;
            if (h5TransferRouteInfo != null && this.hasSetFields[7]) {
                fVar.i(7, h5TransferRouteInfo.computeSize());
                this.h5_transfer_route_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? 0 + b36.f.h(1, this.real_uin) : 0;
            if (this.hasSetFields[2]) {
                h17 += b36.f.h(2, this.show_uin);
            }
            com.tencent.mm.protobuf.g gVar5 = this.client_session_key;
            if (gVar5 != null && this.hasSetFields[3]) {
                h17 += b36.f.b(3, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.server_session_key;
            if (gVar6 != null && this.hasSetFields[4]) {
                h17 += b36.f.b(4, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.serverid;
            if (gVar7 != null && this.hasSetFields[5]) {
                h17 += b36.f.b(5, gVar7);
            }
            com.tencent.mm.protobuf.g gVar8 = this.cookie;
            if (gVar8 != null && this.hasSetFields[6]) {
                h17 += b36.f.b(6, gVar8);
            }
            com.tencent.ilink.network.H5TransferRouteInfo h5TransferRouteInfo2 = this.h5_transfer_route_info;
            return (h5TransferRouteInfo2 == null || !this.hasSetFields[7]) ? h17 : h17 + b36.f.i(7, h5TransferRouteInfo2.computeSize());
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
                this.real_uin = aVar2.i(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.show_uin = aVar2.i(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.client_session_key = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.server_session_key = aVar2.d(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.serverid = aVar2.d(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.cookie = aVar2.d(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
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

    public com.tencent.ilink.network.IlinkAppGetSessionInfo setClientSessionKey(com.tencent.mm.protobuf.g gVar) {
        this.client_session_key = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppGetSessionInfo setCookie(com.tencent.mm.protobuf.g gVar) {
        this.cookie = gVar;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppGetSessionInfo setH5TransferRouteInfo(com.tencent.ilink.network.H5TransferRouteInfo h5TransferRouteInfo) {
        this.h5_transfer_route_info = h5TransferRouteInfo;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppGetSessionInfo setRealUin(long j17) {
        this.real_uin = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppGetSessionInfo setServerSessionKey(com.tencent.mm.protobuf.g gVar) {
        this.server_session_key = gVar;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppGetSessionInfo setServerid(com.tencent.mm.protobuf.g gVar) {
        this.serverid = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppGetSessionInfo setShowUin(long j17) {
        this.show_uin = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppGetSessionInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkAppGetSessionInfo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkAppGetSessionInfo) super.parseFrom(bArr);
    }
}
