package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public class TwoDConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.TwoDConfig DEFAULT_INSTANCE = new com.tencent.ilink.auth.TwoDConfig();
    private com.tencent.ilink.auth.EncryptInfo encrypt;
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.ilink.auth.TwoDConfig create() {
        return new com.tencent.ilink.auth.TwoDConfig();
    }

    public static com.tencent.ilink.auth.TwoDConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.TwoDConfig newBuilder() {
        return new com.tencent.ilink.auth.TwoDConfig();
    }

    public com.tencent.ilink.auth.TwoDConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.ilink.auth.TwoDConfig) && n51.f.a(this.encrypt, ((com.tencent.ilink.auth.TwoDConfig) fVar).encrypt);
    }

    public com.tencent.ilink.auth.EncryptInfo getEncrypt() {
        return this.hasSetFields[1] ? this.encrypt : com.tencent.ilink.auth.EncryptInfo.create();
    }

    public boolean hasEncrypt() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public com.tencent.ilink.auth.TwoDConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.TwoDConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.ilink.auth.EncryptInfo encryptInfo = this.encrypt;
            if (encryptInfo != null && this.hasSetFields[1]) {
                fVar.i(1, encryptInfo.computeSize());
                this.encrypt.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.ilink.auth.EncryptInfo encryptInfo2 = this.encrypt;
            if (encryptInfo2 == null || !this.hasSetFields[1]) {
                return 0;
            }
            return 0 + b36.f.i(1, encryptInfo2.computeSize());
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
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.ilink.auth.EncryptInfo encryptInfo3 = new com.tencent.ilink.auth.EncryptInfo();
            if (bArr != null && bArr.length > 0) {
                encryptInfo3.parseFrom(bArr);
            }
            this.encrypt = encryptInfo3;
        }
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.ilink.auth.TwoDConfig setEncrypt(com.tencent.ilink.auth.EncryptInfo encryptInfo) {
        this.encrypt = encryptInfo;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.TwoDConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.TwoDConfig parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.TwoDConfig) super.parseFrom(bArr);
    }
}
