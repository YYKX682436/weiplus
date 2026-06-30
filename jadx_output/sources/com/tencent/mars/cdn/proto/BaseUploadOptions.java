package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class BaseUploadOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.BaseUploadOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.BaseUploadOptions();
    private final boolean[] hasSetFields = new boolean[2];
    private boolean pre_upload;

    public static com.tencent.mars.cdn.proto.BaseUploadOptions create() {
        return new com.tencent.mars.cdn.proto.BaseUploadOptions();
    }

    public static com.tencent.mars.cdn.proto.BaseUploadOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.BaseUploadOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.BaseUploadOptions();
    }

    public com.tencent.mars.cdn.proto.BaseUploadOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mars.cdn.proto.BaseUploadOptions) && n51.f.a(java.lang.Boolean.valueOf(this.pre_upload), java.lang.Boolean.valueOf(((com.tencent.mars.cdn.proto.BaseUploadOptions) fVar).pre_upload));
    }

    public boolean getPreUpload() {
        return this.pre_upload;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasPreUpload() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.BaseUploadOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.BaseUploadOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.a(1, this.pre_upload);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.hasSetFields[1]) {
                return 0 + b36.f.a(1, this.pre_upload);
            }
            return 0;
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
        this.pre_upload = aVar2.c(intValue);
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.BaseUploadOptions setPreUpload(boolean z17) {
        this.pre_upload = z17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BaseUploadOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.BaseUploadOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.BaseUploadOptions) super.parseFrom(bArr);
    }
}
