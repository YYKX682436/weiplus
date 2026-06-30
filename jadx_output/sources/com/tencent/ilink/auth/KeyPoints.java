package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public class KeyPoints extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.KeyPoints DEFAULT_INSTANCE = new com.tencent.ilink.auth.KeyPoints();
    private final boolean[] hasSetFields = new boolean[11];
    private float left_eye_x;
    private float left_eye_y;
    private float left_mouth_x;
    private float left_mouth_y;
    private float nose_x;
    private float nose_y;
    private float right_eye_x;
    private float right_eye_y;
    private float right_mouth_x;
    private float right_mouth_y;

    public static com.tencent.ilink.auth.KeyPoints create() {
        return new com.tencent.ilink.auth.KeyPoints();
    }

    public static com.tencent.ilink.auth.KeyPoints getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.KeyPoints newBuilder() {
        return new com.tencent.ilink.auth.KeyPoints();
    }

    public com.tencent.ilink.auth.KeyPoints build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.KeyPoints)) {
            return false;
        }
        com.tencent.ilink.auth.KeyPoints keyPoints = (com.tencent.ilink.auth.KeyPoints) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.left_eye_x), java.lang.Float.valueOf(keyPoints.left_eye_x)) && n51.f.a(java.lang.Float.valueOf(this.left_eye_y), java.lang.Float.valueOf(keyPoints.left_eye_y)) && n51.f.a(java.lang.Float.valueOf(this.right_eye_x), java.lang.Float.valueOf(keyPoints.right_eye_x)) && n51.f.a(java.lang.Float.valueOf(this.right_eye_y), java.lang.Float.valueOf(keyPoints.right_eye_y)) && n51.f.a(java.lang.Float.valueOf(this.nose_x), java.lang.Float.valueOf(keyPoints.nose_x)) && n51.f.a(java.lang.Float.valueOf(this.nose_y), java.lang.Float.valueOf(keyPoints.nose_y)) && n51.f.a(java.lang.Float.valueOf(this.left_mouth_x), java.lang.Float.valueOf(keyPoints.left_mouth_x)) && n51.f.a(java.lang.Float.valueOf(this.left_mouth_y), java.lang.Float.valueOf(keyPoints.left_mouth_y)) && n51.f.a(java.lang.Float.valueOf(this.right_mouth_x), java.lang.Float.valueOf(keyPoints.right_mouth_x)) && n51.f.a(java.lang.Float.valueOf(this.right_mouth_y), java.lang.Float.valueOf(keyPoints.right_mouth_y));
    }

    public float getLeftEyeX() {
        return this.left_eye_x;
    }

    public float getLeftEyeY() {
        return this.left_eye_y;
    }

    public float getLeftMouthX() {
        return this.left_mouth_x;
    }

    public float getLeftMouthY() {
        return this.left_mouth_y;
    }

    public float getNoseX() {
        return this.nose_x;
    }

    public float getNoseY() {
        return this.nose_y;
    }

    public float getRightEyeX() {
        return this.right_eye_x;
    }

    public float getRightEyeY() {
        return this.right_eye_y;
    }

    public float getRightMouthX() {
        return this.right_mouth_x;
    }

    public float getRightMouthY() {
        return this.right_mouth_y;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLeftEyeX() {
        return hasFieldNumber(1);
    }

    public boolean hasLeftEyeY() {
        return hasFieldNumber(2);
    }

    public boolean hasLeftMouthX() {
        return hasFieldNumber(7);
    }

    public boolean hasLeftMouthY() {
        return hasFieldNumber(8);
    }

    public boolean hasNoseX() {
        return hasFieldNumber(5);
    }

    public boolean hasNoseY() {
        return hasFieldNumber(6);
    }

    public boolean hasRightEyeX() {
        return hasFieldNumber(3);
    }

    public boolean hasRightEyeY() {
        return hasFieldNumber(4);
    }

    public boolean hasRightMouthX() {
        return hasFieldNumber(9);
    }

    public boolean hasRightMouthY() {
        return hasFieldNumber(10);
    }

    public com.tencent.ilink.auth.KeyPoints mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.KeyPoints();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.d(1, this.left_eye_x);
            }
            if (this.hasSetFields[2]) {
                fVar.d(2, this.left_eye_y);
            }
            if (this.hasSetFields[3]) {
                fVar.d(3, this.right_eye_x);
            }
            if (this.hasSetFields[4]) {
                fVar.d(4, this.right_eye_y);
            }
            if (this.hasSetFields[5]) {
                fVar.d(5, this.nose_x);
            }
            if (this.hasSetFields[6]) {
                fVar.d(6, this.nose_y);
            }
            if (this.hasSetFields[7]) {
                fVar.d(7, this.left_mouth_x);
            }
            if (this.hasSetFields[8]) {
                fVar.d(8, this.left_mouth_y);
            }
            if (this.hasSetFields[9]) {
                fVar.d(9, this.right_mouth_x);
            }
            if (this.hasSetFields[10]) {
                fVar.d(10, this.right_mouth_y);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = this.hasSetFields[1] ? 0 + b36.f.d(1, this.left_eye_x) : 0;
            if (this.hasSetFields[2]) {
                d17 += b36.f.d(2, this.left_eye_y);
            }
            if (this.hasSetFields[3]) {
                d17 += b36.f.d(3, this.right_eye_x);
            }
            if (this.hasSetFields[4]) {
                d17 += b36.f.d(4, this.right_eye_y);
            }
            if (this.hasSetFields[5]) {
                d17 += b36.f.d(5, this.nose_x);
            }
            if (this.hasSetFields[6]) {
                d17 += b36.f.d(6, this.nose_y);
            }
            if (this.hasSetFields[7]) {
                d17 += b36.f.d(7, this.left_mouth_x);
            }
            if (this.hasSetFields[8]) {
                d17 += b36.f.d(8, this.left_mouth_y);
            }
            if (this.hasSetFields[9]) {
                d17 += b36.f.d(9, this.right_mouth_x);
            }
            return this.hasSetFields[10] ? d17 + b36.f.d(10, this.right_mouth_y) : d17;
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
        switch (intValue) {
            case 1:
                this.left_eye_x = aVar2.f(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.left_eye_y = aVar2.f(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.right_eye_x = aVar2.f(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.right_eye_y = aVar2.f(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.nose_x = aVar2.f(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.nose_y = aVar2.f(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.left_mouth_x = aVar2.f(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.left_mouth_y = aVar2.f(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.right_mouth_x = aVar2.f(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.right_mouth_y = aVar2.f(intValue);
                this.hasSetFields[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.auth.KeyPoints setLeftEyeX(float f17) {
        this.left_eye_x = f17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.KeyPoints setLeftEyeY(float f17) {
        this.left_eye_y = f17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.KeyPoints setLeftMouthX(float f17) {
        this.left_mouth_x = f17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.auth.KeyPoints setLeftMouthY(float f17) {
        this.left_mouth_y = f17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.auth.KeyPoints setNoseX(float f17) {
        this.nose_x = f17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.auth.KeyPoints setNoseY(float f17) {
        this.nose_y = f17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.auth.KeyPoints setRightEyeX(float f17) {
        this.right_eye_x = f17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.KeyPoints setRightEyeY(float f17) {
        this.right_eye_y = f17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.KeyPoints setRightMouthX(float f17) {
        this.right_mouth_x = f17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.ilink.auth.KeyPoints setRightMouthY(float f17) {
        this.right_mouth_y = f17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.ilink.auth.KeyPoints mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.KeyPoints parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.KeyPoints) super.parseFrom(bArr);
    }
}
