package com.tencent.mars.cdn.proto;

/* loaded from: classes2.dex */
public class VideoTsRange extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.VideoTsRange DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.VideoTsRange();

    /* renamed from: ts, reason: collision with root package name */
    private java.util.LinkedList<com.tencent.mars.cdn.proto.VideoTsRangeItem> f52531ts = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.mars.cdn.proto.VideoTsRange create() {
        return new com.tencent.mars.cdn.proto.VideoTsRange();
    }

    public static com.tencent.mars.cdn.proto.VideoTsRange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.VideoTsRange newBuilder() {
        return new com.tencent.mars.cdn.proto.VideoTsRange();
    }

    public com.tencent.mars.cdn.proto.VideoTsRange addAllElementTs(java.util.Collection<com.tencent.mars.cdn.proto.VideoTsRangeItem> collection) {
        this.f52531ts.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoTsRange addElementTs(com.tencent.mars.cdn.proto.VideoTsRangeItem videoTsRangeItem) {
        this.f52531ts.add(videoTsRangeItem);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoTsRange build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mars.cdn.proto.VideoTsRange) && n51.f.a(this.f52531ts, ((com.tencent.mars.cdn.proto.VideoTsRange) fVar).f52531ts);
    }

    public java.util.LinkedList<com.tencent.mars.cdn.proto.VideoTsRangeItem> getTs() {
        return this.f52531ts;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasTs() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.VideoTsRange mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.VideoTsRange();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f52531ts);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f52531ts) + 0;
        }
        if (i17 == 2) {
            this.f52531ts.clear();
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
            com.tencent.mars.cdn.proto.VideoTsRangeItem videoTsRangeItem = new com.tencent.mars.cdn.proto.VideoTsRangeItem();
            if (bArr != null && bArr.length > 0) {
                videoTsRangeItem.parseFrom(bArr);
            }
            this.f52531ts.add(videoTsRangeItem);
        }
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.VideoTsRange setTs(java.util.LinkedList<com.tencent.mars.cdn.proto.VideoTsRangeItem> linkedList) {
        this.f52531ts = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoTsRange mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.VideoTsRange parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.VideoTsRange) super.parseFrom(bArr);
    }
}
