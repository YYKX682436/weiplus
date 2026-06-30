package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class ImageOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.ImageOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.ImageOptions();
    private java.util.LinkedList<java.lang.Integer> supported_formats = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.mars.cdn.proto.ImageOptions create() {
        return new com.tencent.mars.cdn.proto.ImageOptions();
    }

    public static com.tencent.mars.cdn.proto.ImageOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.ImageOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.ImageOptions();
    }

    public com.tencent.mars.cdn.proto.ImageOptions addAllElementSupportedFormats(java.util.Collection<java.lang.Integer> collection) {
        this.supported_formats.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ImageOptions addElementSupportedFormats(int i17) {
        this.supported_formats.add(java.lang.Integer.valueOf(i17));
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ImageOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mars.cdn.proto.ImageOptions) && n51.f.a(this.supported_formats, ((com.tencent.mars.cdn.proto.ImageOptions) fVar).supported_formats);
    }

    public java.util.LinkedList<java.lang.Integer> getSupportedFormats() {
        return this.supported_formats;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasSupportedFormats() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.ImageOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.ImageOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 2, this.supported_formats);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 2, this.supported_formats) + 0;
        }
        if (i17 == 2) {
            this.supported_formats.clear();
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
        this.supported_formats.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.ImageOptions setSupportedFormats(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.supported_formats = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ImageOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.ImageOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.ImageOptions) super.parseFrom(bArr);
    }
}
