package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public class ThreeDFaceData extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.ThreeDFaceData DEFAULT_INSTANCE = new com.tencent.ilink.auth.ThreeDFaceData();
    private com.tencent.mm.protobuf.g color_image;
    private com.tencent.mm.protobuf.g depth_image;
    private com.tencent.ilink.auth.FaceRect face_rect;
    private final boolean[] hasSetFields = new boolean[6];
    private com.tencent.mm.protobuf.g infrared_image;
    private com.tencent.ilink.auth.KeyPoints key_points;

    public static com.tencent.ilink.auth.ThreeDFaceData create() {
        return new com.tencent.ilink.auth.ThreeDFaceData();
    }

    public static com.tencent.ilink.auth.ThreeDFaceData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.ThreeDFaceData newBuilder() {
        return new com.tencent.ilink.auth.ThreeDFaceData();
    }

    public com.tencent.ilink.auth.ThreeDFaceData build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.ThreeDFaceData)) {
            return false;
        }
        com.tencent.ilink.auth.ThreeDFaceData threeDFaceData = (com.tencent.ilink.auth.ThreeDFaceData) fVar;
        return n51.f.a(this.color_image, threeDFaceData.color_image) && n51.f.a(this.depth_image, threeDFaceData.depth_image) && n51.f.a(this.infrared_image, threeDFaceData.infrared_image) && n51.f.a(this.key_points, threeDFaceData.key_points) && n51.f.a(this.face_rect, threeDFaceData.face_rect);
    }

    public com.tencent.mm.protobuf.g getColorImage() {
        return this.hasSetFields[1] ? this.color_image : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getDepthImage() {
        return this.hasSetFields[2] ? this.depth_image : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.auth.FaceRect getFaceRect() {
        return this.hasSetFields[5] ? this.face_rect : com.tencent.ilink.auth.FaceRect.create();
    }

    public com.tencent.mm.protobuf.g getInfraredImage() {
        return this.hasSetFields[3] ? this.infrared_image : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.auth.KeyPoints getKeyPoints() {
        return this.hasSetFields[4] ? this.key_points : com.tencent.ilink.auth.KeyPoints.create();
    }

    public boolean hasColorImage() {
        return hasFieldNumber(1);
    }

    public boolean hasDepthImage() {
        return hasFieldNumber(2);
    }

    public boolean hasFaceRect() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasInfraredImage() {
        return hasFieldNumber(3);
    }

    public boolean hasKeyPoints() {
        return hasFieldNumber(4);
    }

    public com.tencent.ilink.auth.ThreeDFaceData mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.ThreeDFaceData();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.color_image;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.depth_image;
            if (gVar2 != null && this.hasSetFields[2]) {
                fVar.b(2, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.infrared_image;
            if (gVar3 != null && this.hasSetFields[3]) {
                fVar.b(3, gVar3);
            }
            com.tencent.ilink.auth.KeyPoints keyPoints = this.key_points;
            if (keyPoints != null && this.hasSetFields[4]) {
                fVar.i(4, keyPoints.computeSize());
                this.key_points.writeFields(fVar);
            }
            com.tencent.ilink.auth.FaceRect faceRect = this.face_rect;
            if (faceRect != null && this.hasSetFields[5]) {
                fVar.i(5, faceRect.computeSize());
                this.face_rect.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar4 = this.color_image;
            if (gVar4 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.depth_image;
            if (gVar5 != null && this.hasSetFields[2]) {
                i18 += b36.f.b(2, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.infrared_image;
            if (gVar6 != null && this.hasSetFields[3]) {
                i18 += b36.f.b(3, gVar6);
            }
            com.tencent.ilink.auth.KeyPoints keyPoints2 = this.key_points;
            if (keyPoints2 != null && this.hasSetFields[4]) {
                i18 += b36.f.i(4, keyPoints2.computeSize());
            }
            com.tencent.ilink.auth.FaceRect faceRect2 = this.face_rect;
            return (faceRect2 == null || !this.hasSetFields[5]) ? i18 : i18 + b36.f.i(5, faceRect2.computeSize());
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
            this.color_image = aVar2.d(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.depth_image = aVar2.d(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.infrared_image = aVar2.d(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.ilink.auth.KeyPoints keyPoints3 = new com.tencent.ilink.auth.KeyPoints();
                if (bArr != null && bArr.length > 0) {
                    keyPoints3.parseFrom(bArr);
                }
                this.key_points = keyPoints3;
            }
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.ilink.auth.FaceRect faceRect3 = new com.tencent.ilink.auth.FaceRect();
            if (bArr2 != null && bArr2.length > 0) {
                faceRect3.parseFrom(bArr2);
            }
            this.face_rect = faceRect3;
        }
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.ilink.auth.ThreeDFaceData setColorImage(com.tencent.mm.protobuf.g gVar) {
        this.color_image = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.ThreeDFaceData setDepthImage(com.tencent.mm.protobuf.g gVar) {
        this.depth_image = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.ThreeDFaceData setFaceRect(com.tencent.ilink.auth.FaceRect faceRect) {
        this.face_rect = faceRect;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.auth.ThreeDFaceData setInfraredImage(com.tencent.mm.protobuf.g gVar) {
        this.infrared_image = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.ThreeDFaceData setKeyPoints(com.tencent.ilink.auth.KeyPoints keyPoints) {
        this.key_points = keyPoints;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.ThreeDFaceData mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.ThreeDFaceData parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.ThreeDFaceData) super.parseFrom(bArr);
    }
}
