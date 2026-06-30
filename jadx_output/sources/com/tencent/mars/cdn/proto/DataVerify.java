package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class DataVerify extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.DataVerify DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.DataVerify();
    private java.lang.String expected_filemd5;
    private long expected_filesize;
    private long max_filesize;
    private java.util.LinkedList<com.tencent.mars.cdn.proto.KeyValue> http_header = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[5];

    public static com.tencent.mars.cdn.proto.DataVerify create() {
        return new com.tencent.mars.cdn.proto.DataVerify();
    }

    public static com.tencent.mars.cdn.proto.DataVerify getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.DataVerify newBuilder() {
        return new com.tencent.mars.cdn.proto.DataVerify();
    }

    public com.tencent.mars.cdn.proto.DataVerify addAllElementHttpHeader(java.util.Collection<com.tencent.mars.cdn.proto.KeyValue> collection) {
        this.http_header.addAll(collection);
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DataVerify addElementHttpHeader(com.tencent.mars.cdn.proto.KeyValue keyValue) {
        this.http_header.add(keyValue);
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DataVerify build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.DataVerify)) {
            return false;
        }
        com.tencent.mars.cdn.proto.DataVerify dataVerify = (com.tencent.mars.cdn.proto.DataVerify) fVar;
        return n51.f.a(this.expected_filemd5, dataVerify.expected_filemd5) && n51.f.a(java.lang.Long.valueOf(this.expected_filesize), java.lang.Long.valueOf(dataVerify.expected_filesize)) && n51.f.a(java.lang.Long.valueOf(this.max_filesize), java.lang.Long.valueOf(dataVerify.max_filesize)) && n51.f.a(this.http_header, dataVerify.http_header);
    }

    public java.lang.String getExpectedFilemd5() {
        return this.hasSetFields[1] ? this.expected_filemd5 : "";
    }

    public long getExpectedFilesize() {
        return this.expected_filesize;
    }

    public java.util.LinkedList<com.tencent.mars.cdn.proto.KeyValue> getHttpHeader() {
        return this.http_header;
    }

    public long getMaxFilesize() {
        return this.max_filesize;
    }

    public boolean hasExpectedFilemd5() {
        return hasFieldNumber(1);
    }

    public boolean hasExpectedFilesize() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasHttpHeader() {
        return hasFieldNumber(4);
    }

    public boolean hasMaxFilesize() {
        return hasFieldNumber(3);
    }

    public com.tencent.mars.cdn.proto.DataVerify mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.DataVerify();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.expected_filemd5;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.expected_filesize);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.max_filesize);
            }
            fVar.g(4, 8, this.http_header);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.expected_filemd5;
            if (str2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.h(2, this.expected_filesize);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.h(3, this.max_filesize);
            }
            return i18 + b36.f.g(4, 8, this.http_header);
        }
        if (i17 == 2) {
            this.http_header.clear();
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
            this.expected_filemd5 = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.expected_filesize = aVar2.i(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.max_filesize = aVar2.i(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.mars.cdn.proto.KeyValue keyValue = new com.tencent.mars.cdn.proto.KeyValue();
            if (bArr != null && bArr.length > 0) {
                keyValue.parseFrom(bArr);
            }
            this.http_header.add(keyValue);
        }
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.DataVerify setExpectedFilemd5(java.lang.String str) {
        this.expected_filemd5 = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DataVerify setExpectedFilesize(long j17) {
        this.expected_filesize = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DataVerify setHttpHeader(java.util.LinkedList<com.tencent.mars.cdn.proto.KeyValue> linkedList) {
        this.http_header = linkedList;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DataVerify setMaxFilesize(long j17) {
        this.max_filesize = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DataVerify mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.DataVerify parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.DataVerify) super.parseFrom(bArr);
    }
}
