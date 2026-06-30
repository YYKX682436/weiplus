package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public class IlinkLoginResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkLoginResponse DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkLoginResponse();
    private int detail_ret;
    private final boolean[] hasSetFields = new boolean[4];
    private int login_type;
    private com.tencent.mm.protobuf.g verify_buffer;

    public static com.tencent.ilink.auth.IlinkLoginResponse create() {
        return new com.tencent.ilink.auth.IlinkLoginResponse();
    }

    public static com.tencent.ilink.auth.IlinkLoginResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkLoginResponse newBuilder() {
        return new com.tencent.ilink.auth.IlinkLoginResponse();
    }

    public com.tencent.ilink.auth.IlinkLoginResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkLoginResponse)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkLoginResponse ilinkLoginResponse = (com.tencent.ilink.auth.IlinkLoginResponse) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.login_type), java.lang.Integer.valueOf(ilinkLoginResponse.login_type)) && n51.f.a(this.verify_buffer, ilinkLoginResponse.verify_buffer) && n51.f.a(java.lang.Integer.valueOf(this.detail_ret), java.lang.Integer.valueOf(ilinkLoginResponse.detail_ret));
    }

    public int getDetailRet() {
        return this.detail_ret;
    }

    public int getLoginType() {
        return this.login_type;
    }

    public com.tencent.mm.protobuf.g getVerifyBuffer() {
        return this.hasSetFields[2] ? this.verify_buffer : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasDetailRet() {
        return hasFieldNumber(3);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLoginType() {
        return hasFieldNumber(1);
    }

    public boolean hasVerifyBuffer() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.auth.IlinkLoginResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkLoginResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.login_type);
            }
            com.tencent.mm.protobuf.g gVar = this.verify_buffer;
            if (gVar != null && this.hasSetFields[2]) {
                fVar.b(2, gVar);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.detail_ret);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.login_type) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.verify_buffer;
            if (gVar2 != null && this.hasSetFields[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            return this.hasSetFields[3] ? e17 + b36.f.e(3, this.detail_ret) : e17;
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
            this.login_type = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.verify_buffer = aVar2.d(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.detail_ret = aVar2.g(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkLoginResponse setDetailRet(int i17) {
        this.detail_ret = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginResponse setLoginType(int i17) {
        this.login_type = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginResponse setVerifyBuffer(com.tencent.mm.protobuf.g gVar) {
        this.verify_buffer = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkLoginResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkLoginResponse parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkLoginResponse) super.parseFrom(bArr);
    }
}
