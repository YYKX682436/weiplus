package com.tencent.maas.analytics;

/* loaded from: classes16.dex */
public enum MJAnalyticsS12$MJPublisherMetricsType implements com.google.protobuf.p6 {
    nPublisherMetricsTypeSession(0),
    nPublisherMetricsTypeSCTask(1),
    nPublisherMetricsTypeMCTask(2),
    nPublisherMetricsTypeEvent(3),
    nPublisherMetricsTypeSession3(4);

    public static final int nPublisherMetricsTypeEvent_VALUE = 3;
    public static final int nPublisherMetricsTypeMCTask_VALUE = 2;
    public static final int nPublisherMetricsTypeSCTask_VALUE = 1;
    public static final int nPublisherMetricsTypeSession3_VALUE = 4;
    public static final int nPublisherMetricsTypeSession_VALUE = 0;
    private final int value;
    private static final com.google.protobuf.q6 internalValueMap = new ig.p0();
    private static final com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType[] VALUES = values();

    MJAnalyticsS12$MJPublisherMetricsType(int i17) {
        this.value = i17;
    }

    public static com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType forNumber(int i17) {
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

    public static final com.google.protobuf.x3 getDescriptor() {
        return (com.google.protobuf.x3) java.util.Collections.unmodifiableList(java.util.Arrays.asList(ig.y0.f291308w.f45006f)).get(3);
    }

    public static com.google.protobuf.q6 internalGetValueMap() {
        return internalValueMap;
    }

    public final com.google.protobuf.x3 getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        return this.value;
    }

    public final com.google.protobuf.y3 getValueDescriptor() {
        return (com.google.protobuf.y3) java.util.Collections.unmodifiableList(java.util.Arrays.asList(getDescriptor().f45675g)).get(ordinal());
    }

    @java.lang.Deprecated
    public static com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType valueOf(int i17) {
        return forNumber(i17);
    }

    public static com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType valueOf(com.google.protobuf.y3 y3Var) {
        if (y3Var.f45730h == getDescriptor()) {
            return VALUES[y3Var.f45726d];
        }
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
