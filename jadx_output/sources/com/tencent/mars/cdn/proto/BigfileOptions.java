package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class BigfileOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.BigfileOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.BigfileOptions();
    private final boolean[] hasSetFields = new boolean[3];
    private com.tencent.mm.protobuf.g signature;
    private java.lang.String signature_aeskey;

    public static com.tencent.mars.cdn.proto.BigfileOptions create() {
        return new com.tencent.mars.cdn.proto.BigfileOptions();
    }

    public static com.tencent.mars.cdn.proto.BigfileOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.BigfileOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.BigfileOptions();
    }

    public com.tencent.mars.cdn.proto.BigfileOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.BigfileOptions)) {
            return false;
        }
        com.tencent.mars.cdn.proto.BigfileOptions bigfileOptions = (com.tencent.mars.cdn.proto.BigfileOptions) fVar;
        return n51.f.a(this.signature, bigfileOptions.signature) && n51.f.a(this.signature_aeskey, bigfileOptions.signature_aeskey);
    }

    public com.tencent.mm.protobuf.g getSignature() {
        return this.hasSetFields[1] ? this.signature : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getSignatureAeskey() {
        return this.hasSetFields[2] ? this.signature_aeskey : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasSignature() {
        return hasFieldNumber(1);
    }

    public boolean hasSignatureAeskey() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.BigfileOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.BigfileOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.signature;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.signature_aeskey;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.signature;
            if (gVar2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            java.lang.String str2 = this.signature_aeskey;
            return (str2 == null || !this.hasSetFields[2]) ? i18 : i18 + b36.f.j(2, str2);
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
            this.signature = aVar2.d(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.signature_aeskey = aVar2.k(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.BigfileOptions setSignature(com.tencent.mm.protobuf.g gVar) {
        this.signature = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BigfileOptions setSignatureAeskey(java.lang.String str) {
        this.signature_aeskey = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BigfileOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.BigfileOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.BigfileOptions) super.parseFrom(bArr);
    }
}
