package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public class IlinkCheckLoginQrCodeResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse();
    private java.lang.String avatar_url;
    private com.tencent.mm.protobuf.g business_confirm_resp_buffer;
    private final boolean[] hasSetFields = new boolean[6];
    private java.lang.String nickname;
    private com.tencent.ilink.auth.IlinkLoginQrCodeStatus status;
    private long uin;

    public static com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse create() {
        return new com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse();
    }

    public static com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse newBuilder() {
        return new com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse();
    }

    public com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse ilinkCheckLoginQrCodeResponse = (com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse) fVar;
        return n51.f.a(this.status, ilinkCheckLoginQrCodeResponse.status) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(ilinkCheckLoginQrCodeResponse.uin)) && n51.f.a(this.nickname, ilinkCheckLoginQrCodeResponse.nickname) && n51.f.a(this.avatar_url, ilinkCheckLoginQrCodeResponse.avatar_url) && n51.f.a(this.business_confirm_resp_buffer, ilinkCheckLoginQrCodeResponse.business_confirm_resp_buffer);
    }

    public java.lang.String getAvatarUrl() {
        return this.hasSetFields[4] ? this.avatar_url : "";
    }

    public com.tencent.mm.protobuf.g getBusinessConfirmRespBuffer() {
        return this.hasSetFields[5] ? this.business_confirm_resp_buffer : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getNickname() {
        return this.hasSetFields[3] ? this.nickname : "";
    }

    public com.tencent.ilink.auth.IlinkLoginQrCodeStatus getStatus() {
        return this.hasSetFields[1] ? this.status : com.tencent.ilink.auth.IlinkLoginQrCodeStatus.kLoginQrCodeStatus_NoScan;
    }

    public long getUin() {
        return this.uin;
    }

    public boolean hasAvatarUrl() {
        return hasFieldNumber(4);
    }

    public boolean hasBusinessConfirmRespBuffer() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasNickname() {
        return hasFieldNumber(3);
    }

    public boolean hasStatus() {
        return hasFieldNumber(1);
    }

    public boolean hasUin() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.ilink.auth.IlinkLoginQrCodeStatus ilinkLoginQrCodeStatus = this.status;
            if (ilinkLoginQrCodeStatus != null && this.hasSetFields[1]) {
                fVar.e(1, ilinkLoginQrCodeStatus.value);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.uin);
            }
            java.lang.String str = this.nickname;
            if (str != null && this.hasSetFields[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.avatar_url;
            if (str2 != null && this.hasSetFields[4]) {
                fVar.j(4, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.business_confirm_resp_buffer;
            if (gVar != null && this.hasSetFields[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.ilink.auth.IlinkLoginQrCodeStatus ilinkLoginQrCodeStatus2 = this.status;
            if (ilinkLoginQrCodeStatus2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.e(1, ilinkLoginQrCodeStatus2.value);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.h(2, this.uin);
            }
            java.lang.String str3 = this.nickname;
            if (str3 != null && this.hasSetFields[3]) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.avatar_url;
            if (str4 != null && this.hasSetFields[4]) {
                i18 += b36.f.j(4, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.business_confirm_resp_buffer;
            return (gVar2 == null || !this.hasSetFields[5]) ? i18 : i18 + b36.f.b(5, gVar2);
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
            this.status = com.tencent.ilink.auth.IlinkLoginQrCodeStatus.forNumber(aVar2.g(intValue));
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.uin = aVar2.i(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.nickname = aVar2.k(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.avatar_url = aVar2.k(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.business_confirm_resp_buffer = aVar2.d(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse setAvatarUrl(java.lang.String str) {
        this.avatar_url = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse setBusinessConfirmRespBuffer(com.tencent.mm.protobuf.g gVar) {
        this.business_confirm_resp_buffer = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse setNickname(java.lang.String str) {
        this.nickname = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse setStatus(com.tencent.ilink.auth.IlinkLoginQrCodeStatus ilinkLoginQrCodeStatus) {
        this.status = ilinkLoginQrCodeStatus;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse setUin(long j17) {
        this.uin = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse) super.parseFrom(bArr);
    }
}
