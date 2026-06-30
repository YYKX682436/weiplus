package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class AppendGet extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.AppendGet DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.AppendGet();
    private final boolean[] hasSetFields = new boolean[1];

    /* loaded from: classes4.dex */
    public static class Request extends com.tencent.mm.protobuf.f {
        private static final com.tencent.mars.cdn.proto.AppendGet.Request DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.AppendGet.Request();
        private final boolean[] hasSetFields = new boolean[1];

        public static com.tencent.mars.cdn.proto.AppendGet.Request create() {
            return new com.tencent.mars.cdn.proto.AppendGet.Request();
        }

        public static com.tencent.mars.cdn.proto.AppendGet.Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.mars.cdn.proto.AppendGet.Request newBuilder() {
            return new com.tencent.mars.cdn.proto.AppendGet.Request();
        }

        public com.tencent.mars.cdn.proto.AppendGet.Request build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.AppendGet.Request)) {
                return false;
            }
            return true;
        }

        public boolean hasFieldNumber(int i17) {
            return this.hasSetFields[i17];
        }

        public com.tencent.mars.cdn.proto.AppendGet.Request mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.mars.cdn.proto.AppendGet.Request();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                return 0;
            }
            if (i17 == 1) {
                return 0;
            }
            if (i17 != 2) {
                if (i17 == 3) {
                    ((java.lang.Integer) objArr[2]).intValue();
                }
                return -1;
            }
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }

        public com.tencent.mars.cdn.proto.AppendGet.Request mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mars.cdn.proto.AppendGet.Request parseFrom(byte[] bArr) {
            return (com.tencent.mars.cdn.proto.AppendGet.Request) super.parseFrom(bArr);
        }
    }

    /* loaded from: classes4.dex */
    public static class Result extends com.tencent.mm.protobuf.f {
        private static final com.tencent.mars.cdn.proto.AppendGet.Result DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.AppendGet.Result();
        private java.util.LinkedList<com.tencent.mm.protobuf.g> data_ = new java.util.LinkedList<>();
        private final boolean[] hasSetFields = new boolean[2];

        public static com.tencent.mars.cdn.proto.AppendGet.Result create() {
            return new com.tencent.mars.cdn.proto.AppendGet.Result();
        }

        public static com.tencent.mars.cdn.proto.AppendGet.Result getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.mars.cdn.proto.AppendGet.Result newBuilder() {
            return new com.tencent.mars.cdn.proto.AppendGet.Result();
        }

        public com.tencent.mars.cdn.proto.AppendGet.Result addAllElementData_(java.util.Collection<com.tencent.mm.protobuf.g> collection) {
            this.data_.addAll(collection);
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.AppendGet.Result addElementData_(com.tencent.mm.protobuf.g gVar) {
            this.data_.add(gVar);
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.AppendGet.Result build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            return fVar != null && (fVar instanceof com.tencent.mars.cdn.proto.AppendGet.Result) && n51.f.a(this.data_, ((com.tencent.mars.cdn.proto.AppendGet.Result) fVar).data_);
        }

        public java.util.LinkedList<com.tencent.mm.protobuf.g> getData_() {
            return this.data_;
        }

        public boolean hasData_() {
            return hasFieldNumber(1);
        }

        public boolean hasFieldNumber(int i17) {
            return this.hasSetFields[i17];
        }

        public com.tencent.mars.cdn.proto.AppendGet.Result mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.mars.cdn.proto.AppendGet.Result();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                ((g36.f) objArr[0]).g(1, 6, this.data_);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.g(1, 6, this.data_) + 0;
            }
            if (i17 == 2) {
                this.data_.clear();
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
            this.data_.add(aVar2.d(intValue));
            this.hasSetFields[1] = true;
            return 0;
        }

        public com.tencent.mars.cdn.proto.AppendGet.Result setData_(java.util.LinkedList<com.tencent.mm.protobuf.g> linkedList) {
            this.data_ = linkedList;
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.AppendGet.Result mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mars.cdn.proto.AppendGet.Result parseFrom(byte[] bArr) {
            return (com.tencent.mars.cdn.proto.AppendGet.Result) super.parseFrom(bArr);
        }
    }

    public static com.tencent.mars.cdn.proto.AppendGet create() {
        return new com.tencent.mars.cdn.proto.AppendGet();
    }

    public static com.tencent.mars.cdn.proto.AppendGet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.AppendGet newBuilder() {
        return new com.tencent.mars.cdn.proto.AppendGet();
    }

    public com.tencent.mars.cdn.proto.AppendGet build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.AppendGet)) {
            return false;
        }
        return true;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public com.tencent.mars.cdn.proto.AppendGet mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.AppendGet();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 0;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                ((java.lang.Integer) objArr[2]).intValue();
            }
            return -1;
        }
        c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
        for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
            if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                aVar.b();
            }
        }
        return 0;
    }

    public com.tencent.mars.cdn.proto.AppendGet mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.AppendGet parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.AppendGet) super.parseFrom(bArr);
    }
}
