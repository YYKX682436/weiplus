package com.tencent.ilink.auth;

/* loaded from: classes2.dex */
public class IlinkGetLoginQrCodeRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest();
    private com.tencent.mm.protobuf.g confirm_business_info;
    private final boolean[] hasSetFields = new boolean[3];
    private int qrcode_verify_scene;

    public static com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest create() {
        return new com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest();
    }

    public static com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest newBuilder() {
        return new com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest();
    }

    public com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest ilinkGetLoginQrCodeRequest = (com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.qrcode_verify_scene), java.lang.Integer.valueOf(ilinkGetLoginQrCodeRequest.qrcode_verify_scene)) && n51.f.a(this.confirm_business_info, ilinkGetLoginQrCodeRequest.confirm_business_info);
    }

    public com.tencent.mm.protobuf.g getConfirmBusinessInfo() {
        return this.hasSetFields[2] ? this.confirm_business_info : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getQrcodeVerifyScene() {
        return this.qrcode_verify_scene;
    }

    public boolean hasConfirmBusinessInfo() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasQrcodeVerifyScene() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.qrcode_verify_scene);
            }
            com.tencent.mm.protobuf.g gVar = this.confirm_business_info;
            if (gVar != null && this.hasSetFields[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.qrcode_verify_scene) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.confirm_business_info;
            return (gVar2 == null || !this.hasSetFields[2]) ? e17 : e17 + b36.f.b(2, gVar2);
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
            this.qrcode_verify_scene = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.confirm_business_info = aVar2.d(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest setConfirmBusinessInfo(com.tencent.mm.protobuf.g gVar) {
        this.confirm_business_info = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest setQrcodeVerifyScene(int i17) {
        this.qrcode_verify_scene = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest) super.parseFrom(bArr);
    }
}
