package com.tencent.ilink.auth;

/* loaded from: classes2.dex */
public class IlinkGetLoginQrCodeResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse();
    private final boolean[] hasSetFields = new boolean[2];
    private java.lang.String path;

    public static com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse create() {
        return new com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse();
    }

    public static com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse newBuilder() {
        return new com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse();
    }

    public com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse) && n51.f.a(this.path, ((com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse) fVar).path);
    }

    public java.lang.String getPath() {
        return this.hasSetFields[1] ? this.path : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasPath() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.path;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.path;
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
        this.path = aVar2.k(intValue);
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse setPath(java.lang.String str) {
        this.path = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse) super.parseFrom(bArr);
    }
}
