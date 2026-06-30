package com.tencent.mars.cdn.proto;

/* loaded from: classes.dex */
public enum TransportProtocol implements com.tencent.mm.protobuf.h {
    TRANSPORT_PROTOCOL_TCP(0),
    TRANSPORT_PROTOCOL_HTTP(1),
    TRANSPORT_PROTOCOL_HTTPS(2),
    TRANSPORT_PROTOCOL_QUIC(3),
    TRANSPORT_PROTOCOL_HTTP3(4);

    public static final int TRANSPORT_PROTOCOL_HTTP3_VALUE = 4;
    public static final int TRANSPORT_PROTOCOL_HTTPS_VALUE = 2;
    public static final int TRANSPORT_PROTOCOL_HTTP_VALUE = 1;
    public static final int TRANSPORT_PROTOCOL_QUIC_VALUE = 3;
    public static final int TRANSPORT_PROTOCOL_TCP_VALUE = 0;
    public final int value;

    TransportProtocol(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.TransportProtocol forNumber(int i17) {
        if (i17 == 0) {
            return TRANSPORT_PROTOCOL_TCP;
        }
        if (i17 == 1) {
            return TRANSPORT_PROTOCOL_HTTP;
        }
        if (i17 == 2) {
            return TRANSPORT_PROTOCOL_HTTPS;
        }
        if (i17 == 3) {
            return TRANSPORT_PROTOCOL_QUIC;
        }
        if (i17 != 4) {
            return null;
        }
        return TRANSPORT_PROTOCOL_HTTP3;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.TransportProtocol valueOf(int i17) {
        return forNumber(i17);
    }
}
