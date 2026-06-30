package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.ProtoType */
/* loaded from: classes4.dex */
public enum EnumC4517x53b2b922 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    PROTO_TYPE_TCP(0),
    PROTO_TYPE_QUIC(1);


    /* renamed from: PROTO_TYPE_QUIC_VALUE */
    public static final int f18985x35d26dbe = 1;

    /* renamed from: PROTO_TYPE_TCP_VALUE */
    public static final int f18987x9660bfe5 = 0;

    /* renamed from: value */
    public final int f18988x6ac9171;

    EnumC4517x53b2b922(int i17) {
        this.f18988x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4517x53b2b922 m39378x382ad972(int i17) {
        if (i17 == 0) {
            return PROTO_TYPE_TCP;
        }
        if (i17 != 1) {
            return null;
        }
        return PROTO_TYPE_QUIC;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f18988x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4517x53b2b922 m39379xdce0328(int i17) {
        return m39378x382ad972(i17);
    }
}
