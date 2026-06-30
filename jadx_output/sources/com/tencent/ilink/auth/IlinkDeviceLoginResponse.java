package com.tencent.ilink.auth;

/* loaded from: classes8.dex */
public class IlinkDeviceLoginResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkDeviceLoginResponse DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkDeviceLoginResponse();
    private final boolean[] hasSetFields = new boolean[5];
    private java.lang.String ilink_id;
    private java.lang.String ilink_sn;
    private java.lang.String ilink_token;
    private com.tencent.mm.protobuf.g session;

    public static com.tencent.ilink.auth.IlinkDeviceLoginResponse create() {
        return new com.tencent.ilink.auth.IlinkDeviceLoginResponse();
    }

    public static com.tencent.ilink.auth.IlinkDeviceLoginResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkDeviceLoginResponse newBuilder() {
        return new com.tencent.ilink.auth.IlinkDeviceLoginResponse();
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkDeviceLoginResponse)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkDeviceLoginResponse ilinkDeviceLoginResponse = (com.tencent.ilink.auth.IlinkDeviceLoginResponse) fVar;
        return n51.f.a(this.ilink_sn, ilinkDeviceLoginResponse.ilink_sn) && n51.f.a(this.ilink_id, ilinkDeviceLoginResponse.ilink_id) && n51.f.a(this.ilink_token, ilinkDeviceLoginResponse.ilink_token) && n51.f.a(this.session, ilinkDeviceLoginResponse.session);
    }

    public java.lang.String getIlinkId() {
        return this.hasSetFields[2] ? this.ilink_id : "";
    }

    public java.lang.String getIlinkSn() {
        return this.hasSetFields[1] ? this.ilink_sn : "";
    }

    public java.lang.String getIlinkToken() {
        return this.hasSetFields[3] ? this.ilink_token : "";
    }

    public com.tencent.mm.protobuf.g getSession() {
        return this.hasSetFields[4] ? this.session : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIlinkId() {
        return hasFieldNumber(2);
    }

    public boolean hasIlinkSn() {
        return hasFieldNumber(1);
    }

    public boolean hasIlinkToken() {
        return hasFieldNumber(3);
    }

    public boolean hasSession() {
        return hasFieldNumber(4);
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkDeviceLoginResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.ilink_sn;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.ilink_id;
            if (str2 != null && this.hasSetFields[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.ilink_token;
            if (str3 != null && this.hasSetFields[3]) {
                fVar.j(3, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.session;
            if (gVar != null && this.hasSetFields[4]) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.ilink_sn;
            if (str4 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.ilink_id;
            if (str5 != null && this.hasSetFields[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.ilink_token;
            if (str6 != null && this.hasSetFields[3]) {
                i18 += b36.f.j(3, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.session;
            return (gVar2 == null || !this.hasSetFields[4]) ? i18 : i18 + b36.f.b(4, gVar2);
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
            this.ilink_sn = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.ilink_id = aVar2.k(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.ilink_token = aVar2.k(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.session = aVar2.d(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginResponse setIlinkId(java.lang.String str) {
        this.ilink_id = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginResponse setIlinkSn(java.lang.String str) {
        this.ilink_sn = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginResponse setIlinkToken(java.lang.String str) {
        this.ilink_token = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginResponse setSession(com.tencent.mm.protobuf.g gVar) {
        this.session = gVar;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkDeviceLoginResponse parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkDeviceLoginResponse) super.parseFrom(bArr);
    }
}
