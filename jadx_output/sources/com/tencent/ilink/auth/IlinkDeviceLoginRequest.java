package com.tencent.ilink.auth;

/* loaded from: classes2.dex */
public class IlinkDeviceLoginRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkDeviceLoginRequest DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkDeviceLoginRequest();
    private int device_auth_type;
    private java.lang.String device_id;
    private java.lang.String device_signature;
    private int device_signature_timestamp;
    private int device_signature_version;
    private final boolean[] hasSetFields = new boolean[7];
    private int product_id;

    public static com.tencent.ilink.auth.IlinkDeviceLoginRequest create() {
        return new com.tencent.ilink.auth.IlinkDeviceLoginRequest();
    }

    public static com.tencent.ilink.auth.IlinkDeviceLoginRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkDeviceLoginRequest newBuilder() {
        return new com.tencent.ilink.auth.IlinkDeviceLoginRequest();
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkDeviceLoginRequest)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkDeviceLoginRequest ilinkDeviceLoginRequest = (com.tencent.ilink.auth.IlinkDeviceLoginRequest) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.product_id), java.lang.Integer.valueOf(ilinkDeviceLoginRequest.product_id)) && n51.f.a(this.device_id, ilinkDeviceLoginRequest.device_id) && n51.f.a(this.device_signature, ilinkDeviceLoginRequest.device_signature) && n51.f.a(java.lang.Integer.valueOf(this.device_auth_type), java.lang.Integer.valueOf(ilinkDeviceLoginRequest.device_auth_type)) && n51.f.a(java.lang.Integer.valueOf(this.device_signature_version), java.lang.Integer.valueOf(ilinkDeviceLoginRequest.device_signature_version)) && n51.f.a(java.lang.Integer.valueOf(this.device_signature_timestamp), java.lang.Integer.valueOf(ilinkDeviceLoginRequest.device_signature_timestamp));
    }

    public int getDeviceAuthType() {
        return this.device_auth_type;
    }

    public java.lang.String getDeviceId() {
        return this.hasSetFields[2] ? this.device_id : "";
    }

    public java.lang.String getDeviceSignature() {
        return this.hasSetFields[3] ? this.device_signature : "";
    }

    public int getDeviceSignatureTimestamp() {
        return this.device_signature_timestamp;
    }

    public int getDeviceSignatureVersion() {
        return this.device_signature_version;
    }

    public int getProductId() {
        return this.product_id;
    }

    public boolean hasDeviceAuthType() {
        return hasFieldNumber(4);
    }

    public boolean hasDeviceId() {
        return hasFieldNumber(2);
    }

    public boolean hasDeviceSignature() {
        return hasFieldNumber(3);
    }

    public boolean hasDeviceSignatureTimestamp() {
        return hasFieldNumber(6);
    }

    public boolean hasDeviceSignatureVersion() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasProductId() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkDeviceLoginRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.product_id);
            }
            java.lang.String str = this.device_id;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.device_signature;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.device_auth_type);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.device_signature_version);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.device_signature_timestamp);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.product_id) : 0;
            java.lang.String str3 = this.device_id;
            if (str3 != null && this.hasSetFields[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.device_signature;
            if (str4 != null && this.hasSetFields[3]) {
                e17 += b36.f.j(3, str4);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.e(4, this.device_auth_type);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.e(5, this.device_signature_version);
            }
            return this.hasSetFields[6] ? e17 + b36.f.e(6, this.device_signature_timestamp) : e17;
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
                this.product_id = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.device_id = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.device_signature = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.device_auth_type = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.device_signature_version = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.device_signature_timestamp = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginRequest setDeviceAuthType(int i17) {
        this.device_auth_type = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginRequest setDeviceId(java.lang.String str) {
        this.device_id = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginRequest setDeviceSignature(java.lang.String str) {
        this.device_signature = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginRequest setDeviceSignatureTimestamp(int i17) {
        this.device_signature_timestamp = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginRequest setDeviceSignatureVersion(int i17) {
        this.device_signature_version = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginRequest setProductId(int i17) {
        this.product_id = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkDeviceLoginRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkDeviceLoginRequest parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkDeviceLoginRequest) super.parseFrom(bArr);
    }
}
