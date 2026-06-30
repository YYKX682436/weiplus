package com.tencent.ilink.auth;

/* loaded from: classes2.dex */
public class IlinkGetOAuthCodeResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkGetOAuthCodeResponse DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkGetOAuthCodeResponse();
    private final boolean[] hasSetFields = new boolean[2];
    private com.tencent.mm.protobuf.g oauth_code;

    public static com.tencent.ilink.auth.IlinkGetOAuthCodeResponse create() {
        return new com.tencent.ilink.auth.IlinkGetOAuthCodeResponse();
    }

    public static com.tencent.ilink.auth.IlinkGetOAuthCodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkGetOAuthCodeResponse newBuilder() {
        return new com.tencent.ilink.auth.IlinkGetOAuthCodeResponse();
    }

    public com.tencent.ilink.auth.IlinkGetOAuthCodeResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.ilink.auth.IlinkGetOAuthCodeResponse) && n51.f.a(this.oauth_code, ((com.tencent.ilink.auth.IlinkGetOAuthCodeResponse) fVar).oauth_code);
    }

    public com.tencent.mm.protobuf.g getOauthCode() {
        return this.hasSetFields[1] ? this.oauth_code : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasOauthCode() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.IlinkGetOAuthCodeResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkGetOAuthCodeResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.oauth_code;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.oauth_code;
            if (gVar2 == null || !this.hasSetFields[1]) {
                return 0;
            }
            return 0 + b36.f.b(1, gVar2);
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
        if (intValue != 1) {
            return -1;
        }
        this.oauth_code = aVar2.d(intValue);
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkGetOAuthCodeResponse setOauthCode(com.tencent.mm.protobuf.g gVar) {
        this.oauth_code = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkGetOAuthCodeResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkGetOAuthCodeResponse parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkGetOAuthCodeResponse) super.parseFrom(bArr);
    }
}
