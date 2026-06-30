package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public enum ProtoType implements com.tencent.mm.protobuf.h {
    PROTO_TYPE_TCP(0),
    PROTO_TYPE_QUIC(1);

    public static final int PROTO_TYPE_QUIC_VALUE = 1;
    public static final int PROTO_TYPE_TCP_VALUE = 0;
    public final int value;

    ProtoType(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.ProtoType forNumber(int i17) {
        if (i17 == 0) {
            return PROTO_TYPE_TCP;
        }
        if (i17 != 1) {
            return null;
        }
        return PROTO_TYPE_QUIC;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.ProtoType valueOf(int i17) {
        return forNumber(i17);
    }
}
