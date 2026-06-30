package com.tencent.ilink.network;

/* loaded from: classes6.dex */
public enum ResourceRequestScene implements com.tencent.mm.protobuf.h {
    kNormal(0),
    kBatch(1),
    kPeriod(2),
    kSpecified(3);

    public static final int kBatch_VALUE = 1;
    public static final int kNormal_VALUE = 0;
    public static final int kPeriod_VALUE = 2;
    public static final int kSpecified_VALUE = 3;
    public final int value;

    ResourceRequestScene(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.network.ResourceRequestScene forNumber(int i17) {
        if (i17 == 0) {
            return kNormal;
        }
        if (i17 == 1) {
            return kBatch;
        }
        if (i17 == 2) {
            return kPeriod;
        }
        if (i17 != 3) {
            return null;
        }
        return kSpecified;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.network.ResourceRequestScene valueOf(int i17) {
        return forNumber(i17);
    }
}
