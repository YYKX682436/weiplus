package com.p314xaae8f345.p362xadfe2b3.gen;

/* renamed from: com.tencent.liteapp.gen.RunningAction */
/* loaded from: classes.dex */
public enum EnumC3704xc0524b5 {
    UNKNOWN(1),
    NOT_FIND_STORE(2),
    CHANGE_APP_UUID(3),
    NOT_FIND_PAGE(4),
    PKG_CHECK_SUM(5);


    /* renamed from: value */
    private final int f14203x6ac9171;

    EnumC3704xc0524b5(int i17) {
        this.f14203x6ac9171 = i17;
    }

    /* renamed from: fromValue */
    public static com.p314xaae8f345.p362xadfe2b3.gen.EnumC3704xc0524b5 m28973x447c3e7(int i17) {
        for (com.p314xaae8f345.p362xadfe2b3.gen.EnumC3704xc0524b5 enumC3704xc0524b5 : m28975xcee59d22()) {
            if (enumC3704xc0524b5.f14203x6ac9171 == i17) {
                return enumC3704xc0524b5;
            }
        }
        return m28975xcee59d22()[0];
    }

    /* renamed from: getValue */
    public int m28976x754a37bb() {
        return this.f14203x6ac9171;
    }
}
