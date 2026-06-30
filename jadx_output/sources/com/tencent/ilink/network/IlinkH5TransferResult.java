package com.tencent.ilink.network;

/* loaded from: classes4.dex */
public class IlinkH5TransferResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkH5TransferResult DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkH5TransferResult();
    private java.lang.String resp_data;
    private java.util.LinkedList<com.tencent.ilink.network.HttpHeader> header = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[3];

    public static com.tencent.ilink.network.IlinkH5TransferResult create() {
        return new com.tencent.ilink.network.IlinkH5TransferResult();
    }

    public static com.tencent.ilink.network.IlinkH5TransferResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkH5TransferResult newBuilder() {
        return new com.tencent.ilink.network.IlinkH5TransferResult();
    }

    public com.tencent.ilink.network.IlinkH5TransferResult addAllElementHeader(java.util.Collection<com.tencent.ilink.network.HttpHeader> collection) {
        this.header.addAll(collection);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkH5TransferResult addElementHeader(com.tencent.ilink.network.HttpHeader httpHeader) {
        this.header.add(httpHeader);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkH5TransferResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkH5TransferResult)) {
            return false;
        }
        com.tencent.ilink.network.IlinkH5TransferResult ilinkH5TransferResult = (com.tencent.ilink.network.IlinkH5TransferResult) fVar;
        return n51.f.a(this.resp_data, ilinkH5TransferResult.resp_data) && n51.f.a(this.header, ilinkH5TransferResult.header);
    }

    public java.util.LinkedList<com.tencent.ilink.network.HttpHeader> getHeader() {
        return this.header;
    }

    public java.lang.String getRespData() {
        return this.hasSetFields[1] ? this.resp_data : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasHeader() {
        return hasFieldNumber(2);
    }

    public boolean hasRespData() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.network.IlinkH5TransferResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkH5TransferResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.resp_data;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.header);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.resp_data;
            if (str2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return i18 + b36.f.g(2, 8, this.header);
        }
        if (i17 == 2) {
            this.header.clear();
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
            this.resp_data = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.ilink.network.HttpHeader httpHeader = new com.tencent.ilink.network.HttpHeader();
            if (bArr != null && bArr.length > 0) {
                httpHeader.parseFrom(bArr);
            }
            this.header.add(httpHeader);
        }
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkH5TransferResult setHeader(java.util.LinkedList<com.tencent.ilink.network.HttpHeader> linkedList) {
        this.header = linkedList;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkH5TransferResult setRespData(java.lang.String str) {
        this.resp_data = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkH5TransferResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkH5TransferResult parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkH5TransferResult) super.parseFrom(bArr);
    }
}
