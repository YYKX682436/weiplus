package com.p314xaae8f345.p457x3304c6.p458x9b169b86;

/* renamed from: com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType */
/* loaded from: classes16.dex */
public enum EnumC3969x8364de57 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    nPublisherMetricsTypeSession(0),
    nPublisherMetricsTypeSCTask(1),
    nPublisherMetricsTypeMCTask(2),
    nPublisherMetricsTypeEvent(3),
    nPublisherMetricsTypeSession3(4);


    /* renamed from: nPublisherMetricsTypeEvent_VALUE */
    public static final int f15775x82f58f5d = 3;

    /* renamed from: nPublisherMetricsTypeMCTask_VALUE */
    public static final int f15777xd2c7ca5c = 2;

    /* renamed from: nPublisherMetricsTypeSCTask_VALUE */
    public static final int f15779xf1aa96 = 1;

    /* renamed from: nPublisherMetricsTypeSession3_VALUE */
    public static final int f15782x73d0055e = 4;

    /* renamed from: nPublisherMetricsTypeSession_VALUE */
    public static final int f15783x568b7a19 = 0;

    /* renamed from: value */
    private final int f15784x6ac9171;

    /* renamed from: internalValueMap */
    private static final com.p176xb6135e39.p283xc50a8b8b.q6 f15773xc72c7808 = new ig.p0();

    /* renamed from: VALUES */
    private static final com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57[] f15772x96789122 = m32410xcee59d22();

    EnumC3969x8364de57(int i17) {
        this.f15784x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 m32404x382ad972(int i17) {
        if (i17 == 0) {
            return nPublisherMetricsTypeSession;
        }
        if (i17 == 1) {
            return nPublisherMetricsTypeSCTask;
        }
        if (i17 == 2) {
            return nPublisherMetricsTypeMCTask;
        }
        if (i17 == 3) {
            return nPublisherMetricsTypeEvent;
        }
        if (i17 != 4) {
            return null;
        }
        return nPublisherMetricsTypeSession3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.x3 m32405xc1a58b65() {
        return (com.p176xb6135e39.p283xc50a8b8b.x3) java.util.Collections.unmodifiableList(java.util.Arrays.asList(ig.y0.f372841w.f126539f)).get(3);
    }

    /* renamed from: internalGetValueMap */
    public static com.p176xb6135e39.p283xc50a8b8b.q6 m32406x97e5d0a4() {
        return f15773xc72c7808;
    }

    /* renamed from: getDescriptorForType */
    public final com.p176xb6135e39.p283xc50a8b8b.x3 m32411x84bb647e() {
        return m32405xc1a58b65();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        return this.f15784x6ac9171;
    }

    /* renamed from: getValueDescriptor */
    public final com.p176xb6135e39.p283xc50a8b8b.y3 m32412x1076b98a() {
        return (com.p176xb6135e39.p283xc50a8b8b.y3) java.util.Collections.unmodifiableList(java.util.Arrays.asList(m32405xc1a58b65().f127208g)).get(ordinal());
    }

    @java.lang.Deprecated
    /* renamed from: valueOf */
    public static com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 m32407xdce0328(int i17) {
        return m32404x382ad972(i17);
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 m32408xdce0328(com.p176xb6135e39.p283xc50a8b8b.y3 y3Var) {
        if (y3Var.f127263h == m32405xc1a58b65()) {
            return f15772x96789122[y3Var.f127259d];
        }
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
