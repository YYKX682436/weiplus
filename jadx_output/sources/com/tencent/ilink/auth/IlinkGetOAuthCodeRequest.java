package com.tencent.ilink.auth;

/* loaded from: classes2.dex */
public class IlinkGetOAuthCodeRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkGetOAuthCodeRequest DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkGetOAuthCodeRequest();
    private final boolean[] hasSetFields = new boolean[2];
    private java.lang.String ilink_appid;

    public static com.tencent.ilink.auth.IlinkGetOAuthCodeRequest create() {
        return new com.tencent.ilink.auth.IlinkGetOAuthCodeRequest();
    }

    public static com.tencent.ilink.auth.IlinkGetOAuthCodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkGetOAuthCodeRequest newBuilder() {
        return new com.tencent.ilink.auth.IlinkGetOAuthCodeRequest();
    }

    public com.tencent.ilink.auth.IlinkGetOAuthCodeRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.ilink.auth.IlinkGetOAuthCodeRequest) && n51.f.a(this.ilink_appid, ((com.tencent.ilink.auth.IlinkGetOAuthCodeRequest) fVar).ilink_appid);
    }

    public java.lang.String getIlinkAppid() {
        return this.hasSetFields[1] ? this.ilink_appid : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIlinkAppid() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.IlinkGetOAuthCodeRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkGetOAuthCodeRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.ilink_appid;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.ilink_appid;
            if (str2 == null || !this.hasSetFields[1]) {
                return 0;
            }
            return 0 + b36.f.j(1, str2);
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
        this.ilink_appid = aVar2.k(intValue);
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkGetOAuthCodeRequest setIlinkAppid(java.lang.String str) {
        this.ilink_appid = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkGetOAuthCodeRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkGetOAuthCodeRequest parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkGetOAuthCodeRequest) super.parseFrom(bArr);
    }
}
