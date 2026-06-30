package com.tencent.ilink.auth;

/* loaded from: classes8.dex */
public class IlinkLoginRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkLoginRequest DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkLoginRequest();
    private com.tencent.mm.protobuf.g auth_code;
    private com.tencent.mm.protobuf.g business_req_buffer;
    private java.lang.String client_info;
    private int custom_auth_scene;
    private final boolean[] hasSetFields = new boolean[10];
    private com.tencent.mm.protobuf.g lkid;
    private int retry_count;
    private com.tencent.mm.protobuf.g security_info;
    private int timeout_ms;
    private com.tencent.mm.protobuf.g vendorid;

    public static com.tencent.ilink.auth.IlinkLoginRequest create() {
        return new com.tencent.ilink.auth.IlinkLoginRequest();
    }

    public static com.tencent.ilink.auth.IlinkLoginRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkLoginRequest newBuilder() {
        return new com.tencent.ilink.auth.IlinkLoginRequest();
    }

    public com.tencent.ilink.auth.IlinkLoginRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkLoginRequest)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkLoginRequest ilinkLoginRequest = (com.tencent.ilink.auth.IlinkLoginRequest) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.timeout_ms), java.lang.Integer.valueOf(ilinkLoginRequest.timeout_ms)) && n51.f.a(java.lang.Integer.valueOf(this.retry_count), java.lang.Integer.valueOf(ilinkLoginRequest.retry_count)) && n51.f.a(this.auth_code, ilinkLoginRequest.auth_code) && n51.f.a(this.vendorid, ilinkLoginRequest.vendorid) && n51.f.a(this.lkid, ilinkLoginRequest.lkid) && n51.f.a(this.security_info, ilinkLoginRequest.security_info) && n51.f.a(this.client_info, ilinkLoginRequest.client_info) && n51.f.a(this.business_req_buffer, ilinkLoginRequest.business_req_buffer) && n51.f.a(java.lang.Integer.valueOf(this.custom_auth_scene), java.lang.Integer.valueOf(ilinkLoginRequest.custom_auth_scene));
    }

    public com.tencent.mm.protobuf.g getAuthCode() {
        return this.hasSetFields[3] ? this.auth_code : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getBusinessReqBuffer() {
        return this.hasSetFields[8] ? this.business_req_buffer : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getClientInfo() {
        return this.hasSetFields[7] ? this.client_info : "";
    }

    public int getCustomAuthScene() {
        return this.custom_auth_scene;
    }

    public com.tencent.mm.protobuf.g getLkid() {
        return this.hasSetFields[5] ? this.lkid : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getRetryCount() {
        return this.retry_count;
    }

    public com.tencent.mm.protobuf.g getSecurityInfo() {
        return this.hasSetFields[6] ? this.security_info : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getTimeoutMs() {
        return this.timeout_ms;
    }

    public com.tencent.mm.protobuf.g getVendorid() {
        return this.hasSetFields[4] ? this.vendorid : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasAuthCode() {
        return hasFieldNumber(3);
    }

    public boolean hasBusinessReqBuffer() {
        return hasFieldNumber(8);
    }

    public boolean hasClientInfo() {
        return hasFieldNumber(7);
    }

    public boolean hasCustomAuthScene() {
        return hasFieldNumber(9);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLkid() {
        return hasFieldNumber(5);
    }

    public boolean hasRetryCount() {
        return hasFieldNumber(2);
    }

    public boolean hasSecurityInfo() {
        return hasFieldNumber(6);
    }

    public boolean hasTimeoutMs() {
        return hasFieldNumber(1);
    }

    public boolean hasVendorid() {
        return hasFieldNumber(4);
    }

    public com.tencent.ilink.auth.IlinkLoginRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkLoginRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.timeout_ms);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.retry_count);
            }
            com.tencent.mm.protobuf.g gVar = this.auth_code;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.vendorid;
            if (gVar2 != null && this.hasSetFields[4]) {
                fVar.b(4, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.lkid;
            if (gVar3 != null && this.hasSetFields[5]) {
                fVar.b(5, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.security_info;
            if (gVar4 != null && this.hasSetFields[6]) {
                fVar.b(6, gVar4);
            }
            java.lang.String str = this.client_info;
            if (str != null && this.hasSetFields[7]) {
                fVar.j(7, str);
            }
            com.tencent.mm.protobuf.g gVar5 = this.business_req_buffer;
            if (gVar5 != null && this.hasSetFields[8]) {
                fVar.b(8, gVar5);
            }
            if (this.hasSetFields[9]) {
                fVar.e(9, this.custom_auth_scene);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.timeout_ms) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.retry_count);
            }
            com.tencent.mm.protobuf.g gVar6 = this.auth_code;
            if (gVar6 != null && this.hasSetFields[3]) {
                e17 += b36.f.b(3, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.vendorid;
            if (gVar7 != null && this.hasSetFields[4]) {
                e17 += b36.f.b(4, gVar7);
            }
            com.tencent.mm.protobuf.g gVar8 = this.lkid;
            if (gVar8 != null && this.hasSetFields[5]) {
                e17 += b36.f.b(5, gVar8);
            }
            com.tencent.mm.protobuf.g gVar9 = this.security_info;
            if (gVar9 != null && this.hasSetFields[6]) {
                e17 += b36.f.b(6, gVar9);
            }
            java.lang.String str2 = this.client_info;
            if (str2 != null && this.hasSetFields[7]) {
                e17 += b36.f.j(7, str2);
            }
            com.tencent.mm.protobuf.g gVar10 = this.business_req_buffer;
            if (gVar10 != null && this.hasSetFields[8]) {
                e17 += b36.f.b(8, gVar10);
            }
            return this.hasSetFields[9] ? e17 + b36.f.e(9, this.custom_auth_scene) : e17;
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
                this.timeout_ms = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.retry_count = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.auth_code = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.vendorid = aVar2.d(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.lkid = aVar2.d(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.security_info = aVar2.d(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.client_info = aVar2.k(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.business_req_buffer = aVar2.d(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.custom_auth_scene = aVar2.g(intValue);
                this.hasSetFields[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.auth.IlinkLoginRequest setAuthCode(com.tencent.mm.protobuf.g gVar) {
        this.auth_code = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginRequest setBusinessReqBuffer(com.tencent.mm.protobuf.g gVar) {
        this.business_req_buffer = gVar;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginRequest setClientInfo(java.lang.String str) {
        this.client_info = str;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginRequest setCustomAuthScene(int i17) {
        this.custom_auth_scene = i17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginRequest setLkid(com.tencent.mm.protobuf.g gVar) {
        this.lkid = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginRequest setRetryCount(int i17) {
        this.retry_count = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginRequest setSecurityInfo(com.tencent.mm.protobuf.g gVar) {
        this.security_info = gVar;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginRequest setTimeoutMs(int i17) {
        this.timeout_ms = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginRequest setVendorid(com.tencent.mm.protobuf.g gVar) {
        this.vendorid = gVar;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkLoginRequest parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkLoginRequest) super.parseFrom(bArr);
    }
}
