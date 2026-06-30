package com.tencent.ilink.network;

/* loaded from: classes10.dex */
public class IlinkC2CCdnKv extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkC2CCdnKv DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkC2CCdnKv();
    private final boolean[] hasSetFields = new boolean[3];
    private com.tencent.mm.protobuf.g key_data;
    private com.tencent.mm.protobuf.g value_data;

    public static com.tencent.ilink.network.IlinkC2CCdnKv create() {
        return new com.tencent.ilink.network.IlinkC2CCdnKv();
    }

    public static com.tencent.ilink.network.IlinkC2CCdnKv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkC2CCdnKv newBuilder() {
        return new com.tencent.ilink.network.IlinkC2CCdnKv();
    }

    public com.tencent.ilink.network.IlinkC2CCdnKv build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkC2CCdnKv)) {
            return false;
        }
        com.tencent.ilink.network.IlinkC2CCdnKv ilinkC2CCdnKv = (com.tencent.ilink.network.IlinkC2CCdnKv) fVar;
        return n51.f.a(this.key_data, ilinkC2CCdnKv.key_data) && n51.f.a(this.value_data, ilinkC2CCdnKv.value_data);
    }

    public com.tencent.mm.protobuf.g getKeyData() {
        return this.hasSetFields[1] ? this.key_data : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getValueData() {
        return this.hasSetFields[2] ? this.value_data : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasKeyData() {
        return hasFieldNumber(1);
    }

    public boolean hasValueData() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.network.IlinkC2CCdnKv mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkC2CCdnKv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.key_data;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.value_data;
            if (gVar2 != null && this.hasSetFields[2]) {
                fVar.b(2, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.key_data;
            if (gVar3 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.value_data;
            return (gVar4 == null || !this.hasSetFields[2]) ? i18 : i18 + b36.f.b(2, gVar4);
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
            this.key_data = aVar2.d(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.value_data = aVar2.d(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkC2CCdnKv setKeyData(com.tencent.mm.protobuf.g gVar) {
        this.key_data = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CCdnKv setValueData(com.tencent.mm.protobuf.g gVar) {
        this.value_data = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CCdnKv mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkC2CCdnKv parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkC2CCdnKv) super.parseFrom(bArr);
    }
}
