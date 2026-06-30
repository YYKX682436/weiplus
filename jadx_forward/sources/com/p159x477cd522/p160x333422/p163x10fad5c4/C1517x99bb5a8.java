package com.p159x477cd522.p160x333422.p163x10fad5c4;

/* renamed from: com.eclipsesource.mmv8.snapshot.SnapshotCreator */
/* loaded from: classes7.dex */
public class C1517x99bb5a8 {

    /* renamed from: SNAPSHOT_FLAGS */
    private static final java.lang.String f5031x5998bc2c = "--turbo-instruction-scheduling";

    /* renamed from: SNAPSHOT_PROFILE_FLAGS */
    private static final java.lang.String f5032xa2b594f6 = "--profile-deserialization";

    static {
        com.p159x477cd522.p160x333422.V8.m16097x52fbaf45(com.p159x477cd522.p160x333422.V8.m16067x746d94d1() + " --turbo-instruction-scheduling --profile-deserialization");
    }

    private C1517x99bb5a8() {
    }

    /* renamed from: create */
    public static com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d m16630xaf65a0fc(com.p159x477cd522.p160x333422.p163x10fad5c4.C1515x4c3290a6 c1515x4c3290a6) {
        return m16631xaf65a0fc(null, c1515x4c3290a6);
    }

    /* renamed from: create */
    public static com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d m16631xaf65a0fc(java.lang.String str, com.p159x477cd522.p160x333422.p163x10fad5c4.C1515x4c3290a6 c1515x4c3290a6) {
        if (c1515x4c3290a6 == null) {
            return new com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure(-101, com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure.f5022x9bb5467);
        }
        if (!com.p159x477cd522.p160x333422.V8.m16094x6b8d2606(str)) {
            return new com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure(-102, com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure.f5024x6777e4a8);
        }
        com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d m15950xa0648cff = com.p159x477cd522.p160x333422.V8.m15950xa0648cff(c1515x4c3290a6);
        return m15950xa0648cff == null ? new com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure(-103, com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure.f5023xee0aac79) : m15950xa0648cff;
    }
}
