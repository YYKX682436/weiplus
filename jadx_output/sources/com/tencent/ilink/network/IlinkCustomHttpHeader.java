package com.tencent.ilink.network;

/* loaded from: classes4.dex */
public class IlinkCustomHttpHeader extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkCustomHttpHeader DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkCustomHttpHeader();
    private final boolean[] hasSetFields = new boolean[3];
    private java.lang.String key;
    private java.lang.String value;

    public static com.tencent.ilink.network.IlinkCustomHttpHeader create() {
        return new com.tencent.ilink.network.IlinkCustomHttpHeader();
    }

    public static com.tencent.ilink.network.IlinkCustomHttpHeader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkCustomHttpHeader newBuilder() {
        return new com.tencent.ilink.network.IlinkCustomHttpHeader();
    }

    public com.tencent.ilink.network.IlinkCustomHttpHeader build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkCustomHttpHeader)) {
            return false;
        }
        com.tencent.ilink.network.IlinkCustomHttpHeader ilinkCustomHttpHeader = (com.tencent.ilink.network.IlinkCustomHttpHeader) fVar;
        return n51.f.a(this.key, ilinkCustomHttpHeader.key) && n51.f.a(this.value, ilinkCustomHttpHeader.value);
    }

    public java.lang.String getKey() {
        return this.hasSetFields[1] ? this.key : "";
    }

    public java.lang.String getValue() {
        return this.hasSetFields[2] ? this.value : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasKey() {
        return hasFieldNumber(1);
    }

    public boolean hasValue() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.network.IlinkCustomHttpHeader mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkCustomHttpHeader();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.key;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.value;
            if (str2 != null && this.hasSetFields[2]) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.key;
            if (str3 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.value;
            return (str4 == null || !this.hasSetFields[2]) ? i18 : i18 + b36.f.j(2, str4);
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
            this.key = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.value = aVar2.k(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkCustomHttpHeader setKey(java.lang.String str) {
        this.key = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkCustomHttpHeader setValue(java.lang.String str) {
        this.value = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkCustomHttpHeader mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkCustomHttpHeader parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkCustomHttpHeader) super.parseFrom(bArr);
    }
}
