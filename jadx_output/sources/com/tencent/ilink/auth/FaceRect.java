package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public class FaceRect extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.FaceRect DEFAULT_INSTANCE = new com.tencent.ilink.auth.FaceRect();
    private int face_height;
    private int face_width;
    private int face_x;
    private int face_y;
    private final boolean[] hasSetFields = new boolean[5];

    public static com.tencent.ilink.auth.FaceRect create() {
        return new com.tencent.ilink.auth.FaceRect();
    }

    public static com.tencent.ilink.auth.FaceRect getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.FaceRect newBuilder() {
        return new com.tencent.ilink.auth.FaceRect();
    }

    public com.tencent.ilink.auth.FaceRect build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.FaceRect)) {
            return false;
        }
        com.tencent.ilink.auth.FaceRect faceRect = (com.tencent.ilink.auth.FaceRect) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.face_x), java.lang.Integer.valueOf(faceRect.face_x)) && n51.f.a(java.lang.Integer.valueOf(this.face_y), java.lang.Integer.valueOf(faceRect.face_y)) && n51.f.a(java.lang.Integer.valueOf(this.face_width), java.lang.Integer.valueOf(faceRect.face_width)) && n51.f.a(java.lang.Integer.valueOf(this.face_height), java.lang.Integer.valueOf(faceRect.face_height));
    }

    public int getFaceHeight() {
        return this.face_height;
    }

    public int getFaceWidth() {
        return this.face_width;
    }

    public int getFaceX() {
        return this.face_x;
    }

    public int getFaceY() {
        return this.face_y;
    }

    public boolean hasFaceHeight() {
        return hasFieldNumber(4);
    }

    public boolean hasFaceWidth() {
        return hasFieldNumber(3);
    }

    public boolean hasFaceX() {
        return hasFieldNumber(1);
    }

    public boolean hasFaceY() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public com.tencent.ilink.auth.FaceRect mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.FaceRect();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.face_x);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.face_y);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.face_width);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.face_height);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.face_x) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.face_y);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.e(3, this.face_width);
            }
            return this.hasSetFields[4] ? e17 + b36.f.e(4, this.face_height) : e17;
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
            this.face_x = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.face_y = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.face_width = aVar2.g(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.face_height = aVar2.g(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.ilink.auth.FaceRect setFaceHeight(int i17) {
        this.face_height = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceRect setFaceWidth(int i17) {
        this.face_width = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceRect setFaceX(int i17) {
        this.face_x = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceRect setFaceY(int i17) {
        this.face_y = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceRect mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.FaceRect parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.FaceRect) super.parseFrom(bArr);
    }
}
