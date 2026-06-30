package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.TransportProtocol */
/* loaded from: classes.dex */
public enum EnumC4531xd67af0c1 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    TRANSPORT_PROTOCOL_TCP(0),
    TRANSPORT_PROTOCOL_HTTP(1),
    TRANSPORT_PROTOCOL_HTTPS(2),
    TRANSPORT_PROTOCOL_QUIC(3),
    TRANSPORT_PROTOCOL_HTTP3(4);


    /* renamed from: TRANSPORT_PROTOCOL_HTTP3_VALUE */
    public static final int f19081x89445d0c = 4;

    /* renamed from: TRANSPORT_PROTOCOL_HTTPS_VALUE */
    public static final int f19083x260bc52c = 2;

    /* renamed from: TRANSPORT_PROTOCOL_HTTP_VALUE */
    public static final int f19084x3e7674ab = 1;

    /* renamed from: TRANSPORT_PROTOCOL_QUIC_VALUE */
    public static final int f19086x42f1ede1 = 3;

    /* renamed from: TRANSPORT_PROTOCOL_TCP_VALUE */
    public static final int f19088x9f0f2f62 = 0;

    /* renamed from: value */
    public final int f19089x6ac9171;

    EnumC4531xd67af0c1(int i17) {
        this.f19089x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4531xd67af0c1 m39654x382ad972(int i17) {
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f19089x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4531xd67af0c1 m39655xdce0328(int i17) {
        return m39654x382ad972(i17);
    }
}
