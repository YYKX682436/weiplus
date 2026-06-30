package com.p314xaae8f345.p362xadfe2b3.gen;

/* renamed from: com.tencent.liteapp.gen.OtherAction */
/* loaded from: classes15.dex */
public enum EnumC3703xde990546 {
    UNKNOWN(1),
    BATCH_CHECK_PACKAGE_UPDATE(2),
    BATCH_CHECK_PACKAGE_UPDATE_SUCCESS(3),
    BATCH_CHECK_PACKAGE_UPDATE_NO_NEED(4),
    BATCH_CHECK_PACKAGE_UPDATE_FAILED(5),
    BATCH_CHECK_PACKAGE_UPDATE_PARTIAL_FAILED(6),
    CHECK_BASE_LIBRARY_UPDATE(7),
    CHECK_BASE_LIBRARY_UPDATE_SUCCESS(8),
    CHECK_BASE_LIBRARY_UPDATE_NO_NEED(9),
    CHECK_BASE_LIBRARY_UPDATE_FAILED(10);


    /* renamed from: value */
    private final int f14196x6ac9171;

    EnumC3703xde990546(int i17) {
        this.f14196x6ac9171 = i17;
    }

    /* renamed from: fromValue */
    public static com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546 m28967x447c3e7(int i17) {
        for (com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546 enumC3703xde990546 : m28969xcee59d22()) {
            if (enumC3703xde990546.f14196x6ac9171 == i17) {
                return enumC3703xde990546;
            }
        }
        return m28969xcee59d22()[0];
    }

    /* renamed from: getValue */
    public int m28970x754a37bb() {
        return this.f14196x6ac9171;
    }
}
