package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class ConnRecords extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.ConnRecords DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.ConnRecords();
    private java.util.LinkedList<com.tencent.mars.cdn.proto.ConnRecordItem> records = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.mars.cdn.proto.ConnRecords create() {
        return new com.tencent.mars.cdn.proto.ConnRecords();
    }

    public static com.tencent.mars.cdn.proto.ConnRecords getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.ConnRecords newBuilder() {
        return new com.tencent.mars.cdn.proto.ConnRecords();
    }

    public com.tencent.mars.cdn.proto.ConnRecords addAllElementRecords(java.util.Collection<com.tencent.mars.cdn.proto.ConnRecordItem> collection) {
        this.records.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ConnRecords addElementRecords(com.tencent.mars.cdn.proto.ConnRecordItem connRecordItem) {
        this.records.add(connRecordItem);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ConnRecords build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mars.cdn.proto.ConnRecords) && n51.f.a(this.records, ((com.tencent.mars.cdn.proto.ConnRecords) fVar).records);
    }

    public java.util.LinkedList<com.tencent.mars.cdn.proto.ConnRecordItem> getRecords() {
        return this.records;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasRecords() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.ConnRecords mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.ConnRecords();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.records);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.records) + 0;
        }
        if (i17 == 2) {
            this.records.clear();
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
            com.tencent.mars.cdn.proto.ConnRecordItem connRecordItem = new com.tencent.mars.cdn.proto.ConnRecordItem();
            if (bArr != null && bArr.length > 0) {
                connRecordItem.parseFrom(bArr);
            }
            this.records.add(connRecordItem);
        }
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.ConnRecords setRecords(java.util.LinkedList<com.tencent.mars.cdn.proto.ConnRecordItem> linkedList) {
        this.records = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ConnRecords mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.ConnRecords parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.ConnRecords) super.parseFrom(bArr);
    }
}
