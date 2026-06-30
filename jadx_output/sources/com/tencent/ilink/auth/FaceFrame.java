package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public class FaceFrame extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.FaceFrame DEFAULT_INSTANCE = new com.tencent.ilink.auth.FaceFrame();
    private com.tencent.mm.protobuf.g image;
    private java.util.LinkedList<java.lang.Float> x_coordinates = new java.util.LinkedList<>();
    private java.util.LinkedList<java.lang.Float> y_coordinates = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[4];

    public static com.tencent.ilink.auth.FaceFrame create() {
        return new com.tencent.ilink.auth.FaceFrame();
    }

    public static com.tencent.ilink.auth.FaceFrame getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.FaceFrame newBuilder() {
        return new com.tencent.ilink.auth.FaceFrame();
    }

    public com.tencent.ilink.auth.FaceFrame addAllElementXCoordinates(java.util.Collection<java.lang.Float> collection) {
        this.x_coordinates.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceFrame addAllElementYCoordinates(java.util.Collection<java.lang.Float> collection) {
        this.y_coordinates.addAll(collection);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceFrame addElementXCoordinates(float f17) {
        this.x_coordinates.add(java.lang.Float.valueOf(f17));
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceFrame addElementYCoordinates(float f17) {
        this.y_coordinates.add(java.lang.Float.valueOf(f17));
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceFrame build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.FaceFrame)) {
            return false;
        }
        com.tencent.ilink.auth.FaceFrame faceFrame = (com.tencent.ilink.auth.FaceFrame) fVar;
        return n51.f.a(this.x_coordinates, faceFrame.x_coordinates) && n51.f.a(this.y_coordinates, faceFrame.y_coordinates) && n51.f.a(this.image, faceFrame.image);
    }

    public com.tencent.mm.protobuf.g getImage() {
        return this.hasSetFields[3] ? this.image : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.util.LinkedList<java.lang.Float> getXCoordinates() {
        return this.x_coordinates;
    }

    public java.util.LinkedList<java.lang.Float> getYCoordinates() {
        return this.y_coordinates;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasImage() {
        return hasFieldNumber(3);
    }

    public boolean hasXCoordinates() {
        return hasFieldNumber(1);
    }

    public boolean hasYCoordinates() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.auth.FaceFrame mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.FaceFrame();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 5, this.x_coordinates);
            fVar.g(2, 5, this.y_coordinates);
            com.tencent.mm.protobuf.g gVar = this.image;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 5, this.x_coordinates) + 0 + b36.f.g(2, 5, this.y_coordinates);
            com.tencent.mm.protobuf.g gVar2 = this.image;
            return (gVar2 == null || !this.hasSetFields[3]) ? g17 : g17 + b36.f.b(3, gVar2);
        }
        if (i17 == 2) {
            this.x_coordinates.clear();
            this.y_coordinates.clear();
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
            this.x_coordinates.add(java.lang.Float.valueOf(aVar2.f(intValue)));
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.y_coordinates.add(java.lang.Float.valueOf(aVar2.f(intValue)));
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.image = aVar2.d(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.ilink.auth.FaceFrame setImage(com.tencent.mm.protobuf.g gVar) {
        this.image = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceFrame setXCoordinates(java.util.LinkedList<java.lang.Float> linkedList) {
        this.x_coordinates = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceFrame setYCoordinates(java.util.LinkedList<java.lang.Float> linkedList) {
        this.y_coordinates = linkedList;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceFrame mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.FaceFrame parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.FaceFrame) super.parseFrom(bArr);
    }
}
