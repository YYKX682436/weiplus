package com.tencent.ilink.auth;

/* loaded from: classes2.dex */
public class IlinkFaceRecognizeConfigResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse();
    private com.tencent.mm.protobuf.g config_data;
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse create() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse();
    }

    public static com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse newBuilder() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse();
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse) && n51.f.a(this.config_data, ((com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse) fVar).config_data);
    }

    public com.tencent.mm.protobuf.g getConfigData() {
        return this.hasSetFields[1] ? this.config_data : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasConfigData() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.config_data;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.config_data;
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
        this.config_data = aVar2.d(intValue);
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse setConfigData(com.tencent.mm.protobuf.g gVar) {
        this.config_data = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse) super.parseFrom(bArr);
    }
}
