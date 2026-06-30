package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class WxUserIdcInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.WxUserIdcInfo DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.WxUserIdcInfo();
    private com.tencent.mars.cdn.proto.SKBuiltinBuffer_t ExtInfo;
    private java.lang.String Uuid;
    private final boolean[] hasSetFields = new boolean[3];

    public static com.tencent.mars.cdn.proto.WxUserIdcInfo create() {
        return new com.tencent.mars.cdn.proto.WxUserIdcInfo();
    }

    public static com.tencent.mars.cdn.proto.WxUserIdcInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.WxUserIdcInfo newBuilder() {
        return new com.tencent.mars.cdn.proto.WxUserIdcInfo();
    }

    public com.tencent.mars.cdn.proto.WxUserIdcInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.WxUserIdcInfo)) {
            return false;
        }
        com.tencent.mars.cdn.proto.WxUserIdcInfo wxUserIdcInfo = (com.tencent.mars.cdn.proto.WxUserIdcInfo) fVar;
        return n51.f.a(this.Uuid, wxUserIdcInfo.Uuid) && n51.f.a(this.ExtInfo, wxUserIdcInfo.ExtInfo);
    }

    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t getExtInfo() {
        return this.hasSetFields[2] ? this.ExtInfo : new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
    }

    public java.lang.String getUuid() {
        return this.hasSetFields[1] ? this.Uuid : "";
    }

    public boolean hasExtInfo() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasUuid() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.WxUserIdcInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.WxUserIdcInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.Uuid;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t = this.ExtInfo;
            if (sKBuiltinBuffer_t != null && this.hasSetFields[2]) {
                fVar.i(2, sKBuiltinBuffer_t.computeSize());
                this.ExtInfo.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.Uuid;
            if (str2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t2 = this.ExtInfo;
            return (sKBuiltinBuffer_t2 == null || !this.hasSetFields[2]) ? i18 : i18 + b36.f.i(2, sKBuiltinBuffer_t2.computeSize());
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
            this.Uuid = aVar2.k(intValue);
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
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t3 = new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
            if (bArr != null && bArr.length > 0) {
                sKBuiltinBuffer_t3.parseFrom(bArr);
            }
            this.ExtInfo = sKBuiltinBuffer_t3;
        }
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.WxUserIdcInfo setExtInfo(com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t) {
        this.ExtInfo = sKBuiltinBuffer_t;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.WxUserIdcInfo setUuid(java.lang.String str) {
        this.Uuid = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.WxUserIdcInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.WxUserIdcInfo parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.WxUserIdcInfo) super.parseFrom(bArr);
    }
}
