package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class ConnRecordItem extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.ConnRecordItem DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.ConnRecordItem();
    private long begin_timestamp_ms;
    private com.tencent.mars.cdn.proto.BizType biz;
    private int cost_ms;
    private final boolean[] hasSetFields = new boolean[6];
    private com.tencent.mars.cdn.proto.ProtoType proto;
    private boolean succeed;

    public static com.tencent.mars.cdn.proto.ConnRecordItem create() {
        return new com.tencent.mars.cdn.proto.ConnRecordItem();
    }

    public static com.tencent.mars.cdn.proto.ConnRecordItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.ConnRecordItem newBuilder() {
        return new com.tencent.mars.cdn.proto.ConnRecordItem();
    }

    public com.tencent.mars.cdn.proto.ConnRecordItem build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.ConnRecordItem)) {
            return false;
        }
        com.tencent.mars.cdn.proto.ConnRecordItem connRecordItem = (com.tencent.mars.cdn.proto.ConnRecordItem) fVar;
        return n51.f.a(this.biz, connRecordItem.biz) && n51.f.a(this.proto, connRecordItem.proto) && n51.f.a(java.lang.Boolean.valueOf(this.succeed), java.lang.Boolean.valueOf(connRecordItem.succeed)) && n51.f.a(java.lang.Long.valueOf(this.begin_timestamp_ms), java.lang.Long.valueOf(connRecordItem.begin_timestamp_ms)) && n51.f.a(java.lang.Integer.valueOf(this.cost_ms), java.lang.Integer.valueOf(connRecordItem.cost_ms));
    }

    public long getBeginTimestampMs() {
        return this.begin_timestamp_ms;
    }

    public com.tencent.mars.cdn.proto.BizType getBiz() {
        return this.hasSetFields[1] ? this.biz : com.tencent.mars.cdn.proto.BizType.BIZ_TYPE_CGI;
    }

    public int getCostMs() {
        return this.cost_ms;
    }

    public com.tencent.mars.cdn.proto.ProtoType getProto() {
        return this.hasSetFields[2] ? this.proto : com.tencent.mars.cdn.proto.ProtoType.PROTO_TYPE_TCP;
    }

    public boolean getSucceed() {
        return this.succeed;
    }

    public boolean hasBeginTimestampMs() {
        return hasFieldNumber(4);
    }

    public boolean hasBiz() {
        return hasFieldNumber(1);
    }

    public boolean hasCostMs() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasProto() {
        return hasFieldNumber(2);
    }

    public boolean hasSucceed() {
        return hasFieldNumber(3);
    }

    public com.tencent.mars.cdn.proto.ConnRecordItem mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.ConnRecordItem();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mars.cdn.proto.BizType bizType = this.biz;
            if (bizType != null && this.hasSetFields[1]) {
                fVar.e(1, bizType.value);
            }
            com.tencent.mars.cdn.proto.ProtoType protoType = this.proto;
            if (protoType != null && this.hasSetFields[2]) {
                fVar.e(2, protoType.value);
            }
            if (this.hasSetFields[3]) {
                fVar.a(3, this.succeed);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.begin_timestamp_ms);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.cost_ms);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mars.cdn.proto.BizType bizType2 = this.biz;
            if (bizType2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.e(1, bizType2.value);
            }
            com.tencent.mars.cdn.proto.ProtoType protoType2 = this.proto;
            if (protoType2 != null && this.hasSetFields[2]) {
                i18 += b36.f.e(2, protoType2.value);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.a(3, this.succeed);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.h(4, this.begin_timestamp_ms);
            }
            return this.hasSetFields[5] ? i18 + b36.f.e(5, this.cost_ms) : i18;
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
            this.biz = com.tencent.mars.cdn.proto.BizType.forNumber(aVar2.g(intValue));
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.proto = com.tencent.mars.cdn.proto.ProtoType.forNumber(aVar2.g(intValue));
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.succeed = aVar2.c(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.begin_timestamp_ms = aVar2.i(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.cost_ms = aVar2.g(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.ConnRecordItem setBeginTimestampMs(long j17) {
        this.begin_timestamp_ms = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ConnRecordItem setBiz(com.tencent.mars.cdn.proto.BizType bizType) {
        this.biz = bizType;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ConnRecordItem setCostMs(int i17) {
        this.cost_ms = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ConnRecordItem setProto(com.tencent.mars.cdn.proto.ProtoType protoType) {
        this.proto = protoType;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ConnRecordItem setSucceed(boolean z17) {
        this.succeed = z17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.ConnRecordItem mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.ConnRecordItem parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.ConnRecordItem) super.parseFrom(bArr);
    }
}
