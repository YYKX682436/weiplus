package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public class TwoDVideoData extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.TwoDVideoData DEFAULT_INSTANCE = new com.tencent.ilink.auth.TwoDVideoData();
    private com.tencent.ilink.auth.EncryptInfo encrypt;

    /* renamed from: vs, reason: collision with root package name */
    private java.util.LinkedList<com.tencent.ilink.auth.FaceVideo> f45949vs = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[3];

    public static com.tencent.ilink.auth.TwoDVideoData create() {
        return new com.tencent.ilink.auth.TwoDVideoData();
    }

    public static com.tencent.ilink.auth.TwoDVideoData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.TwoDVideoData newBuilder() {
        return new com.tencent.ilink.auth.TwoDVideoData();
    }

    public com.tencent.ilink.auth.TwoDVideoData addAllElementVs(java.util.Collection<com.tencent.ilink.auth.FaceVideo> collection) {
        this.f45949vs.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.TwoDVideoData addElementVs(com.tencent.ilink.auth.FaceVideo faceVideo) {
        this.f45949vs.add(faceVideo);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.TwoDVideoData build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.TwoDVideoData)) {
            return false;
        }
        com.tencent.ilink.auth.TwoDVideoData twoDVideoData = (com.tencent.ilink.auth.TwoDVideoData) fVar;
        return n51.f.a(this.f45949vs, twoDVideoData.f45949vs) && n51.f.a(this.encrypt, twoDVideoData.encrypt);
    }

    public com.tencent.ilink.auth.EncryptInfo getEncrypt() {
        return this.hasSetFields[2] ? this.encrypt : com.tencent.ilink.auth.EncryptInfo.create();
    }

    public java.util.LinkedList<com.tencent.ilink.auth.FaceVideo> getVs() {
        return this.f45949vs;
    }

    public boolean hasEncrypt() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasVs() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.TwoDVideoData mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.TwoDVideoData();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f45949vs);
            com.tencent.ilink.auth.EncryptInfo encryptInfo = this.encrypt;
            if (encryptInfo != null && this.hasSetFields[2]) {
                fVar.i(2, encryptInfo.computeSize());
                this.encrypt.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f45949vs) + 0;
            com.tencent.ilink.auth.EncryptInfo encryptInfo2 = this.encrypt;
            return (encryptInfo2 == null || !this.hasSetFields[2]) ? g17 : g17 + b36.f.i(2, encryptInfo2.computeSize());
        }
        if (i17 == 2) {
            this.f45949vs.clear();
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.ilink.auth.FaceVideo faceVideo = new com.tencent.ilink.auth.FaceVideo();
                if (bArr != null && bArr.length > 0) {
                    faceVideo.parseFrom(bArr);
                }
                this.f45949vs.add(faceVideo);
            }
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.ilink.auth.EncryptInfo encryptInfo3 = new com.tencent.ilink.auth.EncryptInfo();
            if (bArr2 != null && bArr2.length > 0) {
                encryptInfo3.parseFrom(bArr2);
            }
            this.encrypt = encryptInfo3;
        }
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.ilink.auth.TwoDVideoData setEncrypt(com.tencent.ilink.auth.EncryptInfo encryptInfo) {
        this.encrypt = encryptInfo;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.TwoDVideoData setVs(java.util.LinkedList<com.tencent.ilink.auth.FaceVideo> linkedList) {
        this.f45949vs = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.TwoDVideoData mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.TwoDVideoData parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.TwoDVideoData) super.parseFrom(bArr);
    }
}
