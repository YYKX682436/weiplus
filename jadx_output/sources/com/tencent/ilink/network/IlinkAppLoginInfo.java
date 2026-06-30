package com.tencent.ilink.network;

/* loaded from: classes8.dex */
public class IlinkAppLoginInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkAppLoginInfo DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkAppLoginInfo();
    private com.tencent.mm.protobuf.g auth_code;
    private java.lang.String client_info;
    private final boolean[] hasSetFields = new boolean[5];
    private int session_module_type;
    private int session_type;

    public static com.tencent.ilink.network.IlinkAppLoginInfo create() {
        return new com.tencent.ilink.network.IlinkAppLoginInfo();
    }

    public static com.tencent.ilink.network.IlinkAppLoginInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkAppLoginInfo newBuilder() {
        return new com.tencent.ilink.network.IlinkAppLoginInfo();
    }

    public com.tencent.ilink.network.IlinkAppLoginInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkAppLoginInfo)) {
            return false;
        }
        com.tencent.ilink.network.IlinkAppLoginInfo ilinkAppLoginInfo = (com.tencent.ilink.network.IlinkAppLoginInfo) fVar;
        return n51.f.a(this.auth_code, ilinkAppLoginInfo.auth_code) && n51.f.a(java.lang.Integer.valueOf(this.session_type), java.lang.Integer.valueOf(ilinkAppLoginInfo.session_type)) && n51.f.a(java.lang.Integer.valueOf(this.session_module_type), java.lang.Integer.valueOf(ilinkAppLoginInfo.session_module_type)) && n51.f.a(this.client_info, ilinkAppLoginInfo.client_info);
    }

    public com.tencent.mm.protobuf.g getAuthCode() {
        return this.hasSetFields[1] ? this.auth_code : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getClientInfo() {
        return this.hasSetFields[4] ? this.client_info : "";
    }

    public int getSessionModuleType() {
        return this.session_module_type;
    }

    public int getSessionType() {
        return this.session_type;
    }

    public boolean hasAuthCode() {
        return hasFieldNumber(1);
    }

    public boolean hasClientInfo() {
        return hasFieldNumber(4);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasSessionModuleType() {
        return hasFieldNumber(3);
    }

    public boolean hasSessionType() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.network.IlinkAppLoginInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkAppLoginInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.auth_code;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.session_type);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.session_module_type);
            }
            java.lang.String str = this.client_info;
            if (str != null && this.hasSetFields[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.auth_code;
            if (gVar2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.session_type);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.e(3, this.session_module_type);
            }
            java.lang.String str2 = this.client_info;
            return (str2 == null || !this.hasSetFields[4]) ? i18 : i18 + b36.f.j(4, str2);
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
            this.auth_code = aVar2.d(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.session_type = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.session_module_type = aVar2.g(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.client_info = aVar2.k(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkAppLoginInfo setAuthCode(com.tencent.mm.protobuf.g gVar) {
        this.auth_code = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppLoginInfo setClientInfo(java.lang.String str) {
        this.client_info = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppLoginInfo setSessionModuleType(int i17) {
        this.session_module_type = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppLoginInfo setSessionType(int i17) {
        this.session_type = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkAppLoginInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkAppLoginInfo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkAppLoginInfo) super.parseFrom(bArr);
    }
}
